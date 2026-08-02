package defpackage;

import j$.nio.channels.DesugarChannels;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ljd implements ReadableByteChannel {
    private final InputStream a;
    private final AtomicBoolean b = new AtomicBoolean(true);

    private ljd(InputStream inputStream) {
        this.a = inputStream;
    }

    static ReadableByteChannel a(InputStream inputStream) {
        return inputStream instanceof FileInputStream ? DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(((FileInputStream) inputStream).getChannel()) : new ljd(inputStream);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b.compareAndSet(true, false)) {
            this.a.close();
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.b.get();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        boolean hasArray = byteBuffer.hasArray();
        InputStream inputStream = this.a;
        if (hasArray) {
            int read = inputStream.read(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            if (read > 0) {
            }
            return read;
        }
        byte[] bArr = new byte[Math.min(16384, Math.min(Math.max(inputStream.available(), 4096), byteBuffer.remaining()))];
        int read2 = inputStream.read(bArr);
        if (read2 <= 0) {
            return read2;
        }
        byteBuffer.put(bArr, 0, read2);
        return read2;
    }
}
