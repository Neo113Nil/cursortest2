package io.opentelemetry.contrib.disk.buffering.storage.impl;

import io.opentelemetry.contrib.disk.buffering.internal.serialization.deserializers.SignalDeserializer;
import io.opentelemetry.contrib.disk.buffering.internal.serialization.serializers.SignalSerializer;
import io.opentelemetry.contrib.disk.buffering.internal.storage.FileSignalStorage;
import io.opentelemetry.contrib.disk.buffering.internal.storage.FolderManager;
import io.opentelemetry.contrib.disk.buffering.internal.storage.Storage;
import io.opentelemetry.contrib.disk.buffering.storage.SignalStorage;
import io.opentelemetry.contrib.disk.buffering.storage.result.WriteResult;
import io.opentelemetry.sdk.common.Clock;
import io.opentelemetry.sdk.metrics.data.MetricData;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nonnull;

/* loaded from: classes3.dex */
public final class FileMetricStorage implements SignalStorage.Metric {
    private final FileSignalStorage<MetricData> fileSignalStorage;

    public static FileMetricStorage create(File file) {
        return create(file, FileStorageConfiguration.getDefault());
    }

    public static FileMetricStorage create(File file, FileStorageConfiguration fileStorageConfiguration) {
        return new FileMetricStorage(new FileSignalStorage(new Storage(FolderManager.create(file, fileStorageConfiguration, Clock.getDefault())), SignalSerializer.ofMetrics(), SignalDeserializer.ofMetrics()));
    }

    private FileMetricStorage(FileSignalStorage<MetricData> fileSignalStorage) {
        this.fileSignalStorage = fileSignalStorage;
    }

    @Override // io.opentelemetry.contrib.disk.buffering.storage.SignalStorage
    public CompletableFuture<WriteResult> write(Collection<MetricData> collection) {
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
    public Iterator<Collection<MetricData>> iterator() {
        return this.fileSignalStorage.iterator();
    }
}
