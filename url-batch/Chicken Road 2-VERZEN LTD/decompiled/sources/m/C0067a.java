package m;

import android.media.MediaDataSource;
import java.io.IOException;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0067a extends MediaDataSource {

    /* renamed from: b, reason: collision with root package name */
    public long f932b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0072f f933c;

    public C0067a(C0072f c0072f) {
        this.f933c = c0072f;
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
            long j3 = this.f932b;
            C0072f c0072f = this.f933c;
            if (j3 != j2) {
                if (j3 >= 0 && j2 >= j3 + c0072f.f934b.available()) {
                    return -1;
                }
                c0072f.b(j2);
                this.f932b = j2;
            }
            if (i3 > c0072f.f934b.available()) {
                i3 = c0072f.f934b.available();
            }
            int read = c0072f.read(bArr, i2, i3);
            if (read >= 0) {
                this.f932b += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f932b = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
