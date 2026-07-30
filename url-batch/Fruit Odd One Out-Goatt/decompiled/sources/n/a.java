package n;

import android.media.MediaDataSource;
import java.io.DataInputStream;
import java.io.IOException;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* renamed from: b, reason: collision with root package name */
    public long f886b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f887c;

    public a(f fVar) {
        this.f887c = fVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j2, byte[] bArr, int i2, int i3) {
        f fVar = this.f887c;
        DataInputStream dataInputStream = fVar.f888b;
        if (i3 == 0) {
            return 0;
        }
        if (j2 >= 0) {
            try {
                long j3 = this.f886b;
                if (j3 != j2) {
                    if (j3 < 0 || j2 < j3 + dataInputStream.available()) {
                        fVar.b(j2);
                        this.f886b = j2;
                    }
                }
                if (i3 > dataInputStream.available()) {
                    i3 = dataInputStream.available();
                }
                int read = fVar.read(bArr, i2, i3);
                if (read >= 0) {
                    this.f886b += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f886b = -1L;
            return -1;
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
