package io.opentelemetry.contrib.disk.buffering.internal.storage.files.reader;

import io.opentelemetry.contrib.disk.buffering.internal.storage.files.reader.StreamReader;
import io.opentelemetry.contrib.disk.buffering.internal.utils.ProtobufTools;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class DelimitedProtoStreamReader implements StreamReader {
    private final InputStream inputStream;

    public DelimitedProtoStreamReader(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override // io.opentelemetry.contrib.disk.buffering.internal.storage.files.reader.StreamReader
    @Nullable
    public byte[] readNext() throws IOException {
        int nextItemSize = getNextItemSize();
        if (nextItemSize < 1) {
            return null;
        }
        byte[] bArr = new byte[nextItemSize];
        int i = 0;
        do {
            int read = this.inputStream.read(bArr, i, nextItemSize - i);
            i += read;
            if (read == -1) {
                break;
            }
        } while (i < nextItemSize);
        if (i != nextItemSize) {
            return null;
        }
        return bArr;
    }

    private int getNextItemSize() {
        try {
            int read = this.inputStream.read();
            if (read == -1) {
                return 0;
            }
            return ProtobufTools.readRawVarint32(read, this.inputStream);
        } catch (IOException unused) {
            return 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.inputStream.close();
    }

    public static class Factory implements StreamReader.Factory {
        private static final Factory INSTANCE = new Factory();

        public static Factory getInstance() {
            return INSTANCE;
        }

        private Factory() {
        }

        @Override // io.opentelemetry.contrib.disk.buffering.internal.storage.files.reader.StreamReader.Factory
        public StreamReader create(InputStream inputStream) {
            return new DelimitedProtoStreamReader(inputStream);
        }
    }
}
