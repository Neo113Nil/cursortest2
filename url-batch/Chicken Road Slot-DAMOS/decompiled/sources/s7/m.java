package s7;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.b9;
import com.google.android.gms.internal.measurement.c9;
import com.google.android.gms.internal.measurement.d9;
import com.google.android.gms.internal.measurement.e9;
import com.google.android.gms.internal.measurement.f7;
import com.google.android.gms.internal.measurement.g7;
import com.google.android.gms.internal.measurement.n9;
import com.google.android.gms.internal.measurement.v8;
import com.google.android.gms.internal.measurement.w8;
import com.google.android.gms.internal.measurement.z8;
import com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl.NewHtcHomeBadger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m extends d4 {

    /* renamed from: r, reason: collision with root package name */
    public final l f8829r;

    /* renamed from: s, reason: collision with root package name */
    public final r0 f8830s;

    /* renamed from: t, reason: collision with root package name */
    public static final String[] f8822t = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: u, reason: collision with root package name */
    public static final String[] f8823u = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};

    /* renamed from: v, reason: collision with root package name */
    public static final String[] f8824v = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: w, reason: collision with root package name */
    public static final String[] f8825w = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;", "last_diagnostics_signal_upload_timestamp", "ALTER TABLE apps ADD COLUMN last_diagnostics_signal_upload_timestamp INTEGER;"};

    /* renamed from: x, reason: collision with root package name */
    public static final String[] f8826x = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;", "elapsed_time", "ALTER TABLE raw_events ADD COLUMN elapsed_time INTEGER;"};

    /* renamed from: y, reason: collision with root package name */
    public static final String[] f8827y = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: z, reason: collision with root package name */
    public static final String[] f8828z = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] A = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] B = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public static final String[] C = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    public static final String[] D = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    public m(j4 j4Var) {
        super(j4Var);
        this.f8830s = new r0(((q1) this.f1478d).f8942y);
        ((q1) this.f1478d).getClass();
        this.f8829r = new l(this, ((q1) this.f1478d).f8932d);
    }

    public static final String X(List list) {
        return list.isEmpty() ? "" : n0.l.g(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    public static final void f0(ContentValues contentValues, Object obj) {
        c7.c0.d("value");
        c7.c0.g(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
            return;
        }
        if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            te.a1.e("Invalid value type");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String A() {
        SQLiteException e2;
        Cursor cursor;
        SQLiteDatabase j02 = j0();
        ?? r12 = 0;
        try {
            try {
                cursor = j02.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(0);
                        cursor.close();
                        return string;
                    }
                } catch (SQLiteException e9) {
                    e2 = e9;
                    v0 v0Var = ((q1) this.f1478d).f8937t;
                    q1.l(v0Var);
                    v0Var.f9050t.b(e2, "Database error getting next bundle app id");
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th) {
                r12 = j02;
                th = th;
                if (r12 != 0) {
                    r12.close();
                }
                throw th;
            }
        } catch (SQLiteException e10) {
            e2 = e10;
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

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x006b: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:108), block:B:27:0x006b */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p.e A0(String str) {
        Throwable th;
        Cursor cursor;
        Cursor cursor2;
        q1 q1Var = (q1) this.f1478d;
        c7.c0.d(str);
        s();
        t();
        Cursor cursor3 = null;
        try {
            try {
                cursor = j0().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (cursor.moveToFirst()) {
                        byte[] blob = cursor.getBlob(0);
                        String string = cursor.getString(1);
                        String string2 = cursor.getString(2);
                        if (cursor.moveToNext()) {
                            v0 v0Var = q1Var.f8937t;
                            q1.l(v0Var);
                            v0Var.f9050t.b(v0.A(str), "Got multiple records for app config, expected one. appId");
                        }
                        if (blob != null) {
                            p.e eVar = new p.e(blob, string, string2, 5);
                            cursor.close();
                            return eVar;
                        }
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    v0 v0Var2 = q1Var.f8937t;
                    q1.l(v0Var2);
                    v0Var2.f9050t.c(v0.A(str), e, "Error querying remote config. appId");
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    throw th;
                }
                cursor3.close();
                throw th;
            }
        } catch (SQLiteException e9) {
            e = e9;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor3 != null) {
            }
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    public final void B(long j) {
        s();
        t();
        try {
            if (j0().delete("queue", "rowid=?", new String[]{String.valueOf(j)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e2) {
            v0 v0Var = ((q1) this.f1478d).f8937t;
            q1.l(v0Var);
            v0Var.f9050t.b(e2, "Failed to delete a bundle in a queue table");
            throw e2;
        }
    }

    public final void B0(e9 e9Var, boolean z10) {
        s();
        t();
        c7.c0.d(e9Var.t());
        c7.c0.j(e9Var.g2());
        C();
        q1 q1Var = (q1) this.f1478d;
        g7.a aVar = q1Var.f8942y;
        v0 v0Var = q1Var.f8937t;
        aVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        long h22 = e9Var.h2();
        d0 d0Var = e0.R;
        if (h22 < currentTimeMillis - ((Long) d0Var.a(null)).longValue() || e9Var.h2() > ((Long) d0Var.a(null)).longValue() + currentTimeMillis) {
            q1.l(v0Var);
            v0Var.f9053w.d("Storing bundle outside of the max uploading time span. appId, now, timestamp", v0.A(e9Var.t()), Long.valueOf(currentTimeMillis), Long.valueOf(e9Var.h2()));
        }
        byte[] a9 = e9Var.a();
        try {
            l4 l4Var = this.f9150e.f8766u;
            j4.T(l4Var);
            byte[] c02 = l4Var.c0(a9);
            q1.l(v0Var);
            v0Var.B.b(Integer.valueOf(c02.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", e9Var.t());
            contentValues.put("bundle_end_timestamp", Long.valueOf(e9Var.h2()));
            contentValues.put("data", c02);
            contentValues.put("has_realtime", Integer.valueOf(z10 ? 1 : 0));
            if (e9Var.t0()) {
                contentValues.put("retry_count", Integer.valueOf(e9Var.u0()));
            }
            try {
                if (j0().insert("queue", null, contentValues) == -1) {
                    q1.l(v0Var);
                    v0Var.f9050t.b(v0.A(e9Var.t()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e2) {
                q1.l(v0Var);
                v0Var.f9050t.c(v0.A(e9Var.t()), e2, "Error storing bundle. appId");
            }
        } catch (IOException e9) {
            q1.l(v0Var);
            v0Var.f9050t.c(v0.A(e9Var.t()), e9, "Data loss. Failed to serialize bundle. appId");
        }
    }

    public final void C() {
        s();
        t();
        if (d0()) {
            j4 j4Var = this.f9150e;
            long a9 = j4Var.f8768w.f8875s.a();
            q1 q1Var = (q1) this.f1478d;
            q1Var.f8942y.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - a9) > ((Long) e0.M.a(null)).longValue()) {
                j4Var.f8768w.f8875s.b(elapsedRealtime);
                s();
                t();
                if (d0()) {
                    SQLiteDatabase j02 = j0();
                    q1Var.f8942y.getClass();
                    int delete = j02.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) e0.R.a(null)).longValue())});
                    if (delete > 0) {
                        v0 v0Var = q1Var.f8937t;
                        q1.l(v0Var);
                        v0Var.B.b(Integer.valueOf(delete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void D(ArrayList arrayList) {
        q1 q1Var = (q1) this.f1478d;
        s();
        t();
        c7.c0.g(arrayList);
        if (arrayList.size() == 0) {
            te.a1.e("Given Integer is zero");
            return;
        }
        if (d0()) {
            String join = TextUtils.join(",", arrayList);
            String p4 = v4.a.p(new StringBuilder(String.valueOf(join).length() + 2), "(", join, ")");
            if (O(v4.a.p(new StringBuilder(p4.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", p4, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                v0 v0Var = q1Var.f8937t;
                q1.l(v0Var);
                v0Var.f9053w.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase j02 = j0();
                StringBuilder sb2 = new StringBuilder(p4.length() + 127);
                sb2.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb2.append(p4);
                sb2.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                j02.execSQL(sb2.toString());
            } catch (SQLiteException e2) {
                v0 v0Var2 = q1Var.f8937t;
                q1.l(v0Var2);
                v0Var2.f9050t.b(e2, "Error incrementing retry count. error");
            }
        }
    }

    public final void E(Long l10) {
        q1 q1Var = (q1) this.f1478d;
        s();
        t();
        if (d0()) {
            StringBuilder sb2 = new StringBuilder(l10.toString().length() + 86);
            sb2.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb2.append(l10);
            sb2.append(" AND retry_count =  2147483647 LIMIT 1");
            if (O(sb2.toString(), null) > 0) {
                v0 v0Var = q1Var.f8937t;
                q1.l(v0Var);
                v0Var.f9053w.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase j02 = j0();
                q1Var.f8942y.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                StringBuilder sb3 = new StringBuilder(String.valueOf(currentTimeMillis).length() + 60);
                sb3.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb3.append(currentTimeMillis);
                String sb4 = sb3.toString();
                StringBuilder sb5 = new StringBuilder(sb4.length() + 34 + l10.toString().length() + 29);
                sb5.append("UPDATE upload_queue");
                sb5.append(sb4);
                sb5.append(" WHERE rowid = ");
                sb5.append(l10);
                sb5.append(" AND retry_count < 2147483647");
                j02.execSQL(sb5.toString());
            } catch (SQLiteException e2) {
                v0 v0Var2 = q1Var.f8937t;
                q1.l(v0Var2);
                v0Var2.f9050t.b(e2, "Error incrementing retry count. error");
            }
        }
    }

    public final Object F(Cursor cursor, int i3) {
        q1 q1Var = (q1) this.f1478d;
        int type = cursor.getType(i3);
        if (type == 0) {
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.f9050t.a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i3));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i3));
        }
        if (type == 3) {
            return cursor.getString(i3);
        }
        if (type != 4) {
            v0 v0Var2 = q1Var.f8937t;
            q1.l(v0Var2);
            v0Var2.f9050t.b(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        v0 v0Var3 = q1Var.f8937t;
        q1.l(v0Var3);
        v0Var3.f9050t.a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(3:2|3|4)|(2:6|(3:8|9|10)(1:13))|14|15|(1:17)(2:20|21)|18|9|10) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a4, code lost:
    
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
    
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ac, code lost:
    
        r0 = r0.f8937t;
        s7.q1.l(r0);
        r0.f9050t.d("Error inserting column. appId", s7.v0.A(r14), "first_open_count", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bc, code lost:
    
        r7 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long G(String str) {
        long j;
        long P;
        q1 q1Var = (q1) this.f1478d;
        c7.c0.d(str);
        c7.c0.d("first_open_count");
        s();
        t();
        SQLiteDatabase j02 = j0();
        j02.beginTransaction();
        long j3 = 0;
        try {
            try {
                StringBuilder sb2 = new StringBuilder(48);
                sb2.append("select first_open_count from app2 where app_id=?");
                j = -1;
                P = P(sb2.toString(), new String[]{str}, -1L);
            } catch (SQLiteException e2) {
                e = e2;
            }
            if (P == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("first_open_count", (Integer) 0);
                contentValues.put("previous_install_count", (Integer) 0);
                if (j02.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                    v0 v0Var = q1Var.f8937t;
                    q1.l(v0Var);
                    v0Var.f9050t.c(v0.A(str), "first_open_count", "Failed to insert column (got -1). appId");
                    return j;
                }
                P = 0;
            }
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("app_id", str);
            contentValues2.put("first_open_count", Long.valueOf(1 + P));
            if (j02.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                v0 v0Var2 = q1Var.f8937t;
                q1.l(v0Var2);
                v0Var2.f9050t.c(v0.A(str), "first_open_count", "Failed to update column (got 0). appId");
            } else {
                j02.setTransactionSuccessful();
                j = P;
            }
            return j;
        } finally {
            j02.endTransaction();
        }
    }

    public final boolean H(String str, String str2) {
        return O("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final void I(List list) {
        c7.c0.g(list);
        s();
        t();
        StringBuilder sb2 = new StringBuilder("rowid in (");
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (i3 != 0) {
                sb2.append(",");
            }
            sb2.append(((Long) list.get(i3)).longValue());
        }
        sb2.append(")");
        int delete = j0().delete("raw_events", sb2.toString(), null);
        if (delete != list.size()) {
            v0 v0Var = ((q1) this.f1478d).f8937t;
            q1.l(v0Var);
            v0Var.f9050t.c(Integer.valueOf(delete), Integer.valueOf(list.size()), "Deleted fewer rows from raw events table than expected");
        }
    }

    public final long J(String str) {
        c7.c0.d(str);
        return P("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final void K(String str, Long l10, long j, w8 w8Var) {
        s();
        t();
        c7.c0.g(w8Var);
        c7.c0.d(str);
        q1 q1Var = (q1) this.f1478d;
        byte[] a9 = w8Var.a();
        v0 v0Var = q1Var.f8937t;
        v0 v0Var2 = q1Var.f8937t;
        q1.l(v0Var);
        v0Var.B.c(q1Var.f8941x.a(str), Integer.valueOf(a9.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", a9);
        try {
            if (j0().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                q1.l(v0Var2);
                v0Var2.f9050t.b(v0.A(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e2) {
            q1.l(v0Var2);
            v0Var2.f9050t.c(v0.A(str), e2, "Error storing complex main event. appId");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02a4 A[Catch: SQLiteException -> 0x02c0, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x02c0, blocks: (B:78:0x0289, B:80:0x02a4), top: B:77:0x0289 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L(String str, Long l10, String str2, Bundle bundle) {
        String string;
        String y3;
        Bundle bundle2;
        v0 v0Var;
        long update;
        e9 e9Var;
        Cursor query;
        m mVar = this;
        String str3 = str;
        q1 q1Var = (q1) mVar.f1478d;
        c7.c0.g(bundle);
        mVar.s();
        mVar.t();
        com.google.firebase.messaging.w wVar = l10 != null ? new com.google.firebase.messaging.w(mVar, str3, l10.longValue()) : new com.google.firebase.messaging.w(mVar, str3);
        List<k> c10 = wVar.c();
        while (!c10.isEmpty()) {
            for (k kVar : c10) {
                if (!TextUtils.isEmpty(str2)) {
                    Cursor cursor = null;
                    e9 e9Var2 = null;
                    Cursor cursor2 = null;
                    try {
                        try {
                            query = mVar.j0().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, Long.toString(kVar.f8773b)}, null, null, "rowid", "2");
                            try {
                                try {
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    e9Var = null;
                                }
                            } catch (Throwable th) {
                                th = th;
                                cursor2 = query;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (SQLiteException e9) {
                        e = e9;
                        e9Var = null;
                    }
                    if (query.moveToFirst()) {
                        try {
                            e9Var = (e9) ((d9) l4.d0(e9.Y(), query.getBlob(0))).d();
                            try {
                                if (query.moveToNext()) {
                                    v0 v0Var2 = q1Var.f8937t;
                                    q1.l(v0Var2);
                                    v0Var2.f9053w.b(v0.A(str3), "Get multiple raw event metadata records, expected one. appId");
                                }
                                query.close();
                                query.close();
                            } catch (SQLiteException e10) {
                                e = e10;
                                cursor = query;
                                v0 v0Var3 = q1Var.f8937t;
                                q1.l(v0Var3);
                                v0Var3.f9050t.c(v0.A(str3), e, "Data loss. Error selecting raw event. appId");
                                if (cursor != null) {
                                    cursor.close();
                                }
                                e9Var2 = e9Var;
                                if (e9Var2 != null) {
                                }
                                j4 j4Var = mVar.f9150e;
                                l4 l4Var = j4Var.f8766u;
                                j4.T(l4Var);
                                w8 w8Var = kVar.f8775d;
                                Bundle bundle3 = new Bundle();
                                while (r7.hasNext()) {
                                }
                                string = bundle3.getString("_o");
                                bundle3.remove("_o");
                                y3 = w8Var.y();
                                if (string == null) {
                                }
                                p4 p4Var = q1Var.f8940w;
                                v0 v0Var4 = q1Var.f8937t;
                                q1.j(p4Var);
                                if (y3.equals("_cmp")) {
                                }
                                k kVar2 = kVar;
                                p4Var.F(bundle3, bundle2);
                                q qVar = new q((q1) mVar.f1478d, string, str3, w8Var.y(), w8Var.A(), w8Var.I(), w8Var.C(), bundle3);
                                long j = kVar2.f8772a;
                                long j3 = kVar2.f8773b;
                                boolean z10 = kVar2.f8774c;
                                s();
                                t();
                                String str4 = qVar.f8926a;
                                c7.c0.d(str4);
                                l4 l4Var2 = j4Var.f8766u;
                                j4.T(l4Var2);
                                byte[] a9 = l4Var2.S(qVar).a();
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("app_id", str4);
                                contentValues.put("name", qVar.f8927b);
                                contentValues.put("timestamp", Long.valueOf(qVar.f8929d));
                                contentValues.put("metadata_fingerprint", Long.valueOf(j3));
                                contentValues.put("data", a9);
                                contentValues.put("realtime", Integer.valueOf(z10 ? 1 : 0));
                                contentValues.put("elapsed_time", Long.valueOf(qVar.f8930e));
                                update = j0().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j)});
                                if (update != 1) {
                                }
                                mVar = this;
                                str3 = str;
                            }
                            e9Var2 = e9Var;
                        } catch (IOException e11) {
                            v0 v0Var5 = q1Var.f8937t;
                            q1.l(v0Var5);
                            v0Var5.f9050t.c(v0.A(str3), e11, "Data loss. Failed to merge raw event metadata. appId");
                        }
                        if (e9Var2 != null) {
                            Iterator it = e9Var2.Z1().iterator();
                            while (it.hasNext()) {
                                if (((n9) it.next()).v().equals(str2)) {
                                    break;
                                }
                            }
                        }
                    } else {
                        v0 v0Var6 = q1Var.f8937t;
                        q1.l(v0Var6);
                        v0Var6.f9050t.b(v0.A(str3), "Raw event metadata record is missing. appId");
                    }
                    query.close();
                    if (e9Var2 != null) {
                    }
                }
                j4 j4Var2 = mVar.f9150e;
                l4 l4Var3 = j4Var2.f8766u;
                j4.T(l4Var3);
                w8 w8Var2 = kVar.f8775d;
                Bundle bundle32 = new Bundle();
                for (z8 z8Var : w8Var2.v()) {
                    if (z8Var.B()) {
                        bundle32.putDouble(z8Var.u(), z8Var.C());
                    } else if (z8Var.z()) {
                        bundle32.putFloat(z8Var.u(), z8Var.A());
                    } else if (z8Var.x()) {
                        bundle32.putLong(z8Var.u(), z8Var.y());
                    } else if (z8Var.v()) {
                        bundle32.putString(z8Var.u(), z8Var.w());
                    } else if (z8Var.D().isEmpty()) {
                        v0 v0Var7 = ((q1) l4Var3.f1478d).f8937t;
                        q1.l(v0Var7);
                        v0Var7.f9050t.b(z8Var, "Unexpected parameter type for parameter");
                    } else {
                        bundle32.putParcelableArray(z8Var.u(), l4.f0(z8Var.D()));
                    }
                }
                string = bundle32.getString("_o");
                bundle32.remove("_o");
                y3 = w8Var2.y();
                if (string == null) {
                    string = "";
                }
                p4 p4Var2 = q1Var.f8940w;
                v0 v0Var42 = q1Var.f8937t;
                q1.j(p4Var2);
                if (y3.equals("_cmp")) {
                    bundle2 = bundle;
                } else {
                    bundle2 = new Bundle(bundle);
                    for (String str5 : bundle.keySet()) {
                        k kVar3 = kVar;
                        if (str5.startsWith("gad_")) {
                            bundle2.remove(str5);
                        }
                        kVar = kVar3;
                    }
                }
                k kVar22 = kVar;
                p4Var2.F(bundle32, bundle2);
                q qVar2 = new q((q1) mVar.f1478d, string, str3, w8Var2.y(), w8Var2.A(), w8Var2.I(), w8Var2.C(), bundle32);
                long j10 = kVar22.f8772a;
                long j32 = kVar22.f8773b;
                boolean z102 = kVar22.f8774c;
                s();
                t();
                String str42 = qVar2.f8926a;
                c7.c0.d(str42);
                l4 l4Var22 = j4Var2.f8766u;
                j4.T(l4Var22);
                byte[] a92 = l4Var22.S(qVar2).a();
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str42);
                contentValues2.put("name", qVar2.f8927b);
                contentValues2.put("timestamp", Long.valueOf(qVar2.f8929d));
                contentValues2.put("metadata_fingerprint", Long.valueOf(j32));
                contentValues2.put("data", a92);
                contentValues2.put("realtime", Integer.valueOf(z102 ? 1 : 0));
                contentValues2.put("elapsed_time", Long.valueOf(qVar2.f8930e));
                try {
                    update = j0().update("raw_events", contentValues2, "rowid = ?", new String[]{String.valueOf(j10)});
                    if (update != 1) {
                        q1.l(v0Var42);
                        v0Var = v0Var42;
                        try {
                            v0Var.f9050t.c(v0.A(str42), Long.valueOf(update), "Failed to update raw event. appId, updatedRows");
                        } catch (SQLiteException e12) {
                            e = e12;
                            q1.l(v0Var);
                            v0Var.f9050t.c(v0.A(str42), e, "Error updating raw event. appId");
                            mVar = this;
                            str3 = str;
                        }
                    }
                } catch (SQLiteException e13) {
                    e = e13;
                    v0Var = v0Var42;
                }
                mVar = this;
                str3 = str;
            }
            c10 = wVar.c();
            mVar = this;
            str3 = str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r5 == 0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c2 M(String str) {
        Throwable th;
        SQLiteException e2;
        q1 q1Var = (q1) this.f1478d;
        c7.c0.g(str);
        s();
        t();
        ?? r52 = {str};
        Cursor cursor = null;
        r2 = null;
        r2 = null;
        c2 c2Var = null;
        try {
            try {
                r52 = j0().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", r52);
                try {
                    if (r52.moveToFirst()) {
                        c2Var = c2.c(r52.getInt(1), r52.getString(0));
                    } else {
                        v0 v0Var = q1Var.f8937t;
                        q1.l(v0Var);
                        v0Var.B.a("No data found");
                    }
                } catch (SQLiteException e9) {
                    e2 = e9;
                    v0 v0Var2 = q1Var.f8937t;
                    q1.l(v0Var2);
                    v0Var2.f9050t.b(e2, "Error querying database.");
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = r52;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e10) {
            e2 = e10;
            r52 = 0;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
            }
            throw th;
        }
        r52.close();
        return c2Var == null ? c2.f8555c : c2Var;
    }

    public final void N(String str, x3 x3Var) {
        s();
        t();
        c7.c0.d(str);
        q1 q1Var = (q1) this.f1478d;
        g7.a aVar = q1Var.f8942y;
        v0 v0Var = q1Var.f8937t;
        aVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        d0 d0Var = e0.f8653u0;
        long longValue = currentTimeMillis - ((Long) d0Var.a(null)).longValue();
        long j = x3Var.f9105e;
        if (j < longValue || j > ((Long) d0Var.a(null)).longValue() + currentTimeMillis) {
            q1.l(v0Var);
            v0Var.f9053w.d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", v0.A(str), Long.valueOf(currentTimeMillis), Long.valueOf(j));
        }
        q1.l(v0Var);
        v0Var.B.a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", x3Var.f9104d);
        contentValues.put("source", Integer.valueOf(x3Var.f9106i));
        contentValues.put("timestamp_millis", Long.valueOf(j));
        try {
            if (j0().insert("trigger_uris", null, contentValues) == -1) {
                q1.l(v0Var);
                v0Var.f9050t.b(v0.A(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e2) {
            q1.l(v0Var);
            v0Var.f9050t.c(v0.A(str), e2, "Error storing trigger URI. appId");
        }
    }

    public final long O(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = j0().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = rawQuery.getLong(0);
                rawQuery.close();
                return j;
            } catch (SQLiteException e2) {
                v0 v0Var = ((q1) this.f1478d).f8937t;
                q1.l(v0Var);
                v0Var.f9050t.c(str, e2, "Database error");
                throw e2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long P(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            try {
                cursor = j0().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    j = cursor.getLong(0);
                }
                cursor.close();
                return j;
            } catch (SQLiteException e2) {
                v0 v0Var = ((q1) this.f1478d).f8937t;
                q1.l(v0Var);
                v0Var.f9050t.c(str, e2, "Database error");
                throw e2;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final String Q(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                cursor = j0().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return "";
                }
                String string = cursor.getString(0);
                cursor.close();
                return string;
            } catch (SQLiteException e2) {
                v0 v0Var = ((q1) this.f1478d).f8937t;
                q1.l(v0Var);
                v0Var.f9050t.c(str, e2, "Database error");
                throw e2;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void R(ContentValues contentValues) {
        q1 q1Var = (q1) this.f1478d;
        try {
            SQLiteDatabase j02 = j0();
            if (contentValues.getAsString("app_id") == null) {
                v0 v0Var = q1Var.f8937t;
                q1.l(v0Var);
                v0Var.f9052v.b(v0.A("app_id"), "Value of the primary key is not set.");
                return;
            }
            new StringBuilder(10).append("app_id = ?");
            if (j02.update("consent_settings", contentValues, r6.toString(), new String[]{r5}) == 0 && j02.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                v0 v0Var2 = q1Var.f8937t;
                q1.l(v0Var2);
                v0Var2.f9050t.c(v0.A("consent_settings"), v0.A("app_id"), "Failed to insert/update table (got -1). key");
            }
        } catch (SQLiteException e2) {
            v0 v0Var3 = q1Var.f8937t;
            q1.l(v0Var3);
            v0Var3.f9050t.d("Error storing into table. key", v0.A("consent_settings"), v0.A("app_id"), e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r S(String str, String str2, String str3) {
        Cursor cursor;
        Boolean bool;
        q1 q1Var = (q1) this.f1478d;
        c7.c0.d(str2);
        c7.c0.d(str3);
        s();
        t();
        Cursor cursor2 = null;
        try {
            cursor = j0().query(str, (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
            try {
                try {
                } catch (SQLiteException e2) {
                    e = e2;
                    v0 v0Var = q1Var.f8937t;
                    q1.l(v0Var);
                    v0Var.f9050t.d("Error querying events. appId", v0.A(str2), q1Var.f8941x.a(str3), e);
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
        } catch (SQLiteException e9) {
            e = e9;
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
        long j = cursor.getLong(0);
        long j3 = cursor.getLong(1);
        long j10 = cursor.getLong(2);
        long j11 = cursor.isNull(3) ? 0L : cursor.getLong(3);
        Long valueOf = cursor.isNull(4) ? null : Long.valueOf(cursor.getLong(4));
        Long valueOf2 = cursor.isNull(5) ? null : Long.valueOf(cursor.getLong(5));
        Long valueOf3 = cursor.isNull(6) ? null : Long.valueOf(cursor.getLong(6));
        if (cursor.isNull(7)) {
            bool = null;
        } else {
            bool = Boolean.valueOf(cursor.getLong(7) == 1);
        }
        r rVar = new r(str2, str3, j, j3, cursor.isNull(8) ? 0L : cursor.getLong(8), j10, j11, valueOf, valueOf2, valueOf3, bool);
        if (cursor.moveToNext()) {
            v0 v0Var2 = q1Var.f8937t;
            q1.l(v0Var2);
            v0Var2.f9050t.b(v0.A(str2), "Got multiple records for event aggregates, expected one. appId");
        }
        cursor.close();
        return rVar;
    }

    public final void T(String str, r rVar) {
        q1 q1Var = (q1) this.f1478d;
        c7.c0.g(rVar);
        s();
        t();
        ContentValues contentValues = new ContentValues();
        String str2 = rVar.f8959a;
        contentValues.put("app_id", str2);
        contentValues.put("name", rVar.f8960b);
        contentValues.put("lifetime_count", Long.valueOf(rVar.f8961c));
        contentValues.put("current_bundle_count", Long.valueOf(rVar.f8962d));
        contentValues.put("last_fire_timestamp", Long.valueOf(rVar.f8964f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(rVar.g));
        contentValues.put("last_bundled_day", rVar.f8965h);
        contentValues.put("last_sampled_complex_event_id", rVar.f8966i);
        contentValues.put("last_sampling_rate", rVar.j);
        contentValues.put("current_session_count", Long.valueOf(rVar.f8963e));
        Boolean bool = rVar.f8967k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (j0().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                v0 v0Var = q1Var.f8937t;
                q1.l(v0Var);
                v0Var.f9050t.b(v0.A(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e2) {
            v0 v0Var2 = q1Var.f8937t;
            q1.l(v0Var2);
            v0Var2.f9050t.c(v0.A(str2), e2, "Error storing event aggregates. appId");
        }
    }

    public final void U(String str, String str2) {
        c7.c0.d(str2);
        s();
        t();
        try {
            j0().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e2) {
            v0 v0Var = ((q1) this.f1478d).f8937t;
            q1.l(v0Var);
            v0Var.f9050t.c(v0.A(str2), e2, "Error deleting snapshot. appId");
        }
    }

    public final k4 V(String str, long j, byte[] bArr, String str2, String str3, int i3, int i10, long j3, long j10, long j11) {
        x2 x2Var;
        q1 q1Var = (q1) this.f1478d;
        if (TextUtils.isEmpty(str2)) {
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.A.a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            b9 b9Var = (b9) l4.d0(c9.A(), bArr);
            x2[] values = x2.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    x2Var = x2.UNKNOWN;
                    break;
                }
                x2Var = values[i11];
                if (x2Var.f9103d == i3) {
                    break;
                }
                i11++;
            }
            if (x2Var != x2.GOOGLE_SIGNAL && x2Var != x2.GOOGLE_SIGNAL_PENDING && i10 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Collections.unmodifiableList(((c9) b9Var.f2389e).t()).iterator();
                while (it.hasNext()) {
                    d9 d9Var = (d9) ((e9) it.next()).k();
                    d9Var.b();
                    ((e9) d9Var.f2389e).X0(i10);
                    arrayList.add((e9) d9Var.d());
                }
                b9Var.b();
                ((c9) b9Var.f2389e).F();
                b9Var.b();
                ((c9) b9Var.f2389e).E(arrayList);
            }
            HashMap hashMap = new HashMap();
            if (str3 != null) {
                String[] split = str3.split("\r\n");
                int length2 = split.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        break;
                    }
                    String str4 = split[i12];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] split2 = str4.split("=", 2);
                    if (split2.length != 2) {
                        v0 v0Var2 = q1Var.f8937t;
                        q1.l(v0Var2);
                        v0Var2.f9050t.b(str4, "Invalid upload header: ");
                        break;
                    }
                    hashMap.put(split2[0], split2[1]);
                    i12++;
                }
            }
            return new k4(j, (c9) b9Var.d(), str2, hashMap, x2Var, j3, j10, j11, i10);
        } catch (IOException e2) {
            v0 v0Var3 = q1Var.f8937t;
            q1.l(v0Var3);
            v0Var3.f9050t.c(str, e2, "Failed to queued MeasurementBatch from upload_queue. appId");
            return null;
        }
    }

    public final String W() {
        ((q1) this.f1478d).f8942y.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        Long l10 = (Long) e0.S.a(null);
        l10.getClass();
        String str = "(upload_type = 1 AND ABS(creation_timestamp - " + currentTimeMillis + ") > " + l10 + ")";
        String str2 = "(upload_type != 1 AND ABS(creation_timestamp - " + currentTimeMillis + ") > " + ((Long) e0.R.a(null)).longValue() + ")";
        StringBuilder sb2 = new StringBuilder(str.length() + 5 + str2.length() + 1);
        n0.l.l(sb2, "(", str, " OR ", str2);
        sb2.append(")");
        return sb2.toString();
    }

    public final void Y(String str, c2 c2Var) {
        c7.c0.g(str);
        c7.c0.g(c2Var);
        s();
        t();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", c2Var.g());
        contentValues.put("consent_source", Integer.valueOf(c2Var.f8557b));
        R(contentValues);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    public final List Z(String str) {
        ArrayList arrayList;
        String string;
        q1 q1Var = (q1) this.f1478d;
        s();
        t();
        ArrayList arrayList2 = new ArrayList();
        try {
            SQLiteDatabase j02 = j0();
            j02.beginTransaction();
            Cursor cursor = null;
            try {
                try {
                    cursor = j02.query("diagnostic_signals", new String[]{"signal_name", "metadata", NewHtcHomeBadger.COUNT}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                    if (cursor.moveToFirst()) {
                        boolean isEmpty = str.isEmpty();
                        do {
                            String string2 = cursor.getString(0);
                            if (cursor.isNull(1)) {
                                string = "";
                            } else {
                                string = cursor.getString(1);
                                c7.c0.g(string);
                            }
                            if (string2 == null) {
                                v0 v0Var = q1Var.f8937t;
                                q1.l(v0Var);
                                v0Var.f9050t.b(v0.A(str), "Read null value from diagnostic signals table, ignoring it. appId");
                            } else {
                                long j = cursor.getLong(2);
                                f7 t6 = g7.t();
                                t6.b();
                                ((g7) t6.f2389e).u(string2);
                                t6.b();
                                ((g7) t6.f2389e).x(j);
                                t6.b();
                                ((g7) t6.f2389e).w(string);
                                if (isEmpty) {
                                    t6.b();
                                    ((g7) t6.f2389e).v();
                                }
                                arrayList2.add((g7) t6.d());
                            }
                        } while (cursor.moveToNext());
                        j02.delete("diagnostic_signals", "app_id=?", new String[]{str});
                        j02.setTransactionSuccessful();
                        arrayList = arrayList2;
                    } else {
                        j02.setTransactionSuccessful();
                        arrayList = arrayList2;
                    }
                } catch (SQLiteException e2) {
                    v0 v0Var2 = q1Var.f8937t;
                    q1.l(v0Var2);
                    v0Var2.f9050t.c(v0.A(str), e2, "Error querying or deleting diagnostic signals. appId");
                    arrayList = Collections.EMPTY_LIST;
                }
                if (cursor != null) {
                    cursor.close();
                }
                j02.endTransaction();
                return arrayList;
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                j02.endTransaction();
                throw th;
            }
        } catch (SQLiteException e9) {
            v0 v0Var3 = q1Var.f8937t;
            q1.l(v0Var3);
            v0Var3.f9050t.c(v0.A(str), e9, "Error opening database for diagnostic signals. appId");
            return Collections.EMPTY_LIST;
        }
    }

    public final void a0(String str, c2 c2Var) {
        c7.c0.g(str);
        s();
        t();
        Y(str, M(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", c2Var.g());
        R(contentValues);
    }

    public final c2 b0(String str) {
        c7.c0.g(str);
        s();
        t();
        return c2.c(100, Q("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    public final r c0(String str, w8 w8Var, String str2) {
        r S = S("events", str, w8Var.y());
        if (S != null) {
            long j = S.f8963e + 1;
            long j3 = S.f8962d + 1;
            return new r(S.f8959a, S.f8960b, S.f8961c + 1, j3, j, S.f8964f, S.g, S.f8965h, S.f8966i, S.j, S.f8967k);
        }
        q1 q1Var = (q1) this.f1478d;
        v0 v0Var = q1Var.f8937t;
        q1.l(v0Var);
        v0Var.f9053w.c(v0.A(str), q1Var.f8941x.a(str2), "Event aggregate wasn't created during raw event logging. appId, event");
        return new r(str, w8Var.y(), 1L, 1L, 1L, w8Var.A(), 0L, null, null, null, null);
    }

    public final boolean d0() {
        return ((q1) this.f1478d).f8932d.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0221 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018d A[Catch: all -> 0x007a, SQLiteException -> 0x007d, LOOP:0: B:48:0x018d->B:57:?, LOOP_START, TRY_LEAVE, TryCatch #3 {all -> 0x007a, blocks: (B:3:0x0018, B:8:0x002c, B:11:0x004a, B:13:0x0066, B:21:0x006e, B:24:0x0072, B:25:0x00ca, B:27:0x00f0, B:28:0x0102, B:30:0x0106, B:31:0x0116, B:33:0x011c, B:34:0x012c, B:43:0x015a, B:44:0x0162, B:46:0x016d, B:48:0x018d, B:50:0x019b, B:51:0x01a5, B:53:0x01e3, B:62:0x01d3, B:63:0x01ea, B:66:0x0147, B:70:0x01fc, B:72:0x020f, B:75:0x003e, B:79:0x0089, B:81:0x008f, B:84:0x009e, B:87:0x00c2, B:90:0x0094), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ea A[Catch: all -> 0x007a, SQLiteException -> 0x007d, TryCatch #3 {all -> 0x007a, blocks: (B:3:0x0018, B:8:0x002c, B:11:0x004a, B:13:0x0066, B:21:0x006e, B:24:0x0072, B:25:0x00ca, B:27:0x00f0, B:28:0x0102, B:30:0x0106, B:31:0x0116, B:33:0x011c, B:34:0x012c, B:43:0x015a, B:44:0x0162, B:46:0x016d, B:48:0x018d, B:50:0x019b, B:51:0x01a5, B:53:0x01e3, B:62:0x01d3, B:63:0x01ea, B:66:0x0147, B:70:0x01fc, B:72:0x020f, B:75:0x003e, B:79:0x0089, B:81:0x008f, B:84:0x009e, B:87:0x00c2, B:90:0x0094), top: B:2:0x0018 }] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e0(String str, long j, long j3, e1 e1Var) {
        ?? r9;
        String str2;
        SQLiteDatabase j02;
        String[] strArr;
        String str3;
        String string;
        long j10;
        String str4;
        String[] strArr2;
        q1 q1Var = (q1) this.f1478d;
        s();
        t();
        Cursor cursor = null;
        try {
            try {
                j02 = j0();
                r9 = TextUtils.isEmpty(str);
            } catch (SQLiteException e2) {
                e = e2;
                r9 = str;
            }
            if (r9 != 0) {
                String[] strArr3 = j3 != -1 ? new String[]{String.valueOf(j3), String.valueOf(j)} : new String[]{String.valueOf(j)};
                str3 = j3 != -1 ? "rowid <= ? and " : "";
                StringBuilder sb2 = new StringBuilder(str3.length() + 148);
                sb2.append("select app_id, metadata_fingerprint from raw_events where ");
                sb2.append(str3);
                sb2.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                cursor = j02.rawQuery(sb2.toString(), strArr3);
                try {
                } catch (SQLiteException e9) {
                    e = e9;
                    str2 = str;
                }
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        return;
                    } else {
                        return;
                    }
                }
                str2 = cursor.getString(0);
                try {
                    string = cursor.getString(1);
                    cursor.close();
                } catch (SQLiteException e10) {
                    e = e10;
                    v0 v0Var = q1Var.f8937t;
                    q1.l(v0Var);
                    v0Var.f9050t.c(v0.A(str2), e, "Data loss. Error selecting raw event. appId");
                }
            } else {
                try {
                    if (j3 != -1) {
                        String str5 = str;
                        strArr = new String[]{str5, String.valueOf(j3)};
                        r9 = str5;
                    } else {
                        String str6 = str;
                        strArr = new String[]{str6};
                        r9 = str6;
                    }
                    str3 = j3 != -1 ? " and rowid <= ?" : "";
                    StringBuilder sb3 = new StringBuilder(str3.length() + 84);
                    sb3.append("select metadata_fingerprint from raw_events where app_id = ?");
                    sb3.append(str3);
                    sb3.append(" order by rowid limit 1;");
                    cursor = j02.rawQuery(sb3.toString(), strArr);
                } catch (SQLiteException e11) {
                    e = e11;
                    str2 = r9;
                    v0 v0Var2 = q1Var.f8937t;
                    q1.l(v0Var2);
                    v0Var2.f9050t.c(v0.A(str2), e, "Data loss. Error selecting raw event. appId");
                }
                if (cursor.moveToFirst()) {
                    string = cursor.getString(0);
                    cursor.close();
                    str2 = r9;
                }
            }
            cursor = j02.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str2, string}, null, null, "rowid", "2");
            if (cursor.moveToFirst()) {
                try {
                    e9 e9Var = (e9) ((d9) l4.d0(e9.Y(), cursor.getBlob(0))).d();
                    if (cursor.moveToNext()) {
                        v0 v0Var3 = q1Var.f8937t;
                        q1.l(v0Var3);
                        v0Var3.f9053w.b(v0.A(str2), "Get multiple raw event metadata records, expected one. appId");
                    }
                    cursor.close();
                    e1Var.f8665b = e9Var;
                    long P = P("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{str2, string}, -1L);
                    if (j3 != -1) {
                        j10 = j3;
                    } else if (P != -1) {
                        j10 = -1;
                    } else {
                        strArr2 = new String[]{str2, string};
                        str4 = "app_id = ? and metadata_fingerprint = ?";
                        cursor = j02.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str4, strArr2, null, null, "rowid", null);
                        if (cursor.moveToFirst()) {
                            v0 v0Var4 = q1Var.f8937t;
                            q1.l(v0Var4);
                            v0Var4.f9053w.b(v0.A(str2), "Raw event data disappeared while in transaction. appId");
                        } else {
                            do {
                                long j11 = cursor.getLong(0);
                                byte[] blob = cursor.getBlob(3);
                                long j12 = cursor.getLong(4);
                                try {
                                    v8 v8Var = (v8) l4.d0(w8.J(), blob);
                                    v8Var.n(cursor.getString(1));
                                    long j13 = cursor.getLong(2);
                                    v8Var.b();
                                    ((w8) v8Var.f2389e).Q(j13);
                                    v8Var.b();
                                    ((w8) v8Var.f2389e).t(j12);
                                    if (!e1Var.a(j11, (w8) v8Var.d())) {
                                        break;
                                    }
                                } catch (IOException e12) {
                                    v0 v0Var5 = q1Var.f8937t;
                                    q1.l(v0Var5);
                                    v0Var5.f9050t.c(v0.A(str2), e12, "Data loss. Failed to merge raw event. appId");
                                }
                            } while (cursor.moveToNext());
                        }
                    }
                    if (j10 != -1 && P != -1) {
                        P = Math.min(j10, P);
                    } else if (j10 != -1) {
                        P = j10;
                    }
                    str4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                    strArr2 = new String[]{str2, string, String.valueOf(P)};
                    cursor = j02.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str4, strArr2, null, null, "rowid", null);
                    if (cursor.moveToFirst()) {
                    }
                } catch (IOException e13) {
                    v0 v0Var6 = q1Var.f8937t;
                    q1.l(v0Var6);
                    v0Var6.f9050t.c(v0.A(str2), e13, "Data loss. Failed to merge raw event metadata. appId");
                }
            } else {
                v0 v0Var7 = q1Var.f8937t;
                q1.l(v0Var7);
                v0Var7.f9050t.b(v0.A(str2), "Raw event metadata record is missing. appId");
            }
        } finally {
            if (0 != 0) {
                cursor.close();
            }
        }
    }

    public final void g0() {
        t();
        j0().beginTransaction();
    }

    public final void h0() {
        t();
        j0().setTransactionSuccessful();
    }

    public final void i0() {
        t();
        j0().endTransaction();
    }

    public final SQLiteDatabase j0() {
        s();
        try {
            return this.f8829r.getWritableDatabase();
        } catch (SQLiteException e2) {
            v0 v0Var = ((q1) this.f1478d).f8937t;
            q1.l(v0Var);
            v0Var.f9053w.b(e2, "Error opening database");
            throw e2;
        }
    }

    public final void k0(String str) {
        r S;
        U("events_snapshot", str);
        Cursor cursor = null;
        try {
            try {
                cursor = j0().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        if (string != null && (S = S("events", str, string)) != null) {
                            T("events_snapshot", S);
                        }
                    } while (cursor.moveToNext());
                }
            } catch (SQLiteException e2) {
                v0 v0Var = ((q1) this.f1478d).f8937t;
                q1.l(v0Var);
                v0Var.f9050t.c(v0.A(str), e2, "Error creating snapshot. appId");
            }
            if (cursor != null) {
                cursor.close();
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
    
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        T("events", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
    
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l0(String str) {
        boolean z10;
        r S;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        r S2 = S("events", str, "_f");
        r S3 = S("events", str, "_v");
        U("events", str);
        Cursor cursor = null;
        boolean z11 = false;
        try {
            cursor = j0().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
        } catch (SQLiteException e2) {
            e = e2;
            z10 = false;
        } catch (Throwable th) {
            th = th;
            z10 = false;
        }
        if (!cursor.moveToFirst()) {
            cursor.close();
            if (S2 == null) {
            }
            T("events", S2);
            U("events_snapshot", str);
        }
        boolean z12 = false;
        z10 = false;
        do {
            try {
                String string = cursor.getString(0);
                if (cursor.getLong(1) >= 1) {
                    if ("_f".equals(string)) {
                        z12 = true;
                    } else if ("_v".equals(string)) {
                        z10 = true;
                    }
                }
                if (string != null && (S = S("events_snapshot", str, string)) != null) {
                    T("events", S);
                }
            } catch (SQLiteException e9) {
                e = e9;
                z11 = z12;
                try {
                    v0 v0Var = ((q1) this.f1478d).f8937t;
                    q1.l(v0Var);
                    v0Var.f9050t.c(v0.A(str), e, "Error querying snapshot. appId");
                    z12 = z11;
                    if (cursor != null) {
                    }
                    if (!z12) {
                    }
                    if (!z10) {
                    }
                    U("events_snapshot", str);
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (z11 && S2 != null) {
                        T("events", S2);
                    } else if (!z10 && S3 != null) {
                        T("events", S3);
                    }
                    U("events_snapshot", str);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                z11 = z12;
                if (cursor != null) {
                }
                if (z11) {
                }
                if (!z10) {
                    T("events", S3);
                }
                U("events_snapshot", str);
                throw th;
            }
        } while (cursor.moveToNext());
        if (cursor != null) {
            cursor.close();
        }
        if (!z12 || S2 == null) {
            if (!z10) {
            }
            U("events_snapshot", str);
        }
        T("events", S2);
        U("events_snapshot", str);
    }

    public final void m0(String str, String str2) {
        c7.c0.d(str);
        c7.c0.d(str2);
        s();
        t();
        try {
            j0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            q1 q1Var = (q1) this.f1478d;
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.f9050t.d("Error deleting user property. appId", v0.A(str), q1Var.f8941x.c(str2), e2);
        }
    }

    public final boolean n0(n4 n4Var) {
        q1 q1Var = (q1) this.f1478d;
        String str = n4Var.f8882b;
        s();
        t();
        String str2 = n4Var.f8881a;
        String str3 = n4Var.f8883c;
        if (o0(str2, str3) == null) {
            if (p4.s0(str3)) {
                if (O("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(q1Var.f8935r.B(str2, e0.V), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long O = O("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                q1Var.getClass();
                if (O >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str2);
        contentValues.put("origin", str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(n4Var.f8884d));
        f0(contentValues, n4Var.f8885e);
        try {
            if (j0().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.f9050t.b(v0.A(str2), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e2) {
            v0 v0Var2 = q1Var.f8937t;
            q1.l(v0Var2);
            v0Var2.f9050t.c(v0.A(str2), e2, "Error storing user property. appId");
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n4 o0(String str, String str2) {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursor;
        q1 q1Var = (q1) this.f1478d;
        c7.c0.d(str);
        c7.c0.d(str2);
        s();
        t();
        Cursor cursor2 = null;
        try {
            cursor = j0().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursor.moveToFirst()) {
                        long j = cursor.getLong(0);
                        Object F = F(cursor, 1);
                        if (F != null) {
                            str3 = str;
                            str4 = str2;
                            try {
                                n4 n4Var = new n4(str3, cursor.getString(2), str4, j, F);
                                if (cursor.moveToNext()) {
                                    v0 v0Var = q1Var.f8937t;
                                    q1.l(v0Var);
                                    v0Var.f9050t.b(v0.A(str3), "Got multiple records for user property, expected one. appId");
                                }
                                cursor.close();
                                return n4Var;
                            } catch (SQLiteException e2) {
                                e = e2;
                                sQLiteException = e;
                                v0 v0Var2 = q1Var.f8937t;
                                q1.l(v0Var2);
                                v0Var2.f9050t.d("Error querying user property. appId", v0.A(str3), q1Var.f8941x.c(str4), sQLiteException);
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
            } catch (SQLiteException e9) {
                e = e9;
                str3 = str;
                str4 = str2;
            }
        } catch (SQLiteException e10) {
            str3 = str;
            str4 = str2;
            sQLiteException = e10;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List p0(String str) {
        String str2;
        q1 q1Var = (q1) this.f1478d;
        c7.c0.d(str);
        s();
        t();
        ?? arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                q1Var.getClass();
                cursor = j0().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                try {
                    if (cursor.moveToFirst()) {
                        while (true) {
                            String string = cursor.getString(0);
                            String string2 = cursor.getString(1);
                            if (string2 == null) {
                                string2 = "";
                            }
                            String str3 = string2;
                            long j = cursor.getLong(2);
                            Object F = F(cursor, 3);
                            if (F == null) {
                                v0 v0Var = q1Var.f8937t;
                                q1.l(v0Var);
                                v0Var.f9050t.b(v0.A(str), "Read invalid user property value, ignoring it. appId");
                                str2 = str;
                            } else {
                                str2 = str;
                                try {
                                    arrayList.add(new n4(str2, str3, string, j, F));
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    v0 v0Var2 = q1Var.f8937t;
                                    q1.l(v0Var2);
                                    v0Var2.f9050t.c(v0.A(str2), e, "Error querying user properties. appId");
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
                } catch (SQLiteException e9) {
                    e = e9;
                    str2 = str;
                }
            } finally {
            }
        } catch (SQLiteException e10) {
            e = e10;
            str2 = str;
        }
        if (cursor != null) {
            cursor.close();
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b1, code lost:
    
        s7.q1.l(r13);
        r13.f9050t.b(1000, "Read more than the max allowed user properties, ignoring excess");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012e  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List q0(String str, String str2, String str3) {
        Cursor cursor;
        String str4;
        Cursor cursor2;
        String str5;
        q1 q1Var = (q1) this.f1478d;
        c7.c0.d(str);
        s();
        t();
        ?? arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = new ArrayList(3);
            String str6 = str;
            arrayList2.add(str6);
            StringBuilder sb2 = new StringBuilder("app_id=?");
            if (!TextUtils.isEmpty(str2)) {
                arrayList2.add(str2);
                sb2.append(" and origin=?");
            }
            if (!TextUtils.isEmpty(str3)) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 1);
                sb3.append(str3);
                sb3.append("*");
                arrayList2.add(sb3.toString());
                sb2.append(" and name glob ?");
            }
            String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            String sb4 = sb2.toString();
            q1Var.getClass();
            v0 v0Var = q1Var.f8937t;
            cursor2 = j0().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, sb4, strArr, null, null, "rowid", "1001");
            try {
                try {
                    if (cursor2.moveToFirst()) {
                        str4 = str2;
                        while (true) {
                            try {
                                if (arrayList.size() >= 1000) {
                                    break;
                                }
                                String string = cursor2.getString(0);
                                long j = cursor2.getLong(1);
                                Object F = F(cursor2, 2);
                                String string2 = cursor2.getString(3);
                                if (F == null) {
                                    try {
                                        q1.l(v0Var);
                                        v0Var.f9050t.d("(2)Read invalid user property value, ignoring it", v0.A(str6), string2, str3);
                                        str5 = string2;
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        str5 = string2;
                                        cursor = cursor2;
                                        str4 = str5;
                                        try {
                                            v0 v0Var2 = q1Var.f8937t;
                                            q1.l(v0Var2);
                                            v0Var2.f9050t.d("(2)Error querying user properties", v0.A(str), str4, e);
                                            arrayList = Collections.EMPTY_LIST;
                                            cursor2 = cursor;
                                            if (cursor2 != null) {
                                            }
                                            return arrayList;
                                        } catch (Throwable th) {
                                            th = th;
                                            if (cursor != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    str5 = string2;
                                    try {
                                        arrayList.add(new n4(str, str5, string, j, F));
                                    } catch (SQLiteException e9) {
                                        e = e9;
                                        cursor = cursor2;
                                        str4 = str5;
                                        v0 v0Var22 = q1Var.f8937t;
                                        q1.l(v0Var22);
                                        v0Var22.f9050t.d("(2)Error querying user properties", v0.A(str), str4, e);
                                        arrayList = Collections.EMPTY_LIST;
                                        cursor2 = cursor;
                                        if (cursor2 != null) {
                                        }
                                        return arrayList;
                                    }
                                }
                                if (!cursor2.moveToNext()) {
                                    break;
                                }
                                str6 = str;
                                str4 = str5;
                            } catch (SQLiteException e10) {
                                e = e10;
                                cursor = cursor2;
                                v0 v0Var222 = q1Var.f8937t;
                                q1.l(v0Var222);
                                v0Var222.f9050t.d("(2)Error querying user properties", v0.A(str), str4, e);
                                arrayList = Collections.EMPTY_LIST;
                                cursor2 = cursor;
                                if (cursor2 != null) {
                                }
                                return arrayList;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursor2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e11) {
                e = e11;
                str4 = str2;
            }
        } catch (SQLiteException e12) {
            e = e12;
            str4 = str2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
        if (cursor2 != null) {
            cursor2.close();
        }
        return arrayList;
    }

    public final boolean r0(e eVar) {
        q1 q1Var = (q1) this.f1478d;
        s();
        t();
        String str = eVar.f8594d;
        c7.c0.g(str);
        if (o0(str, eVar.f8596i.f8852e) == null) {
            long O = O("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            q1Var.getClass();
            if (O >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", eVar.f8595e);
        contentValues.put("name", eVar.f8596i.f8852e);
        Object b10 = eVar.f8596i.b();
        c7.c0.g(b10);
        f0(contentValues, b10);
        contentValues.put("active", Boolean.valueOf(eVar.f8598s));
        contentValues.put("trigger_event_name", eVar.f8599t);
        contentValues.put("trigger_timeout", Long.valueOf(eVar.f8601v));
        u uVar = eVar.f8600u;
        p4 p4Var = q1Var.f8940w;
        v0 v0Var = q1Var.f8937t;
        q1.j(p4Var);
        contentValues.put("timed_out_event", p4.b0(uVar));
        contentValues.put("creation_timestamp", Long.valueOf(eVar.f8597r));
        q1.j(p4Var);
        contentValues.put("triggered_event", p4.b0(eVar.f8602w));
        contentValues.put("triggered_timestamp", Long.valueOf(eVar.f8596i.f8853i));
        contentValues.put("time_to_live", Long.valueOf(eVar.f8603x));
        contentValues.put("expired_event", p4.b0(eVar.f8604y));
        try {
            if (j0().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            q1.l(v0Var);
            v0Var.f9050t.b(v0.A(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e2) {
            q1.l(v0Var);
            v0Var.f9050t.c(v0.A(str), e2, "Error storing conditional user property");
            return true;
        }
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00f6: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:247), block:B:37:0x00f6 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e s0(String str, String str2) {
        String str3;
        Cursor cursor;
        Cursor cursor2;
        q1 q1Var = (q1) this.f1478d;
        c7.c0.d(str);
        c7.c0.d(str2);
        s();
        t();
        Cursor cursor3 = null;
        try {
            try {
                cursor = j0().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                } catch (SQLiteException e2) {
                    e = e2;
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
        } catch (SQLiteException e9) {
            e = e9;
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
        Object F = F(cursor, 1);
        boolean z10 = cursor.getInt(2) != 0;
        String string2 = cursor.getString(3);
        long j = cursor.getLong(4);
        l4 l4Var = this.f9150e.f8766u;
        j4.T(l4Var);
        byte[] blob = cursor.getBlob(5);
        Parcelable.Creator<u> creator = u.CREATOR;
        u uVar = (u) l4Var.V(blob, creator);
        long j3 = cursor.getLong(6);
        j4.T(l4Var);
        u uVar2 = (u) l4Var.V(cursor.getBlob(7), creator);
        long j10 = cursor.getLong(8);
        long j11 = cursor.getLong(9);
        j4.T(l4Var);
        str3 = str2;
        try {
            e eVar = new e(str, str4, new m4(j10, F, str3, str4), j3, z10, string2, uVar, j, uVar2, j11, (u) l4Var.V(cursor.getBlob(10), creator));
            if (cursor.moveToNext()) {
                v0 v0Var = q1Var.f8937t;
                q1.l(v0Var);
                v0Var.f9050t.c(v0.A(str), q1Var.f8941x.c(str3), "Got multiple records for conditional property, expected one");
            }
            cursor.close();
            return eVar;
        } catch (SQLiteException e10) {
            e = e10;
            v0 v0Var2 = q1Var.f8937t;
            q1.l(v0Var2);
            v0Var2.f9050t.d("Error querying conditional property", v0.A(str), q1Var.f8941x.c(str3), e);
            if (cursor != null) {
            }
            return null;
        }
    }

    public final void t0(String str, String str2) {
        c7.c0.d(str);
        c7.c0.d(str2);
        s();
        t();
        try {
            j0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            q1 q1Var = (q1) this.f1478d;
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.f9050t.d("Error deleting conditional property", v0.A(str), q1Var.f8941x.c(str2), e2);
        }
    }

    public final List u0(String str, String str2, String str3) {
        c7.c0.d(str);
        s();
        t();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb2.append(" and name glob ?");
        }
        return v0(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // s7.d4
    public final void v() {
        q1 q1Var = (q1) this.f1478d;
        if (q1Var.f8935r.D(null, e0.f8619e1)) {
            o1 o1Var = q1Var.f8938u;
            q1.l(o1Var);
            o1Var.B(new b7.k(11, this));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        r3 = r2.f8937t;
        s7.q1.l(r3);
        r3.f9050t.b(1000, "Read more than the max allowed conditional properties, ignoring extra");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List v0(String str, String[] strArr) {
        q1 q1Var = (q1) this.f1478d;
        s();
        t();
        ?? arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                q1Var.getClass();
                cursor = j0().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
                if (cursor.moveToFirst()) {
                    while (true) {
                        if (arrayList.size() >= 1000) {
                            break;
                        }
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        String string3 = cursor.getString(2);
                        Object F = F(cursor, 3);
                        boolean z10 = cursor.getInt(4) != 0;
                        String string4 = cursor.getString(5);
                        long j = cursor.getLong(6);
                        l4 l4Var = this.f9150e.f8766u;
                        j4.T(l4Var);
                        byte[] blob = cursor.getBlob(7);
                        Parcelable.Creator<u> creator = u.CREATOR;
                        u uVar = (u) l4Var.V(blob, creator);
                        long j3 = cursor.getLong(8);
                        j4.T(l4Var);
                        u uVar2 = (u) l4Var.V(cursor.getBlob(9), creator);
                        long j10 = cursor.getLong(10);
                        long j11 = cursor.getLong(11);
                        j4.T(l4Var);
                        arrayList.add(new e(string, string2, new m4(j10, F, string3, string2), j3, z10, string4, uVar, j, uVar2, j11, (u) l4Var.V(cursor.getBlob(12), creator)));
                        if (!cursor.moveToNext()) {
                            break;
                        }
                    }
                }
            } catch (SQLiteException e2) {
                v0 v0Var = q1Var.f8937t;
                q1.l(v0Var);
                v0Var.f9050t.b(e2, "Error querying conditional user property value");
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

    public final long w(String str, c9 c9Var, String str2, Map map, x2 x2Var, Long l10) {
        int delete;
        q1 q1Var = (q1) this.f1478d;
        s();
        t();
        c7.c0.g(c9Var);
        c7.c0.d(str);
        s();
        t();
        if (d0()) {
            j4 j4Var = this.f9150e;
            long a9 = j4Var.f8768w.f8876t.a();
            g7.a aVar = q1Var.f8942y;
            v0 v0Var = q1Var.f8937t;
            aVar.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - a9) > ((Long) e0.M.a(null)).longValue()) {
                j4Var.f8768w.f8876t.b(elapsedRealtime);
                s();
                t();
                if (d0() && (delete = j0().delete("upload_queue", W(), new String[0])) > 0) {
                    q1.l(v0Var);
                    v0Var.B.b(Integer.valueOf(delete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                c7.c0.d(str);
                s();
                t();
                try {
                    int B2 = q1Var.f8935r.B(str, e0.A);
                    if (B2 > 0) {
                        j0().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(B2)});
                    }
                } catch (SQLiteException e2) {
                    q1.l(v0Var);
                    v0Var.f9050t.c(v0.A(str), e2, "Error deleting over the limit queued batches. appId");
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb2.append(str3);
            sb2.append("=");
            sb2.append(str4);
            arrayList.add(sb2.toString());
        }
        byte[] a10 = c9Var.a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", a10);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", TextUtils.join("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(x2Var.f9103d));
        g7.a aVar2 = q1Var.f8942y;
        v0 v0Var2 = q1Var.f8937t;
        aVar2.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l10 != null) {
            contentValues.put("associated_row_id", l10);
        }
        try {
            long insert = j0().insert("upload_queue", null, contentValues);
            if (insert != -1) {
                return insert;
            }
            q1.l(v0Var2);
            v0Var2.f9050t.b(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            return -1L;
        } catch (SQLiteException e9) {
            q1.l(v0Var2);
            v0Var2.f9050t.c(str, e9, "Error storing MeasurementBatch to upload_queue. appId");
            return -1L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0402  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a1 w0(String str) {
        Cursor cursor;
        Boolean valueOf;
        String string;
        q1 q1Var = (q1) this.f1478d;
        c7.c0.d(str);
        s();
        t();
        Cursor cursor2 = null;
        try {
            cursor = j0().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility", "last_diagnostics_signal_upload_timestamp"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                } catch (SQLiteException e2) {
                    e = e2;
                    v0 v0Var = q1Var.f8937t;
                    q1.l(v0Var);
                    v0Var.f9050t.c(v0.A(str), e, "Error querying app. appId");
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
        } catch (SQLiteException e9) {
            e = e9;
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
        j4 j4Var = this.f9150e;
        a1 a1Var = new a1(j4Var.f8771z, str);
        q1 q1Var2 = a1Var.f8474a;
        c2 c10 = j4Var.c(str);
        b2 b2Var = b2.ANALYTICS_STORAGE;
        if (c10.i(b2Var)) {
            a1Var.G(cursor.getString(0));
        }
        boolean z10 = true;
        a1Var.I(cursor.getString(1));
        if (j4Var.c(str).i(b2.AD_STORAGE)) {
            a1Var.J(cursor.getString(2));
        }
        a1Var.e(cursor.getLong(3));
        a1Var.M(cursor.getLong(4));
        a1Var.N(cursor.getLong(5));
        a1Var.P(cursor.getString(6));
        a1Var.S(cursor.getString(7));
        a1Var.T(cursor.getLong(8));
        a1Var.a(cursor.getLong(9));
        a1Var.d(cursor.isNull(10) || cursor.getInt(10) != 0);
        a1Var.i(cursor.getLong(11));
        a1Var.j(cursor.getLong(12));
        a1Var.k(cursor.getLong(13));
        a1Var.l(cursor.getLong(14));
        a1Var.f(cursor.getLong(15));
        a1Var.g(cursor.getLong(16));
        a1Var.R(cursor.isNull(17) ? -2147483648L : cursor.getInt(17));
        a1Var.L(cursor.getString(18));
        a1Var.n(cursor.getLong(19));
        a1Var.m(cursor.getLong(20));
        a1Var.w(cursor.getString(21));
        boolean z11 = cursor.isNull(23) || cursor.getInt(23) != 0;
        o1 o1Var = q1Var2.f8938u;
        q1.l(o1Var);
        o1Var.s();
        a1Var.R |= a1Var.f8487p != z11;
        a1Var.f8487p = z11;
        a1Var.c(cursor.isNull(25) ? 0L : cursor.getLong(25));
        if (!cursor.isNull(26)) {
            a1Var.y(Arrays.asList(cursor.getString(26).split(",", -1)));
        }
        if (j4Var.c(str).i(b2Var)) {
            String string2 = cursor.getString(28);
            o1 o1Var2 = q1Var2.f8938u;
            q1.l(o1Var2);
            o1Var2.s();
            a1Var.R |= !Objects.equals(a1Var.f8491t, string2);
            a1Var.f8491t = string2;
        }
        boolean z12 = (cursor.isNull(29) || cursor.getInt(29) == 0) ? false : true;
        o1 o1Var3 = q1Var2.f8938u;
        q1.l(o1Var3);
        o1Var3.s();
        a1Var.R |= a1Var.f8492u != z12;
        a1Var.f8492u = z12;
        a1Var.r(cursor.getLong(39));
        String string3 = cursor.getString(36);
        o1 o1Var4 = q1Var2.f8938u;
        q1.l(o1Var4);
        o1Var4.s();
        a1Var.R |= a1Var.C != string3;
        a1Var.C = string3;
        a1Var.A(cursor.getLong(30));
        a1Var.B(cursor.getLong(31));
        com.google.android.gms.internal.measurement.i4.a();
        if (q1Var.f8935r.D(str, e0.O0)) {
            int i3 = cursor.getInt(32);
            o1 o1Var5 = q1Var2.f8938u;
            q1.l(o1Var5);
            o1Var5.s();
            a1Var.R |= a1Var.f8495x != i3;
            a1Var.f8495x = i3;
            a1Var.C(cursor.getLong(35));
        }
        boolean z13 = (cursor.isNull(33) || cursor.getInt(33) == 0) ? false : true;
        o1 o1Var6 = q1Var2.f8938u;
        q1.l(o1Var6);
        o1Var6.s();
        a1Var.R |= a1Var.f8496y != z13;
        a1Var.f8496y = z13;
        if (cursor.isNull(34)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getInt(34) != 0);
        }
        o1 o1Var7 = q1Var2.f8938u;
        q1.l(o1Var7);
        o1Var7.s();
        a1Var.R |= !Objects.equals(a1Var.f8488q, valueOf);
        a1Var.f8488q = valueOf;
        a1Var.p(cursor.getInt(37));
        a1Var.q(cursor.getInt(38));
        if (cursor.isNull(40)) {
            string = "";
        } else {
            string = cursor.getString(40);
            c7.c0.g(string);
        }
        o1 o1Var8 = q1Var2.f8938u;
        q1.l(o1Var8);
        o1Var8.s();
        a1Var.R |= a1Var.G != string;
        a1Var.G = string;
        if (!cursor.isNull(41)) {
            Long valueOf2 = Long.valueOf(cursor.getLong(41));
            o1 o1Var9 = q1Var2.f8938u;
            q1.l(o1Var9);
            o1Var9.s();
            a1Var.R |= !Objects.equals(a1Var.f8497z, valueOf2);
            a1Var.f8497z = valueOf2;
        }
        if (!cursor.isNull(42)) {
            Long valueOf3 = Long.valueOf(cursor.getLong(42));
            o1 o1Var10 = q1Var2.f8938u;
            q1.l(o1Var10);
            o1Var10.s();
            a1Var.R |= !Objects.equals(a1Var.A, valueOf3);
            a1Var.A = valueOf3;
        }
        byte[] blob = cursor.getBlob(43);
        o1 o1Var11 = q1Var2.f8938u;
        q1.l(o1Var11);
        o1Var11.s();
        a1Var.R |= a1Var.H != blob;
        a1Var.H = blob;
        if (!cursor.isNull(44)) {
            int i10 = cursor.getInt(44);
            o1 o1Var12 = q1Var2.f8938u;
            q1.l(o1Var12);
            o1Var12.s();
            boolean z14 = a1Var.R;
            if (a1Var.I == i10) {
                z10 = false;
            }
            a1Var.R = z10 | z14;
            a1Var.I = i10;
        }
        if (q1Var.f8935r.D(str, e0.f8631j1) && !cursor.isNull(45)) {
            a1Var.u(cursor.getLong(45));
        }
        o1 o1Var13 = q1Var2.f8938u;
        q1.l(o1Var13);
        o1Var13.s();
        a1Var.R = false;
        if (cursor.moveToNext()) {
            v0 v0Var2 = q1Var.f8937t;
            q1.l(v0Var2);
            v0Var2.f9050t.b(v0.A(str), "Got multiple records for app, expected one. appId");
        }
        cursor.close();
        return a1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List x(String str, b4 b4Var, int i3) {
        List list;
        c7.c0.d(str);
        s();
        t();
        Cursor cursor = null;
        try {
            SQLiteDatabase j02 = j0();
            String[] strArr = {"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
            String X = X(b4Var.f8532d);
            String W = W();
            StringBuilder sb2 = new StringBuilder(X.length() + 17 + W.length());
            sb2.append("app_id=?");
            sb2.append(X);
            sb2.append(" AND NOT ");
            sb2.append(W);
            cursor = j02.query("upload_queue", strArr, sb2.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i3 > 0 ? String.valueOf(i3) : null);
            ArrayList arrayList = new ArrayList();
            while (cursor.moveToNext()) {
                k4 V = V(str, cursor.getLong(0), cursor.getBlob(2), cursor.getString(3), cursor.getString(4), cursor.getInt(5), cursor.getInt(6), cursor.getLong(7), cursor.getLong(8), cursor.getLong(9));
                if (V != null) {
                    arrayList.add(V);
                }
            }
            list = arrayList;
        } catch (SQLiteException e2) {
            try {
                v0 v0Var = ((q1) this.f1478d).f8937t;
                q1.l(v0Var);
                v0Var.f9050t.c(str, e2, "Error to querying MeasurementBatch from upload_queue. appId");
                list = Collections.EMPTY_LIST;
            } catch (Throwable th) {
                th = th;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return list;
    }

    public final void x0(a1 a1Var, boolean z10) {
        q1 q1Var = (q1) this.f1478d;
        q1 q1Var2 = a1Var.f8474a;
        s();
        t();
        String E = a1Var.E();
        c7.c0.g(E);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", E);
        b2 b2Var = b2.ANALYTICS_STORAGE;
        j4 j4Var = this.f9150e;
        if (z10) {
            contentValues.put("app_instance_id", (String) null);
        } else if (j4Var.c(E).i(b2Var)) {
            contentValues.put("app_instance_id", a1Var.F());
        }
        contentValues.put("gmp_app_id", a1Var.H());
        if (j4Var.c(E).i(b2.AD_STORAGE)) {
            o1 o1Var = q1Var2.f8938u;
            q1.l(o1Var);
            o1Var.s();
            contentValues.put("resettable_device_id_hash", a1Var.f8478e);
        }
        o1 o1Var2 = q1Var2.f8938u;
        q1.l(o1Var2);
        o1Var2.s();
        contentValues.put("last_bundle_index", Long.valueOf(a1Var.g));
        o1 o1Var3 = q1Var2.f8938u;
        q1.l(o1Var3);
        o1Var3.s();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(a1Var.f8480h));
        o1 o1Var4 = q1Var2.f8938u;
        q1.l(o1Var4);
        o1Var4.s();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(a1Var.f8481i));
        contentValues.put("app_version", a1Var.O());
        o1 o1Var5 = q1Var2.f8938u;
        q1.l(o1Var5);
        o1Var5.s();
        contentValues.put("app_store", a1Var.f8483l);
        o1 o1Var6 = q1Var2.f8938u;
        q1.l(o1Var6);
        o1Var6.s();
        contentValues.put("gmp_version", Long.valueOf(a1Var.f8484m));
        o1 o1Var7 = q1Var2.f8938u;
        q1.l(o1Var7);
        o1Var7.s();
        contentValues.put("dev_cert_hash", Long.valueOf(a1Var.f8485n));
        o1 o1Var8 = q1Var2.f8938u;
        q1.l(o1Var8);
        o1Var8.s();
        contentValues.put("measurement_enabled", Boolean.valueOf(a1Var.f8486o));
        o1 o1Var9 = q1Var2.f8938u;
        o1 o1Var10 = q1Var2.f8938u;
        q1.l(o1Var9);
        o1Var9.s();
        contentValues.put("day", Long.valueOf(a1Var.K));
        q1.l(o1Var10);
        o1Var10.s();
        contentValues.put("daily_public_events_count", Long.valueOf(a1Var.L));
        q1.l(o1Var10);
        o1Var10.s();
        contentValues.put("daily_events_count", Long.valueOf(a1Var.M));
        q1.l(o1Var10);
        o1Var10.s();
        contentValues.put("daily_conversions_count", Long.valueOf(a1Var.N));
        o1 o1Var11 = q1Var2.f8938u;
        q1.l(o1Var11);
        o1Var11.s();
        contentValues.put("config_fetched_time", Long.valueOf(a1Var.S));
        o1 o1Var12 = q1Var2.f8938u;
        q1.l(o1Var12);
        o1Var12.s();
        contentValues.put("failed_config_fetch_time", Long.valueOf(a1Var.T));
        contentValues.put("app_version_int", Long.valueOf(a1Var.Q()));
        contentValues.put("firebase_instance_id", a1Var.K());
        q1.l(o1Var10);
        o1Var10.s();
        contentValues.put("daily_error_events_count", Long.valueOf(a1Var.O));
        q1.l(o1Var10);
        o1Var10.s();
        contentValues.put("daily_realtime_events_count", Long.valueOf(a1Var.P));
        q1.l(o1Var10);
        o1Var10.s();
        contentValues.put("health_monitor_sample", a1Var.Q);
        contentValues.put("android_id", (Long) 0L);
        o1 o1Var13 = q1Var2.f8938u;
        q1.l(o1Var13);
        o1Var13.s();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(a1Var.f8487p));
        contentValues.put("dynamite_version", Long.valueOf(a1Var.b()));
        if (j4Var.c(E).i(b2Var)) {
            o1 o1Var14 = q1Var2.f8938u;
            q1.l(o1Var14);
            o1Var14.s();
            contentValues.put("session_stitching_token", a1Var.f8491t);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(a1Var.z()));
        o1 o1Var15 = q1Var2.f8938u;
        q1.l(o1Var15);
        o1Var15.s();
        contentValues.put("target_os_version", Long.valueOf(a1Var.f8493v));
        o1 o1Var16 = q1Var2.f8938u;
        q1.l(o1Var16);
        o1Var16.s();
        contentValues.put("session_stitching_token_hash", Long.valueOf(a1Var.f8494w));
        com.google.android.gms.internal.measurement.i4.a();
        g gVar = q1Var.f8935r;
        v0 v0Var = q1Var.f8937t;
        if (gVar.D(E, e0.O0)) {
            o1 o1Var17 = q1Var2.f8938u;
            q1.l(o1Var17);
            o1Var17.s();
            contentValues.put("ad_services_version", Integer.valueOf(a1Var.f8495x));
            o1 o1Var18 = q1Var2.f8938u;
            q1.l(o1Var18);
            o1Var18.s();
            contentValues.put("attribution_eligibility_status", Long.valueOf(a1Var.B));
        }
        o1 o1Var19 = q1Var2.f8938u;
        q1.l(o1Var19);
        o1Var19.s();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(a1Var.f8496y));
        contentValues.put("npa_metadata_value", a1Var.x());
        o1 o1Var20 = q1Var2.f8938u;
        q1.l(o1Var20);
        o1Var20.s();
        contentValues.put("bundle_delivery_index", Long.valueOf(a1Var.F));
        contentValues.put("sgtm_preview_key", a1Var.D());
        q1.l(o1Var10);
        o1Var10.s();
        contentValues.put("dma_consent_state", Integer.valueOf(a1Var.D));
        q1.l(o1Var10);
        o1Var10.s();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(a1Var.E));
        contentValues.put("serialized_npa_metadata", a1Var.s());
        contentValues.put("client_upload_eligibility", Integer.valueOf(a1Var.t()));
        o1 o1Var21 = q1Var2.f8938u;
        q1.l(o1Var21);
        o1Var21.s();
        ArrayList arrayList = a1Var.f8490s;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                q1.l(v0Var);
                v0Var.f9053w.b(E, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        if (gVar.D(null, e0.K0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        o1 o1Var22 = q1Var2.f8938u;
        q1.l(o1Var22);
        o1Var22.s();
        contentValues.put("unmatched_pfo", a1Var.f8497z);
        o1 o1Var23 = q1Var2.f8938u;
        q1.l(o1Var23);
        o1Var23.s();
        contentValues.put("unmatched_uwa", a1Var.A);
        o1 o1Var24 = q1Var2.f8938u;
        q1.l(o1Var24);
        o1Var24.s();
        contentValues.put("ad_campaign_info", a1Var.H);
        if (gVar.D(E, e0.f8631j1)) {
            o1 o1Var25 = q1Var2.f8938u;
            q1.l(o1Var25);
            o1Var25.s();
            contentValues.put("last_diagnostics_signal_upload_timestamp", Long.valueOf(a1Var.J));
        }
        try {
            SQLiteDatabase j02 = j0();
            if (j02.update("apps", contentValues, "app_id = ?", new String[]{E}) == 0 && j02.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                q1.l(v0Var);
                v0Var.f9050t.b(v0.A(E), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e2) {
            q1.l(v0Var);
            v0Var.f9050t.c(v0.A(E), e2, "Error storing app. appId");
        }
    }

    public final boolean y(String str) {
        x2[] x2VarArr = {x2.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(x2VarArr[0].f9103d));
        String X = X(arrayList);
        String W = W();
        StringBuilder sb2 = new StringBuilder(X.length() + 61 + W.length());
        sb2.append("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
        sb2.append(X);
        sb2.append(" AND NOT ");
        sb2.append(W);
        return O(sb2.toString(), new String[]{str}) != 0;
    }

    public final j y0(long j, String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        return z0(j, str, 1L, false, false, z10, false, z11, z12, z13);
    }

    public final void z(Long l10) {
        q1 q1Var = (q1) this.f1478d;
        s();
        t();
        try {
            if (j0().delete("upload_queue", "rowid=?", new String[]{l10.toString()}) != 1) {
                v0 v0Var = q1Var.f8937t;
                q1.l(v0Var);
                v0Var.f9053w.a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e2) {
            v0 v0Var2 = q1Var.f8937t;
            q1.l(v0Var2);
            v0Var2.f9050t.b(e2, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e2;
        }
    }

    public final j z0(long j, String str, long j3, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        q1 q1Var = (q1) this.f1478d;
        c7.c0.d(str);
        s();
        t();
        String[] strArr = {str};
        j jVar = new j();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase j02 = j0();
                cursor = j02.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursor.moveToFirst()) {
                    if (cursor.getLong(0) == j) {
                        jVar.f8748b = cursor.getLong(1);
                        jVar.f8747a = cursor.getLong(2);
                        jVar.f8749c = cursor.getLong(3);
                        jVar.f8750d = cursor.getLong(4);
                        jVar.f8751e = cursor.getLong(5);
                        jVar.f8752f = cursor.getLong(6);
                        jVar.g = cursor.getLong(7);
                    }
                    if (z10) {
                        jVar.f8748b += j3;
                    }
                    if (z11) {
                        jVar.f8747a += j3;
                    }
                    if (z12) {
                        jVar.f8749c += j3;
                    }
                    if (z13) {
                        jVar.f8750d += j3;
                    }
                    if (z14) {
                        jVar.f8751e += j3;
                    }
                    if (z15) {
                        jVar.f8752f += j3;
                    }
                    if (z16) {
                        jVar.g += j3;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(jVar.f8747a));
                    contentValues.put("daily_events_count", Long.valueOf(jVar.f8748b));
                    contentValues.put("daily_conversions_count", Long.valueOf(jVar.f8749c));
                    contentValues.put("daily_error_events_count", Long.valueOf(jVar.f8750d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(jVar.f8751e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(jVar.f8752f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(jVar.g));
                    j02.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    v0 v0Var = q1Var.f8937t;
                    q1.l(v0Var);
                    v0Var.f9053w.b(v0.A(str), "Not updating daily counts, app is not known. appId");
                }
            } catch (SQLiteException e2) {
                v0 v0Var2 = q1Var.f8937t;
                q1.l(v0Var2);
                v0Var2.f9050t.c(v0.A(str), e2, "Error updating daily counts. appId");
            }
            if (cursor != null) {
                cursor.close();
            }
            return jVar;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }
}
