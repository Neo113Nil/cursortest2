package io.opentelemetry.contrib.disk.buffering.internal.storage;

import io.opentelemetry.contrib.disk.buffering.internal.serialization.deserializers.DeserializationException;
import io.opentelemetry.contrib.disk.buffering.internal.serialization.deserializers.SignalDeserializer;
import io.opentelemetry.contrib.disk.buffering.internal.serialization.serializers.SignalSerializer;
import io.opentelemetry.contrib.disk.buffering.internal.storage.files.ReadableFile;
import io.opentelemetry.contrib.disk.buffering.internal.storage.files.WritableFile;
import io.opentelemetry.contrib.disk.buffering.internal.storage.responses.ReadableResult;
import io.opentelemetry.contrib.disk.buffering.internal.storage.responses.WritableResult;
import java.io.Closeable;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class Storage<T> implements Closeable {
    private static final int MAX_ATTEMPTS = 3;
    private final FolderManager folderManager;
    private final Logger logger = Logger.getLogger(Storage.class.getName());
    private final AtomicBoolean isClosed = new AtomicBoolean(false);
    private final AtomicBoolean activeReadResultAvailable = new AtomicBoolean(false);
    private final AtomicReference<WritableFile> writableFileRef = new AtomicReference<>();
    private final AtomicReference<ReadableFile> readableFileRef = new AtomicReference<>();

    public Storage(FolderManager folderManager) {
        this.folderManager = folderManager;
    }

    public boolean write(SignalSerializer<T> signalSerializer) throws IOException {
        return write(signalSerializer, 1);
    }

    private boolean write(SignalSerializer<T> signalSerializer, int i) throws IOException {
        if (this.isClosed.get()) {
            this.logger.fine("Refusing to write to storage after being closed.");
            return false;
        }
        if (i > 3) {
            this.logger.log(Level.WARNING, "Max number of attempts to write buffered data exceeded.");
            return false;
        }
        WritableFile writableFile = this.writableFileRef.get();
        if (writableFile == null) {
            writableFile = this.folderManager.createWritableFile();
            this.writableFileRef.set(writableFile);
            this.logger.finer("Created new writableFile: " + writableFile);
        }
        if (writableFile.append(signalSerializer) == WritableResult.SUCCEEDED) {
            return true;
        }
        this.writableFileRef.set(null);
        return write(signalSerializer, i + 1);
    }

    public void flush() throws IOException {
        WritableFile writableFile = this.writableFileRef.get();
        if (writableFile != null) {
            writableFile.flush();
        } else {
            this.logger.info("No writable file to flush.");
        }
    }

    @Nullable
    public ReadableResult<T> readNext(SignalDeserializer<T> signalDeserializer) throws IOException {
        if (this.activeReadResultAvailable.get()) {
            throw new IllegalStateException("You must close any previous ReadableResult before requesting a new one");
        }
        return doReadNext(signalDeserializer, 1);
    }

    @Nullable
    private ReadableResult<T> doReadNext(SignalDeserializer<T> signalDeserializer, int i) throws IOException {
        if (this.isClosed.get()) {
            this.logger.fine("Refusing to read from storage after being closed.");
            return null;
        }
        if (i > 3) {
            this.logger.log(Level.WARNING, "Maximum number of attempts to read buffered data exceeded.");
            return null;
        }
        ReadableFile readableFile = this.readableFileRef.get();
        if (readableFile == null) {
            this.logger.finer("Obtaining a new readableFile from the folderManager.");
            readableFile = this.folderManager.getReadableFile();
            this.readableFileRef.set(readableFile);
            if (readableFile == null) {
                this.logger.fine("Unable to get or create readable file.");
                return null;
            }
        }
        this.logger.finer("Attempting to read data from " + readableFile);
        byte[] readNext = readableFile.readNext();
        if (readNext != null) {
            try {
                List<T> deserialize = signalDeserializer.deserialize(readNext);
                this.activeReadResultAvailable.set(true);
                return new FileReadResult(deserialize, readableFile);
            } catch (DeserializationException unused) {
                readableFile.clear();
            }
        }
        this.readableFileRef.set(null);
        return doReadNext(signalDeserializer, i + 1);
    }

    public void clear() throws IOException {
        this.folderManager.clear();
    }

    public boolean isClosed() {
        return this.isClosed.get();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.logger.fine("Closing disk buffering storage.");
        if (this.isClosed.compareAndSet(false, true)) {
            this.folderManager.close();
            this.writableFileRef.set(null);
            this.readableFileRef.set(null);
        }
    }

    class FileReadResult implements ReadableResult<T> {
        private final Collection<T> content;
        private final AtomicReference<ReadableFile> readableFile;
        private final AtomicBoolean itemDeleted = new AtomicBoolean(false);
        private final AtomicBoolean closed = new AtomicBoolean(false);

        FileReadResult(Collection<T> collection, ReadableFile readableFile) {
            AtomicReference<ReadableFile> atomicReference = new AtomicReference<>();
            this.readableFile = atomicReference;
            this.content = collection;
            atomicReference.set(readableFile);
        }

        @Override // io.opentelemetry.contrib.disk.buffering.internal.storage.responses.ReadableResult
        public Collection<T> getContent() {
            return this.content;
        }

        @Override // io.opentelemetry.contrib.disk.buffering.internal.storage.responses.ReadableResult
        public void delete() throws IOException {
            if (!this.closed.get() && this.itemDeleted.compareAndSet(false, true)) {
                try {
                    ((ReadableFile) Objects.requireNonNull(this.readableFile.get())).removeTopItem();
                } catch (IOException e) {
                    this.itemDeleted.set(false);
                    throw e;
                }
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed.compareAndSet(false, true)) {
                Storage.this.activeReadResultAvailable.set(false);
                this.readableFile.set(null);
            }
        }
    }
}
