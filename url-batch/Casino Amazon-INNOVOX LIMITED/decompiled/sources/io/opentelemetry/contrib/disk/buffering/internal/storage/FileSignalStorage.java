package io.opentelemetry.contrib.disk.buffering.internal.storage;

import io.opentelemetry.contrib.disk.buffering.internal.serialization.deserializers.SignalDeserializer;
import io.opentelemetry.contrib.disk.buffering.internal.serialization.serializers.SignalSerializer;
import io.opentelemetry.contrib.disk.buffering.storage.SignalStorage;
import io.opentelemetry.contrib.disk.buffering.storage.result.WriteResult;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class FileSignalStorage<T> implements SignalStorage<T> {
    private final SignalDeserializer<T> deserializer;

    @Nullable
    private Iterator<Collection<T>> iterator;
    private final SignalSerializer<T> serializer;
    private final Storage<T> storage;
    private final Logger logger = Logger.getLogger(FileSignalStorage.class.getName());
    private final AtomicBoolean isClosed = new AtomicBoolean(false);
    private final Object iteratorLock = new Object();

    public FileSignalStorage(Storage<T> storage, SignalSerializer<T> signalSerializer, SignalDeserializer<T> signalDeserializer) {
        this.storage = storage;
        this.serializer = signalSerializer;
        this.deserializer = signalDeserializer;
    }

    @Override // io.opentelemetry.contrib.disk.buffering.storage.SignalStorage
    public CompletableFuture<WriteResult> write(Collection<T> collection) {
        CompletableFuture<WriteResult> completedFuture;
        this.logger.finer("Intercepting batch.");
        try {
            try {
                this.serializer.initialize2(collection);
                if (this.storage.write(this.serializer)) {
                    completedFuture = CompletableFuture.completedFuture(WriteResult.successful());
                } else {
                    this.logger.fine("Could not store batch in disk.");
                    completedFuture = CompletableFuture.completedFuture(WriteResult.error(new Exception("Could not store batch in disk for an unknown reason.")));
                }
            } catch (IOException e) {
                this.logger.log(Level.WARNING, "An unexpected error happened while attempting to write the data in disk.", (Throwable) e);
                completedFuture = CompletableFuture.completedFuture(WriteResult.error(e));
            }
            return completedFuture;
        } finally {
            this.serializer.reset();
        }
    }

    @Override // io.opentelemetry.contrib.disk.buffering.storage.SignalStorage
    public CompletableFuture<WriteResult> clear() {
        try {
            this.storage.clear();
            return CompletableFuture.completedFuture(WriteResult.successful());
        } catch (IOException e) {
            return CompletableFuture.completedFuture(WriteResult.error(e));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.isClosed.compareAndSet(false, true)) {
            this.storage.close();
        }
    }

    @Override // java.lang.Iterable
    @Nonnull
    public Iterator<Collection<T>> iterator() {
        Iterator<Collection<T>> it;
        synchronized (this.iteratorLock) {
            if (this.iterator == null) {
                this.iterator = new StorageIterator(this.storage, this.deserializer);
            }
            it = this.iterator;
        }
        return it;
    }
}
