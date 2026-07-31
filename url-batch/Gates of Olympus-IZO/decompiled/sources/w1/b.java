package w1;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import v1.InterfaceC1018a;

/* loaded from: classes.dex */
public final class b implements InterfaceC1018a {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f8580e = new String[0];

    /* renamed from: d, reason: collision with root package name */
    public final SQLiteDatabase f8581d;

    public b(SQLiteDatabase sQLiteDatabase) {
        Z1.i.f(sQLiteDatabase, "delegate");
        this.f8581d = sQLiteDatabase;
    }

    @Override // v1.InterfaceC1018a
    public final Cursor E(v1.d dVar, CancellationSignal cancellationSignal) {
        Z1.i.f(dVar, "query");
        String h3 = dVar.h();
        String[] strArr = f8580e;
        Z1.i.c(cancellationSignal);
        a aVar = new a(0, dVar);
        SQLiteDatabase sQLiteDatabase = this.f8581d;
        Z1.i.f(sQLiteDatabase, "sQLiteDatabase");
        Z1.i.f(h3, "sql");
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(aVar, h3, strArr, null, cancellationSignal);
        Z1.i.e(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return rawQueryWithFactory;
    }

    @Override // v1.InterfaceC1018a
    public final Cursor H(v1.d dVar) {
        Z1.i.f(dVar, "query");
        Cursor rawQueryWithFactory = this.f8581d.rawQueryWithFactory(new a(1, new I0.c(2, dVar)), dVar.h(), f8580e, null);
        Z1.i.e(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    @Override // v1.InterfaceC1018a
    public final Cursor K(String str) {
        Z1.i.f(str, "query");
        return H(new C2.c(str));
    }

    @Override // v1.InterfaceC1018a
    public final boolean M() {
        return this.f8581d.inTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f8581d.close();
    }

    @Override // v1.InterfaceC1018a
    public final void d() {
        this.f8581d.endTransaction();
    }

    @Override // v1.InterfaceC1018a
    public final void f() {
        this.f8581d.beginTransaction();
    }

    @Override // v1.InterfaceC1018a
    public final boolean isOpen() {
        return this.f8581d.isOpen();
    }

    @Override // v1.InterfaceC1018a
    public final boolean n() {
        SQLiteDatabase sQLiteDatabase = this.f8581d;
        Z1.i.f(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    @Override // v1.InterfaceC1018a
    public final void q(String str) {
        Z1.i.f(str, "sql");
        this.f8581d.execSQL(str);
    }

    @Override // v1.InterfaceC1018a
    public final void s() {
        this.f8581d.setTransactionSuccessful();
    }

    @Override // v1.InterfaceC1018a
    public final v1.e w(String str) {
        Z1.i.f(str, "sql");
        SQLiteStatement compileStatement = this.f8581d.compileStatement(str);
        Z1.i.e(compileStatement, "delegate.compileStatement(sql)");
        return new i(compileStatement);
    }

    @Override // v1.InterfaceC1018a
    public final void y() {
        this.f8581d.beginTransactionNonExclusive();
    }
}
