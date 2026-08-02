package defpackage;

import android.database.sqlite.SQLiteProgram;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class amy implements amo {
    private final SQLiteProgram a;

    public amy(SQLiteProgram sQLiteProgram) {
        this.a = sQLiteProgram;
    }

    @Override // defpackage.amo
    public final void a(int i, byte[] bArr) {
        this.a.bindBlob(i, bArr);
    }

    @Override // defpackage.amo
    public final void b(int i, double d) {
        this.a.bindDouble(i, d);
    }

    @Override // defpackage.amo
    public final void c(int i, long j) {
        this.a.bindLong(i, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.amo
    public final void d(int i) {
        this.a.bindNull(i);
    }

    @Override // defpackage.amo
    public final void e(int i, String str) {
        this.a.bindString(i, str);
    }
}
