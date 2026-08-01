package s7;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l extends SQLiteOpenHelper {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8805d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c1.b f8806e;

    public l(Context context, String str) {
        super(context, true == str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        switch (this.f8805d) {
            case 0:
                m mVar = (m) this.f8806e;
                q1 q1Var = (q1) mVar.f1478d;
                q1 q1Var2 = (q1) mVar.f1478d;
                q1Var.getClass();
                r0 r0Var = mVar.f8830s;
                if (r0Var.f8969e != 0) {
                    ((g7.a) r0Var.f8970i).getClass();
                    if (SystemClock.elapsedRealtime() - r0Var.f8969e < 3600000) {
                        throw new SQLiteException("Database open failed");
                    }
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    ((g7.a) r0Var.f8970i).getClass();
                    r0Var.f8969e = SystemClock.elapsedRealtime();
                    v0 v0Var = q1Var2.f8937t;
                    q1.l(v0Var);
                    v0Var.f9050t.a("Opening the database failed, dropping and recreating it");
                    if (!q1Var2.f8932d.getDatabasePath("google_app_measurement.db").delete()) {
                        v0 v0Var2 = q1Var2.f8937t;
                        q1.l(v0Var2);
                        v0Var2.f9050t.b("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        r0Var.f8969e = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e2) {
                        v0 v0Var3 = q1Var2.f8937t;
                        q1.l(v0Var3);
                        v0Var3.f9050t.b(e2, "Failed to open freshly created database");
                        throw e2;
                    }
                }
            default:
                o0 o0Var = (o0) this.f8806e;
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e9) {
                    throw e9;
                } catch (SQLiteException unused2) {
                    q1 q1Var3 = (q1) o0Var.f1478d;
                    v0 v0Var4 = q1Var3.f8937t;
                    q1.l(v0Var4);
                    v0Var4.f9050t.a("Opening the local database failed, dropping and recreating it");
                    if (!q1Var3.f8932d.getDatabasePath("google_app_measurement_local.db").delete()) {
                        v0 v0Var5 = q1Var3.f8937t;
                        q1.l(v0Var5);
                        v0Var5.f9050t.b("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e10) {
                        v0 v0Var6 = ((q1) o0Var.f1478d).f8937t;
                        q1.l(v0Var6);
                        v0Var6.f9050t.b(e10, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        switch (this.f8805d) {
            case 0:
                v0 v0Var = ((q1) ((m) this.f8806e).f1478d).f8937t;
                q1.l(v0Var);
                d2.f(v0Var, sQLiteDatabase);
                break;
            default:
                v0 v0Var2 = ((q1) ((o0) this.f8806e).f1478d).f8937t;
                q1.l(v0Var2);
                d2.f(v0Var2, sQLiteDatabase);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i3, int i10) {
        int i11 = this.f8805d;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        switch (this.f8805d) {
            case 0:
                q1 q1Var = (q1) ((m) this.f8806e).f1478d;
                v0 v0Var = q1Var.f8937t;
                q1.l(v0Var);
                d2.d(v0Var, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", m.f8822t);
                v0 v0Var2 = q1Var.f8937t;
                q1.l(v0Var2);
                d2.d(v0Var2, sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
                q1.l(v0Var2);
                d2.d(v0Var2, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                q1.l(v0Var2);
                d2.d(v0Var2, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", m.f8824v);
                q1.l(v0Var2);
                d2.d(v0Var2, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", m.f8825w);
                q1.l(v0Var2);
                d2.d(v0Var2, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", m.f8827y);
                q1.l(v0Var2);
                d2.d(v0Var2, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                q1.l(v0Var2);
                d2.d(v0Var2, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", m.f8826x);
                q1.l(v0Var2);
                d2.d(v0Var2, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", m.f8828z);
                q1.l(v0Var2);
                d2.d(v0Var2, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", m.A);
                q1.l(v0Var2);
                d2.d(v0Var2, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                q1.l(v0Var2);
                d2.d(v0Var2, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", m.B);
                q1.l(v0Var2);
                d2.d(v0Var2, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                q1.l(v0Var2);
                d2.d(v0Var2, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                q1.l(v0Var2);
                d2.d(v0Var2, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", m.C);
                com.google.android.gms.internal.measurement.i4.a();
                q1.l(v0Var2);
                d2.d(v0Var2, sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", m.D);
                q1.l(v0Var2);
                d2.d(v0Var2, sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", m.f8823u);
                q1.l(v0Var2);
                d2.d(v0Var2, sQLiteDatabase, "diagnostic_signals", "CREATE TABLE IF NOT EXISTS diagnostic_signals ( app_id TEXT NOT NULL, signal_name TEXT NOT NULL, metadata TEXT NOT NULL, count INTEGER NOT NULL, last_increment_timestamp INTEGER NOT NULL);", "app_id,signal_name,metadata,count,last_increment_timestamp", null);
                q1.l(v0Var2);
                d2.d(v0Var2, sQLiteDatabase, "no_data_mode_events", "CREATE TABLE IF NOT EXISTS no_data_mode_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, data BLOB NOT NULL, timestamp_millis INTEGER NOT NULL);", "app_id,name,data,timestamp_millis", null);
                break;
            default:
                v0 v0Var3 = ((q1) ((o0) this.f8806e).f1478d).f8937t;
                q1.l(v0Var3);
                d2.d(v0Var3, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", o0.f8892s);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i3, int i10) {
        int i11 = this.f8805d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(o0 o0Var, Context context) {
        this(context, "google_app_measurement_local.db");
        this.f8805d = 1;
        this.f8806e = o0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Context context) {
        this(context, "google_app_measurement.db");
        this.f8805d = 0;
        this.f8806e = mVar;
    }

    private final void a(SQLiteDatabase sQLiteDatabase, int i3, int i10) {
    }

    private final void d(SQLiteDatabase sQLiteDatabase, int i3, int i10) {
    }

    private final void h(SQLiteDatabase sQLiteDatabase, int i3, int i10) {
    }

    private final void i(SQLiteDatabase sQLiteDatabase, int i3, int i10) {
    }
}
