package z0;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import i8.m;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import u.AbstractC5088e;

/* renamed from: z0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5263f extends SQLiteOpenHelper {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f42115A = 0;

    /* renamed from: n, reason: collision with root package name */
    public final Context f42116n;

    /* renamed from: u, reason: collision with root package name */
    public final m f42117u;

    /* renamed from: v, reason: collision with root package name */
    public final F.d f42118v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f42119w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f42120x;

    /* renamed from: y, reason: collision with root package name */
    public final A0.a f42121y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f42122z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5263f(Context context, String str, final m mVar, final F.d callback, boolean z8) {
        super(context, str, null, callback.f908b, new DatabaseErrorHandler() { // from class: z0.d
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase dbObj) {
                F.d callback2 = F.d.this;
                kotlin.jvm.internal.h.e(callback2, "$callback");
                m mVar2 = mVar;
                int i = C5263f.f42115A;
                kotlin.jvm.internal.h.d(dbObj, "dbObj");
                C5260c f6 = Z5.c.f(mVar2, dbObj);
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + f6 + ".path");
                SQLiteDatabase sQLiteDatabase = f6.f42109n;
                if (!sQLiteDatabase.isOpen()) {
                    String path = sQLiteDatabase.getPath();
                    if (path != null) {
                        F.d.e(path);
                        return;
                    }
                    return;
                }
                List list = null;
                try {
                    try {
                        list = f6.f42110u;
                    } catch (SQLiteException unused) {
                    }
                    try {
                        f6.close();
                    } catch (IOException unused2) {
                    }
                    if (list != null) {
                        return;
                    }
                } finally {
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            kotlin.jvm.internal.h.d(obj, "p.second");
                            F.d.e((String) obj);
                        }
                    } else {
                        String path2 = sQLiteDatabase.getPath();
                        if (path2 != null) {
                            F.d.e(path2);
                        }
                    }
                }
            }
        });
        String str2;
        kotlin.jvm.internal.h.e(callback, "callback");
        this.f42116n = context;
        this.f42117u = mVar;
        this.f42118v = callback;
        this.f42119w = z8;
        if (str == null) {
            str2 = UUID.randomUUID().toString();
            kotlin.jvm.internal.h.d(str2, "randomUUID().toString()");
        } else {
            str2 = str;
        }
        File cacheDir = context.getCacheDir();
        kotlin.jvm.internal.h.d(cacheDir, "context.cacheDir");
        this.f42121y = new A0.a(str2, cacheDir, false);
    }

    public final C5260c a(boolean z8) {
        A0.a aVar = this.f42121y;
        try {
            aVar.a((this.f42122z || getDatabaseName() == null) ? false : true);
            this.f42120x = false;
            SQLiteDatabase g9 = g(z8);
            if (!this.f42120x) {
                C5260c f6 = Z5.c.f(this.f42117u, g9);
                aVar.b();
                return f6;
            }
            close();
            C5260c a9 = a(z8);
            aVar.b();
            return a9;
        } catch (Throwable th) {
            aVar.b();
            throw th;
        }
    }

    public final SQLiteDatabase b(boolean z8) {
        if (z8) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            kotlin.jvm.internal.h.d(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        kotlin.jvm.internal.h.d(readableDatabase, "{\n                super.…eDatabase()\n            }");
        return readableDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        A0.a aVar = this.f42121y;
        try {
            aVar.a(aVar.f7a);
            super.close();
            this.f42117u.f38384n = null;
            this.f42122z = false;
        } finally {
            aVar.b();
        }
    }

    public final SQLiteDatabase g(boolean z8) {
        File parentFile;
        String databaseName = getDatabaseName();
        Context context = this.f42116n;
        if (databaseName != null && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return b(z8);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return b(z8);
            } catch (Throwable th) {
                super.close();
                if (th instanceof C5262e) {
                    C5262e c5262e = th;
                    int d2 = AbstractC5088e.d(c5262e.f42113n);
                    Throwable th2 = c5262e.f42114u;
                    if (d2 == 0 || d2 == 1 || d2 == 2 || d2 == 3) {
                        throw th2;
                    }
                    if (!(th2 instanceof SQLiteException)) {
                        throw th2;
                    }
                } else {
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                    if (databaseName == null || !this.f42119w) {
                        throw th;
                    }
                }
                context.deleteDatabase(databaseName);
                try {
                    return b(z8);
                } catch (C5262e e6) {
                    throw e6.f42114u;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase db) {
        kotlin.jvm.internal.h.e(db, "db");
        try {
            F.d dVar = this.f42118v;
            Z5.c.f(this.f42117u, db);
            dVar.getClass();
        } catch (Throwable th) {
            throw new C5262e(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sqLiteDatabase) {
        kotlin.jvm.internal.h.e(sqLiteDatabase, "sqLiteDatabase");
        try {
            this.f42118v.j(Z5.c.f(this.f42117u, sqLiteDatabase));
        } catch (Throwable th) {
            throw new C5262e(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase db, int i, int i4) {
        kotlin.jvm.internal.h.e(db, "db");
        this.f42120x = true;
        try {
            this.f42118v.l(Z5.c.f(this.f42117u, db), i, i4);
        } catch (Throwable th) {
            throw new C5262e(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase db) {
        kotlin.jvm.internal.h.e(db, "db");
        if (!this.f42120x) {
            try {
                this.f42118v.k(Z5.c.f(this.f42117u, db));
            } catch (Throwable th) {
                throw new C5262e(5, th);
            }
        }
        this.f42122z = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i4) {
        kotlin.jvm.internal.h.e(sqLiteDatabase, "sqLiteDatabase");
        this.f42120x = true;
        try {
            this.f42118v.l(Z5.c.f(this.f42117u, sqLiteDatabase), i, i4);
        } catch (Throwable th) {
            throw new C5262e(3, th);
        }
    }
}
