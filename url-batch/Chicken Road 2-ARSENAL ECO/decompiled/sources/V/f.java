package V;

import N.p;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public final class f extends SQLiteOpenHelper {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f2688m = 0;

    /* renamed from: f, reason: collision with root package name */
    public final Context f2689f;

    /* renamed from: g, reason: collision with root package name */
    public final J1.c f2690g;

    /* renamed from: h, reason: collision with root package name */
    public final D1.b f2691h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2692i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2693j;

    /* renamed from: k, reason: collision with root package name */
    public final W.a f2694k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2695l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, String str, final J1.c cVar, final D1.b callback, boolean z5) {
        super(context, str, null, callback.f368b, new DatabaseErrorHandler() { // from class: V.d
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase dbObj) {
                D1.b callback2 = D1.b.this;
                kotlin.jvm.internal.i.e(callback2, "$callback");
                int i7 = f.f2688m;
                kotlin.jvm.internal.i.d(dbObj, "dbObj");
                c l7 = AbstractC0676f.l(cVar, dbObj);
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + l7 + ".path");
                SQLiteDatabase sQLiteDatabase = l7.f2682f;
                if (!sQLiteDatabase.isOpen()) {
                    String path = sQLiteDatabase.getPath();
                    if (path != null) {
                        D1.b.b(path);
                        return;
                    }
                    return;
                }
                List list = null;
                try {
                    try {
                        list = l7.f2683g;
                    } finally {
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                kotlin.jvm.internal.i.d(obj, "p.second");
                                D1.b.b((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase.getPath();
                            if (path2 != null) {
                                D1.b.b(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    l7.close();
                } catch (IOException unused2) {
                }
                if (list != null) {
                    return;
                }
            }
        });
        String str2;
        kotlin.jvm.internal.i.e(callback, "callback");
        this.f2689f = context;
        this.f2690g = cVar;
        this.f2691h = callback;
        this.f2692i = z5;
        if (str == null) {
            str2 = UUID.randomUUID().toString();
            kotlin.jvm.internal.i.d(str2, "randomUUID().toString()");
        } else {
            str2 = str;
        }
        File cacheDir = context.getCacheDir();
        kotlin.jvm.internal.i.d(cacheDir, "context.cacheDir");
        this.f2694k = new W.a(str2, cacheDir, false);
    }

    public final c a(boolean z5) {
        W.a aVar = this.f2694k;
        try {
            aVar.a((this.f2695l || getDatabaseName() == null) ? false : true);
            this.f2693j = false;
            SQLiteDatabase e4 = e(z5);
            if (!this.f2693j) {
                c l7 = AbstractC0676f.l(this.f2690g, e4);
                aVar.b();
                return l7;
            }
            close();
            c a7 = a(z5);
            aVar.b();
            return a7;
        } catch (Throwable th) {
            aVar.b();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        W.a aVar = this.f2694k;
        try {
            aVar.a(aVar.f2784a);
            super.close();
            this.f2690g.f1289g = null;
            this.f2695l = false;
        } finally {
            aVar.b();
        }
    }

    public final SQLiteDatabase d(boolean z5) {
        if (z5) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            kotlin.jvm.internal.i.d(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        kotlin.jvm.internal.i.d(readableDatabase, "{\n                super.…eDatabase()\n            }");
        return readableDatabase;
    }

    public final SQLiteDatabase e(boolean z5) {
        File parentFile;
        String databaseName = getDatabaseName();
        Context context = this.f2689f;
        if (databaseName != null && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return d(z5);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return d(z5);
            } catch (Throwable th) {
                super.close();
                if (th instanceof e) {
                    e eVar = th;
                    int c7 = p.c(eVar.f2686f);
                    Throwable th2 = eVar.f2687g;
                    if (c7 == 0 || c7 == 1 || c7 == 2 || c7 == 3) {
                        throw th2;
                    }
                    if (!(th2 instanceof SQLiteException)) {
                        throw th2;
                    }
                } else {
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                    if (databaseName == null || !this.f2692i) {
                        throw th;
                    }
                }
                context.deleteDatabase(databaseName);
                try {
                    return d(z5);
                } catch (e e4) {
                    throw e4.f2687g;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase db) {
        kotlin.jvm.internal.i.e(db, "db");
        try {
            D1.b bVar = this.f2691h;
            AbstractC0676f.l(this.f2690g, db);
            bVar.getClass();
        } catch (Throwable th) {
            throw new e(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sqLiteDatabase) {
        kotlin.jvm.internal.i.e(sqLiteDatabase, "sqLiteDatabase");
        try {
            this.f2691h.f(AbstractC0676f.l(this.f2690g, sqLiteDatabase));
        } catch (Throwable th) {
            throw new e(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase db, int i7, int i8) {
        kotlin.jvm.internal.i.e(db, "db");
        this.f2693j = true;
        try {
            this.f2691h.h(AbstractC0676f.l(this.f2690g, db), i7, i8);
        } catch (Throwable th) {
            throw new e(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase db) {
        kotlin.jvm.internal.i.e(db, "db");
        if (!this.f2693j) {
            try {
                this.f2691h.g(AbstractC0676f.l(this.f2690g, db));
            } catch (Throwable th) {
                throw new e(5, th);
            }
        }
        this.f2695l = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sqLiteDatabase, int i7, int i8) {
        kotlin.jvm.internal.i.e(sqLiteDatabase, "sqLiteDatabase");
        this.f2693j = true;
        try {
            this.f2691h.h(AbstractC0676f.l(this.f2690g, sqLiteDatabase), i7, i8);
        } catch (Throwable th) {
            throw new e(3, th);
        }
    }
}
