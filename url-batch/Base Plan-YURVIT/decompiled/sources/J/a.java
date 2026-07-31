package J;

import android.media.MediaDataSource;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* renamed from: e, reason: collision with root package name */
    public long f535e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f536f;

    public a(f fVar) {
        this.f536f = fVar;
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
            long j3 = this.f535e;
            f fVar = this.f536f;
            if (j3 != j2) {
                if (j3 >= 0 && j2 >= j3 + fVar.f537e.available()) {
                    return -1;
                }
                fVar.b(j2);
                this.f535e = j2;
            }
            if (i3 > fVar.f537e.available()) {
                i3 = fVar.f537e.available();
            }
            int read = fVar.read(bArr, i2, i3);
            if (read >= 0) {
                this.f535e += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f535e = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
