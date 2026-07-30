package l4;

import android.media.MediaDataSource;

/* loaded from: classes.dex */
public final class d extends MediaDataSource {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f6274d;

    public d(byte[] bArr) {
        this.f6274d = bArr;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f6274d.length;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i2, int i5) {
        byte[] bArr2 = this.f6274d;
        if (j >= bArr2.length) {
            return -1;
        }
        if (i5 + j > bArr2.length) {
            i5 = (int) (bArr2.length - j);
        }
        System.arraycopy(bArr2, (int) j, bArr, i2, i5);
        return i5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
