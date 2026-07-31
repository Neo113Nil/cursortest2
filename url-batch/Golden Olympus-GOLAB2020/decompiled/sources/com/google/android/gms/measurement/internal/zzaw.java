package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzqr;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.ironsource.da;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
final class zzaw extends zzpg {
    private final zzav zzm;
    private final zzou zzn;
    private static final String[] zzb = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    static final String[] zza = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};
    private static final String[] zzc = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzd = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;"};
    private static final String[] zze = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] zzf = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzh = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzi = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzj = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private static final String[] zzk = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    private static final String[] zzl = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    zzaw(zzpv zzpvVar) {
        super(zzpvVar);
        this.zzn = new zzou(this.zzu.zzaU());
        this.zzu.zzf();
        this.zzm = new zzav(this, this.zzu.zzaT(), "google_app_measurement.db");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final zzbd zzaA(String str, String str2, String str3) {
        Cursor cursor;
        Boolean bool;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        zzg();
        zzav();
        Cursor cursor2 = null;
        try {
            cursor = zzj().query(str, (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
            try {
                try {
                } catch (SQLiteException e4) {
                    e = e4;
                    zzio zzioVar = this.zzu;
                    zzioVar.zzaW().zze().zzd("Error querying events. appId", zzhe.zzn(str2), zzioVar.zzj().zzd(str3), e);
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e5) {
            e = e5;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
        if (!cursor.moveToFirst()) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        }
        long j4 = cursor.getLong(0);
        long j5 = cursor.getLong(1);
        long j6 = cursor.getLong(2);
        long j7 = cursor.isNull(3) ? 0L : cursor.getLong(3);
        Long valueOf = cursor.isNull(4) ? null : Long.valueOf(cursor.getLong(4));
        Long valueOf2 = cursor.isNull(5) ? null : Long.valueOf(cursor.getLong(5));
        Long valueOf3 = cursor.isNull(6) ? null : Long.valueOf(cursor.getLong(6));
        if (cursor.isNull(7)) {
            bool = null;
        } else {
            bool = Boolean.valueOf(cursor.getLong(7) == 1);
        }
        zzbd zzbdVar = new zzbd(str2, str3, j4, j5, cursor.isNull(8) ? 0L : cursor.getLong(8), j6, j7, valueOf, valueOf2, valueOf3, bool);
        if (cursor.moveToNext()) {
            this.zzu.zzaW().zze().zzb("Got multiple records for event aggregates, expected one. appId", zzhe.zzn(str2));
        }
        cursor.close();
        return zzbdVar;
    }

    private final zzpz zzaB(String str, long j4, byte[] bArr, String str2, String str3, int i4, int i5, long j5, long j6, long j7) {
        if (TextUtils.isEmpty(str2)) {
            this.zzu.zzaW().zzd().zza("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            com.google.android.gms.internal.measurement.zzht zzhtVar = (com.google.android.gms.internal.measurement.zzht) zzqa.zzp(com.google.android.gms.internal.measurement.zzhv.zzb(), bArr);
            zzmf zzb2 = zzmf.zzb(i4);
            if (zzb2 != zzmf.GOOGLE_SIGNAL && zzb2 != zzmf.GOOGLE_SIGNAL_PENDING && i5 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = zzhtVar.zzj().iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) ((com.google.android.gms.internal.measurement.zzhx) it.next()).zzch();
                    zzhwVar.zzat(i5);
                    arrayList.add((com.google.android.gms.internal.measurement.zzhx) zzhwVar.zzba());
                }
                zzhtVar.zzd();
                zzhtVar.zzb(arrayList);
            }
            HashMap hashMap = new HashMap();
            if (str3 != null) {
                String[] split = str3.split("\r\n");
                int length = split.length;
                int i6 = 0;
                while (true) {
                    if (i6 >= length) {
                        break;
                    }
                    String str4 = split[i6];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] split2 = str4.split("=", 2);
                    if (split2.length != 2) {
                        this.zzu.zzaW().zze().zzb("Invalid upload header: ", str4);
                        break;
                    }
                    hashMap.put(split2[0], split2[1]);
                    i6++;
                }
            }
            zzpx zzpxVar = new zzpx();
            zzpxVar.zzf(j4);
            zzpxVar.zzd((com.google.android.gms.internal.measurement.zzhv) zzhtVar.zzba());
            zzpxVar.zzi(str2);
            zzpxVar.zzg(hashMap);
            zzpxVar.zzh(zzb2);
            zzpxVar.zzb(j5);
            zzpxVar.zza(j6);
            zzpxVar.zzc(j7);
            zzpxVar.zze(i5);
            return zzpxVar.zzj();
        } catch (IOException e4) {
            this.zzu.zzaW().zze().zzc("Failed to queued MeasurementBatch from upload_queue. appId", str, e4);
            return null;
        }
    }

    private final String zzaC() {
        zzio zzioVar = this.zzu;
        long currentTimeMillis = zzioVar.zzaU().currentTimeMillis();
        Locale locale = Locale.US;
        zzmf zzmfVar = zzmf.GOOGLE_SIGNAL;
        Integer valueOf = Integer.valueOf(zzmfVar.zza());
        Long valueOf2 = Long.valueOf(currentTimeMillis);
        zzioVar.zzf();
        Long l4 = (Long) zzgi.zzR.zza(null);
        l4.longValue();
        String format = String.format(locale, "(upload_type = %d AND ABS(creation_timestamp - %d) > %d)", valueOf, valueOf2, l4);
        Integer valueOf3 = Integer.valueOf(zzmfVar.zza());
        zzioVar.zzf();
        return "(" + format + " OR " + String.format(locale, "(upload_type != %d AND ABS(creation_timestamp - %d) > %d)", valueOf3, valueOf2, Long.valueOf(zzam.zzI())) + ")";
    }

    private final String zzaD(String str, String[] strArr, String str2) {
        Cursor cursor = null;
        try {
            try {
                cursor = zzj().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return "";
                }
                String string = cursor.getString(0);
                cursor.close();
                return string;
            } catch (SQLiteException e4) {
                this.zzu.zzaW().zze().zzc("Database error", str, e4);
                throw e4;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private final void zzaE(String str, String str2) {
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzav();
        try {
            zzj().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e4) {
            this.zzu.zzaW().zze().zzc("Error deleting snapshot. appId", zzhe.zzn(str2), e4);
        }
    }

    private final void zzaF(String str, zzbd zzbdVar) {
        Preconditions.checkNotNull(zzbdVar);
        zzg();
        zzav();
        ContentValues contentValues = new ContentValues();
        String str2 = zzbdVar.zza;
        contentValues.put("app_id", str2);
        contentValues.put("name", zzbdVar.zzb);
        contentValues.put("lifetime_count", Long.valueOf(zzbdVar.zzc));
        contentValues.put("current_bundle_count", Long.valueOf(zzbdVar.zzd));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzbdVar.zzf));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzbdVar.zzg));
        contentValues.put("last_bundled_day", zzbdVar.zzh);
        contentValues.put("last_sampled_complex_event_id", zzbdVar.zzi);
        contentValues.put("last_sampling_rate", zzbdVar.zzj);
        contentValues.put("current_session_count", Long.valueOf(zzbdVar.zze));
        Boolean bool = zzbdVar.zzk;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (zzj().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                this.zzu.zzaW().zze().zzb("Failed to insert/update event aggregates (got -1). appId", zzhe.zzn(str2));
            }
        } catch (SQLiteException e4) {
            this.zzu.zzaW().zze().zzc("Error storing event aggregates. appId", zzhe.zzn(zzbdVar.zza), e4);
        }
    }

    private final void zzaG(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase zzj2 = zzj();
            if (contentValues.getAsString("app_id") == null) {
                this.zzu.zzaW().zzf().zzb("Value of the primary key is not set.", zzhe.zzn("app_id"));
                return;
            }
            if (zzj2.update("consent_settings", contentValues, "app_id = ?", new String[]{r1}) == 0 && zzj2.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                this.zzu.zzaW().zze().zzc("Failed to insert/update table (got -1). key", zzhe.zzn("consent_settings"), zzhe.zzn("app_id"));
            }
        } catch (SQLiteException e4) {
            this.zzu.zzaW().zze().zzd("Error storing into table. key", zzhe.zzn("consent_settings"), zzhe.zzn("app_id"), e4);
        }
    }

    private static final String zzaH(List list) {
        return list.isEmpty() ? "" : String.format(" AND (upload_type IN (%s))", TextUtils.join(", ", list));
    }

    static final void zzau(ContentValues contentValues, String str, Object obj) {
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

    private final long zzay(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = zzj().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j4 = rawQuery.getLong(0);
                rawQuery.close();
                return j4;
            } catch (SQLiteException e4) {
                this.zzu.zzaW().zze().zzc("Database error", str, e4);
                throw e4;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzaz(String str, String[] strArr, long j4) {
        Cursor cursor = null;
        try {
            try {
                cursor = zzj().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    j4 = cursor.getLong(0);
                }
                cursor.close();
                return j4;
            } catch (SQLiteException e4) {
                this.zzu.zzaW().zze().zzc("Database error", str, e4);
                throw e4;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String zzA() {
        SQLiteException e4;
        Cursor cursor;
        SQLiteDatabase zzj2 = zzj();
        ?? r12 = 0;
        try {
            try {
                cursor = zzj2.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(0);
                        cursor.close();
                        return string;
                    }
                } catch (SQLiteException e5) {
                    e4 = e5;
                    this.zzu.zzaW().zze().zzb("Database error getting next bundle app id", e4);
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th) {
                r12 = zzj2;
                th = th;
                if (r12 != 0) {
                    r12.close();
                }
                throw th;
            }
        } catch (SQLiteException e6) {
            e4 = e6;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (r12 != 0) {
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    public final List zzB(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzav();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return zzC(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        r2 = r12.zzaW().zze();
        r12.zzf();
        r2.zzb("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzC(String str, String[] strArr) {
        zzg();
        zzav();
        List arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase zzj2 = zzj();
                String[] strArr2 = {"app_id", "origin", "name", "value", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"};
                zzio zzioVar = this.zzu;
                zzioVar.zzf();
                cursor = zzj2.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", "1001");
                if (cursor.moveToFirst()) {
                    while (true) {
                        int size = arrayList.size();
                        zzioVar.zzf();
                        if (size >= 1000) {
                            break;
                        }
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        String string3 = cursor.getString(2);
                        Object zzz = zzz(cursor, 3);
                        boolean z4 = cursor.getInt(4) != 0;
                        String string4 = cursor.getString(5);
                        long j4 = cursor.getLong(6);
                        zzpv zzpvVar = this.zzg;
                        zzqa zzA = zzpvVar.zzA();
                        byte[] blob = cursor.getBlob(7);
                        Parcelable.Creator<zzbh> creator = zzbh.CREATOR;
                        zzbh zzbhVar = (zzbh) zzA.zzi(blob, creator);
                        arrayList.add(new zzai(string, string2, new zzqb(string3, cursor.getLong(10), zzz, string2), cursor.getLong(8), z4, string4, zzbhVar, j4, (zzbh) zzpvVar.zzA().zzi(cursor.getBlob(9), creator), cursor.getLong(11), (zzbh) zzpvVar.zzA().zzi(cursor.getBlob(12), creator)));
                        if (!cursor.moveToNext()) {
                            break;
                        }
                    }
                }
            } catch (SQLiteException e4) {
                this.zzu.zzaW().zze().zzb("Error querying conditional user property value", e4);
                arrayList = Collections.EMPTY_LIST;
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzD(String str, zzpc zzpcVar, int i4) {
        Cursor cursor;
        List list;
        Cursor cursor2;
        Cursor cursor3 = null;
        if (!this.zzu.zzf().zzx(null, zzgi.zzaP)) {
            return Collections.EMPTY_LIST;
        }
        Preconditions.checkNotEmpty(str);
        zzg();
        zzav();
        try {
            try {
                cursor = zzj().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "associated_row_id", "last_upload_timestamp"}, "app_id=?" + zzaH(zzpcVar.zza) + " AND NOT " + zzaC(), new String[]{str}, null, null, "creation_timestamp ASC", i4 > 0 ? String.valueOf(i4) : null);
                try {
                    list = new ArrayList();
                    while (cursor.moveToNext()) {
                        cursor2 = cursor;
                        try {
                            zzpz zzaB = zzaB(str, cursor.getLong(0), cursor.getBlob(2), cursor.getString(3), cursor.getString(4), cursor.getInt(5), cursor.getInt(6), cursor.getLong(7), cursor.getLong(8), cursor.getLong(9));
                            if (zzaB != null) {
                                list.add(zzaB);
                            }
                            cursor = cursor2;
                        } catch (SQLiteException e4) {
                            e = e4;
                            cursor3 = cursor2;
                            this.zzu.zzaW().zze().zzc("Error to querying MeasurementBatch from upload_queue. appId", str, e);
                            list = Collections.EMPTY_LIST;
                            cursor = cursor3;
                            if (cursor != null) {
                            }
                            return list;
                        } catch (Throwable th) {
                            th = th;
                            cursor3 = cursor2;
                            if (cursor3 != null) {
                                cursor3.close();
                            }
                            throw th;
                        }
                    }
                } catch (SQLiteException e5) {
                    e = e5;
                    cursor2 = cursor;
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = cursor;
                }
            } catch (SQLiteException e6) {
                e = e6;
            }
            if (cursor != null) {
                cursor.close();
            }
            return list;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzE(String str) {
        String str2;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzav();
        List arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                zzio zzioVar = this.zzu;
                zzioVar.zzf();
                cursor = zzj().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                try {
                    if (cursor.moveToFirst()) {
                        while (true) {
                            String string = cursor.getString(0);
                            String string2 = cursor.getString(1);
                            if (string2 == null) {
                                string2 = "";
                            }
                            String str3 = string2;
                            long j4 = cursor.getLong(2);
                            Object zzz = zzz(cursor, 3);
                            if (zzz == null) {
                                zzioVar.zzaW().zze().zzb("Read invalid user property value, ignoring it. appId", zzhe.zzn(str));
                                str2 = str;
                            } else {
                                str2 = str;
                                try {
                                    arrayList.add(new zzqd(str2, str3, string, j4, zzz));
                                } catch (SQLiteException e4) {
                                    e = e4;
                                    this.zzu.zzaW().zze().zzc("Error querying user properties. appId", zzhe.zzn(str2), e);
                                    arrayList = Collections.EMPTY_LIST;
                                    if (cursor != null) {
                                    }
                                    return arrayList;
                                }
                            }
                            if (!cursor.moveToNext()) {
                                break;
                            }
                            str = str2;
                        }
                    }
                } catch (SQLiteException e5) {
                    e = e5;
                    str2 = str;
                }
            } catch (SQLiteException e6) {
                e = e6;
                str2 = str;
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a5, code lost:
    
        r0 = r8.zzaW().zze();
        r8.zzf();
        r0.zzb("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0117 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzF(String str, String str2, String str3) {
        String str4;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzav();
        List arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                ArrayList arrayList2 = new ArrayList(3);
                String str5 = str;
                arrayList2.add(str5);
                StringBuilder sb = new StringBuilder("app_id=?");
                if (TextUtils.isEmpty(str2)) {
                    str4 = str2;
                } else {
                    str4 = str2;
                    try {
                        arrayList2.add(str4);
                        sb.append(" and origin=?");
                    } catch (SQLiteException e4) {
                        e = e4;
                        this.zzu.zzaW().zze().zzd("(2)Error querying user properties", zzhe.zzn(str), str4, e);
                        arrayList = Collections.EMPTY_LIST;
                        return arrayList;
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    arrayList2.add(str3 + "*");
                    sb.append(" and name glob ?");
                }
                String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                String sb2 = sb.toString();
                zzio zzioVar = this.zzu;
                zzioVar.zzf();
                cursor = zzj().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, sb2, strArr, null, null, "rowid", "1001");
                if (cursor.moveToFirst()) {
                    while (true) {
                        int size = arrayList.size();
                        zzioVar.zzf();
                        if (size >= 1000) {
                            break;
                        }
                        String string = cursor.getString(0);
                        long j4 = cursor.getLong(1);
                        Object zzz = zzz(cursor, 2);
                        String string2 = cursor.getString(3);
                        if (zzz == null) {
                            try {
                                zzioVar.zzaW().zze().zzd("(2)Read invalid user property value, ignoring it", zzhe.zzn(str5), string2, str3);
                            } catch (SQLiteException e5) {
                                e = e5;
                                str4 = string2;
                                this.zzu.zzaW().zze().zzd("(2)Error querying user properties", zzhe.zzn(str), str4, e);
                                arrayList = Collections.EMPTY_LIST;
                                return arrayList;
                            }
                        } else {
                            arrayList.add(new zzqd(str5, string2, string, j4, zzz));
                        }
                        if (!cursor.moveToNext()) {
                            break;
                        }
                        str5 = str;
                        str4 = string2;
                    }
                }
            } finally {
                if (0 != 0) {
                    cursor.close();
                }
            }
        } catch (SQLiteException e6) {
            e = e6;
            str4 = str2;
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x00ff, code lost:
    
        if (r3 == null) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0126 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzG(String str, Long l4, String str2, Bundle bundle) {
        zzau zzauVar;
        Cursor cursor;
        Object obj;
        Object obj2;
        com.google.android.gms.internal.measurement.zzhx zzhxVar;
        String str3 = str;
        Preconditions.checkNotNull(bundle);
        zzg();
        zzav();
        zzio zzioVar = this.zzu;
        Cursor cursor2 = null;
        zzau zzauVar2 = (!zzioVar.zzf().zzx(null, zzgi.zzbe) || l4 == null) ? new zzau(this, str3) : new zzau(this, str3, l4.longValue());
        List<zzat> zza2 = zzauVar2.zza();
        while (!zza2.isEmpty()) {
            for (zzat zzatVar : zza2) {
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        cursor = zzj().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, Long.toString(zzatVar.zzb)}, null, null, "rowid", "2");
                        try {
                            try {
                            } catch (Throwable th) {
                                th = th;
                                cursor2 = cursor;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e4) {
                            e = e4;
                            obj = cursor2;
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        cursor = cursor2;
                        obj = cursor;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (cursor.moveToFirst()) {
                        try {
                            Object obj3 = (com.google.android.gms.internal.measurement.zzhx) ((com.google.android.gms.internal.measurement.zzhw) zzqa.zzp(com.google.android.gms.internal.measurement.zzhx.zzz(), cursor.getBlob(0))).zzba();
                            try {
                                if (cursor.moveToNext()) {
                                    this.zzu.zzaW().zzk().zzb("Get multiple raw event metadata records, expected one. appId", zzhe.zzn(str3));
                                }
                                cursor.close();
                                obj2 = obj3;
                            } catch (SQLiteException e6) {
                                e = e6;
                                obj = obj3;
                                this.zzu.zzaW().zze().zzc("Data loss. Error selecting raw event. appId", zzhe.zzn(str3), e);
                                zzhxVar = obj;
                                obj2 = obj;
                            }
                            cursor.close();
                            zzhxVar = obj2;
                        } catch (IOException e7) {
                            this.zzu.zzaW().zze().zzc("Data loss. Failed to merge raw event metadata. appId", zzhe.zzn(str3), e7);
                        }
                        if (zzhxVar == 0) {
                            Iterator it = zzhxVar.zzY().iterator();
                            while (it.hasNext()) {
                                if (((com.google.android.gms.internal.measurement.zzio) it.next()).zzg().equals(str2)) {
                                    break;
                                }
                            }
                        }
                    } else {
                        zzioVar.zzaW().zze().zzb("Raw event metadata record is missing. appId", zzhe.zzn(str3));
                    }
                    cursor.close();
                    zzhxVar = cursor2;
                    if (zzhxVar == 0) {
                    }
                }
                zzpv zzpvVar = this.zzg;
                zzqa zzA = zzpvVar.zzA();
                com.google.android.gms.internal.measurement.zzhm zzhmVar = zzatVar.zzd;
                Bundle bundle2 = new Bundle();
                for (com.google.android.gms.internal.measurement.zzhq zzhqVar : zzhmVar.zzi()) {
                    if (zzhqVar.zzu()) {
                        zzauVar = zzauVar2;
                        bundle2.putDouble(zzhqVar.zzg(), zzhqVar.zza());
                    } else {
                        zzauVar = zzauVar2;
                        if (zzhqVar.zzv()) {
                            bundle2.putFloat(zzhqVar.zzg(), zzhqVar.zzb());
                        } else if (zzhqVar.zzw()) {
                            bundle2.putLong(zzhqVar.zzg(), zzhqVar.zzd());
                        } else if (zzhqVar.zzy()) {
                            bundle2.putString(zzhqVar.zzg(), zzhqVar.zzh());
                        } else if (zzhqVar.zzi().isEmpty()) {
                            zzA.zzu.zzaW().zze().zzb("Unexpected parameter type for parameter", zzhqVar);
                        } else {
                            bundle2.putParcelableArray(zzhqVar.zzg(), zzqa.zzC(zzhqVar.zzi()));
                        }
                    }
                    zzauVar2 = zzauVar;
                }
                zzau zzauVar3 = zzauVar2;
                String string = bundle2.getString("_o");
                bundle2.remove("_o");
                String zzh2 = zzhmVar.zzh();
                if (string == null) {
                    string = "";
                }
                zzhf zzhfVar = new zzhf(zzh2, string, bundle2, zzhmVar.zzd());
                zzio zzioVar2 = this.zzu;
                Bundle bundle3 = zzhfVar.zzd;
                zzioVar2.zzw().zzO(bundle3, bundle);
                zzio zzioVar3 = zzioVar;
                zzbc zzbcVar = new zzbc(this.zzu, zzhfVar.zzb, str3, zzhmVar.zzh(), zzhmVar.zzd(), zzhmVar.zzc(), bundle3);
                long j4 = zzatVar.zza;
                long j5 = zzatVar.zzb;
                boolean z4 = zzatVar.zzc;
                zzg();
                zzav();
                Preconditions.checkNotNull(zzbcVar);
                String str4 = zzbcVar.zza;
                Preconditions.checkNotEmpty(str4);
                byte[] zzcd = zzpvVar.zzA().zzm(zzbcVar).zzcd();
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str4);
                contentValues.put("name", zzbcVar.zzb);
                contentValues.put(da.a.f15878d, Long.valueOf(zzbcVar.zzd));
                contentValues.put("metadata_fingerprint", Long.valueOf(j5));
                contentValues.put("data", zzcd);
                contentValues.put("realtime", Integer.valueOf(z4 ? 1 : 0));
                try {
                    long update = zzj().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j4)});
                    if (update != 1) {
                        zzioVar2.zzaW().zze().zzc("Failed to update raw event. appId, updatedRows", zzhe.zzn(str4), Long.valueOf(update));
                    }
                } catch (SQLiteException e8) {
                    this.zzu.zzaW().zze().zzc("Error updating raw event. appId", zzhe.zzn(zzbcVar.zza), e8);
                }
                str3 = str;
                zzauVar2 = zzauVar3;
                zzioVar = zzioVar3;
                cursor2 = null;
            }
            zzau zzauVar4 = zzauVar2;
            zza2 = zzauVar4.zza();
            str3 = str;
            zzauVar2 = zzauVar4;
            cursor2 = null;
        }
    }

    public final void zzH() {
        zzav();
        zzj().beginTransaction();
    }

    public final void zzI(String str) {
        zzbd zzaA;
        zzaE("events_snapshot", str);
        Cursor cursor = null;
        try {
            try {
                cursor = zzj().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        if (string != null && (zzaA = zzaA("events", str, string)) != null) {
                            zzaF("events_snapshot", zzaA);
                        }
                    } while (cursor.moveToNext());
                }
            } catch (SQLiteException e4) {
                this.zzu.zzaW().zze().zzc("Error creating snapshot. appId", zzhe.zzn(str), e4);
            }
            if (cursor != null) {
                cursor.close();
            }
        } finally {
        }
    }

    public final void zzJ(List list) {
        Preconditions.checkNotNull(list);
        zzg();
        zzav();
        StringBuilder sb = new StringBuilder("rowid in (");
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (i4 != 0) {
                sb.append(StringUtils.COMMA);
            }
            sb.append(((Long) list.get(i4)).longValue());
        }
        sb.append(")");
        int delete = zzj().delete("raw_events", sb.toString(), null);
        if (delete != list.size()) {
            this.zzu.zzaW().zze().zzc("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(list.size()));
        }
    }

    public final void zzK(Long l4) {
        zzg();
        zzav();
        Preconditions.checkNotNull(l4);
        zzio zzioVar = this.zzu;
        if (zzioVar.zzf().zzx(null, zzgi.zzaM)) {
            try {
                if (zzj().delete("upload_queue", "rowid=?", new String[]{l4.toString()}) != 1) {
                    zzioVar.zzaW().zzk().zza("Deleted fewer rows from upload_queue than expected");
                }
            } catch (SQLiteException e4) {
                this.zzu.zzaW().zze().zzb("Failed to delete a MeasurementBatch in a upload_queue table", e4);
                throw e4;
            }
        }
    }

    public final void zzL() {
        zzav();
        zzj().endTransaction();
    }

    final void zzM(List list) {
        zzg();
        zzav();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzae()) {
            String str = "(" + TextUtils.join(StringUtils.COMMA, list) + ")";
            if (zzay("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                this.zzu.zzaW().zzk().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                zzj().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e4) {
                this.zzu.zzaW().zze().zzb("Error incrementing retry count. error", e4);
            }
        }
    }

    final void zzN(Long l4) {
        String str;
        zzg();
        zzav();
        Preconditions.checkNotNull(l4);
        zzio zzioVar = this.zzu;
        if (zzioVar.zzf().zzx(null, zzgi.zzaM) && zzae()) {
            if (zzay("SELECT COUNT(1) FROM upload_queue WHERE rowid = " + l4 + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                zzioVar.zzaW().zzk().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase zzj2 = zzj();
                if (zzioVar.zzf().zzx(null, zzgi.zzaP)) {
                    str = " SET retry_count = retry_count + 1, last_upload_timestamp = " + zzioVar.zzaU().currentTimeMillis();
                } else {
                    str = " SET retry_count = retry_count + 1 ";
                }
                zzj2.execSQL("UPDATE upload_queue" + str + " WHERE rowid = " + l4 + " AND retry_count < 2147483647");
            } catch (SQLiteException e4) {
                this.zzu.zzaW().zze().zzb("Error incrementing retry count. error", e4);
            }
        }
    }

    final void zzO() {
        zzg();
        zzav();
        if (zzae()) {
            zzpv zzpvVar = this.zzg;
            long zza2 = zzpvVar.zzw().zza.zza();
            zzio zzioVar = this.zzu;
            long elapsedRealtime = zzioVar.zzaU().elapsedRealtime();
            long abs = Math.abs(elapsedRealtime - zza2);
            zzioVar.zzf();
            if (abs > zzam.zzJ()) {
                zzpvVar.zzw().zza.zzb(elapsedRealtime);
                zzg();
                zzav();
                if (zzae()) {
                    SQLiteDatabase zzj2 = zzj();
                    String valueOf = String.valueOf(zzioVar.zzaU().currentTimeMillis());
                    zzioVar.zzf();
                    int delete = zzj2.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{valueOf, String.valueOf(zzam.zzI())});
                    if (delete > 0) {
                        zzioVar.zzaW().zzj().zzb("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    public final void zzP(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzav();
        try {
            zzj().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e4) {
            zzio zzioVar = this.zzu;
            zzioVar.zzaW().zze().zzd("Error deleting user property. appId", zzhe.zzn(str), zzioVar.zzj().zzf(str2), e4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
    
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        zzaF("events", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c0, code lost:
    
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzQ(String str) {
        boolean z4;
        zzbd zzaA;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        zzbd zzaA2 = zzaA("events", str, "_f");
        zzbd zzaA3 = zzaA("events", str, "_v");
        zzaE("events", str);
        Cursor cursor = null;
        boolean z5 = false;
        try {
            cursor = zzj().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
        } catch (SQLiteException e4) {
            e = e4;
            z4 = false;
        } catch (Throwable th) {
            th = th;
            z4 = false;
        }
        if (!cursor.moveToFirst()) {
            cursor.close();
            if (zzaA2 == null) {
            }
            zzaF("events", zzaA2);
            zzaE("events_snapshot", str);
        }
        boolean z6 = false;
        z4 = false;
        do {
            try {
                String string = cursor.getString(0);
                if (cursor.getLong(1) >= 1) {
                    if ("_f".equals(string)) {
                        z6 = true;
                    } else if ("_v".equals(string)) {
                        z4 = true;
                    }
                }
                if (string != null && (zzaA = zzaA("events_snapshot", str, string)) != null) {
                    zzaF("events", zzaA);
                }
            } catch (SQLiteException e5) {
                e = e5;
                z5 = z6;
                try {
                    this.zzu.zzaW().zze().zzc("Error querying snapshot. appId", zzhe.zzn(str), e);
                    z6 = z5;
                    if (cursor != null) {
                    }
                    if (!z6) {
                    }
                    if (!z4) {
                    }
                    zzaE("events_snapshot", str);
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (z5 && zzaA2 != null) {
                        zzaF("events", zzaA2);
                    } else if (!z4 && zzaA3 != null) {
                        zzaF("events", zzaA3);
                    }
                    zzaE("events_snapshot", str);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                z5 = z6;
                if (cursor != null) {
                }
                if (z5) {
                }
                if (!z4) {
                    zzaF("events", zzaA3);
                }
                zzaE("events_snapshot", str);
                throw th;
            }
        } while (cursor.moveToNext());
        if (cursor != null) {
            cursor.close();
        }
        if (!z6 || zzaA2 == null) {
            if (!z4) {
            }
            zzaE("events_snapshot", str);
        }
        zzaF("events", zzaA2);
        zzaE("events_snapshot", str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0287, code lost:
    
        r22.zzu.zzaW().zze().zzc("Error storing event filter. appId", com.google.android.gms.measurement.internal.zzhe.zzn(r23), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x037e, code lost:
    
        zzav();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r23);
        r0 = zzj();
        r0.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r23, java.lang.String.valueOf(r10)});
        r0.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r23, java.lang.String.valueOf(r10)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x03a1, code lost:
    
        r7 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0256, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x023a, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0237, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0483, code lost:
    
        r20.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0486, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01e1, code lost:
    
        r0 = r22.zzu.zzaW().zzk();
        r11 = com.google.android.gms.measurement.internal.zzhe.zzn(r23);
        r13 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01f9, code lost:
    
        if (r12.zzp() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01fb, code lost:
    
        r16 = java.lang.Integer.valueOf(r12.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0208, code lost:
    
        r0.zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r11, r13, java.lang.String.valueOf(r16));
        r20 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0206, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x029c, code lost:
    
        r20 = r7;
        r3 = r19.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02aa, code lost:
    
        if (r3.hasNext() == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02ac, code lost:
    
        r7 = (com.google.android.gms.internal.measurement.zzfr) r3.next();
        zzav();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r23);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02c6, code lost:
    
        if (r7.zze().isEmpty() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02f8, code lost:
    
        r11 = r7.zzcd();
        r12 = new android.content.ContentValues();
        r12.put(r0, r23);
        r19 = r0;
        r12.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0311, code lost:
    
        if (r7.zzj() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0313, code lost:
    
        r0 = java.lang.Integer.valueOf(r7.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x031d, code lost:
    
        r12.put("filter_id", r0);
        r21 = r3;
        r12.put("property_name", r7.zze());
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x032f, code lost:
    
        if (r7.zzk() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0331, code lost:
    
        r3 = java.lang.Boolean.valueOf(r7.zzi());
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x033b, code lost:
    
        r12.put("session_scoped", r3);
        r12.put("data", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x034d, code lost:
    
        if (zzj().insertWithOnConflict("property_filters", null, r12, 5) != (-1)) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0365, code lost:
    
        r0 = r19;
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x034f, code lost:
    
        r22.zzu.zzaW().zze().zzb("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.zzhe.zzn(r23));
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0363, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x036b, code lost:
    
        r22.zzu.zzaW().zze().zzc("Error storing property filter. appId", com.google.android.gms.measurement.internal.zzhe.zzn(r23), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x033a, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x031c, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02c8, code lost:
    
        r0 = r22.zzu.zzaW().zzk();
        r9 = com.google.android.gms.measurement.internal.zzhe.zzn(r23);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02e0, code lost:
    
        if (r7.zzj() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02e2, code lost:
    
        r16 = java.lang.Integer.valueOf(r7.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02ef, code lost:
    
        r0.zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r9, r11, java.lang.String.valueOf(r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02ed, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0176, code lost:
    
        r11 = r0.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0182, code lost:
    
        if (r11.hasNext() == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018e, code lost:
    
        if (((com.google.android.gms.internal.measurement.zzfr) r11.next()).zzj() != false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0190, code lost:
    
        r22.zzu.zzaW().zzk().zzc("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.zzhe.zzn(r23), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a9, code lost:
    
        r11 = r0.zzg().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b5, code lost:
    
        r19 = r0;
        r0 = "app_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c3, code lost:
    
        if (r11.hasNext() == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c5, code lost:
    
        r12 = (com.google.android.gms.internal.measurement.zzfj) r11.next();
        zzav();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r23);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01df, code lost:
    
        if (r12.zzg().isEmpty() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0213, code lost:
    
        r3 = r12.zzcd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0217, code lost:
    
        r20 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0219, code lost:
    
        r7 = new android.content.ContentValues();
        r7.put("app_id", r23);
        r7.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x022c, code lost:
    
        if (r12.zzp() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x022e, code lost:
    
        r0 = java.lang.Integer.valueOf(r12.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x023b, code lost:
    
        r7.put("filter_id", r0);
        r7.put("event_name", r12.zzg());
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x024b, code lost:
    
        if (r12.zzq() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x024d, code lost:
    
        r0 = java.lang.Boolean.valueOf(r12.zzn());
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0257, code lost:
    
        r7.put("session_scoped", r0);
        r7.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0269, code lost:
    
        if (zzj().insertWithOnConflict("event_filters", null, r7, 5) != (-1)) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x026b, code lost:
    
        r22.zzu.zzaW().zze().zzb("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.zzhe.zzn(r23));
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x027e, code lost:
    
        r0 = r19;
        r7 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0286, code lost:
    
        r0 = move-exception;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzR(String str, List list) {
        SQLiteDatabase sQLiteDatabase;
        boolean z4;
        Preconditions.checkNotNull(list);
        for (int i4 = 0; i4 < list.size(); i4++) {
            com.google.android.gms.internal.measurement.zzfg zzfgVar = (com.google.android.gms.internal.measurement.zzfg) ((com.google.android.gms.internal.measurement.zzfh) list.get(i4)).zzch();
            if (zzfgVar.zza() != 0) {
                for (int i5 = 0; i5 < zzfgVar.zza(); i5++) {
                    com.google.android.gms.internal.measurement.zzfi zzfiVar = (com.google.android.gms.internal.measurement.zzfi) zzfgVar.zze(i5).zzch();
                    com.google.android.gms.internal.measurement.zzfi zzfiVar2 = (com.google.android.gms.internal.measurement.zzfi) zzfiVar.clone();
                    String zzb2 = zzjy.zzb(zzfiVar.zze());
                    if (zzb2 != null) {
                        zzfiVar2.zzb(zzb2);
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    int i6 = 0;
                    while (i6 < zzfiVar.zza()) {
                        com.google.android.gms.internal.measurement.zzfl zzd2 = zzfiVar.zzd(i6);
                        com.google.android.gms.internal.measurement.zzfi zzfiVar3 = zzfiVar;
                        boolean z5 = z4;
                        String zzb3 = zzmg.zzb(zzd2.zze(), zzjz.zza, zzjz.zzb);
                        if (zzb3 != null) {
                            com.google.android.gms.internal.measurement.zzfk zzfkVar = (com.google.android.gms.internal.measurement.zzfk) zzd2.zzch();
                            zzfkVar.zza(zzb3);
                            zzfiVar2.zzc(i6, (com.google.android.gms.internal.measurement.zzfl) zzfkVar.zzba());
                            z4 = true;
                        } else {
                            z4 = z5;
                        }
                        i6++;
                        zzfiVar = zzfiVar3;
                    }
                    if (z4) {
                        zzfgVar.zzc(i5, zzfiVar2);
                        list.set(i4, (com.google.android.gms.internal.measurement.zzfh) zzfgVar.zzba());
                    }
                }
            }
            if (zzfgVar.zzb() != 0) {
                for (int i7 = 0; i7 < zzfgVar.zzb(); i7++) {
                    com.google.android.gms.internal.measurement.zzfr zzf2 = zzfgVar.zzf(i7);
                    String zzb4 = zzmg.zzb(zzf2.zze(), zzka.zza, zzka.zzb);
                    if (zzb4 != null) {
                        com.google.android.gms.internal.measurement.zzfq zzfqVar = (com.google.android.gms.internal.measurement.zzfq) zzf2.zzch();
                        zzfqVar.zza(zzb4);
                        zzfgVar.zzd(i7, zzfqVar);
                        list.set(i4, (com.google.android.gms.internal.measurement.zzfh) zzfgVar.zzba());
                    }
                }
            }
        }
        zzav();
        zzg();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        SQLiteDatabase zzj2 = zzj();
        zzj2.beginTransaction();
        try {
            zzav();
            zzg();
            Preconditions.checkNotEmpty(str);
            SQLiteDatabase zzj3 = zzj();
            zzj3.delete("property_filters", "app_id=?", new String[]{str});
            zzj3.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.measurement.zzfh zzfhVar = (com.google.android.gms.internal.measurement.zzfh) it.next();
                zzav();
                zzg();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(zzfhVar);
                if (zzfhVar.zzk()) {
                    int zza2 = zzfhVar.zza();
                    Iterator it2 = zzfhVar.zzg().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!((com.google.android.gms.internal.measurement.zzfj) it2.next()).zzp()) {
                                this.zzu.zzaW().zzk().zzc("Event filter with no ID. Audience definition ignored. appId, audienceId", zzhe.zzn(str), Integer.valueOf(zza2));
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    this.zzu.zzaW().zzk().zzb("Audience with no ID. appId", zzhe.zzn(str));
                }
            }
            sQLiteDatabase = zzj2;
            ArrayList arrayList = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                com.google.android.gms.internal.measurement.zzfh zzfhVar2 = (com.google.android.gms.internal.measurement.zzfh) it3.next();
                arrayList.add(zzfhVar2.zzk() ? Integer.valueOf(zzfhVar2.zza()) : null);
            }
            Preconditions.checkNotEmpty(str);
            zzav();
            zzg();
            SQLiteDatabase zzj4 = zzj();
            try {
                long zzay = zzay("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int i8 = 0;
                int max = Math.max(0, Math.min(2000, this.zzu.zzf().zzh(str, zzgi.zzT)));
                if (zzay > max) {
                    ArrayList arrayList2 = new ArrayList();
                    while (true) {
                        if (i8 >= arrayList.size()) {
                            zzj4.delete("audience_filter_values", "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in " + ("(" + TextUtils.join(StringUtils.COMMA, arrayList2) + ")") + " order by rowid desc limit -1 offset ?)", new String[]{str, Integer.toString(max)});
                            break;
                        }
                        Integer num = (Integer) arrayList.get(i8);
                        if (num == null) {
                            break;
                        }
                        arrayList2.add(Integer.toString(num.intValue()));
                        i8++;
                    }
                }
            } catch (SQLiteException e4) {
                this.zzu.zzaW().zze().zzc("Database error querying filters. appId", zzhe.zzn(str), e4);
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (Throwable th) {
            th = th;
            sQLiteDatabase = zzj2;
        }
    }

    public final void zzS() {
        zzav();
        zzj().setTransactionSuccessful();
    }

    public final void zzT(zzh zzhVar, boolean z4, boolean z5) {
        Preconditions.checkNotNull(zzhVar);
        zzg();
        zzav();
        String zzC = zzhVar.zzC();
        Preconditions.checkNotNull(zzC);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzC);
        if (z4) {
            contentValues.put("app_instance_id", (String) null);
        } else if (this.zzg.zzu(zzC).zzr(zzjw.ANALYTICS_STORAGE)) {
            contentValues.put("app_instance_id", zzhVar.zzD());
        }
        contentValues.put("gmp_app_id", zzhVar.zzH());
        zzpv zzpvVar = this.zzg;
        if (zzpvVar.zzu(zzC).zzr(zzjw.AD_STORAGE)) {
            contentValues.put("resettable_device_id_hash", zzhVar.zzJ());
        }
        contentValues.put("last_bundle_index", Long.valueOf(zzhVar.zzt()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzhVar.zzu()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzhVar.zzs()));
        contentValues.put("app_version", zzhVar.zzF());
        contentValues.put("app_store", zzhVar.zzE());
        contentValues.put("gmp_version", Long.valueOf(zzhVar.zzq()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzhVar.zzn()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzhVar.zzaJ()));
        contentValues.put("day", Long.valueOf(zzhVar.zzm()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzhVar.zzk()));
        contentValues.put("daily_events_count", Long.valueOf(zzhVar.zzj()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzhVar.zzh()));
        contentValues.put("config_fetched_time", Long.valueOf(zzhVar.zzg()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzhVar.zzp()));
        contentValues.put("app_version_int", Long.valueOf(zzhVar.zze()));
        contentValues.put("firebase_instance_id", zzhVar.zzG());
        contentValues.put("daily_error_events_count", Long.valueOf(zzhVar.zzi()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzhVar.zzl()));
        contentValues.put("health_monitor_sample", zzhVar.zzI());
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzhVar.zzaI()));
        contentValues.put("admob_app_id", zzhVar.zzA());
        contentValues.put("dynamite_version", Long.valueOf(zzhVar.zzo()));
        if (zzpvVar.zzu(zzC).zzr(zzjw.ANALYTICS_STORAGE)) {
            contentValues.put("session_stitching_token", zzhVar.zzL());
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(zzhVar.zzaL()));
        contentValues.put("target_os_version", Long.valueOf(zzhVar.zzw()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(zzhVar.zzv()));
        zzqr.zzb();
        zzio zzioVar = this.zzu;
        if (zzioVar.zzf().zzx(zzC, zzgi.zzaV)) {
            contentValues.put("ad_services_version", Integer.valueOf(zzhVar.zza()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(zzhVar.zzf()));
        }
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(zzhVar.zzaM()));
        contentValues.put("npa_metadata_value", zzhVar.zzx());
        contentValues.put("bundle_delivery_index", Long.valueOf(zzhVar.zzr()));
        contentValues.put("sgtm_preview_key", zzhVar.zzM());
        contentValues.put("dma_consent_state", Integer.valueOf(zzhVar.zzd()));
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(zzhVar.zzc()));
        contentValues.put("serialized_npa_metadata", zzhVar.zzK());
        if (zzioVar.zzf().zzx(zzC, zzgi.zzaP)) {
            contentValues.put("client_upload_eligibility", Integer.valueOf(zzhVar.zzb()));
        }
        List zzN = zzhVar.zzN();
        if (zzN != null) {
            if (zzN.isEmpty()) {
                zzioVar.zzaW().zzk().zzb("Safelisted events should not be an empty list. appId", zzC);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(StringUtils.COMMA, zzN));
            }
        }
        com.google.android.gms.internal.measurement.zzpn.zzb();
        if (zzioVar.zzf().zzx(null, zzgi.zzaJ) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        contentValues.put("unmatched_pfo", zzhVar.zzy());
        contentValues.put("unmatched_uwa", zzhVar.zzz());
        contentValues.put("ad_campaign_info", zzhVar.zzaN());
        try {
            SQLiteDatabase zzj2 = zzj();
            if (zzj2.update("apps", contentValues, "app_id = ?", new String[]{zzC}) == 0 && zzj2.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                zzioVar.zzaW().zze().zzb("Failed to insert/update app (got -1). appId", zzhe.zzn(zzC));
            }
        } catch (SQLiteException e4) {
            this.zzu.zzaW().zze().zzc("Error storing app. appId", zzhe.zzn(zzC), e4);
        }
    }

    public final void zzU(String str, zzba zzbaVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzbaVar);
        zzg();
        zzav();
        zzjx zzu = zzu(str);
        zzjx zzjxVar = zzjx.zza;
        if (zzu == zzjxVar) {
            zzX(str, zzjxVar);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", zzbaVar.zzj());
        zzaG("consent_settings", "app_id", contentValues);
    }

    public final void zzV(zzbd zzbdVar) {
        zzaF("events", zzbdVar);
    }

    public final void zzW(String str, zzjx zzjxVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzjxVar);
        zzg();
        zzav();
        zzX(str, zzu(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", zzjxVar.zzq());
        zzaG("consent_settings", "app_id", contentValues);
    }

    public final void zzX(String str, zzjx zzjxVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzjxVar);
        zzg();
        zzav();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzjxVar.zzq());
        contentValues.put("consent_source", Integer.valueOf(zzjxVar.zzb()));
        zzaG("consent_settings", "app_id", contentValues);
    }

    public final boolean zzY(String str) {
        zzio zzioVar = this.zzu;
        if (zzioVar.zzf().zzx(null, zzgi.zzaM)) {
            if (zzioVar.zzf().zzx(null, zzgi.zzaP)) {
                zzmf[] zzmfVarArr = {zzmf.GOOGLE_SIGNAL};
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(Integer.valueOf(zzmfVarArr[0].zza()));
                String zzaH = zzaH(arrayList);
                String zzaC = zzaC();
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
                sb.append(zzaH);
                sb.append(" AND NOT ");
                sb.append(zzaC);
                return zzay(sb.toString(), new String[]{str}) != 0;
            }
            if (zzay("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=? AND NOT ".concat(zzaC()), new String[]{str}) != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzZ(String str, String str2) {
        return zzay("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final int zza(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzav();
        try {
            return zzj().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e4) {
            zzio zzioVar = this.zzu;
            zzioVar.zzaW().zze().zzd("Error deleting conditional property", zzhe.zzn(str), zzioVar.zzj().zzf(str2), e4);
            return 0;
        }
    }

    public final boolean zzaa() {
        return zzay("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean zzab() {
        return zzay("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final boolean zzac() {
        return zzay("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    public final boolean zzad(String str, zzov zzovVar) {
        zzg();
        zzav();
        Preconditions.checkNotNull(zzovVar);
        Preconditions.checkNotEmpty(str);
        zzio zzioVar = this.zzu;
        long currentTimeMillis = zzioVar.zzaU().currentTimeMillis();
        zzgg zzggVar = zzgi.zzau;
        long longValue = currentTimeMillis - ((Long) zzggVar.zza(null)).longValue();
        long j4 = zzovVar.zzb;
        if (j4 < longValue || j4 > ((Long) zzggVar.zza(null)).longValue() + currentTimeMillis) {
            zzioVar.zzaW().zzk().zzd("Storing trigger URI outside of the max retention time span. appId, now, timestamp", zzhe.zzn(str), Long.valueOf(currentTimeMillis), Long.valueOf(j4));
        }
        zzioVar.zzaW().zzj().zza("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", zzovVar.zza);
        contentValues.put("source", Integer.valueOf(zzovVar.zzc));
        contentValues.put("timestamp_millis", Long.valueOf(j4));
        try {
            if (zzj().insert("trigger_uris", null, contentValues) != -1) {
                return true;
            }
            zzioVar.zzaW().zze().zzb("Failed to insert trigger URI (got -1). appId", zzhe.zzn(str));
            return false;
        } catch (SQLiteException e4) {
            this.zzu.zzaW().zze().zzc("Error storing trigger URI. appId", zzhe.zzn(str), e4);
            return false;
        }
    }

    protected final boolean zzae() {
        zzio zzioVar = this.zzu;
        Context zzaT = zzioVar.zzaT();
        zzioVar.zzf();
        return zzaT.getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean zzaf(String str, Long l4, long j4, com.google.android.gms.internal.measurement.zzhm zzhmVar) {
        zzg();
        zzav();
        Preconditions.checkNotNull(zzhmVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l4);
        zzio zzioVar = this.zzu;
        byte[] zzcd = zzhmVar.zzcd();
        zzioVar.zzaW().zzj().zzc("Saving complex main event, appId, data size", zzioVar.zzj().zzd(str), Integer.valueOf(zzcd.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l4);
        contentValues.put("children_to_process", Long.valueOf(j4));
        contentValues.put("main_event", zzcd);
        try {
            if (zzj().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzioVar.zzaW().zze().zzb("Failed to insert complex main event (got -1). appId", zzhe.zzn(str));
            return false;
        } catch (SQLiteException e4) {
            this.zzu.zzaW().zze().zzc("Error storing complex main event. appId", zzhe.zzn(str), e4);
            return false;
        }
    }

    final boolean zzag(String str, long j4) {
        zzio zzioVar = this.zzu;
        if (!zzioVar.zzf().zzx(null, zzgi.zzbe) && zzioVar.zzaU().currentTimeMillis() > 15000 + j4) {
            return false;
        }
        try {
            if (zzaz("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j4)}, 0L) > 0) {
                return false;
            }
            return zzaz("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j4)}, 0L) > 0;
        } catch (SQLiteException e4) {
            this.zzu.zzaW().zze().zzb("Error checking backfill conditions", e4);
            return false;
        }
    }

    public final boolean zzah(zzai zzaiVar) {
        Preconditions.checkNotNull(zzaiVar);
        zzg();
        zzav();
        String str = zzaiVar.zza;
        Preconditions.checkNotNull(str);
        if (zzy(str, zzaiVar.zzc.zzb) == null) {
            long zzay = zzay("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.zzu.zzf();
            if (zzay >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzaiVar.zzb);
        contentValues.put("name", zzaiVar.zzc.zzb);
        zzau(contentValues, "value", Preconditions.checkNotNull(zzaiVar.zzc.zza()));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzaiVar.zze));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzaiVar.zzf);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzaiVar.zzh));
        zzio zzioVar = this.zzu;
        contentValues.put("timed_out_event", zzioVar.zzw().zzay(zzaiVar.zzg));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzaiVar.zzd));
        contentValues.put("triggered_event", zzioVar.zzw().zzay(zzaiVar.zzi));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzaiVar.zzc.zzc));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzaiVar.zzj));
        contentValues.put("expired_event", zzioVar.zzw().zzay(zzaiVar.zzk));
        try {
            if (zzj().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            zzioVar.zzaW().zze().zzb("Failed to insert/update conditional user property (got -1)", zzhe.zzn(str));
            return true;
        } catch (SQLiteException e4) {
            this.zzu.zzaW().zze().zzc("Error storing conditional user property", zzhe.zzn(str), e4);
            return true;
        }
    }

    public final boolean zzai(zzqd zzqdVar) {
        Preconditions.checkNotNull(zzqdVar);
        zzg();
        zzav();
        String str = zzqdVar.zza;
        String str2 = zzqdVar.zzc;
        if (zzy(str, str2) == null) {
            if (zzqf.zzaq(str2)) {
                if (zzay("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= this.zzu.zzf().zzi(str, zzgi.zzU, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(str2)) {
                long zzay = zzay("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, zzqdVar.zzb});
                this.zzu.zzf();
                if (zzay >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzqdVar.zzb);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(zzqdVar.zzd));
        zzau(contentValues, "value", zzqdVar.zze);
        try {
            if (zzj().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            this.zzu.zzaW().zze().zzb("Failed to insert/update user property (got -1). appId", zzhe.zzn(str));
            return true;
        } catch (SQLiteException e4) {
            this.zzu.zzaW().zze().zzc("Error storing user property. appId", zzhe.zzn(zzqdVar.zza), e4);
            return true;
        }
    }

    /* JADX WARN: Not initialized variable reg: 15, insn: 0x01ee: MOVE (r3 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]) (LINE:495), block:B:110:0x01ee */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ec A[Catch: all -> 0x0101, SQLiteException -> 0x0104, TryCatch #1 {all -> 0x0101, blocks: (B:29:0x00e6, B:31:0x00ec, B:33:0x0107, B:35:0x010b, B:36:0x011b, B:38:0x0121, B:39:0x0134, B:41:0x0140, B:43:0x0154, B:67:0x01fd, B:74:0x014d, B:77:0x01d9), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0107 A[Catch: all -> 0x0101, SQLiteException -> 0x0104, TRY_LEAVE, TryCatch #1 {all -> 0x0101, blocks: (B:29:0x00e6, B:31:0x00ec, B:33:0x0107, B:35:0x010b, B:36:0x011b, B:38:0x0121, B:39:0x0134, B:41:0x0140, B:43:0x0154, B:67:0x01fd, B:74:0x014d, B:77:0x01d9), top: B:2:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzat(String str, long j4, long j5, zzpr zzprVar) {
        String str2;
        Cursor cursor;
        Cursor cursor2;
        String str3;
        SQLiteDatabase zzj2;
        String[] strArr;
        String string;
        Cursor cursor3;
        String str4;
        String[] strArr2;
        Cursor query;
        Preconditions.checkNotNull(zzprVar);
        zzg();
        zzav();
        Cursor cursor4 = null;
        try {
            try {
                try {
                    zzj2 = zzj();
                } catch (Throwable th) {
                    th = th;
                    cursor4 = cursor;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (SQLiteException e4) {
            e = e4;
            str2 = str;
        }
        if (TextUtils.isEmpty(str)) {
            cursor4 = zzj2.rawQuery("select app_id, metadata_fingerprint from raw_events where " + (j5 != -1 ? "rowid <= ? and " : "") + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", j5 != -1 ? new String[]{String.valueOf(j5), String.valueOf(j4)} : new String[]{String.valueOf(j4)});
            try {
            } catch (SQLiteException e5) {
                e = e5;
                cursor2 = cursor4;
                str3 = str;
            }
            if (cursor4.moveToFirst()) {
                String string2 = cursor4.getString(0);
                try {
                    string = cursor4.getString(1);
                    cursor4.close();
                    cursor3 = cursor4;
                    str3 = string2;
                    try {
                        cursor2 = zzj2.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, string}, null, null, "rowid", "2");
                        try {
                            if (cursor2.moveToFirst()) {
                                this.zzu.zzaW().zze().zzb("Raw event metadata record is missing. appId", zzhe.zzn(str3));
                            } else {
                                try {
                                    com.google.android.gms.internal.measurement.zzhx zzhxVar = (com.google.android.gms.internal.measurement.zzhx) ((com.google.android.gms.internal.measurement.zzhw) zzqa.zzp(com.google.android.gms.internal.measurement.zzhx.zzz(), cursor2.getBlob(0))).zzba();
                                    if (cursor2.moveToNext()) {
                                        this.zzu.zzaW().zzk().zzb("Get multiple raw event metadata records, expected one. appId", zzhe.zzn(str3));
                                    }
                                    cursor2.close();
                                    Preconditions.checkNotNull(zzhxVar);
                                    zzprVar.zza = zzhxVar;
                                    if (j5 != -1) {
                                        str4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr2 = new String[]{str3, string, String.valueOf(j5)};
                                    } else {
                                        str4 = "app_id = ? and metadata_fingerprint = ?";
                                        strArr2 = new String[]{str3, string};
                                    }
                                    query = zzj2.query("raw_events", new String[]{"rowid", "name", da.a.f15878d, "data"}, str4, strArr2, null, null, "rowid", null);
                                } catch (IOException e6) {
                                    this.zzu.zzaW().zze().zzc("Data loss. Failed to merge raw event metadata. appId", zzhe.zzn(str3), e6);
                                }
                                try {
                                    if (query.moveToFirst()) {
                                        do {
                                            long j6 = query.getLong(0);
                                            try {
                                                com.google.android.gms.internal.measurement.zzhl zzhlVar = (com.google.android.gms.internal.measurement.zzhl) zzqa.zzp(com.google.android.gms.internal.measurement.zzhm.zze(), query.getBlob(3));
                                                zzhlVar.zzi(query.getString(1));
                                                zzhlVar.zzm(query.getLong(2));
                                                if (!zzprVar.zza(j6, (com.google.android.gms.internal.measurement.zzhm) zzhlVar.zzba())) {
                                                    break;
                                                }
                                            } catch (IOException e7) {
                                                this.zzu.zzaW().zze().zzc("Data loss. Failed to merge raw event. appId", zzhe.zzn(str3), e7);
                                            }
                                        } while (query.moveToNext());
                                    } else {
                                        this.zzu.zzaW().zzk().zzb("Raw event data disappeared while in transaction. appId", zzhe.zzn(str3));
                                    }
                                    cursor4 = query;
                                } catch (SQLiteException e8) {
                                    e = e8;
                                    cursor2 = query;
                                    this.zzu.zzaW().zze().zzc("Data loss. Error selecting raw event. appId", zzhe.zzn(str3), e);
                                    cursor4 = cursor2;
                                    if (cursor4 == null) {
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor4 = query;
                                    if (cursor4 != null) {
                                        cursor4.close();
                                    }
                                    throw th;
                                }
                            }
                        } catch (SQLiteException e9) {
                            e = e9;
                        }
                    } catch (SQLiteException e10) {
                        e = e10;
                        cursor2 = cursor3;
                    } catch (Throwable th4) {
                        th = th4;
                        cursor4 = cursor3;
                    }
                } catch (SQLiteException e11) {
                    e = e11;
                    cursor2 = cursor4;
                    str3 = string2;
                    this.zzu.zzaW().zze().zzc("Data loss. Error selecting raw event. appId", zzhe.zzn(str3), e);
                    cursor4 = cursor2;
                    if (cursor4 == null) {
                    }
                }
                cursor4 = cursor2;
            }
        } else {
            try {
                if (j5 != -1) {
                    str2 = str;
                    strArr = new String[]{str2, String.valueOf(j5)};
                } else {
                    str2 = str;
                    strArr = new String[]{str2};
                }
                cursor4 = zzj2.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + (j5 != -1 ? " and rowid <= ?" : "") + " order by rowid limit 1;", strArr);
            } catch (SQLiteException e12) {
                e = e12;
                cursor2 = cursor4;
                str3 = str2;
                this.zzu.zzaW().zze().zzc("Data loss. Error selecting raw event. appId", zzhe.zzn(str3), e);
                cursor4 = cursor2;
                if (cursor4 == null) {
                }
            }
            if (cursor4.moveToFirst()) {
                string = cursor4.getString(0);
                cursor4.close();
                cursor3 = cursor4;
                str3 = str2;
                cursor2 = zzj2.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, string}, null, null, "rowid", "2");
                if (cursor2.moveToFirst()) {
                }
                cursor4 = cursor2;
            }
        }
        if (cursor4 == null) {
            cursor4.close();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzpg
    protected final boolean zzb() {
        return false;
    }

    public final long zzd(String str, com.google.android.gms.internal.measurement.zzhv zzhvVar, String str2, Map map, zzmf zzmfVar, Long l4) {
        int delete;
        zzg();
        zzav();
        Preconditions.checkNotNull(zzhvVar);
        Preconditions.checkNotEmpty(str);
        zzio zzioVar = this.zzu;
        if (zzioVar.zzf().zzx(null, zzgi.zzaM)) {
            zzg();
            zzav();
            if (zzae()) {
                zzpv zzpvVar = this.zzg;
                long zza2 = zzpvVar.zzw().zzb.zza();
                long elapsedRealtime = zzioVar.zzaU().elapsedRealtime();
                long abs = Math.abs(elapsedRealtime - zza2);
                zzioVar.zzf();
                if (abs > zzam.zzJ()) {
                    zzpvVar.zzw().zzb.zzb(elapsedRealtime);
                    zzg();
                    zzav();
                    if (zzae() && (delete = zzj().delete("upload_queue", zzaC(), new String[0])) > 0) {
                        zzioVar.zzaW().zzj().zzb("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(delete));
                    }
                    if (zzioVar.zzf().zzx(null, zzgi.zzaP)) {
                        Preconditions.checkNotEmpty(str);
                        zzg();
                        zzav();
                        try {
                            int zzh2 = zzioVar.zzf().zzh(str, zzgi.zzz);
                            if (zzh2 > 0) {
                                zzj().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(zzh2)});
                            }
                        } catch (SQLiteException e4) {
                            this.zzu.zzaW().zze().zzc("Error deleting over the limit queued batches. appId", zzhe.zzn(str), e4);
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(((String) entry.getKey()) + "=" + ((String) entry.getValue()));
            }
            byte[] zzcd = zzhvVar.zzcd();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("measurement_batch", zzcd);
            contentValues.put("upload_uri", str2);
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append((CharSequence) "\r\n");
                }
            }
            contentValues.put("upload_headers", sb.toString());
            contentValues.put("upload_type", Integer.valueOf(zzmfVar.zza()));
            zzio zzioVar2 = this.zzu;
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzioVar2.zzaU().currentTimeMillis()));
            contentValues.put("retry_count", (Integer) 0);
            if (l4 != null) {
                contentValues.put("associated_row_id", l4);
            }
            try {
                long insert = zzj().insert("upload_queue", null, contentValues);
                if (insert != -1) {
                    return insert;
                }
                zzioVar2.zzaW().zze().zzb("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
                return -1L;
            } catch (SQLiteException e5) {
                this.zzu.zzaW().zze().zzc("Error storing MeasurementBatch to upload_queue. appId", str, e5);
            }
        }
        return -1L;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|2|3|4|(2:6|(3:8|9|10)(1:13))|14|15|(3:17|9|10)(4:18|19|9|10)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ac, code lost:
    
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b6, code lost:
    
        r13.zzu.zzaW().zze().zzd("Error inserting column. appId", com.google.android.gms.measurement.internal.zzhe.zzn(r14), "first_open_count", r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final long zze(String str, String str2) {
        long j4;
        long j5;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty("first_open_count");
        zzg();
        zzav();
        SQLiteDatabase zzj2 = zzj();
        zzj2.beginTransaction();
        try {
            try {
                j5 = -1;
                j4 = zzaz("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
            } finally {
                zzj2.endTransaction();
            }
        } catch (SQLiteException e4) {
            SQLiteException e5 = e4;
            j4 = 0;
        }
        if (j4 == -1) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("first_open_count", (Integer) 0);
            contentValues.put("previous_install_count", (Integer) 0);
            if (zzj2.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                this.zzu.zzaW().zze().zzc("Failed to insert column (got -1). appId", zzhe.zzn(str), "first_open_count");
                return j5;
            }
            j4 = 0;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("app_id", str);
        contentValues2.put("first_open_count", Long.valueOf(1 + j4));
        if (zzj2.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
            this.zzu.zzaW().zze().zzc("Failed to update column (got 0). appId", zzhe.zzn(str), "first_open_count");
            return j5;
        }
        zzj2.setTransactionSuccessful();
        j5 = j4;
        return j5;
    }

    public final long zzf() {
        return zzaz("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final long zzh() {
        return zzaz("select max(timestamp) from raw_events", null, 0L);
    }

    public final long zzi(String str) {
        Preconditions.checkNotEmpty(str);
        return zzaz("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    final SQLiteDatabase zzj() {
        zzg();
        try {
            return this.zzm.getWritableDatabase();
        } catch (SQLiteException e4) {
            this.zzu.zzaW().zzk().zzb("Error opening database", e4);
            throw e4;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x006a: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:107), block:B:27:0x006a */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle zzk(String str) {
        Cursor cursor;
        Cursor cursor2;
        zzg();
        zzav();
        Cursor cursor3 = null;
        try {
            try {
                cursor = zzj().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (cursor.moveToFirst()) {
                        try {
                            com.google.android.gms.internal.measurement.zzhm zzhmVar = (com.google.android.gms.internal.measurement.zzhm) ((com.google.android.gms.internal.measurement.zzhl) zzqa.zzp(com.google.android.gms.internal.measurement.zzhm.zze(), cursor.getBlob(0))).zzba();
                            this.zzg.zzA();
                            Bundle zzF = zzqa.zzF(zzhmVar.zzi());
                            cursor.close();
                            return zzF;
                        } catch (IOException e4) {
                            this.zzu.zzaW().zze().zzc("Failed to retrieve default event parameters. appId", zzhe.zzn(str), e4);
                        }
                    } else {
                        this.zzu.zzaW().zzj().zza("Default event parameters not found");
                    }
                } catch (SQLiteException e5) {
                    e = e5;
                    this.zzu.zzaW().zze().zzb("Error selecting default event parameters", e);
                    if (cursor != null) {
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
        } catch (SQLiteException e6) {
            e = e6;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0315  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzh zzl(String str) {
        Cursor cursor;
        Boolean valueOf;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzav();
        Cursor cursor2 = null;
        try {
            cursor = zzj().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                } catch (SQLiteException e4) {
                    e = e4;
                    this.zzu.zzaW().zze().zzc("Error querying app. appId", zzhe.zzn(str), e);
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e5) {
            e = e5;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
        if (!cursor.moveToFirst()) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        }
        zzpv zzpvVar = this.zzg;
        zzh zzhVar = new zzh(zzpvVar.zzt(), str);
        zzjx zzu = zzpvVar.zzu(str);
        zzjw zzjwVar = zzjw.ANALYTICS_STORAGE;
        if (zzu.zzr(zzjwVar)) {
            zzhVar.zzV(cursor.getString(0));
        }
        zzhVar.zzao(cursor.getString(1));
        if (zzpvVar.zzu(str).zzr(zzjw.AD_STORAGE)) {
            zzhVar.zzax(cursor.getString(2));
        }
        zzhVar.zzat(cursor.getLong(3));
        zzhVar.zzau(cursor.getLong(4));
        zzhVar.zzas(cursor.getLong(5));
        zzhVar.zzX(cursor.getString(6));
        zzhVar.zzW(cursor.getString(7));
        zzhVar.zzap(cursor.getLong(8));
        zzhVar.zzaj(cursor.getLong(9));
        zzhVar.zzav(cursor.isNull(10) || cursor.getInt(10) != 0);
        zzhVar.zzai(cursor.getLong(11));
        zzhVar.zzaf(cursor.getLong(12));
        zzhVar.zzae(cursor.getLong(13));
        zzhVar.zzac(cursor.getLong(14));
        zzhVar.zzab(cursor.getLong(15));
        zzhVar.zzam(cursor.getLong(16));
        zzhVar.zzY(cursor.isNull(17) ? -2147483648L : cursor.getInt(17));
        zzhVar.zzan(cursor.getString(18));
        zzhVar.zzad(cursor.getLong(19));
        zzhVar.zzah(cursor.getLong(20));
        zzhVar.zzaq(cursor.getString(21));
        zzhVar.zzU(cursor.isNull(23) || cursor.getInt(23) != 0);
        zzhVar.zzS(cursor.getString(24));
        zzhVar.zzal(cursor.isNull(25) ? 0L : cursor.getLong(25));
        if (!cursor.isNull(26)) {
            zzhVar.zzay(Arrays.asList(cursor.getString(26).split(StringUtils.COMMA, -1)));
        }
        if (zzpvVar.zzu(str).zzr(zzjwVar)) {
            zzhVar.zzaA(cursor.getString(28));
        }
        zzhVar.zzaD((cursor.isNull(29) || cursor.getInt(29) == 0) ? false : true);
        zzhVar.zzar(cursor.getLong(39));
        zzhVar.zzaC(cursor.getString(36));
        zzhVar.zzaE(cursor.getLong(30));
        zzhVar.zzaB(cursor.getLong(31));
        zzqr.zzb();
        zzio zzioVar = this.zzu;
        if (zzioVar.zzf().zzx(str, zzgi.zzaV)) {
            zzhVar.zzT(cursor.getInt(32));
            zzhVar.zzZ(cursor.getLong(35));
        }
        zzhVar.zzaF((cursor.isNull(33) || cursor.getInt(33) == 0) ? false : true);
        if (cursor.isNull(34)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getInt(34) != 0);
        }
        zzhVar.zzaw(valueOf);
        zzhVar.zzak(cursor.getInt(37));
        zzhVar.zzag(cursor.getInt(38));
        zzhVar.zzaz(cursor.isNull(40) ? "" : (String) Preconditions.checkNotNull(cursor.getString(40)));
        if (!cursor.isNull(41)) {
            zzhVar.zzaG(Long.valueOf(cursor.getLong(41)));
        }
        if (!cursor.isNull(42)) {
            zzhVar.zzaH(Long.valueOf(cursor.getLong(42)));
        }
        zzhVar.zzR(cursor.getBlob(43));
        if (zzioVar.zzf().zzx(str, zzgi.zzaP) && !cursor.isNull(44)) {
            zzhVar.zzaa(cursor.getInt(44));
        }
        zzhVar.zzO();
        if (cursor.moveToNext()) {
            zzioVar.zzaW().zze().zzb("Got multiple records for app, expected one. appId", zzhe.zzn(str));
        }
        cursor.close();
        return zzhVar;
    }

    /* JADX WARN: Not initialized variable reg: 9, insn: 0x00f6: MOVE (r8 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:247), block:B:37:0x00f6 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzai zzm(String str, String str2) {
        String str3;
        Cursor cursor;
        Cursor cursor2;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzav();
        Cursor cursor3 = null;
        try {
            try {
                cursor = zzj().query("conditional_properties", new String[]{"origin", "value", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                } catch (SQLiteException e4) {
                    e = e4;
                    str3 = str2;
                }
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SQLiteException e5) {
            e = e5;
            str3 = str2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
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
        String str4 = string;
        Object zzz = zzz(cursor, 1);
        boolean z4 = cursor.getInt(2) != 0;
        String string2 = cursor.getString(3);
        long j4 = cursor.getLong(4);
        zzpv zzpvVar = this.zzg;
        zzqa zzA = zzpvVar.zzA();
        byte[] blob = cursor.getBlob(5);
        Parcelable.Creator<zzbh> creator = zzbh.CREATOR;
        zzbh zzbhVar = (zzbh) zzA.zzi(blob, creator);
        str3 = str2;
        try {
            zzai zzaiVar = new zzai(str, str4, new zzqb(str3, cursor.getLong(8), zzz, str4), cursor.getLong(6), z4, string2, zzbhVar, j4, (zzbh) zzpvVar.zzA().zzi(cursor.getBlob(7), creator), cursor.getLong(9), (zzbh) zzpvVar.zzA().zzi(cursor.getBlob(10), creator));
            if (cursor.moveToNext()) {
                zzio zzioVar = this.zzu;
                zzioVar.zzaW().zze().zzc("Got multiple records for conditional property, expected one", zzhe.zzn(str), zzioVar.zzj().zzf(str3));
            }
            cursor.close();
            return zzaiVar;
        } catch (SQLiteException e6) {
            e = e6;
            zzio zzioVar2 = this.zzu;
            zzioVar2.zzaW().zze().zzd("Error querying conditional property", zzhe.zzn(str), zzioVar2.zzj().zzf(str3), e);
            if (cursor != null) {
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzar zzn(String str) {
        Throwable th;
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzav();
        Cursor cursor2 = null;
        try {
            cursor = zzj().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (cursor.moveToFirst()) {
                        byte[] blob = cursor.getBlob(0);
                        String string = cursor.getString(1);
                        String string2 = cursor.getString(2);
                        if (cursor.moveToNext()) {
                            this.zzu.zzaW().zze().zzb("Got multiple records for app config, expected one. appId", zzhe.zzn(str));
                        }
                        if (blob != null) {
                            zzar zzarVar = new zzar(blob, string, string2);
                            cursor.close();
                            return zzarVar;
                        }
                    }
                } catch (SQLiteException e4) {
                    e = e4;
                    this.zzu.zzaW().zze().zzc("Error querying remote config. appId", zzhe.zzn(str), e);
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    throw th;
                }
                cursor2.close();
                throw th;
            }
        } catch (SQLiteException e5) {
            e = e5;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
            }
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    public final zzas zzo(long j4, String str, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        return zzp(j4, str, 1L, false, false, z6, false, z8, z9, z10);
    }

    public final zzas zzp(long j4, String str, long j5, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzav();
        String[] strArr = {str};
        zzas zzasVar = new zzas();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase zzj2 = zzj();
                cursor = zzj2.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursor.moveToFirst()) {
                    if (cursor.getLong(0) == j4) {
                        zzasVar.zzb = cursor.getLong(1);
                        zzasVar.zza = cursor.getLong(2);
                        zzasVar.zzc = cursor.getLong(3);
                        zzasVar.zzd = cursor.getLong(4);
                        zzasVar.zze = cursor.getLong(5);
                        zzasVar.zzf = cursor.getLong(6);
                        zzasVar.zzg = cursor.getLong(7);
                    }
                    if (z4) {
                        zzasVar.zzb += j5;
                    }
                    if (z5) {
                        zzasVar.zza += j5;
                    }
                    if (z6) {
                        zzasVar.zzc += j5;
                    }
                    if (z7) {
                        zzasVar.zzd += j5;
                    }
                    if (z8) {
                        zzasVar.zze += j5;
                    }
                    if (z9) {
                        zzasVar.zzf += j5;
                    }
                    if (z10) {
                        zzasVar.zzg += j5;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j4));
                    contentValues.put("daily_public_events_count", Long.valueOf(zzasVar.zza));
                    contentValues.put("daily_events_count", Long.valueOf(zzasVar.zzb));
                    contentValues.put("daily_conversions_count", Long.valueOf(zzasVar.zzc));
                    contentValues.put("daily_error_events_count", Long.valueOf(zzasVar.zzd));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(zzasVar.zze));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(zzasVar.zzf));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(zzasVar.zzg));
                    zzj2.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    this.zzu.zzaW().zzk().zzb("Not updating daily counts, app is not known. appId", zzhe.zzn(str));
                }
            } catch (SQLiteException e4) {
                this.zzu.zzaW().zze().zzc("Error updating daily counts. appId", zzhe.zzn(str), e4);
            }
            if (cursor != null) {
                cursor.close();
            }
            return zzasVar;
        } finally {
        }
    }

    public final zzba zzq(String str) {
        Preconditions.checkNotNull(str);
        zzg();
        zzav();
        return zzba.zze(zzaD("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    final zzbd zzr(String str, com.google.android.gms.internal.measurement.zzhm zzhmVar, String str2) {
        zzbd zzaA = zzaA("events", str, zzhmVar.zzh());
        if (zzaA == null) {
            zzio zzioVar = this.zzu;
            zzioVar.zzaW().zzk().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzhe.zzn(str), zzioVar.zzj().zzd(str2));
            return new zzbd(str, zzhmVar.zzh(), 1L, 1L, 1L, zzhmVar.zzd(), 0L, null, null, null, null);
        }
        long j4 = zzaA.zze + 1;
        long j5 = zzaA.zzd + 1;
        return new zzbd(zzaA.zza, zzaA.zzb, zzaA.zzc + 1, j5, j4, zzaA.zzf, zzaA.zzg, zzaA.zzh, zzaA.zzi, zzaA.zzj, zzaA.zzk);
    }

    public final zzbd zzs(String str, String str2) {
        return zzaA("events", str, str2);
    }

    public final zzjx zzt(String str) {
        Preconditions.checkNotNull(str);
        zzg();
        zzav();
        return zzjx.zzk(zzaD("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}, ""), 100);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r5 == 0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzjx zzu(String str) {
        Throwable th;
        SQLiteException e4;
        Preconditions.checkNotNull(str);
        zzg();
        zzav();
        ?? r5 = {str};
        Cursor cursor = null;
        r1 = null;
        r1 = null;
        zzjx zzjxVar = null;
        try {
            try {
                r5 = zzj().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", r5);
                try {
                    if (r5.moveToFirst()) {
                        zzjxVar = zzjx.zzk(r5.getString(0), r5.getInt(1));
                    } else {
                        this.zzu.zzaW().zzj().zza("No data found");
                    }
                } catch (SQLiteException e5) {
                    e4 = e5;
                    this.zzu.zzaW().zze().zzb("Error querying database.", e4);
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = r5;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e6) {
            e4 = e6;
            r5 = 0;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
            }
            throw th;
        }
        r5.close();
        return zzjxVar == null ? zzjx.zza : zzjxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzpz zzw(String str) {
        Cursor cursor;
        zzpz zzpzVar;
        Cursor cursor2;
        Cursor cursor3;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzav();
        zzio zzioVar = this.zzu;
        if (!zzioVar.zzf().zzx(null, zzgi.zzaM)) {
            return null;
        }
        if (zzioVar.zzf().zzx(null, zzgi.zzaP)) {
            List zzD = zzD(str, zzpc.zza(zzmf.GOOGLE_SIGNAL), 1);
            if (zzD.isEmpty()) {
                return null;
            }
            return (zzpz) zzD.get(0);
        }
        try {
            cursor2 = zzj().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "associated_row_id", "last_upload_timestamp"}, "app_id=? AND NOT " + zzaC(), new String[]{str}, null, null, "creation_timestamp ASC", "1");
            try {
            } catch (SQLiteException e4) {
                e = e4;
                cursor3 = cursor2;
                zzpzVar = null;
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
            }
        } catch (SQLiteException e5) {
            e = e5;
            zzpzVar = null;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
        if (!cursor2.moveToFirst()) {
            zzpzVar = null;
            if (cursor2 != null) {
                cursor2.close();
            }
            return zzpzVar;
        }
        cursor3 = cursor2;
        zzpzVar = null;
        try {
            zzpz zzaB = zzaB(str, cursor2.getLong(0), cursor2.getBlob(2), cursor2.getString(3), cursor2.getString(4), cursor2.getInt(5), cursor2.getInt(6), cursor2.getLong(7), cursor2.getLong(8), cursor2.getLong(9));
            cursor3.close();
            return zzaB;
        } catch (SQLiteException e6) {
            e = e6;
            cursor = cursor3;
            try {
                this.zzu.zzaW().zze().zzc("Error to querying MeasurementBatch from upload_queue. appId", str, e);
                cursor2 = cursor;
                if (cursor2 != null) {
                }
                return zzpzVar;
            } catch (Throwable th3) {
                th = th3;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            cursor = cursor3;
            if (cursor != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzpz zzx(long j4) {
        Cursor cursor;
        zzpz zzpzVar;
        Cursor cursor2;
        Cursor cursor3;
        if (!this.zzu.zzf().zzx(null, zzgi.zzaP)) {
            return null;
        }
        zzg();
        zzav();
        try {
            cursor2 = zzj().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j4)}, null, null, null, "1");
            try {
            } catch (SQLiteException e4) {
                e = e4;
                cursor3 = cursor2;
                zzpzVar = null;
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
            }
        } catch (SQLiteException e5) {
            e = e5;
            zzpzVar = null;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
        if (!cursor2.moveToFirst()) {
            zzpzVar = null;
            if (cursor2 != null) {
                cursor2.close();
            }
            return zzpzVar;
        }
        cursor3 = cursor2;
        zzpzVar = null;
        try {
            zzpz zzaB = zzaB((String) Preconditions.checkNotNull(cursor2.getString(1)), j4, cursor2.getBlob(2), cursor2.getString(3), cursor2.getString(4), cursor2.getInt(5), cursor2.getInt(6), cursor2.getLong(7), cursor2.getLong(8), cursor2.getLong(9));
            cursor3.close();
            return zzaB;
        } catch (SQLiteException e6) {
            e = e6;
            cursor = cursor3;
            try {
                this.zzu.zzaW().zze().zzc("Error to querying MeasurementBatch from upload_queue. rowId", Long.valueOf(j4), e);
                cursor2 = cursor;
                if (cursor2 != null) {
                }
                return zzpzVar;
            } catch (Throwable th3) {
                th = th3;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            cursor = cursor3;
            if (cursor != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzqd zzy(String str, String str2) {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzav();
        Cursor cursor2 = null;
        try {
            cursor = zzj().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursor.moveToFirst()) {
                        long j4 = cursor.getLong(0);
                        Object zzz = zzz(cursor, 1);
                        if (zzz != null) {
                            str3 = str;
                            str4 = str2;
                            try {
                                zzqd zzqdVar = new zzqd(str3, cursor.getString(2), str4, j4, zzz);
                                if (cursor.moveToNext()) {
                                    this.zzu.zzaW().zze().zzb("Got multiple records for user property, expected one. appId", zzhe.zzn(str3));
                                }
                                cursor.close();
                                return zzqdVar;
                            } catch (SQLiteException e4) {
                                e = e4;
                                sQLiteException = e;
                                zzio zzioVar = this.zzu;
                                zzioVar.zzaW().zze().zzd("Error querying user property. appId", zzhe.zzn(str3), zzioVar.zzj().zzf(str4), sQLiteException);
                                if (cursor != null) {
                                }
                                return null;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        throw th;
                    }
                    cursor2.close();
                    throw th;
                }
            } catch (SQLiteException e5) {
                e = e5;
                str3 = str;
                str4 = str2;
            }
        } catch (SQLiteException e6) {
            str3 = str;
            str4 = str2;
            sQLiteException = e6;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
            }
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    final Object zzz(Cursor cursor, int i4) {
        int type = cursor.getType(i4);
        if (type == 0) {
            this.zzu.zzaW().zze().zza("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i4));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i4));
        }
        if (type == 3) {
            return cursor.getString(i4);
        }
        if (type != 4) {
            this.zzu.zzaW().zze().zzb("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        this.zzu.zzaW().zze().zza("Loaded invalid blob type value, ignoring it");
        return null;
    }
}
