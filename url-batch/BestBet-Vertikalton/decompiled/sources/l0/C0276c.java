package l0;

import U.q;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;

/* renamed from: l0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0276c implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f3511b = new String[0];

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f3512a;

    public C0276c(SQLiteDatabase sQLiteDatabase) {
        k1.e.e(sQLiteDatabase, "delegate");
        this.f3512a = sQLiteDatabase;
    }

    public final void a() {
        this.f3512a.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3512a.close();
    }

    public final void d() {
        this.f3512a.beginTransactionNonExclusive();
    }

    public final C0283j j(String str) {
        SQLiteStatement compileStatement = this.f3512a.compileStatement(str);
        k1.e.d(compileStatement, "delegate.compileStatement(sql)");
        return new C0283j(compileStatement);
    }

    public final void k() {
        this.f3512a.endTransaction();
    }

    public final void p(String str) {
        k1.e.e(str, "sql");
        this.f3512a.execSQL(str);
    }

    public final boolean r() {
        return this.f3512a.inTransaction();
    }

    public final boolean s() {
        SQLiteDatabase sQLiteDatabase = this.f3512a;
        k1.e.e(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    public final Cursor t(String str) {
        k1.e.e(str, "query");
        return u(new q(str));
    }

    public final Cursor u(k0.c cVar) {
        Cursor rawQueryWithFactory = this.f3512a.rawQueryWithFactory(new C0274a(1, new C0275b(cVar)), cVar.d(), f3511b, null);
        k1.e.d(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    public final void v() {
        this.f3512a.setTransactionSuccessful();
    }
}
