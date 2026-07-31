package x;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import java.util.List;
import w.f;

/* loaded from: classes.dex */
class a implements w.b {

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f23038g = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: h, reason: collision with root package name */
    private static final String[] f23039h = new String[0];

    /* renamed from: f, reason: collision with root package name */
    private final SQLiteDatabase f23040f;

    /* renamed from: x.a$a, reason: collision with other inner class name */
    class C0150a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w.e f23041a;

        C0150a(w.e eVar) {
            this.f23041a = eVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f23041a.f(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    class b implements SQLiteDatabase.CursorFactory {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w.e f23043a;

        b(w.e eVar) {
            this.f23043a = eVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f23043a.f(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    a(SQLiteDatabase sQLiteDatabase) {
        this.f23040f = sQLiteDatabase;
    }

    @Override // w.b
    public void A() {
        this.f23040f.setTransactionSuccessful();
    }

    @Override // w.b
    public void B(String str, Object[] objArr) {
        this.f23040f.execSQL(str, objArr);
    }

    @Override // w.b
    public Cursor L(String str) {
        return t(new w.a(str));
    }

    @Override // w.b
    public Cursor N(w.e eVar, CancellationSignal cancellationSignal) {
        return this.f23040f.rawQueryWithFactory(new b(eVar), eVar.b(), f23039h, null, cancellationSignal);
    }

    boolean b(SQLiteDatabase sQLiteDatabase) {
        return this.f23040f == sQLiteDatabase;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f23040f.close();
    }

    @Override // w.b
    public void d() {
        this.f23040f.endTransaction();
    }

    @Override // w.b
    public void g() {
        this.f23040f.beginTransaction();
    }

    @Override // w.b
    public boolean isOpen() {
        return this.f23040f.isOpen();
    }

    @Override // w.b
    public List<Pair<String, String>> j() {
        return this.f23040f.getAttachedDbs();
    }

    @Override // w.b
    public void k(String str) {
        this.f23040f.execSQL(str);
    }

    @Override // w.b
    public f n(String str) {
        return new e(this.f23040f.compileStatement(str));
    }

    @Override // w.b
    public String r() {
        return this.f23040f.getPath();
    }

    @Override // w.b
    public boolean s() {
        return this.f23040f.inTransaction();
    }

    @Override // w.b
    public Cursor t(w.e eVar) {
        return this.f23040f.rawQueryWithFactory(new C0150a(eVar), eVar.b(), f23039h, null);
    }
}
