package x;

import android.database.sqlite.SQLiteProgram;

/* loaded from: classes.dex */
class d implements w.d {

    /* renamed from: f, reason: collision with root package name */
    private final SQLiteProgram f23057f;

    d(SQLiteProgram sQLiteProgram) {
        this.f23057f = sQLiteProgram;
    }

    @Override // w.d
    public void F(int i7, byte[] bArr) {
        this.f23057f.bindBlob(i7, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f23057f.close();
    }

    @Override // w.d
    public void l(int i7, String str) {
        this.f23057f.bindString(i7, str);
    }

    @Override // w.d
    public void o(int i7) {
        this.f23057f.bindNull(i7);
    }

    @Override // w.d
    public void p(int i7, double d7) {
        this.f23057f.bindDouble(i7, d7);
    }

    @Override // w.d
    public void z(int i7, long j7) {
        this.f23057f.bindLong(i7, j7);
    }
}
