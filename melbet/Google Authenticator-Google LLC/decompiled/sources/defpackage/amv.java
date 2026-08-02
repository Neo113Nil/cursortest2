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
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class amv extends SQLiteOpenHelper {
    private final Context a;
    private final amk b;
    private final boolean c;
    private boolean d;
    private final ani e;
    private boolean f;
    private final hrz g;

    public amv(Context context, String str, final hrz hrzVar, amk amkVar, boolean z) {
        super(context, str, null, amkVar.a, new DatabaseErrorHandler() { // from class: amt
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.getClass();
                ams k = yk.k(hrz.this, sQLiteDatabase);
                Log.e("SupportSQLite", a.ab(k, "Corruption reported by sqlite on database: ", ".path"));
                if (!k.h()) {
                    String a = k.a();
                    if (a != null) {
                        amk.a(a);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> list = null;
                try {
                    try {
                        list = k.e.getAttachedDbs();
                    } catch (Throwable th) {
                        if (list != null) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                obj.getClass();
                                amk.a((String) obj);
                            }
                        } else {
                            String a2 = k.a();
                            if (a2 != null) {
                                amk.a(a2);
                            }
                        }
                        throw th;
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    k.close();
                } catch (IOException unused2) {
                }
                if (list == null) {
                    String a3 = k.a();
                    if (a3 != null) {
                        amk.a(a3);
                        return;
                    }
                    return;
                }
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    Object obj2 = ((Pair) it2.next()).second;
                    obj2.getClass();
                    amk.a((String) obj2);
                }
            }
        });
        String str2;
        this.a = context;
        this.g = hrzVar;
        this.b = amkVar;
        this.c = z;
        if (str == null) {
            str2 = UUID.randomUUID().toString();
            str2.getClass();
        } else {
            str2 = str;
        }
        this.e = new ani(str2, context.getCacheDir());
    }

    private final SQLiteDatabase c() {
        SQLiteDatabase writableDatabase = super.getWritableDatabase();
        writableDatabase.getClass();
        return writableDatabase;
    }

    public final ams a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        return yk.k(this.g, sQLiteDatabase);
    }

    public final amj b() {
        SQLiteDatabase c;
        amj a;
        File parentFile;
        try {
            this.e.a((this.f || getDatabaseName() == null) ? false : true);
            this.d = false;
            String databaseName = getDatabaseName();
            boolean z = this.f;
            if (databaseName != null && !z && (parentFile = this.a.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Objects.toString(parentFile);
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: ".concat(parentFile.toString()));
                }
            }
            try {
                c = c();
            } catch (Throwable unused) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    c = c();
                } catch (Throwable th) {
                    th = th;
                    if (th instanceof amu) {
                        amu amuVar = (amu) th;
                        Throwable th2 = amuVar.a;
                        int i = amuVar.b;
                        int i2 = i - 1;
                        if (i == 0) {
                            throw null;
                        }
                        if (i2 == 0) {
                            throw th2;
                        }
                        if (i2 == 1) {
                            throw th2;
                        }
                        if (i2 == 2) {
                            throw th2;
                        }
                        if (i2 == 3) {
                            throw th2;
                        }
                        if (i2 != 4) {
                            throw new koj();
                        }
                        if (!(th2 instanceof SQLiteException)) {
                            throw th2;
                        }
                        th = th2;
                    }
                    if (!(th instanceof SQLiteException) || databaseName == null || !this.c) {
                        throw th;
                    }
                    this.a.deleteDatabase(databaseName);
                    try {
                        c = c();
                    } catch (amu e) {
                        throw e.a;
                    }
                }
            }
            if (this.d) {
                close();
                a = b();
            } else {
                a = a(c);
            }
            return a;
        } finally {
            this.e.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        try {
            ani aniVar = this.e;
            Map map = ani.a;
            boolean z = aniVar.b;
            aniVar.a(false);
            super.close();
            this.g.a = null;
            this.f = false;
        } finally {
            this.e.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.d && this.b.a != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            a(sQLiteDatabase);
        } catch (Throwable th) {
            throw new amu(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            amk amkVar = this.b;
            ana anaVar = new ana(a(sQLiteDatabase));
            amh a = anaVar.a("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z = false;
                if (a.l()) {
                    if (a.b(0) == 0) {
                        z = true;
                    }
                }
                ajb ajbVar = amkVar.b;
                ixf.i(a, null);
                aka akaVar = ajbVar.b;
                akaVar.a(anaVar);
                if (!z) {
                    jxu g = akaVar.g(anaVar);
                    if (!g.a) {
                        throw new IllegalStateException("Pre-packaged database has an invalid schema: ".concat(String.valueOf(g.b)));
                    }
                }
                ajbVar.a(anaVar);
                akaVar.e();
                for (ajz ajzVar : ajbVar.c) {
                }
            } finally {
            }
        } catch (Throwable th) {
            throw new amu(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.d = true;
        try {
            this.b.b(a(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new amu(4, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039 A[Catch: all -> 0x00f8, TRY_LEAVE, TryCatch #3 {all -> 0x00f8, blocks: (B:7:0x000c, B:16:0x0034, B:18:0x0039, B:23:0x004b, B:25:0x0058, B:28:0x0061, B:29:0x007a, B:30:0x00c9, B:31:0x00d4, B:33:0x00da, B:35:0x00e6, B:43:0x007e, B:44:0x0081, B:45:0x0082, B:50:0x00b5, B:52:0x00bb, B:53:0x00c3, B:55:0x00eb, B:56:0x00f0, B:60:0x00b1, B:68:0x00f4, B:69:0x00f7, B:47:0x0087, B:49:0x0091, B:57:0x009a, B:58:0x00af, B:9:0x001f, B:11:0x0026, B:65:0x00f2, B:20:0x003f, B:22:0x0045, B:40:0x007c), top: B:6:0x000c, inners: #0, #1, #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da A[Catch: all -> 0x00f8, LOOP:0: B:31:0x00d4->B:33:0x00da, LOOP_END, TryCatch #3 {all -> 0x00f8, blocks: (B:7:0x000c, B:16:0x0034, B:18:0x0039, B:23:0x004b, B:25:0x0058, B:28:0x0061, B:29:0x007a, B:30:0x00c9, B:31:0x00d4, B:33:0x00da, B:35:0x00e6, B:43:0x007e, B:44:0x0081, B:45:0x0082, B:50:0x00b5, B:52:0x00bb, B:53:0x00c3, B:55:0x00eb, B:56:0x00f0, B:60:0x00b1, B:68:0x00f4, B:69:0x00f7, B:47:0x0087, B:49:0x0091, B:57:0x009a, B:58:0x00af, B:9:0x001f, B:11:0x0026, B:65:0x00f2, B:20:0x003f, B:22:0x0045, B:40:0x007c), top: B:6:0x000c, inners: #0, #1, #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082 A[Catch: all -> 0x00f8, TRY_LEAVE, TryCatch #3 {all -> 0x00f8, blocks: (B:7:0x000c, B:16:0x0034, B:18:0x0039, B:23:0x004b, B:25:0x0058, B:28:0x0061, B:29:0x007a, B:30:0x00c9, B:31:0x00d4, B:33:0x00da, B:35:0x00e6, B:43:0x007e, B:44:0x0081, B:45:0x0082, B:50:0x00b5, B:52:0x00bb, B:53:0x00c3, B:55:0x00eb, B:56:0x00f0, B:60:0x00b1, B:68:0x00f4, B:69:0x00f7, B:47:0x0087, B:49:0x0091, B:57:0x009a, B:58:0x00af, B:9:0x001f, B:11:0x0026, B:65:0x00f2, B:20:0x003f, B:22:0x0045, B:40:0x007c), top: B:6:0x000c, inners: #0, #1, #2, #4, #5 }] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        boolean z;
        Object X;
        aka akaVar;
        jxu g;
        Iterator it;
        sQLiteDatabase.getClass();
        if (!this.d) {
            try {
                amk amkVar = this.b;
                ams a = a(sQLiteDatabase);
                ajb ajbVar = amkVar.b;
                ana anaVar = new ana(a);
                amh a2 = anaVar.a("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
                try {
                    if (a2.l()) {
                        if (a2.b(0) != 0) {
                            z = true;
                            ixf.i(a2, null);
                            if (z) {
                                yj.o(anaVar, "BEGIN EXCLUSIVE TRANSACTION");
                                try {
                                    akaVar = ajbVar.b;
                                    g = akaVar.g(anaVar);
                                } catch (Throwable th) {
                                    X = ixc.X(th);
                                }
                                if (!g.a) {
                                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + ((String) g.b));
                                }
                                akaVar.f();
                                ajbVar.a(anaVar);
                                X = kow.a;
                                if (kon.b(X)) {
                                    yj.o(anaVar, "END TRANSACTION");
                                }
                                Throwable a3 = kon.a(X);
                                if (a3 != null) {
                                    yj.o(anaVar, "ROLLBACK TRANSACTION");
                                    throw a3;
                                }
                            } else {
                                a2 = anaVar.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                                try {
                                    String d = a2.l() ? a2.d(0) : null;
                                    ixf.i(a2, null);
                                    aka akaVar2 = ajbVar.b;
                                    String str = akaVar2.b;
                                    if (!ksp.b(str, d) && !ksp.b(akaVar2.c, d)) {
                                        throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + str + ", found: " + d);
                                    }
                                } finally {
                                }
                            }
                            ajbVar.b.c(anaVar);
                            it = ajbVar.c.iterator();
                            while (it.hasNext()) {
                                ((ajz) it.next()).a(anaVar.a);
                            }
                            amkVar.b.e = a;
                        }
                    }
                    z = false;
                    ixf.i(a2, null);
                    if (z) {
                    }
                    ajbVar.b.c(anaVar);
                    it = ajbVar.c.iterator();
                    while (it.hasNext()) {
                    }
                    amkVar.b.e = a;
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                throw new amu(5, th2);
            }
        }
        this.f = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.d = true;
        try {
            this.b.b(a(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new amu(3, th);
        }
    }
}
