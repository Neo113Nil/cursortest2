package M;

import android.media.MediaDataSource;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* renamed from: f, reason: collision with root package name */
    public long f1525f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f1526g;

    public a(f fVar) {
        this.f1526g = fVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j4, byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        if (j4 < 0) {
            return -1;
        }
        try {
            long j7 = this.f1525f;
            f fVar = this.f1526g;
            if (j7 != j4) {
                if (j7 >= 0 && j4 >= j7 + fVar.f1527f.available()) {
                    return -1;
                }
                fVar.d(j4);
                this.f1525f = j4;
            }
            if (i8 > fVar.f1527f.available()) {
                i8 = fVar.f1527f.available();
            }
            int read = fVar.read(bArr, i7, i8);
            if (read >= 0) {
                this.f1525f += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f1525f = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
