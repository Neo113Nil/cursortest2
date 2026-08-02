package defpackage;

import android.media.MediaDataSource;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adf extends MediaDataSource {
    long a;
    final /* synthetic */ adg b;

    public adf(adg adgVar) {
        this.b = adgVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j2 = this.a;
            if (j2 != j) {
                if (j2 >= 0 && j >= j2 + this.b.available()) {
                    return -1;
                }
                this.b.c(j);
                this.a = j;
            }
            adg adgVar = this.b;
            if (i2 > adgVar.available()) {
                i2 = adgVar.available();
            }
            int read = adgVar.read(bArr, i, i2);
            if (read >= 0) {
                this.a += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.a = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
