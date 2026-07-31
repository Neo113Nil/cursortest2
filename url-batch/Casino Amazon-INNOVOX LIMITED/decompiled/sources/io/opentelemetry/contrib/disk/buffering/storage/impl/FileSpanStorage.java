package io.opentelemetry.contrib.disk.buffering.storage.impl;

import io.opentelemetry.contrib.disk.buffering.internal.serialization.deserializers.SignalDeserializer;
import io.opentelemetry.contrib.disk.buffering.internal.serialization.serializers.SignalSerializer;
import io.opentelemetry.contrib.disk.buffering.internal.storage.FileSignalStorage;
import io.opentelemetry.contrib.disk.buffering.internal.storage.FolderManager;
import io.opentelemetry.contrib.disk.buffering.internal.storage.Storage;
import io.opentelemetry.contrib.disk.buffering.storage.SignalStorage;
import io.opentelemetry.contrib.disk.buffering.storage.result.WriteResult;
import io.opentelemetry.sdk.common.Clock;
import io.opentelemetry.sdk.trace.data.SpanData;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nonnull;

/* loaded from: classes3.dex */
public final class FileSpanStorage implements SignalStorage.Span {
    private final FileSignalStorage<SpanData> fileSignalStorage;

    public static FileSpanStorage create(File file) {
        return create(file, FileStorageConfiguration.getDefault());
    }

    public static FileSpanStorage create(File file, FileStorageConfiguration fileStorageConfiguration) {
        return new FileSpanStorage(new FileSignalStorage(new Storage(FolderManager.create(file, fileStorageConfiguration, Clock.getDefault())), SignalSerializer.ofSpans(), SignalDeserializer.ofSpans()));
    }

    private FileSpanStorage(FileSignalStorage<SpanData> fileSignalStorage) {
        this.fileSignalStorage = fileSignalStorage;
    }

    @Override // io.opentelemetry.contrib.disk.buffering.storage.SignalStorage
    public CompletableFuture<WriteResult> write(Collection<SpanData> collection) {
        return this.fileSignalStorage.write(collection);
    }

    @Override // io.opentelemetry.contrib.disk.buffering.storage.SignalStorage
    public CompletableFuture<WriteResult> clear() {
        return this.fileSignalStorage.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.fileSignalStorage.close();
    }

    @Override // java.lang.Iterable
    @Nonnull
    public Iterator<Collection<SpanData>> iterator() {
        return this.fileSignalStorage.iterator();
    }
}
