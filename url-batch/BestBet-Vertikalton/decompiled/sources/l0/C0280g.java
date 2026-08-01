package l0;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import c1.AbstractC0091d;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import q.AbstractC0309e;

/* renamed from: l0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0280g extends SQLiteOpenHelper {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f3518g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f3519a;

    /* renamed from: b, reason: collision with root package name */
    public final C0277d f3520b;

    /* renamed from: c, reason: collision with root package name */
    public final B.d f3521c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final m0.a f3522e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3523f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0280g(Context context, String str, final C0277d c0277d, final B.d dVar) {
        super(context, str, null, dVar.f32b, new DatabaseErrorHandler() { // from class: l0.e
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                k1.e.e(B.d.this, "$callback");
                C0277d c0277d2 = c0277d;
                int i = C0280g.f3518g;
                k1.e.d(sQLiteDatabase, "dbObj");
                C0276c l2 = AbstractC0091d.l(c0277d2, sQLiteDatabase);
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + l2 + ".path");
                SQLiteDatabase sQLiteDatabase2 = l2.f3512a;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        B.d.c(path);
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
                        l2.close();
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
                            k1.e.d(obj, "p.second");
                            B.d.c((String) obj);
                        }
                    } else {
                        String path2 = sQLiteDatabase2.getPath();
                        if (path2 != null) {
                            B.d.c(path2);
                        }
                    }
                }
            }
        });
        k1.e.e(dVar, "callback");
        this.f3519a = context;
        this.f3520b = c0277d;
        this.f3521c = dVar;
        if (str == null) {
            str = UUID.randomUUID().toString();
            k1.e.d(str, "randomUUID().toString()");
        }
        this.f3522e = new m0.a(str, context.getCacheDir(), false);
    }

    public final C0276c a(boolean z2) {
        m0.a aVar = this.f3522e;
        try {
            aVar.a((this.f3523f || getDatabaseName() == null) ? false : true);
            this.d = false;
            SQLiteDatabase k2 = k(z2);
            if (!this.d) {
                C0276c d = d(k2);
                aVar.b();
                return d;
            }
            close();
            C0276c a2 = a(z2);
            aVar.b();
            return a2;
        } catch (Throwable th) {
            aVar.b();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        m0.a aVar = this.f3522e;
        try {
            aVar.a(aVar.f3535a);
            super.close();
            this.f3520b.f3513a = null;
            this.f3523f = false;
        } finally {
            aVar.b();
        }
    }

    public final C0276c d(SQLiteDatabase sQLiteDatabase) {
        k1.e.e(sQLiteDatabase, "sqLiteDatabase");
        return AbstractC0091d.l(this.f3520b, sQLiteDatabase);
    }

    public final SQLiteDatabase j(boolean z2) {
        if (z2) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            k1.e.d(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        k1.e.d(readableDatabase, "{\n                super.…eDatabase()\n            }");
        return readableDatabase;
    }

    public final SQLiteDatabase k(boolean z2) {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z3 = this.f3523f;
        Context context = this.f3519a;
        if (databaseName != null && !z3 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return j(z2);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return j(z2);
            } catch (Throwable th) {
                super.close();
                if (!(th instanceof C0279f)) {
                    if (th instanceof SQLiteException) {
                        throw th;
                    }
                    throw th;
                }
                C0279f c0279f = th;
                int a2 = AbstractC0309e.a(c0279f.f3516a);
                Throwable th2 = c0279f.f3517b;
                if (a2 == 0 || a2 == 1 || a2 == 2 || a2 == 3) {
                    throw th2;
                }
                if (!(th2 instanceof SQLiteException)) {
                    throw th2;
                }
                context.deleteDatabase(databaseName);
                try {
                    return j(z2);
                } catch (C0279f e2) {
                    throw e2.f3517b;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        k1.e.e(sQLiteDatabase, "db");
        boolean z2 = this.d;
        B.d dVar = this.f3521c;
        if (!z2 && dVar.f32b != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            d(sQLiteDatabase);
            dVar.getClass();
        } catch (Throwable th) {
            throw new C0279f(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        k1.e.e(sQLiteDatabase, "sqLiteDatabase");
        try {
            this.f3521c.g(d(sQLiteDatabase));
        } catch (Throwable th) {
            throw new C0279f(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        k1.e.e(sQLiteDatabase, "db");
        this.d = true;
        try {
            this.f3521c.i(d(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new C0279f(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        k1.e.e(sQLiteDatabase, "db");
        if (!this.d) {
            try {
                this.f3521c.h(d(sQLiteDatabase));
            } catch (Throwable th) {
                throw new C0279f(5, th);
            }
        }
        this.f3523f = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        k1.e.e(sQLiteDatabase, "sqLiteDatabase");
        this.d = true;
        try {
            this.f3521c.i(d(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new C0279f(3, th);
        }
    }
}
