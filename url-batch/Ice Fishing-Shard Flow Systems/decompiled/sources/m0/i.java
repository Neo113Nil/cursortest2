package m0;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class i implements l0.d {

    /* renamed from: d, reason: collision with root package name */
    public final SQLiteProgram f6517d;

    public i(SQLiteProgram delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f6517d = delegate;
    }

    @Override // l0.d
    public final void D(byte[] value, int i2) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f6517d.bindBlob(i2, value);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6517d.close();
    }

    @Override // l0.d
    public final void f(int i2, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f6517d.bindString(i2, value);
    }

    @Override // l0.d
    public final void l(int i2) {
        this.f6517d.bindNull(i2);
    }

    @Override // l0.d
    public final void m(int i2, double d7) {
        this.f6517d.bindDouble(i2, d7);
    }

    @Override // l0.d
    public final void r(long j, int i2) {
        this.f6517d.bindLong(i2, j);
    }
}
