package H3;

import android.media.MediaDataSource;

/* loaded from: classes.dex */
public final class c extends MediaDataSource {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f1010f;

    public c(byte[] bArr) {
        this.f1010f = bArr;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f1010f.length;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j4, byte[] bArr, int i7, int i8) {
        byte[] bArr2 = this.f1010f;
        if (j4 >= bArr2.length) {
            return -1;
        }
        if (i8 + j4 > bArr2.length) {
            i8 = (int) (bArr2.length - j4);
        }
        System.arraycopy(bArr2, (int) j4, bArr, i7, i8);
        return i8;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
