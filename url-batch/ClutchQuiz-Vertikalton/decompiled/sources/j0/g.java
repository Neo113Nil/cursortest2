package j0;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import i0.InterfaceC0142a;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import k0.C0181a;
import q.AbstractC0317e;

/* loaded from: classes.dex */
public final class g extends SQLiteOpenHelper {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f2657g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2658a;

    /* renamed from: b, reason: collision with root package name */
    public final d f2659b;

    /* renamed from: c, reason: collision with root package name */
    public final B.d f2660c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final C0181a f2661e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2662f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String str, final d dVar, final B.d dVar2) {
        super(context, str, null, dVar2.f43a, new DatabaseErrorHandler() { // from class: j0.e
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                g1.f.e(B.d.this, "$callback");
                d dVar3 = dVar;
                int i = g.f2657g;
                g1.f.d(sQLiteDatabase, "dbObj");
                c f2 = h0.g.f(dVar3, sQLiteDatabase);
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + f2 + ".path");
                SQLiteDatabase sQLiteDatabase2 = f2.f2651a;
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
                        f2.close();
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
                            g1.f.d(obj, "p.second");
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
        g1.f.e(dVar2, "callback");
        this.f2658a = context;
        this.f2659b = dVar;
        this.f2660c = dVar2;
        if (str == null) {
            str = UUID.randomUUID().toString();
            g1.f.d(str, "randomUUID().toString()");
        }
        this.f2661e = new C0181a(str, context.getCacheDir());
    }

    public final InterfaceC0142a a(boolean z2) {
        C0181a c0181a = this.f2661e;
        try {
            c0181a.a((this.f2662f || getDatabaseName() == null) ? false : true);
            this.d = false;
            SQLiteDatabase p2 = p(z2);
            if (!this.d) {
                c j2 = j(p2);
                c0181a.b();
                return j2;
            }
            close();
            InterfaceC0142a a2 = a(z2);
            c0181a.b();
            return a2;
        } catch (Throwable th) {
            c0181a.b();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        C0181a c0181a = this.f2661e;
        try {
            HashMap hashMap = C0181a.d;
            c0181a.getClass();
            c0181a.a(false);
            super.close();
            this.f2659b.f2652a = null;
            this.f2662f = false;
        } finally {
            c0181a.b();
        }
    }

    public final c j(SQLiteDatabase sQLiteDatabase) {
        g1.f.e(sQLiteDatabase, "sqLiteDatabase");
        return h0.g.f(this.f2659b, sQLiteDatabase);
    }

    public final SQLiteDatabase k(boolean z2) {
        if (z2) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            g1.f.d(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        g1.f.d(readableDatabase, "{\n                super.…eDatabase()\n            }");
        return readableDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        g1.f.e(sQLiteDatabase, "db");
        boolean z2 = this.d;
        B.d dVar = this.f2660c;
        if (!z2 && dVar.f43a != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            j(sQLiteDatabase);
            dVar.getClass();
        } catch (Throwable th) {
            throw new f(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        g1.f.e(sQLiteDatabase, "sqLiteDatabase");
        try {
            this.f2660c.f(j(sQLiteDatabase));
        } catch (Throwable th) {
            throw new f(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        g1.f.e(sQLiteDatabase, "db");
        this.d = true;
        try {
            this.f2660c.h(j(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new f(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        g1.f.e(sQLiteDatabase, "db");
        if (!this.d) {
            try {
                this.f2660c.g(j(sQLiteDatabase));
            } catch (Throwable th) {
                throw new f(5, th);
            }
        }
        this.f2662f = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        g1.f.e(sQLiteDatabase, "sqLiteDatabase");
        this.d = true;
        try {
            this.f2660c.h(j(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new f(3, th);
        }
    }

    public final SQLiteDatabase p(boolean z2) {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z3 = this.f2662f;
        Context context = this.f2658a;
        if (databaseName != null && !z3 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return k(z2);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return k(z2);
            } catch (Throwable th) {
                super.close();
                if (!(th instanceof f)) {
                    if (th instanceof SQLiteException) {
                        throw th;
                    }
                    throw th;
                }
                f fVar = th;
                int a2 = AbstractC0317e.a(fVar.f2655a);
                Throwable th2 = fVar.f2656b;
                if (a2 == 0 || a2 == 1 || a2 == 2 || a2 == 3) {
                    throw th2;
                }
                if (!(th2 instanceof SQLiteException)) {
                    throw th2;
                }
                context.deleteDatabase(databaseName);
                try {
                    return k(z2);
                } catch (f e2) {
                    throw e2.f2656b;
                }
            }
        }
    }
}
