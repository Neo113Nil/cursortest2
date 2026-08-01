package l0;

import android.database.sqlite.SQLiteProgram;

/* renamed from: l0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0282i implements k0.b {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f3528a;

    public C0282i(SQLiteProgram sQLiteProgram) {
        k1.e.e(sQLiteProgram, "delegate");
        this.f3528a = sQLiteProgram;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3528a.close();
    }

    @Override // k0.b
    public final void e(int i, byte[] bArr) {
        this.f3528a.bindBlob(i, bArr);
    }

    @Override // k0.b
    public final void f(int i) {
        this.f3528a.bindNull(i);
    }

    @Override // k0.b
    public final void g(String str, int i) {
        k1.e.e(str, "value");
        this.f3528a.bindString(i, str);
    }

    @Override // k0.b
    public final void h(int i, double d) {
        this.f3528a.bindDouble(i, d);
    }

    @Override // k0.b
    public final void n(int i, long j2) {
        this.f3528a.bindLong(i, j2);
    }
}
