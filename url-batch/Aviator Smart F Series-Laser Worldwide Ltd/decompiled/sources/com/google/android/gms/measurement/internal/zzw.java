package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
final class zzw {
    final /* synthetic */ zzaa zza;
    private com.google.android.gms.internal.measurement.zzft zzb;
    private Long zzc;
    private long zzd;

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0101, code lost:
    
        if (r12 == null) goto L22;
     */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x00e7: MOVE (r5 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]) (LINE:232), block:B:69:0x00e7 */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final com.google.android.gms.internal.measurement.zzft zza(String str, com.google.android.gms.internal.measurement.zzft zzftVar) {
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3;
        Pair pair;
        Object obj;
        String zzh = zzftVar.zzh();
        List zzi = zzftVar.zzi();
        this.zza.zzf.zzu();
        Long l8 = (Long) zzli.zzC(zzftVar, "_eid");
        if (l8 != null) {
            if (zzh.equals("_ep")) {
                Preconditions.checkNotNull(l8);
                this.zza.zzf.zzu();
                String str2 = (String) zzli.zzC(zzftVar, "_en");
                if (TextUtils.isEmpty(str2)) {
                    this.zza.zzt.zzaA().zzh().zzb("Extra parameter without an event name. eventId", l8);
                    return null;
                }
                if (this.zzb == null || this.zzc == null || l8.longValue() != this.zzc.longValue()) {
                    zzam zzi2 = this.zza.zzf.zzi();
                    zzi2.zzg();
                    zzi2.zzW();
                    try {
                        try {
                            cursor2 = zzi2.zzh().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l8.toString()});
                            try {
                            } catch (SQLiteException e8) {
                                e = e8;
                                zzi2.zzt.zzaA().zzd().zzb("Error selecting main event", e);
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursor3;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e9) {
                        e = e9;
                        cursor2 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = null;
                        if (cursor != null) {
                        }
                        throw th;
                    }
                    if (cursor2.moveToFirst()) {
                        try {
                            pair = Pair.create((com.google.android.gms.internal.measurement.zzft) ((com.google.android.gms.internal.measurement.zzfs) zzli.zzl(com.google.android.gms.internal.measurement.zzft.zze(), cursor2.getBlob(0))).zzaD(), Long.valueOf(cursor2.getLong(1)));
                            cursor2.close();
                        } catch (IOException e10) {
                            zzi2.zzt.zzaA().zzd().zzd("Failed to merge main event. appId, eventId", zzeu.zzn(str), l8, e10);
                        }
                        if (pair != null || (obj = pair.first) == null) {
                            this.zza.zzt.zzaA().zzh().zzc("Extra parameter without existing main event. eventName, eventId", str2, l8);
                            return null;
                        }
                        this.zzb = (com.google.android.gms.internal.measurement.zzft) obj;
                        this.zzd = ((Long) pair.second).longValue();
                        this.zza.zzf.zzu();
                        this.zzc = (Long) zzli.zzC(this.zzb, "_eid");
                    } else {
                        zzi2.zzt.zzaA().zzj().zza("Main event not found");
                    }
                    cursor2.close();
                    pair = null;
                    if (pair != null) {
                    }
                    this.zza.zzt.zzaA().zzh().zzc("Extra parameter without existing main event. eventName, eventId", str2, l8);
                    return null;
                }
                long j8 = this.zzd - 1;
                this.zzd = j8;
                if (j8 <= 0) {
                    zzam zzi3 = this.zza.zzf.zzi();
                    zzi3.zzg();
                    zzi3.zzt.zzaA().zzj().zzb("Clearing complex main event info. appId", str);
                    try {
                        zzi3.zzh().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e11) {
                        zzi3.zzt.zzaA().zzd().zzb("Error clearing complex main event", e11);
                    }
                } else {
                    this.zza.zzf.zzi().zzJ(str, l8, this.zzd, this.zzb);
                }
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.zzfx zzfxVar : this.zzb.zzi()) {
                    this.zza.zzf.zzu();
                    if (zzli.zzB(zzftVar, zzfxVar.zzg()) == null) {
                        arrayList.add(zzfxVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.zza.zzt.zzaA().zzh().zzb("No unique parameters in main event. eventName", str2);
                } else {
                    arrayList.addAll(zzi);
                    zzi = arrayList;
                }
                zzh = str2;
            } else {
                this.zzc = l8;
                this.zzb = zzftVar;
                this.zza.zzf.zzu();
                Object zzC = zzli.zzC(zzftVar, "_epc");
                long longValue = ((Long) (zzC != null ? zzC : 0L)).longValue();
                this.zzd = longValue;
                if (longValue <= 0) {
                    this.zza.zzt.zzaA().zzh().zzb("Complex event with zero extra param count. eventName", zzh);
                } else {
                    this.zza.zzf.zzi().zzJ(str, (Long) Preconditions.checkNotNull(l8), this.zzd, zzftVar);
                }
            }
        }
        com.google.android.gms.internal.measurement.zzfs zzfsVar = (com.google.android.gms.internal.measurement.zzfs) zzftVar.zzbB();
        zzfsVar.zzi(zzh);
        zzfsVar.zzg();
        zzfsVar.zzd(zzi);
        return (com.google.android.gms.internal.measurement.zzft) zzfsVar.zzaD();
    }
}
