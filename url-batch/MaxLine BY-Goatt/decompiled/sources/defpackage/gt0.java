package defpackage;

import android.database.sqlite.SQLiteProgram;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class gt0 implements er2 {
    public final SQLiteProgram m;

    public gt0(SQLiteProgram sQLiteProgram) {
        sQLiteProgram.getClass();
        this.m = sQLiteProgram;
    }

    @Override // defpackage.er2
    public final void D(int i, byte[] bArr) {
        this.m.bindBlob(i, bArr);
    }

    @Override // defpackage.er2
    public final void a(double d, int i) {
        this.m.bindDouble(i, d);
    }

    @Override // defpackage.er2
    public final void c(int i) {
        this.m.bindNull(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.m.close();
    }

    @Override // defpackage.er2
    public final void d(long j, int i) {
        this.m.bindLong(i, j);
    }

    @Override // defpackage.er2
    public final void l(int i, String str) {
        str.getClass();
        this.m.bindString(i, str);
    }
}
