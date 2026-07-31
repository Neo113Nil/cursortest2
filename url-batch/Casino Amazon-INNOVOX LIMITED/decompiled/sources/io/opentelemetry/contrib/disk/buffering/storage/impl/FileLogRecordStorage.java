package io.opentelemetry.contrib.disk.buffering.storage.impl;

import io.opentelemetry.contrib.disk.buffering.internal.serialization.deserializers.SignalDeserializer;
import io.opentelemetry.contrib.disk.buffering.internal.serialization.serializers.SignalSerializer;
import io.opentelemetry.contrib.disk.buffering.internal.storage.FileSignalStorage;
import io.opentelemetry.contrib.disk.buffering.internal.storage.FolderManager;
import io.opentelemetry.contrib.disk.buffering.internal.storage.Storage;
import io.opentelemetry.contrib.disk.buffering.storage.SignalStorage;
import io.opentelemetry.contrib.disk.buffering.storage.result.WriteResult;
import io.opentelemetry.sdk.common.Clock;
import io.opentelemetry.sdk.logs.data.LogRecordData;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nonnull;

/* loaded from: classes3.dex */
public final class FileLogRecordStorage implements SignalStorage.LogRecord {
    private final FileSignalStorage<LogRecordData> fileSignalStorage;

    public static FileLogRecordStorage create(File file) {
        return create(file, FileStorageConfiguration.getDefault());
    }

    public static FileLogRecordStorage create(File file, FileStorageConfiguration fileStorageConfiguration) {
        return new FileLogRecordStorage(new FileSignalStorage(new Storage(FolderManager.create(file, fileStorageConfiguration, Clock.getDefault())), SignalSerializer.ofLogs(), SignalDeserializer.ofLogs()));
    }

    private FileLogRecordStorage(FileSignalStorage<LogRecordData> fileSignalStorage) {
        this.fileSignalStorage = fileSignalStorage;
    }

    @Override // io.opentelemetry.contrib.disk.buffering.storage.SignalStorage
    public CompletableFuture<WriteResult> write(Collection<LogRecordData> collection) {
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
    public Iterator<Collection<LogRecordData>> iterator() {
        return this.fileSignalStorage.iterator();
    }
}
