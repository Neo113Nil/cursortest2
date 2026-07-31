package V;

import android.database.sqlite.SQLiteProgram;

/* loaded from: classes.dex */
public class h implements U.d {

    /* renamed from: f, reason: collision with root package name */
    public final SQLiteProgram f2703f;

    public h(SQLiteProgram delegate) {
        kotlin.jvm.internal.i.e(delegate, "delegate");
        this.f2703f = delegate;
    }

    @Override // U.d
    public final void A(int i7, byte[] bArr) {
        this.f2703f.bindBlob(i7, bArr);
    }

    @Override // U.d
    public final void B(String value, int i7) {
        kotlin.jvm.internal.i.e(value, "value");
        this.f2703f.bindString(i7, value);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2703f.close();
    }

    @Override // U.d
    public final void o(int i7) {
        this.f2703f.bindNull(i7);
    }

    @Override // U.d
    public final void p(int i7, double d7) {
        this.f2703f.bindDouble(i7, d7);
    }

    @Override // U.d
    public final void t(long j4, int i7) {
        this.f2703f.bindLong(i7, j4);
    }
}
