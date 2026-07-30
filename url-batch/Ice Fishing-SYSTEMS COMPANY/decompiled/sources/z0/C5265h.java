package z0;

import android.database.sqlite.SQLiteProgram;

/* renamed from: z0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5265h implements y0.c {

    /* renamed from: n, reason: collision with root package name */
    public final SQLiteProgram f42130n;

    public C5265h(SQLiteProgram delegate) {
        kotlin.jvm.internal.h.e(delegate, "delegate");
        this.f42130n = delegate;
    }

    @Override // y0.c
    public final void c(int i, String value) {
        kotlin.jvm.internal.h.e(value, "value");
        this.f42130n.bindString(i, value);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f42130n.close();
    }

    @Override // y0.c
    public final void d(int i, double d2) {
        this.f42130n.bindDouble(i, d2);
    }

    @Override // y0.c
    public final void h(int i, long j9) {
        this.f42130n.bindLong(i, j9);
    }

    @Override // y0.c
    public final void l(int i, byte[] bArr) {
        this.f42130n.bindBlob(i, bArr);
    }

    @Override // y0.c
    public final void o(int i) {
        this.f42130n.bindNull(i);
    }
}
