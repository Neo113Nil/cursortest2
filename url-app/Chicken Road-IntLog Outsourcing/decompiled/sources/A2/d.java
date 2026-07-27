package A2;

import android.media.MediaDataSource;

/* loaded from: classes.dex */
public final class d extends MediaDataSource {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte[] f31a;

    public d(byte[] bArr) {
        this.f31a = bArr;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f31a.length;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j2, byte[] bArr, int i2, int i3) {
        byte[] bArr2 = this.f31a;
        if (j2 >= bArr2.length) {
            return -1;
        }
        if (i3 + j2 > bArr2.length) {
            i3 = (int) (bArr2.length - j2);
        }
        System.arraycopy(bArr2, (int) j2, bArr, i2, i3);
        return i3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
