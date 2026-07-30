package z3;

import android.database.sqlite.SQLiteProgram;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class h implements y3.c {

    /* renamed from: f, reason: collision with root package name */
    public final SQLiteProgram f10090f;

    public h(SQLiteProgram sQLiteProgram) {
        k.f(sQLiteProgram, "delegate");
        this.f10090f = sQLiteProgram;
    }

    @Override // y3.c
    public final void G(int i7, byte[] bArr) {
        this.f10090f.bindBlob(i7, bArr);
    }

    @Override // y3.c
    public final void H(String str, int i7) {
        k.f(str, "value");
        this.f10090f.bindString(i7, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10090f.close();
    }

    @Override // y3.c
    public final void j(double d8, int i7) {
        this.f10090f.bindDouble(i7, d8);
    }

    @Override // y3.c
    public final void o(int i7) {
        this.f10090f.bindNull(i7);
    }

    @Override // y3.c
    public final void r(long j8, int i7) {
        this.f10090f.bindLong(i7, j8);
    }
}
