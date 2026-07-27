package c0;

import android.database.sqlite.SQLiteProgram;
import b0.InterfaceC0262c;

/* renamed from: c0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0306h implements InterfaceC0262c {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f4891a;

    public C0306h(SQLiteProgram delegate) {
        kotlin.jvm.internal.i.e(delegate, "delegate");
        this.f4891a = delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4891a.close();
    }

    @Override // b0.InterfaceC0262c
    public final void f(int i2, String value) {
        kotlin.jvm.internal.i.e(value, "value");
        this.f4891a.bindString(i2, value);
    }

    @Override // b0.InterfaceC0262c
    public final void j(int i2) {
        this.f4891a.bindNull(i2);
    }

    @Override // b0.InterfaceC0262c
    public final void k(int i2, double d6) {
        this.f4891a.bindDouble(i2, d6);
    }

    @Override // b0.InterfaceC0262c
    public final void t(int i2, long j2) {
        this.f4891a.bindLong(i2, j2);
    }

    @Override // b0.InterfaceC0262c
    public final void w(int i2, byte[] bArr) {
        this.f4891a.bindBlob(i2, bArr);
    }
}
