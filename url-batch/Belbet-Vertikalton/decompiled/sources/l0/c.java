package l0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import k0.InterfaceC0199a;
import k0.InterfaceC0202d;
import k0.InterfaceC0203e;

/* loaded from: classes.dex */
public final class c implements InterfaceC0199a {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f3249b = new String[0];

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f3250a;

    public c(SQLiteDatabase sQLiteDatabase) {
        j1.h.e(sQLiteDatabase, "delegate");
        this.f3250a = sQLiteDatabase;
    }

    @Override // k0.InterfaceC0199a
    public final InterfaceC0203e C(String str) {
        j1.h.e(str, "sql");
        SQLiteStatement compileStatement = this.f3250a.compileStatement(str);
        j1.h.d(compileStatement, "delegate.compileStatement(sql)");
        return new j(compileStatement);
    }

    @Override // k0.InterfaceC0199a
    public final void c() {
        this.f3250a.beginTransactionNonExclusive();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3250a.close();
    }

    @Override // k0.InterfaceC0199a
    public final void e() {
        this.f3250a.endTransaction();
    }

    @Override // k0.InterfaceC0199a
    public final void f() {
        this.f3250a.beginTransaction();
    }

    @Override // k0.InterfaceC0199a
    public final Cursor g(InterfaceC0202d interfaceC0202d) {
        j1.h.e(interfaceC0202d, "query");
        Cursor rawQueryWithFactory = this.f3250a.rawQueryWithFactory(new C0207a(1, new b(interfaceC0202d)), interfaceC0202d.d(), f3249b, null);
        j1.h.d(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    @Override // k0.InterfaceC0199a
    public final Cursor i(InterfaceC0202d interfaceC0202d, CancellationSignal cancellationSignal) {
        j1.h.e(interfaceC0202d, "query");
        String d2 = interfaceC0202d.d();
        String[] strArr = f3249b;
        j1.h.b(cancellationSignal);
        C0207a c0207a = new C0207a(0, interfaceC0202d);
        SQLiteDatabase sQLiteDatabase = this.f3250a;
        j1.h.e(sQLiteDatabase, "sQLiteDatabase");
        j1.h.e(d2, "sql");
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(c0207a, d2, strArr, null, cancellationSignal);
        j1.h.d(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return rawQueryWithFactory;
    }

    @Override // k0.InterfaceC0199a
    public final boolean isOpen() {
        return this.f3250a.isOpen();
    }

    @Override // k0.InterfaceC0199a
    public final boolean o() {
        SQLiteDatabase sQLiteDatabase = this.f3250a;
        j1.h.e(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    @Override // k0.InterfaceC0199a
    public final void r(String str) {
        j1.h.e(str, "sql");
        this.f3250a.execSQL(str);
    }

    @Override // k0.InterfaceC0199a
    public final Cursor u(String str) {
        j1.h.e(str, "query");
        return g(new B1.c(str));
    }

    @Override // k0.InterfaceC0199a
    public final void w() {
        this.f3250a.setTransactionSuccessful();
    }

    @Override // k0.InterfaceC0199a
    public final boolean x() {
        return this.f3250a.inTransaction();
    }
}
