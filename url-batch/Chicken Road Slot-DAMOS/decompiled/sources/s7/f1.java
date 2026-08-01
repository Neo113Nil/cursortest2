package s7;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f1 extends x1 {
    public static final Pair N = new Pair("", 0L);
    public final b7.o0 A;
    public final c6.n B;
    public final c1 C;
    public final d1 D;
    public final d1 E;
    public boolean F;
    public final c1 G;
    public final c1 H;
    public final d1 I;
    public final b7.o0 J;
    public final b7.o0 K;
    public final d1 L;
    public final c6.n M;

    /* renamed from: i, reason: collision with root package name */
    public SharedPreferences f8682i;

    /* renamed from: r, reason: collision with root package name */
    public SharedPreferences f8683r;

    /* renamed from: s, reason: collision with root package name */
    public e1 f8684s;

    /* renamed from: t, reason: collision with root package name */
    public final d1 f8685t;

    /* renamed from: u, reason: collision with root package name */
    public final b7.o0 f8686u;

    /* renamed from: v, reason: collision with root package name */
    public String f8687v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8688w;

    /* renamed from: x, reason: collision with root package name */
    public long f8689x;

    /* renamed from: y, reason: collision with root package name */
    public final d1 f8690y;

    /* renamed from: z, reason: collision with root package name */
    public final c1 f8691z;

    public f1(q1 q1Var) {
        super(q1Var);
        this.f8690y = new d1(this, "session_timeout", 1800000L);
        this.f8691z = new c1(this, "start_new_session", true);
        this.D = new d1(this, "last_pause_time", 0L);
        this.E = new d1(this, "session_id", 0L);
        this.A = new b7.o0(this, "non_personalized_ads");
        this.B = new c6.n(this, "last_received_uri_timestamps_by_source");
        this.C = new c1(this, "allow_remote_dynamite", false);
        this.f8685t = new d1(this, "first_open_time", 0L);
        c7.c0.d("app_install_time");
        this.f8686u = new b7.o0(this, "app_instance_id");
        this.G = new c1(this, "app_backgrounded", false);
        this.H = new c1(this, "deep_link_retrieval_complete", false);
        this.I = new d1(this, "deep_link_retrieval_attempts", 0L);
        this.J = new b7.o0(this, "firebase_feature_rollouts");
        this.K = new b7.o0(this, "deferred_attribution_cache");
        this.L = new d1(this, "deferred_attribution_cache_timestamp", 0L);
        this.M = new c6.n(this, "default_event_parameters");
    }

    public final void A(boolean z10) {
        s();
        v0 v0Var = ((q1) this.f1478d).f8937t;
        q1.l(v0Var);
        v0Var.B.b(Boolean.valueOf(z10), "App measurement setting deferred collection");
        SharedPreferences.Editor edit = w().edit();
        edit.putBoolean("deferred_analytics_collection", z10);
        edit.apply();
    }

    public final boolean B(long j) {
        return j - this.f8690y.a() > this.D.a();
    }

    @Override // s7.x1
    public final boolean t() {
        return true;
    }

    public final SharedPreferences w() {
        s();
        u();
        c7.c0.g(this.f8682i);
        return this.f8682i;
    }

    public final SharedPreferences x() {
        s();
        u();
        if (this.f8683r == null) {
            q1 q1Var = (q1) this.f1478d;
            String valueOf = String.valueOf(q1Var.f8932d.getPackageName());
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            t0 t0Var = v0Var.B;
            String concat = valueOf.concat("_preferences");
            t0Var.b(concat, "Default prefs file");
            this.f8683r = q1Var.f8932d.getSharedPreferences(concat, 0);
        }
        return this.f8683r;
    }

    public final SparseArray y() {
        Bundle d10 = this.B.d();
        int[] intArray = d10.getIntArray("uriSources");
        long[] longArray = d10.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            v0 v0Var = ((q1) this.f1478d).f8937t;
            q1.l(v0Var);
            v0Var.f9050t.a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i3 = 0; i3 < intArray.length; i3++) {
            sparseArray.put(intArray[i3], Long.valueOf(longArray[i3]));
        }
        return sparseArray;
    }

    public final c2 z() {
        s();
        return c2.c(w().getInt("consent_source", 100), w().getString("consent_settings", "G1"));
    }
}
