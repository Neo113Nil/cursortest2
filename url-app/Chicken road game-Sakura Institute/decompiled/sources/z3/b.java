package z3;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b implements y3.a {

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f10071g = new String[0];

    /* renamed from: f, reason: collision with root package name */
    public final SQLiteDatabase f10072f;

    public b(SQLiteDatabase sQLiteDatabase) {
        this.f10072f = sQLiteDatabase;
    }

    @Override // y3.a
    public final void A() {
        this.f10072f.setTransactionSuccessful();
    }

    @Override // y3.a
    public final void B(String str, Object[] objArr) {
        this.f10072f.execSQL(str, objArr);
    }

    @Override // y3.a
    public final void C() {
        this.f10072f.beginTransactionNonExclusive();
    }

    @Override // y3.a
    public final Cursor O(String str) {
        k.f(str, "query");
        return p(new q5.g(str));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10072f.close();
    }

    @Override // y3.a
    public final void d() {
        this.f10072f.endTransaction();
    }

    @Override // y3.a
    public final void e() {
        this.f10072f.beginTransaction();
    }

    @Override // y3.a
    public final Cursor g(y3.d dVar, CancellationSignal cancellationSignal) {
        String b9 = dVar.b();
        a aVar = new a(0, dVar);
        k.f(b9, "sql");
        Cursor rawQueryWithFactory = this.f10072f.rawQueryWithFactory(aVar, b9, f10071g, null, cancellationSignal);
        k.e(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return rawQueryWithFactory;
    }

    @Override // y3.a
    public final void i(String str) {
        k.f(str, "sql");
        this.f10072f.execSQL(str);
    }

    @Override // y3.a
    public final boolean isOpen() {
        return this.f10072f.isOpen();
    }

    @Override // y3.a
    public final y3.e m(String str) {
        SQLiteStatement compileStatement = this.f10072f.compileStatement(str);
        k.e(compileStatement, "delegate.compileStatement(sql)");
        return new i(compileStatement);
    }

    @Override // y3.a
    public final Cursor p(y3.d dVar) {
        Cursor rawQueryWithFactory = this.f10072f.rawQueryWithFactory(new a(1, new i2.c(1, dVar)), dVar.b(), f10071g, null);
        k.e(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    @Override // y3.a
    public final boolean s() {
        return this.f10072f.inTransaction();
    }

    @Override // y3.a
    public final boolean x() {
        SQLiteDatabase sQLiteDatabase = this.f10072f;
        k.f(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }
}
