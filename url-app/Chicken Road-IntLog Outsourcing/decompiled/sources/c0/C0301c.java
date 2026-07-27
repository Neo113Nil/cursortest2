package c0;

import G0.C0051a;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import b0.InterfaceC0263d;
import java.io.Closeable;
import java.util.List;

/* renamed from: c0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0301c implements Closeable {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f4868c = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f4869d = new String[0];

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f4870a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4871b;

    public C0301c(SQLiteDatabase delegate) {
        kotlin.jvm.internal.i.e(delegate, "delegate");
        this.f4870a = delegate;
        this.f4871b = delegate.getAttachedDbs();
    }

    public final Cursor A(InterfaceC0263d interfaceC0263d) {
        Cursor rawQueryWithFactory = this.f4870a.rawQueryWithFactory(new C0299a(1, new C0300b(interfaceC0263d)), interfaceC0263d.a(), f4869d, null);
        kotlin.jvm.internal.i.d(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    public final Cursor C(String query) {
        kotlin.jvm.internal.i.e(query, "query");
        return A(new C0051a(query));
    }

    public final void D() {
        this.f4870a.setTransactionSuccessful();
    }

    public final void a() {
        this.f4870a.beginTransaction();
    }

    public final void b() {
        this.f4870a.beginTransactionNonExclusive();
    }

    public final C0307i c(String str) {
        SQLiteStatement compileStatement = this.f4870a.compileStatement(str);
        kotlin.jvm.internal.i.d(compileStatement, "delegate.compileStatement(sql)");
        return new C0307i(compileStatement);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4870a.close();
    }

    public final void g() {
        this.f4870a.endTransaction();
    }

    public final void o(String sql) {
        kotlin.jvm.internal.i.e(sql, "sql");
        this.f4870a.execSQL(sql);
    }

    public final void p(Object[] objArr) {
        this.f4870a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    public final boolean q() {
        return this.f4870a.inTransaction();
    }

    public final boolean y() {
        SQLiteDatabase sQLiteDatabase = this.f4870a;
        kotlin.jvm.internal.i.e(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }
}
