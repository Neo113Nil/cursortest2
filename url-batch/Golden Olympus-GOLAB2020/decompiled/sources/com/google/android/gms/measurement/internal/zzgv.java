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
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzgv extends zzg {
    private static final String[] zza = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};
    private final zzgt zzb;
    private boolean zzc;

    zzgv(zzio zzioVar) {
        super(zzioVar);
        Context zzaT = this.zzu.zzaT();
        this.zzu.zzf();
        this.zzb = new zzgt(this, zzaT, "google_app_measurement_local.db");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012e A[Catch: all -> 0x0098, TRY_ENTER, TryCatch #11 {all -> 0x0098, blocks: (B:95:0x008d, B:97:0x0093, B:65:0x00b6, B:67:0x00da, B:70:0x00e4, B:73:0x00ec, B:74:0x0106, B:42:0x012e, B:44:0x0134, B:45:0x0137, B:33:0x016c, B:21:0x0157), top: B:94:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzs(int i4, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        boolean z4;
        boolean z5;
        Cursor cursor;
        zzg();
        boolean z6 = false;
        z6 = false;
        if (!this.zzc) {
            zzio zzioVar = this.zzu;
            zzam zzf = zzioVar.zzf();
            zzgg zzggVar = zzgi.zzbl;
            Cursor cursor2 = null;
            zzr zzk = zzf.zzx(null, zzggVar) ? this.zzu.zzh().zzk(null) : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i4));
            contentValues.put("entry", bArr);
            if (zzioVar.zzf().zzx(null, zzggVar) && zzk != null) {
                contentValues.put("app_version", zzk.zzc);
                contentValues.put("app_version_int", Long.valueOf(zzk.zzj));
            }
            zzioVar.zzf();
            int i5 = 0;
            int i6 = 5;
            for (int i7 = 5; i5 < i7; i7 = 5) {
                try {
                    sQLiteDatabase = zzh();
                    if (sQLiteDatabase == null) {
                        this.zzc = true;
                    } else {
                        try {
                            sQLiteDatabase.beginTransaction();
                            cursor = sQLiteDatabase.rawQuery("select count(1) from messages", null);
                            long j4 = 0;
                            if (cursor != null) {
                                try {
                                    try {
                                        if (cursor.moveToFirst()) {
                                            j4 = cursor.getLong(z6 ? 1 : 0);
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
                                    z4 = z6 ? 1 : 0;
                                    SystemClock.sleep(i6);
                                    i6 += 20;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i5++;
                                    z6 = z4;
                                } catch (SQLiteFullException e4) {
                                    e = e4;
                                    z4 = z6 ? 1 : 0;
                                    this.zzu.zzaW().zze().zzb("Error writing entry; local database full", e);
                                    this.zzc = true;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i5++;
                                    z6 = z4;
                                } catch (SQLiteException e5) {
                                    e = e5;
                                    z4 = z6 ? 1 : 0;
                                    z5 = true;
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                    this.zzu.zzaW().zze().zzb("Error writing entry to local database", e);
                                    this.zzc = z5;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i5++;
                                    z6 = z4;
                                }
                            }
                            if (j4 >= 100000) {
                                zzioVar.zzaW().zze().zza("Data loss, local db full");
                                long j5 = 100001 - j4;
                                long delete = sQLiteDatabase.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j5)});
                                if (delete != j5) {
                                    zzhc zze = zzioVar.zzaW().zze();
                                    z4 = z6 ? 1 : 0;
                                    try {
                                        try {
                                            z5 = true;
                                        } catch (SQLiteDatabaseLockedException unused2) {
                                            SystemClock.sleep(i6);
                                            i6 += 20;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabase == null) {
                                                i5++;
                                                z6 = z4;
                                            }
                                            sQLiteDatabase.close();
                                            i5++;
                                            z6 = z4;
                                        }
                                        try {
                                            zze.zzd("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j5), Long.valueOf(delete), Long.valueOf(j5 - delete));
                                            sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                                            sQLiteDatabase.setTransactionSuccessful();
                                            sQLiteDatabase.endTransaction();
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            sQLiteDatabase.close();
                                            return z5;
                                        } catch (SQLiteFullException e6) {
                                            e = e6;
                                            this.zzu.zzaW().zze().zzb("Error writing entry; local database full", e);
                                            this.zzc = true;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabase == null) {
                                                i5++;
                                                z6 = z4;
                                            }
                                            sQLiteDatabase.close();
                                            i5++;
                                            z6 = z4;
                                        } catch (SQLiteException e7) {
                                            e = e7;
                                            if (sQLiteDatabase != null && sQLiteDatabase.inTransaction()) {
                                                sQLiteDatabase.endTransaction();
                                            }
                                            this.zzu.zzaW().zze().zzb("Error writing entry to local database", e);
                                            this.zzc = z5;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabase == null) {
                                                i5++;
                                                z6 = z4;
                                            }
                                            sQLiteDatabase.close();
                                            i5++;
                                            z6 = z4;
                                        }
                                    } catch (SQLiteFullException e8) {
                                        e = e8;
                                        this.zzu.zzaW().zze().zzb("Error writing entry; local database full", e);
                                        this.zzc = true;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i5++;
                                        z6 = z4;
                                    } catch (SQLiteException e9) {
                                        e = e9;
                                        z5 = true;
                                        if (sQLiteDatabase != null) {
                                        }
                                        this.zzu.zzaW().zze().zzb("Error writing entry to local database", e);
                                        this.zzc = z5;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i5++;
                                        z6 = z4;
                                    }
                                }
                            }
                            z4 = z6 ? 1 : 0;
                            z5 = true;
                            sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                            sQLiteDatabase.setTransactionSuccessful();
                            sQLiteDatabase.endTransaction();
                            if (cursor != null) {
                            }
                            sQLiteDatabase.close();
                            return z5;
                        } catch (SQLiteDatabaseLockedException unused3) {
                            z4 = z6 ? 1 : 0;
                            cursor = null;
                        } catch (SQLiteFullException e10) {
                            e = e10;
                            z4 = z6 ? 1 : 0;
                            cursor = null;
                        } catch (SQLiteException e11) {
                            e = e11;
                            z4 = z6 ? 1 : 0;
                            z5 = true;
                            cursor = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused4) {
                    z4 = z6 ? 1 : 0;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (SQLiteFullException e12) {
                    e = e12;
                    z4 = z6 ? 1 : 0;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (SQLiteException e13) {
                    e = e13;
                    z4 = z6 ? 1 : 0;
                    z5 = true;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteDatabase = null;
                }
            }
            boolean z7 = z6 ? 1 : 0;
            this.zzu.zzaW().zzj().zza("Failed to write entry to local database");
            return z7;
        }
        return z6;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zzf() {
        return false;
    }

    final SQLiteDatabase zzh() {
        if (this.zzc) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zzb.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.zzc = true;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d0 A[Catch: SQLiteDatabaseLockedException -> 0x011d, all -> 0x0182, SQLiteException -> 0x01ad, SQLiteFullException -> 0x01b0, TryCatch #40 {all -> 0x0182, blocks: (B:195:0x018a, B:196:0x018d, B:185:0x017b, B:19:0x0355, B:47:0x032b, B:49:0x0331, B:50:0x0334, B:38:0x036e, B:92:0x0193, B:100:0x01a9, B:106:0x01d0, B:114:0x01d9, B:115:0x01dc, B:118:0x01ca, B:125:0x01e2, B:128:0x01f6, B:130:0x0211, B:135:0x021b, B:136:0x021e, B:133:0x020b, B:139:0x0222, B:147:0x0236, B:149:0x025b, B:156:0x0265, B:157:0x0268, B:160:0x0255, B:167:0x026d, B:169:0x027d, B:223:0x02c6, B:225:0x02e2, B:226:0x02f1), top: B:18:0x0355 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x025b A[Catch: all -> 0x0182, SQLiteException -> 0x023a, SQLiteFullException -> 0x023d, SQLiteDatabaseLockedException -> 0x0354, TryCatch #40 {all -> 0x0182, blocks: (B:195:0x018a, B:196:0x018d, B:185:0x017b, B:19:0x0355, B:47:0x032b, B:49:0x0331, B:50:0x0334, B:38:0x036e, B:92:0x0193, B:100:0x01a9, B:106:0x01d0, B:114:0x01d9, B:115:0x01dc, B:118:0x01ca, B:125:0x01e2, B:128:0x01f6, B:130:0x0211, B:135:0x021b, B:136:0x021e, B:133:0x020b, B:139:0x0222, B:147:0x0236, B:149:0x025b, B:156:0x0265, B:157:0x0268, B:160:0x0255, B:167:0x026d, B:169:0x027d, B:223:0x02c6, B:225:0x02e2, B:226:0x02f1), top: B:18:0x0355 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0386 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0386 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x032b A[Catch: all -> 0x0182, TRY_ENTER, TryCatch #40 {all -> 0x0182, blocks: (B:195:0x018a, B:196:0x018d, B:185:0x017b, B:19:0x0355, B:47:0x032b, B:49:0x0331, B:50:0x0334, B:38:0x036e, B:92:0x0193, B:100:0x01a9, B:106:0x01d0, B:114:0x01d9, B:115:0x01dc, B:118:0x01ca, B:125:0x01e2, B:128:0x01f6, B:130:0x0211, B:135:0x021b, B:136:0x021e, B:133:0x020b, B:139:0x0222, B:147:0x0236, B:149:0x025b, B:156:0x0265, B:157:0x0268, B:160:0x0255, B:167:0x026d, B:169:0x027d, B:223:0x02c6, B:225:0x02e2, B:226:0x02f1), top: B:18:0x0355 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0386 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzi(int i4) {
        SQLiteDatabase sQLiteDatabase;
        zzgv zzgvVar;
        String str;
        String str2;
        int i5;
        Cursor cursor;
        Cursor cursor2;
        long j4;
        String str3;
        String[] strArr;
        long j5;
        String str4;
        Parcel obtain;
        int i6;
        zzbf zzbfVar;
        zzai zzaiVar;
        zzqb zzqbVar;
        zzgv zzgvVar2 = this;
        String str5 = "entry";
        String str6 = "type";
        zzgvVar2.zzg();
        ?? r6 = 0;
        if (zzgvVar2.zzc) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!zzgvVar2.zzl()) {
            return arrayList;
        }
        int i7 = 0;
        int i8 = 5;
        int i9 = 0;
        for (int i10 = 5; i9 < i10; i10 = 5) {
            try {
                sQLiteDatabase = zzgvVar2.zzh();
                if (sQLiteDatabase == null) {
                    zzgvVar2.zzc = true;
                    return r6;
                }
                try {
                    sQLiteDatabase.beginTransaction();
                    try {
                        cursor2 = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                        try {
                            long j6 = -1;
                            if (cursor2.moveToFirst()) {
                                j4 = cursor2.getLong(i7);
                                cursor2.close();
                            } else {
                                cursor2.close();
                                j4 = -1;
                            }
                            if (j4 != -1) {
                                String[] strArr2 = new String[1];
                                strArr2[i7] = String.valueOf(j4);
                                str3 = "rowid<?";
                                strArr = strArr2;
                            } else {
                                str3 = r6;
                                strArr = str3;
                            }
                            String[] strArr3 = {"rowid", str6, str5};
                            zzio zzioVar = zzgvVar2.zzu;
                            int i11 = 1;
                            boolean zzx = zzioVar.zzf().zzx(r6, zzgi.zzbl);
                            int i12 = 3;
                            int i13 = 2;
                            if (zzx) {
                                strArr3 = new String[i10];
                                strArr3[i7] = "rowid";
                                strArr3[1] = str6;
                                strArr3[2] = str5;
                                strArr3[3] = "app_version";
                                strArr3[4] = "app_version_int";
                            }
                            String[] strArr4 = strArr3;
                            int i14 = 4;
                            cursor = sQLiteDatabase.query("messages", strArr4, str3, strArr, null, null, "rowid asc", Integer.toString(100));
                            while (cursor.moveToNext()) {
                                try {
                                    try {
                                        j6 = cursor.getLong(i7);
                                        int i15 = cursor.getInt(i11);
                                        byte[] blob = cursor.getBlob(i13);
                                        try {
                                            str = str5;
                                            try {
                                                if (zzioVar.zzf().zzx(null, zzgi.zzbl)) {
                                                    String string = cursor.getString(i12);
                                                    j5 = cursor.getLong(i14);
                                                    str4 = string;
                                                } else {
                                                    j5 = 0;
                                                    str4 = null;
                                                }
                                                long j7 = j5;
                                                if (i15 == 0) {
                                                    try {
                                                        obtain = Parcel.obtain();
                                                        try {
                                                            obtain.unmarshall(blob, 0, blob.length);
                                                            obtain.setDataPosition(0);
                                                            zzbh createFromParcel = zzbh.CREATOR.createFromParcel(obtain);
                                                            if (createFromParcel != null) {
                                                                arrayList.add(new zzgu(createFromParcel, str4, j7));
                                                            }
                                                            i6 = 3;
                                                            zzgvVar = this;
                                                            str2 = str6;
                                                        } catch (SafeParcelReader.ParseException unused) {
                                                            zzgvVar = this;
                                                            try {
                                                                zzgvVar.zzu.zzaW().zze().zza("Failed to load event from local database");
                                                                try {
                                                                    obtain.recycle();
                                                                    str2 = str6;
                                                                } catch (SQLiteDatabaseLockedException unused2) {
                                                                    str2 = str6;
                                                                    i5 = 0;
                                                                    try {
                                                                        SystemClock.sleep(i8);
                                                                        i8 += 20;
                                                                        if (cursor != null) {
                                                                            cursor.close();
                                                                        }
                                                                        if (sQLiteDatabase == null) {
                                                                            i9++;
                                                                            i7 = i5;
                                                                            zzgvVar2 = zzgvVar;
                                                                            str5 = str;
                                                                            str6 = str2;
                                                                            r6 = 0;
                                                                        }
                                                                        sQLiteDatabase.close();
                                                                        i9++;
                                                                        i7 = i5;
                                                                        zzgvVar2 = zzgvVar;
                                                                        str5 = str;
                                                                        str6 = str2;
                                                                        r6 = 0;
                                                                    } catch (Throwable th) {
                                                                        th = th;
                                                                        if (cursor != null) {
                                                                            cursor.close();
                                                                        }
                                                                        if (sQLiteDatabase != null) {
                                                                            sQLiteDatabase.close();
                                                                        }
                                                                        throw th;
                                                                    }
                                                                } catch (SQLiteFullException e4) {
                                                                    e = e4;
                                                                    str2 = str6;
                                                                    i5 = 0;
                                                                    zzgvVar.zzu.zzaW().zze().zzb("Error reading entries from local database", e);
                                                                    zzgvVar.zzc = true;
                                                                    if (cursor != null) {
                                                                        cursor.close();
                                                                    }
                                                                    if (sQLiteDatabase == null) {
                                                                        i9++;
                                                                        i7 = i5;
                                                                        zzgvVar2 = zzgvVar;
                                                                        str5 = str;
                                                                        str6 = str2;
                                                                        r6 = 0;
                                                                    }
                                                                    sQLiteDatabase.close();
                                                                    i9++;
                                                                    i7 = i5;
                                                                    zzgvVar2 = zzgvVar;
                                                                    str5 = str;
                                                                    str6 = str2;
                                                                    r6 = 0;
                                                                } catch (SQLiteException e5) {
                                                                    e = e5;
                                                                    str2 = str6;
                                                                    i5 = 0;
                                                                    if (sQLiteDatabase != null && sQLiteDatabase.inTransaction()) {
                                                                        sQLiteDatabase.endTransaction();
                                                                    }
                                                                    zzgvVar.zzu.zzaW().zze().zzb("Error reading entries from local database", e);
                                                                    zzgvVar.zzc = true;
                                                                    if (cursor != null) {
                                                                        cursor.close();
                                                                    }
                                                                    if (sQLiteDatabase == null) {
                                                                        i9++;
                                                                        i7 = i5;
                                                                        zzgvVar2 = zzgvVar;
                                                                        str5 = str;
                                                                        str6 = str2;
                                                                        r6 = 0;
                                                                    }
                                                                    sQLiteDatabase.close();
                                                                    i9++;
                                                                    i7 = i5;
                                                                    zzgvVar2 = zzgvVar;
                                                                    str5 = str;
                                                                    str6 = str2;
                                                                    r6 = 0;
                                                                }
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                throw th;
                                                            }
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            zzgvVar = this;
                                                            throw th;
                                                        }
                                                        i5 = 0;
                                                        i12 = i6;
                                                        i7 = i5;
                                                        zzgvVar2 = zzgvVar;
                                                        str5 = str;
                                                        str6 = str2;
                                                        i11 = 1;
                                                        i14 = 4;
                                                        i13 = 2;
                                                    } catch (SQLiteDatabaseLockedException unused3) {
                                                        zzgvVar = this;
                                                    } catch (SQLiteFullException e6) {
                                                        e = e6;
                                                        zzgvVar = this;
                                                    } catch (SQLiteException e7) {
                                                        e = e7;
                                                        zzgvVar = this;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        if (cursor != null) {
                                                        }
                                                        if (sQLiteDatabase != null) {
                                                        }
                                                        throw th;
                                                    }
                                                } else {
                                                    zzgvVar = this;
                                                    if (i15 == 1) {
                                                        obtain = Parcel.obtain();
                                                        try {
                                                            str2 = str6;
                                                            try {
                                                                try {
                                                                    obtain.unmarshall(blob, 0, blob.length);
                                                                    obtain.setDataPosition(0);
                                                                    zzqbVar = zzqb.CREATOR.createFromParcel(obtain);
                                                                } catch (Throwable th5) {
                                                                    th = th5;
                                                                    throw th;
                                                                }
                                                            } catch (SafeParcelReader.ParseException unused4) {
                                                                zzgvVar.zzu.zzaW().zze().zza("Failed to load user property from local database");
                                                                obtain.recycle();
                                                                zzqbVar = null;
                                                                if (zzqbVar != null) {
                                                                }
                                                                i6 = 3;
                                                                i5 = 0;
                                                                i12 = i6;
                                                                i7 = i5;
                                                                zzgvVar2 = zzgvVar;
                                                                str5 = str;
                                                                str6 = str2;
                                                                i11 = 1;
                                                                i14 = 4;
                                                                i13 = 2;
                                                            }
                                                        } catch (SafeParcelReader.ParseException unused5) {
                                                            str2 = str6;
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                        }
                                                        try {
                                                            if (zzqbVar != null) {
                                                                arrayList.add(new zzgu(zzqbVar, str4, j7));
                                                            }
                                                        } catch (SQLiteDatabaseLockedException unused6) {
                                                            i5 = 0;
                                                            SystemClock.sleep(i8);
                                                            i8 += 20;
                                                            if (cursor != null) {
                                                            }
                                                            if (sQLiteDatabase == null) {
                                                            }
                                                            sQLiteDatabase.close();
                                                            i9++;
                                                            i7 = i5;
                                                            zzgvVar2 = zzgvVar;
                                                            str5 = str;
                                                            str6 = str2;
                                                            r6 = 0;
                                                        } catch (SQLiteFullException e8) {
                                                            e = e8;
                                                            i5 = 0;
                                                            zzgvVar.zzu.zzaW().zze().zzb("Error reading entries from local database", e);
                                                            zzgvVar.zzc = true;
                                                            if (cursor != null) {
                                                            }
                                                            if (sQLiteDatabase == null) {
                                                            }
                                                            sQLiteDatabase.close();
                                                            i9++;
                                                            i7 = i5;
                                                            zzgvVar2 = zzgvVar;
                                                            str5 = str;
                                                            str6 = str2;
                                                            r6 = 0;
                                                        } catch (SQLiteException e9) {
                                                            e = e9;
                                                            i5 = 0;
                                                            if (sQLiteDatabase != null) {
                                                                sQLiteDatabase.endTransaction();
                                                            }
                                                            zzgvVar.zzu.zzaW().zze().zzb("Error reading entries from local database", e);
                                                            zzgvVar.zzc = true;
                                                            if (cursor != null) {
                                                            }
                                                            if (sQLiteDatabase == null) {
                                                            }
                                                            sQLiteDatabase.close();
                                                            i9++;
                                                            i7 = i5;
                                                            zzgvVar2 = zzgvVar;
                                                            str5 = str;
                                                            str6 = str2;
                                                            r6 = 0;
                                                        }
                                                    } else {
                                                        str2 = str6;
                                                        if (i15 == 2) {
                                                            obtain = Parcel.obtain();
                                                            try {
                                                                try {
                                                                    obtain.unmarshall(blob, 0, blob.length);
                                                                    obtain.setDataPosition(0);
                                                                    zzaiVar = zzai.CREATOR.createFromParcel(obtain);
                                                                } catch (SafeParcelReader.ParseException unused7) {
                                                                    zzgvVar.zzu.zzaW().zze().zza("Failed to load conditional user property from local database");
                                                                    obtain.recycle();
                                                                    zzaiVar = null;
                                                                }
                                                                if (zzaiVar != null) {
                                                                    arrayList.add(new zzgu(zzaiVar, str4, j7));
                                                                }
                                                            } finally {
                                                                obtain.recycle();
                                                            }
                                                        } else {
                                                            if (i15 == 4) {
                                                                obtain = Parcel.obtain();
                                                                try {
                                                                    i5 = 0;
                                                                    try {
                                                                        try {
                                                                            obtain.unmarshall(blob, 0, blob.length);
                                                                            obtain.setDataPosition(0);
                                                                            zzbfVar = zzbf.CREATOR.createFromParcel(obtain);
                                                                        } catch (Throwable th7) {
                                                                            th = th7;
                                                                            throw th;
                                                                        }
                                                                    } catch (SafeParcelReader.ParseException unused8) {
                                                                        zzgvVar.zzu.zzaW().zze().zza("Failed to load default event parameters from local database");
                                                                        obtain.recycle();
                                                                        zzbfVar = null;
                                                                        if (zzbfVar != null) {
                                                                        }
                                                                        i6 = 3;
                                                                        i12 = i6;
                                                                        i7 = i5;
                                                                        zzgvVar2 = zzgvVar;
                                                                        str5 = str;
                                                                        str6 = str2;
                                                                        i11 = 1;
                                                                        i14 = 4;
                                                                        i13 = 2;
                                                                    }
                                                                } catch (SafeParcelReader.ParseException unused9) {
                                                                    i5 = 0;
                                                                } catch (Throwable th8) {
                                                                    th = th8;
                                                                }
                                                                try {
                                                                    if (zzbfVar != null) {
                                                                        arrayList.add(new zzgu(zzbfVar, str4, j7));
                                                                    }
                                                                    i6 = 3;
                                                                } catch (SQLiteDatabaseLockedException unused10) {
                                                                    SystemClock.sleep(i8);
                                                                    i8 += 20;
                                                                    if (cursor != null) {
                                                                    }
                                                                    if (sQLiteDatabase == null) {
                                                                    }
                                                                    sQLiteDatabase.close();
                                                                    i9++;
                                                                    i7 = i5;
                                                                    zzgvVar2 = zzgvVar;
                                                                    str5 = str;
                                                                    str6 = str2;
                                                                    r6 = 0;
                                                                } catch (SQLiteFullException e10) {
                                                                    e = e10;
                                                                    zzgvVar.zzu.zzaW().zze().zzb("Error reading entries from local database", e);
                                                                    zzgvVar.zzc = true;
                                                                    if (cursor != null) {
                                                                    }
                                                                    if (sQLiteDatabase == null) {
                                                                    }
                                                                    sQLiteDatabase.close();
                                                                    i9++;
                                                                    i7 = i5;
                                                                    zzgvVar2 = zzgvVar;
                                                                    str5 = str;
                                                                    str6 = str2;
                                                                    r6 = 0;
                                                                } catch (SQLiteException e11) {
                                                                    e = e11;
                                                                    if (sQLiteDatabase != null) {
                                                                    }
                                                                    zzgvVar.zzu.zzaW().zze().zzb("Error reading entries from local database", e);
                                                                    zzgvVar.zzc = true;
                                                                    if (cursor != null) {
                                                                    }
                                                                    if (sQLiteDatabase == null) {
                                                                    }
                                                                    sQLiteDatabase.close();
                                                                    i9++;
                                                                    i7 = i5;
                                                                    zzgvVar2 = zzgvVar;
                                                                    str5 = str;
                                                                    str6 = str2;
                                                                    r6 = 0;
                                                                }
                                                            } else {
                                                                i6 = 3;
                                                                i5 = 0;
                                                                if (i15 == 3) {
                                                                    zzgvVar.zzu.zzaW().zzk().zza("Skipping app launch break");
                                                                } else {
                                                                    zzgvVar.zzu.zzaW().zze().zza("Unknown record type in local database");
                                                                }
                                                            }
                                                            i12 = i6;
                                                            i7 = i5;
                                                            zzgvVar2 = zzgvVar;
                                                            str5 = str;
                                                            str6 = str2;
                                                            i11 = 1;
                                                            i14 = 4;
                                                            i13 = 2;
                                                        }
                                                    }
                                                }
                                                i6 = 3;
                                                i5 = 0;
                                                i12 = i6;
                                                i7 = i5;
                                                zzgvVar2 = zzgvVar;
                                                str5 = str;
                                                str6 = str2;
                                                i11 = 1;
                                                i14 = 4;
                                                i13 = 2;
                                            } catch (SQLiteDatabaseLockedException unused11) {
                                                zzgvVar = zzgvVar2;
                                            } catch (SQLiteFullException e12) {
                                                e = e12;
                                                zzgvVar = zzgvVar2;
                                            } catch (SQLiteException e13) {
                                                e = e13;
                                                zzgvVar = zzgvVar2;
                                            }
                                        } catch (SQLiteDatabaseLockedException unused12) {
                                            zzgvVar = zzgvVar2;
                                            str = str5;
                                        } catch (SQLiteFullException e14) {
                                            e = e14;
                                            zzgvVar = zzgvVar2;
                                            str = str5;
                                        } catch (SQLiteException e15) {
                                            e = e15;
                                            zzgvVar = zzgvVar2;
                                            str = str5;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                    }
                                } catch (SQLiteDatabaseLockedException unused13) {
                                    zzgvVar = zzgvVar2;
                                    str = str5;
                                    str2 = str6;
                                    i5 = i7;
                                } catch (SQLiteFullException e16) {
                                    e = e16;
                                    zzgvVar = zzgvVar2;
                                    str = str5;
                                    str2 = str6;
                                    i5 = i7;
                                } catch (SQLiteException e17) {
                                    e = e17;
                                    zzgvVar = zzgvVar2;
                                    str = str5;
                                    str2 = str6;
                                    i5 = i7;
                                }
                            }
                            zzgv zzgvVar3 = zzgvVar2;
                            if (sQLiteDatabase.delete("messages", "rowid <= ?", new String[]{Long.toString(j6)}) < arrayList.size()) {
                                zzgvVar3.zzu.zzaW().zze().zza("Fewer entries removed from local database than expected");
                            }
                            sQLiteDatabase.setTransactionSuccessful();
                            sQLiteDatabase.endTransaction();
                            cursor.close();
                            sQLiteDatabase.close();
                            return arrayList;
                        } catch (Throwable th10) {
                            th = th10;
                            zzgvVar = zzgvVar2;
                            str = str5;
                            str2 = str6;
                            i5 = i7;
                            if (cursor2 != null) {
                                try {
                                    cursor2.close();
                                } catch (SQLiteDatabaseLockedException unused14) {
                                    cursor = null;
                                    SystemClock.sleep(i8);
                                    i8 += 20;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i9++;
                                    i7 = i5;
                                    zzgvVar2 = zzgvVar;
                                    str5 = str;
                                    str6 = str2;
                                    r6 = 0;
                                } catch (SQLiteFullException e18) {
                                    e = e18;
                                    cursor = null;
                                    zzgvVar.zzu.zzaW().zze().zzb("Error reading entries from local database", e);
                                    zzgvVar.zzc = true;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i9++;
                                    i7 = i5;
                                    zzgvVar2 = zzgvVar;
                                    str5 = str;
                                    str6 = str2;
                                    r6 = 0;
                                } catch (SQLiteException e19) {
                                    e = e19;
                                    cursor = null;
                                    if (sQLiteDatabase != null) {
                                    }
                                    zzgvVar.zzu.zzaW().zze().zzb("Error reading entries from local database", e);
                                    zzgvVar.zzc = true;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i9++;
                                    i7 = i5;
                                    zzgvVar2 = zzgvVar;
                                    str5 = str;
                                    str6 = str2;
                                    r6 = 0;
                                } catch (Throwable th11) {
                                    th = th11;
                                    cursor = null;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase != null) {
                                    }
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th12) {
                        th = th12;
                        zzgvVar = zzgvVar2;
                        str = str5;
                        str2 = str6;
                        i5 = i7;
                        cursor2 = null;
                    }
                } catch (SQLiteDatabaseLockedException unused15) {
                    zzgvVar = zzgvVar2;
                    str = str5;
                    str2 = str6;
                    i5 = i7;
                } catch (SQLiteFullException e20) {
                    e = e20;
                    zzgvVar = zzgvVar2;
                    str = str5;
                    str2 = str6;
                    i5 = i7;
                } catch (SQLiteException e21) {
                    e = e21;
                    zzgvVar = zzgvVar2;
                    str = str5;
                    str2 = str6;
                    i5 = i7;
                } catch (Throwable th13) {
                    th = th13;
                }
            } catch (SQLiteDatabaseLockedException unused16) {
                zzgvVar = zzgvVar2;
                str = str5;
                str2 = str6;
                i5 = i7;
                sQLiteDatabase = null;
            } catch (SQLiteFullException e22) {
                e = e22;
                zzgvVar = zzgvVar2;
                str = str5;
                str2 = str6;
                i5 = i7;
                sQLiteDatabase = null;
            } catch (SQLiteException e23) {
                e = e23;
                zzgvVar = zzgvVar2;
                str = str5;
                str2 = str6;
                i5 = i7;
                sQLiteDatabase = null;
            } catch (Throwable th14) {
                th = th14;
                sQLiteDatabase = null;
            }
        }
        zzgvVar2.zzu.zzaW().zzk().zza("Failed to read events from database in reasonable time");
        return null;
    }

    public final void zzj() {
        int delete;
        zzg();
        try {
            SQLiteDatabase zzh = zzh();
            if (zzh == null || (delete = zzh.delete("messages", null, null)) <= 0) {
                return;
            }
            this.zzu.zzaW().zzj().zzb("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e4) {
            this.zzu.zzaW().zze().zzb("Error resetting local analytics data. error", e4);
        }
    }

    public final boolean zzk() {
        return zzs(3, new byte[0]);
    }

    final boolean zzl() {
        zzio zzioVar = this.zzu;
        Context zzaT = zzioVar.zzaT();
        zzioVar.zzf();
        return zzaT.getDatabasePath("google_app_measurement_local.db").exists();
    }

    public final boolean zzm() {
        zzg();
        if (!this.zzc && zzl()) {
            int i4 = 5;
            int i5 = 0;
            while (true) {
                if (i5 >= 5) {
                    this.zzu.zzaW().zzk().zza("Error deleting app launch break from local database in reasonable time");
                    break;
                }
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        try {
                            SQLiteDatabase zzh = zzh();
                            if (zzh != null) {
                                zzh.beginTransaction();
                                zzh.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                                zzh.setTransactionSuccessful();
                                zzh.endTransaction();
                                zzh.close();
                                return true;
                            }
                            this.zzc = true;
                        } catch (SQLiteException e4) {
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
                            this.zzu.zzaW().zze().zzb("Error deleting app launch break from local database", e4);
                            this.zzc = true;
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                        }
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i4);
                        i4 += 20;
                        if (0 == 0) {
                        }
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteFullException e5) {
                    this.zzu.zzaW().zze().zzb("Error deleting app launch break from local database", e5);
                    this.zzc = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                }
                i5++;
            }
        }
        return false;
    }

    public final boolean zzn(zzai zzaiVar) {
        zzio zzioVar = this.zzu;
        byte[] zzay = zzioVar.zzw().zzay(zzaiVar);
        if (zzay.length <= 131072) {
            return zzs(2, zzay);
        }
        zzioVar.zzaW().zzh().zza("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzo(zzbf zzbfVar) {
        zzio zzioVar = this.zzu;
        byte[] zzay = zzioVar.zzw().zzay(zzbfVar);
        if (zzay == null) {
            zzioVar.zzaW().zzh().zza("Null default event parameters; not writing to database");
            return false;
        }
        if (zzay.length <= 131072) {
            return zzs(4, zzay);
        }
        zzioVar.zzaW().zzh().zza("Default event parameters too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzp(zzbh zzbhVar) {
        Parcel obtain = Parcel.obtain();
        zzbi.zza(zzbhVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return zzs(0, marshall);
        }
        this.zzu.zzaW().zzh().zza("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean zzq(zzqb zzqbVar) {
        Parcel obtain = Parcel.obtain();
        zzqc.zza(zzqbVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return zzs(1, marshall);
        }
        this.zzu.zzaW().zzh().zza("User property too long for local database. Sending directly to service");
        return false;
    }
}
