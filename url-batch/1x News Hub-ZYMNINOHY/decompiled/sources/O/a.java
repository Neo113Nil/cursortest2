package O;

import android.media.MediaDataSource;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* renamed from: a, reason: collision with root package name */
    public long f1080a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f1081b;

    public a(f fVar) {
        this.f1081b = fVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j3, byte[] bArr, int i3, int i4) {
        if (i4 == 0) {
            return 0;
        }
        if (j3 < 0) {
            return -1;
        }
        try {
            long j4 = this.f1080a;
            f fVar = this.f1081b;
            if (j4 != j3) {
                if (j4 >= 0 && j3 >= j4 + fVar.f1082a.available()) {
                    return -1;
                }
                fVar.b(j3);
                this.f1080a = j3;
            }
            if (i4 > fVar.f1082a.available()) {
                i4 = fVar.f1082a.available();
            }
            int read = fVar.read(bArr, i3, i4);
            if (read >= 0) {
                this.f1080a += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f1080a = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
