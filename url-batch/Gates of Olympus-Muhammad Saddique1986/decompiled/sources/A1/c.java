package A1;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;
import m1.q;

/* loaded from: classes.dex */
public final class c implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f201e = new String[0];

    /* renamed from: d, reason: collision with root package name */
    public final SQLiteDatabase f202d;

    public c(SQLiteDatabase sQLiteDatabase) {
        f2.j.f(sQLiteDatabase, "delegate");
        this.f202d = sQLiteDatabase;
    }

    public final void a() {
        this.f202d.beginTransaction();
    }

    public final void b() {
        this.f202d.beginTransactionNonExclusive();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f202d.close();
    }

    public final k d(String str) {
        SQLiteStatement compileStatement = this.f202d.compileStatement(str);
        f2.j.e(compileStatement, "delegate.compileStatement(sql)");
        return new k(compileStatement);
    }

    public final void e() {
        this.f202d.endTransaction();
    }

    public final void g(String str) {
        f2.j.f(str, "sql");
        this.f202d.execSQL(str);
    }

    public final boolean h() {
        return this.f202d.inTransaction();
    }

    public final boolean l() {
        SQLiteDatabase sQLiteDatabase = this.f202d;
        f2.j.f(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    public final Cursor n(String str) {
        f2.j.f(str, "query");
        return q(new q(str));
    }

    public final Cursor q(z1.c cVar) {
        Cursor rawQueryWithFactory = this.f202d.rawQueryWithFactory(new a(1, new b(0, cVar)), cVar.d(), f201e, null);
        f2.j.e(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    public final void r() {
        this.f202d.setTransactionSuccessful();
    }
}
