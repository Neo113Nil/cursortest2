package m0;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l0.C0654a;

/* renamed from: m0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0684c implements Closeable {

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f6488i = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f6489l = new String[0];

    /* renamed from: d, reason: collision with root package name */
    public final SQLiteDatabase f6490d;

    /* renamed from: e, reason: collision with root package name */
    public final List f6491e;

    public C0684c(SQLiteDatabase delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f6490d = delegate;
        this.f6491e = delegate.getAttachedDbs();
    }

    public final boolean B() {
        SQLiteDatabase sQLiteDatabase = this.f6490d;
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    public final Cursor E(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return F(new C0654a(query, 0));
    }

    public final Cursor F(l0.e query) {
        Intrinsics.checkNotNullParameter(query, "query");
        final C0683b c0683b = new C0683b(query);
        Cursor rawQueryWithFactory = this.f6490d.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: m0.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                C0683b tmp0 = C0683b.this;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (Cursor) tmp0.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, query.a(), f6489l, null);
        Intrinsics.checkNotNullExpressionValue(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    public final void G() {
        this.f6490d.setTransactionSuccessful();
    }

    public final void a() {
        this.f6490d.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6490d.close();
    }

    public final void d() {
        this.f6490d.beginTransactionNonExclusive();
    }

    public final j g(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        SQLiteStatement compileStatement = this.f6490d.compileStatement(sql);
        Intrinsics.checkNotNullExpressionValue(compileStatement, "delegate.compileStatement(sql)");
        return new j(compileStatement);
    }

    public final void h() {
        this.f6490d.endTransaction();
    }

    public final void j(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.f6490d.execSQL(sql);
    }

    public final void s(Object[] bindArgs) {
        Intrinsics.checkNotNullParameter("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", "sql");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        this.f6490d.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", bindArgs);
    }

    public final boolean t() {
        return this.f6490d.inTransaction();
    }
}
