package Y3;

import android.media.MediaDataSource;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3765a;

    public a(byte[] bArr) {
        this.f3765a = bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
    }

    @Override // android.media.MediaDataSource
    public final synchronized long getSize() {
        return this.f3765a.length;
    }

    @Override // android.media.MediaDataSource
    public final synchronized int readAt(long j4, byte[] buffer, int i4, int i5) {
        i.e(buffer, "buffer");
        byte[] bArr = this.f3765a;
        if (j4 >= bArr.length) {
            return -1;
        }
        long j5 = i5;
        long j6 = j4 + j5;
        if (j6 > bArr.length) {
            j5 -= j6 - bArr.length;
        }
        int i6 = (int) j5;
        System.arraycopy(bArr, (int) j4, buffer, i4, i6);
        return i6;
    }
}
