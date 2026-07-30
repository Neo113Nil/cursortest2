package defpackage;

import android.media.MediaDataSource;
import java.io.DataInputStream;
import java.io.IOException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hj0 extends MediaDataSource {
    public long m;
    public final /* synthetic */ mj0 n;

    public hj0(mj0 mj0Var) {
        this.n = mj0Var;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        mj0 mj0Var = this.n;
        DataInputStream dataInputStream = mj0Var.m;
        if (i2 == 0) {
            return 0;
        }
        if (j >= 0) {
            try {
                long j2 = this.m;
                if (j2 != j) {
                    if (j2 < 0 || j < j2 + dataInputStream.available()) {
                        mj0Var.f(j);
                        this.m = j;
                    }
                }
                if (i2 > dataInputStream.available()) {
                    i2 = dataInputStream.available();
                }
                int read = mj0Var.read(bArr, i, i2);
                if (read >= 0) {
                    this.m += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.m = -1L;
            return -1;
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
