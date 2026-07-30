package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.firebase.encoders.json.BuildConfig;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qi3 extends ok3 {
    public static final Pair L = new Pair(BuildConfig.FLAVOR, 0L);
    public final ii3 A;
    public final li3 B;
    public final li3 C;
    public boolean D;
    public final ii3 E;
    public final ii3 F;
    public final li3 G;
    public final w50 H;
    public final w50 I;
    public final li3 J;
    public final js0 K;
    public SharedPreferences o;
    public SharedPreferences p;
    public ni3 q;
    public final li3 r;
    public final w50 s;
    public String t;
    public boolean u;
    public long v;
    public final li3 w;
    public final ii3 x;
    public final w50 y;
    public final js0 z;

    public qi3(pj3 pj3Var) {
        super(pj3Var);
        this.w = new li3(this, "session_timeout", 1800000L);
        this.x = new ii3(this, "start_new_session", true);
        this.B = new li3(this, "last_pause_time", 0L);
        this.C = new li3(this, SDKAnalyticsEvents.PARAMETER_SESSION_ID, 0L);
        this.y = new w50(this, "non_personalized_ads");
        this.z = new js0(this, "last_received_uri_timestamps_by_source");
        this.A = new ii3(this, "allow_remote_dynamite", false);
        this.r = new li3(this, "first_open_time", 0L);
        ll3.s("app_install_time");
        this.s = new w50(this, "app_instance_id");
        this.E = new ii3(this, "app_backgrounded", false);
        this.F = new ii3(this, "deep_link_retrieval_complete", false);
        this.G = new li3(this, "deep_link_retrieval_attempts", 0L);
        this.H = new w50(this, "firebase_feature_rollouts");
        this.I = new w50(this, "deferred_attribution_cache");
        this.J = new li3(this, "deferred_attribution_cache_timestamp", 0L);
        this.K = new js0(this, "default_event_parameters");
    }

    public final SharedPreferences A() {
        v();
        y();
        ll3.v(this.o);
        return this.o;
    }

    public final SharedPreferences B() {
        v();
        y();
        if (this.p == null) {
            pj3 pj3Var = (pj3) this.m;
            String valueOf = String.valueOf(pj3Var.m.getPackageName());
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            g10 g10Var = vh3Var.z;
            String concat = valueOf.concat("_preferences");
            g10Var.c(concat, "Default prefs file");
            this.p = pj3Var.m.getSharedPreferences(concat, 0);
        }
        return this.p;
    }

    public final SparseArray C() {
        Bundle G = this.z.G();
        int[] intArray = G.getIntArray("uriSources");
        long[] longArray = G.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            vh3 vh3Var = ((pj3) this.m).r;
            pj3.m(vh3Var);
            vh3Var.r.b("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    public final xk3 D() {
        v();
        return xk3.c(A().getInt("consent_source", 100), A().getString("consent_settings", "G1"));
    }

    public final boolean E(fp3 fp3Var) {
        v();
        String string = A().getString("stored_tcf_param", BuildConfig.FLAVOR);
        String a = fp3Var.a();
        if (a.equals(string)) {
            return false;
        }
        SharedPreferences.Editor edit = A().edit();
        edit.putString("stored_tcf_param", a);
        edit.apply();
        return true;
    }

    public final void F(boolean z) {
        v();
        vh3 vh3Var = ((pj3) this.m).r;
        pj3.m(vh3Var);
        vh3Var.z.c(Boolean.valueOf(z), "App measurement setting deferred collection");
        SharedPreferences.Editor edit = A().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    public final boolean G(long j) {
        return j - this.w.a() > this.B.a();
    }

    @Override // defpackage.ok3
    public final boolean x() {
        return true;
    }
}
