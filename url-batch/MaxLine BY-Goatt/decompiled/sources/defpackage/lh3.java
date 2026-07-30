package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lh3 extends xg3 {
    public static final String[] q = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};
    public final rc3 o;
    public boolean p;

    public lh3(pj3 pj3Var) {
        super(pj3Var);
        this.o = new rc3(this, ((pj3) this.m).m);
    }

    public final void A() {
        int delete;
        pj3 pj3Var = (pj3) this.m;
        v();
        try {
            SQLiteDatabase C = C();
            if (C == null || (delete = C.delete("messages", null, null)) <= 0) {
                return;
            }
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.z.c(Integer.valueOf(delete), "Reset local analytics data. records");
        } catch (SQLiteException e) {
            vh3 vh3Var2 = pj3Var.r;
            pj3.m(vh3Var2);
            vh3Var2.r.c(e, "Error resetting local analytics data. error");
        }
    }

    public final boolean B() {
        pj3 pj3Var = (pj3) this.m;
        v();
        if (!this.p && pj3Var.m.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i = 5;
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    vh3 vh3Var = pj3Var.r;
                    pj3.m(vh3Var);
                    vh3Var.u.b("Error deleting app launch break from local database in reasonable time");
                    break;
                }
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase C = C();
                        if (C != null) {
                            C.beginTransaction();
                            C.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                            C.setTransactionSuccessful();
                            C.endTransaction();
                            C.close();
                            return true;
                        }
                        this.p = true;
                    } catch (SQLiteException e) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        }
                        vh3 vh3Var2 = pj3Var.r;
                        pj3.m(vh3Var2);
                        vh3Var2.r.c(e, "Error deleting app launch break from local database");
                        this.p = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i);
                    i += 20;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                } catch (SQLiteFullException e2) {
                    vh3 vh3Var3 = pj3Var.r;
                    pj3.m(vh3Var3);
                    vh3Var3.r.c(e2, "Error deleting app launch break from local database");
                    this.p = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                }
                i2++;
            }
        }
        return false;
    }

    public final SQLiteDatabase C() {
        if (this.p) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.o.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.p = true;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0120 A[Catch: all -> 0x0154, TRY_ENTER, TryCatch #10 {all -> 0x0154, blocks: (B:95:0x0088, B:97:0x008e, B:65:0x00ae, B:67:0x00cf, B:70:0x00d8, B:73:0x00de, B:74:0x00f8, B:42:0x0120, B:44:0x0126, B:45:0x0129, B:33:0x015b, B:21:0x0144), top: B:94:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D(int i, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        boolean z;
        boolean z2;
        Cursor cursor;
        pj3 pj3Var = (pj3) this.m;
        v();
        boolean z3 = false;
        z3 = false;
        if (!this.p) {
            ec3 ec3Var = pj3Var.p;
            vh3 vh3Var = pj3Var.r;
            tg3 tg3Var = ug3.b1;
            Cursor cursor2 = null;
            cs3 A = ec3Var.G(null, tg3Var) ? pj3Var.r().A(null) : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i));
            contentValues.put("entry", bArr);
            if (pj3Var.p.G(null, tg3Var) && A != null) {
                contentValues.put("app_version", A.o);
                contentValues.put("app_version_int", Long.valueOf(A.v));
            }
            int i2 = 5;
            int i3 = 0;
            for (int i4 = 5; i3 < i4; i4 = 5) {
                try {
                    sQLiteDatabase = C();
                    if (sQLiteDatabase == null) {
                        this.p = true;
                    } else {
                        try {
                            sQLiteDatabase.beginTransaction();
                            cursor = sQLiteDatabase.rawQuery("select count(1) from messages", null);
                            long j = 0;
                            if (cursor != null) {
                                try {
                                    try {
                                        if (cursor.moveToFirst()) {
                                            j = cursor.getLong(z3 ? 1 : 0);
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor2 = cursor;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteDatabaseLockedException unused) {
                                    z = z3 ? 1 : 0;
                                    SystemClock.sleep(i2);
                                    i2 += 20;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i3++;
                                    z3 = z;
                                } catch (SQLiteFullException e) {
                                    e = e;
                                    z = z3 ? 1 : 0;
                                    pj3.m(vh3Var);
                                    vh3Var.r.c(e, "Error writing entry; local database full");
                                    this.p = true;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i3++;
                                    z3 = z;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    z = z3 ? 1 : 0;
                                    z2 = true;
                                    if (sQLiteDatabase != null) {
                                    }
                                    pj3.m(vh3Var);
                                    vh3Var.r.c(e, "Error writing entry to local database");
                                    this.p = z2;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i3++;
                                    z3 = z;
                                }
                            }
                            if (j >= 100000) {
                                pj3.m(vh3Var);
                                vh3Var.r.b("Data loss, local db full");
                                long j2 = 100001 - j;
                                long delete = sQLiteDatabase.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j2)});
                                if (delete != j2) {
                                    pj3.m(vh3Var);
                                    g10 g10Var = vh3Var.r;
                                    z = z3 ? 1 : 0;
                                    try {
                                        try {
                                            z2 = true;
                                        } catch (SQLiteDatabaseLockedException unused2) {
                                            SystemClock.sleep(i2);
                                            i2 += 20;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabase == null) {
                                                i3++;
                                                z3 = z;
                                            }
                                            sQLiteDatabase.close();
                                            i3++;
                                            z3 = z;
                                        }
                                    } catch (SQLiteFullException e3) {
                                        e = e3;
                                        pj3.m(vh3Var);
                                        vh3Var.r.c(e, "Error writing entry; local database full");
                                        this.p = true;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase == null) {
                                            i3++;
                                            z3 = z;
                                        }
                                        sQLiteDatabase.close();
                                        i3++;
                                        z3 = z;
                                    } catch (SQLiteException e4) {
                                        e = e4;
                                        z2 = true;
                                        if (sQLiteDatabase != null && sQLiteDatabase.inTransaction()) {
                                            sQLiteDatabase.endTransaction();
                                        }
                                        pj3.m(vh3Var);
                                        vh3Var.r.c(e, "Error writing entry to local database");
                                        this.p = z2;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase == null) {
                                            i3++;
                                            z3 = z;
                                        }
                                        sQLiteDatabase.close();
                                        i3++;
                                        z3 = z;
                                    }
                                    try {
                                        g10Var.e("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(delete), Long.valueOf(j2 - delete));
                                        sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                                        sQLiteDatabase.setTransactionSuccessful();
                                        sQLiteDatabase.endTransaction();
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        sQLiteDatabase.close();
                                        return z2;
                                    } catch (SQLiteFullException e5) {
                                        e = e5;
                                        pj3.m(vh3Var);
                                        vh3Var.r.c(e, "Error writing entry; local database full");
                                        this.p = true;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i3++;
                                        z3 = z;
                                    } catch (SQLiteException e6) {
                                        e = e6;
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.endTransaction();
                                        }
                                        pj3.m(vh3Var);
                                        vh3Var.r.c(e, "Error writing entry to local database");
                                        this.p = z2;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i3++;
                                        z3 = z;
                                    }
                                }
                            }
                            z = z3 ? 1 : 0;
                            z2 = true;
                            sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                            sQLiteDatabase.setTransactionSuccessful();
                            sQLiteDatabase.endTransaction();
                            if (cursor != null) {
                            }
                            sQLiteDatabase.close();
                            return z2;
                        } catch (SQLiteDatabaseLockedException unused3) {
                            z = z3 ? 1 : 0;
                            cursor = null;
                        } catch (SQLiteFullException e7) {
                            e = e7;
                            z = z3 ? 1 : 0;
                            cursor = null;
                        } catch (SQLiteException e8) {
                            e = e8;
                            z = z3 ? 1 : 0;
                            z2 = true;
                            cursor = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused4) {
                    z = z3 ? 1 : 0;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (SQLiteFullException e9) {
                    e = e9;
                    z = z3 ? 1 : 0;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (SQLiteException e10) {
                    e = e10;
                    z = z3 ? 1 : 0;
                    z2 = true;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteDatabase = null;
                }
            }
            boolean z4 = z3 ? 1 : 0;
            pj3.m(vh3Var);
            vh3Var.z.b("Failed to write entry to local database");
            return z4;
        }
        return z3;
    }

    @Override // defpackage.xg3
    public final boolean z() {
        return false;
    }
}
