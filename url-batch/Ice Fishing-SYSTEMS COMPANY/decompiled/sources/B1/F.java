package B1;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class F extends MediaDataSource {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f74n;

    public F(ByteBuffer byteBuffer) {
        this.f74n = byteBuffer;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f74n.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j9, byte[] bArr, int i, int i4) {
        ByteBuffer byteBuffer = this.f74n;
        if (j9 >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j9);
        int min = Math.min(i4, byteBuffer.remaining());
        byteBuffer.get(bArr, i, min);
        return min;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
