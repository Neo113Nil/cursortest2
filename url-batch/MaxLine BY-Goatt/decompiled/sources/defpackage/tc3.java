package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.encoders.json.BuildConfig;
import com.google.firebase.messaging.Constants;
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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tc3 extends vp3 {
    public final rc3 p;
    public final nx0 q;
    public static final String[] r = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] s = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};
    public static final String[] t = {FirebaseAnalytics.Param.ORIGIN, "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] u = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"};
    public static final String[] v = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    public static final String[] w = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] x = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] y = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] z = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public static final String[] A = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    public static final String[] B = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    public tc3(oq3 oq3Var) {
        super(oq3Var);
        this.q = new nx0(((pj3) this.m).w);
        ((pj3) this.m).getClass();
        this.p = new rc3(this, ((pj3) this.m).m);
    }

    public static final String Z(List list) {
        return list.isEmpty() ? BuildConfig.FLAVOR : q40.m(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    public static final void f0(ContentValues contentValues, Object obj) {
        ll3.s("value");
        ll3.v(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
            return;
        }
        if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            lh.e("Invalid value type");
        }
    }

    public final long A(String str, oj3 oj3Var, String str2, Map map, sm3 sm3Var, Long l) {
        int delete;
        pj3 pj3Var = (pj3) this.m;
        v();
        x();
        ll3.v(oj3Var);
        ll3.s(str);
        v();
        x();
        if (d0()) {
            oq3 oq3Var = this.n;
            long a = oq3Var.u.r.a();
            qb2 qb2Var = pj3Var.w;
            vh3 vh3Var = pj3Var.r;
            qb2Var.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - a) > ((Long) ug3.M.a(null)).longValue()) {
                oq3Var.u.r.b(elapsedRealtime);
                v();
                x();
                if (d0() && (delete = l0().delete("upload_queue", Y(), new String[0])) > 0) {
                    pj3.m(vh3Var);
                    vh3Var.z.c(Integer.valueOf(delete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                ll3.s(str);
                v();
                x();
                try {
                    int E = pj3Var.p.E(str, ug3.A);
                    if (E > 0) {
                        l0().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(E)});
                    }
                } catch (SQLiteException e) {
                    pj3.m(vh3Var);
                    vh3Var.r.d(vh3.E(str), e, "Error deleting over the limit queued batches. appId");
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb.append(str3);
            sb.append("=");
            sb.append(str4);
            arrayList.add(sb.toString());
        }
        byte[] a2 = oj3Var.a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", a2);
        contentValues.put("upload_uri", str2);
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append((CharSequence) "\r\n");
            }
        }
        contentValues.put("upload_headers", sb2.toString());
        contentValues.put("upload_type", Integer.valueOf(sm3Var.m));
        qb2 qb2Var2 = pj3Var.w;
        vh3 vh3Var2 = pj3Var.r;
        qb2Var2.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l != null) {
            contentValues.put("associated_row_id", l);
        }
        try {
            long insert = l0().insert("upload_queue", null, contentValues);
            if (insert != -1) {
                return insert;
            }
            pj3.m(vh3Var2);
            vh3Var2.r.c(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            return -1L;
        } catch (SQLiteException e2) {
            pj3.m(vh3Var2);
            vh3Var2.r.d(str, e2, "Error storing MeasurementBatch to upload_queue. appId");
            return -1L;
        }
    }

    public final nc3 A0(long j, String str, boolean z2, boolean z3, boolean z4, boolean z5) {
        return B0(j, str, 1L, false, false, z2, false, z3, z4, z5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public final List B(String str, qp3 qp3Var, int i) {
        ?? r0;
        ll3.s(str);
        v();
        x();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase l0 = l0();
                String[] strArr = {"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
                String Z = Z(qp3Var.m);
                String Y = Y();
                StringBuilder sb = new StringBuilder(Z.length() + 17 + Y.length());
                sb.append("app_id=?");
                sb.append(Z);
                sb.append(" AND NOT ");
                sb.append(Y);
                cursor = l0.query("upload_queue", strArr, sb.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i > 0 ? String.valueOf(i) : null);
                r0 = new ArrayList();
                while (cursor.moveToNext()) {
                    rq3 X = X(str, cursor.getLong(0), cursor.getBlob(2), cursor.getString(3), cursor.getString(4), cursor.getInt(5), cursor.getInt(6), cursor.getLong(7), cursor.getLong(8), cursor.getLong(9));
                    if (X != null) {
                        r0.add(X);
                    }
                }
            } catch (SQLiteException e) {
                vh3 vh3Var = ((pj3) this.m).r;
                pj3.m(vh3Var);
                vh3Var.r.d(str, e, "Error to querying MeasurementBatch from upload_queue. appId");
                r0 = Collections.EMPTY_LIST;
            }
            return r0;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public final nc3 B0(long j, String str, long j2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        pj3 pj3Var = (pj3) this.m;
        ll3.s(str);
        v();
        x();
        String[] strArr = {str};
        nc3 nc3Var = new nc3();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase l0 = l0();
                cursor = l0.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursor.moveToFirst()) {
                    if (cursor.getLong(0) == j) {
                        nc3Var.b = cursor.getLong(1);
                        nc3Var.a = cursor.getLong(2);
                        nc3Var.c = cursor.getLong(3);
                        nc3Var.d = cursor.getLong(4);
                        nc3Var.e = cursor.getLong(5);
                        nc3Var.f = cursor.getLong(6);
                        nc3Var.g = cursor.getLong(7);
                    }
                    if (z2) {
                        nc3Var.b += j2;
                    }
                    if (z3) {
                        nc3Var.a += j2;
                    }
                    if (z4) {
                        nc3Var.c += j2;
                    }
                    if (z5) {
                        nc3Var.d += j2;
                    }
                    if (z6) {
                        nc3Var.e += j2;
                    }
                    if (z7) {
                        nc3Var.f += j2;
                    }
                    if (z8) {
                        nc3Var.g += j2;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(nc3Var.a));
                    contentValues.put("daily_events_count", Long.valueOf(nc3Var.b));
                    contentValues.put("daily_conversions_count", Long.valueOf(nc3Var.c));
                    contentValues.put("daily_error_events_count", Long.valueOf(nc3Var.d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(nc3Var.e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(nc3Var.f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(nc3Var.g));
                    l0.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    vh3 vh3Var = pj3Var.r;
                    pj3.m(vh3Var);
                    vh3Var.u.c(vh3.E(str), "Not updating daily counts, app is not known. appId");
                }
            } catch (SQLiteException e) {
                vh3 vh3Var2 = pj3Var.r;
                pj3.m(vh3Var2);
                vh3Var2.r.d(vh3.E(str), e, "Error updating daily counts. appId");
            }
            if (cursor != null) {
                cursor.close();
            }
            return nc3Var;
        } finally {
        }
    }

    public final boolean C(String str) {
        sm3[] sm3VarArr = {sm3.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(sm3VarArr[0].m));
        String Z = Z(arrayList);
        String Y = Y();
        StringBuilder sb = new StringBuilder(Z.length() + 61 + Y.length());
        sb.append("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
        sb.append(Z);
        sb.append(" AND NOT ");
        sb.append(Y);
        return g0(sb.toString(), new String[]{str}) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0086  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final t13 C0(String str) {
        Throwable th;
        Cursor cursor;
        pj3 pj3Var = (pj3) this.m;
        ll3.s(str);
        v();
        x();
        ?? r2 = 0;
        try {
            try {
                cursor = l0().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (cursor.moveToFirst()) {
                        byte[] blob = cursor.getBlob(0);
                        String string = cursor.getString(1);
                        String string2 = cursor.getString(2);
                        if (cursor.moveToNext()) {
                            vh3 vh3Var = pj3Var.r;
                            pj3.m(vh3Var);
                            vh3Var.r.c(vh3.E(str), "Got multiple records for app config, expected one. appId");
                        }
                        if (blob != null) {
                            t13 t13Var = new t13(blob, string, string2, 3);
                            cursor.close();
                            return t13Var;
                        }
                    }
                } catch (SQLiteException e) {
                    e = e;
                    vh3 vh3Var2 = pj3Var.r;
                    pj3.m(vh3Var2);
                    vh3Var2.r.d(vh3.E(str), e, "Error querying remote config. appId");
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                r2 = this;
                if (r2 != 0) {
                    throw th;
                }
                r2.close();
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (r2 != 0) {
            }
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    public final void D(Long l) {
        pj3 pj3Var = (pj3) this.m;
        v();
        x();
        try {
            if (l0().delete("upload_queue", "rowid=?", new String[]{l.toString()}) != 1) {
                vh3 vh3Var = pj3Var.r;
                pj3.m(vh3Var);
                vh3Var.u.b("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e) {
            vh3 vh3Var2 = pj3Var.r;
            pj3.m(vh3Var2);
            vh3Var2.r.c(e, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e;
        }
    }

    public final void D0(sj3 sj3Var, boolean z2) {
        v();
        x();
        ll3.s(sj3Var.p());
        if (!sj3Var.b2()) {
            throw new IllegalStateException();
        }
        G();
        pj3 pj3Var = (pj3) this.m;
        qb2 qb2Var = pj3Var.w;
        vh3 vh3Var = pj3Var.r;
        qb2Var.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        long c2 = sj3Var.c2();
        tg3 tg3Var = ug3.R;
        if (c2 < currentTimeMillis - ((Long) tg3Var.a(null)).longValue() || sj3Var.c2() > ((Long) tg3Var.a(null)).longValue() + currentTimeMillis) {
            pj3.m(vh3Var);
            vh3Var.u.e("Storing bundle outside of the max uploading time span. appId, now, timestamp", vh3.E(sj3Var.p()), Long.valueOf(currentTimeMillis), Long.valueOf(sj3Var.c2()));
        }
        byte[] a = sj3Var.a();
        try {
            bi3 bi3Var = this.n.s;
            oq3.U(bi3Var);
            byte[] i0 = bi3Var.i0(a);
            pj3.m(vh3Var);
            vh3Var.z.c(Integer.valueOf(i0.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", sj3Var.p());
            contentValues.put("bundle_end_timestamp", Long.valueOf(sj3Var.c2()));
            contentValues.put("data", i0);
            contentValues.put("has_realtime", Integer.valueOf(z2 ? 1 : 0));
            if (sj3Var.p0()) {
                contentValues.put("retry_count", Integer.valueOf(sj3Var.q0()));
            }
            try {
                if (l0().insert("queue", null, contentValues) == -1) {
                    pj3.m(vh3Var);
                    vh3Var.r.c(vh3.E(sj3Var.p()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e) {
                pj3.m(vh3Var);
                vh3Var.r.d(vh3.E(sj3Var.p()), e, "Error storing bundle. appId");
            }
        } catch (IOException e2) {
            pj3.m(vh3Var);
            vh3Var.r.d(vh3.E(sj3Var.p()), e2, "Data loss. Failed to serialize bundle. appId");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String E() {
        SQLiteException e;
        Cursor cursor;
        SQLiteDatabase l0 = l0();
        ?? r1 = 0;
        try {
            try {
                cursor = l0.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(0);
                        cursor.close();
                        return string;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    vh3 vh3Var = ((pj3) this.m).r;
                    pj3.m(vh3Var);
                    vh3Var.r.c(e, "Database error getting next bundle app id");
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                r1 = l0;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (r1 != 0) {
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    public final void F(long j) {
        v();
        x();
        try {
            if (l0().delete("queue", "rowid=?", new String[]{String.valueOf(j)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e) {
            vh3 vh3Var = ((pj3) this.m).r;
            pj3.m(vh3Var);
            vh3Var.r.c(e, "Failed to delete a bundle in a queue table");
            throw e;
        }
    }

    public final void G() {
        v();
        x();
        if (d0()) {
            oq3 oq3Var = this.n;
            long a = oq3Var.u.q.a();
            pj3 pj3Var = (pj3) this.m;
            pj3Var.w.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - a) > ((Long) ug3.M.a(null)).longValue()) {
                oq3Var.u.q.b(elapsedRealtime);
                v();
                x();
                if (d0()) {
                    SQLiteDatabase l0 = l0();
                    pj3Var.w.getClass();
                    int delete = l0.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) ug3.R.a(null)).longValue())});
                    if (delete > 0) {
                        vh3 vh3Var = pj3Var.r;
                        pj3.m(vh3Var);
                        vh3Var.z.c(Integer.valueOf(delete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void H(ArrayList arrayList) {
        pj3 pj3Var = (pj3) this.m;
        v();
        x();
        ll3.v(arrayList);
        if (arrayList.size() == 0) {
            lh.e("Given Integer is zero");
            return;
        }
        if (d0()) {
            String join = TextUtils.join(",", arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(sb2.length() + 80);
            sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb3.append(sb2);
            sb3.append(" AND retry_count =  2147483647 LIMIT 1");
            if (g0(sb3.toString(), null) > 0) {
                vh3 vh3Var = pj3Var.r;
                pj3.m(vh3Var);
                vh3Var.u.b("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase l0 = l0();
                StringBuilder sb4 = new StringBuilder(sb2.length() + 127);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(sb2);
                sb4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                l0.execSQL(sb4.toString());
            } catch (SQLiteException e) {
                vh3 vh3Var2 = pj3Var.r;
                pj3.m(vh3Var2);
                vh3Var2.r.c(e, "Error incrementing retry count. error");
            }
        }
    }

    public final void I(Long l) {
        pj3 pj3Var = (pj3) this.m;
        v();
        x();
        if (d0()) {
            StringBuilder sb = new StringBuilder(l.toString().length() + 86);
            sb.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb.append(l);
            sb.append(" AND retry_count =  2147483647 LIMIT 1");
            if (g0(sb.toString(), null) > 0) {
                vh3 vh3Var = pj3Var.r;
                pj3.m(vh3Var);
                vh3Var.u.b("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase l0 = l0();
                pj3Var.w.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                StringBuilder sb2 = new StringBuilder(String.valueOf(currentTimeMillis).length() + 60);
                sb2.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb2.append(currentTimeMillis);
                String sb3 = sb2.toString();
                StringBuilder sb4 = new StringBuilder(sb3.length() + 34 + l.toString().length() + 29);
                sb4.append("UPDATE upload_queue");
                sb4.append(sb3);
                sb4.append(" WHERE rowid = ");
                sb4.append(l);
                sb4.append(" AND retry_count < 2147483647");
                l0.execSQL(sb4.toString());
            } catch (SQLiteException e) {
                vh3 vh3Var2 = pj3Var.r;
                pj3.m(vh3Var2);
                vh3Var2.r.c(e, "Error incrementing retry count. error");
            }
        }
    }

    public final Object J(Cursor cursor, int i) {
        pj3 pj3Var = (pj3) this.m;
        int type = cursor.getType(i);
        if (type == 0) {
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.r.b("Loaded invalid null value from database");
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
            vh3 vh3Var2 = pj3Var.r;
            pj3.m(vh3Var2);
            vh3Var2.r.c(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        vh3 vh3Var3 = pj3Var.r;
        pj3.m(vh3Var3);
        vh3Var3.r.b("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(3:2|3|4)|(2:6|(3:8|9|10)(1:13))|14|15|(1:17)(2:20|21)|18|9|10) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a4, code lost:
    
        r13 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
    
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ac, code lost:
    
        r0 = r0.r;
        defpackage.pj3.m(r0);
        r0.r.e("Error inserting column. appId", defpackage.vh3.E(r14), "first_open_count", r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bc, code lost:
    
        r7 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long K(String str) {
        long j;
        long h0;
        pj3 pj3Var = (pj3) this.m;
        ll3.s(str);
        ll3.s("first_open_count");
        v();
        x();
        SQLiteDatabase l0 = l0();
        l0.beginTransaction();
        long j2 = 0;
        try {
            try {
                StringBuilder sb = new StringBuilder(48);
                sb.append("select first_open_count from app2 where app_id=?");
                j = -1;
                h0 = h0(sb.toString(), new String[]{str}, -1L);
            } catch (SQLiteException e) {
                e = e;
            }
            if (h0 == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("first_open_count", (Integer) 0);
                contentValues.put("previous_install_count", (Integer) 0);
                if (l0.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                    vh3 vh3Var = pj3Var.r;
                    pj3.m(vh3Var);
                    vh3Var.r.d(vh3.E(str), "first_open_count", "Failed to insert column (got -1). appId");
                    return j;
                }
                h0 = 0;
            }
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("app_id", str);
            contentValues2.put("first_open_count", Long.valueOf(1 + h0));
            if (l0.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                vh3 vh3Var2 = pj3Var.r;
                pj3.m(vh3Var2);
                vh3Var2.r.d(vh3.E(str), "first_open_count", "Failed to update column (got 0). appId");
            } else {
                l0.setTransactionSuccessful();
                j = h0;
            }
            return j;
        } finally {
            l0.endTransaction();
        }
    }

    public final boolean L(String str, String str2) {
        return g0("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final long M(String str) {
        ll3.s(str);
        return h0("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final void N(String str, Long l, long j, cj3 cj3Var) {
        v();
        x();
        ll3.v(cj3Var);
        ll3.s(str);
        pj3 pj3Var = (pj3) this.m;
        byte[] a = cj3Var.a();
        vh3 vh3Var = pj3Var.r;
        vh3 vh3Var2 = pj3Var.r;
        pj3.m(vh3Var);
        vh3Var.z.d(pj3Var.v.a(str), Integer.valueOf(a.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", a);
        try {
            if (l0().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                pj3.m(vh3Var2);
                vh3Var2.r.c(vh3.E(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e) {
            pj3.m(vh3Var2);
            vh3Var2.r.d(vh3.E(str), e, "Error storing complex main event. appId");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0298 A[Catch: SQLiteException -> 0x02b4, TRY_LEAVE, TryCatch #2 {SQLiteException -> 0x02b4, blocks: (B:78:0x027d, B:80:0x0298), top: B:77:0x027d }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(String str, Long l, String str2, Bundle bundle) {
        String string;
        String s2;
        Bundle bundle2;
        vh3 vh3Var;
        long update;
        sj3 sj3Var;
        Cursor query;
        tc3 tc3Var = this;
        String str3 = str;
        pj3 pj3Var = (pj3) tc3Var.m;
        ll3.v(bundle);
        tc3Var.v();
        tc3Var.x();
        i43 i43Var = l != null ? new i43(tc3Var, str3, l.longValue()) : new i43(tc3Var, str3);
        List<oc3> a = i43Var.a();
        while (!a.isEmpty()) {
            for (oc3 oc3Var : a) {
                if (!TextUtils.isEmpty(str2)) {
                    Cursor cursor = null;
                    sj3 sj3Var2 = null;
                    Cursor cursor2 = null;
                    try {
                        try {
                            query = tc3Var.l0().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, Long.toString(oc3Var.b)}, null, null, "rowid", "2");
                            try {
                                try {
                                } catch (SQLiteException e) {
                                    e = e;
                                    sj3Var = null;
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
                    } catch (SQLiteException e2) {
                        e = e2;
                        sj3Var = null;
                    }
                    if (query.moveToFirst()) {
                        try {
                            sj3Var = (sj3) ((qj3) bi3.j0(sj3.U(), query.getBlob(0))).d();
                            try {
                                if (query.moveToNext()) {
                                    vh3 vh3Var2 = pj3Var.r;
                                    pj3.m(vh3Var2);
                                    vh3Var2.u.c(vh3.E(str3), "Get multiple raw event metadata records, expected one. appId");
                                }
                                query.close();
                                query.close();
                            } catch (SQLiteException e3) {
                                e = e3;
                                cursor = query;
                                vh3 vh3Var3 = pj3Var.r;
                                pj3.m(vh3Var3);
                                vh3Var3.r.d(vh3.E(str3), e, "Data loss. Error selecting raw event. appId");
                                if (cursor != null) {
                                    cursor.close();
                                }
                                sj3Var2 = sj3Var;
                                if (sj3Var2 != null) {
                                }
                                oq3 oq3Var = tc3Var.n;
                                bi3 bi3Var = oq3Var.s;
                                oq3.U(bi3Var);
                                cj3 cj3Var = oc3Var.d;
                                Bundle bundle3 = new Bundle();
                                while (r6.hasNext()) {
                                }
                                string = bundle3.getString("_o");
                                bundle3.remove("_o");
                                s2 = cj3Var.s();
                                if (string == null) {
                                }
                                zq3 zq3Var = pj3Var.u;
                                vh3 vh3Var4 = pj3Var.r;
                                pj3.k(zq3Var);
                                if (s2.equals(Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN)) {
                                }
                                cj3 cj3Var2 = cj3Var;
                                zq3Var.H(bundle3, bundle2);
                                fd3 fd3Var = new fd3((pj3) tc3Var.m, string, str3, cj3Var2.s(), cj3Var2.u(), cj3Var2.w(), bundle3);
                                long j = oc3Var.a;
                                long j2 = oc3Var.b;
                                boolean z2 = oc3Var.c;
                                tc3Var.v();
                                tc3Var.x();
                                String str4 = fd3Var.a;
                                ll3.s(str4);
                                bi3 bi3Var2 = oq3Var.s;
                                oq3.U(bi3Var2);
                                byte[] a2 = bi3Var2.Y(fd3Var).a();
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("app_id", str4);
                                contentValues.put("name", fd3Var.b);
                                contentValues.put(SDKConstants.PARAM_DEBUG_MESSAGE_TIMESTAMP, Long.valueOf(fd3Var.d));
                                contentValues.put("metadata_fingerprint", Long.valueOf(j2));
                                contentValues.put("data", a2);
                                contentValues.put("realtime", Integer.valueOf(z2 ? 1 : 0));
                                update = l0().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j)});
                                if (update != 1) {
                                }
                                tc3Var = this;
                                str3 = str;
                            }
                            sj3Var2 = sj3Var;
                        } catch (IOException e4) {
                            vh3 vh3Var5 = pj3Var.r;
                            pj3.m(vh3Var5);
                            vh3Var5.r.d(vh3.E(str3), e4, "Data loss. Failed to merge raw event metadata. appId");
                        }
                        if (sj3Var2 != null) {
                            Iterator it = sj3Var2.U1().iterator();
                            while (it.hasNext()) {
                                if (((ek3) it.next()).r().equals(str2)) {
                                    break;
                                }
                            }
                        }
                    } else {
                        vh3 vh3Var6 = pj3Var.r;
                        pj3.m(vh3Var6);
                        vh3Var6.r.c(vh3.E(str3), "Raw event metadata record is missing. appId");
                    }
                    query.close();
                    if (sj3Var2 != null) {
                    }
                }
                oq3 oq3Var2 = tc3Var.n;
                bi3 bi3Var3 = oq3Var2.s;
                oq3.U(bi3Var3);
                cj3 cj3Var3 = oc3Var.d;
                Bundle bundle32 = new Bundle();
                for (hj3 hj3Var : cj3Var3.p()) {
                    if (hj3Var.x()) {
                        bundle32.putDouble(hj3Var.q(), hj3Var.y());
                    } else if (hj3Var.v()) {
                        bundle32.putFloat(hj3Var.q(), hj3Var.w());
                    } else if (hj3Var.t()) {
                        bundle32.putLong(hj3Var.q(), hj3Var.u());
                    } else if (hj3Var.r()) {
                        bundle32.putString(hj3Var.q(), hj3Var.s());
                    } else if (hj3Var.z().isEmpty()) {
                        vh3 vh3Var7 = ((pj3) bi3Var3.m).r;
                        pj3.m(vh3Var7);
                        vh3Var7.r.c(hj3Var, "Unexpected parameter type for parameter");
                    } else {
                        bundle32.putParcelableArray(hj3Var.q(), bi3.l0((rn3) hj3Var.z()));
                    }
                }
                string = bundle32.getString("_o");
                bundle32.remove("_o");
                s2 = cj3Var3.s();
                if (string == null) {
                    string = BuildConfig.FLAVOR;
                }
                zq3 zq3Var2 = pj3Var.u;
                vh3 vh3Var42 = pj3Var.r;
                pj3.k(zq3Var2);
                if (s2.equals(Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN)) {
                    bundle2 = bundle;
                } else {
                    bundle2 = new Bundle(bundle);
                    for (String str5 : bundle.keySet()) {
                        cj3 cj3Var4 = cj3Var3;
                        if (str5.startsWith("gad_")) {
                            bundle2.remove(str5);
                        }
                        cj3Var3 = cj3Var4;
                    }
                }
                cj3 cj3Var22 = cj3Var3;
                zq3Var2.H(bundle32, bundle2);
                fd3 fd3Var2 = new fd3((pj3) tc3Var.m, string, str3, cj3Var22.s(), cj3Var22.u(), cj3Var22.w(), bundle32);
                long j3 = oc3Var.a;
                long j22 = oc3Var.b;
                boolean z22 = oc3Var.c;
                tc3Var.v();
                tc3Var.x();
                String str42 = fd3Var2.a;
                ll3.s(str42);
                bi3 bi3Var22 = oq3Var2.s;
                oq3.U(bi3Var22);
                byte[] a22 = bi3Var22.Y(fd3Var2).a();
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str42);
                contentValues2.put("name", fd3Var2.b);
                contentValues2.put(SDKConstants.PARAM_DEBUG_MESSAGE_TIMESTAMP, Long.valueOf(fd3Var2.d));
                contentValues2.put("metadata_fingerprint", Long.valueOf(j22));
                contentValues2.put("data", a22);
                contentValues2.put("realtime", Integer.valueOf(z22 ? 1 : 0));
                try {
                    update = l0().update("raw_events", contentValues2, "rowid = ?", new String[]{String.valueOf(j3)});
                    if (update != 1) {
                        pj3.m(vh3Var42);
                        vh3Var = vh3Var42;
                        try {
                            vh3Var.r.d(vh3.E(str42), Long.valueOf(update), "Failed to update raw event. appId, updatedRows");
                        } catch (SQLiteException e5) {
                            e = e5;
                            pj3.m(vh3Var);
                            vh3Var.r.d(vh3.E(str42), e, "Error updating raw event. appId");
                            tc3Var = this;
                            str3 = str;
                        }
                    }
                } catch (SQLiteException e6) {
                    e = e6;
                    vh3Var = vh3Var42;
                }
                tc3Var = this;
                str3 = str;
            }
            a = i43Var.a();
            tc3Var = this;
            str3 = str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r3 == 0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Type inference failed for: r3v0, types: [rp3, tc3, vp3] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xk3 P(String str) {
        Throwable th;
        SQLiteException e;
        pj3 pj3Var = (pj3) this.m;
        ll3.v(str);
        v();
        x();
        Cursor cursor = null;
        r2 = null;
        r2 = null;
        xk3 xk3Var = null;
        try {
            try {
                this = l0().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str});
                try {
                    if (this.moveToFirst()) {
                        xk3Var = xk3.c(this.getInt(1), this.getString(0));
                    } else {
                        vh3 vh3Var = pj3Var.r;
                        pj3.m(vh3Var);
                        vh3Var.z.b("No data found");
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    vh3 vh3Var2 = pj3Var.r;
                    pj3.m(vh3Var2);
                    vh3Var2.r.c(e, "Error querying database.");
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = this;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            this = 0;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
            }
            throw th;
        }
        this.close();
        return xk3Var == null ? xk3.c : xk3Var;
    }

    public final void Q(String str, ip3 ip3Var) {
        v();
        x();
        ll3.s(str);
        pj3 pj3Var = (pj3) this.m;
        qb2 qb2Var = pj3Var.w;
        vh3 vh3Var = pj3Var.r;
        qb2Var.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        tg3 tg3Var = ug3.v0;
        long longValue = currentTimeMillis - ((Long) tg3Var.a(null)).longValue();
        long j = ip3Var.n;
        if (j < longValue || j > ((Long) tg3Var.a(null)).longValue() + currentTimeMillis) {
            pj3.m(vh3Var);
            vh3Var.u.e("Storing trigger URI outside of the max retention time span. appId, now, timestamp", vh3.E(str), Long.valueOf(currentTimeMillis), Long.valueOf(j));
        }
        pj3.m(vh3Var);
        vh3Var.z.b("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", ip3Var.m);
        contentValues.put("source", Integer.valueOf(ip3Var.o));
        contentValues.put("timestamp_millis", Long.valueOf(j));
        try {
            if (l0().insert("trigger_uris", null, contentValues) == -1) {
                pj3.m(vh3Var);
                vh3Var.r.c(vh3.E(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e) {
            pj3.m(vh3Var);
            vh3Var.r.d(vh3.E(str), e, "Error storing trigger URI. appId");
        }
    }

    public final void R(String str, xk3 xk3Var) {
        ll3.v(str);
        ll3.v(xk3Var);
        v();
        x();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", xk3Var.g());
        contentValues.put("consent_source", Integer.valueOf(xk3Var.b));
        T(contentValues);
    }

    public final String S(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                cursor = l0().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return BuildConfig.FLAVOR;
                }
                String string = cursor.getString(0);
                cursor.close();
                return string;
            } catch (SQLiteException e) {
                vh3 vh3Var = ((pj3) this.m).r;
                pj3.m(vh3Var);
                vh3Var.r.d(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void T(ContentValues contentValues) {
        pj3 pj3Var = (pj3) this.m;
        try {
            SQLiteDatabase l0 = l0();
            if (contentValues.getAsString("app_id") == null) {
                vh3 vh3Var = pj3Var.r;
                pj3.m(vh3Var);
                vh3Var.t.c(vh3.E("app_id"), "Value of the primary key is not set.");
                return;
            }
            new StringBuilder(10).append("app_id = ?");
            if (l0.update("consent_settings", contentValues, r5.toString(), new String[]{r4}) == 0 && l0.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                vh3 vh3Var2 = pj3Var.r;
                pj3.m(vh3Var2);
                vh3Var2.r.d(vh3.E("consent_settings"), vh3.E("app_id"), "Failed to insert/update table (got -1). key");
            }
        } catch (SQLiteException e) {
            vh3 vh3Var3 = pj3Var.r;
            pj3.m(vh3Var3);
            vh3Var3.r.e("Error storing into table. key", vh3.E("consent_settings"), vh3.E("app_id"), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0123  */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final gd3 U(String str, String str2, String str3) {
        Cursor cursor;
        Boolean bool;
        pj3 pj3Var = (pj3) this.m;
        ll3.s(str2);
        ll3.s(str3);
        v();
        x();
        ArrayList arrayList = new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count"));
        ?? r3 = 0;
        try {
            try {
                cursor = l0().query(str, (String[]) arrayList.toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
                try {
                } catch (SQLiteException e) {
                    e = e;
                    vh3 vh3Var = pj3Var.r;
                    pj3.m(vh3Var);
                    vh3Var.r.e("Error querying events. appId", vh3.E(str2), pj3Var.v.a(str3), e);
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                r3 = arrayList;
                if (r3 != 0) {
                    r3.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (r3 != 0) {
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
        long j2 = cursor.getLong(1);
        long j3 = cursor.getLong(2);
        long j4 = 0;
        long j5 = cursor.isNull(3) ? 0L : cursor.getLong(3);
        Long valueOf = cursor.isNull(4) ? null : Long.valueOf(cursor.getLong(4));
        Long valueOf2 = cursor.isNull(5) ? null : Long.valueOf(cursor.getLong(5));
        Long valueOf3 = cursor.isNull(6) ? null : Long.valueOf(cursor.getLong(6));
        if (cursor.isNull(7)) {
            bool = null;
        } else {
            bool = Boolean.valueOf(cursor.getLong(7) == 1);
        }
        if (!cursor.isNull(8)) {
            j4 = cursor.getLong(8);
        }
        gd3 gd3Var = new gd3(str2, str3, j, j2, j4, j3, j5, valueOf, valueOf2, valueOf3, bool);
        if (cursor.moveToNext()) {
            vh3 vh3Var2 = pj3Var.r;
            pj3.m(vh3Var2);
            vh3Var2.r.c(vh3.E(str2), "Got multiple records for event aggregates, expected one. appId");
        }
        cursor.close();
        return gd3Var;
    }

    public final void V(String str, gd3 gd3Var) {
        pj3 pj3Var = (pj3) this.m;
        ll3.v(gd3Var);
        v();
        x();
        ContentValues contentValues = new ContentValues();
        String str2 = gd3Var.a;
        contentValues.put("app_id", str2);
        contentValues.put("name", gd3Var.b);
        contentValues.put("lifetime_count", Long.valueOf(gd3Var.c));
        contentValues.put("current_bundle_count", Long.valueOf(gd3Var.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(gd3Var.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(gd3Var.g));
        contentValues.put("last_bundled_day", gd3Var.h);
        contentValues.put("last_sampled_complex_event_id", gd3Var.i);
        contentValues.put("last_sampling_rate", gd3Var.j);
        contentValues.put("current_session_count", Long.valueOf(gd3Var.e));
        Boolean bool = gd3Var.k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (l0().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                vh3 vh3Var = pj3Var.r;
                pj3.m(vh3Var);
                vh3Var.r.c(vh3.E(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e) {
            vh3 vh3Var2 = pj3Var.r;
            pj3.m(vh3Var2);
            vh3Var2.r.d(vh3.E(str2), e, "Error storing event aggregates. appId");
        }
    }

    public final void W(String str, String str2) {
        ll3.s(str2);
        v();
        x();
        try {
            l0().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            vh3 vh3Var = ((pj3) this.m).r;
            pj3.m(vh3Var);
            vh3Var.r.d(vh3.E(str2), e, "Error deleting snapshot. appId");
        }
    }

    public final rq3 X(String str, long j, byte[] bArr, String str2, String str3, int i, int i2, long j2, long j3, long j4) {
        sm3 sm3Var;
        pj3 pj3Var = (pj3) this.m;
        if (TextUtils.isEmpty(str2)) {
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.y.b("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            mj3 mj3Var = (mj3) bi3.j0(oj3.w(), bArr);
            sm3[] values = sm3.values();
            int length = values.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    sm3Var = sm3.UNKNOWN;
                    break;
                }
                sm3Var = values[i3];
                if (sm3Var.m == i) {
                    break;
                }
                i3++;
            }
            if (sm3Var != sm3.GOOGLE_SIGNAL && sm3Var != sm3.GOOGLE_SIGNAL_PENDING && i2 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Collections.unmodifiableList(((oj3) mj3Var.n).p()).iterator();
                while (it.hasNext()) {
                    qj3 qj3Var = (qj3) ((sj3) it.next()).i();
                    qj3Var.b();
                    ((sj3) qj3Var.n).T0(i2);
                    arrayList.add((sj3) qj3Var.d());
                }
                mj3Var.b();
                ((oj3) mj3Var.n).B();
                mj3Var.b();
                ((oj3) mj3Var.n).A(arrayList);
            }
            HashMap hashMap = new HashMap();
            if (str3 != null) {
                String[] split = str3.split("\r\n");
                int length2 = split.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        break;
                    }
                    String str4 = split[i4];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] split2 = str4.split("=", 2);
                    if (split2.length != 2) {
                        vh3 vh3Var2 = pj3Var.r;
                        pj3.m(vh3Var2);
                        vh3Var2.r.c(str4, "Invalid upload header: ");
                        break;
                    }
                    hashMap.put(split2[0], split2[1]);
                    i4++;
                }
            }
            return new rq3(j, (oj3) mj3Var.d(), str2, hashMap, sm3Var, j2, j3, j4, i2);
        } catch (IOException e) {
            vh3 vh3Var3 = pj3Var.r;
            pj3.m(vh3Var3);
            vh3Var3.r.d(str, e, "Failed to queued MeasurementBatch from upload_queue. appId");
            return null;
        }
    }

    public final String Y() {
        ((pj3) this.m).w.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        Long l = (Long) ug3.S.a(null);
        l.getClass();
        String str = "(upload_type = 1 AND ABS(creation_timestamp - " + currentTimeMillis + ") > " + l + ")";
        String str2 = "(upload_type != 1 AND ABS(creation_timestamp - " + currentTimeMillis + ") > " + ((Long) ug3.R.a(null)).longValue() + ")";
        StringBuilder sb = new StringBuilder(str.length() + 5 + str2.length() + 1);
        sb.append("(");
        sb.append(str);
        sb.append(" OR ");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final void a0(String str, xk3 xk3Var) {
        ll3.v(str);
        v();
        x();
        R(str, P(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", xk3Var.g());
        T(contentValues);
    }

    public final xk3 b0(String str) {
        ll3.v(str);
        v();
        x();
        return xk3.c(100, S("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    public final gd3 c0(String str, cj3 cj3Var, String str2) {
        gd3 U = U("events", str, cj3Var.s());
        if (U != null) {
            long j = U.e + 1;
            long j2 = U.d + 1;
            return new gd3(U.a, U.b, U.c + 1, j2, j, U.f, U.g, U.h, U.i, U.j, U.k);
        }
        pj3 pj3Var = (pj3) this.m;
        vh3 vh3Var = pj3Var.r;
        pj3.m(vh3Var);
        vh3Var.u.d(vh3.E(str), pj3Var.v.a(str2), "Event aggregate wasn't created during raw event logging. appId, event");
        return new gd3(str, cj3Var.s(), 1L, 1L, 1L, cj3Var.u(), 0L, null, null, null, null);
    }

    public final boolean d0() {
        return ((pj3) this.m).m.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e0(String str, long j, long j2, ni3 ni3Var) {
        String str2;
        String str3;
        Cursor cursor;
        SQLiteDatabase l0;
        ?? isEmpty;
        String str4;
        String[] strArr;
        String string;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String str5;
        long j3;
        pj3 pj3Var = (pj3) this.m;
        v();
        x();
        Cursor cursor2 = null;
        cursor2 = null;
        SQLiteCursor sQLiteCursor = 0;
        try {
            try {
                l0 = l0();
                isEmpty = TextUtils.isEmpty(str);
                str4 = BuildConfig.FLAVOR;
            } catch (Throwable th) {
                th = th;
            }
        } catch (SQLiteException e) {
            e = e;
            str2 = str;
        }
        try {
            if (isEmpty != 0) {
                String[] strArr5 = j2 != -1 ? new String[]{String.valueOf(j2), String.valueOf(j)} : new String[]{String.valueOf(j)};
                if (j2 != -1) {
                    str4 = "rowid <= ? and ";
                }
                StringBuilder sb = new StringBuilder(str4.length() + 148);
                sb.append("select app_id, metadata_fingerprint from raw_events where ");
                sb.append(str4);
                sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                cursor = l0.rawQuery(sb.toString(), strArr5);
                try {
                } catch (SQLiteException e2) {
                    e = e2;
                    str3 = str;
                }
                if (!cursor.moveToFirst()) {
                    if (cursor == null) {
                        cursor.close();
                        return;
                    }
                    return;
                }
                str3 = cursor.getString(0);
                try {
                    string = cursor.getString(1);
                    cursor.close();
                } catch (SQLiteException e3) {
                    e = e3;
                    cursor2 = cursor;
                    vh3 vh3Var = pj3Var.r;
                    pj3.m(vh3Var);
                    vh3Var.r.d(vh3.E(str3), e, "Data loss. Error selecting raw event. appId");
                    cursor = cursor2;
                    if (cursor == null) {
                    }
                }
            } else {
                try {
                    if (j2 != -1) {
                        String str6 = str;
                        strArr = new String[]{str6, String.valueOf(j2)};
                        isEmpty = str6;
                    } else {
                        String str7 = str;
                        strArr = new String[]{str7};
                        isEmpty = str7;
                    }
                    if (j2 != -1) {
                        str4 = " and rowid <= ?";
                    }
                    StringBuilder sb2 = new StringBuilder(str4.length() + 84);
                    sb2.append("select metadata_fingerprint from raw_events where app_id = ?");
                    sb2.append(str4);
                    sb2.append(" order by rowid limit 1;");
                    cursor = l0.rawQuery(sb2.toString(), strArr);
                } catch (SQLiteException e4) {
                    e = e4;
                    str2 = isEmpty;
                }
                try {
                } catch (SQLiteException e5) {
                    e = e5;
                    cursor2 = cursor;
                    str2 = isEmpty;
                    str3 = str2;
                    vh3 vh3Var2 = pj3Var.r;
                    pj3.m(vh3Var2);
                    vh3Var2.r.d(vh3.E(str3), e, "Data loss. Error selecting raw event. appId");
                    cursor = cursor2;
                    if (cursor == null) {
                    }
                }
                if (cursor.moveToFirst()) {
                    string = cursor.getString(0);
                    cursor.close();
                    str3 = isEmpty;
                } else if (cursor == null) {
                }
            }
            cursor = l0.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, string}, null, null, "rowid", "2");
            if (cursor.moveToFirst()) {
                try {
                    sj3 sj3Var = (sj3) ((qj3) bi3.j0(sj3.U(), cursor.getBlob(0))).d();
                    if (cursor.moveToNext()) {
                        vh3 vh3Var3 = pj3Var.r;
                        pj3.m(vh3Var3);
                        vh3Var3.u.c(vh3.E(str3), "Get multiple raw event metadata records, expected one. appId");
                    }
                    cursor.close();
                    ni3Var.b = sj3Var;
                    if (pj3Var.p.G(null, ug3.k1)) {
                        long h0 = h0("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{str3, string}, -1L);
                        if (j2 != -1) {
                            j3 = j2;
                        } else if (h0 != -1) {
                            j3 = -1;
                        } else {
                            strArr2 = new String[]{str3, string};
                            strArr4 = strArr2;
                            str5 = "app_id = ? and metadata_fingerprint = ?";
                        }
                        if (j3 != -1 && h0 != -1) {
                            h0 = Math.min(j3, h0);
                        } else if (j3 != -1) {
                            h0 = j3;
                        }
                        strArr3 = new String[]{str3, string, String.valueOf(h0)};
                        strArr4 = strArr3;
                        str5 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                    } else if (j2 != -1) {
                        strArr3 = new String[]{str3, string, String.valueOf(j2)};
                        strArr4 = strArr3;
                        str5 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                    } else {
                        strArr2 = new String[]{str3, string};
                        strArr4 = strArr2;
                        str5 = "app_id = ? and metadata_fingerprint = ?";
                    }
                    cursor2 = l0.query("raw_events", new String[]{"rowid", "name", SDKConstants.PARAM_DEBUG_MESSAGE_TIMESTAMP, "data"}, str5, strArr4, null, null, "rowid", null);
                    try {
                        if (cursor2.moveToFirst()) {
                            do {
                                long j4 = cursor2.getLong(0);
                                try {
                                    bj3 bj3Var = (bj3) bi3.j0(cj3.z(), cursor2.getBlob(3));
                                    String string2 = cursor2.getString(1);
                                    bj3Var.b();
                                    ((cj3) bj3Var.n).F(string2);
                                    long j5 = cursor2.getLong(2);
                                    bj3Var.b();
                                    ((cj3) bj3Var.n).G(j5);
                                    if (!ni3Var.a(j4, (cj3) bj3Var.d())) {
                                        break;
                                    }
                                } catch (IOException e6) {
                                    vh3 vh3Var4 = pj3Var.r;
                                    pj3.m(vh3Var4);
                                    vh3Var4.r.d(vh3.E(str3), e6, "Data loss. Failed to merge raw event. appId");
                                }
                            } while (cursor2.moveToNext());
                        } else {
                            vh3 vh3Var5 = pj3Var.r;
                            pj3.m(vh3Var5);
                            vh3Var5.u.c(vh3.E(str3), "Raw event data disappeared while in transaction. appId");
                        }
                    } catch (SQLiteException e7) {
                        e = e7;
                        vh3 vh3Var22 = pj3Var.r;
                        pj3.m(vh3Var22);
                        vh3Var22.r.d(vh3.E(str3), e, "Data loss. Error selecting raw event. appId");
                        cursor = cursor2;
                        if (cursor == null) {
                        }
                    }
                    cursor = cursor2;
                } catch (IOException e8) {
                    vh3 vh3Var6 = pj3Var.r;
                    pj3.m(vh3Var6);
                    vh3Var6.r.d(vh3.E(str3), e8, "Data loss. Failed to merge raw event metadata. appId");
                }
            } else {
                vh3 vh3Var7 = pj3Var.r;
                pj3.m(vh3Var7);
                vh3Var7.r.c(vh3.E(str3), "Raw event metadata record is missing. appId");
            }
            if (cursor == null) {
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteCursor = " order by rowid limit 1;";
            if (sQLiteCursor != 0) {
                sQLiteCursor.close();
            }
            throw th;
        }
    }

    public final long g0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = l0().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = rawQuery.getLong(0);
                rawQuery.close();
                return j;
            } catch (SQLiteException e) {
                vh3 vh3Var = ((pj3) this.m).r;
                pj3.m(vh3Var);
                vh3Var.r.d(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long h0(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            try {
                cursor = l0().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    j = cursor.getLong(0);
                }
                cursor.close();
                return j;
            } catch (SQLiteException e) {
                vh3 vh3Var = ((pj3) this.m).r;
                pj3.m(vh3Var);
                vh3Var.r.d(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void i0() {
        x();
        l0().beginTransaction();
    }

    public final void j0() {
        x();
        l0().setTransactionSuccessful();
    }

    public final void k0() {
        x();
        l0().endTransaction();
    }

    public final SQLiteDatabase l0() {
        v();
        try {
            return this.p.getWritableDatabase();
        } catch (SQLiteException e) {
            vh3 vh3Var = ((pj3) this.m).r;
            pj3.m(vh3Var);
            vh3Var.u.c(e, "Error opening database");
            throw e;
        }
    }

    public final void m0(String str) {
        gd3 U;
        W("events_snapshot", str);
        Cursor cursor = null;
        try {
            try {
                cursor = l0().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        if (string != null && (U = U("events", str, string)) != null) {
                            V("events_snapshot", U);
                        }
                    } while (cursor.moveToNext());
                }
            } catch (SQLiteException e) {
                vh3 vh3Var = ((pj3) this.m).r;
                pj3.m(vh3Var);
                vh3Var.r.d(vh3.E(str), e, "Error creating snapshot. appId");
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
    
        V("events", r8);
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
    public final void n0(String str) {
        boolean z2;
        gd3 U;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        gd3 U2 = U("events", str, "_f");
        gd3 U3 = U("events", str, "_v");
        W("events", str);
        Cursor cursor = null;
        boolean z3 = false;
        try {
            cursor = l0().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
        } catch (SQLiteException e) {
            e = e;
            z2 = false;
        } catch (Throwable th) {
            th = th;
            z2 = false;
        }
        if (!cursor.moveToFirst()) {
            cursor.close();
            if (U2 == null) {
            }
            V("events", U2);
            W("events_snapshot", str);
        }
        boolean z4 = false;
        z2 = false;
        do {
            try {
                String string = cursor.getString(0);
                if (cursor.getLong(1) >= 1) {
                    if ("_f".equals(string)) {
                        z4 = true;
                    } else if ("_v".equals(string)) {
                        z2 = true;
                    }
                }
                if (string != null && (U = U("events_snapshot", str, string)) != null) {
                    V("events", U);
                }
            } catch (SQLiteException e2) {
                e = e2;
                z3 = z4;
                try {
                    vh3 vh3Var = ((pj3) this.m).r;
                    pj3.m(vh3Var);
                    vh3Var.r.d(vh3.E(str), e, "Error querying snapshot. appId");
                    z4 = z3;
                    if (cursor != null) {
                    }
                    if (!z4) {
                    }
                    if (!z2) {
                    }
                    W("events_snapshot", str);
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (z3 && U2 != null) {
                        V("events", U2);
                    } else if (!z2 && U3 != null) {
                        V("events", U3);
                    }
                    W("events_snapshot", str);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                z3 = z4;
                if (cursor != null) {
                }
                if (z3) {
                }
                if (!z2) {
                    V("events", U3);
                }
                W("events_snapshot", str);
                throw th;
            }
        } while (cursor.moveToNext());
        if (cursor != null) {
            cursor.close();
        }
        if (!z4 || U2 == null) {
            if (!z2) {
            }
            W("events_snapshot", str);
        }
        V("events", U2);
        W("events_snapshot", str);
    }

    public final void o0(String str, String str2) {
        ll3.s(str);
        ll3.s(str2);
        v();
        x();
        try {
            l0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            pj3 pj3Var = (pj3) this.m;
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.r.e("Error deleting user property. appId", vh3.E(str), pj3Var.v.c(str2), e);
        }
    }

    public final boolean p0(vq3 vq3Var) {
        pj3 pj3Var = (pj3) this.m;
        String str = vq3Var.b;
        v();
        x();
        String str2 = vq3Var.a;
        String str3 = vq3Var.c;
        if (q0(str2, str3) == null) {
            if (zq3.v0(str3)) {
                if (g0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(pj3Var.p.E(str2, ug3.V), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long g0 = g0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                pj3Var.getClass();
                if (g0 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str2);
        contentValues.put(FirebaseAnalytics.Param.ORIGIN, str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(vq3Var.d));
        f0(contentValues, vq3Var.e);
        try {
            if (l0().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.r.c(vh3.E(str2), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e) {
            vh3 vh3Var2 = pj3Var.r;
            pj3.m(vh3Var2);
            vh3Var2.r.d(vh3.E(str2), e, "Error storing user property. appId");
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vq3 q0(String str, String str2) {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursor;
        pj3 pj3Var = (pj3) this.m;
        ll3.s(str);
        ll3.s(str2);
        v();
        x();
        Cursor cursor2 = null;
        try {
            cursor = l0().query("user_attributes", new String[]{"set_timestamp", "value", FirebaseAnalytics.Param.ORIGIN}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursor.moveToFirst()) {
                        long j = cursor.getLong(0);
                        Object J = J(cursor, 1);
                        if (J != null) {
                            str3 = str;
                            str4 = str2;
                            try {
                                vq3 vq3Var = new vq3(str3, cursor.getString(2), str4, j, J);
                                if (cursor.moveToNext()) {
                                    vh3 vh3Var = pj3Var.r;
                                    pj3.m(vh3Var);
                                    vh3Var.r.c(vh3.E(str3), "Got multiple records for user property, expected one. appId");
                                }
                                cursor.close();
                                return vq3Var;
                            } catch (SQLiteException e) {
                                e = e;
                                sQLiteException = e;
                                vh3 vh3Var2 = pj3Var.r;
                                pj3.m(vh3Var2);
                                vh3Var2.r.e("Error querying user property. appId", vh3.E(str3), pj3Var.v.c(str4), sQLiteException);
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
            } catch (SQLiteException e2) {
                e = e2;
                str3 = str;
                str4 = str2;
            }
        } catch (SQLiteException e3) {
            str3 = str;
            str4 = str2;
            sQLiteException = e3;
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
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List r0(String str) {
        String str2;
        SQLiteException sQLiteException;
        pj3 pj3Var = (pj3) this.m;
        ll3.s(str);
        v();
        x();
        ?? arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                pj3Var.getClass();
                cursor = l0().query("user_attributes", new String[]{"name", FirebaseAnalytics.Param.ORIGIN, "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (cursor.moveToFirst()) {
                    while (true) {
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        if (string2 == null) {
                            string2 = BuildConfig.FLAVOR;
                        }
                        String str3 = string2;
                        long j = cursor.getLong(2);
                        Object J = J(cursor, 3);
                        if (J == null) {
                            try {
                                vh3 vh3Var = pj3Var.r;
                                pj3.m(vh3Var);
                                vh3Var.r.c(vh3.E(str), "Read invalid user property value, ignoring it. appId");
                                str2 = str;
                            } catch (SQLiteException e) {
                                sQLiteException = e;
                                str2 = str;
                                vh3 vh3Var2 = pj3Var.r;
                                pj3.m(vh3Var2);
                                vh3Var2.r.d(vh3.E(str2), sQLiteException, "Error querying user properties. appId");
                                arrayList = Collections.EMPTY_LIST;
                                if (cursor != null) {
                                }
                                return arrayList;
                            }
                        } else {
                            str2 = str;
                            try {
                                arrayList.add(new vq3(str2, str3, string, j, J));
                            } catch (SQLiteException e2) {
                                e = e2;
                                sQLiteException = e;
                                vh3 vh3Var22 = pj3Var.r;
                                pj3.m(vh3Var22);
                                vh3Var22.r.d(vh3.E(str2), sQLiteException, "Error querying user properties. appId");
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
            } finally {
            }
        } catch (SQLiteException e3) {
            e = e3;
            str2 = str;
        }
        if (cursor != null) {
            cursor.close();
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b1, code lost:
    
        defpackage.pj3.m(r13);
        r13.r.c(1000, "Read more than the max allowed user properties, ignoring excess");
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
    public final List s0(String str, String str2, String str3) {
        Cursor cursor;
        String str4;
        Cursor cursor2;
        String str5;
        pj3 pj3Var = (pj3) this.m;
        ll3.s(str);
        v();
        x();
        ?? arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = new ArrayList(3);
            String str6 = str;
            arrayList2.add(str6);
            StringBuilder sb = new StringBuilder("app_id=?");
            if (!TextUtils.isEmpty(str2)) {
                arrayList2.add(str2);
                sb.append(" and origin=?");
            }
            if (!TextUtils.isEmpty(str3)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1);
                sb2.append(str3);
                sb2.append("*");
                arrayList2.add(sb2.toString());
                sb.append(" and name glob ?");
            }
            String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            SQLiteDatabase l0 = l0();
            String[] strArr2 = {"name", "set_timestamp", "value", FirebaseAnalytics.Param.ORIGIN};
            String sb3 = sb.toString();
            pj3Var.getClass();
            vh3 vh3Var = pj3Var.r;
            cursor2 = l0.query("user_attributes", strArr2, sb3, strArr, null, null, "rowid", "1001");
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
                                Object J = J(cursor2, 2);
                                String string2 = cursor2.getString(3);
                                if (J == null) {
                                    try {
                                        pj3.m(vh3Var);
                                        vh3Var.r.e("(2)Read invalid user property value, ignoring it", vh3.E(str6), string2, str3);
                                        str5 = string2;
                                    } catch (SQLiteException e) {
                                        e = e;
                                        str5 = string2;
                                        cursor = cursor2;
                                        str4 = str5;
                                        try {
                                            vh3 vh3Var2 = pj3Var.r;
                                            pj3.m(vh3Var2);
                                            vh3Var2.r.e("(2)Error querying user properties", vh3.E(str), str4, e);
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
                                        arrayList.add(new vq3(str, str5, string, j, J));
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        cursor = cursor2;
                                        str4 = str5;
                                        vh3 vh3Var22 = pj3Var.r;
                                        pj3.m(vh3Var22);
                                        vh3Var22.r.e("(2)Error querying user properties", vh3.E(str), str4, e);
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
                            } catch (SQLiteException e3) {
                                e = e3;
                                cursor = cursor2;
                                vh3 vh3Var222 = pj3Var.r;
                                pj3.m(vh3Var222);
                                vh3Var222.r.e("(2)Error querying user properties", vh3.E(str), str4, e);
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
            } catch (SQLiteException e4) {
                e = e4;
                str4 = str2;
            }
        } catch (SQLiteException e5) {
            e = e5;
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

    public final boolean t0(yb3 yb3Var) {
        pj3 pj3Var = (pj3) this.m;
        v();
        x();
        String str = yb3Var.m;
        ll3.v(str);
        if (q0(str, yb3Var.o.n) == null) {
            long g0 = g0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            pj3Var.getClass();
            if (g0 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put(FirebaseAnalytics.Param.ORIGIN, yb3Var.n);
        contentValues.put("name", yb3Var.o.n);
        Object a = yb3Var.o.a();
        ll3.v(a);
        f0(contentValues, a);
        contentValues.put("active", Boolean.valueOf(yb3Var.q));
        contentValues.put("trigger_event_name", yb3Var.r);
        contentValues.put("trigger_timeout", Long.valueOf(yb3Var.t));
        kd3 kd3Var = yb3Var.s;
        zq3 zq3Var = pj3Var.u;
        vh3 vh3Var = pj3Var.r;
        pj3.k(zq3Var);
        contentValues.put("timed_out_event", zq3.b0(kd3Var));
        contentValues.put("creation_timestamp", Long.valueOf(yb3Var.p));
        pj3.k(zq3Var);
        contentValues.put("triggered_event", zq3.b0(yb3Var.u));
        contentValues.put("triggered_timestamp", Long.valueOf(yb3Var.o.o));
        contentValues.put("time_to_live", Long.valueOf(yb3Var.v));
        contentValues.put("expired_event", zq3.b0(yb3Var.w));
        try {
            if (l0().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            pj3.m(vh3Var);
            vh3Var.r.c(vh3.E(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e) {
            pj3.m(vh3Var);
            vh3Var.r.d(vh3.E(str), e, "Error storing conditional user property");
            return true;
        }
    }

    /* JADX WARN: Not initialized variable reg: 8, insn: 0x00f0: MOVE (r7 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:241), block:B:37:0x00f0 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yb3 u0(String str, String str2) {
        String str3;
        Cursor cursor;
        Cursor cursor2;
        pj3 pj3Var = (pj3) this.m;
        ll3.s(str);
        ll3.s(str2);
        v();
        x();
        Cursor cursor3 = null;
        try {
            try {
                cursor = l0().query("conditional_properties", new String[]{FirebaseAnalytics.Param.ORIGIN, "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                } catch (SQLiteException e) {
                    e = e;
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
        } catch (SQLiteException e2) {
            e = e2;
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
            string = BuildConfig.FLAVOR;
        }
        String str4 = string;
        Object J = J(cursor, 1);
        boolean z2 = cursor.getInt(2) != 0;
        String string2 = cursor.getString(3);
        long j = cursor.getLong(4);
        bi3 bi3Var = this.n.s;
        oq3.U(bi3Var);
        byte[] blob = cursor.getBlob(5);
        Parcelable.Creator<kd3> creator = kd3.CREATOR;
        kd3 kd3Var = (kd3) bi3Var.b0(blob, creator);
        long j2 = cursor.getLong(6);
        oq3.U(bi3Var);
        kd3 kd3Var2 = (kd3) bi3Var.b0(cursor.getBlob(7), creator);
        long j3 = cursor.getLong(8);
        long j4 = cursor.getLong(9);
        oq3.U(bi3Var);
        str3 = str2;
        try {
            yb3 yb3Var = new yb3(str, str4, new tq3(j3, J, str3, str4), j2, z2, string2, kd3Var, j, kd3Var2, j4, (kd3) bi3Var.b0(cursor.getBlob(10), creator));
            if (cursor.moveToNext()) {
                vh3 vh3Var = pj3Var.r;
                pj3.m(vh3Var);
                vh3Var.r.d(vh3.E(str), pj3Var.v.c(str3), "Got multiple records for conditional property, expected one");
            }
            cursor.close();
            return yb3Var;
        } catch (SQLiteException e3) {
            e = e3;
            vh3 vh3Var2 = pj3Var.r;
            pj3.m(vh3Var2);
            vh3Var2.r.e("Error querying conditional property", vh3.E(str), pj3Var.v.c(str3), e);
            if (cursor != null) {
            }
            return null;
        }
    }

    public final void v0(String str, String str2) {
        ll3.s(str);
        ll3.s(str2);
        v();
        x();
        try {
            l0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            pj3 pj3Var = (pj3) this.m;
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.r.e("Error deleting conditional property", vh3.E(str), pj3Var.v.c(str2), e);
        }
    }

    public final List w0(String str, String str2, String str3) {
        ll3.s(str);
        v();
        x();
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
        return x0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        r0 = r1.r;
        defpackage.pj3.m(r0);
        r0.r.c(1000, "Read more than the max allowed conditional properties, ignoring extra");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List x0(String str, String[] strArr) {
        pj3 pj3Var = (pj3) this.m;
        v();
        x();
        ?? arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase l0 = l0();
                String[] strArr2 = {"app_id", FirebaseAnalytics.Param.ORIGIN, "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"};
                pj3Var.getClass();
                cursor = l0.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", "1001");
                if (cursor.moveToFirst()) {
                    while (true) {
                        if (arrayList.size() >= 1000) {
                            break;
                        }
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        String string3 = cursor.getString(2);
                        Object J = J(cursor, 3);
                        boolean z2 = cursor.getInt(4) != 0;
                        String string4 = cursor.getString(5);
                        long j = cursor.getLong(6);
                        bi3 bi3Var = this.n.s;
                        oq3.U(bi3Var);
                        byte[] blob = cursor.getBlob(7);
                        Parcelable.Creator<kd3> creator = kd3.CREATOR;
                        kd3 kd3Var = (kd3) bi3Var.b0(blob, creator);
                        long j2 = cursor.getLong(8);
                        oq3.U(bi3Var);
                        kd3 kd3Var2 = (kd3) bi3Var.b0(cursor.getBlob(9), creator);
                        long j3 = cursor.getLong(10);
                        long j4 = cursor.getLong(11);
                        oq3.U(bi3Var);
                        arrayList.add(new yb3(string, string2, new tq3(j3, J, string3, string2), j2, z2, string4, kd3Var, j, kd3Var2, j4, (kd3) bi3Var.b0(cursor.getBlob(12), creator)));
                        if (!cursor.moveToNext()) {
                            break;
                        }
                    }
                }
            } catch (SQLiteException e) {
                vh3 vh3Var = pj3Var.r;
                pj3.m(vh3Var);
                vh3Var.r.c(e, "Error querying conditional user property value");
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

    /* JADX WARN: Removed duplicated region for block: B:126:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x03e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final di3 y0(String str) {
        Cursor cursor;
        Boolean valueOf;
        String string;
        pj3 pj3Var = (pj3) this.m;
        ll3.s(str);
        v();
        x();
        Cursor cursor2 = null;
        try {
            cursor = l0().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                } catch (SQLiteException e) {
                    e = e;
                    vh3 vh3Var = pj3Var.r;
                    pj3.m(vh3Var);
                    vh3Var.r.d(vh3.E(str), e, "Error querying app. appId");
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
        } catch (SQLiteException e2) {
            e = e2;
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
        oq3 oq3Var = this.n;
        di3 di3Var = new di3(oq3Var.x, str);
        pj3 pj3Var2 = di3Var.a;
        xk3 b = oq3Var.b(str);
        vk3 vk3Var = vk3.ANALYTICS_STORAGE;
        if (b.i(vk3Var)) {
            di3Var.F(cursor.getString(0));
        }
        boolean z2 = true;
        di3Var.H(cursor.getString(1));
        if (oq3Var.b(str).i(vk3.AD_STORAGE)) {
            di3Var.I(cursor.getString(2));
        }
        di3Var.e(cursor.getLong(3));
        di3Var.L(cursor.getLong(4));
        di3Var.M(cursor.getLong(5));
        di3Var.O(cursor.getString(6));
        di3Var.R(cursor.getString(7));
        di3Var.S(cursor.getLong(8));
        di3Var.a(cursor.getLong(9));
        di3Var.d(cursor.isNull(10) || cursor.getInt(10) != 0);
        di3Var.i(cursor.getLong(11));
        di3Var.j(cursor.getLong(12));
        di3Var.k(cursor.getLong(13));
        di3Var.l(cursor.getLong(14));
        di3Var.f(cursor.getLong(15));
        di3Var.g(cursor.getLong(16));
        di3Var.Q(cursor.isNull(17) ? -2147483648L : cursor.getInt(17));
        di3Var.K(cursor.getString(18));
        di3Var.n(cursor.getLong(19));
        di3Var.m(cursor.getLong(20));
        di3Var.v(cursor.getString(21));
        boolean z3 = cursor.isNull(23) || cursor.getInt(23) != 0;
        lj3 lj3Var = pj3Var2.s;
        pj3.m(lj3Var);
        lj3Var.v();
        di3Var.Q |= di3Var.p != z3;
        di3Var.p = z3;
        di3Var.c(cursor.isNull(25) ? 0L : cursor.getLong(25));
        if (!cursor.isNull(26)) {
            di3Var.x(Arrays.asList(cursor.getString(26).split(",", -1)));
        }
        if (oq3Var.b(str).i(vk3Var)) {
            String string2 = cursor.getString(28);
            lj3 lj3Var2 = pj3Var2.s;
            pj3.m(lj3Var2);
            lj3Var2.v();
            di3Var.Q |= !Objects.equals(di3Var.t, string2);
            di3Var.t = string2;
        }
        boolean z4 = (cursor.isNull(29) || cursor.getInt(29) == 0) ? false : true;
        lj3 lj3Var3 = pj3Var2.s;
        pj3.m(lj3Var3);
        lj3Var3.v();
        di3Var.Q |= di3Var.u != z4;
        di3Var.u = z4;
        di3Var.r(cursor.getLong(39));
        String string3 = cursor.getString(36);
        lj3 lj3Var4 = pj3Var2.s;
        pj3.m(lj3Var4);
        lj3Var4.v();
        di3Var.Q |= di3Var.C != string3;
        di3Var.C = string3;
        di3Var.z(cursor.getLong(30));
        di3Var.A(cursor.getLong(31));
        vr3.a();
        if (pj3Var.p.G(str, ug3.P0)) {
            int i = cursor.getInt(32);
            lj3 lj3Var5 = pj3Var2.s;
            pj3.m(lj3Var5);
            lj3Var5.v();
            di3Var.Q |= di3Var.x != i;
            di3Var.x = i;
            di3Var.B(cursor.getLong(35));
        }
        boolean z5 = (cursor.isNull(33) || cursor.getInt(33) == 0) ? false : true;
        lj3 lj3Var6 = pj3Var2.s;
        pj3.m(lj3Var6);
        lj3Var6.v();
        di3Var.Q |= di3Var.y != z5;
        di3Var.y = z5;
        if (cursor.isNull(34)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getInt(34) != 0);
        }
        lj3 lj3Var7 = pj3Var2.s;
        pj3.m(lj3Var7);
        lj3Var7.v();
        di3Var.Q |= !Objects.equals(di3Var.q, valueOf);
        di3Var.q = valueOf;
        di3Var.p(cursor.getInt(37));
        di3Var.q(cursor.getInt(38));
        if (cursor.isNull(40)) {
            string = BuildConfig.FLAVOR;
        } else {
            string = cursor.getString(40);
            ll3.v(string);
        }
        lj3 lj3Var8 = pj3Var2.s;
        pj3.m(lj3Var8);
        lj3Var8.v();
        di3Var.Q |= di3Var.G != string;
        di3Var.G = string;
        if (!cursor.isNull(41)) {
            Long valueOf2 = Long.valueOf(cursor.getLong(41));
            lj3 lj3Var9 = pj3Var2.s;
            pj3.m(lj3Var9);
            lj3Var9.v();
            di3Var.Q |= !Objects.equals(di3Var.z, valueOf2);
            di3Var.z = valueOf2;
        }
        if (!cursor.isNull(42)) {
            Long valueOf3 = Long.valueOf(cursor.getLong(42));
            lj3 lj3Var10 = pj3Var2.s;
            pj3.m(lj3Var10);
            lj3Var10.v();
            di3Var.Q |= !Objects.equals(di3Var.A, valueOf3);
            di3Var.A = valueOf3;
        }
        byte[] blob = cursor.getBlob(43);
        lj3 lj3Var11 = pj3Var2.s;
        pj3.m(lj3Var11);
        lj3Var11.v();
        di3Var.Q |= di3Var.H != blob;
        di3Var.H = blob;
        if (!cursor.isNull(44)) {
            int i2 = cursor.getInt(44);
            lj3 lj3Var12 = pj3Var2.s;
            pj3.m(lj3Var12);
            lj3Var12.v();
            boolean z6 = di3Var.Q;
            if (di3Var.I == i2) {
                z2 = false;
            }
            di3Var.Q = z2 | z6;
            di3Var.I = i2;
        }
        lj3 lj3Var13 = pj3Var2.s;
        pj3.m(lj3Var13);
        lj3Var13.v();
        di3Var.Q = false;
        if (cursor.moveToNext()) {
            vh3 vh3Var2 = pj3Var.r;
            pj3.m(vh3Var2);
            vh3Var2.r.c(vh3.E(str), "Got multiple records for app, expected one. appId");
        }
        cursor.close();
        return di3Var;
    }

    public final void z0(di3 di3Var, boolean z2) {
        pj3 pj3Var = (pj3) this.m;
        pj3 pj3Var2 = di3Var.a;
        v();
        x();
        String D = di3Var.D();
        ll3.v(D);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", D);
        vk3 vk3Var = vk3.ANALYTICS_STORAGE;
        oq3 oq3Var = this.n;
        if (z2) {
            contentValues.put("app_instance_id", (String) null);
        } else if (oq3Var.b(D).i(vk3Var)) {
            contentValues.put("app_instance_id", di3Var.E());
        }
        contentValues.put("gmp_app_id", di3Var.G());
        if (oq3Var.b(D).i(vk3.AD_STORAGE)) {
            lj3 lj3Var = pj3Var2.s;
            pj3.m(lj3Var);
            lj3Var.v();
            contentValues.put("resettable_device_id_hash", di3Var.e);
        }
        lj3 lj3Var2 = pj3Var2.s;
        pj3.m(lj3Var2);
        lj3Var2.v();
        contentValues.put("last_bundle_index", Long.valueOf(di3Var.g));
        lj3 lj3Var3 = pj3Var2.s;
        pj3.m(lj3Var3);
        lj3Var3.v();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(di3Var.h));
        lj3 lj3Var4 = pj3Var2.s;
        pj3.m(lj3Var4);
        lj3Var4.v();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(di3Var.i));
        contentValues.put("app_version", di3Var.N());
        lj3 lj3Var5 = pj3Var2.s;
        pj3.m(lj3Var5);
        lj3Var5.v();
        contentValues.put("app_store", di3Var.l);
        lj3 lj3Var6 = pj3Var2.s;
        pj3.m(lj3Var6);
        lj3Var6.v();
        contentValues.put("gmp_version", Long.valueOf(di3Var.m));
        lj3 lj3Var7 = pj3Var2.s;
        pj3.m(lj3Var7);
        lj3Var7.v();
        contentValues.put("dev_cert_hash", Long.valueOf(di3Var.n));
        lj3 lj3Var8 = pj3Var2.s;
        pj3.m(lj3Var8);
        lj3Var8.v();
        contentValues.put("measurement_enabled", Boolean.valueOf(di3Var.o));
        lj3 lj3Var9 = pj3Var2.s;
        lj3 lj3Var10 = pj3Var2.s;
        pj3.m(lj3Var9);
        lj3Var9.v();
        contentValues.put("day", Long.valueOf(di3Var.J));
        pj3.m(lj3Var10);
        lj3Var10.v();
        contentValues.put("daily_public_events_count", Long.valueOf(di3Var.K));
        pj3.m(lj3Var10);
        lj3Var10.v();
        contentValues.put("daily_events_count", Long.valueOf(di3Var.L));
        pj3.m(lj3Var10);
        lj3Var10.v();
        contentValues.put("daily_conversions_count", Long.valueOf(di3Var.M));
        lj3 lj3Var11 = pj3Var2.s;
        pj3.m(lj3Var11);
        lj3Var11.v();
        contentValues.put("config_fetched_time", Long.valueOf(di3Var.R));
        lj3 lj3Var12 = pj3Var2.s;
        pj3.m(lj3Var12);
        lj3Var12.v();
        contentValues.put("failed_config_fetch_time", Long.valueOf(di3Var.S));
        contentValues.put("app_version_int", Long.valueOf(di3Var.P()));
        contentValues.put("firebase_instance_id", di3Var.J());
        pj3.m(lj3Var10);
        lj3Var10.v();
        contentValues.put("daily_error_events_count", Long.valueOf(di3Var.N));
        pj3.m(lj3Var10);
        lj3Var10.v();
        contentValues.put("daily_realtime_events_count", Long.valueOf(di3Var.O));
        pj3.m(lj3Var10);
        lj3Var10.v();
        contentValues.put("health_monitor_sample", di3Var.P);
        contentValues.put("android_id", (Long) 0L);
        lj3 lj3Var13 = pj3Var2.s;
        pj3.m(lj3Var13);
        lj3Var13.v();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(di3Var.p));
        contentValues.put("dynamite_version", Long.valueOf(di3Var.b()));
        if (oq3Var.b(D).i(vk3Var)) {
            lj3 lj3Var14 = pj3Var2.s;
            pj3.m(lj3Var14);
            lj3Var14.v();
            contentValues.put("session_stitching_token", di3Var.t);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(di3Var.y()));
        lj3 lj3Var15 = pj3Var2.s;
        pj3.m(lj3Var15);
        lj3Var15.v();
        contentValues.put("target_os_version", Long.valueOf(di3Var.v));
        lj3 lj3Var16 = pj3Var2.s;
        pj3.m(lj3Var16);
        lj3Var16.v();
        contentValues.put("session_stitching_token_hash", Long.valueOf(di3Var.w));
        vr3.a();
        ec3 ec3Var = pj3Var.p;
        vh3 vh3Var = pj3Var.r;
        if (ec3Var.G(D, ug3.P0)) {
            lj3 lj3Var17 = pj3Var2.s;
            pj3.m(lj3Var17);
            lj3Var17.v();
            contentValues.put("ad_services_version", Integer.valueOf(di3Var.x));
            lj3 lj3Var18 = pj3Var2.s;
            pj3.m(lj3Var18);
            lj3Var18.v();
            contentValues.put("attribution_eligibility_status", Long.valueOf(di3Var.B));
        }
        lj3 lj3Var19 = pj3Var2.s;
        pj3.m(lj3Var19);
        lj3Var19.v();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(di3Var.y));
        contentValues.put("npa_metadata_value", di3Var.w());
        lj3 lj3Var20 = pj3Var2.s;
        pj3.m(lj3Var20);
        lj3Var20.v();
        contentValues.put("bundle_delivery_index", Long.valueOf(di3Var.F));
        contentValues.put("sgtm_preview_key", di3Var.C());
        pj3.m(lj3Var10);
        lj3Var10.v();
        contentValues.put("dma_consent_state", Integer.valueOf(di3Var.D));
        pj3.m(lj3Var10);
        lj3Var10.v();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(di3Var.E));
        contentValues.put("serialized_npa_metadata", di3Var.s());
        contentValues.put("client_upload_eligibility", Integer.valueOf(di3Var.t()));
        lj3 lj3Var21 = pj3Var2.s;
        pj3.m(lj3Var21);
        lj3Var21.v();
        ArrayList arrayList = di3Var.s;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                pj3.m(vh3Var);
                vh3Var.u.c(D, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        if (pj3Var.p.G(null, ug3.K0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        lj3 lj3Var22 = pj3Var2.s;
        pj3.m(lj3Var22);
        lj3Var22.v();
        contentValues.put("unmatched_pfo", di3Var.z);
        lj3 lj3Var23 = pj3Var2.s;
        pj3.m(lj3Var23);
        lj3Var23.v();
        contentValues.put("unmatched_uwa", di3Var.A);
        lj3 lj3Var24 = pj3Var2.s;
        pj3.m(lj3Var24);
        lj3Var24.v();
        contentValues.put("ad_campaign_info", di3Var.H);
        try {
            SQLiteDatabase l0 = l0();
            if (l0.update("apps", contentValues, "app_id = ?", new String[]{D}) == 0 && l0.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                pj3.m(vh3Var);
                vh3Var.r.c(vh3.E(D), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e) {
            pj3.m(vh3Var);
            vh3Var.r.d(vh3.E(D), e, "Error storing app. appId");
        }
    }

    @Override // defpackage.vp3
    public final void z() {
    }
}
