package m0;

import B6.o;
import a.AbstractC0169a;
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
import kotlin.jvm.internal.Intrinsics;
import n0.C0749a;

/* loaded from: classes.dex */
public final class g extends SQLiteOpenHelper {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f6502p = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Context f6503d;

    /* renamed from: e, reason: collision with root package name */
    public final l4.b f6504e;

    /* renamed from: i, reason: collision with root package name */
    public final o f6505i;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f6506l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6507m;

    /* renamed from: n, reason: collision with root package name */
    public final C0749a f6508n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f6509o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String str, final l4.b dbRef, final o callback, boolean z7) {
        super(context, str, null, callback.f229b, new DatabaseErrorHandler() { // from class: m0.d
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase dbObj) {
                o callback2 = o.this;
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                l4.b dbRef2 = dbRef;
                Intrinsics.checkNotNullParameter(dbRef2, "$dbRef");
                int i2 = g.f6502p;
                Intrinsics.checkNotNullExpressionValue(dbObj, "dbObj");
                C0684c db = AbstractC0169a.m(dbRef2, dbObj);
                callback2.getClass();
                Intrinsics.checkNotNullParameter(db, "db");
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + db + ".path");
                SQLiteDatabase sQLiteDatabase = db.f6490d;
                if (!sQLiteDatabase.isOpen()) {
                    String path = sQLiteDatabase.getPath();
                    if (path != null) {
                        o.b(path);
                        return;
                    }
                    return;
                }
                List list = null;
                try {
                    try {
                        list = db.f6491e;
                    } finally {
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                Intrinsics.checkNotNullExpressionValue(obj, "p.second");
                                o.b((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase.getPath();
                            if (path2 != null) {
                                o.b(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    db.close();
                } catch (IOException unused2) {
                }
                if (list != null) {
                    return;
                }
            }
        });
        String str2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dbRef, "dbRef");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f6503d = context;
        this.f6504e = dbRef;
        this.f6505i = callback;
        this.f6506l = z7;
        if (str == null) {
            str2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str2, "randomUUID().toString()");
        } else {
            str2 = str;
        }
        File cacheDir = context.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "context.cacheDir");
        this.f6508n = new C0749a(str2, cacheDir, false);
    }

    public final C0684c a(boolean z7) {
        C0749a c0749a = this.f6508n;
        try {
            c0749a.a((this.f6509o || getDatabaseName() == null) ? false : true);
            this.f6507m = false;
            SQLiteDatabase h7 = h(z7);
            if (!this.f6507m) {
                C0684c d7 = d(h7);
                c0749a.b();
                return d7;
            }
            close();
            C0684c a7 = a(z7);
            c0749a.b();
            return a7;
        } catch (Throwable th) {
            c0749a.b();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        C0749a c0749a = this.f6508n;
        try {
            c0749a.a(c0749a.f6970a);
            super.close();
            this.f6504e.f6272e = null;
            this.f6509o = false;
        } finally {
            c0749a.b();
        }
    }

    public final C0684c d(SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        return AbstractC0169a.m(this.f6504e, sqLiteDatabase);
    }

    public final SQLiteDatabase g(boolean z7) {
        if (z7) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            Intrinsics.checkNotNullExpressionValue(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        Intrinsics.checkNotNullExpressionValue(readableDatabase, "{\n                super.…eDatabase()\n            }");
        return readableDatabase;
    }

    public final SQLiteDatabase h(boolean z7) {
        File parentFile;
        String databaseName = getDatabaseName();
        Context context = this.f6503d;
        if (databaseName != null && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return g(z7);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return g(z7);
            } catch (Throwable th) {
                super.close();
                if (th instanceof e) {
                    e eVar = th;
                    int ordinal = eVar.f6494d.ordinal();
                    Throwable th2 = eVar.f6495e;
                    if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                        throw th2;
                    }
                    if (!(th2 instanceof SQLiteException)) {
                        throw th2;
                    }
                } else {
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                    if (databaseName == null || !this.f6506l) {
                        throw th;
                    }
                }
                context.deleteDatabase(databaseName);
                try {
                    return g(z7);
                } catch (e e7) {
                    throw e7.f6495e;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        try {
            o oVar = this.f6505i;
            C0684c db2 = d(db);
            oVar.getClass();
            Intrinsics.checkNotNullParameter(db2, "db");
            Intrinsics.checkNotNullParameter(db2, "db");
        } catch (Throwable th) {
            throw new e(f.f6496d, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        try {
            this.f6505i.f(d(sqLiteDatabase));
        } catch (Throwable th) {
            throw new e(f.f6497e, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase db, int i2, int i5) {
        Intrinsics.checkNotNullParameter(db, "db");
        this.f6507m = true;
        try {
            o oVar = this.f6505i;
            C0684c db2 = d(db);
            oVar.getClass();
            Intrinsics.checkNotNullParameter(db2, "db");
            oVar.h(db2, i2, i5);
        } catch (Throwable th) {
            throw new e(f.f6499l, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        if (!this.f6507m) {
            try {
                this.f6505i.g(d(db));
            } catch (Throwable th) {
                throw new e(f.f6500m, th);
            }
        }
        this.f6509o = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sqLiteDatabase, int i2, int i5) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        this.f6507m = true;
        try {
            this.f6505i.h(d(sqLiteDatabase), i2, i5);
        } catch (Throwable th) {
            throw new e(f.f6498i, th);
        }
    }
}
