package defpackage;

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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class et0 extends SQLiteOpenHelper {
    public static final /* synthetic */ int s = 0;
    public final Context m;
    public final at0 n;
    public final r5 o;
    public boolean p;
    public final c52 q;
    public boolean r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et0(Context context, String str, final at0 at0Var, final r5 r5Var) {
        super(context, str, null, r5Var.a, new DatabaseErrorHandler() { // from class: bt0
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = et0.s;
                sQLiteDatabase.getClass();
                zs0 y = s03.y(at0Var, sQLiteDatabase);
                r5.this.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + y + ".path");
                SQLiteDatabase sQLiteDatabase2 = y.m;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        r5.f(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> list = null;
                try {
                    try {
                        list = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (list != null) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                obj.getClass();
                                r5.f((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                r5.f(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    y.close();
                } catch (IOException unused2) {
                }
                if (list != null) {
                    return;
                }
            }
        });
        String str2;
        context.getClass();
        r5Var.getClass();
        this.m = context;
        this.n = at0Var;
        this.o = r5Var;
        if (str == null) {
            str2 = UUID.randomUUID().toString();
            str2.getClass();
        } else {
            str2 = str;
        }
        this.q = new c52(str2, context.getCacheDir(), false);
    }

    public final zs0 b(boolean z) {
        c52 c52Var = this.q;
        try {
            c52Var.a((this.r || getDatabaseName() == null) ? false : true);
            this.p = false;
            SQLiteDatabase f = f(z);
            if (!this.p) {
                zs0 y = s03.y(this.n, f);
                c52Var.b();
                return y;
            }
            close();
            zs0 b = b(z);
            c52Var.b();
            return b;
        } catch (Throwable th) {
            c52Var.b();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        c52 c52Var = this.q;
        try {
            c52Var.a(c52Var.a);
            super.close();
            this.n.m = null;
            this.r = false;
        } finally {
            c52Var.b();
        }
    }

    public final SQLiteDatabase f(boolean z) {
        SQLiteDatabase readableDatabase;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.r;
        if (databaseName != null && !z2 && (parentFile = this.m.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                writableDatabase.getClass();
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase2 = getReadableDatabase();
            readableDatabase2.getClass();
            return readableDatabase2;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z) {
                    readableDatabase = getWritableDatabase();
                    readableDatabase.getClass();
                } else {
                    readableDatabase = getReadableDatabase();
                    readableDatabase.getClass();
                }
                return readableDatabase;
            } catch (Throwable th) {
                th = th;
                if (th instanceof ct0) {
                    ct0 ct0Var = (ct0) th;
                    int ordinal = ct0Var.m.ordinal();
                    th = ct0Var.n;
                    if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                        throw th;
                    }
                    if (ordinal != 4) {
                        a.b();
                        return null;
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                throw th;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        boolean z = this.p;
        r5 r5Var = this.o;
        if (!z && r5Var.a != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            s03.y(this.n, sQLiteDatabase);
            r5Var.getClass();
        } catch (Throwable th) {
            throw new ct0(dt0.m, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            ((ib2) this.o.b).d(new zq2(s03.y(this.n, sQLiteDatabase)));
        } catch (Throwable th) {
            throw new ct0(dt0.n, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.p = true;
        try {
            this.o.h(s03.y(this.n, sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new ct0(dt0.p, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.p) {
            try {
                r5 r5Var = this.o;
                zs0 y = s03.y(this.n, sQLiteDatabase);
                ib2 ib2Var = (ib2) r5Var.b;
                ib2Var.f(new zq2(y));
                ib2Var.g = y;
            } catch (Throwable th) {
                throw new ct0(dt0.q, th);
            }
        }
        this.r = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.p = true;
        try {
            this.o.h(s03.y(this.n, sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new ct0(dt0.o, th);
        }
    }
}
