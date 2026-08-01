package j0;

import android.database.sqlite.SQLiteProgram;
import i0.InterfaceC0144c;

/* loaded from: classes.dex */
public class i implements InterfaceC0144c {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f2667a;

    public i(SQLiteProgram sQLiteProgram) {
        g1.f.e(sQLiteProgram, "delegate");
        this.f2667a = sQLiteProgram;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2667a.close();
    }

    @Override // i0.InterfaceC0144c
    public final void e(int i, byte[] bArr) {
        this.f2667a.bindBlob(i, bArr);
    }

    @Override // i0.InterfaceC0144c
    public final void f(int i) {
        this.f2667a.bindNull(i);
    }

    @Override // i0.InterfaceC0144c
    public final void g(String str, int i) {
        this.f2667a.bindString(i, str);
    }

    @Override // i0.InterfaceC0144c
    public final void h(int i, double d) {
        this.f2667a.bindDouble(i, d);
    }

    @Override // i0.InterfaceC0144c
    public final void r(int i, long j2) {
        this.f2667a.bindLong(i, j2);
    }
}
