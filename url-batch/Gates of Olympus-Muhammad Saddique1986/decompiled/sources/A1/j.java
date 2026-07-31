package A1;

import android.database.sqlite.SQLiteProgram;

/* loaded from: classes.dex */
public class j implements z1.b {

    /* renamed from: d, reason: collision with root package name */
    public final SQLiteProgram f221d;

    public j(SQLiteProgram sQLiteProgram) {
        f2.j.f(sQLiteProgram, "delegate");
        this.f221d = sQLiteProgram;
    }

    @Override // z1.b
    public final void A(long j3, int i3) {
        this.f221d.bindLong(i3, j3);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f221d.close();
    }

    @Override // z1.b
    public final void i(double d3, int i3) {
        this.f221d.bindDouble(i3, d3);
    }

    @Override // z1.b
    public final void j(int i3, byte[] bArr) {
        this.f221d.bindBlob(i3, bArr);
    }

    @Override // z1.b
    public final void k(int i3) {
        this.f221d.bindNull(i3);
    }

    @Override // z1.b
    public final void m(String str, int i3) {
        f2.j.f(str, "value");
        this.f221d.bindString(i3, str);
    }
}
