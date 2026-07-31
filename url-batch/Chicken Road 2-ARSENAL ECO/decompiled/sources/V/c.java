package V;

import M5.v;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements Closeable {

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f2680h = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f2681i = new String[0];

    /* renamed from: f, reason: collision with root package name */
    public final SQLiteDatabase f2682f;

    /* renamed from: g, reason: collision with root package name */
    public final List f2683g;

    public c(SQLiteDatabase sQLiteDatabase) {
        this.f2682f = sQLiteDatabase;
        this.f2683g = sQLiteDatabase.getAttachedDbs();
    }

    public final Cursor F(String query) {
        kotlin.jvm.internal.i.e(query, "query");
        return y(new v(query));
    }

    public final void G() {
        this.f2682f.setTransactionSuccessful();
    }

    public final void a() {
        this.f2682f.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2682f.close();
    }

    public final void d() {
        this.f2682f.beginTransactionNonExclusive();
    }

    public final i e(String str) {
        SQLiteStatement compileStatement = this.f2682f.compileStatement(str);
        kotlin.jvm.internal.i.d(compileStatement, "delegate.compileStatement(sql)");
        return new i(compileStatement);
    }

    public final void g() {
        this.f2682f.endTransaction();
    }

    public final void h(String sql) {
        kotlin.jvm.internal.i.e(sql, "sql");
        this.f2682f.execSQL(sql);
    }

    public final void m(Object[] objArr) {
        this.f2682f.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    public final boolean n() {
        return this.f2682f.inTransaction();
    }

    public final boolean v() {
        SQLiteDatabase sQLiteDatabase = this.f2682f;
        kotlin.jvm.internal.i.e(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    public final Cursor y(U.e eVar) {
        final b bVar = new b(eVar);
        Cursor rawQueryWithFactory = this.f2682f.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: V.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) b.this.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, eVar.d(), f2681i, null);
        kotlin.jvm.internal.i.d(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }
}
