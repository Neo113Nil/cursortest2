package s7;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o0 extends g0 {

    /* renamed from: s, reason: collision with root package name */
    public static final String[] f8892s = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};

    /* renamed from: i, reason: collision with root package name */
    public final l f8893i;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8894r;

    public o0(q1 q1Var) {
        super(q1Var);
        this.f8893i = new l(this, ((q1) this.f1478d).f8932d);
    }

    @Override // s7.g0
    public final boolean v() {
        return false;
    }

    public final void w() {
        int delete;
        q1 q1Var = (q1) this.f1478d;
        s();
        try {
            SQLiteDatabase y3 = y();
            if (y3 == null || (delete = y3.delete("messages", null, null)) <= 0) {
                return;
            }
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.B.b(Integer.valueOf(delete), "Reset local analytics data. records");
        } catch (SQLiteException e2) {
            v0 v0Var2 = q1Var.f8937t;
            q1.l(v0Var2);
            v0Var2.f9050t.b(e2, "Error resetting local analytics data. error");
        }
    }

    public final void x() {
        int i3;
        q1 q1Var = (q1) this.f1478d;
        s();
        if (!this.f8894r && q1Var.f8932d.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i10 = 5;
            while (i3 < 5) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase y3 = y();
                        if (y3 == null) {
                            this.f8894r = true;
                            return;
                        }
                        y3.beginTransaction();
                        y3.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        y3.setTransactionSuccessful();
                        y3.endTransaction();
                        y3.close();
                        return;
                    } catch (SQLiteException e2) {
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
                        v0 v0Var = q1Var.f8937t;
                        q1.l(v0Var);
                        v0Var.f9050t.b(e2, "Error deleting app launch break from local database");
                        this.f8894r = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i10);
                    i10 += 20;
                    i3 = 0 == 0 ? i3 + 1 : 0;
                    sQLiteDatabase.close();
                } catch (SQLiteFullException e9) {
                    v0 v0Var2 = q1Var.f8937t;
                    q1.l(v0Var2);
                    v0Var2.f9050t.b(e9, "Error deleting app launch break from local database");
                    this.f8894r = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                }
            }
            v0 v0Var3 = q1Var.f8937t;
            q1.l(v0Var3);
            v0Var3.f9053w.a("Error deleting app launch break from local database in reasonable time");
        }
    }

    public final SQLiteDatabase y() {
        if (this.f8894r) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f8893i.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f8894r = true;
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
    public final boolean z(int i3, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        boolean z10;
        boolean z11;
        Cursor cursor;
        q1 q1Var = (q1) this.f1478d;
        s();
        boolean z12 = false;
        z12 = false;
        if (!this.f8894r) {
            g gVar = q1Var.f8935r;
            v0 v0Var = q1Var.f8937t;
            d0 d0Var = e0.W0;
            Cursor cursor2 = null;
            r4 w6 = gVar.D(null, d0Var) ? q1Var.q().w(null) : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put(com.onesignal.inAppMessages.internal.display.impl.n.EVENT_TYPE_KEY, Integer.valueOf(i3));
            contentValues.put("entry", bArr);
            if (q1Var.f8935r.D(null, d0Var) && w6 != null) {
                contentValues.put("app_version", w6.f8978i);
                contentValues.put("app_version_int", Long.valueOf(w6.f8985x));
            }
            int i10 = 5;
            int i11 = 0;
            for (int i12 = 5; i11 < i12; i12 = 5) {
                try {
                    sQLiteDatabase = y();
                    if (sQLiteDatabase == null) {
                        this.f8894r = true;
                    } else {
                        try {
                            sQLiteDatabase.beginTransaction();
                            cursor = sQLiteDatabase.rawQuery("select count(1) from messages", null);
                            long j = 0;
                            if (cursor != null) {
                                try {
                                    try {
                                        if (cursor.moveToFirst()) {
                                            j = cursor.getLong(z12 ? 1 : 0);
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
                                    z10 = z12 ? 1 : 0;
                                    SystemClock.sleep(i10);
                                    i10 += 20;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i11++;
                                    z12 = z10;
                                } catch (SQLiteFullException e2) {
                                    e = e2;
                                    z10 = z12 ? 1 : 0;
                                    q1.l(v0Var);
                                    v0Var.f9050t.b(e, "Error writing entry; local database full");
                                    this.f8894r = true;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i11++;
                                    z12 = z10;
                                } catch (SQLiteException e9) {
                                    e = e9;
                                    z10 = z12 ? 1 : 0;
                                    z11 = true;
                                    if (sQLiteDatabase != null) {
                                    }
                                    q1.l(v0Var);
                                    v0Var.f9050t.b(e, "Error writing entry to local database");
                                    this.f8894r = z11;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i11++;
                                    z12 = z10;
                                }
                            }
                            if (j >= 100000) {
                                q1.l(v0Var);
                                v0Var.f9050t.a("Data loss, local db full");
                                long j3 = 100001 - j;
                                long delete = sQLiteDatabase.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j3)});
                                if (delete != j3) {
                                    q1.l(v0Var);
                                    t0 t0Var = v0Var.f9050t;
                                    z10 = z12 ? 1 : 0;
                                    try {
                                        try {
                                            z11 = true;
                                        } catch (SQLiteDatabaseLockedException unused2) {
                                            SystemClock.sleep(i10);
                                            i10 += 20;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabase == null) {
                                                i11++;
                                                z12 = z10;
                                            }
                                            sQLiteDatabase.close();
                                            i11++;
                                            z12 = z10;
                                        }
                                    } catch (SQLiteFullException e10) {
                                        e = e10;
                                        q1.l(v0Var);
                                        v0Var.f9050t.b(e, "Error writing entry; local database full");
                                        this.f8894r = true;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase == null) {
                                            i11++;
                                            z12 = z10;
                                        }
                                        sQLiteDatabase.close();
                                        i11++;
                                        z12 = z10;
                                    } catch (SQLiteException e11) {
                                        e = e11;
                                        z11 = true;
                                        if (sQLiteDatabase != null && sQLiteDatabase.inTransaction()) {
                                            sQLiteDatabase.endTransaction();
                                        }
                                        q1.l(v0Var);
                                        v0Var.f9050t.b(e, "Error writing entry to local database");
                                        this.f8894r = z11;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase == null) {
                                            i11++;
                                            z12 = z10;
                                        }
                                        sQLiteDatabase.close();
                                        i11++;
                                        z12 = z10;
                                    }
                                    try {
                                        t0Var.d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j3), Long.valueOf(delete), Long.valueOf(j3 - delete));
                                        sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                                        sQLiteDatabase.setTransactionSuccessful();
                                        sQLiteDatabase.endTransaction();
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        sQLiteDatabase.close();
                                        return z11;
                                    } catch (SQLiteFullException e12) {
                                        e = e12;
                                        q1.l(v0Var);
                                        v0Var.f9050t.b(e, "Error writing entry; local database full");
                                        this.f8894r = true;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i11++;
                                        z12 = z10;
                                    } catch (SQLiteException e13) {
                                        e = e13;
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.endTransaction();
                                        }
                                        q1.l(v0Var);
                                        v0Var.f9050t.b(e, "Error writing entry to local database");
                                        this.f8894r = z11;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i11++;
                                        z12 = z10;
                                    }
                                }
                            }
                            z10 = z12 ? 1 : 0;
                            z11 = true;
                            sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                            sQLiteDatabase.setTransactionSuccessful();
                            sQLiteDatabase.endTransaction();
                            if (cursor != null) {
                            }
                            sQLiteDatabase.close();
                            return z11;
                        } catch (SQLiteDatabaseLockedException unused3) {
                            z10 = z12 ? 1 : 0;
                            cursor = null;
                        } catch (SQLiteFullException e14) {
                            e = e14;
                            z10 = z12 ? 1 : 0;
                            cursor = null;
                        } catch (SQLiteException e15) {
                            e = e15;
                            z10 = z12 ? 1 : 0;
                            z11 = true;
                            cursor = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused4) {
                    z10 = z12 ? 1 : 0;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (SQLiteFullException e16) {
                    e = e16;
                    z10 = z12 ? 1 : 0;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (SQLiteException e17) {
                    e = e17;
                    z10 = z12 ? 1 : 0;
                    z11 = true;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteDatabase = null;
                }
            }
            boolean z13 = z12 ? 1 : 0;
            q1.l(v0Var);
            v0Var.B.a("Failed to write entry to local database");
            return z13;
        }
        return z12;
    }
}
