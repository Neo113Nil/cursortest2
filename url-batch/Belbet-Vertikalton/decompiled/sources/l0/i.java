package l0;

import android.database.sqlite.SQLiteProgram;
import k0.InterfaceC0201c;

/* loaded from: classes.dex */
public class i implements InterfaceC0201c {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f3266a;

    public i(SQLiteProgram sQLiteProgram) {
        j1.h.e(sQLiteProgram, "delegate");
        this.f3266a = sQLiteProgram;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3266a.close();
    }

    @Override // k0.InterfaceC0201c
    public final void j(int i, byte[] bArr) {
        this.f3266a.bindBlob(i, bArr);
    }

    @Override // k0.InterfaceC0201c
    public final void k(int i) {
        this.f3266a.bindNull(i);
    }

    @Override // k0.InterfaceC0201c
    public final void l(String str, int i) {
        j1.h.e(str, "value");
        this.f3266a.bindString(i, str);
    }

    @Override // k0.InterfaceC0201c
    public final void m(int i, double d2) {
        this.f3266a.bindDouble(i, d2);
    }

    @Override // k0.InterfaceC0201c
    public final void t(int i, long j) {
        this.f3266a.bindLong(i, j);
    }
}
