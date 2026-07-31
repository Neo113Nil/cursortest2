package a3;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.cc3;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.on0;
import com.google.android.gms.internal.ads.sw;
import com.google.android.gms.internal.ads.u20;
import com.google.android.gms.internal.ads.wo0;
import com.google.android.gms.internal.ads.yo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class w1 implements t1 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f162b;

    /* renamed from: d, reason: collision with root package name */
    private cc3<?> f164d;

    /* renamed from: f, reason: collision with root package name */
    private SharedPreferences f166f;

    /* renamed from: g, reason: collision with root package name */
    private SharedPreferences.Editor f167g;

    /* renamed from: i, reason: collision with root package name */
    private String f169i;

    /* renamed from: j, reason: collision with root package name */
    private String f170j;

    /* renamed from: a, reason: collision with root package name */
    private final Object f161a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final List<Runnable> f163c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private yo f165e = null;

    /* renamed from: h, reason: collision with root package name */
    private boolean f168h = true;

    /* renamed from: k, reason: collision with root package name */
    private boolean f171k = true;

    /* renamed from: l, reason: collision with root package name */
    private on0 f172l = new on0("", 0);

    /* renamed from: m, reason: collision with root package name */
    private long f173m = 0;

    /* renamed from: n, reason: collision with root package name */
    private long f174n = 0;

    /* renamed from: o, reason: collision with root package name */
    private int f175o = -1;

    /* renamed from: p, reason: collision with root package name */
    private int f176p = 0;

    /* renamed from: q, reason: collision with root package name */
    private Set<String> f177q = Collections.emptySet();

    /* renamed from: r, reason: collision with root package name */
    private JSONObject f178r = new JSONObject();

    /* renamed from: s, reason: collision with root package name */
    private boolean f179s = true;

    /* renamed from: t, reason: collision with root package name */
    private boolean f180t = true;

    /* renamed from: u, reason: collision with root package name */
    private String f181u = null;

    /* renamed from: v, reason: collision with root package name */
    private String f182v = "";

    /* renamed from: w, reason: collision with root package name */
    private boolean f183w = false;

    /* renamed from: x, reason: collision with root package name */
    private String f184x = "";

    /* renamed from: y, reason: collision with root package name */
    private int f185y = -1;

    /* renamed from: z, reason: collision with root package name */
    private int f186z = -1;
    private long A = 0;

    private final void n() {
        cc3<?> cc3Var = this.f164d;
        if (cc3Var == null || cc3Var.isDone()) {
            return;
        }
        try {
            this.f164d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e7) {
            Thread.currentThread().interrupt();
            io0.h("Interrupted while waiting for preferences loaded.", e7);
        } catch (CancellationException e8) {
            e = e8;
            io0.e("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e9) {
            e = e9;
            io0.e("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e10) {
            e = e10;
            io0.e("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    private final void p() {
        wo0.f13894a.execute(new Runnable() { // from class: a3.u1
            @Override // java.lang.Runnable
            public final void run() {
                w1.this.d();
            }
        });
    }

    @Override // a3.t1
    public final boolean I() {
        boolean z6;
        n();
        synchronized (this.f161a) {
            z6 = this.f183w;
        }
        return z6;
    }

    @Override // a3.t1
    public final boolean K() {
        boolean z6;
        if (!((Boolean) sw.c().b(m10.f8265o0)).booleanValue()) {
            return false;
        }
        n();
        synchronized (this.f161a) {
            z6 = this.f171k;
        }
        return z6;
    }

    @Override // a3.t1
    public final boolean L() {
        boolean z6;
        n();
        synchronized (this.f161a) {
            z6 = this.f179s;
        }
        return z6;
    }

    @Override // a3.t1
    public final void M(String str) {
        n();
        synchronized (this.f161a) {
            if (str.equals(this.f170j)) {
                return;
            }
            this.f170j = str;
            SharedPreferences.Editor editor = this.f167g;
            if (editor != null) {
                editor.putString("content_vertical_hashes", str);
                this.f167g.apply();
            }
            p();
        }
    }

    @Override // a3.t1
    public final void N(long j7) {
        n();
        synchronized (this.f161a) {
            if (this.f174n == j7) {
                return;
            }
            this.f174n = j7;
            SharedPreferences.Editor editor = this.f167g;
            if (editor != null) {
                editor.putLong("first_ad_req_time_ms", j7);
                this.f167g.apply();
            }
            p();
        }
    }

    @Override // a3.t1
    public final void O(String str) {
        n();
        synchronized (this.f161a) {
            if (TextUtils.equals(this.f181u, str)) {
                return;
            }
            this.f181u = str;
            SharedPreferences.Editor editor = this.f167g;
            if (editor != null) {
                editor.putString("display_cutout", str);
                this.f167g.apply();
            }
            p();
        }
    }

    @Override // a3.t1
    public final void P(String str) {
        if (((Boolean) sw.c().b(m10.P6)).booleanValue()) {
            n();
            synchronized (this.f161a) {
                if (this.f184x.equals(str)) {
                    return;
                }
                this.f184x = str;
                SharedPreferences.Editor editor = this.f167g;
                if (editor != null) {
                    editor.putString("linked_ad_unit", str);
                    this.f167g.apply();
                }
                p();
            }
        }
    }

    @Override // a3.t1
    public final void Q(int i7) {
        n();
        synchronized (this.f161a) {
            if (this.f186z == i7) {
                return;
            }
            this.f186z = i7;
            SharedPreferences.Editor editor = this.f167g;
            if (editor != null) {
                editor.putInt("sd_app_measure_npa", i7);
                this.f167g.apply();
            }
            p();
        }
    }

    @Override // a3.t1
    public final void R(boolean z6) {
        if (((Boolean) sw.c().b(m10.P6)).booleanValue()) {
            n();
            synchronized (this.f161a) {
                if (this.f183w == z6) {
                    return;
                }
                this.f183w = z6;
                SharedPreferences.Editor editor = this.f167g;
                if (editor != null) {
                    editor.putBoolean("linked_device", z6);
                    this.f167g.apply();
                }
                p();
            }
        }
    }

    @Override // a3.t1
    public final void S(long j7) {
        n();
        synchronized (this.f161a) {
            if (this.f173m == j7) {
                return;
            }
            this.f173m = j7;
            SharedPreferences.Editor editor = this.f167g;
            if (editor != null) {
                editor.putLong("app_last_background_time_ms", j7);
                this.f167g.apply();
            }
            p();
        }
    }

    @Override // a3.t1
    public final void T(final Context context) {
        synchronized (this.f161a) {
            if (this.f166f != null) {
                return;
            }
            final String str = "admob";
            this.f164d = wo0.f13894a.H(new Runnable(context, str) { // from class: a3.v1

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ Context f158g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ String f159h = "admob";

                @Override // java.lang.Runnable
                public final void run() {
                    w1.this.l(this.f158g, this.f159h);
                }
            });
            this.f162b = true;
        }
    }

    @Override // a3.t1
    public final void U(boolean z6) {
        n();
        synchronized (this.f161a) {
            if (this.f179s == z6) {
                return;
            }
            this.f179s = z6;
            SharedPreferences.Editor editor = this.f167g;
            if (editor != null) {
                editor.putBoolean("content_url_opted_out", z6);
                this.f167g.apply();
            }
            p();
        }
    }

    @Override // a3.t1
    public final void V(String str) {
        n();
        synchronized (this.f161a) {
            long b7 = y2.t.a().b();
            if (str != null && !str.equals(this.f172l.c())) {
                this.f172l = new on0(str, b7);
                SharedPreferences.Editor editor = this.f167g;
                if (editor != null) {
                    editor.putString("app_settings_json", str);
                    this.f167g.putLong("app_settings_last_update_ms", b7);
                    this.f167g.apply();
                }
                p();
                Iterator<Runnable> it = this.f163c.iterator();
                while (it.hasNext()) {
                    it.next().run();
                }
                return;
            }
            this.f172l.g(b7);
        }
    }

    @Override // a3.t1
    public final void W(long j7) {
        n();
        synchronized (this.f161a) {
            if (this.A == j7) {
                return;
            }
            this.A = j7;
            SharedPreferences.Editor editor = this.f167g;
            if (editor != null) {
                editor.putLong("sd_app_measure_npa_ts", j7);
                this.f167g.apply();
            }
            p();
        }
    }

    @Override // a3.t1
    public final void X(String str) {
        if (((Boolean) sw.c().b(m10.A6)).booleanValue()) {
            n();
            synchronized (this.f161a) {
                if (this.f182v.equals(str)) {
                    return;
                }
                this.f182v = str;
                SharedPreferences.Editor editor = this.f167g;
                if (editor != null) {
                    editor.putString("inspector_info", str);
                    this.f167g.apply();
                }
                p();
            }
        }
    }

    @Override // a3.t1
    public final void Y(boolean z6) {
        n();
        synchronized (this.f161a) {
            if (z6 == this.f171k) {
                return;
            }
            this.f171k = z6;
            SharedPreferences.Editor editor = this.f167g;
            if (editor != null) {
                editor.putBoolean("gad_idless", z6);
                this.f167g.apply();
            }
            p();
        }
    }

    @Override // a3.t1
    public final void Z(Runnable runnable) {
        this.f163c.add(runnable);
    }

    @Override // a3.t1
    public final int a() {
        int i7;
        n();
        synchronized (this.f161a) {
            i7 = this.f175o;
        }
        return i7;
    }

    @Override // a3.t1
    public final void a0(String str, String str2, boolean z6) {
        n();
        synchronized (this.f161a) {
            JSONArray optJSONArray = this.f178r.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i7);
                if (optJSONObject == null) {
                    return;
                }
                if (str2.equals(optJSONObject.optString("template_id"))) {
                    if (z6 && optJSONObject.optBoolean("uses_media_view", false)) {
                        return;
                    }
                    length = i7;
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z6);
                jSONObject.put("timestamp_ms", y2.t.a().b());
                optJSONArray.put(length, jSONObject);
                this.f178r.put(str, optJSONArray);
            } catch (JSONException e7) {
                io0.h("Could not update native advanced settings", e7);
            }
            SharedPreferences.Editor editor = this.f167g;
            if (editor != null) {
                editor.putString("native_advanced_settings", this.f178r.toString());
                this.f167g.apply();
            }
            p();
        }
    }

    @Override // a3.t1
    public final long b() {
        long j7;
        n();
        synchronized (this.f161a) {
            j7 = this.A;
        }
        return j7;
    }

    @Override // a3.t1
    public final void b0(int i7) {
        n();
        synchronized (this.f161a) {
            if (this.f176p == i7) {
                return;
            }
            this.f176p = i7;
            SharedPreferences.Editor editor = this.f167g;
            if (editor != null) {
                editor.putInt("version_code", i7);
                this.f167g.apply();
            }
            p();
        }
    }

    @Override // a3.t1
    public final long c() {
        long j7;
        n();
        synchronized (this.f161a) {
            j7 = this.f173m;
        }
        return j7;
    }

    @Override // a3.t1
    public final void c0(boolean z6) {
        n();
        synchronized (this.f161a) {
            if (this.f180t == z6) {
                return;
            }
            this.f180t = z6;
            SharedPreferences.Editor editor = this.f167g;
            if (editor != null) {
                editor.putBoolean("content_vertical_opted_out", z6);
                this.f167g.apply();
            }
            p();
        }
    }

    @Override // a3.t1
    public final yo d() {
        if (!this.f162b) {
            return null;
        }
        if ((L() && v()) || !u20.f12586b.e().booleanValue()) {
            return null;
        }
        synchronized (this.f161a) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.f165e == null) {
                this.f165e = new yo();
            }
            this.f165e.e();
            io0.f("start fetching content...");
            return this.f165e;
        }
    }

    @Override // a3.t1
    public final void d0(String str) {
        n();
        synchronized (this.f161a) {
            if (str.equals(this.f169i)) {
                return;
            }
            this.f169i = str;
            SharedPreferences.Editor editor = this.f167g;
            if (editor != null) {
                editor.putString("content_url_hashes", str);
                this.f167g.apply();
            }
            p();
        }
    }

    @Override // a3.t1
    public final on0 e() {
        on0 on0Var;
        n();
        synchronized (this.f161a) {
            on0Var = this.f172l;
        }
        return on0Var;
    }

    @Override // a3.t1
    public final void e0(int i7) {
        n();
        synchronized (this.f161a) {
            if (this.f175o == i7) {
                return;
            }
            this.f175o = i7;
            SharedPreferences.Editor editor = this.f167g;
            if (editor != null) {
                editor.putInt("request_in_session_count", i7);
                this.f167g.apply();
            }
            p();
        }
    }

    @Override // a3.t1
    public final on0 f() {
        on0 on0Var;
        synchronized (this.f161a) {
            on0Var = this.f172l;
        }
        return on0Var;
    }

    @Override // a3.t1
    public final long g() {
        long j7;
        n();
        synchronized (this.f161a) {
            j7 = this.f174n;
        }
        return j7;
    }

    @Override // a3.t1
    public final String h() {
        String str;
        n();
        synchronized (this.f161a) {
            str = this.f169i;
        }
        return str;
    }

    @Override // a3.t1
    public final String i() {
        String str;
        n();
        synchronized (this.f161a) {
            str = this.f170j;
        }
        return str;
    }

    @Override // a3.t1
    public final String j() {
        String str;
        n();
        synchronized (this.f161a) {
            str = this.f184x;
        }
        return str;
    }

    @Override // a3.t1
    public final String k() {
        String str;
        n();
        synchronized (this.f161a) {
            str = this.f181u;
        }
        return str;
    }

    final /* synthetic */ void l(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (this.f161a) {
            this.f166f = sharedPreferences;
            this.f167g = edit;
            if (v3.l.h()) {
                NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            }
            this.f168h = this.f166f.getBoolean("use_https", this.f168h);
            this.f179s = this.f166f.getBoolean("content_url_opted_out", this.f179s);
            this.f169i = this.f166f.getString("content_url_hashes", this.f169i);
            this.f171k = this.f166f.getBoolean("gad_idless", this.f171k);
            this.f180t = this.f166f.getBoolean("content_vertical_opted_out", this.f180t);
            this.f170j = this.f166f.getString("content_vertical_hashes", this.f170j);
            this.f176p = this.f166f.getInt("version_code", this.f176p);
            this.f172l = new on0(this.f166f.getString("app_settings_json", this.f172l.c()), this.f166f.getLong("app_settings_last_update_ms", this.f172l.a()));
            this.f173m = this.f166f.getLong("app_last_background_time_ms", this.f173m);
            this.f175o = this.f166f.getInt("request_in_session_count", this.f175o);
            this.f174n = this.f166f.getLong("first_ad_req_time_ms", this.f174n);
            this.f177q = this.f166f.getStringSet("never_pool_slots", this.f177q);
            this.f181u = this.f166f.getString("display_cutout", this.f181u);
            this.f185y = this.f166f.getInt("app_measurement_npa", this.f185y);
            this.f186z = this.f166f.getInt("sd_app_measure_npa", this.f186z);
            this.A = this.f166f.getLong("sd_app_measure_npa_ts", this.A);
            this.f182v = this.f166f.getString("inspector_info", this.f182v);
            this.f183w = this.f166f.getBoolean("linked_device", this.f183w);
            this.f184x = this.f166f.getString("linked_ad_unit", this.f184x);
            try {
                this.f178r = new JSONObject(this.f166f.getString("native_advanced_settings", "{}"));
            } catch (JSONException e7) {
                io0.h("Could not convert native advanced settings to json object", e7);
            }
            p();
        }
    }

    @Override // a3.t1
    public final JSONObject m() {
        JSONObject jSONObject;
        n();
        synchronized (this.f161a) {
            jSONObject = this.f178r;
        }
        return jSONObject;
    }

    @Override // a3.t1
    public final String o() {
        String str;
        n();
        synchronized (this.f161a) {
            str = this.f182v;
        }
        return str;
    }

    @Override // a3.t1
    public final void r() {
        n();
        synchronized (this.f161a) {
            this.f178r = new JSONObject();
            SharedPreferences.Editor editor = this.f167g;
            if (editor != null) {
                editor.remove("native_advanced_settings");
                this.f167g.apply();
            }
            p();
        }
    }

    @Override // a3.t1
    public final boolean v() {
        boolean z6;
        n();
        synchronized (this.f161a) {
            z6 = this.f180t;
        }
        return z6;
    }

    @Override // a3.t1
    public final int zza() {
        int i7;
        n();
        synchronized (this.f161a) {
            i7 = this.f176p;
        }
        return i7;
    }
}
