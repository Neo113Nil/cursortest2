package g0;

import android.media.MediaDataSource;

/* renamed from: g0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0139c extends MediaDataSource {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f2057e;

    public C0139c(byte[] bArr) {
        this.f2057e = bArr;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f2057e.length;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j2, byte[] bArr, int i2, int i3) {
        byte[] bArr2 = this.f2057e;
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
