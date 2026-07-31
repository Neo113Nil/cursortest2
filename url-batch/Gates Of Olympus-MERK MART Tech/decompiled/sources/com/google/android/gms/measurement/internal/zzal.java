package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import androidx.collection.ArrayMap;
import androidx.collection.SieveCacheKt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzjk;
import com.google.android.gms.internal.measurement.zznw;
import com.google.android.gms.internal.measurement.zzoj;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzin;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.time.DurationKt;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
/* loaded from: classes3.dex */
final class zzal extends zzmx {
    private static final String[] zza = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] zzb = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzc = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;"};
    private static final String[] zzd = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] zze = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzg = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzh = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzi = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private static final String[] zzj = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    private static final String[] zzk = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    private final zzar zzl;
    private final zzmr zzm;

    public final int zza(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzal();
        try {
            return e_().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.zzj().zzg().zza("Error deleting conditional property", zzfw.zza(str), this.zzi().zzc(str2), e);
            return 0;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzmx
    protected final boolean zzc() {
        return false;
    }

    public final long zza(String str) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        try {
            return e_().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(DurationKt.NANOS_IN_MILLIS, zze().zzb(str, zzbf.zzp))))});
        } catch (SQLiteException e) {
            this.zzj().zzg().zza("Error deleting over the limit events. appId", zzfw.zza(str), e);
            return 0L;
        }
    }

    public final long b_() {
        Cursor cursor = null;
        try {
            try {
                cursor = e_().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return -1L;
                }
                long j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error querying raw events", e);
                if (cursor != null) {
                    cursor.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long zza(zzfn.zzk zzkVar) throws IOException {
        zzt();
        zzal();
        Preconditions.checkNotNull(zzkVar);
        Preconditions.checkNotEmpty(zzkVar.zzz());
        byte[] zzbz = zzkVar.zzbz();
        long zza2 = g_().zza(zzbz);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzkVar.zzz());
        contentValues.put("metadata_fingerprint", Long.valueOf(zza2));
        contentValues.put("metadata", zzbz);
        try {
            e_().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return zza2;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing raw event metadata. appId", zzfw.zza(zzkVar.zzz()), e);
            throw e;
        }
    }

    protected final long zzb(String str, String str2) {
        long zza2;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzal();
        SQLiteDatabase e_ = e_();
        e_.beginTransaction();
        long j = 0;
        try {
            try {
                zza2 = zza("select " + str2 + " from app2 where app_id=?", new String[]{str}, -1L);
                if (zza2 == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (e_.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        zzj().zzg().zza("Failed to insert column (got -1). appId", zzfw.zza(str), str2);
                        return -1L;
                    }
                    zza2 = 0;
                }
            } catch (SQLiteException e) {
                e = e;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put(str2, Long.valueOf(1 + zza2));
                if (e_.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                    zzj().zzg().zza("Failed to update column (got 0). appId", zzfw.zza(str), str2);
                    return -1L;
                }
                e_.setTransactionSuccessful();
                return zza2;
            } catch (SQLiteException e2) {
                e = e2;
                j = zza2;
                zzj().zzg().zza("Error inserting column. appId", zzfw.zza(str), str2, e);
                return j;
            }
        } finally {
            e_.endTransaction();
        }
    }

    public final long zzb(String str) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        return zza("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
    }

    public final long c_() {
        return zza("select max(bundle_end_timestamp) from queue", (String[]) null, 0L);
    }

    public final long d_() {
        return zza("select max(timestamp) from raw_events", (String[]) null, 0L);
    }

    public final long zzc(String str) {
        Preconditions.checkNotEmpty(str);
        return zza("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    private final long zzb(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = e_().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j = rawQuery.getLong(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return j;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e) {
                zzj().zzg().zza("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long zza(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            try {
                cursor = e_().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    return cursor.getLong(0);
                }
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            } catch (SQLiteException e) {
                this.zzj().zzg().zza("Database error", str, e);
                throw e;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    final SQLiteDatabase e_() {
        zzt();
        try {
            return this.zzl.getWritableDatabase();
        } catch (SQLiteException e) {
            this.zzj().zzu().zza("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0089: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:32:0x0089 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle zzd(String str) {
        Cursor cursor;
        Cursor cursor2;
        zzt();
        zzal();
        Cursor cursor3 = null;
        try {
            try {
                cursor = e_().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (!cursor.moveToFirst()) {
                        zzj().zzp().zza("Default event parameters not found");
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    try {
                        zzfn.zzf zzfVar = (zzfn.zzf) ((com.google.android.gms.internal.measurement.zzjk) ((zzfn.zzf.zza) zznl.zza(zzfn.zzf.zze(), cursor.getBlob(0))).zzai());
                        g_();
                        Bundle zza2 = zznl.zza(zzfVar.zzh());
                        if (cursor != null) {
                            cursor.close();
                        }
                        return zza2;
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to retrieve default event parameters. appId", zzfw.zza(str), e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    zzj().zzg().zza("Error selecting default event parameters", e);
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

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0091: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:32:0x0091 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair<zzfn.zzf, Long> zza(String str, Long l) {
        Cursor cursor;
        Cursor cursor2;
        zzt();
        zzal();
        Cursor cursor3 = null;
        try {
            try {
                cursor = e_().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, String.valueOf(l)});
                try {
                    if (!cursor.moveToFirst()) {
                        zzj().zzp().zza("Main event not found");
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    try {
                        Pair<zzfn.zzf, Long> create = Pair.create((zzfn.zzf) ((com.google.android.gms.internal.measurement.zzjk) ((zzfn.zzf.zza) zznl.zza(zzfn.zzf.zze(), cursor.getBlob(0))).zzai()), Long.valueOf(cursor.getLong(1)));
                        if (cursor != null) {
                            cursor.close();
                        }
                        return create;
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to merge main event. appId, eventId", zzfw.zza(str), l, e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    zzj().zzg().zza("Error selecting main event", e);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0453: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:141:0x0453 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03f5 A[Catch: SQLiteException -> 0x042a, all -> 0x0452, TryCatch #1 {all -> 0x0452, blocks: (B:8:0x0132, B:14:0x013e, B:16:0x014f, B:18:0x015b, B:20:0x0170, B:22:0x017d, B:24:0x0189, B:26:0x019e, B:28:0x01dc, B:32:0x01e6, B:35:0x0230, B:37:0x025f, B:41:0x0269, B:44:0x0284, B:46:0x028f, B:47:0x02a1, B:49:0x02a7, B:51:0x02b3, B:53:0x02ca, B:55:0x02d0, B:57:0x02dc, B:59:0x02e5, B:61:0x02ed, B:64:0x02f6, B:66:0x030e, B:68:0x0317, B:70:0x032f, B:72:0x033b, B:73:0x034d, B:75:0x0353, B:77:0x035f, B:79:0x0367, B:82:0x0370, B:84:0x0373, B:87:0x0389, B:89:0x03a4, B:91:0x03b0, B:94:0x03ba, B:95:0x03bd, B:97:0x03c9, B:99:0x03d1, B:100:0x03dc, B:102:0x03e4, B:103:0x03ef, B:105:0x03f5, B:107:0x0401, B:108:0x040a, B:110:0x0413, B:115:0x037e, B:118:0x0385, B:119:0x02c1, B:120:0x0280, B:122:0x022b, B:124:0x0197, B:125:0x0169, B:127:0x043b), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0413 A[Catch: SQLiteException -> 0x042a, all -> 0x0452, TRY_LEAVE, TryCatch #1 {all -> 0x0452, blocks: (B:8:0x0132, B:14:0x013e, B:16:0x014f, B:18:0x015b, B:20:0x0170, B:22:0x017d, B:24:0x0189, B:26:0x019e, B:28:0x01dc, B:32:0x01e6, B:35:0x0230, B:37:0x025f, B:41:0x0269, B:44:0x0284, B:46:0x028f, B:47:0x02a1, B:49:0x02a7, B:51:0x02b3, B:53:0x02ca, B:55:0x02d0, B:57:0x02dc, B:59:0x02e5, B:61:0x02ed, B:64:0x02f6, B:66:0x030e, B:68:0x0317, B:70:0x032f, B:72:0x033b, B:73:0x034d, B:75:0x0353, B:77:0x035f, B:79:0x0367, B:82:0x0370, B:84:0x0373, B:87:0x0389, B:89:0x03a4, B:91:0x03b0, B:94:0x03ba, B:95:0x03bd, B:97:0x03c9, B:99:0x03d1, B:100:0x03dc, B:102:0x03e4, B:103:0x03ef, B:105:0x03f5, B:107:0x0401, B:108:0x040a, B:110:0x0413, B:115:0x037e, B:118:0x0385, B:119:0x02c1, B:120:0x0280, B:122:0x022b, B:124:0x0197, B:125:0x0169, B:127:0x043b), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x037e A[Catch: SQLiteException -> 0x042a, all -> 0x0452, TryCatch #1 {all -> 0x0452, blocks: (B:8:0x0132, B:14:0x013e, B:16:0x014f, B:18:0x015b, B:20:0x0170, B:22:0x017d, B:24:0x0189, B:26:0x019e, B:28:0x01dc, B:32:0x01e6, B:35:0x0230, B:37:0x025f, B:41:0x0269, B:44:0x0284, B:46:0x028f, B:47:0x02a1, B:49:0x02a7, B:51:0x02b3, B:53:0x02ca, B:55:0x02d0, B:57:0x02dc, B:59:0x02e5, B:61:0x02ed, B:64:0x02f6, B:66:0x030e, B:68:0x0317, B:70:0x032f, B:72:0x033b, B:73:0x034d, B:75:0x0353, B:77:0x035f, B:79:0x0367, B:82:0x0370, B:84:0x0373, B:87:0x0389, B:89:0x03a4, B:91:0x03b0, B:94:0x03ba, B:95:0x03bd, B:97:0x03c9, B:99:0x03d1, B:100:0x03dc, B:102:0x03e4, B:103:0x03ef, B:105:0x03f5, B:107:0x0401, B:108:0x040a, B:110:0x0413, B:115:0x037e, B:118:0x0385, B:119:0x02c1, B:120:0x0280, B:122:0x022b, B:124:0x0197, B:125:0x0169, B:127:0x043b), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0280 A[Catch: SQLiteException -> 0x042a, all -> 0x0452, TryCatch #1 {all -> 0x0452, blocks: (B:8:0x0132, B:14:0x013e, B:16:0x014f, B:18:0x015b, B:20:0x0170, B:22:0x017d, B:24:0x0189, B:26:0x019e, B:28:0x01dc, B:32:0x01e6, B:35:0x0230, B:37:0x025f, B:41:0x0269, B:44:0x0284, B:46:0x028f, B:47:0x02a1, B:49:0x02a7, B:51:0x02b3, B:53:0x02ca, B:55:0x02d0, B:57:0x02dc, B:59:0x02e5, B:61:0x02ed, B:64:0x02f6, B:66:0x030e, B:68:0x0317, B:70:0x032f, B:72:0x033b, B:73:0x034d, B:75:0x0353, B:77:0x035f, B:79:0x0367, B:82:0x0370, B:84:0x0373, B:87:0x0389, B:89:0x03a4, B:91:0x03b0, B:94:0x03ba, B:95:0x03bd, B:97:0x03c9, B:99:0x03d1, B:100:0x03dc, B:102:0x03e4, B:103:0x03ef, B:105:0x03f5, B:107:0x0401, B:108:0x040a, B:110:0x0413, B:115:0x037e, B:118:0x0385, B:119:0x02c1, B:120:0x0280, B:122:0x022b, B:124:0x0197, B:125:0x0169, B:127:0x043b), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x022b A[Catch: SQLiteException -> 0x042a, all -> 0x0452, TryCatch #1 {all -> 0x0452, blocks: (B:8:0x0132, B:14:0x013e, B:16:0x014f, B:18:0x015b, B:20:0x0170, B:22:0x017d, B:24:0x0189, B:26:0x019e, B:28:0x01dc, B:32:0x01e6, B:35:0x0230, B:37:0x025f, B:41:0x0269, B:44:0x0284, B:46:0x028f, B:47:0x02a1, B:49:0x02a7, B:51:0x02b3, B:53:0x02ca, B:55:0x02d0, B:57:0x02dc, B:59:0x02e5, B:61:0x02ed, B:64:0x02f6, B:66:0x030e, B:68:0x0317, B:70:0x032f, B:72:0x033b, B:73:0x034d, B:75:0x0353, B:77:0x035f, B:79:0x0367, B:82:0x0370, B:84:0x0373, B:87:0x0389, B:89:0x03a4, B:91:0x03b0, B:94:0x03ba, B:95:0x03bd, B:97:0x03c9, B:99:0x03d1, B:100:0x03dc, B:102:0x03e4, B:103:0x03ef, B:105:0x03f5, B:107:0x0401, B:108:0x040a, B:110:0x0413, B:115:0x037e, B:118:0x0385, B:119:0x02c1, B:120:0x0280, B:122:0x022b, B:124:0x0197, B:125:0x0169, B:127:0x043b), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x028f A[Catch: SQLiteException -> 0x042a, all -> 0x0452, TryCatch #1 {all -> 0x0452, blocks: (B:8:0x0132, B:14:0x013e, B:16:0x014f, B:18:0x015b, B:20:0x0170, B:22:0x017d, B:24:0x0189, B:26:0x019e, B:28:0x01dc, B:32:0x01e6, B:35:0x0230, B:37:0x025f, B:41:0x0269, B:44:0x0284, B:46:0x028f, B:47:0x02a1, B:49:0x02a7, B:51:0x02b3, B:53:0x02ca, B:55:0x02d0, B:57:0x02dc, B:59:0x02e5, B:61:0x02ed, B:64:0x02f6, B:66:0x030e, B:68:0x0317, B:70:0x032f, B:72:0x033b, B:73:0x034d, B:75:0x0353, B:77:0x035f, B:79:0x0367, B:82:0x0370, B:84:0x0373, B:87:0x0389, B:89:0x03a4, B:91:0x03b0, B:94:0x03ba, B:95:0x03bd, B:97:0x03c9, B:99:0x03d1, B:100:0x03dc, B:102:0x03e4, B:103:0x03ef, B:105:0x03f5, B:107:0x0401, B:108:0x040a, B:110:0x0413, B:115:0x037e, B:118:0x0385, B:119:0x02c1, B:120:0x0280, B:122:0x022b, B:124:0x0197, B:125:0x0169, B:127:0x043b), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02a7 A[Catch: SQLiteException -> 0x042a, all -> 0x0452, TryCatch #1 {all -> 0x0452, blocks: (B:8:0x0132, B:14:0x013e, B:16:0x014f, B:18:0x015b, B:20:0x0170, B:22:0x017d, B:24:0x0189, B:26:0x019e, B:28:0x01dc, B:32:0x01e6, B:35:0x0230, B:37:0x025f, B:41:0x0269, B:44:0x0284, B:46:0x028f, B:47:0x02a1, B:49:0x02a7, B:51:0x02b3, B:53:0x02ca, B:55:0x02d0, B:57:0x02dc, B:59:0x02e5, B:61:0x02ed, B:64:0x02f6, B:66:0x030e, B:68:0x0317, B:70:0x032f, B:72:0x033b, B:73:0x034d, B:75:0x0353, B:77:0x035f, B:79:0x0367, B:82:0x0370, B:84:0x0373, B:87:0x0389, B:89:0x03a4, B:91:0x03b0, B:94:0x03ba, B:95:0x03bd, B:97:0x03c9, B:99:0x03d1, B:100:0x03dc, B:102:0x03e4, B:103:0x03ef, B:105:0x03f5, B:107:0x0401, B:108:0x040a, B:110:0x0413, B:115:0x037e, B:118:0x0385, B:119:0x02c1, B:120:0x0280, B:122:0x022b, B:124:0x0197, B:125:0x0169, B:127:0x043b), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02d0 A[Catch: SQLiteException -> 0x042a, all -> 0x0452, TryCatch #1 {all -> 0x0452, blocks: (B:8:0x0132, B:14:0x013e, B:16:0x014f, B:18:0x015b, B:20:0x0170, B:22:0x017d, B:24:0x0189, B:26:0x019e, B:28:0x01dc, B:32:0x01e6, B:35:0x0230, B:37:0x025f, B:41:0x0269, B:44:0x0284, B:46:0x028f, B:47:0x02a1, B:49:0x02a7, B:51:0x02b3, B:53:0x02ca, B:55:0x02d0, B:57:0x02dc, B:59:0x02e5, B:61:0x02ed, B:64:0x02f6, B:66:0x030e, B:68:0x0317, B:70:0x032f, B:72:0x033b, B:73:0x034d, B:75:0x0353, B:77:0x035f, B:79:0x0367, B:82:0x0370, B:84:0x0373, B:87:0x0389, B:89:0x03a4, B:91:0x03b0, B:94:0x03ba, B:95:0x03bd, B:97:0x03c9, B:99:0x03d1, B:100:0x03dc, B:102:0x03e4, B:103:0x03ef, B:105:0x03f5, B:107:0x0401, B:108:0x040a, B:110:0x0413, B:115:0x037e, B:118:0x0385, B:119:0x02c1, B:120:0x0280, B:122:0x022b, B:124:0x0197, B:125:0x0169, B:127:0x043b), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02e5 A[Catch: SQLiteException -> 0x042a, all -> 0x0452, TryCatch #1 {all -> 0x0452, blocks: (B:8:0x0132, B:14:0x013e, B:16:0x014f, B:18:0x015b, B:20:0x0170, B:22:0x017d, B:24:0x0189, B:26:0x019e, B:28:0x01dc, B:32:0x01e6, B:35:0x0230, B:37:0x025f, B:41:0x0269, B:44:0x0284, B:46:0x028f, B:47:0x02a1, B:49:0x02a7, B:51:0x02b3, B:53:0x02ca, B:55:0x02d0, B:57:0x02dc, B:59:0x02e5, B:61:0x02ed, B:64:0x02f6, B:66:0x030e, B:68:0x0317, B:70:0x032f, B:72:0x033b, B:73:0x034d, B:75:0x0353, B:77:0x035f, B:79:0x0367, B:82:0x0370, B:84:0x0373, B:87:0x0389, B:89:0x03a4, B:91:0x03b0, B:94:0x03ba, B:95:0x03bd, B:97:0x03c9, B:99:0x03d1, B:100:0x03dc, B:102:0x03e4, B:103:0x03ef, B:105:0x03f5, B:107:0x0401, B:108:0x040a, B:110:0x0413, B:115:0x037e, B:118:0x0385, B:119:0x02c1, B:120:0x0280, B:122:0x022b, B:124:0x0197, B:125:0x0169, B:127:0x043b), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x032f A[Catch: SQLiteException -> 0x042a, all -> 0x0452, TryCatch #1 {all -> 0x0452, blocks: (B:8:0x0132, B:14:0x013e, B:16:0x014f, B:18:0x015b, B:20:0x0170, B:22:0x017d, B:24:0x0189, B:26:0x019e, B:28:0x01dc, B:32:0x01e6, B:35:0x0230, B:37:0x025f, B:41:0x0269, B:44:0x0284, B:46:0x028f, B:47:0x02a1, B:49:0x02a7, B:51:0x02b3, B:53:0x02ca, B:55:0x02d0, B:57:0x02dc, B:59:0x02e5, B:61:0x02ed, B:64:0x02f6, B:66:0x030e, B:68:0x0317, B:70:0x032f, B:72:0x033b, B:73:0x034d, B:75:0x0353, B:77:0x035f, B:79:0x0367, B:82:0x0370, B:84:0x0373, B:87:0x0389, B:89:0x03a4, B:91:0x03b0, B:94:0x03ba, B:95:0x03bd, B:97:0x03c9, B:99:0x03d1, B:100:0x03dc, B:102:0x03e4, B:103:0x03ef, B:105:0x03f5, B:107:0x0401, B:108:0x040a, B:110:0x0413, B:115:0x037e, B:118:0x0385, B:119:0x02c1, B:120:0x0280, B:122:0x022b, B:124:0x0197, B:125:0x0169, B:127:0x043b), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0353 A[Catch: SQLiteException -> 0x042a, all -> 0x0452, TryCatch #1 {all -> 0x0452, blocks: (B:8:0x0132, B:14:0x013e, B:16:0x014f, B:18:0x015b, B:20:0x0170, B:22:0x017d, B:24:0x0189, B:26:0x019e, B:28:0x01dc, B:32:0x01e6, B:35:0x0230, B:37:0x025f, B:41:0x0269, B:44:0x0284, B:46:0x028f, B:47:0x02a1, B:49:0x02a7, B:51:0x02b3, B:53:0x02ca, B:55:0x02d0, B:57:0x02dc, B:59:0x02e5, B:61:0x02ed, B:64:0x02f6, B:66:0x030e, B:68:0x0317, B:70:0x032f, B:72:0x033b, B:73:0x034d, B:75:0x0353, B:77:0x035f, B:79:0x0367, B:82:0x0370, B:84:0x0373, B:87:0x0389, B:89:0x03a4, B:91:0x03b0, B:94:0x03ba, B:95:0x03bd, B:97:0x03c9, B:99:0x03d1, B:100:0x03dc, B:102:0x03e4, B:103:0x03ef, B:105:0x03f5, B:107:0x0401, B:108:0x040a, B:110:0x0413, B:115:0x037e, B:118:0x0385, B:119:0x02c1, B:120:0x0280, B:122:0x022b, B:124:0x0197, B:125:0x0169, B:127:0x043b), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03a4 A[Catch: SQLiteException -> 0x042a, all -> 0x0452, TryCatch #1 {all -> 0x0452, blocks: (B:8:0x0132, B:14:0x013e, B:16:0x014f, B:18:0x015b, B:20:0x0170, B:22:0x017d, B:24:0x0189, B:26:0x019e, B:28:0x01dc, B:32:0x01e6, B:35:0x0230, B:37:0x025f, B:41:0x0269, B:44:0x0284, B:46:0x028f, B:47:0x02a1, B:49:0x02a7, B:51:0x02b3, B:53:0x02ca, B:55:0x02d0, B:57:0x02dc, B:59:0x02e5, B:61:0x02ed, B:64:0x02f6, B:66:0x030e, B:68:0x0317, B:70:0x032f, B:72:0x033b, B:73:0x034d, B:75:0x0353, B:77:0x035f, B:79:0x0367, B:82:0x0370, B:84:0x0373, B:87:0x0389, B:89:0x03a4, B:91:0x03b0, B:94:0x03ba, B:95:0x03bd, B:97:0x03c9, B:99:0x03d1, B:100:0x03dc, B:102:0x03e4, B:103:0x03ef, B:105:0x03f5, B:107:0x0401, B:108:0x040a, B:110:0x0413, B:115:0x037e, B:118:0x0385, B:119:0x02c1, B:120:0x0280, B:122:0x022b, B:124:0x0197, B:125:0x0169, B:127:0x043b), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03c9 A[Catch: SQLiteException -> 0x042a, all -> 0x0452, TryCatch #1 {all -> 0x0452, blocks: (B:8:0x0132, B:14:0x013e, B:16:0x014f, B:18:0x015b, B:20:0x0170, B:22:0x017d, B:24:0x0189, B:26:0x019e, B:28:0x01dc, B:32:0x01e6, B:35:0x0230, B:37:0x025f, B:41:0x0269, B:44:0x0284, B:46:0x028f, B:47:0x02a1, B:49:0x02a7, B:51:0x02b3, B:53:0x02ca, B:55:0x02d0, B:57:0x02dc, B:59:0x02e5, B:61:0x02ed, B:64:0x02f6, B:66:0x030e, B:68:0x0317, B:70:0x032f, B:72:0x033b, B:73:0x034d, B:75:0x0353, B:77:0x035f, B:79:0x0367, B:82:0x0370, B:84:0x0373, B:87:0x0389, B:89:0x03a4, B:91:0x03b0, B:94:0x03ba, B:95:0x03bd, B:97:0x03c9, B:99:0x03d1, B:100:0x03dc, B:102:0x03e4, B:103:0x03ef, B:105:0x03f5, B:107:0x0401, B:108:0x040a, B:110:0x0413, B:115:0x037e, B:118:0x0385, B:119:0x02c1, B:120:0x0280, B:122:0x022b, B:124:0x0197, B:125:0x0169, B:127:0x043b), top: B:2:0x000d }] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4, types: [com.google.android.gms.measurement.internal.zzg] */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzg zze(String str) {
        Cursor cursor;
        ?? r16;
        Cursor cursor2;
        Cursor cursor3;
        Cursor cursor4;
        SQLiteDatabase e_;
        String[] strArr;
        boolean z;
        boolean z2;
        Boolean valueOf;
        String string;
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        try {
            try {
                e_ = e_();
                strArr = new String[44];
                strArr[0] = "app_instance_id";
                strArr[1] = "gmp_app_id";
                strArr[2] = "resettable_device_id_hash";
                strArr[3] = "last_bundle_index";
                strArr[4] = "last_bundle_start_timestamp";
                strArr[5] = "last_bundle_end_timestamp";
                strArr[6] = "app_version";
                strArr[7] = "app_store";
                strArr[8] = "gmp_version";
                cursor = null;
                r16 = 0;
                r16 = 0;
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SQLiteException e) {
            e = e;
            r16 = 0;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
        try {
            strArr[9] = "dev_cert_hash";
            strArr[10] = "measurement_enabled";
            strArr[11] = "day";
            strArr[12] = "daily_public_events_count";
            strArr[13] = "daily_events_count";
            strArr[14] = "daily_conversions_count";
            strArr[15] = "config_fetched_time";
            strArr[16] = "failed_config_fetch_time";
            strArr[17] = "app_version_int";
            strArr[18] = "firebase_instance_id";
            strArr[19] = "daily_error_events_count";
            strArr[20] = "daily_realtime_events_count";
            strArr[21] = "health_monitor_sample";
            strArr[22] = "android_id";
            strArr[23] = "adid_reporting_enabled";
            strArr[24] = "admob_app_id";
            strArr[25] = "dynamite_version";
            strArr[26] = "safelisted_events";
            strArr[27] = "ga_app_id";
            strArr[28] = "session_stitching_token";
            strArr[29] = "sgtm_upload_enabled";
            strArr[30] = "target_os_version";
            strArr[31] = "session_stitching_token_hash";
            strArr[32] = "ad_services_version";
            strArr[33] = "unmatched_first_open_without_ad_id";
            strArr[34] = "npa_metadata_value";
            strArr[35] = "attribution_eligibility_status";
            strArr[36] = "sgtm_preview_key";
            strArr[37] = "dma_consent_state";
            strArr[38] = "daily_realtime_dcu_count";
            strArr[39] = "bundle_delivery_index";
            strArr[40] = "serialized_npa_metadata";
            strArr[41] = "unmatched_pfo";
            strArr[42] = "unmatched_uwa";
            strArr[43] = "ad_campaign_info";
            cursor4 = e_.query("apps", strArr, "app_id=?", new String[]{str}, null, null, null);
            try {
                if (!cursor4.moveToFirst()) {
                    if (cursor4 != null) {
                        cursor4.close();
                    }
                    return null;
                }
                zzg zzgVar = new zzg(this.zzf.zzk(), str);
                if (!com.google.android.gms.internal.measurement.zznk.zza() || !zze().zza(zzbf.zzcv) || this.zzf.zzb(str).zza(zzin.zza.ANALYTICS_STORAGE)) {
                    zzgVar.zzb(cursor4.getString(0));
                }
                zzgVar.zzf(cursor4.getString(1));
                if (!com.google.android.gms.internal.measurement.zznk.zza() || !zze().zza(zzbf.zzcv) || this.zzf.zzb(str).zza(zzin.zza.AD_STORAGE)) {
                    zzgVar.zzh(cursor4.getString(2));
                }
                zzgVar.zzq(cursor4.getLong(3));
                zzgVar.zzr(cursor4.getLong(4));
                zzgVar.zzp(cursor4.getLong(5));
                zzgVar.zzd(cursor4.getString(6));
                zzgVar.zzc(cursor4.getString(7));
                zzgVar.zzn(cursor4.getLong(8));
                zzgVar.zzk(cursor4.getLong(9));
                if (!cursor4.isNull(10) && cursor4.getInt(10) == 0) {
                    z = false;
                    zzgVar.zzb(z);
                    zzgVar.zzj(cursor4.getLong(11));
                    zzgVar.zzh(cursor4.getLong(12));
                    zzgVar.zzg(cursor4.getLong(13));
                    zzgVar.zze(cursor4.getLong(14));
                    zzgVar.zzd(cursor4.getLong(15));
                    zzgVar.zzm(cursor4.getLong(16));
                    zzgVar.zzb(!cursor4.isNull(17) ? SieveCacheKt.NodeMetaAndPreviousMask : cursor4.getInt(17));
                    zzgVar.zze(cursor4.getString(18));
                    zzgVar.zzf(cursor4.getLong(19));
                    zzgVar.zzi(cursor4.getLong(20));
                    zzgVar.zzg(cursor4.getString(21));
                    if (!cursor4.isNull(23) && cursor4.getInt(23) == 0) {
                        z2 = false;
                        zzgVar.zza(z2);
                        zzgVar.zza(cursor4.getString(24));
                        zzgVar.zzl(!cursor4.isNull(25) ? 0L : cursor4.getLong(25));
                        if (!cursor4.isNull(26)) {
                            zzgVar.zza(Arrays.asList(cursor4.getString(26).split(",", -1)));
                        }
                        if (com.google.android.gms.internal.measurement.zznk.zza() || !zze().zza(zzbf.zzcv) || this.zzf.zzb(str).zza(zzin.zza.ANALYTICS_STORAGE)) {
                            zzgVar.zzj(cursor4.getString(28));
                        }
                        if (zzpn.zza() && zze().zza(zzbf.zzbs)) {
                            zzq();
                            if (zznp.zzf(str)) {
                                zzgVar.zzc((cursor4.isNull(29) || cursor4.getInt(29) == 0) ? false : true);
                                zzgVar.zzo(cursor4.getLong(39));
                                if (zze().zza(zzbf.zzbt)) {
                                    zzgVar.zzk(cursor4.getString(36));
                                }
                            }
                        }
                        zzgVar.zzt(cursor4.getLong(30));
                        zzgVar.zzs(cursor4.getLong(31));
                        if (zzpg.zza() && zze().zze(str, zzbf.zzbz)) {
                            zzgVar.zza(cursor4.getInt(32));
                            zzgVar.zzc(cursor4.getLong(35));
                        }
                        if (com.google.android.gms.internal.measurement.zznl.zza() && zze().zze(str, zzbf.zzck)) {
                            zzgVar.zzd(cursor4.isNull(33) && cursor4.getInt(33) != 0);
                        }
                        if (cursor4.isNull(34)) {
                            valueOf = Boolean.valueOf(cursor4.getInt(34) != 0);
                        } else {
                            valueOf = null;
                        }
                        zzgVar.zza(valueOf);
                        zzgVar.zzc(cursor4.getInt(37));
                        zzgVar.zzb(cursor4.getInt(38));
                        if (com.google.android.gms.internal.measurement.zzne.zza() && zze().zze(str, zzbf.zzcp)) {
                            string = cursor4.getString(40);
                            if (string == null) {
                                string = "";
                            }
                            zzgVar.zzi(string);
                        }
                        if (zze().zza(zzbf.zzcs)) {
                            if (!cursor4.isNull(41)) {
                                zzgVar.zza(Long.valueOf(cursor4.getLong(41)));
                            }
                            if (!cursor4.isNull(42)) {
                                zzgVar.zzb(Long.valueOf(cursor4.getLong(42)));
                            }
                        }
                        if (zzoj.zza() && zze().zze(str, zzbf.zzcm)) {
                            zzgVar.zza(cursor4.getBlob(43));
                        }
                        zzgVar.zzao();
                        if (cursor4.moveToNext()) {
                            zzj().zzg().zza("Got multiple records for app, expected one. appId", zzfw.zza(str));
                        }
                        if (cursor4 != null) {
                            cursor4.close();
                        }
                        return zzgVar;
                    }
                    z2 = true;
                    zzgVar.zza(z2);
                    zzgVar.zza(cursor4.getString(24));
                    zzgVar.zzl(!cursor4.isNull(25) ? 0L : cursor4.getLong(25));
                    if (!cursor4.isNull(26)) {
                    }
                    if (com.google.android.gms.internal.measurement.zznk.zza()) {
                    }
                    zzgVar.zzj(cursor4.getString(28));
                    if (zzpn.zza()) {
                        zzq();
                        if (zznp.zzf(str)) {
                        }
                    }
                    zzgVar.zzt(cursor4.getLong(30));
                    zzgVar.zzs(cursor4.getLong(31));
                    if (zzpg.zza()) {
                        zzgVar.zza(cursor4.getInt(32));
                        zzgVar.zzc(cursor4.getLong(35));
                    }
                    if (com.google.android.gms.internal.measurement.zznl.zza()) {
                        zzgVar.zzd(cursor4.isNull(33) && cursor4.getInt(33) != 0);
                    }
                    if (cursor4.isNull(34)) {
                    }
                    zzgVar.zza(valueOf);
                    zzgVar.zzc(cursor4.getInt(37));
                    zzgVar.zzb(cursor4.getInt(38));
                    if (com.google.android.gms.internal.measurement.zzne.zza()) {
                        string = cursor4.getString(40);
                        if (string == null) {
                        }
                        zzgVar.zzi(string);
                    }
                    if (zze().zza(zzbf.zzcs)) {
                    }
                    if (zzoj.zza()) {
                        zzgVar.zza(cursor4.getBlob(43));
                    }
                    zzgVar.zzao();
                    if (cursor4.moveToNext()) {
                    }
                    if (cursor4 != null) {
                    }
                    return zzgVar;
                }
                z = true;
                zzgVar.zzb(z);
                zzgVar.zzj(cursor4.getLong(11));
                zzgVar.zzh(cursor4.getLong(12));
                zzgVar.zzg(cursor4.getLong(13));
                zzgVar.zze(cursor4.getLong(14));
                zzgVar.zzd(cursor4.getLong(15));
                zzgVar.zzm(cursor4.getLong(16));
                zzgVar.zzb(!cursor4.isNull(17) ? SieveCacheKt.NodeMetaAndPreviousMask : cursor4.getInt(17));
                zzgVar.zze(cursor4.getString(18));
                zzgVar.zzf(cursor4.getLong(19));
                zzgVar.zzi(cursor4.getLong(20));
                zzgVar.zzg(cursor4.getString(21));
                if (!cursor4.isNull(23)) {
                    z2 = false;
                    zzgVar.zza(z2);
                    zzgVar.zza(cursor4.getString(24));
                    zzgVar.zzl(!cursor4.isNull(25) ? 0L : cursor4.getLong(25));
                    if (!cursor4.isNull(26)) {
                    }
                    if (com.google.android.gms.internal.measurement.zznk.zza()) {
                    }
                    zzgVar.zzj(cursor4.getString(28));
                    if (zzpn.zza()) {
                    }
                    zzgVar.zzt(cursor4.getLong(30));
                    zzgVar.zzs(cursor4.getLong(31));
                    if (zzpg.zza()) {
                    }
                    if (com.google.android.gms.internal.measurement.zznl.zza()) {
                    }
                    if (cursor4.isNull(34)) {
                    }
                    zzgVar.zza(valueOf);
                    zzgVar.zzc(cursor4.getInt(37));
                    zzgVar.zzb(cursor4.getInt(38));
                    if (com.google.android.gms.internal.measurement.zzne.zza()) {
                    }
                    if (zze().zza(zzbf.zzcs)) {
                    }
                    if (zzoj.zza()) {
                    }
                    zzgVar.zzao();
                    if (cursor4.moveToNext()) {
                    }
                    if (cursor4 != null) {
                    }
                    return zzgVar;
                }
                z2 = true;
                zzgVar.zza(z2);
                zzgVar.zza(cursor4.getString(24));
                zzgVar.zzl(!cursor4.isNull(25) ? 0L : cursor4.getLong(25));
                if (!cursor4.isNull(26)) {
                }
                if (com.google.android.gms.internal.measurement.zznk.zza()) {
                }
                zzgVar.zzj(cursor4.getString(28));
                if (zzpn.zza()) {
                }
                zzgVar.zzt(cursor4.getLong(30));
                zzgVar.zzs(cursor4.getLong(31));
                if (zzpg.zza()) {
                }
                if (com.google.android.gms.internal.measurement.zznl.zza()) {
                }
                if (cursor4.isNull(34)) {
                }
                zzgVar.zza(valueOf);
                zzgVar.zzc(cursor4.getInt(37));
                zzgVar.zzb(cursor4.getInt(38));
                if (com.google.android.gms.internal.measurement.zzne.zza()) {
                }
                if (zze().zza(zzbf.zzcs)) {
                }
                if (zzoj.zza()) {
                }
                zzgVar.zzao();
                if (cursor4.moveToNext()) {
                }
                if (cursor4 != null) {
                }
                return zzgVar;
            } catch (SQLiteException e2) {
                e = e2;
                zzj().zzg().zza("Error querying app. appId", zzfw.zza(str), e);
                if (cursor4 != null) {
                    cursor4.close();
                }
                return r16;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor4 = r16;
            zzj().zzg().zza("Error querying app. appId", zzfw.zza(str), e);
            if (cursor4 != null) {
            }
            return r16;
        } catch (Throwable th3) {
            th = th3;
            cursor3 = cursor;
            if (cursor3 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015e  */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4, types: [com.google.android.gms.measurement.internal.zzae] */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzae zzc(String str, String str2) {
        Cursor cursor;
        zzal zzalVar;
        String str3;
        ?? r16;
        Cursor cursor2;
        Cursor cursor3;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzal();
        try {
            cursor = null;
            r16 = 0;
            r16 = 0;
            r16 = 0;
            try {
                cursor3 = e_().query("conditional_properties", new String[]{"origin", "value", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    try {
                        if (!cursor3.moveToFirst()) {
                            if (cursor3 != null) {
                                cursor3.close();
                            }
                            return null;
                        }
                        String string = cursor3.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        zzalVar = this;
                        try {
                            Object zza2 = zzalVar.zza(cursor3, 1);
                            boolean z = cursor3.getInt(2) != 0;
                            String string2 = cursor3.getString(3);
                            long j = cursor3.getLong(4);
                            str3 = str2;
                            String str4 = string;
                            try {
                                zzae zzaeVar = new zzae(str, str4, new zzno(str3, cursor3.getLong(8), zza2, str4), cursor3.getLong(6), z, string2, (zzbd) zzalVar.g_().zza(cursor3.getBlob(5), zzbd.CREATOR), j, (zzbd) zzalVar.g_().zza(cursor3.getBlob(7), zzbd.CREATOR), cursor3.getLong(9), (zzbd) zzalVar.g_().zza(cursor3.getBlob(10), zzbd.CREATOR));
                                if (cursor3.moveToNext()) {
                                    zzalVar.zzj().zzg().zza("Got multiple records for conditional property, expected one", zzfw.zza(str), zzalVar.zzi().zzc(str3));
                                }
                                if (cursor3 != null) {
                                    cursor3.close();
                                }
                                return zzaeVar;
                            } catch (SQLiteException e) {
                                e = e;
                                zzalVar.zzj().zzg().zza("Error querying conditional property", zzfw.zza(str), zzalVar.zzi().zzc(str3), e);
                                if (cursor3 != null) {
                                    cursor3.close();
                                }
                                return r16;
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            str3 = str2;
                            zzalVar.zzj().zzg().zza("Error querying conditional property", zzfw.zza(str), zzalVar.zzi().zzc(str3), e);
                            if (cursor3 != null) {
                            }
                            return r16;
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor2 = cursor3;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    zzalVar = this;
                }
            } catch (SQLiteException e4) {
                e = e4;
                zzalVar = this;
                str3 = str2;
                cursor3 = r16;
                zzalVar.zzj().zzg().zza("Error querying conditional property", zzfw.zza(str), zzalVar.zzi().zzc(str3), e);
                if (cursor3 != null) {
                }
                return r16;
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                }
                throw th;
            }
        } catch (SQLiteException e5) {
            e = e5;
            zzalVar = this;
            str3 = str2;
            r16 = 0;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzan zzf(String str) {
        Throwable th;
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        Cursor cursor2 = null;
        try {
            cursor = e_().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (!cursor.moveToFirst()) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    byte[] blob = cursor.getBlob(0);
                    String string = cursor.getString(1);
                    String string2 = cursor.getString(2);
                    if (cursor.moveToNext()) {
                        zzj().zzg().zza("Got multiple records for app config, expected one. appId", zzfw.zza(str));
                    }
                    if (blob == null) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    zzan zzanVar = new zzan(blob, string, string2);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return zzanVar;
                } catch (SQLiteException e) {
                    e = e;
                    zzj().zzg().zza("Error querying remote config. appId", zzfw.zza(str), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 == null) {
                    cursor2.close();
                    throw th;
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 == null) {
            }
        }
    }

    public final zzaq zza(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        return zza(j, str, 1L, false, false, z3, false, z5, z6);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzaq zza(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        String[] strArr = {str};
        zzaq zzaqVar = new zzaq();
        try {
            SQLiteDatabase e_ = e_();
            Cursor query = e_.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                if (!query.moveToFirst()) {
                    zzj().zzu().zza("Not updating daily counts, app is not known. appId", zzfw.zza(str));
                    if (query != null) {
                        query.close();
                        return zzaqVar;
                    }
                } else {
                    if (query.getLong(0) == j) {
                        zzaqVar.zzb = query.getLong(1);
                        zzaqVar.zza = query.getLong(2);
                        zzaqVar.zzc = query.getLong(3);
                        zzaqVar.zzd = query.getLong(4);
                        zzaqVar.zze = query.getLong(5);
                        zzaqVar.zzf = query.getLong(6);
                    }
                    if (z) {
                        zzaqVar.zzb += j2;
                    }
                    if (z2) {
                        zzaqVar.zza += j2;
                    }
                    if (z3) {
                        zzaqVar.zzc += j2;
                    }
                    if (z4) {
                        zzaqVar.zzd += j2;
                    }
                    if (z5) {
                        zzaqVar.zze += j2;
                    }
                    if (z6) {
                        zzaqVar.zzf += j2;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(zzaqVar.zza));
                    contentValues.put("daily_events_count", Long.valueOf(zzaqVar.zzb));
                    contentValues.put("daily_conversions_count", Long.valueOf(zzaqVar.zzc));
                    contentValues.put("daily_error_events_count", Long.valueOf(zzaqVar.zzd));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(zzaqVar.zze));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(zzaqVar.zzf));
                    e_.update("apps", contentValues, "app_id=?", strArr);
                    if (query != null) {
                        query.close();
                        return zzaqVar;
                    }
                }
            } catch (SQLiteException e) {
                e = e;
                cursor = query;
                try {
                    zzj().zzg().zza("Error updating daily counts. appId", zzfw.zza(str), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return zzaqVar;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = query;
                if (cursor != null) {
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
        return zzaqVar;
    }

    public final zzav zzg(String str) {
        Preconditions.checkNotNull(str);
        zzt();
        zzal();
        return zzav.zza(zza("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final zzaz zzd(String str, String str2) {
        return zzc("events", str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final zzaz zzc(String str, String str2, String str3) {
        String str4;
        Cursor cursor;
        Cursor cursor2;
        Boolean valueOf;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        zzt();
        zzal();
        Cursor cursor3 = null;
        try {
            cursor = e_().query(str, (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
            try {
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
                long j = cursor.getLong(0);
                long j2 = cursor.getLong(1);
                long j3 = cursor.getLong(2);
                long j4 = 0;
                long j5 = cursor.isNull(3) ? 0L : cursor.getLong(3);
                Long valueOf2 = cursor.isNull(4) ? null : Long.valueOf(cursor.getLong(4));
                Long valueOf3 = cursor.isNull(5) ? null : Long.valueOf(cursor.getLong(5));
                Long valueOf4 = cursor.isNull(6) ? null : Long.valueOf(cursor.getLong(6));
                if (cursor.isNull(7)) {
                    valueOf = null;
                } else {
                    try {
                        try {
                            valueOf = Boolean.valueOf(cursor.getLong(7) == 1);
                        } catch (SQLiteException e) {
                            e = e;
                            str4 = str3;
                            zzj().zzg().zza("Error querying events. appId", zzfw.zza(str2), zzi().zza(str4), e);
                            if (cursor != null) {
                                cursor.close();
                            }
                            return null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor3 = cursor;
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        throw th;
                    }
                }
                if (!cursor.isNull(8)) {
                    j4 = cursor.getLong(8);
                }
                cursor2 = cursor;
                Long l = valueOf3;
                str4 = str3;
                try {
                    zzaz zzazVar = new zzaz(str2, str4, j, j2, j4, j3, j5, valueOf2, l, valueOf4, valueOf);
                    if (cursor2.moveToNext()) {
                        zzj().zzg().zza("Got multiple records for event aggregates, expected one. appId", zzfw.zza(str2));
                    }
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    return zzazVar;
                } catch (SQLiteException e2) {
                    e = e2;
                    cursor = cursor2;
                    zzj().zzg().zza("Error querying events. appId", zzfw.zza(str2), zzi().zza(str4), e);
                    if (cursor != null) {
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor3 = cursor2;
                    if (cursor3 != null) {
                    }
                    throw th;
                }
            } catch (SQLiteException e3) {
                e = e3;
                str4 = str3;
            } catch (Throwable th3) {
                th = th3;
                cursor2 = cursor;
            }
        } catch (SQLiteException e4) {
            e = e4;
            str4 = str3;
            cursor = null;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final zzin zzh(String str) {
        Preconditions.checkNotNull(str);
        zzt();
        zzal();
        return zzin.zzb(zza("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final zzin zzi(String str) {
        Preconditions.checkNotNull(str);
        zzt();
        zzal();
        zzin zzinVar = (zzin) zza("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str}, new zzas() { // from class: com.google.android.gms.measurement.internal.zzao
            @Override // com.google.android.gms.measurement.internal.zzas
            public final Object zza(Cursor cursor) {
                zzin zza2;
                zza2 = zzin.zza(cursor.getString(0), cursor.getInt(1));
                return zza2;
            }
        });
        return zzinVar == null ? zzin.zza : zzinVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zznq zze(String str, String str2) {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzal();
        Cursor cursor2 = null;
        try {
            cursor = e_().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursor.moveToFirst()) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    long j = cursor.getLong(0);
                    Object zza2 = zza(cursor, 1);
                    if (zza2 == null) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    str3 = str;
                    str4 = str2;
                    try {
                        zznq zznqVar = new zznq(str3, cursor.getString(2), str4, j, zza2);
                        if (cursor.moveToNext()) {
                            zzj().zzg().zza("Got multiple records for user property, expected one. appId", zzfw.zza(str3));
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        return zznqVar;
                    } catch (SQLiteException e) {
                        e = e;
                        sQLiteException = e;
                        zzj().zzg().zza("Error querying user property. appId", zzfw.zza(str3), zzi().zzc(str4), sQLiteException);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    str3 = str;
                    str4 = str2;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 == null) {
                    cursor2.close();
                    throw th;
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            str3 = str;
            str4 = str2;
            sQLiteException = e3;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 == null) {
            }
        }
    }

    private final Object zza(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            zzj().zzg().zza("Loaded invalid null value from database");
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
        if (type == 4) {
            zzj().zzg().zza("Loaded invalid blob type value, ignoring it");
            return null;
        }
        zzj().zzg().zza("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final <T> T zza(String str, String[] strArr, zzas<T> zzasVar) {
        Cursor cursor;
        ?? r0 = 0;
        try {
            try {
                cursor = e_().rawQuery(str, strArr);
                try {
                    if (!cursor.moveToFirst()) {
                        zzj().zzp().zza("No data found");
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    T zza2 = zzasVar.zza(cursor);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return zza2;
                } catch (SQLiteException e) {
                    e = e;
                    zzj().zzg().zza("Error querying database.", e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                r0 = str;
                if (r0 != 0) {
                    r0.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (r0 != 0) {
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String zza(long j) {
        Cursor cursor;
        zzt();
        zzal();
        Cursor cursor2 = null;
        try {
            try {
                cursor = e_().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(j)});
                try {
                    if (!cursor.moveToFirst()) {
                        zzj().zzp().zza("No expired configs for apps with pending events");
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
                } catch (SQLiteException e) {
                    e = e;
                    zzj().zzg().zza("Error selecting expired configs", e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = j;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String f_() {
        Cursor cursor;
        Cursor cursor2 = null;
        try {
            cursor = e_().rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
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
                } catch (SQLiteException e) {
                    e = e;
                    this.zzj().zzg().zza("Database error getting next bundle app id", e);
                    if (cursor != null) {
                        cursor.close();
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
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    private final String zza(String str, String[] strArr, String str2) {
        Cursor cursor = null;
        try {
            try {
                cursor = e_().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    return cursor.getString(0);
                }
                if (cursor != null) {
                    cursor.close();
                }
                return str2;
            } catch (SQLiteException e) {
                this.zzj().zzg().zza("Database error", str, e);
                throw e;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0173, code lost:
    
        r4.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<Pair<zzfn.zzk, Long>> zza(String str, int i, int i2) {
        byte[] zzc2;
        long j;
        long j2;
        zzt();
        zzal();
        int i3 = 1;
        Preconditions.checkArgument(i > 0);
        Preconditions.checkArgument(i2 > 0);
        Preconditions.checkNotEmpty(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = e_().query("queue", new String[]{"rowid", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i));
                if (!query.moveToFirst()) {
                    List<Pair<zzfn.zzk, Long>> emptyList = Collections.emptyList();
                    if (query != null) {
                        query.close();
                    }
                    return emptyList;
                }
                ArrayList arrayList = new ArrayList();
                int i4 = 0;
                while (true) {
                    long j3 = query.getLong(0);
                    try {
                        zzc2 = g_().zzc(query.getBlob(i3));
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to unzip queued bundle. appId", zzfw.zza(str), e);
                    }
                    if (!arrayList.isEmpty() && zzc2.length + i4 > i2) {
                        break;
                    }
                    try {
                        zzfn.zzk.zza zzaVar = (zzfn.zzk.zza) zznl.zza(zzfn.zzk.zzw(), zzc2);
                        if (!arrayList.isEmpty()) {
                            zzfn.zzk zzkVar = (zzfn.zzk) ((Pair) arrayList.get(0)).first;
                            zzfn.zzk zzkVar2 = (zzfn.zzk) ((com.google.android.gms.internal.measurement.zzjk) zzaVar.zzai());
                            if (!zzkVar.zzae().equals(zzkVar2.zzae()) || !zzkVar.zzad().equals(zzkVar2.zzad()) || zzkVar.zzau() != zzkVar2.zzau() || !zzkVar.zzaf().equals(zzkVar2.zzaf())) {
                                break;
                            }
                            Iterator<zzfn.zzo> it = zzkVar.zzas().iterator();
                            while (true) {
                                j = -1;
                                if (!it.hasNext()) {
                                    j2 = -1;
                                    break;
                                }
                                zzfn.zzo next = it.next();
                                if ("_npa".equals(next.zzg())) {
                                    j2 = next.zzc();
                                    break;
                                }
                            }
                            Iterator<zzfn.zzo> it2 = zzkVar2.zzas().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                zzfn.zzo next2 = it2.next();
                                if ("_npa".equals(next2.zzg())) {
                                    j = next2.zzc();
                                    break;
                                }
                            }
                            if (j2 != j) {
                                break;
                            }
                        }
                        if (!query.isNull(2)) {
                            zzaVar.zzi(query.getInt(2));
                        }
                        i4 += zzc2.length;
                        arrayList.add(Pair.create((zzfn.zzk) ((com.google.android.gms.internal.measurement.zzjk) zzaVar.zzai()), Long.valueOf(j3)));
                    } catch (IOException e2) {
                        zzj().zzg().zza("Failed to merge queued bundle. appId", zzfw.zza(str), e2);
                    }
                    if (!query.moveToNext() || i4 > i2) {
                        break;
                    }
                    i3 = 1;
                }
                return arrayList;
            } catch (SQLiteException e3) {
                zzj().zzg().zza("Error querying bundles. appId", zzfw.zza(str), e3);
                List<Pair<zzfn.zzk, Long>> emptyList2 = Collections.emptyList();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyList2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final List<zzae> zza(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb.append(" and name glob ?");
        }
        return zza(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0085, code lost:
    
        zzj().zzg().zza("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<zzae> zza(String str, String[] strArr) {
        Cursor cursor;
        zzal zzalVar;
        zzt();
        zzal();
        ArrayList arrayList = new ArrayList();
        try {
            int i = 5;
            Cursor query = e_().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"}, str, strArr, null, null, "rowid", "1001");
            try {
                try {
                    if (query.moveToFirst()) {
                        while (true) {
                            if (arrayList.size() >= 1000) {
                                break;
                            }
                            String string = query.getString(0);
                            String string2 = query.getString(1);
                            String string3 = query.getString(2);
                            zzalVar = this;
                            try {
                                Object zza2 = zzalVar.zza(query, 3);
                                boolean z = query.getInt(4) != 0;
                                arrayList.add(new zzae(string, string2, new zzno(string3, query.getLong(10), zza2, string2), query.getLong(8), z, query.getString(i), (zzbd) zzalVar.g_().zza(query.getBlob(7), zzbd.CREATOR), query.getLong(6), (zzbd) zzalVar.g_().zza(query.getBlob(9), zzbd.CREATOR), query.getLong(11), (zzbd) zzalVar.g_().zza(query.getBlob(12), zzbd.CREATOR)));
                                if (!query.moveToNext()) {
                                    break;
                                }
                                i = 5;
                            } catch (SQLiteException e) {
                                e = e;
                                cursor = query;
                                try {
                                    zzalVar.zzj().zzg().zza("Error querying conditional user property value", e);
                                    List<zzae> emptyList = Collections.emptyList();
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    return emptyList;
                                } catch (Throwable th) {
                                    th = th;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            }
                        }
                        if (query != null) {
                            query.close();
                        }
                    } else if (query != null) {
                        query.close();
                        return arrayList;
                    }
                    return arrayList;
                } catch (SQLiteException e2) {
                    e = e2;
                    zzalVar = this;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = query;
                if (cursor != null) {
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            zzalVar = this;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    public final List<zzmu> zzj(String str) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = e_().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new zzmu(string, cursor.getLong(1), cursor.getInt(2)));
                    } while (cursor.moveToNext());
                    if (cursor != null) {
                        cursor.close();
                    }
                } else if (cursor != null) {
                    cursor.close();
                    return arrayList;
                }
                return arrayList;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error querying trigger uris. appId", zzfw.zza(str), e);
                List<zzmu> emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } finally {
        }
    }

    public final List<zznq> zzk(String str) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = e_().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        if (string2 == null) {
                            string2 = "";
                        }
                        String str2 = string2;
                        long j = cursor.getLong(2);
                        Object zza2 = zza(cursor, 3);
                        if (zza2 == null) {
                            zzj().zzg().zza("Read invalid user property value, ignoring it. appId", zzfw.zza(str));
                        } else {
                            arrayList.add(new zznq(str, str2, string, j, zza2));
                        }
                    } while (cursor.moveToNext());
                    if (cursor != null) {
                        cursor.close();
                    }
                } else if (cursor != null) {
                    cursor.close();
                    return arrayList;
                }
                return arrayList;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error querying user properties. appId", zzfw.zza(str), e);
                List<zznq> emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ae, code lost:
    
        zzj().zzg().zza("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<zznq> zzb(String str, String str2, String str3) {
        Cursor cursor;
        zzal zzalVar;
        String str4;
        int i;
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        ArrayList arrayList = new ArrayList();
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
                    } catch (SQLiteException e) {
                        e = e;
                        cursor = null;
                        zzalVar = this;
                        try {
                            zzalVar.zzj().zzg().zza("(2)Error querying user properties", zzfw.zza(str), str4, e);
                            List<zznq> emptyList = Collections.emptyList();
                            if (cursor != null) {
                            }
                            return emptyList;
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                }
                try {
                    if (!TextUtils.isEmpty(str3)) {
                        arrayList2.add(str3 + "*");
                        sb.append(" and name glob ?");
                    }
                    String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                    String sb2 = sb.toString();
                    int i2 = 1;
                    Cursor query = e_().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, sb2, strArr, null, null, "rowid", "1001");
                    try {
                        try {
                            if (query.moveToFirst()) {
                                while (true) {
                                    if (arrayList.size() >= 1000) {
                                        break;
                                    }
                                    String string = query.getString(0);
                                    long j = query.getLong(i2);
                                    zzalVar = this;
                                    try {
                                        Object zza2 = zzalVar.zza(query, 2);
                                        str4 = query.getString(3);
                                        if (zza2 == null) {
                                            zzalVar.zzj().zzg().zza("(2)Read invalid user property value, ignoring it", zzfw.zza(str5), str4, str3);
                                            i = i2;
                                        } else {
                                            i = i2;
                                            arrayList.add(new zznq(str5, str4, string, j, zza2));
                                        }
                                        if (!query.moveToNext()) {
                                            break;
                                        }
                                        str5 = str;
                                        i2 = i;
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        cursor = query;
                                        zzalVar.zzj().zzg().zza("(2)Error querying user properties", zzfw.zza(str), str4, e);
                                        List<zznq> emptyList2 = Collections.emptyList();
                                        if (cursor != null) {
                                        }
                                        return emptyList2;
                                    }
                                }
                                if (query != null) {
                                    query.close();
                                }
                            } else if (query != null) {
                                query.close();
                                return arrayList;
                            }
                            return arrayList;
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = query;
                            if (cursor != null) {
                            }
                            throw th;
                        }
                    } catch (SQLiteException e3) {
                        e = e3;
                        zzalVar = this;
                    }
                } catch (SQLiteException e4) {
                    e = e4;
                    zzalVar = this;
                    cursor = null;
                    zzalVar.zzj().zzg().zza("(2)Error querying user properties", zzfw.zza(str), str4, e);
                    List<zznq> emptyList22 = Collections.emptyList();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return emptyList22;
                }
            } catch (SQLiteException e5) {
                e = e5;
                zzalVar = this;
                str4 = str2;
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    final Map<Integer, zzfn.zzm> zzl(String str) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = e_().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, zzfn.zzm> emptyMap = Collections.emptyMap();
                    if (query != null) {
                        query.close();
                    }
                    return emptyMap;
                }
                ArrayMap arrayMap = new ArrayMap();
                do {
                    int i = query.getInt(0);
                    try {
                        arrayMap.put(Integer.valueOf(i), (zzfn.zzm) ((com.google.android.gms.internal.measurement.zzjk) ((zzfn.zzm.zza) zznl.zza(zzfn.zzm.zze(), query.getBlob(1))).zzai()));
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to merge filter results. appId, audienceId, error", zzfw.zza(str), Integer.valueOf(i), e);
                    }
                } while (query.moveToNext());
                if (query != null) {
                    query.close();
                }
                return arrayMap;
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Database error querying filter results. appId", zzfw.zza(str), e2);
                Map<Integer, zzfn.zzm> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } finally {
        }
    }

    final Map<Integer, List<zzff.zzb>> zzm(String str) {
        Preconditions.checkNotEmpty(str);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            try {
                Cursor query = e_().query("event_filters", new String[]{"audience_id", Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<zzff.zzb>> emptyMap = Collections.emptyMap();
                    if (query != null) {
                        query.close();
                    }
                    return emptyMap;
                }
                do {
                    try {
                        zzff.zzb zzbVar = (zzff.zzb) ((com.google.android.gms.internal.measurement.zzjk) ((zzff.zzb.zza) zznl.zza(zzff.zzb.zzc(), query.getBlob(1))).zzai());
                        if (zzbVar.zzk()) {
                            int i = query.getInt(0);
                            List list = (List) arrayMap.get(Integer.valueOf(i));
                            if (list == null) {
                                list = new ArrayList();
                                arrayMap.put(Integer.valueOf(i), list);
                            }
                            list.add(zzbVar);
                        }
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to merge filter. appId", zzfw.zza(str), e);
                    }
                } while (query.moveToNext());
                if (query != null) {
                    query.close();
                }
                return arrayMap;
            } finally {
            }
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Database error querying filters. appId", zzfw.zza(str), e2);
            Map<Integer, List<zzff.zzb>> emptyMap2 = Collections.emptyMap();
            if (0 != 0) {
                cursor.close();
            }
            return emptyMap2;
        }
    }

    final Map<Integer, List<zzff.zzb>> zzf(String str, String str2) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            try {
                Cursor query = e_().query("event_filters", new String[]{"audience_id", Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<zzff.zzb>> emptyMap = Collections.emptyMap();
                    if (query != null) {
                        query.close();
                    }
                    return emptyMap;
                }
                do {
                    try {
                        zzff.zzb zzbVar = (zzff.zzb) ((com.google.android.gms.internal.measurement.zzjk) ((zzff.zzb.zza) zznl.zza(zzff.zzb.zzc(), query.getBlob(1))).zzai());
                        int i = query.getInt(0);
                        List list = (List) arrayMap.get(Integer.valueOf(i));
                        if (list == null) {
                            list = new ArrayList();
                            arrayMap.put(Integer.valueOf(i), list);
                        }
                        list.add(zzbVar);
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to merge filter. appId", zzfw.zza(str), e);
                    }
                } while (query.moveToNext());
                if (query != null) {
                    query.close();
                }
                return arrayMap;
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Database error querying filters. appId", zzfw.zza(str), e2);
                Map<Integer, List<zzff.zzb>> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } finally {
        }
    }

    final Map<Integer, List<zzff.zze>> zzg(String str, String str2) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            try {
                Cursor query = e_().query("property_filters", new String[]{"audience_id", Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<zzff.zze>> emptyMap = Collections.emptyMap();
                    if (query != null) {
                        query.close();
                    }
                    return emptyMap;
                }
                do {
                    try {
                        zzff.zze zzeVar = (zzff.zze) ((com.google.android.gms.internal.measurement.zzjk) ((zzff.zze.zza) zznl.zza(zzff.zze.zzc(), query.getBlob(1))).zzai());
                        int i = query.getInt(0);
                        List list = (List) arrayMap.get(Integer.valueOf(i));
                        if (list == null) {
                            list = new ArrayList();
                            arrayMap.put(Integer.valueOf(i), list);
                        }
                        list.add(zzeVar);
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to merge filter", zzfw.zza(str), e);
                    }
                } while (query.moveToNext());
                if (query != null) {
                    query.close();
                }
                return arrayMap;
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Database error querying filters. appId", zzfw.zza(str), e2);
                Map<Integer, List<zzff.zze>> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } finally {
        }
    }

    final Map<Integer, List<Integer>> zzn(String str) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = e_().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str, str});
                if (!rawQuery.moveToFirst()) {
                    Map<Integer, List<Integer>> emptyMap = Collections.emptyMap();
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return emptyMap;
                }
                do {
                    int i = rawQuery.getInt(0);
                    List list = (List) arrayMap.get(Integer.valueOf(i));
                    if (list == null) {
                        list = new ArrayList();
                        arrayMap.put(Integer.valueOf(i), list);
                    }
                    list.add(Integer.valueOf(rawQuery.getInt(1)));
                } while (rawQuery.moveToNext());
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return arrayMap;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Database error querying scoped filters. appId", zzfw.zza(str), e);
                Map<Integer, List<Integer>> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    zzal(zznc zzncVar) {
        super(zzncVar);
        this.zzm = new zzmr(zzb());
        this.zzl = new zzar(this, zza(), "google_app_measurement.db");
    }

    public final void zzp() {
        zzal();
        e_().beginTransaction();
    }

    private final void zzi(String str, String str2) {
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzal();
        try {
            e_().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error deleting snapshot. appId", zzfw.zza(str2), e);
        }
    }

    public final void zzo(String str) {
        zzaz zzd2;
        zzi("events_snapshot", str);
        Cursor cursor = null;
        try {
            try {
                cursor = e_().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                        return;
                    }
                    return;
                }
                do {
                    String string = cursor.getString(0);
                    if (string != null && (zzd2 = zzd(str, string)) != null) {
                        zza("events_snapshot", zzd2);
                    }
                } while (cursor.moveToNext());
                if (cursor != null) {
                    cursor.close();
                }
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error creating snapshot. appId", zzfw.zza(str), e);
                if (cursor != null) {
                    cursor.close();
                }
            }
        } finally {
        }
    }

    public final void zzu() {
        zzal();
        e_().endTransaction();
    }

    final void zza(List<Long> list) {
        zzt();
        zzal();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzaa()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (zzb("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", (String[]) null) > 0) {
                zzj().zzu().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                e_().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error incrementing retry count. error", e);
            }
        }
    }

    final void zzv() {
        int delete;
        zzt();
        zzal();
        if (zzaa()) {
            long zza2 = zzn().zza.zza();
            long elapsedRealtime = zzb().elapsedRealtime();
            if (Math.abs(elapsedRealtime - zza2) > zzbf.zzy.zza(null).longValue()) {
                zzn().zza.zza(elapsedRealtime);
                zzt();
                zzal();
                if (!zzaa() || (delete = e_().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(zzb().currentTimeMillis()), String.valueOf(zzag.zzm())})) <= 0) {
                    return;
                }
                zzj().zzp().zza("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
            }
        }
    }

    public final void zzh(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzal();
        try {
            e_().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error deleting user property. appId", zzfw.zza(str), zzi().zzc(str2), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x009f, code lost:
    
        if ("_v".equals(r0) != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzp(String str) {
        boolean z;
        zzaz zzc2;
        boolean z2 = false;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        zzaz zzd2 = zzd(str, "_f");
        zzaz zzd3 = zzd(str, "_v");
        zzi("events", str);
        Cursor cursor = null;
        try {
            cursor = e_().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
            if (!cursor.moveToFirst()) {
                if (cursor != null) {
                    cursor.close();
                }
                if (zzd2 != null) {
                    zza("events", zzd2);
                } else if (zzd3 != null) {
                    zza("events", zzd3);
                }
                zzi("events_snapshot", str);
                return;
            }
            boolean z3 = false;
            z = false;
            do {
                try {
                    String string = cursor.getString(0);
                    if (zze().zza(zzbf.zzcx)) {
                        if (cursor.getLong(1) >= 1) {
                            if ("_f".equals(string)) {
                                z3 = true;
                            } else if ("_v".equals(string)) {
                                z = true;
                            }
                        }
                        if (string != null && (zzc2 = zzc("events_snapshot", str, string)) != null) {
                            zza("events", zzc2);
                        }
                    } else {
                        if (!"_f".equals(string)) {
                        }
                        z3 = true;
                        if (string != null) {
                            zza("events", zzc2);
                        }
                    }
                } catch (SQLiteException e) {
                    e = e;
                    z2 = z3;
                    try {
                        zzj().zzg().zza("Error querying snapshot. appId", zzfw.zza(str), e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (!z2 && zzd2 != null) {
                            zza("events", zzd2);
                        } else if (!z && zzd3 != null) {
                            zza("events", zzd3);
                        }
                        zzi("events_snapshot", str);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (z2 && zzd2 != null) {
                            zza("events", zzd2);
                        } else if (!z && zzd3 != null) {
                            zza("events", zzd3);
                        }
                        zzi("events_snapshot", str);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z2 = z3;
                    if (cursor != null) {
                    }
                    if (z2) {
                    }
                    if (!z) {
                        zza("events", zzd3);
                    }
                    zzi("events_snapshot", str);
                    throw th;
                }
            } while (cursor.moveToNext());
            if (cursor != null) {
                cursor.close();
            }
            if (!z3 && zzd2 != null) {
                zza("events", zzd2);
            } else if (!z && zzd3 != null) {
                zza("events", zzd3);
            }
            zzi("events_snapshot", str);
        } catch (SQLiteException e2) {
            e = e2;
            z = false;
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
    }

    private static void zza(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else {
            if (obj instanceof Double) {
                contentValues.put(str, (Double) obj);
                return;
            }
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    final void zza(String str, List<zzff.zza> list) {
        boolean z;
        boolean z2;
        Preconditions.checkNotNull(list);
        for (int i = 0; i < list.size(); i++) {
            zzff.zza.C0038zza zzcc = list.get(i).zzcc();
            if (zzcc.zza() != 0) {
                for (int i2 = 0; i2 < zzcc.zza(); i2++) {
                    zzff.zzb.zza zzcc2 = zzcc.zza(i2).zzcc();
                    zzff.zzb.zza zzaVar = (zzff.zzb.zza) ((zzjk.zzb) zzcc2.clone());
                    String zzb2 = zziq.zzb(zzcc2.zzb());
                    if (zzb2 != null) {
                        zzaVar.zza(zzb2);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    for (int i3 = 0; i3 < zzcc2.zza(); i3++) {
                        zzff.zzc zza2 = zzcc2.zza(i3);
                        String zza3 = zzip.zza(zza2.zze());
                        if (zza3 != null) {
                            zzaVar.zza(i3, (zzff.zzc) ((com.google.android.gms.internal.measurement.zzjk) zza2.zzcc().zza(zza3).zzai()));
                            z2 = true;
                        }
                    }
                    if (z2) {
                        zzcc = zzcc.zza(i2, zzaVar);
                        list.set(i, (zzff.zza) ((com.google.android.gms.internal.measurement.zzjk) zzcc.zzai()));
                    }
                }
            }
            if (zzcc.zzb() != 0) {
                for (int i4 = 0; i4 < zzcc.zzb(); i4++) {
                    zzff.zze zzb3 = zzcc.zzb(i4);
                    String zza4 = zzis.zza(zzb3.zze());
                    if (zza4 != null) {
                        zzcc = zzcc.zza(i4, zzb3.zzcc().zza(zza4));
                        list.set(i, (zzff.zza) ((com.google.android.gms.internal.measurement.zzjk) zzcc.zzai()));
                    }
                }
            }
        }
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        SQLiteDatabase e_ = e_();
        e_.beginTransaction();
        try {
            zzal();
            zzt();
            Preconditions.checkNotEmpty(str);
            SQLiteDatabase e_2 = e_();
            e_2.delete("property_filters", "app_id=?", new String[]{str});
            e_2.delete("event_filters", "app_id=?", new String[]{str});
            for (zzff.zza zzaVar2 : list) {
                zzal();
                zzt();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(zzaVar2);
                if (!zzaVar2.zzg()) {
                    zzj().zzu().zza("Audience with no ID. appId", zzfw.zza(str));
                } else {
                    int zza5 = zzaVar2.zza();
                    Iterator<zzff.zzb> it = zzaVar2.zze().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().zzl()) {
                                zzj().zzu().zza("Event filter with no ID. Audience definition ignored. appId, audienceId", zzfw.zza(str), Integer.valueOf(zza5));
                                break;
                            }
                        } else {
                            Iterator<zzff.zze> it2 = zzaVar2.zzf().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!it2.next().zzi()) {
                                        zzj().zzu().zza("Property filter with no ID. Audience definition ignored. appId, audienceId", zzfw.zza(str), Integer.valueOf(zza5));
                                        break;
                                    }
                                } else {
                                    Iterator<zzff.zzb> it3 = zzaVar2.zze().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!zza(str, zza5, it3.next())) {
                                                z = false;
                                                break;
                                            }
                                        } else {
                                            z = true;
                                            break;
                                        }
                                    }
                                    if (z) {
                                        Iterator<zzff.zze> it4 = zzaVar2.zzf().iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                if (!zza(str, zza5, it4.next())) {
                                                    z = false;
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    if (!z) {
                                        zzal();
                                        zzt();
                                        Preconditions.checkNotEmpty(str);
                                        SQLiteDatabase e_3 = e_();
                                        e_3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(zza5)});
                                        e_3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(zza5)});
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (zzff.zza zzaVar3 : list) {
                arrayList.add(zzaVar3.zzg() ? Integer.valueOf(zzaVar3.zza()) : null);
            }
            zzb(str, arrayList);
            e_.setTransactionSuccessful();
        } finally {
            e_.endTransaction();
        }
    }

    public final void zzw() {
        zzal();
        e_().setTransactionSuccessful();
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0043, code lost:
    
        if (r7.zzf.zzb(r0).zza(com.google.android.gms.measurement.internal.zzin.zza.ANALYTICS_STORAGE) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzg zzgVar, boolean z, boolean z2) {
        List<String> zzan;
        SQLiteDatabase e_;
        Preconditions.checkNotNull(zzgVar);
        zzt();
        zzal();
        String zzac = zzgVar.zzac();
        Preconditions.checkNotNull(zzac);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzac);
        try {
            if (com.google.android.gms.internal.measurement.zznk.zza() && zze().zza(zzbf.zzcv)) {
                if (z) {
                    contentValues.put("app_instance_id", (String) null);
                }
                contentValues.put("gmp_app_id", zzgVar.zzah());
                if (com.google.android.gms.internal.measurement.zznk.zza() || !zze().zza(zzbf.zzcv) || this.zzf.zzb(zzac).zza(zzin.zza.AD_STORAGE)) {
                    contentValues.put("resettable_device_id_hash", zzgVar.zzaj());
                }
                contentValues.put("last_bundle_index", Long.valueOf(zzgVar.zzt()));
                contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzgVar.zzu()));
                contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzgVar.zzs()));
                contentValues.put("app_version", zzgVar.zzaf());
                contentValues.put("app_store", zzgVar.zzae());
                contentValues.put("gmp_version", Long.valueOf(zzgVar.zzq()));
                contentValues.put("dev_cert_hash", Long.valueOf(zzgVar.zzn()));
                contentValues.put("measurement_enabled", Boolean.valueOf(zzgVar.zzar()));
                contentValues.put("day", Long.valueOf(zzgVar.zzm()));
                contentValues.put("daily_public_events_count", Long.valueOf(zzgVar.zzk()));
                contentValues.put("daily_events_count", Long.valueOf(zzgVar.zzj()));
                contentValues.put("daily_conversions_count", Long.valueOf(zzgVar.zzh()));
                contentValues.put("config_fetched_time", Long.valueOf(zzgVar.zzg()));
                contentValues.put("failed_config_fetch_time", Long.valueOf(zzgVar.zzp()));
                contentValues.put("app_version_int", Long.valueOf(zzgVar.zze()));
                contentValues.put("firebase_instance_id", zzgVar.zzag());
                contentValues.put("daily_error_events_count", Long.valueOf(zzgVar.zzi()));
                contentValues.put("daily_realtime_events_count", Long.valueOf(zzgVar.zzl()));
                contentValues.put("health_monitor_sample", zzgVar.zzai());
                contentValues.put("android_id", Long.valueOf(zzgVar.zzd()));
                contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzgVar.zzaq()));
                contentValues.put("admob_app_id", zzgVar.zzaa());
                contentValues.put("dynamite_version", Long.valueOf(zzgVar.zzo()));
                if (com.google.android.gms.internal.measurement.zznk.zza() || !zze().zza(zzbf.zzcv) || this.zzf.zzb(zzac).zza(zzin.zza.ANALYTICS_STORAGE)) {
                    contentValues.put("session_stitching_token", zzgVar.zzal());
                }
                contentValues.put("sgtm_upload_enabled", Boolean.valueOf(zzgVar.zzat()));
                contentValues.put("target_os_version", Long.valueOf(zzgVar.zzw()));
                contentValues.put("session_stitching_token_hash", Long.valueOf(zzgVar.zzv()));
                if (zzpg.zza() && zze().zze(zzac, zzbf.zzbz)) {
                    contentValues.put("ad_services_version", Integer.valueOf(zzgVar.zza()));
                    contentValues.put("attribution_eligibility_status", Long.valueOf(zzgVar.zzf()));
                }
                if (com.google.android.gms.internal.measurement.zznl.zza() && zze().zze(zzac, zzbf.zzck)) {
                    contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(zzgVar.zzau()));
                }
                contentValues.put("npa_metadata_value", zzgVar.zzx());
                if (zzpn.zza() && zze().zze(zzac, zzbf.zzbs)) {
                    zzq();
                    if (zznp.zzf(zzac)) {
                        contentValues.put("bundle_delivery_index", Long.valueOf(zzgVar.zzr()));
                    }
                }
                if (zzpn.zza() && zze().zze(zzac, zzbf.zzbt)) {
                    contentValues.put("sgtm_preview_key", zzgVar.zzam());
                }
                contentValues.put("dma_consent_state", Integer.valueOf(zzgVar.zzc()));
                contentValues.put("daily_realtime_dcu_count", Integer.valueOf(zzgVar.zzb()));
                if (com.google.android.gms.internal.measurement.zzne.zza() && zze().zze(zzac, zzbf.zzcp)) {
                    contentValues.put("serialized_npa_metadata", zzgVar.zzak());
                }
                zzan = zzgVar.zzan();
                if (zzan != null) {
                    if (zzan.isEmpty()) {
                        zzj().zzu().zza("Safelisted events should not be an empty list. appId", zzac);
                    } else {
                        contentValues.put("safelisted_events", TextUtils.join(",", zzan));
                    }
                }
                if (zznw.zza() && zze().zza(zzbf.zzbp) && !contentValues.containsKey("safelisted_events")) {
                    contentValues.put("safelisted_events", (String) null);
                }
                if (zze().zza(zzbf.zzcs)) {
                    contentValues.put("unmatched_pfo", zzgVar.zzy());
                    contentValues.put("unmatched_uwa", zzgVar.zzz());
                }
                if (zzoj.zza() && zze().zze(zzac, zzbf.zzcm)) {
                    contentValues.put("ad_campaign_info", zzgVar.zzav());
                }
                e_ = e_();
                if (e_.update("apps", contentValues, "app_id = ?", new String[]{zzac}) == 0 || e_.insertWithOnConflict("apps", null, contentValues, 5) != -1) {
                    return;
                }
                zzj().zzg().zza("Failed to insert/update app (got -1). appId", zzfw.zza(zzac));
                return;
            }
            e_ = e_();
            if (e_.update("apps", contentValues, "app_id = ?", new String[]{zzac}) == 0) {
                return;
            } else {
                return;
            }
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing app. appId", zzfw.zza(zzac), e);
            return;
        }
        contentValues.put("app_instance_id", zzgVar.zzad());
        contentValues.put("gmp_app_id", zzgVar.zzah());
        if (com.google.android.gms.internal.measurement.zznk.zza()) {
        }
        contentValues.put("resettable_device_id_hash", zzgVar.zzaj());
        contentValues.put("last_bundle_index", Long.valueOf(zzgVar.zzt()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzgVar.zzu()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzgVar.zzs()));
        contentValues.put("app_version", zzgVar.zzaf());
        contentValues.put("app_store", zzgVar.zzae());
        contentValues.put("gmp_version", Long.valueOf(zzgVar.zzq()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzgVar.zzn()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzgVar.zzar()));
        contentValues.put("day", Long.valueOf(zzgVar.zzm()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzgVar.zzk()));
        contentValues.put("daily_events_count", Long.valueOf(zzgVar.zzj()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzgVar.zzh()));
        contentValues.put("config_fetched_time", Long.valueOf(zzgVar.zzg()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzgVar.zzp()));
        contentValues.put("app_version_int", Long.valueOf(zzgVar.zze()));
        contentValues.put("firebase_instance_id", zzgVar.zzag());
        contentValues.put("daily_error_events_count", Long.valueOf(zzgVar.zzi()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzgVar.zzl()));
        contentValues.put("health_monitor_sample", zzgVar.zzai());
        contentValues.put("android_id", Long.valueOf(zzgVar.zzd()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzgVar.zzaq()));
        contentValues.put("admob_app_id", zzgVar.zzaa());
        contentValues.put("dynamite_version", Long.valueOf(zzgVar.zzo()));
        if (com.google.android.gms.internal.measurement.zznk.zza()) {
        }
        contentValues.put("session_stitching_token", zzgVar.zzal());
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(zzgVar.zzat()));
        contentValues.put("target_os_version", Long.valueOf(zzgVar.zzw()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(zzgVar.zzv()));
        if (zzpg.zza()) {
            contentValues.put("ad_services_version", Integer.valueOf(zzgVar.zza()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(zzgVar.zzf()));
        }
        if (com.google.android.gms.internal.measurement.zznl.zza()) {
            contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(zzgVar.zzau()));
        }
        contentValues.put("npa_metadata_value", zzgVar.zzx());
        if (zzpn.zza()) {
            zzq();
            if (zznp.zzf(zzac)) {
            }
        }
        if (zzpn.zza()) {
            contentValues.put("sgtm_preview_key", zzgVar.zzam());
        }
        contentValues.put("dma_consent_state", Integer.valueOf(zzgVar.zzc()));
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(zzgVar.zzb()));
        if (com.google.android.gms.internal.measurement.zzne.zza()) {
            contentValues.put("serialized_npa_metadata", zzgVar.zzak());
        }
        zzan = zzgVar.zzan();
        if (zzan != null) {
        }
        if (zznw.zza()) {
            contentValues.put("safelisted_events", (String) null);
        }
        if (zze().zza(zzbf.zzcs)) {
        }
        if (zzoj.zza()) {
            contentValues.put("ad_campaign_info", zzgVar.zzav());
        }
    }

    public final void zza(String str, zzav zzavVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzavVar);
        zzt();
        zzal();
        if (zze().zza(zzbf.zzcj) && zzi(str) == zzin.zza) {
            zzb(str, zzin.zza);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", zzavVar.zzf());
        zza("consent_settings", "app_id", contentValues);
    }

    public final void zza(zzaz zzazVar) {
        zza("events", zzazVar);
    }

    private final void zza(String str, zzaz zzazVar) {
        Preconditions.checkNotNull(zzazVar);
        zzt();
        zzal();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzazVar.zza);
        contentValues.put("name", zzazVar.zzb);
        contentValues.put("lifetime_count", Long.valueOf(zzazVar.zzc));
        contentValues.put("current_bundle_count", Long.valueOf(zzazVar.zzd));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzazVar.zzf));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzazVar.zzg));
        contentValues.put("last_bundled_day", zzazVar.zzh);
        contentValues.put("last_sampled_complex_event_id", zzazVar.zzi);
        contentValues.put("last_sampling_rate", zzazVar.zzj);
        contentValues.put("current_session_count", Long.valueOf(zzazVar.zze));
        contentValues.put("last_exempt_from_sampling", (zzazVar.zzk == null || !zzazVar.zzk.booleanValue()) ? null : 1L);
        try {
            if (e_().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update event aggregates (got -1). appId", zzfw.zza(zzazVar.zza));
            }
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing event aggregates. appId", zzfw.zza(zzazVar.zza), e);
        }
    }

    private final void zza(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase e_ = e_();
            if (contentValues.getAsString(str2) == null) {
                zzj().zzh().zza("Value of the primary key is not set.", zzfw.zza(str2));
            } else if (e_.update(str, contentValues, str2 + " = ?", new String[]{r1}) == 0 && e_.insertWithOnConflict(str, null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update table (got -1). key", zzfw.zza(str), zzfw.zza(str2));
            }
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing into table. key", zzfw.zza(str), zzfw.zza(str2), e);
        }
    }

    public final void zza(String str, zzin zzinVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzinVar);
        zzt();
        zzal();
        zzb(str, zzi(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", zzinVar.zzh());
        zza("consent_settings", "app_id", contentValues);
    }

    public final void zzb(String str, zzin zzinVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzinVar);
        zzt();
        zzal();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzinVar.zzh());
        contentValues.put("consent_source", Integer.valueOf(zzinVar.zza()));
        zza("consent_settings", "app_id", contentValues);
    }

    private final boolean zzb(String str, List<Integer> list) {
        Preconditions.checkNotEmpty(str);
        zzal();
        zzt();
        SQLiteDatabase e_ = e_();
        try {
            long zzb2 = zzb("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, zze().zzb(str, zzbf.zzaf)));
            if (zzb2 <= max) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Integer num = list.get(i);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            return e_.delete("audience_filter_values", new StringBuilder("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ").append(new StringBuilder("(").append(TextUtils.join(",", arrayList)).append(")").toString()).append(" order by rowid desc limit -1 offset ?)").toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Database error querying filters. appId", zzfw.zza(str), e);
            return false;
        }
    }

    public final boolean zzx() {
        return zzb("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    public final boolean zzy() {
        return zzb("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    public final boolean zzz() {
        return zzb("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    public final boolean zza(zzfn.zzk zzkVar, boolean z) {
        zzt();
        zzal();
        Preconditions.checkNotNull(zzkVar);
        Preconditions.checkNotEmpty(zzkVar.zzz());
        Preconditions.checkState(zzkVar.zzbi());
        zzv();
        long currentTimeMillis = zzb().currentTimeMillis();
        if (zzkVar.zzm() < currentTimeMillis - zzag.zzm() || zzkVar.zzm() > zzag.zzm() + currentTimeMillis) {
            zzj().zzu().zza("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzfw.zza(zzkVar.zzz()), Long.valueOf(currentTimeMillis), Long.valueOf(zzkVar.zzm()));
        }
        try {
            byte[] zzb2 = g_().zzb(zzkVar.zzbz());
            zzj().zzp().zza("Saving bundle, size", Integer.valueOf(zzb2.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzkVar.zzz());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzkVar.zzm()));
            contentValues.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, zzb2);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (zzkVar.zzbp()) {
                contentValues.put("retry_count", Integer.valueOf(zzkVar.zzg()));
            }
            try {
                if (e_().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                zzj().zzg().zza("Failed to insert bundle (got -1). appId", zzfw.zza(zzkVar.zzz()));
                return false;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error storing bundle. appId", zzfw.zza(zzkVar.zzz()), e);
                return false;
            }
        } catch (IOException e2) {
            zzj().zzg().zza("Data loss. Failed to serialize bundle. appId", zzfw.zza(zzkVar.zzz()), e2);
            return false;
        }
    }

    private final boolean zza(String str, int i, zzff.zzb zzbVar) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzbVar);
        if (zzbVar.zzf().isEmpty()) {
            zzj().zzu().zza("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zzfw.zza(str), Integer.valueOf(i), String.valueOf(zzbVar.zzl() ? Integer.valueOf(zzbVar.zzb()) : null));
            return false;
        }
        byte[] zzbz = zzbVar.zzbz();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", zzbVar.zzl() ? Integer.valueOf(zzbVar.zzb()) : null);
        contentValues.put("event_name", zzbVar.zzf());
        contentValues.put("session_scoped", zzbVar.zzm() ? Boolean.valueOf(zzbVar.zzj()) : null);
        contentValues.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, zzbz);
        try {
            if (e_().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert event filter (got -1). appId", zzfw.zza(str));
            return true;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing event filter. appId", zzfw.zza(str), e);
            return false;
        }
    }

    private final boolean zza(String str, int i, zzff.zze zzeVar) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzeVar);
        if (zzeVar.zze().isEmpty()) {
            zzj().zzu().zza("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zzfw.zza(str), Integer.valueOf(i), String.valueOf(zzeVar.zzi() ? Integer.valueOf(zzeVar.zza()) : null));
            return false;
        }
        byte[] zzbz = zzeVar.zzbz();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", zzeVar.zzi() ? Integer.valueOf(zzeVar.zza()) : null);
        contentValues.put("property_name", zzeVar.zze());
        contentValues.put("session_scoped", zzeVar.zzj() ? Boolean.valueOf(zzeVar.zzh()) : null);
        contentValues.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, zzbz);
        try {
            if (e_().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert property filter (got -1). appId", zzfw.zza(str));
            return false;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing property filter. appId", zzfw.zza(str), e);
            return false;
        }
    }

    public final boolean zza(zzba zzbaVar, long j, boolean z) {
        zzt();
        zzal();
        Preconditions.checkNotNull(zzbaVar);
        Preconditions.checkNotEmpty(zzbaVar.zza);
        byte[] zzbz = g_().zza(zzbaVar).zzbz();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzbaVar.zza);
        contentValues.put("name", zzbaVar.zzb);
        contentValues.put("timestamp", Long.valueOf(zzbaVar.zzc));
        contentValues.put("metadata_fingerprint", Long.valueOf(j));
        contentValues.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, zzbz);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (e_().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert raw event (got -1). appId", zzfw.zza(zzbaVar.zza));
            return false;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing raw event. appId", zzfw.zza(zzbaVar.zza), e);
            return false;
        }
    }

    public final boolean zza(String str, zzmu zzmuVar) {
        zzt();
        zzal();
        Preconditions.checkNotNull(zzmuVar);
        Preconditions.checkNotEmpty(str);
        long currentTimeMillis = zzb().currentTimeMillis();
        if (zzmuVar.zzb < currentTimeMillis - zzag.zzm() || zzmuVar.zzb > zzag.zzm() + currentTimeMillis) {
            zzj().zzu().zza("Storing trigger URI outside of the max retention time span. appId, now, timestamp", zzfw.zza(str), Long.valueOf(currentTimeMillis), Long.valueOf(zzmuVar.zzb));
        }
        zzj().zzp().zza("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", zzmuVar.zza);
        contentValues.put("source", Integer.valueOf(zzmuVar.zzc));
        contentValues.put("timestamp_millis", Long.valueOf(zzmuVar.zzb));
        try {
            if (e_().insert("trigger_uris", null, contentValues) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert trigger URI (got -1). appId", zzfw.zza(str));
            return false;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing trigger URI. appId", zzfw.zza(str), e);
            return false;
        }
    }

    protected final boolean zzaa() {
        return zza().getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean zza(String str, Long l, long j, zzfn.zzf zzfVar) {
        zzt();
        zzal();
        Preconditions.checkNotNull(zzfVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l);
        byte[] zzbz = zzfVar.zzbz();
        zzj().zzp().zza("Saving complex main event, appId, data size", zzi().zza(str), Integer.valueOf(zzbz.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", zzbz);
        try {
            if (e_().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert complex main event (got -1). appId", zzfw.zza(str));
            return false;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing complex main event. appId", zzfw.zza(str), e);
            return false;
        }
    }

    public final boolean zza(zzae zzaeVar) {
        Preconditions.checkNotNull(zzaeVar);
        zzt();
        zzal();
        String str = zzaeVar.zza;
        Preconditions.checkNotNull(str);
        if (zze(str, zzaeVar.zzc.zza) == null && zzb("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzaeVar.zzb);
        contentValues.put("name", zzaeVar.zzc.zza);
        zza(contentValues, "value", Preconditions.checkNotNull(zzaeVar.zzc.zza()));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzaeVar.zze));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzaeVar.zzf);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzaeVar.zzh));
        zzq();
        contentValues.put("timed_out_event", zznp.zza((Parcelable) zzaeVar.zzg));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzaeVar.zzd));
        zzq();
        contentValues.put("triggered_event", zznp.zza((Parcelable) zzaeVar.zzi));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzaeVar.zzc.zzb));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzaeVar.zzj));
        zzq();
        contentValues.put("expired_event", zznp.zza((Parcelable) zzaeVar.zzk));
        try {
            if (e_().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update conditional user property (got -1)", zzfw.zza(str));
            }
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing conditional user property", zzfw.zza(str), e);
        }
        return true;
    }

    final boolean zza(String str, Bundle bundle) {
        zzt();
        zzal();
        byte[] zzbz = g_().zza(new zzba(this.zzu, "", str, "dep", 0L, 0L, bundle)).zzbz();
        zzj().zzp().zza("Saving default event parameters, appId, data size", zzi().zza(str), Integer.valueOf(zzbz.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", zzbz);
        try {
            if (e_().insertWithOnConflict("default_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert default event parameters (got -1). appId", zzfw.zza(str));
            return false;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing default event parameters. appId", zzfw.zza(str), e);
            return false;
        }
    }

    public final boolean zza(zznq zznqVar) {
        Preconditions.checkNotNull(zznqVar);
        zzt();
        zzal();
        if (zze(zznqVar.zza, zznqVar.zzc) == null) {
            if (zznp.zzh(zznqVar.zzc)) {
                if (zzb("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{zznqVar.zza}) >= zze().zza(zznqVar.zza, zzbf.zzag, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(zznqVar.zzc) && zzb("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zznqVar.zza, zznqVar.zzb}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zznqVar.zza);
        contentValues.put("origin", zznqVar.zzb);
        contentValues.put("name", zznqVar.zzc);
        contentValues.put("set_timestamp", Long.valueOf(zznqVar.zzd));
        zza(contentValues, "value", zznqVar.zze);
        try {
            if (e_().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update user property (got -1). appId", zzfw.zza(zznqVar.zza));
            }
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing user property. appId", zzfw.zza(zznqVar.zza), e);
        }
        return true;
    }
}
