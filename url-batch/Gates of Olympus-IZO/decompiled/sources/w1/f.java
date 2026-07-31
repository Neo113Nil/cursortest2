package w1;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import f.AbstractC0382a;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import m.AbstractC0600j;
import v1.InterfaceC1018a;
import x1.C1055a;

/* loaded from: classes.dex */
public final class f extends SQLiteOpenHelper {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f8587j = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Context f8588d;

    /* renamed from: e, reason: collision with root package name */
    public final c f8589e;

    /* renamed from: f, reason: collision with root package name */
    public final F2.h f8590f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8591g;

    /* renamed from: h, reason: collision with root package name */
    public final C1055a f8592h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8593i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, String str, final c cVar, final F2.h hVar) {
        super(context, str, null, hVar.f1502e, new DatabaseErrorHandler() { // from class: w1.d
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                Z1.i.f(F2.h.this, "$callback");
                c cVar2 = cVar;
                int i3 = f.f8587j;
                Z1.i.e(sQLiteDatabase, "dbObj");
                b r3 = AbstractC0382a.r(cVar2, sQLiteDatabase);
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + r3 + ".path");
                SQLiteDatabase sQLiteDatabase2 = r3.f8581d;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        F2.h.d(path);
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
                        r3.close();
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
                            Z1.i.e(obj, "p.second");
                            F2.h.d((String) obj);
                        }
                    } else {
                        String path2 = sQLiteDatabase2.getPath();
                        if (path2 != null) {
                            F2.h.d(path2);
                        }
                    }
                }
            }
        });
        Z1.i.f(hVar, "callback");
        this.f8588d = context;
        this.f8589e = cVar;
        this.f8590f = hVar;
        if (str == null) {
            str = UUID.randomUUID().toString();
            Z1.i.e(str, "randomUUID().toString()");
        }
        this.f8592h = new C1055a(str, context.getCacheDir());
    }

    public final InterfaceC1018a a(boolean z3) {
        C1055a c1055a = this.f8592h;
        try {
            c1055a.a((this.f8593i || getDatabaseName() == null) ? false : true);
            this.f8591g = false;
            SQLiteDatabase h3 = h(z3);
            if (!this.f8591g) {
                b b2 = b(h3);
                c1055a.b();
                return b2;
            }
            close();
            InterfaceC1018a a3 = a(z3);
            c1055a.b();
            return a3;
        } catch (Throwable th) {
            c1055a.b();
            throw th;
        }
    }

    public final b b(SQLiteDatabase sQLiteDatabase) {
        Z1.i.f(sQLiteDatabase, "sqLiteDatabase");
        return AbstractC0382a.r(this.f8589e, sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        C1055a c1055a = this.f8592h;
        try {
            HashMap hashMap = C1055a.f8723d;
            c1055a.getClass();
            c1055a.a(false);
            super.close();
            this.f8589e.f8582a = null;
            this.f8593i = false;
        } finally {
            c1055a.b();
        }
    }

    public final SQLiteDatabase e(boolean z3) {
        if (z3) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            Z1.i.e(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        Z1.i.e(readableDatabase, "{\n                super.…eDatabase()\n            }");
        return readableDatabase;
    }

    public final SQLiteDatabase h(boolean z3) {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z4 = this.f8593i;
        Context context = this.f8588d;
        if (databaseName != null && !z4 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return e(z3);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return e(z3);
            } catch (Throwable th) {
                super.close();
                if (!(th instanceof e)) {
                    if (th instanceof SQLiteException) {
                        throw th;
                    }
                    throw th;
                }
                e eVar = th;
                int a3 = AbstractC0600j.a(eVar.f8585d);
                Throwable th2 = eVar.f8586e;
                if (a3 == 0 || a3 == 1 || a3 == 2 || a3 == 3) {
                    throw th2;
                }
                if (!(th2 instanceof SQLiteException)) {
                    throw th2;
                }
                context.deleteDatabase(databaseName);
                try {
                    return e(z3);
                } catch (e e3) {
                    throw e3.f8586e;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        Z1.i.f(sQLiteDatabase, "db");
        boolean z3 = this.f8591g;
        F2.h hVar = this.f8590f;
        if (!z3 && hVar.f1502e != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            b(sQLiteDatabase);
            hVar.getClass();
        } catch (Throwable th) {
            throw new e(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        Z1.i.f(sQLiteDatabase, "sqLiteDatabase");
        try {
            this.f8590f.h(b(sQLiteDatabase));
        } catch (Throwable th) {
            throw new e(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i3, int i4) {
        Z1.i.f(sQLiteDatabase, "db");
        this.f8591g = true;
        try {
            F2.h hVar = this.f8590f;
            b b2 = b(sQLiteDatabase);
            hVar.getClass();
            hVar.j(b2, i3, i4);
        } catch (Throwable th) {
            throw new e(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        Z1.i.f(sQLiteDatabase, "db");
        if (!this.f8591g) {
            try {
                this.f8590f.i(b(sQLiteDatabase));
            } catch (Throwable th) {
                throw new e(5, th);
            }
        }
        this.f8593i = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i3, int i4) {
        Z1.i.f(sQLiteDatabase, "sqLiteDatabase");
        this.f8591g = true;
        try {
            this.f8590f.j(b(sQLiteDatabase), i3, i4);
        } catch (Throwable th) {
            throw new e(3, th);
        }
    }
}
