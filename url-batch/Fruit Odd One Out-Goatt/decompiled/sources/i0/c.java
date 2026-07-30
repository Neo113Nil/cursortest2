package i0;

import android.media.MediaDataSource;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class c extends MediaDataSource {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f376b;

    public c(byte[] bArr) {
        this.f376b = bArr;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f376b.length;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j2, byte[] bArr, int i2, int i3) {
        byte[] bArr2 = this.f376b;
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
