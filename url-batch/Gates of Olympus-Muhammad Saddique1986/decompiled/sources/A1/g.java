package A1;

import B.C0011l;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import com.gatesof.olympus.martu.marku.App;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import m.AbstractC0625j;

/* loaded from: classes.dex */
public final class g extends SQLiteOpenHelper {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f208j = 0;

    /* renamed from: d, reason: collision with root package name */
    public final App f209d;

    /* renamed from: e, reason: collision with root package name */
    public final d f210e;

    /* renamed from: f, reason: collision with root package name */
    public final C0011l f211f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f212g;

    /* renamed from: h, reason: collision with root package name */
    public final B1.a f213h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f214i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(App app, String str, final d dVar, final C0011l c0011l) {
        super(app, str, null, c0011l.f421e, new DatabaseErrorHandler() { // from class: A1.e
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                f2.j.f(C0011l.this, "$callback");
                d dVar2 = dVar;
                int i3 = g.f208j;
                f2.j.e(sQLiteDatabase, "dbObj");
                c A3 = l0.c.A(dVar2, sQLiteDatabase);
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + A3 + ".path");
                SQLiteDatabase sQLiteDatabase2 = A3.f202d;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        C0011l.d(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> list = null;
                try {
                    try {
                        list = sQLiteDatabase2.getAttachedDbs();
                    } catch (SQLiteException unused) {
                    }
                    try {
                        A3.close();
                    } catch (IOException unused2) {
                    }
                    if (list != null) {
                        return;
                    }
                } finally {
                    if (list != null) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            f2.j.e(obj, "p.second");
                            C0011l.d((String) obj);
                        }
                    } else {
                        String path2 = sQLiteDatabase2.getPath();
                        if (path2 != null) {
                            C0011l.d(path2);
                        }
                    }
                }
            }
        });
        f2.j.f(c0011l, "callback");
        this.f209d = app;
        this.f210e = dVar;
        this.f211f = c0011l;
        if (str == null) {
            str = UUID.randomUUID().toString();
            f2.j.e(str, "randomUUID().toString()");
        }
        this.f213h = new B1.a(str, app.getCacheDir(), false);
    }

    public final c a(boolean z3) {
        B1.a aVar = this.f213h;
        try {
            aVar.a((this.f214i || getDatabaseName() == null) ? false : true);
            this.f212g = false;
            SQLiteDatabase e3 = e(z3);
            if (!this.f212g) {
                c b3 = b(e3);
                aVar.b();
                return b3;
            }
            close();
            c a3 = a(z3);
            aVar.b();
            return a3;
        } catch (Throwable th) {
            aVar.b();
            throw th;
        }
    }

    public final c b(SQLiteDatabase sQLiteDatabase) {
        f2.j.f(sQLiteDatabase, "sqLiteDatabase");
        return l0.c.A(this.f210e, sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        B1.a aVar = this.f213h;
        try {
            aVar.a(aVar.f476a);
            super.close();
            this.f210e.f203a = null;
            this.f214i = false;
        } finally {
            aVar.b();
        }
    }

    public final SQLiteDatabase d(boolean z3) {
        if (z3) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            f2.j.e(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        f2.j.e(readableDatabase, "{\n                super.…eDatabase()\n            }");
        return readableDatabase;
    }

    public final SQLiteDatabase e(boolean z3) {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z4 = this.f214i;
        App app = this.f209d;
        if (databaseName != null && !z4 && (parentFile = app.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return d(z3);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return d(z3);
            } catch (Throwable th) {
                super.close();
                if (!(th instanceof f)) {
                    if (th instanceof SQLiteException) {
                        throw th;
                    }
                    throw th;
                }
                f fVar = th;
                int b3 = AbstractC0625j.b(fVar.f206d);
                Throwable th2 = fVar.f207e;
                if (b3 == 0 || b3 == 1 || b3 == 2 || b3 == 3) {
                    throw th2;
                }
                if (!(th2 instanceof SQLiteException)) {
                    throw th2;
                }
                app.deleteDatabase(databaseName);
                try {
                    return d(z3);
                } catch (f e3) {
                    throw e3.f207e;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        f2.j.f(sQLiteDatabase, "db");
        boolean z3 = this.f212g;
        C0011l c0011l = this.f211f;
        if (!z3 && c0011l.f421e != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            b(sQLiteDatabase);
            c0011l.getClass();
        } catch (Throwable th) {
            throw new f(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        f2.j.f(sQLiteDatabase, "sqLiteDatabase");
        try {
            this.f211f.h(b(sQLiteDatabase));
        } catch (Throwable th) {
            throw new f(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i3, int i4) {
        f2.j.f(sQLiteDatabase, "db");
        this.f212g = true;
        try {
            this.f211f.j(b(sQLiteDatabase), i3, i4);
        } catch (Throwable th) {
            throw new f(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        f2.j.f(sQLiteDatabase, "db");
        if (!this.f212g) {
            try {
                this.f211f.i(b(sQLiteDatabase));
            } catch (Throwable th) {
                throw new f(5, th);
            }
        }
        this.f214i = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i3, int i4) {
        f2.j.f(sQLiteDatabase, "sqLiteDatabase");
        this.f212g = true;
        try {
            this.f211f.j(b(sQLiteDatabase), i3, i4);
        } catch (Throwable th) {
            throw new f(3, th);
        }
    }
}
