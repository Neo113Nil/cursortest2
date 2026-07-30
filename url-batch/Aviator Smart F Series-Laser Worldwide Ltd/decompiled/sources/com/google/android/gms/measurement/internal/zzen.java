package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import androidx.annotation.WorkerThread;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzen extends zzf {
    private final zzem zza;
    private boolean zzb;

    zzen(zzge zzgeVar) {
        super(zzgeVar);
        Context zzaw = this.zzt.zzaw();
        this.zzt.zzf();
        this.zza = new zzem(this, zzaw, "google_app_measurement_local.db");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0132  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v10, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzq(int i8, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        ?? r10;
        Cursor cursor;
        zzg();
        ?? r22 = 0;
        if (this.zzb) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(i8));
        contentValues.put("entry", bArr);
        this.zzt.zzf();
        int i9 = 0;
        int i10 = 5;
        for (int i11 = 5; i9 < i11; i11 = 5) {
            Cursor cursor2 = null;
            cursor2 = null;
            cursor2 = null;
            r8 = null;
            SQLiteDatabase sQLiteDatabase2 = null;
            try {
                sQLiteDatabase = zzh();
                try {
                    if (sQLiteDatabase == null) {
                        this.zzb = true;
                        return r22;
                    }
                    sQLiteDatabase.beginTransaction();
                    r10 = sQLiteDatabase.rawQuery("select count(1) from messages", null);
                    long j8 = 0;
                    if (r10 != 0) {
                        try {
                            if (r10.moveToFirst()) {
                                j8 = r10.getLong(r22);
                            }
                        } catch (SQLiteDatabaseLockedException unused) {
                            cursor2 = r10;
                            try {
                                SystemClock.sleep(i10);
                                i10 += 20;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.close();
                                }
                                i9++;
                                r22 = 0;
                            } catch (Throwable th) {
                                th = th;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteFullException e8) {
                            e = e8;
                            sQLiteDatabase2 = sQLiteDatabase;
                            cursor = r10;
                            this.zzt.zzaA().zzd().zzb("Error writing entry; local database full", e);
                            this.zzb = true;
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (sQLiteDatabase2 == null) {
                                i9++;
                                r22 = 0;
                            }
                            sQLiteDatabase2.close();
                            i9++;
                            r22 = 0;
                        } catch (SQLiteException e9) {
                            e = e9;
                            sQLiteDatabase2 = sQLiteDatabase;
                            r10 = r10;
                            if (sQLiteDatabase2 != null) {
                                try {
                                    if (sQLiteDatabase2.inTransaction()) {
                                        sQLiteDatabase2.endTransaction();
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    cursor2 = r10;
                                    if (cursor2 != null) {
                                    }
                                    if (sQLiteDatabase != null) {
                                    }
                                    throw th;
                                }
                            }
                            this.zzt.zzaA().zzd().zzb("Error writing entry to local database", e);
                            this.zzb = true;
                            if (r10 != 0) {
                                r10.close();
                            }
                            if (sQLiteDatabase2 == null) {
                                i9++;
                                r22 = 0;
                            }
                            sQLiteDatabase2.close();
                            i9++;
                            r22 = 0;
                        } catch (Throwable th3) {
                            th = th3;
                            cursor2 = r10;
                            if (cursor2 != null) {
                            }
                            if (sQLiteDatabase != null) {
                            }
                            throw th;
                        }
                    }
                    if (j8 >= 100000) {
                        this.zzt.zzaA().zzd().zza("Data loss, local db full");
                        String[] strArr = new String[1];
                        long j9 = 100001 - j8;
                        strArr[r22] = Long.toString(j9);
                        long delete = sQLiteDatabase.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", strArr);
                        if (delete != j9) {
                            this.zzt.zzaA().zzd().zzd("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j9), Long.valueOf(delete), Long.valueOf(j9 - delete));
                        }
                    }
                    sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                    if (r10 != 0) {
                        r10.close();
                    }
                    sQLiteDatabase.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused2) {
                } catch (SQLiteFullException e10) {
                    e = e10;
                    r10 = 0;
                } catch (SQLiteException e11) {
                    e = e11;
                    r10 = 0;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                sQLiteDatabase = null;
            } catch (SQLiteFullException e12) {
                e = e12;
                cursor = null;
            } catch (SQLiteException e13) {
                e = e13;
                r10 = 0;
            } catch (Throwable th4) {
                th = th4;
                sQLiteDatabase = null;
                if (cursor2 != null) {
                }
                if (sQLiteDatabase != null) {
                }
                throw th;
            }
        }
        this.zzt.zzaA().zzj().zza("Failed to write entry to local database");
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzf() {
        return false;
    }

    @VisibleForTesting
    @WorkerThread
    final SQLiteDatabase zzh() {
        if (this.zzb) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zza.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.zzb = true;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:202:0x01fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x026a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x026a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x026a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0218 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0276  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzi(int i8) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursor2;
        long j8;
        String str;
        String[] strArr;
        Parcel obtain;
        zzlj zzljVar;
        zzac zzacVar;
        zzg();
        Cursor cursor3 = null;
        if (this.zzb) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!zzl()) {
            return arrayList;
        }
        int i9 = 0;
        int i10 = 5;
        for (int i11 = 5; i9 < i11; i11 = 5) {
            try {
                SQLiteDatabase zzh = zzh();
                if (zzh == null) {
                    this.zzb = true;
                    return null;
                }
                try {
                    zzh.beginTransaction();
                    try {
                        try {
                            cursor2 = zzh.query("messages", new String[]{"rowid"}, "type=?", new String[]{ExifInterface.GPS_MEASUREMENT_3D}, null, null, "rowid desc", "1");
                        } catch (Throwable th) {
                            th = th;
                            sQLiteDatabase2 = zzh;
                            cursor2 = null;
                            if (cursor2 != null) {
                                try {
                                    cursor2.close();
                                } catch (SQLiteDatabaseLockedException unused) {
                                    cursor = null;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    SystemClock.sleep(i10);
                                    i10 += 20;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i9++;
                                } catch (SQLiteFullException e8) {
                                    e = e8;
                                    cursor = null;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    this.zzt.zzaA().zzd().zzb("Error reading entries from local database", e);
                                    this.zzb = true;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i9++;
                                } catch (SQLiteException e9) {
                                    e = e9;
                                    cursor = null;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    if (sQLiteDatabase != null) {
                                    }
                                    this.zzt.zzaA().zzd().zzb("Error reading entries from local database", e);
                                    this.zzb = true;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i9++;
                                } catch (Throwable th2) {
                                    th = th2;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    if (cursor3 != null) {
                                    }
                                    if (sQLiteDatabase != null) {
                                    }
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        sQLiteDatabase2 = zzh;
                    }
                    try {
                        long j9 = -1;
                        if (cursor2.moveToFirst()) {
                            j8 = cursor2.getLong(0);
                            try {
                                cursor2.close();
                            } catch (SQLiteDatabaseLockedException unused2) {
                                sQLiteDatabase2 = zzh;
                                cursor = null;
                                sQLiteDatabase = sQLiteDatabase2;
                                SystemClock.sleep(i10);
                                i10 += 20;
                                if (cursor != null) {
                                }
                                if (sQLiteDatabase == null) {
                                }
                                sQLiteDatabase.close();
                                i9++;
                            } catch (SQLiteFullException e10) {
                                e = e10;
                                sQLiteDatabase2 = zzh;
                                cursor = null;
                                sQLiteDatabase = sQLiteDatabase2;
                                this.zzt.zzaA().zzd().zzb("Error reading entries from local database", e);
                                this.zzb = true;
                                if (cursor != null) {
                                }
                                if (sQLiteDatabase == null) {
                                }
                                sQLiteDatabase.close();
                                i9++;
                            } catch (SQLiteException e11) {
                                e = e11;
                                sQLiteDatabase2 = zzh;
                                cursor = null;
                                sQLiteDatabase = sQLiteDatabase2;
                                if (sQLiteDatabase != null) {
                                }
                                this.zzt.zzaA().zzd().zzb("Error reading entries from local database", e);
                                this.zzb = true;
                                if (cursor != null) {
                                }
                                if (sQLiteDatabase == null) {
                                }
                                sQLiteDatabase.close();
                                i9++;
                            } catch (Throwable th4) {
                                th = th4;
                                sQLiteDatabase2 = zzh;
                                sQLiteDatabase = sQLiteDatabase2;
                                if (cursor3 != null) {
                                }
                                if (sQLiteDatabase != null) {
                                }
                                throw th;
                            }
                        } else {
                            cursor2.close();
                            j8 = -1;
                        }
                        if (j8 != -1) {
                            str = "rowid<?";
                            strArr = new String[]{String.valueOf(j8)};
                        } else {
                            str = null;
                            strArr = null;
                        }
                        cursor = zzh.query("messages", new String[]{"rowid", "type", "entry"}, str, strArr, null, null, "rowid asc", Integer.toString(100));
                        while (cursor.moveToNext()) {
                            try {
                                j9 = cursor.getLong(0);
                                int i12 = cursor.getInt(1);
                                byte[] blob = cursor.getBlob(2);
                                if (i12 == 0) {
                                    obtain = Parcel.obtain();
                                    try {
                                        try {
                                            obtain.unmarshall(blob, 0, blob.length);
                                            obtain.setDataPosition(0);
                                            zzaw createFromParcel = zzaw.CREATOR.createFromParcel(obtain);
                                            if (createFromParcel != null) {
                                                arrayList.add(createFromParcel);
                                            }
                                        } finally {
                                        }
                                    } catch (SafeParcelReader.ParseException unused3) {
                                        this.zzt.zzaA().zzd().zza("Failed to load event from local database");
                                        obtain.recycle();
                                    }
                                } else if (i12 == 1) {
                                    obtain = Parcel.obtain();
                                    try {
                                        try {
                                            obtain.unmarshall(blob, 0, blob.length);
                                            obtain.setDataPosition(0);
                                            zzljVar = zzlj.CREATOR.createFromParcel(obtain);
                                        } finally {
                                        }
                                    } catch (SafeParcelReader.ParseException unused4) {
                                        this.zzt.zzaA().zzd().zza("Failed to load user property from local database");
                                        obtain.recycle();
                                        zzljVar = null;
                                    }
                                    if (zzljVar != null) {
                                        arrayList.add(zzljVar);
                                    }
                                } else if (i12 == 2) {
                                    obtain = Parcel.obtain();
                                    try {
                                        try {
                                            obtain.unmarshall(blob, 0, blob.length);
                                            obtain.setDataPosition(0);
                                            zzacVar = zzac.CREATOR.createFromParcel(obtain);
                                        } finally {
                                        }
                                    } catch (SafeParcelReader.ParseException unused5) {
                                        this.zzt.zzaA().zzd().zza("Failed to load conditional user property from local database");
                                        obtain.recycle();
                                        zzacVar = null;
                                    }
                                    if (zzacVar != null) {
                                        arrayList.add(zzacVar);
                                    }
                                } else if (i12 == 3) {
                                    this.zzt.zzaA().zzk().zza("Skipping app launch break");
                                } else {
                                    this.zzt.zzaA().zzd().zza("Unknown record type in local database");
                                }
                            } catch (SQLiteDatabaseLockedException unused6) {
                                sQLiteDatabase2 = zzh;
                                sQLiteDatabase = sQLiteDatabase2;
                                SystemClock.sleep(i10);
                                i10 += 20;
                                if (cursor != null) {
                                }
                                if (sQLiteDatabase == null) {
                                }
                                sQLiteDatabase.close();
                                i9++;
                            } catch (SQLiteFullException e12) {
                                e = e12;
                                sQLiteDatabase2 = zzh;
                                sQLiteDatabase = sQLiteDatabase2;
                                this.zzt.zzaA().zzd().zzb("Error reading entries from local database", e);
                                this.zzb = true;
                                if (cursor != null) {
                                }
                                if (sQLiteDatabase == null) {
                                }
                                sQLiteDatabase.close();
                                i9++;
                            } catch (SQLiteException e13) {
                                e = e13;
                                sQLiteDatabase2 = zzh;
                                sQLiteDatabase = sQLiteDatabase2;
                                if (sQLiteDatabase != null) {
                                }
                                this.zzt.zzaA().zzd().zzb("Error reading entries from local database", e);
                                this.zzb = true;
                                if (cursor != null) {
                                }
                                if (sQLiteDatabase == null) {
                                }
                                sQLiteDatabase.close();
                                i9++;
                            } catch (Throwable th5) {
                                th = th5;
                                sQLiteDatabase2 = zzh;
                                cursor3 = cursor;
                                sQLiteDatabase = sQLiteDatabase2;
                                if (cursor3 != null) {
                                }
                                if (sQLiteDatabase != null) {
                                }
                                throw th;
                            }
                        }
                        sQLiteDatabase2 = zzh;
                        try {
                            if (sQLiteDatabase2.delete("messages", "rowid <= ?", new String[]{Long.toString(j9)}) < arrayList.size()) {
                                this.zzt.zzaA().zzd().zza("Fewer entries removed from local database than expected");
                            }
                            sQLiteDatabase2.setTransactionSuccessful();
                            sQLiteDatabase2.endTransaction();
                            cursor.close();
                            sQLiteDatabase2.close();
                            return arrayList;
                        } catch (SQLiteDatabaseLockedException unused7) {
                            sQLiteDatabase = sQLiteDatabase2;
                            SystemClock.sleep(i10);
                            i10 += 20;
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (sQLiteDatabase == null) {
                                i9++;
                            }
                            sQLiteDatabase.close();
                            i9++;
                        } catch (SQLiteFullException e14) {
                            e = e14;
                            sQLiteDatabase = sQLiteDatabase2;
                            this.zzt.zzaA().zzd().zzb("Error reading entries from local database", e);
                            this.zzb = true;
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (sQLiteDatabase == null) {
                                i9++;
                            }
                            sQLiteDatabase.close();
                            i9++;
                        } catch (SQLiteException e15) {
                            e = e15;
                            sQLiteDatabase = sQLiteDatabase2;
                            if (sQLiteDatabase != null) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    cursor3 = cursor;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.close();
                                    }
                                    throw th;
                                }
                            }
                            this.zzt.zzaA().zzd().zzb("Error reading entries from local database", e);
                            this.zzb = true;
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (sQLiteDatabase == null) {
                                i9++;
                            }
                            sQLiteDatabase.close();
                            i9++;
                        } catch (Throwable th7) {
                            th = th7;
                            cursor3 = cursor;
                            sQLiteDatabase = sQLiteDatabase2;
                            if (cursor3 != null) {
                            }
                            if (sQLiteDatabase != null) {
                            }
                            throw th;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        sQLiteDatabase2 = zzh;
                        if (cursor2 != null) {
                        }
                        throw th;
                    }
                } catch (SQLiteDatabaseLockedException unused8) {
                    sQLiteDatabase2 = zzh;
                } catch (SQLiteFullException e16) {
                    e = e16;
                    sQLiteDatabase2 = zzh;
                } catch (SQLiteException e17) {
                    e = e17;
                    sQLiteDatabase2 = zzh;
                } catch (Throwable th9) {
                    th = th9;
                    sQLiteDatabase2 = zzh;
                }
            } catch (SQLiteDatabaseLockedException unused9) {
                cursor = null;
                sQLiteDatabase = null;
            } catch (SQLiteFullException e18) {
                e = e18;
                cursor = null;
                sQLiteDatabase = null;
            } catch (SQLiteException e19) {
                e = e19;
                cursor = null;
                sQLiteDatabase = null;
            } catch (Throwable th10) {
                th = th10;
                sQLiteDatabase = null;
            }
        }
        this.zzt.zzaA().zzk().zza("Failed to read events from database in reasonable time");
        return null;
    }

    @WorkerThread
    public final void zzj() {
        int delete;
        zzg();
        try {
            SQLiteDatabase zzh = zzh();
            if (zzh == null || (delete = zzh.delete("messages", null, null)) <= 0) {
                return;
            }
            this.zzt.zzaA().zzj().zzb("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e8) {
            this.zzt.zzaA().zzd().zzb("Error resetting local analytics data. error", e8);
        }
    }

    @WorkerThread
    public final boolean zzk() {
        return zzq(3, new byte[0]);
    }

    @VisibleForTesting
    final boolean zzl() {
        Context zzaw = this.zzt.zzaw();
        this.zzt.zzf();
        return zzaw.getDatabasePath("google_app_measurement_local.db").exists();
    }

    @WorkerThread
    public final boolean zzm() {
        int i8;
        zzg();
        if (!this.zzb && zzl()) {
            int i9 = 5;
            while (i8 < 5) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        try {
                            SQLiteDatabase zzh = zzh();
                            if (zzh == null) {
                                this.zzb = true;
                                return false;
                            }
                            zzh.beginTransaction();
                            zzh.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                            zzh.setTransactionSuccessful();
                            zzh.endTransaction();
                            zzh.close();
                            return true;
                        } catch (SQLiteException e8) {
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
                            this.zzt.zzaA().zzd().zzb("Error deleting app launch break from local database", e8);
                            this.zzb = true;
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                        }
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i9);
                        i9 += 20;
                        i8 = 0 == 0 ? i8 + 1 : 0;
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteFullException e9) {
                    this.zzt.zzaA().zzd().zzb("Error deleting app launch break from local database", e9);
                    this.zzb = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                }
            }
            this.zzt.zzaA().zzk().zza("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    public final boolean zzn(zzac zzacVar) {
        byte[] zzap = this.zzt.zzv().zzap(zzacVar);
        if (zzap.length <= 131072) {
            return zzq(2, zzap);
        }
        this.zzt.zzaA().zzh().zza("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzo(zzaw zzawVar) {
        Parcel obtain = Parcel.obtain();
        zzax.zza(zzawVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return zzq(0, marshall);
        }
        this.zzt.zzaA().zzh().zza("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean zzp(zzlj zzljVar) {
        Parcel obtain = Parcel.obtain();
        zzlk.zza(zzljVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return zzq(1, marshall);
        }
        this.zzt.zzaA().zzh().zza("User property too long for local database. Sending directly to service");
        return false;
    }
}
