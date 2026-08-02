package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ams implements amj {
    public static final String[] a = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] b = new String[0];
    public static final koi c = koc.a(2, new aji(4));
    public static final koi d = koc.a(2, new aji(5));
    public final SQLiteDatabase e;

    public ams(SQLiteDatabase sQLiteDatabase) {
        this.e = sQLiteDatabase;
    }

    @Override // defpackage.amj
    public final String a() {
        return this.e.getPath();
    }

    @Override // defpackage.amj
    public final void b() {
        this.e.beginTransaction();
    }

    @Override // defpackage.amj
    public final void c() {
        this.e.beginTransactionNonExclusive();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e.close();
    }

    @Override // defpackage.amj
    public final void d() {
        this.e.endTransaction();
    }

    @Override // defpackage.amj
    public final void e(String str) {
        this.e.execSQL(str);
    }

    @Override // defpackage.amj
    public final void f() {
        this.e.setTransactionSuccessful();
    }

    @Override // defpackage.amj
    public final boolean g() {
        return this.e.inTransaction();
    }

    @Override // defpackage.amj
    public final boolean h() {
        return this.e.isOpen();
    }

    @Override // defpackage.amj
    public final amz i(String str) {
        SQLiteStatement compileStatement = this.e.compileStatement(str);
        compileStatement.getClass();
        return new amz(compileStatement);
    }

    @Override // defpackage.amj
    public final void j(Object[] objArr) {
        this.e.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }
}
