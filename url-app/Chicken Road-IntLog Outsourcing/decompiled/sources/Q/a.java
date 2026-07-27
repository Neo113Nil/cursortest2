package Q;

import android.media.MediaDataSource;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* renamed from: a, reason: collision with root package name */
    public long f2418a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f2419b;

    public a(f fVar) {
        this.f2419b = fVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j2, byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        if (j2 < 0) {
            return -1;
        }
        try {
            long j6 = this.f2418a;
            f fVar = this.f2419b;
            if (j6 != j2) {
                if (j6 >= 0 && j2 >= j6 + fVar.f2420a.available()) {
                    return -1;
                }
                fVar.b(j2);
                this.f2418a = j2;
            }
            if (i3 > fVar.f2420a.available()) {
                i3 = fVar.f2420a.available();
            }
            int read = fVar.read(bArr, i2, i3);
            if (read >= 0) {
                this.f2418a += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f2418a = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
