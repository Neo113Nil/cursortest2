package w1;

import android.database.sqlite.SQLiteProgram;

/* loaded from: classes.dex */
public class h implements v1.c {

    /* renamed from: d, reason: collision with root package name */
    public final SQLiteProgram f8599d;

    public h(SQLiteProgram sQLiteProgram) {
        Z1.i.f(sQLiteProgram, "delegate");
        this.f8599d = sQLiteProgram;
    }

    @Override // v1.c
    public final void A(int i3, byte[] bArr) {
        this.f8599d.bindBlob(i3, bArr);
    }

    @Override // v1.c
    public final void B(int i3) {
        this.f8599d.bindNull(i3);
    }

    @Override // v1.c
    public final void C(String str, int i3) {
        Z1.i.f(str, "value");
        this.f8599d.bindString(i3, str);
    }

    @Override // v1.c
    public final void J(long j3, int i3) {
        this.f8599d.bindLong(i3, j3);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f8599d.close();
    }

    @Override // v1.c
    public final void t(double d3, int i3) {
        this.f8599d.bindDouble(i3, d3);
    }
}
