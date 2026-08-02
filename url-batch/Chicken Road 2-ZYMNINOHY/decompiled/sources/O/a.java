package O;

import android.media.MediaDataSource;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* renamed from: a, reason: collision with root package name */
    public long f1950a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f1951b;

    public a(f fVar) {
        this.f1951b = fVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j4, byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        if (j4 < 0) {
            return -1;
        }
        try {
            long j5 = this.f1950a;
            f fVar = this.f1951b;
            if (j5 != j4) {
                if (j5 >= 0 && j4 >= j5 + fVar.f1952a.available()) {
                    return -1;
                }
                fVar.b(j4);
                this.f1950a = j4;
            }
            if (i5 > fVar.f1952a.available()) {
                i5 = fVar.f1952a.available();
            }
            int read = fVar.read(bArr, i4, i5);
            if (read >= 0) {
                this.f1950a += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f1950a = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
