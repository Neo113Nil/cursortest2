package k5;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f5406e = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f5407i = new String[0];

    /* renamed from: r, reason: collision with root package name */
    public static final Object f5408r;

    /* renamed from: s, reason: collision with root package name */
    public static final Object f5409s;

    /* renamed from: d, reason: collision with root package name */
    public final SQLiteDatabase f5410d;

    static {
        hd.i iVar = hd.i.f4507d;
        f5408r = hd.h.a(iVar, new a1.k(21));
        f5409s = hd.h.a(iVar, new a1.k(22));
    }

    public d(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        this.f5410d = sQLiteDatabase;
    }

    public final void a() {
        this.f5410d.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5410d.close();
    }

    public final void d() {
        this.f5410d.beginTransactionNonExclusive();
    }

    public final k h(String str) {
        str.getClass();
        SQLiteStatement compileStatement = this.f5410d.compileStatement(str);
        compileStatement.getClass();
        return new k(compileStatement);
    }

    public final void i() {
        this.f5410d.endTransaction();
    }

    public final boolean isOpen() {
        return this.f5410d.isOpen();
    }

    public final void j(String str) {
        this.f5410d.execSQL(str);
    }

    public final void m(Object[] objArr) {
        this.f5410d.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    public final Cursor o(j5.f fVar) {
        final a aVar = new a(0, fVar);
        Cursor rawQueryWithFactory = this.f5410d.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: k5.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) a.this.c(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, fVar.h(), f5407i, null);
        rawQueryWithFactory.getClass();
        return rawQueryWithFactory;
    }

    public final void p() {
        this.f5410d.setTransactionSuccessful();
    }

    public final boolean t() {
        return this.f5410d.inTransaction();
    }
}
