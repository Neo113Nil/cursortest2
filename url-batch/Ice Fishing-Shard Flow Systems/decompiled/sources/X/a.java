package X;

import android.media.MediaDataSource;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* renamed from: d, reason: collision with root package name */
    public long f2791d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f2792e;

    public a(f fVar) {
        this.f2792e = fVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i2, int i5) {
        if (i5 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j7 = this.f2791d;
            f fVar = this.f2792e;
            if (j7 != j) {
                if (j7 >= 0 && j >= j7 + fVar.f2793d.available()) {
                    return -1;
                }
                fVar.d(j);
                this.f2791d = j;
            }
            if (i5 > fVar.f2793d.available()) {
                i5 = fVar.f2793d.available();
            }
            int read = fVar.read(bArr, i2, i5);
            if (read >= 0) {
                this.f2791d += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f2791d = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
