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

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class vd0 extends SQLiteOpenHelper {
    public static final ud0 Companion = new ud0();
    public final i2 OPXfSBeufaJ8;
    public boolean cpQdD2nAriOS;
    public boolean dgRBjINgWbAK;
    public final Context rtx2ld2ELZv4;
    public final qb2 wdg6QnbFHrFF;
    public final lq1 x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd0(Context context, String str, final i2 i2Var, final qb2 qb2Var) {
        super(context, str, null, qb2Var.PxuCJdSBwIXG, new DatabaseErrorHandler() { // from class: rd0
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                ud0 ud0Var = vd0.Companion;
                sQLiteDatabase.getClass();
                ud0Var.getClass();
                i2 i2Var2 = i2Var;
                pd0 pd0Var = (pd0) i2Var2.OPXfSBeufaJ8;
                if (pd0Var == null || !pd0Var.rtx2ld2ELZv4.equals(sQLiteDatabase)) {
                    pd0Var = new pd0(sQLiteDatabase);
                    i2Var2.OPXfSBeufaJ8 = pd0Var;
                }
                SQLiteDatabase sQLiteDatabase2 = pd0Var.rtx2ld2ELZv4;
                qb2.this.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + pd0Var + ".path");
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        qb2.PxuCJdSBwIXG(path);
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
                                qb2.PxuCJdSBwIXG((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                qb2.PxuCJdSBwIXG(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    pd0Var.close();
                } catch (IOException unused2) {
                }
                if (list != null) {
                    return;
                }
            }
        });
        String str2;
        qb2Var.getClass();
        this.rtx2ld2ELZv4 = context;
        this.OPXfSBeufaJ8 = i2Var;
        this.wdg6QnbFHrFF = qb2Var;
        if (str == null) {
            str2 = UUID.randomUUID().toString();
            str2.getClass();
        } else {
            str2 = str;
        }
        this.x50lh2ztY7Y5 = new lq1(str2, context.getCacheDir(), false);
    }

    public final SQLiteDatabase OPXfSBeufaJ8(boolean z) {
        SQLiteDatabase readableDatabase;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.cpQdD2nAriOS;
        if (databaseName != null && !z2 && (parentFile = this.rtx2ld2ELZv4.getDatabasePath(databaseName).getParentFile()) != null) {
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
                if (th instanceof sd0) {
                    sd0 sd0Var = (sd0) th;
                    int ordinal = sd0Var.rtx2ld2ELZv4.ordinal();
                    th = sd0Var.OPXfSBeufaJ8;
                    if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                        throw th;
                    }
                    if (ordinal != 4) {
                        u9.gPXPFXrUH4XX();
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

    public final pd0 a92UlCVFR9N8(SQLiteDatabase sQLiteDatabase) {
        Companion.getClass();
        i2 i2Var = this.OPXfSBeufaJ8;
        i2Var.getClass();
        pd0 pd0Var = (pd0) i2Var.OPXfSBeufaJ8;
        if (pd0Var != null && pd0Var.rtx2ld2ELZv4.equals(sQLiteDatabase)) {
            return pd0Var;
        }
        pd0 pd0Var2 = new pd0(sQLiteDatabase);
        i2Var.OPXfSBeufaJ8 = pd0Var2;
        return pd0Var2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        lq1 lq1Var = this.x50lh2ztY7Y5;
        try {
            lq1Var.PxuCJdSBwIXG(lq1Var.PxuCJdSBwIXG);
            super.close();
            this.OPXfSBeufaJ8.OPXfSBeufaJ8 = null;
            this.cpQdD2nAriOS = false;
        } finally {
            lq1Var.lS5Rgt96tfkO();
        }
    }

    public final pd0 lS5Rgt96tfkO(boolean z) {
        lq1 lq1Var = this.x50lh2ztY7Y5;
        try {
            lq1Var.PxuCJdSBwIXG((this.cpQdD2nAriOS || getDatabaseName() == null) ? false : true);
            this.dgRBjINgWbAK = false;
            SQLiteDatabase OPXfSBeufaJ8 = OPXfSBeufaJ8(z);
            if (!this.dgRBjINgWbAK) {
                pd0 a92UlCVFR9N8 = a92UlCVFR9N8(OPXfSBeufaJ8);
                lq1Var.lS5Rgt96tfkO();
                return a92UlCVFR9N8;
            }
            close();
            pd0 lS5Rgt96tfkO = lS5Rgt96tfkO(z);
            lq1Var.lS5Rgt96tfkO();
            return lS5Rgt96tfkO;
        } catch (Throwable th) {
            lq1Var.lS5Rgt96tfkO();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        boolean z = this.dgRBjINgWbAK;
        qb2 qb2Var = this.wdg6QnbFHrFF;
        if (!z && qb2Var.PxuCJdSBwIXG != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            a92UlCVFR9N8(sQLiteDatabase);
            qb2Var.getClass();
        } catch (Throwable th) {
            throw new sd0(td0.rtx2ld2ELZv4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            this.wdg6QnbFHrFF.lS5Rgt96tfkO(a92UlCVFR9N8(sQLiteDatabase));
        } catch (Throwable th) {
            throw new sd0(td0.OPXfSBeufaJ8, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.dgRBjINgWbAK = true;
        try {
            this.wdg6QnbFHrFF.TSizfFm2Yiuu(a92UlCVFR9N8(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new sd0(td0.dgRBjINgWbAK, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.dgRBjINgWbAK) {
            try {
                this.wdg6QnbFHrFF.Y1f8riQaR6yg(a92UlCVFR9N8(sQLiteDatabase));
            } catch (Throwable th) {
                throw new sd0(td0.x50lh2ztY7Y5, th);
            }
        }
        this.cpQdD2nAriOS = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.dgRBjINgWbAK = true;
        try {
            this.wdg6QnbFHrFF.e9gEMXR7LXtO(a92UlCVFR9N8(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new sd0(td0.wdg6QnbFHrFF, th);
        }
    }
}
