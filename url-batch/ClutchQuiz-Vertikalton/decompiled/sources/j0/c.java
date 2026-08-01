package j0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import i0.InterfaceC0142a;
import i0.InterfaceC0145d;
import i0.InterfaceC0146e;

/* loaded from: classes.dex */
public final class c implements InterfaceC0142a {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f2650b = new String[0];

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f2651a;

    public c(SQLiteDatabase sQLiteDatabase) {
        g1.f.e(sQLiteDatabase, "delegate");
        this.f2651a = sQLiteDatabase;
    }

    @Override // i0.InterfaceC0142a
    public final void b() {
        this.f2651a.beginTransactionNonExclusive();
    }

    @Override // i0.InterfaceC0142a
    public final void c() {
        this.f2651a.endTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2651a.close();
    }

    @Override // i0.InterfaceC0142a
    public final void d() {
        this.f2651a.beginTransaction();
    }

    @Override // i0.InterfaceC0142a
    public final boolean i() {
        return this.f2651a.isOpen();
    }

    @Override // i0.InterfaceC0142a
    public final boolean l() {
        SQLiteDatabase sQLiteDatabase = this.f2651a;
        g1.f.e(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    @Override // i0.InterfaceC0142a
    public final Cursor m(InterfaceC0145d interfaceC0145d, CancellationSignal cancellationSignal) {
        g1.f.e(interfaceC0145d, "query");
        String k2 = interfaceC0145d.k();
        String[] strArr = f2650b;
        g1.f.b(cancellationSignal);
        a aVar = new a(0, interfaceC0145d);
        SQLiteDatabase sQLiteDatabase = this.f2651a;
        g1.f.e(sQLiteDatabase, "sQLiteDatabase");
        g1.f.e(k2, "sql");
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(aVar, k2, strArr, null, cancellationSignal);
        g1.f.d(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return rawQueryWithFactory;
    }

    @Override // i0.InterfaceC0142a
    public final Cursor n(InterfaceC0145d interfaceC0145d) {
        g1.f.e(interfaceC0145d, "query");
        Cursor rawQueryWithFactory = this.f2651a.rawQueryWithFactory(new a(1, new b(interfaceC0145d)), interfaceC0145d.k(), f2650b, null);
        g1.f.d(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    @Override // i0.InterfaceC0142a
    public final void o(String str) {
        g1.f.e(str, "sql");
        this.f2651a.execSQL(str);
    }

    @Override // i0.InterfaceC0142a
    public final Cursor s(String str) {
        g1.f.e(str, "query");
        return n(new B.j(str));
    }

    @Override // i0.InterfaceC0142a
    public final void t() {
        this.f2651a.setTransactionSuccessful();
    }

    @Override // i0.InterfaceC0142a
    public final boolean v() {
        return this.f2651a.inTransaction();
    }

    @Override // i0.InterfaceC0142a
    public final InterfaceC0146e x(String str) {
        g1.f.e(str, "sql");
        SQLiteStatement compileStatement = this.f2651a.compileStatement(str);
        g1.f.d(compileStatement, "delegate.compileStatement(sql)");
        return new j(compileStatement);
    }
}
