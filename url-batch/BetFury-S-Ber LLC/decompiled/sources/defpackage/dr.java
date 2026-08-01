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

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class dr extends SQLiteOpenHelper {
    public static final /* synthetic */ int l = 0;
    public final Context f;
    public final o0 g;
    public final u2 h;
    public boolean i;
    public final n60 j;
    public boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dr(Context context, String str, final o0 o0Var, final u2 u2Var) {
        super(context, str, null, u2Var.f, new DatabaseErrorHandler() { // from class: zq
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = dr.l;
                sQLiteDatabase.getClass();
                o0 o0Var2 = o0Var;
                yq yqVar = (yq) o0Var2.g;
                if (yqVar == null || !yqVar.f.equals(sQLiteDatabase)) {
                    yqVar = new yq(sQLiteDatabase);
                    o0Var2.g = yqVar;
                }
                SQLiteDatabase sQLiteDatabase2 = yqVar.f;
                u2.this.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + yqVar + ".path");
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        u2.c(path);
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
                                u2.c((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                u2.c(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    yqVar.close();
                } catch (IOException unused2) {
                }
                if (list != null) {
                    return;
                }
            }
        });
        String str2;
        context.getClass();
        u2Var.getClass();
        this.f = context;
        this.g = o0Var;
        this.h = u2Var;
        if (str == null) {
            str2 = UUID.randomUUID().toString();
            str2.getClass();
        } else {
            str2 = str;
        }
        this.j = new n60(str2, context.getCacheDir(), false);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        n60 n60Var = this.j;
        try {
            n60Var.a(n60Var.a);
            super.close();
            this.g.g = null;
            this.k = false;
        } finally {
            n60Var.b();
        }
    }

    public final ig0 i(boolean z) {
        n60 n60Var = this.j;
        try {
            n60Var.a((this.k || getDatabaseName() == null) ? false : true);
            this.i = false;
            SQLiteDatabase r = r(z);
            if (!this.i) {
                yq n = n(r);
                n60Var.b();
                return n;
            }
            close();
            ig0 i = i(z);
            n60Var.b();
            return i;
        } catch (Throwable th) {
            n60Var.b();
            throw th;
        }
    }

    public final yq n(SQLiteDatabase sQLiteDatabase) {
        o0 o0Var = this.g;
        o0Var.getClass();
        yq yqVar = (yq) o0Var.g;
        if (yqVar != null && yqVar.f.equals(sQLiteDatabase)) {
            return yqVar;
        }
        yq yqVar2 = new yq(sQLiteDatabase);
        o0Var.g = yqVar2;
        return yqVar2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        boolean z = this.i;
        u2 u2Var = this.h;
        if (!z && u2Var.f != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            n(sQLiteDatabase);
            u2Var.getClass();
        } catch (Throwable th) {
            throw new ar(br.ON_CONFIGURE, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            ((ea0) this.h.g).d(new gg0(n(sQLiteDatabase)));
        } catch (Throwable th) {
            throw new ar(br.ON_CREATE, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.i = true;
        try {
            this.h.e(n(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new ar(br.ON_DOWNGRADE, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.i) {
            try {
                u2 u2Var = this.h;
                yq n = n(sQLiteDatabase);
                ea0 ea0Var = (ea0) u2Var.g;
                ea0Var.f(new gg0(n));
                ea0Var.g = n;
            } catch (Throwable th) {
                throw new ar(br.ON_OPEN, th);
            }
        }
        this.k = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.i = true;
        try {
            this.h.e(n(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new ar(br.ON_UPGRADE, th);
        }
    }

    public final SQLiteDatabase r(boolean z) {
        SQLiteDatabase readableDatabase;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.k;
        if (databaseName != null && !z2 && (parentFile = this.f.getDatabasePath(databaseName).getParentFile()) != null) {
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
                if (th instanceof ar) {
                    ar arVar = (ar) th;
                    int i = cr.a[arVar.f.ordinal()];
                    th = arVar.g;
                    if (i == 1 || i == 2 || i == 3 || i == 4) {
                        throw th;
                    }
                    if (i != 5) {
                        throw new md();
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                throw th;
            }
        }
    }
}
