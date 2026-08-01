package k5;

import android.database.sqlite.SQLiteProgram;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class j implements j5.e {

    /* renamed from: d, reason: collision with root package name */
    public final SQLiteProgram f5436d;

    public j(SQLiteProgram sQLiteProgram) {
        sQLiteProgram.getClass();
        this.f5436d = sQLiteProgram;
    }

    @Override // j5.e
    public final void D(int i3, byte[] bArr) {
        this.f5436d.bindBlob(i3, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5436d.close();
    }

    @Override // j5.e
    public final void f(int i3, long j) {
        this.f5436d.bindLong(i3, j);
    }

    @Override // j5.e
    public final void g() {
        this.f5436d.clearBindings();
    }

    @Override // j5.e
    public final void l(int i3, String str) {
        str.getClass();
        this.f5436d.bindString(i3, str);
    }

    @Override // j5.e
    public final void n(double d10, int i3) {
        this.f5436d.bindDouble(i3, d10);
    }

    @Override // j5.e
    public final void r(int i3) {
        this.f5436d.bindNull(i3);
    }
}
