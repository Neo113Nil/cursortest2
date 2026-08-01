package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.AdError;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zznt;
import com.google.android.gms.internal.measurement.zzpd;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Marker;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes2.dex */
final class zzam extends zzkh {
    private static final String[] zza = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] zzb = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzc = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;"};
    private static final String[] zzd = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] zze = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzg = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzh = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzi = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final zzal zzj;
    private final zzkd zzk;

    zzam(zzkt zzktVar) {
        super(zzktVar);
        this.zzk = new zzkd(this.zzt.zzav());
        this.zzt.zzf();
        this.zzj = new zzal(this, this.zzt.zzau(), "google_app_measurement.db");
    }

    static final void zzV(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty("value");
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    private final long zzZ(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = zzh().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = rawQuery.getLong(0);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return j;
            } catch (SQLiteException e) {
                this.zzt.zzay().zzd().zzc("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long zzaa(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            try {
                cursor = zzh().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    return cursor.getLong(0);
                }
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            } catch (SQLiteException e) {
                this.zzt.zzay().zzd().zzc("Database error", str, e);
                throw e;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public final void zzA(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        try {
            zzh().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.zzt.zzay().zzd().zzd("Error deleting user property. appId", zzeh.zzn(str), this.zzt.zzj().zzf(str2), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0237, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e1, code lost:
    
        r0 = r23.zzt.zzay().zzk();
        r9 = com.google.android.gms.measurement.internal.zzeh.zzn(r24);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f9, code lost:
    
        if (r12.zzp() == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fb, code lost:
    
        r20 = java.lang.Integer.valueOf(r12.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0208, code lost:
    
        r0.zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r9, r11, java.lang.String.valueOf(r20));
        r21 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0206, code lost:
    
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0299, code lost:
    
        r21 = r7;
        r0 = r0.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02a7, code lost:
    
        if (r0.hasNext() == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02a9, code lost:
    
        r3 = (com.google.android.gms.internal.measurement.zzet) r0.next();
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02c3, code lost:
    
        if (r3.zze().isEmpty() == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02f2, code lost:
    
        r7 = r3.zzbu();
        r11 = new android.content.ContentValues();
        r11.put("app_id", r24);
        r11.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0309, code lost:
    
        if (r3.zzj() == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x030b, code lost:
    
        r12 = java.lang.Integer.valueOf(r3.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0315, code lost:
    
        r11.put("filter_id", r12);
        r22 = r0;
        r11.put("property_name", r3.zze());
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0327, code lost:
    
        if (r3.zzk() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0329, code lost:
    
        r0 = java.lang.Boolean.valueOf(r3.zzi());
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0333, code lost:
    
        r11.put("session_scoped", r0);
        r11.put("data", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0347, code lost:
    
        if (zzh().insertWithOnConflict("property_filters", null, r11, 5) != (-1)) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x035d, code lost:
    
        r0 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0349, code lost:
    
        r23.zzt.zzay().zzd().zzb("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.zzeh.zzn(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0361, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0362, code lost:
    
        r23.zzt.zzay().zzd().zzc("Error storing property filter. appId", com.google.android.gms.measurement.internal.zzeh.zzn(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0332, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0314, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02c5, code lost:
    
        r0 = r23.zzt.zzay().zzk();
        r8 = com.google.android.gms.measurement.internal.zzeh.zzn(r24);
        r9 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02dd, code lost:
    
        if (r3.zzj() == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02df, code lost:
    
        r3 = java.lang.Integer.valueOf(r3.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02e9, code lost:
    
        r0.zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r8, r9, java.lang.String.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02e8, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03ac, code lost:
    
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017a, code lost:
    
        r11 = r0.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0186, code lost:
    
        if (r11.hasNext() == false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0192, code lost:
    
        if (((com.google.android.gms.internal.measurement.zzet) r11.next()).zzj() != false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0194, code lost:
    
        r23.zzt.zzay().zzk().zzc("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.zzeh.zzn(r24), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01ad, code lost:
    
        r11 = r0.zzg().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c3, code lost:
    
        if (r11.hasNext() == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c5, code lost:
    
        r12 = (com.google.android.gms.internal.measurement.zzek) r11.next();
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01df, code lost:
    
        if (r12.zzg().isEmpty() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0213, code lost:
    
        r3 = r12.zzbu();
        r21 = r7;
        r7 = new android.content.ContentValues();
        r7.put("app_id", r24);
        r7.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x022c, code lost:
    
        if (r12.zzp() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x022e, code lost:
    
        r9 = java.lang.Integer.valueOf(r12.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0238, code lost:
    
        r7.put("filter_id", r9);
        r7.put("event_name", r12.zzg());
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0248, code lost:
    
        if (r12.zzq() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x024a, code lost:
    
        r9 = java.lang.Boolean.valueOf(r12.zzn());
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0254, code lost:
    
        r7.put("session_scoped", r9);
        r7.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0268, code lost:
    
        if (zzh().insertWithOnConflict("event_filters", null, r7, 5) != (-1)) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x026a, code lost:
    
        r23.zzt.zzay().zzd().zzb("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.zzeh.zzn(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x027d, code lost:
    
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0283, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0284, code lost:
    
        r23.zzt.zzay().zzd().zzc("Error storing event filter. appId", com.google.android.gms.measurement.internal.zzeh.zzn(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0375, code lost:
    
        zzW();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        r0 = zzh();
        r3 = r17;
        r0.delete("property_filters", r3, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r0.delete("event_filters", r3, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r17 = r3;
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0253, code lost:
    
        r9 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzB(String str, List list) {
        boolean z;
        String str2 = "app_id=? and audience_id=?";
        Preconditions.checkNotNull(list);
        int i = 0;
        while (i < list.size()) {
            com.google.android.gms.internal.measurement.zzeh zzehVar = (com.google.android.gms.internal.measurement.zzeh) ((com.google.android.gms.internal.measurement.zzei) list.get(i)).zzby();
            if (zzehVar.zza() != 0) {
                int i2 = 0;
                while (i2 < zzehVar.zza()) {
                    com.google.android.gms.internal.measurement.zzej zzejVar = (com.google.android.gms.internal.measurement.zzej) zzehVar.zze(i2).zzby();
                    com.google.android.gms.internal.measurement.zzej zzejVar2 = (com.google.android.gms.internal.measurement.zzej) zzejVar.clone();
                    String zzb2 = zzgo.zzb(zzejVar.zze());
                    if (zzb2 != null) {
                        zzejVar2.zzb(zzb2);
                        z = true;
                    } else {
                        z = false;
                    }
                    int i3 = 0;
                    while (i3 < zzejVar.zza()) {
                        com.google.android.gms.internal.measurement.zzem zzd2 = zzejVar.zzd(i3);
                        com.google.android.gms.internal.measurement.zzej zzejVar3 = zzejVar;
                        String str3 = str2;
                        String zzb3 = zzid.zzb(zzd2.zze(), zzgp.zza, zzgp.zzb);
                        if (zzb3 != null) {
                            com.google.android.gms.internal.measurement.zzel zzelVar = (com.google.android.gms.internal.measurement.zzel) zzd2.zzby();
                            zzelVar.zza(zzb3);
                            zzejVar2.zzc(i3, (com.google.android.gms.internal.measurement.zzem) zzelVar.zzaC());
                            z = true;
                        }
                        i3++;
                        zzejVar = zzejVar3;
                        str2 = str3;
                    }
                    String str4 = str2;
                    if (z) {
                        zzehVar.zzc(i2, zzejVar2);
                        list.set(i, (com.google.android.gms.internal.measurement.zzei) zzehVar.zzaC());
                    }
                    i2++;
                    str2 = str4;
                }
            }
            String str5 = str2;
            if (zzehVar.zzb() != 0) {
                for (int i4 = 0; i4 < zzehVar.zzb(); i4++) {
                    com.google.android.gms.internal.measurement.zzet zzf = zzehVar.zzf(i4);
                    String zzb4 = zzid.zzb(zzf.zze(), zzgq.zza, zzgq.zzb);
                    if (zzb4 != null) {
                        com.google.android.gms.internal.measurement.zzes zzesVar = (com.google.android.gms.internal.measurement.zzes) zzf.zzby();
                        zzesVar.zza(zzb4);
                        zzehVar.zzd(i4, zzesVar);
                        list.set(i, (com.google.android.gms.internal.measurement.zzei) zzehVar.zzaC());
                    }
                }
            }
            i++;
            str2 = str5;
        }
        String str6 = str2;
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        SQLiteDatabase zzh2 = zzh();
        zzh2.beginTransaction();
        try {
            zzW();
            zzg();
            Preconditions.checkNotEmpty(str);
            SQLiteDatabase zzh3 = zzh();
            zzh3.delete("property_filters", "app_id=?", new String[]{str});
            zzh3.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.measurement.zzei zzeiVar = (com.google.android.gms.internal.measurement.zzei) it.next();
                zzW();
                zzg();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(zzeiVar);
                if (zzeiVar.zzk()) {
                    int zza2 = zzeiVar.zza();
                    Iterator it2 = zzeiVar.zzg().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!((com.google.android.gms.internal.measurement.zzek) it2.next()).zzp()) {
                                this.zzt.zzay().zzk().zzc("Event filter with no ID. Audience definition ignored. appId, audienceId", zzeh.zzn(str), Integer.valueOf(zza2));
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    this.zzt.zzay().zzk().zzb("Audience with no ID. appId", zzeh.zzn(str));
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                com.google.android.gms.internal.measurement.zzei zzeiVar2 = (com.google.android.gms.internal.measurement.zzei) it3.next();
                arrayList.add(zzeiVar2.zzk() ? Integer.valueOf(zzeiVar2.zza()) : null);
            }
            Preconditions.checkNotEmpty(str);
            zzW();
            zzg();
            SQLiteDatabase zzh4 = zzh();
            try {
                long zzZ = zzZ("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int max = Math.max(0, Math.min(AdError.SERVER_ERROR_CODE, this.zzt.zzf().zze(str, zzdu.zzE)));
                if (zzZ > max) {
                    ArrayList arrayList2 = new ArrayList();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= arrayList.size()) {
                            String join = TextUtils.join(",", arrayList2);
                            StringBuilder sb = new StringBuilder();
                            sb.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb.append("(" + join + ")");
                            sb.append(" order by rowid desc limit -1 offset ?)");
                            zzh4.delete("audience_filter_values", sb.toString(), new String[]{str, Integer.toString(max)});
                            break;
                        }
                        Integer num = (Integer) arrayList.get(i5);
                        if (num == null) {
                            break;
                        }
                        arrayList2.add(Integer.toString(num.intValue()));
                        i5++;
                    }
                }
            } catch (SQLiteException e) {
                this.zzt.zzay().zzd().zzc("Database error querying filters. appId", zzeh.zzn(str), e);
            }
            zzh2.setTransactionSuccessful();
        } finally {
            zzh2.endTransaction();
        }
    }

    public final void zzC() {
        zzW();
        zzh().setTransactionSuccessful();
    }

    public final void zzD(zzh zzhVar) {
        Preconditions.checkNotNull(zzhVar);
        zzg();
        zzW();
        String zzt = zzhVar.zzt();
        Preconditions.checkNotNull(zzt);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzt);
        contentValues.put("app_instance_id", zzhVar.zzu());
        contentValues.put("gmp_app_id", zzhVar.zzy());
        contentValues.put("resettable_device_id_hash", zzhVar.zzA());
        contentValues.put("last_bundle_index", Long.valueOf(zzhVar.zzo()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzhVar.zzp()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzhVar.zzn()));
        contentValues.put("app_version", zzhVar.zzw());
        contentValues.put("app_store", zzhVar.zzv());
        contentValues.put("gmp_version", Long.valueOf(zzhVar.zzm()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzhVar.zzj()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzhVar.zzai()));
        contentValues.put("day", Long.valueOf(zzhVar.zzi()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzhVar.zzg()));
        contentValues.put("daily_events_count", Long.valueOf(zzhVar.zzf()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzhVar.zzd()));
        contentValues.put("config_fetched_time", Long.valueOf(zzhVar.zzc()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzhVar.zzl()));
        contentValues.put("app_version_int", Long.valueOf(zzhVar.zzb()));
        contentValues.put("firebase_instance_id", zzhVar.zzx());
        contentValues.put("daily_error_events_count", Long.valueOf(zzhVar.zze()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzhVar.zzh()));
        contentValues.put("health_monitor_sample", zzhVar.zzz());
        zzhVar.zza();
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzhVar.zzah()));
        contentValues.put("admob_app_id", zzhVar.zzr());
        contentValues.put("dynamite_version", Long.valueOf(zzhVar.zzk()));
        contentValues.put("session_stitching_token", zzhVar.zzB());
        List zzC = zzhVar.zzC();
        if (zzC != null) {
            if (zzC.isEmpty()) {
                this.zzt.zzay().zzk().zzb("Safelisted events should not be an empty list. appId", zzt);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", zzC));
            }
        }
        zznt.zzc();
        if (this.zzt.zzf().zzs(null, zzdu.zzai) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase zzh2 = zzh();
            if (zzh2.update("apps", contentValues, "app_id = ?", new String[]{zzt}) == 0 && zzh2.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.zzt.zzay().zzd().zzb("Failed to insert/update app (got -1). appId", zzeh.zzn(zzt));
            }
        } catch (SQLiteException e) {
            this.zzt.zzay().zzd().zzc("Error storing app. appId", zzeh.zzn(zzt), e);
        }
    }

    public final void zzE(zzas zzasVar) {
        Preconditions.checkNotNull(zzasVar);
        zzg();
        zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzasVar.zza);
        contentValues.put("name", zzasVar.zzb);
        contentValues.put("lifetime_count", Long.valueOf(zzasVar.zzc));
        contentValues.put("current_bundle_count", Long.valueOf(zzasVar.zzd));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzasVar.zzf));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzasVar.zzg));
        contentValues.put("last_bundled_day", zzasVar.zzh);
        contentValues.put("last_sampled_complex_event_id", zzasVar.zzi);
        contentValues.put("last_sampling_rate", zzasVar.zzj);
        contentValues.put("current_session_count", Long.valueOf(zzasVar.zze));
        Boolean bool = zzasVar.zzk;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (zzh().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                this.zzt.zzay().zzd().zzb("Failed to insert/update event aggregates (got -1). appId", zzeh.zzn(zzasVar.zza));
            }
        } catch (SQLiteException e) {
            this.zzt.zzay().zzd().zzc("Error storing event aggregates. appId", zzeh.zzn(zzasVar.zza), e);
        }
    }

    public final boolean zzF() {
        return zzZ("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean zzG() {
        return zzZ("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final boolean zzH() {
        return zzZ("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    protected final boolean zzI() {
        Context zzau = this.zzt.zzau();
        this.zzt.zzf();
        return zzau.getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean zzJ(String str, Long l, long j, com.google.android.gms.internal.measurement.zzft zzftVar) {
        zzg();
        zzW();
        Preconditions.checkNotNull(zzftVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l);
        byte[] zzbu = zzftVar.zzbu();
        this.zzt.zzay().zzj().zzc("Saving complex main event, appId, data size", this.zzt.zzj().zzd(str), Integer.valueOf(zzbu.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", zzbu);
        try {
            if (zzh().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            this.zzt.zzay().zzd().zzb("Failed to insert complex main event (got -1). appId", zzeh.zzn(str));
            return false;
        } catch (SQLiteException e) {
            this.zzt.zzay().zzd().zzc("Error storing complex main event. appId", zzeh.zzn(str), e);
            return false;
        }
    }

    public final boolean zzK(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        zzg();
        zzW();
        String str = zzacVar.zza;
        Preconditions.checkNotNull(str);
        if (zzp(str, zzacVar.zzc.zzb) == null) {
            long zzZ = zzZ("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.zzt.zzf();
            if (zzZ >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzacVar.zzb);
        contentValues.put("name", zzacVar.zzc.zzb);
        zzV(contentValues, "value", Preconditions.checkNotNull(zzacVar.zzc.zza()));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzacVar.zze));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzacVar.zzf);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzacVar.zzh));
        contentValues.put("timed_out_event", this.zzt.zzv().zzan(zzacVar.zzg));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzacVar.zzd));
        contentValues.put("triggered_event", this.zzt.zzv().zzan(zzacVar.zzi));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzacVar.zzc.zzc));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzacVar.zzj));
        contentValues.put("expired_event", this.zzt.zzv().zzan(zzacVar.zzk));
        try {
            if (zzh().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                this.zzt.zzay().zzd().zzb("Failed to insert/update conditional user property (got -1)", zzeh.zzn(str));
            }
        } catch (SQLiteException e) {
            this.zzt.zzay().zzd().zzc("Error storing conditional user property", zzeh.zzn(str), e);
        }
        return true;
    }

    public final boolean zzL(zzky zzkyVar) {
        Preconditions.checkNotNull(zzkyVar);
        zzg();
        zzW();
        if (zzp(zzkyVar.zza, zzkyVar.zzc) == null) {
            if (zzlb.zzai(zzkyVar.zzc)) {
                if (zzZ("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{zzkyVar.zza}) >= this.zzt.zzf().zzf(zzkyVar.zza, zzdu.zzF, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(zzkyVar.zzc)) {
                long zzZ = zzZ("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zzkyVar.zza, zzkyVar.zzb});
                this.zzt.zzf();
                if (zzZ >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzkyVar.zza);
        contentValues.put("origin", zzkyVar.zzb);
        contentValues.put("name", zzkyVar.zzc);
        contentValues.put("set_timestamp", Long.valueOf(zzkyVar.zzd));
        zzV(contentValues, "value", zzkyVar.zze);
        try {
            if (zzh().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                this.zzt.zzay().zzd().zzb("Failed to insert/update user property (got -1). appId", zzeh.zzn(zzkyVar.zza));
            }
        } catch (SQLiteException e) {
            this.zzt.zzay().zzd().zzc("Error storing user property. appId", zzeh.zzn(zzkyVar.zza), e);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:99:0x021d  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzU(String str, long j, long j2, zzkq zzkqVar) {
        String string;
        char c;
        boolean z;
        String str2;
        String[] strArr;
        ?? r3 = "select metadata_fingerprint from raw_events where app_id = ?";
        Preconditions.checkNotNull(zzkqVar);
        zzg();
        zzW();
        ?? r4 = 0;
        String str3 = null;
        try {
            try {
                SQLiteDatabase zzh2 = zzh();
                try {
                    if (TextUtils.isEmpty(null)) {
                        Cursor rawQuery = zzh2.rawQuery("select app_id, metadata_fingerprint from raw_events where " + (j2 != -1 ? "rowid <= ? and " : "") + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", j2 != -1 ? new String[]{String.valueOf(j2), String.valueOf(j)} : new String[]{String.valueOf(j)});
                        if (!rawQuery.moveToFirst()) {
                            if (rawQuery != null) {
                                rawQuery.close();
                                return;
                            }
                            return;
                        } else {
                            str3 = rawQuery.getString(0);
                            string = rawQuery.getString(1);
                            rawQuery.close();
                        }
                    } else {
                        Cursor rawQuery2 = zzh2.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + (j2 != -1 ? " and rowid <= ?" : "") + " order by rowid limit 1;", j2 != -1 ? new String[]{null, String.valueOf(j2)} : new String[]{null});
                        if (!rawQuery2.moveToFirst()) {
                            if (rawQuery2 != null) {
                                rawQuery2.close();
                                return;
                            }
                            return;
                        }
                        string = rawQuery2.getString(0);
                        rawQuery2.close();
                    }
                    Cursor query = zzh2.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, string}, null, null, "rowid", ExifInterface.GPS_MEASUREMENT_2D);
                    if (!query.moveToFirst()) {
                        this.zzt.zzay().zzd().zzb("Raw event metadata record is missing. appId", zzeh.zzn(str3));
                        if (query != null) {
                            query.close();
                            return;
                        }
                        return;
                    }
                    try {
                        com.google.android.gms.internal.measurement.zzgd zzgdVar = (com.google.android.gms.internal.measurement.zzgd) ((com.google.android.gms.internal.measurement.zzgc) zzkv.zzl(com.google.android.gms.internal.measurement.zzgd.zzt(), query.getBlob(0))).zzaC();
                        if (query.moveToNext()) {
                            this.zzt.zzay().zzk().zzb("Get multiple raw event metadata records, expected one. appId", zzeh.zzn(str3));
                        }
                        query.close();
                        Preconditions.checkNotNull(zzgdVar);
                        zzkqVar.zza = zzgdVar;
                        if (j2 != -1) {
                            str2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                            z = true;
                            c = 2;
                            strArr = new String[]{str3, string, String.valueOf(j2)};
                        } else {
                            c = 2;
                            z = true;
                            str2 = "app_id = ? and metadata_fingerprint = ?";
                            strArr = new String[]{str3, string};
                        }
                        Cursor query2 = zzh2.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str2, strArr, null, null, "rowid", null);
                        if (!query2.moveToFirst()) {
                            this.zzt.zzay().zzk().zzb("Raw event data disappeared while in transaction. appId", zzeh.zzn(str3));
                            if (query2 != null) {
                                query2.close();
                                return;
                            }
                            return;
                        }
                        do {
                            long j3 = query2.getLong(0);
                            try {
                                com.google.android.gms.internal.measurement.zzfs zzfsVar = (com.google.android.gms.internal.measurement.zzfs) zzkv.zzl(com.google.android.gms.internal.measurement.zzft.zze(), query2.getBlob(3));
                                zzfsVar.zzi(query2.getString(1));
                                zzfsVar.zzm(query2.getLong(2));
                                if (!zzkqVar.zza(j3, (com.google.android.gms.internal.measurement.zzft) zzfsVar.zzaC())) {
                                    if (query2 != null) {
                                        query2.close();
                                        return;
                                    }
                                    return;
                                }
                            } catch (IOException e) {
                                this.zzt.zzay().zzd().zzc("Data loss. Failed to merge raw event. appId", zzeh.zzn(str3), e);
                            }
                        } while (query2.moveToNext());
                        if (query2 != null) {
                            query2.close();
                        }
                    } catch (IOException e2) {
                        this.zzt.zzay().zzd().zzc("Data loss. Failed to merge raw event metadata. appId", zzeh.zzn(str3), e2);
                        if (query != null) {
                            query.close();
                        }
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    this.zzt.zzay().zzd().zzc("Data loss. Error selecting raw event. appId", zzeh.zzn(null), e);
                    if (r3 != 0) {
                        r3.close();
                    }
                }
            } catch (Throwable th) {
                th = th;
                r4 = "select metadata_fingerprint from raw_events where app_id = ?";
                if (r4 != 0) {
                    r4.close();
                }
                throw th;
            }
        } catch (SQLiteException e4) {
            e = e4;
            r3 = 0;
        } catch (Throwable th2) {
            th = th2;
            if (r4 != 0) {
            }
            throw th;
        }
    }

    public final int zza(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        try {
            return zzh().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.zzt.zzay().zzd().zzd("Error deleting conditional property", zzeh.zzn(str), this.zzt.zzj().zzf(str2), e);
            return 0;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzkh
    protected final boolean zzb() {
        return false;
    }

    protected final long zzc(String str, String str2) {
        long zzaa;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty("first_open_count");
        zzg();
        zzW();
        SQLiteDatabase zzh2 = zzh();
        zzh2.beginTransaction();
        long j = 0;
        try {
            try {
                zzaa = zzaa("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (zzaa == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (zzh2.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        this.zzt.zzay().zzd().zzc("Failed to insert column (got -1). appId", zzeh.zzn(str), "first_open_count");
                        return -1L;
                    }
                    zzaa = 0;
                }
            } catch (SQLiteException e) {
                e = e;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put("first_open_count", Long.valueOf(1 + zzaa));
                if (zzh2.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                    this.zzt.zzay().zzd().zzc("Failed to update column (got 0). appId", zzeh.zzn(str), "first_open_count");
                    return -1L;
                }
                zzh2.setTransactionSuccessful();
                return zzaa;
            } catch (SQLiteException e2) {
                e = e2;
                j = zzaa;
                this.zzt.zzay().zzd().zzd("Error inserting column. appId", zzeh.zzn(str), "first_open_count", e);
                zzh2.endTransaction();
                return j;
            }
        } finally {
            zzh2.endTransaction();
        }
    }

    public final long zzd() {
        return zzaa("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final long zze() {
        return zzaa("select max(timestamp) from raw_events", null, 0L);
    }

    public final long zzf(String str) {
        Preconditions.checkNotEmpty(str);
        return zzaa("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    final SQLiteDatabase zzh() {
        zzg();
        try {
            return this.zzj.getWritableDatabase();
        } catch (SQLiteException e) {
            this.zzt.zzay().zzk().zzb("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00dc: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:60:0x00dc */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle zzi(String str) {
        Cursor cursor;
        Cursor cursor2;
        zzg();
        zzW();
        Cursor cursor3 = null;
        try {
            try {
                cursor = zzh().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (!cursor.moveToFirst()) {
                        this.zzt.zzay().zzj().zza("Default event parameters not found");
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    try {
                        com.google.android.gms.internal.measurement.zzft zzftVar = (com.google.android.gms.internal.measurement.zzft) ((com.google.android.gms.internal.measurement.zzfs) zzkv.zzl(com.google.android.gms.internal.measurement.zzft.zze(), cursor.getBlob(0))).zzaC();
                        this.zzf.zzu();
                        List<com.google.android.gms.internal.measurement.zzfx> zzi2 = zzftVar.zzi();
                        Bundle bundle = new Bundle();
                        for (com.google.android.gms.internal.measurement.zzfx zzfxVar : zzi2) {
                            String zzg2 = zzfxVar.zzg();
                            if (zzfxVar.zzu()) {
                                bundle.putDouble(zzg2, zzfxVar.zza());
                            } else if (zzfxVar.zzv()) {
                                bundle.putFloat(zzg2, zzfxVar.zzb());
                            } else if (zzfxVar.zzy()) {
                                bundle.putString(zzg2, zzfxVar.zzh());
                            } else if (zzfxVar.zzw()) {
                                bundle.putLong(zzg2, zzfxVar.zzd());
                            }
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        return bundle;
                    } catch (IOException e) {
                        this.zzt.zzay().zzd().zzc("Failed to retrieve default event parameters. appId", zzeh.zzn(str), e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    this.zzt.zzay().zzd().zzb("Error selecting default event parameters", e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x01fd: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:54:0x01fd */
    /* JADX WARN: Removed duplicated region for block: B:19:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0181 A[Catch: SQLiteException -> 0x01dd, all -> 0x01fc, TryCatch #1 {all -> 0x01fc, blocks: (B:5:0x0061, B:11:0x006d, B:13:0x00d0, B:17:0x00da, B:20:0x0124, B:22:0x0153, B:26:0x015b, B:29:0x0176, B:31:0x0181, B:32:0x0193, B:34:0x01a4, B:36:0x01b2, B:37:0x01bb, B:39:0x01c4, B:44:0x0172, B:45:0x011f, B:48:0x01e3), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01c4 A[Catch: SQLiteException -> 0x01dd, all -> 0x01fc, TRY_LEAVE, TryCatch #1 {all -> 0x01fc, blocks: (B:5:0x0061, B:11:0x006d, B:13:0x00d0, B:17:0x00da, B:20:0x0124, B:22:0x0153, B:26:0x015b, B:29:0x0176, B:31:0x0181, B:32:0x0193, B:34:0x01a4, B:36:0x01b2, B:37:0x01bb, B:39:0x01c4, B:44:0x0172, B:45:0x011f, B:48:0x01e3), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0172 A[Catch: SQLiteException -> 0x01dd, all -> 0x01fc, TryCatch #1 {all -> 0x01fc, blocks: (B:5:0x0061, B:11:0x006d, B:13:0x00d0, B:17:0x00da, B:20:0x0124, B:22:0x0153, B:26:0x015b, B:29:0x0176, B:31:0x0181, B:32:0x0193, B:34:0x01a4, B:36:0x01b2, B:37:0x01bb, B:39:0x01c4, B:44:0x0172, B:45:0x011f, B:48:0x01e3), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011f A[Catch: SQLiteException -> 0x01dd, all -> 0x01fc, TryCatch #1 {all -> 0x01fc, blocks: (B:5:0x0061, B:11:0x006d, B:13:0x00d0, B:17:0x00da, B:20:0x0124, B:22:0x0153, B:26:0x015b, B:29:0x0176, B:31:0x0181, B:32:0x0193, B:34:0x01a4, B:36:0x01b2, B:37:0x01bb, B:39:0x01c4, B:44:0x0172, B:45:0x011f, B:48:0x01e3), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzh zzj(String str) {
        Cursor cursor;
        Cursor cursor2;
        boolean z;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        Cursor cursor3 = null;
        try {
            try {
                boolean z2 = true;
                cursor = zzh().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (!cursor.moveToFirst()) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    zzh zzhVar = new zzh(this.zzf.zzq(), str);
                    zzhVar.zzH(cursor.getString(0));
                    zzhVar.zzW(cursor.getString(1));
                    zzhVar.zzae(cursor.getString(2));
                    zzhVar.zzaa(cursor.getLong(3));
                    zzhVar.zzab(cursor.getLong(4));
                    zzhVar.zzZ(cursor.getLong(5));
                    zzhVar.zzJ(cursor.getString(6));
                    zzhVar.zzI(cursor.getString(7));
                    zzhVar.zzX(cursor.getLong(8));
                    zzhVar.zzS(cursor.getLong(9));
                    if (!cursor.isNull(10) && cursor.getInt(10) == 0) {
                        z = false;
                        zzhVar.zzac(z);
                        zzhVar.zzR(cursor.getLong(11));
                        zzhVar.zzP(cursor.getLong(12));
                        zzhVar.zzO(cursor.getLong(13));
                        zzhVar.zzM(cursor.getLong(14));
                        zzhVar.zzL(cursor.getLong(15));
                        zzhVar.zzU(cursor.getLong(16));
                        zzhVar.zzK(!cursor.isNull(17) ? -2147483648L : cursor.getInt(17));
                        zzhVar.zzV(cursor.getString(18));
                        zzhVar.zzN(cursor.getLong(19));
                        zzhVar.zzQ(cursor.getLong(20));
                        zzhVar.zzY(cursor.getString(21));
                        if (!cursor.isNull(23) && cursor.getInt(23) == 0) {
                            z2 = false;
                        }
                        zzhVar.zzG(z2);
                        zzhVar.zzF(cursor.getString(24));
                        zzhVar.zzT(!cursor.isNull(25) ? 0L : cursor.getLong(25));
                        if (!cursor.isNull(26)) {
                            zzhVar.zzaf(Arrays.asList(cursor.getString(26).split(",", -1)));
                        }
                        zzpd.zzc();
                        if (this.zzt.zzf().zzs(null, zzdu.zzal) && this.zzt.zzf().zzs(str, zzdu.zzan)) {
                            zzhVar.zzag(cursor.getString(28));
                        }
                        zzhVar.zzD();
                        if (cursor.moveToNext()) {
                            this.zzt.zzay().zzd().zzb("Got multiple records for app, expected one. appId", zzeh.zzn(str));
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        return zzhVar;
                    }
                    z = true;
                    zzhVar.zzac(z);
                    zzhVar.zzR(cursor.getLong(11));
                    zzhVar.zzP(cursor.getLong(12));
                    zzhVar.zzO(cursor.getLong(13));
                    zzhVar.zzM(cursor.getLong(14));
                    zzhVar.zzL(cursor.getLong(15));
                    zzhVar.zzU(cursor.getLong(16));
                    zzhVar.zzK(!cursor.isNull(17) ? -2147483648L : cursor.getInt(17));
                    zzhVar.zzV(cursor.getString(18));
                    zzhVar.zzN(cursor.getLong(19));
                    zzhVar.zzQ(cursor.getLong(20));
                    zzhVar.zzY(cursor.getString(21));
                    if (!cursor.isNull(23)) {
                        z2 = false;
                    }
                    zzhVar.zzG(z2);
                    zzhVar.zzF(cursor.getString(24));
                    zzhVar.zzT(!cursor.isNull(25) ? 0L : cursor.getLong(25));
                    if (!cursor.isNull(26)) {
                    }
                    zzpd.zzc();
                    if (this.zzt.zzf().zzs(null, zzdu.zzal)) {
                        zzhVar.zzag(cursor.getString(28));
                    }
                    zzhVar.zzD();
                    if (cursor.moveToNext()) {
                    }
                    if (cursor != null) {
                    }
                    return zzhVar;
                } catch (SQLiteException e) {
                    e = e;
                    this.zzt.zzay().zzd().zzc("Error querying app. appId", zzeh.zzn(str), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x012b: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:32:0x012b */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzac zzk(String str, String str2) {
        Cursor cursor;
        Cursor cursor2;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        Cursor cursor3 = null;
        try {
            try {
                cursor = zzh().query("conditional_properties", new String[]{"origin", "value", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursor.moveToFirst()) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    String string = cursor.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str3 = string;
                    Object zzq = zzq(cursor, 1);
                    boolean z = cursor.getInt(2) != 0;
                    zzac zzacVar = new zzac(str, str3, new zzkw(str2, cursor.getLong(8), zzq, str3), cursor.getLong(6), z, cursor.getString(3), (zzaw) this.zzf.zzu().zzh(cursor.getBlob(5), zzaw.CREATOR), cursor.getLong(4), (zzaw) this.zzf.zzu().zzh(cursor.getBlob(7), zzaw.CREATOR), cursor.getLong(9), (zzaw) this.zzf.zzu().zzh(cursor.getBlob(10), zzaw.CREATOR));
                    if (cursor.moveToNext()) {
                        this.zzt.zzay().zzd().zzc("Got multiple records for conditional property, expected one", zzeh.zzn(str), this.zzt.zzj().zzf(str2));
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return zzacVar;
                } catch (SQLiteException e) {
                    e = e;
                    this.zzt.zzay().zzd().zzd("Error querying conditional property", zzeh.zzn(str), this.zzt.zzj().zzf(str2), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
    }

    public final zzak zzl(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return zzm(j, str, 1L, false, false, z3, false, z5);
    }

    public final zzak zzm(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        String[] strArr = {str};
        zzak zzakVar = new zzak();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase zzh2 = zzh();
                Cursor query = zzh2.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    this.zzt.zzay().zzk().zzb("Not updating daily counts, app is not known. appId", zzeh.zzn(str));
                    if (query != null) {
                        query.close();
                    }
                    return zzakVar;
                }
                if (query.getLong(0) == j) {
                    zzakVar.zzb = query.getLong(1);
                    zzakVar.zza = query.getLong(2);
                    zzakVar.zzc = query.getLong(3);
                    zzakVar.zzd = query.getLong(4);
                    zzakVar.zze = query.getLong(5);
                }
                if (z) {
                    zzakVar.zzb += j2;
                }
                if (z2) {
                    zzakVar.zza += j2;
                }
                if (z3) {
                    zzakVar.zzc += j2;
                }
                if (z4) {
                    zzakVar.zzd += j2;
                }
                if (z5) {
                    zzakVar.zze += j2;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j));
                contentValues.put("daily_public_events_count", Long.valueOf(zzakVar.zza));
                contentValues.put("daily_events_count", Long.valueOf(zzakVar.zzb));
                contentValues.put("daily_conversions_count", Long.valueOf(zzakVar.zzc));
                contentValues.put("daily_error_events_count", Long.valueOf(zzakVar.zzd));
                contentValues.put("daily_realtime_events_count", Long.valueOf(zzakVar.zze));
                zzh2.update("apps", contentValues, "app_id=?", strArr);
                if (query != null) {
                    query.close();
                }
                return zzakVar;
            } catch (SQLiteException e) {
                this.zzt.zzay().zzd().zzc("Error updating daily counts. appId", zzeh.zzn(str), e);
                if (0 != 0) {
                    cursor.close();
                }
                return zzakVar;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzas zzn(String str, String str2) {
        Cursor cursor;
        Cursor cursor2;
        Boolean bool;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        Cursor cursor3 = null;
        try {
            Cursor query = zzh().query("events", (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                if (!query.moveToFirst()) {
                    if (query != null) {
                        query.close();
                    }
                    return null;
                }
                long j = query.getLong(0);
                long j2 = query.getLong(1);
                long j3 = query.getLong(2);
                long j4 = query.isNull(3) ? 0L : query.getLong(3);
                Long valueOf = query.isNull(4) ? null : Long.valueOf(query.getLong(4));
                Long valueOf2 = query.isNull(5) ? null : Long.valueOf(query.getLong(5));
                Long valueOf3 = query.isNull(6) ? null : Long.valueOf(query.getLong(6));
                if (query.isNull(7)) {
                    bool = null;
                } else {
                    bool = Boolean.valueOf(query.getLong(7) == 1);
                }
                cursor2 = query;
                try {
                    zzas zzasVar = new zzas(str, str2, j, j2, query.isNull(8) ? 0L : query.getLong(8), j3, j4, valueOf, valueOf2, valueOf3, bool);
                    if (cursor2.moveToNext()) {
                        this.zzt.zzay().zzd().zzb("Got multiple records for event aggregates, expected one. appId", zzeh.zzn(str));
                    }
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    return zzasVar;
                } catch (SQLiteException e) {
                    e = e;
                    cursor = cursor2;
                    try {
                        this.zzt.zzay().zzd().zzd("Error querying events. appId", zzeh.zzn(str), this.zzt.zzj().zzd(str2), e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        cursor3 = cursor;
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor3 = cursor2;
                    if (cursor3 != null) {
                    }
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursor2 = query;
            } catch (Throwable th3) {
                th = th3;
                cursor2 = query;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00a9: MOVE (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:30:0x00a9 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzky zzp(String str, String str2) {
        Cursor cursor;
        Cursor cursor2;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        Cursor cursor3 = null;
        try {
            try {
                cursor = zzh().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursor.moveToFirst()) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    long j = cursor.getLong(0);
                    Object zzq = zzq(cursor, 1);
                    if (zzq == null) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    zzky zzkyVar = new zzky(str, cursor.getString(2), str2, j, zzq);
                    if (cursor.moveToNext()) {
                        this.zzt.zzay().zzd().zzb("Got multiple records for user property, expected one. appId", zzeh.zzn(str));
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return zzkyVar;
                } catch (SQLiteException e) {
                    e = e;
                    this.zzt.zzay().zzd().zzd("Error querying user property. appId", zzeh.zzn(str), this.zzt.zzj().zzf(str2), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
    }

    final Object zzq(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            this.zzt.zzay().zzd().zza("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type != 4) {
            this.zzt.zzay().zzd().zzb("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        this.zzt.zzay().zzd().zza("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String zzr() {
        SQLiteException e;
        Cursor cursor;
        Cursor cursor2 = null;
        try {
            cursor = zzh().rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
            try {
                try {
                    if (!cursor.moveToFirst()) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    String string = cursor.getString(0);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return string;
                } catch (SQLiteException e2) {
                    e = e2;
                    this.zzt.zzay().zzd().zzb("Database error getting next bundle app id", e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                cursor2 = cursor;
                th = th;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    public final List zzs(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat(Marker.ANY_MARKER));
            sb.append(" and name glob ?");
        }
        return zzt(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        r2 = r27.zzt.zzay().zzd();
        r27.zzt.zzf();
        r2.zzb("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzt(String str, String[] strArr) {
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase zzh2 = zzh();
                String[] strArr2 = {"app_id", "origin", "name", "value", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"};
                this.zzt.zzf();
                cursor = zzh2.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", "1001");
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return arrayList;
                }
                while (true) {
                    int size = arrayList.size();
                    this.zzt.zzf();
                    if (size >= 1000) {
                        break;
                    }
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    String string3 = cursor.getString(2);
                    Object zzq = zzq(cursor, 3);
                    boolean z = cursor.getInt(4) != 0;
                    String string4 = cursor.getString(5);
                    long j = cursor.getLong(6);
                    zzaw zzawVar = (zzaw) this.zzf.zzu().zzh(cursor.getBlob(7), zzaw.CREATOR);
                    arrayList.add(new zzac(string, string2, new zzkw(string3, cursor.getLong(10), zzq, string2), cursor.getLong(8), z, string4, zzawVar, j, (zzaw) this.zzf.zzu().zzh(cursor.getBlob(9), zzaw.CREATOR), cursor.getLong(11), (zzaw) this.zzf.zzu().zzh(cursor.getBlob(12), zzaw.CREATOR)));
                    if (!cursor.moveToNext()) {
                        break;
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            } catch (SQLiteException e) {
                this.zzt.zzay().zzd().zzb("Error querying conditional user property value", e);
                List emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final List zzu(String str) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                this.zzt.zzf();
                cursor = zzh().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j = cursor.getLong(2);
                    Object zzq = zzq(cursor, 3);
                    if (zzq == null) {
                        this.zzt.zzay().zzd().zzb("Read invalid user property value, ignoring it. appId", zzeh.zzn(str));
                    } else {
                        arrayList.add(new zzky(str, str2, string, j, zzq));
                    }
                } while (cursor.moveToNext());
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            } catch (SQLiteException e) {
                this.zzt.zzay().zzd().zzc("Error querying user properties. appId", zzeh.zzn(str), e);
                List emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a9, code lost:
    
        r0 = r17.zzt.zzay().zzd();
        r17.zzt.zzf();
        r0.zzb("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzv(String str, String str2, String str3) {
        String str4;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                ArrayList arrayList2 = new ArrayList(3);
                try {
                    arrayList2.add(str);
                    StringBuilder sb = new StringBuilder("app_id=?");
                    if (TextUtils.isEmpty(str2)) {
                        str4 = str2;
                    } else {
                        str4 = str2;
                        try {
                            arrayList2.add(str4);
                            sb.append(" and origin=?");
                        } catch (SQLiteException e) {
                            e = e;
                            this.zzt.zzay().zzd().zzd("(2)Error querying user properties", zzeh.zzn(str), str4, e);
                            List emptyList = Collections.emptyList();
                            if (cursor != null) {
                            }
                            return emptyList;
                        }
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        arrayList2.add(str3 + Marker.ANY_MARKER);
                        sb.append(" and name glob ?");
                    }
                    String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                    String sb2 = sb.toString();
                    this.zzt.zzf();
                    cursor = zzh().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, sb2, strArr, null, null, "rowid", "1001");
                    if (!cursor.moveToFirst()) {
                        return arrayList;
                    }
                    while (true) {
                        int size = arrayList.size();
                        this.zzt.zzf();
                        if (size < 1000) {
                            String string = cursor.getString(0);
                            long j = cursor.getLong(1);
                            Object zzq = zzq(cursor, 2);
                            str4 = cursor.getString(3);
                            if (zzq == null) {
                                this.zzt.zzay().zzd().zzd("(2)Read invalid user property value, ignoring it", zzeh.zzn(str), str4, str3);
                            } else {
                                arrayList.add(new zzky(str, str4, string, j, zzq));
                            }
                            if (!cursor.moveToNext()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return arrayList;
                } catch (SQLiteException e2) {
                    e = e2;
                    str4 = str2;
                    this.zzt.zzay().zzd().zzd("(2)Error querying user properties", zzeh.zzn(str), str4, e);
                    List emptyList2 = Collections.emptyList();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return emptyList2;
                }
            } catch (SQLiteException e3) {
                e = e3;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public final void zzw() {
        zzW();
        zzh().beginTransaction();
    }

    public final void zzx() {
        zzW();
        zzh().endTransaction();
    }

    final void zzy(List list) {
        zzg();
        zzW();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzI()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (zzZ("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                this.zzt.zzay().zzk().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                zzh().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                this.zzt.zzay().zzd().zzb("Error incrementing retry count. error", e);
            }
        }
    }

    final void zzz() {
        zzg();
        zzW();
        if (zzI()) {
            long zza2 = this.zzf.zzs().zza.zza();
            long elapsedRealtime = this.zzt.zzav().elapsedRealtime();
            long abs = Math.abs(elapsedRealtime - zza2);
            this.zzt.zzf();
            if (abs > ((Long) zzdu.zzx.zza(null)).longValue()) {
                this.zzf.zzs().zza.zzb(elapsedRealtime);
                zzg();
                zzW();
                if (zzI()) {
                    SQLiteDatabase zzh2 = zzh();
                    this.zzt.zzf();
                    int delete = zzh2.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(this.zzt.zzav().currentTimeMillis()), String.valueOf(zzag.zzA())});
                    if (delete > 0) {
                        this.zzt.zzay().zzj().zzb("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }
}
