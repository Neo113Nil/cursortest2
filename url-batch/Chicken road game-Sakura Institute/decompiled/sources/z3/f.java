package z3;

import a0.l;
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
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f extends SQLiteOpenHelper {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f10078l = 0;

    /* renamed from: f, reason: collision with root package name */
    public final Context f10079f;

    /* renamed from: g, reason: collision with root package name */
    public final c f10080g;

    /* renamed from: h, reason: collision with root package name */
    public final l f10081h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10082i;

    /* renamed from: j, reason: collision with root package name */
    public final a4.a f10083j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10084k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, String str, final c cVar, final l lVar) {
        super(context, str, null, lVar.f100g, new DatabaseErrorHandler() { // from class: z3.d
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                k.f(l.this, "$callback");
                int i7 = f.f10078l;
                k.e(sQLiteDatabase, "dbObj");
                b g9 = v0.d.g(cVar, sQLiteDatabase);
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + g9 + ".path");
                SQLiteDatabase sQLiteDatabase2 = g9.f10072f;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        l.c(path);
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
                        g9.close();
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
                            k.e(obj, "p.second");
                            l.c((String) obj);
                        }
                    } else {
                        String path2 = sQLiteDatabase2.getPath();
                        if (path2 != null) {
                            l.c(path2);
                        }
                    }
                }
            }
        });
        String str2;
        k.f(lVar, "callback");
        this.f10079f = context;
        this.f10080g = cVar;
        this.f10081h = lVar;
        if (str == null) {
            str2 = UUID.randomUUID().toString();
            k.e(str2, "randomUUID().toString()");
        } else {
            str2 = str;
        }
        this.f10083j = new a4.a(str2, context.getCacheDir());
    }

    public final y3.a b(boolean z8) {
        a4.a aVar = this.f10083j;
        try {
            aVar.a((this.f10084k || getDatabaseName() == null) ? false : true);
            this.f10082i = false;
            SQLiteDatabase k8 = k(z8);
            if (!this.f10082i) {
                b g9 = v0.d.g(this.f10080g, k8);
                aVar.b();
                return g9;
            }
            close();
            y3.a b9 = b(z8);
            aVar.b();
            return b9;
        } catch (Throwable th) {
            aVar.b();
            throw th;
        }
    }

    public final SQLiteDatabase c(boolean z8) {
        if (z8) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            k.e(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        k.e(readableDatabase, "{\n                super.…eDatabase()\n            }");
        return readableDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        a4.a aVar = this.f10083j;
        try {
            HashMap hashMap = a4.a.f486d;
            aVar.getClass();
            aVar.a(false);
            super.close();
            this.f10080g.f10073a = null;
            this.f10084k = false;
        } finally {
            aVar.b();
        }
    }

    public final SQLiteDatabase k(boolean z8) {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z9 = this.f10084k;
        Context context = this.f10079f;
        if (databaseName != null && !z9 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return c(z8);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return c(z8);
            } catch (Throwable th) {
                super.close();
                if (!(th instanceof e)) {
                    if (th instanceof SQLiteException) {
                        throw th;
                    }
                    throw th;
                }
                e eVar = th;
                int d8 = l.h.d(eVar.f10076f);
                Throwable th2 = eVar.f10077g;
                if (d8 == 0 || d8 == 1 || d8 == 2 || d8 == 3) {
                    throw th2;
                }
                if (!(th2 instanceof SQLiteException)) {
                    throw th2;
                }
                context.deleteDatabase(databaseName);
                try {
                    return c(z8);
                } catch (e e9) {
                    throw e9.f10077g;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        k.f(sQLiteDatabase, "db");
        boolean z8 = this.f10082i;
        l lVar = this.f10081h;
        if (!z8 && lVar.f100g != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            v0.d.g(this.f10080g, sQLiteDatabase);
            lVar.getClass();
        } catch (Throwable th) {
            throw new e(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        k.f(sQLiteDatabase, "sqLiteDatabase");
        try {
            this.f10081h.f(v0.d.g(this.f10080g, sQLiteDatabase));
        } catch (Throwable th) {
            throw new e(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        k.f(sQLiteDatabase, "db");
        this.f10082i = true;
        try {
            l lVar = this.f10081h;
            b g9 = v0.d.g(this.f10080g, sQLiteDatabase);
            lVar.getClass();
            lVar.h(g9, i7, i8);
        } catch (Throwable th) {
            throw new e(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        k.f(sQLiteDatabase, "db");
        if (!this.f10082i) {
            try {
                this.f10081h.g(v0.d.g(this.f10080g, sQLiteDatabase));
            } catch (Throwable th) {
                throw new e(5, th);
            }
        }
        this.f10084k = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        k.f(sQLiteDatabase, "sqLiteDatabase");
        this.f10082i = true;
        try {
            this.f10081h.h(v0.d.g(this.f10080g, sQLiteDatabase), i7, i8);
        } catch (Throwable th) {
            throw new e(3, th);
        }
    }
}
