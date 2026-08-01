package l0;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import k0.InterfaceC0199a;
import m0.C0243a;
import s.AbstractC0380e;

/* loaded from: classes.dex */
public final class g extends SQLiteOpenHelper {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f3256g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f3257a;

    /* renamed from: b, reason: collision with root package name */
    public final d f3258b;

    /* renamed from: c, reason: collision with root package name */
    public final D.d f3259c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3260d;
    public final C0243a e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3261f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String str, final d dVar, final D.d dVar2) {
        super(context, str, null, dVar2.f168b, new DatabaseErrorHandler() { // from class: l0.e
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                j1.h.e(D.d.this, "$callback");
                d dVar3 = dVar;
                int i = g.f3256g;
                j1.h.d(sQLiteDatabase, "dbObj");
                c K2 = H1.d.K(dVar3, sQLiteDatabase);
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + K2 + ".path");
                SQLiteDatabase sQLiteDatabase2 = K2.f3250a;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        D.d.c(path);
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
                        K2.close();
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
                            j1.h.d(obj, "p.second");
                            D.d.c((String) obj);
                        }
                    } else {
                        String path2 = sQLiteDatabase2.getPath();
                        if (path2 != null) {
                            D.d.c(path2);
                        }
                    }
                }
            }
        });
        j1.h.e(dVar2, "callback");
        this.f3257a = context;
        this.f3258b = dVar;
        this.f3259c = dVar2;
        if (str == null) {
            str = UUID.randomUUID().toString();
            j1.h.d(str, "randomUUID().toString()");
        }
        this.e = new C0243a(str, context.getCacheDir());
    }

    public final InterfaceC0199a a(boolean z2) {
        C0243a c0243a = this.e;
        try {
            c0243a.a((this.f3261f || getDatabaseName() == null) ? false : true);
            this.f3260d = false;
            SQLiteDatabase z3 = z(z2);
            if (!this.f3260d) {
                c d2 = d(z3);
                c0243a.b();
                return d2;
            }
            close();
            InterfaceC0199a a2 = a(z2);
            c0243a.b();
            return a2;
        } catch (Throwable th) {
            c0243a.b();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        C0243a c0243a = this.e;
        try {
            HashMap hashMap = C0243a.f3418d;
            c0243a.getClass();
            c0243a.a(false);
            super.close();
            this.f3258b.f3251a = null;
            this.f3261f = false;
        } finally {
            c0243a.b();
        }
    }

    public final c d(SQLiteDatabase sQLiteDatabase) {
        j1.h.e(sQLiteDatabase, "sqLiteDatabase");
        return H1.d.K(this.f3258b, sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        j1.h.e(sQLiteDatabase, "db");
        boolean z2 = this.f3260d;
        D.d dVar = this.f3259c;
        if (!z2 && dVar.f168b != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            d(sQLiteDatabase);
            dVar.getClass();
        } catch (Throwable th) {
            throw new f(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        j1.h.e(sQLiteDatabase, "sqLiteDatabase");
        try {
            this.f3259c.f(d(sQLiteDatabase));
        } catch (Throwable th) {
            throw new f(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        j1.h.e(sQLiteDatabase, "db");
        this.f3260d = true;
        try {
            this.f3259c.h(d(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new f(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        j1.h.e(sQLiteDatabase, "db");
        if (!this.f3260d) {
            try {
                this.f3259c.g(d(sQLiteDatabase));
            } catch (Throwable th) {
                throw new f(5, th);
            }
        }
        this.f3261f = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        j1.h.e(sQLiteDatabase, "sqLiteDatabase");
        this.f3260d = true;
        try {
            this.f3259c.h(d(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new f(3, th);
        }
    }

    public final SQLiteDatabase q(boolean z2) {
        if (z2) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            j1.h.d(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        j1.h.d(readableDatabase, "{\n                super.…eDatabase()\n            }");
        return readableDatabase;
    }

    public final SQLiteDatabase z(boolean z2) {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z3 = this.f3261f;
        Context context = this.f3257a;
        if (databaseName != null && !z3 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return q(z2);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return q(z2);
            } catch (Throwable th) {
                super.close();
                if (!(th instanceof f)) {
                    if (th instanceof SQLiteException) {
                        throw th;
                    }
                    throw th;
                }
                f fVar = th;
                int a2 = AbstractC0380e.a(fVar.f3254a);
                Throwable th2 = fVar.f3255b;
                if (a2 == 0 || a2 == 1 || a2 == 2 || a2 == 3) {
                    throw th2;
                }
                if (!(th2 instanceof SQLiteException)) {
                    throw th2;
                }
                context.deleteDatabase(databaseName);
                try {
                    return q(z2);
                } catch (f e) {
                    throw e.f3255b;
                }
            }
        }
    }
}
