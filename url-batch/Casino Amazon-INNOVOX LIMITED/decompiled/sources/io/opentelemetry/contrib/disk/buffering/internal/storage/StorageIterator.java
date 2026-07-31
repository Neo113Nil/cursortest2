package io.opentelemetry.contrib.disk.buffering.internal.storage;

import io.opentelemetry.contrib.disk.buffering.internal.serialization.deserializers.SignalDeserializer;
import io.opentelemetry.contrib.disk.buffering.internal.storage.responses.ReadableResult;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
final class StorageIterator<T> implements Iterator<Collection<T>> {

    @Nullable
    private ReadableResult<T> currentResult;
    private final SignalDeserializer<T> deserializer;
    private final Storage<T> storage;
    private final Logger logger = Logger.getLogger(StorageIterator.class.getName());
    private boolean currentResultConsumed = false;

    StorageIterator(Storage<T> storage, SignalDeserializer<T> signalDeserializer) {
        this.storage = storage;
        this.deserializer = signalDeserializer;
    }

    @Override // java.util.Iterator
    public synchronized boolean hasNext() {
        if (this.storage.isClosed()) {
            return false;
        }
        return findNext();
    }

    @Override // java.util.Iterator
    @Nullable
    public synchronized Collection<T> next() {
        if (this.storage.isClosed()) {
            return null;
        }
        if (!findNext()) {
            return null;
        }
        this.currentResultConsumed = true;
        return ((ReadableResult) Objects.requireNonNull(this.currentResult)).getContent();
    }

    @Override // java.util.Iterator
    public synchronized void remove() {
        ReadableResult<T> readableResult = this.currentResult;
        if (readableResult != null) {
            try {
                readableResult.delete();
            } catch (IOException e) {
                this.logger.log(Level.SEVERE, "Error deleting stored item", (Throwable) e);
            }
        }
    }

    private synchronized boolean findNext() {
        try {
            ReadableResult<T> readableResult = this.currentResult;
            if (readableResult != null) {
                if (!this.currentResultConsumed) {
                    return true;
                }
                readableResult.delete();
                this.currentResult.close();
                this.currentResult = null;
            }
            this.currentResultConsumed = false;
            ReadableResult<T> readNext = this.storage.readNext(this.deserializer);
            if (readNext != null) {
                this.currentResult = readNext;
                return true;
            }
        } catch (IOException e) {
            this.logger.log(Level.SEVERE, "Error reading from storage", (Throwable) e);
        }
        return false;
    }
}
