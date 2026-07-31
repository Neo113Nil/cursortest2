package u4;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* loaded from: classes.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    final boolean f22484a;

    /* renamed from: b, reason: collision with root package name */
    final String f22485b;

    /* renamed from: c, reason: collision with root package name */
    final int f22486c;

    /* renamed from: d, reason: collision with root package name */
    final int f22487d;

    /* renamed from: e, reason: collision with root package name */
    SQLiteDatabase f22488e;

    /* renamed from: f, reason: collision with root package name */
    boolean f22489f;

    /* renamed from: u4.a$a, reason: collision with other inner class name */
    class C0142a implements DatabaseErrorHandler {
        C0142a() {
        }

        @Override // android.database.DatabaseErrorHandler
        public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        }
    }

    a(String str, int i7, boolean z6, int i8) {
        this.f22485b = str;
        this.f22484a = z6;
        this.f22486c = i7;
        this.f22487d = i8;
    }

    static void b(String str) {
        SQLiteDatabase.deleteDatabase(new File(str));
    }

    public void a() {
        this.f22488e.close();
    }

    public SQLiteDatabase c() {
        return this.f22488e;
    }

    String d() {
        return "[" + e() + "] ";
    }

    String e() {
        Thread currentThread = Thread.currentThread();
        return "" + this.f22486c + "," + currentThread.getName() + "(" + currentThread.getId() + ")";
    }

    public SQLiteDatabase f() {
        return this.f22488e;
    }

    public void g() {
        this.f22488e = SQLiteDatabase.openDatabase(this.f22485b, null, 268435456);
    }

    public void h() {
        this.f22488e = SQLiteDatabase.openDatabase(this.f22485b, null, 1, new C0142a());
    }
}
