package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import com.google.firebase.encoders.json.BuildConfig;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class rc3 extends SQLiteOpenHelper {
    public final /* synthetic */ int m;
    public final /* synthetic */ rp3 n;

    public rc3(Context context, String str) {
        super(context, true == str.equals(BuildConfig.FLAVOR) ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        int i = this.m;
        rp3 rp3Var = this.n;
        switch (i) {
            case 0:
                tc3 tc3Var = (tc3) rp3Var;
                pj3 pj3Var = (pj3) tc3Var.m;
                pj3 pj3Var2 = (pj3) tc3Var.m;
                pj3Var.getClass();
                nx0 nx0Var = tc3Var.q;
                if (nx0Var.m != 0) {
                    ((qb2) nx0Var.n).getClass();
                    if (SystemClock.elapsedRealtime() - nx0Var.m < 3600000) {
                        throw new SQLiteException("Database open failed");
                    }
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    ((qb2) nx0Var.n).getClass();
                    nx0Var.m = SystemClock.elapsedRealtime();
                    vh3 vh3Var = pj3Var2.r;
                    pj3.m(vh3Var);
                    vh3Var.r.b("Opening the database failed, dropping and recreating it");
                    if (!pj3Var2.m.getDatabasePath("google_app_measurement.db").delete()) {
                        vh3 vh3Var2 = pj3Var2.r;
                        pj3.m(vh3Var2);
                        vh3Var2.r.c("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        nx0Var.m = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e) {
                        vh3 vh3Var3 = pj3Var2.r;
                        pj3.m(vh3Var3);
                        vh3Var3.r.c(e, "Failed to open freshly created database");
                        throw e;
                    }
                }
            default:
                lh3 lh3Var = (lh3) rp3Var;
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e2) {
                    throw e2;
                } catch (SQLiteException unused2) {
                    pj3 pj3Var3 = (pj3) lh3Var.m;
                    vh3 vh3Var4 = pj3Var3.r;
                    pj3.m(vh3Var4);
                    vh3Var4.r.b("Opening the local database failed, dropping and recreating it");
                    if (!pj3Var3.m.getDatabasePath("google_app_measurement_local.db").delete()) {
                        vh3 vh3Var5 = pj3Var3.r;
                        pj3.m(vh3Var5);
                        vh3Var5.r.c("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e3) {
                        vh3 vh3Var6 = ((pj3) lh3Var.m).r;
                        pj3.m(vh3Var6);
                        vh3Var6.r.c(e3, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i = this.m;
        rp3 rp3Var = this.n;
        switch (i) {
            case 0:
                vh3 vh3Var = ((pj3) ((tc3) rp3Var).m).r;
                pj3.m(vh3Var);
                mi2.u(vh3Var, sQLiteDatabase);
                break;
            default:
                vh3 vh3Var2 = ((pj3) ((lh3) rp3Var).m).r;
                pj3.m(vh3Var2);
                mi2.u(vh3Var2, sQLiteDatabase);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.m;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        int i = this.m;
        rp3 rp3Var = this.n;
        switch (i) {
            case 0:
                pj3 pj3Var = (pj3) ((tc3) rp3Var).m;
                vh3 vh3Var = pj3Var.r;
                pj3.m(vh3Var);
                mi2.t(vh3Var, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", tc3.r);
                vh3 vh3Var2 = pj3Var.r;
                pj3.m(vh3Var2);
                mi2.t(vh3Var2, sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
                pj3.m(vh3Var2);
                mi2.t(vh3Var2, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                pj3.m(vh3Var2);
                mi2.t(vh3Var2, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", tc3.t);
                pj3.m(vh3Var2);
                mi2.t(vh3Var2, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", tc3.u);
                pj3.m(vh3Var2);
                mi2.t(vh3Var2, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", tc3.w);
                pj3.m(vh3Var2);
                mi2.t(vh3Var2, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                pj3.m(vh3Var2);
                mi2.t(vh3Var2, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", tc3.v);
                pj3.m(vh3Var2);
                mi2.t(vh3Var2, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", tc3.x);
                pj3.m(vh3Var2);
                mi2.t(vh3Var2, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", tc3.y);
                pj3.m(vh3Var2);
                mi2.t(vh3Var2, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                pj3.m(vh3Var2);
                mi2.t(vh3Var2, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", tc3.z);
                pj3.m(vh3Var2);
                mi2.t(vh3Var2, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                pj3.m(vh3Var2);
                mi2.t(vh3Var2, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                pj3.m(vh3Var2);
                mi2.t(vh3Var2, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", tc3.A);
                vr3.a();
                pj3.m(vh3Var2);
                mi2.t(vh3Var2, sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", tc3.B);
                pj3.m(vh3Var2);
                mi2.t(vh3Var2, sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", tc3.s);
                pj3.m(vh3Var2);
                mi2.t(vh3Var2, sQLiteDatabase, "no_data_mode_events", "CREATE TABLE IF NOT EXISTS no_data_mode_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, data BLOB NOT NULL, timestamp_millis INTEGER NOT NULL);", "app_id,name,data,timestamp_millis", null);
                break;
            default:
                vh3 vh3Var3 = ((pj3) ((lh3) rp3Var).m).r;
                pj3.m(vh3Var3);
                mi2.t(vh3Var3, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", lh3.q);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.m;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rc3(lh3 lh3Var, Context context) {
        this(context, "google_app_measurement_local.db");
        this.m = 1;
        this.n = lh3Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rc3(tc3 tc3Var, Context context) {
        this(context, "google_app_measurement.db");
        this.m = 0;
        this.n = tc3Var;
    }

    private final void b(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void f(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void m(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void n(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
