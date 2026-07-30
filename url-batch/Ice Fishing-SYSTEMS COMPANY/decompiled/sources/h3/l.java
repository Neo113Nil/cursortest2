package h3;

import O.X;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.SystemClock;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.ads.AbstractC2530Ea;
import com.google.android.gms.internal.ads.C2841Wf;
import com.google.android.gms.internal.ads.C2858Xf;
import com.google.android.gms.internal.ads.C3165eo;
import com.google.android.gms.internal.ads.C3288h1;
import com.google.android.gms.internal.ads.C4287ze;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import k2.AbstractC4641l;
import k2.C4634e;
import k2.C4636g;
import l1.C4685b;
import l2.C4687b;
import l2.C4688c;
import m1.C4776c;
import org.json.JSONException;
import org.json.JSONObject;
import p.BinderC4845e;
import q2.F0;
import q2.G0;
import q2.f1;
import q2.r;
import s2.BinderC4996d;
import t2.C;
import t2.E;
import x1.ThreadFactoryC5206b;

/* loaded from: classes2.dex */
public final class l implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f38217n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f38218u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f38219v;

    public /* synthetic */ l(int i, Object obj, Object obj2) {
        this.f38217n = i;
        this.f38219v = obj;
        this.f38218u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38217n) {
            case 0:
                k kVar = (k) this.f38219v;
                try {
                    n a9 = ((g) kVar.f38214u).a(((n) this.f38218u).g());
                    N1.f fVar = i.f38208b;
                    a9.c(fVar, kVar);
                    a9.b(fVar, kVar);
                    a9.f38221b.f(new k(fVar, (b) kVar));
                    a9.o();
                    return;
                } catch (f e6) {
                    if (e6.getCause() instanceof Exception) {
                        kVar.B((Exception) e6.getCause());
                        return;
                    } else {
                        kVar.B(e6);
                        return;
                    }
                } catch (CancellationException unused) {
                    kVar.q();
                    return;
                } catch (Exception e9) {
                    kVar.B(e9);
                    return;
                }
            case 1:
                n nVar = (n) this.f38218u;
                try {
                    nVar.l(((Callable) this.f38219v).call());
                    return;
                } catch (Exception e10) {
                    nVar.k(e10);
                    return;
                } catch (Throwable th) {
                    nVar.k(new RuntimeException(th));
                    return;
                }
            case 2:
                F0 f02 = (F0) this.f38219v;
                C4634e c4634e = (C4634e) this.f38218u;
                c4634e.getClass();
                try {
                    c4634e.f38703b.f0(f1.a(c4634e.f38702a, f02));
                    return;
                } catch (RemoteException e11) {
                    u2.i.d("Failed to load ad.", e11);
                    return;
                }
            case 3:
                C4636g c4636g = (C4636g) this.f38219v;
                AbstractC4641l abstractC4641l = (AbstractC4641l) this.f38218u;
                try {
                    abstractC4641l.f38724n.b(c4636g.f38704a);
                    return;
                } catch (IllegalStateException e12) {
                    C4287ze.a(abstractC4641l.getContext()).e("BaseAdView.loadAd", e12);
                    return;
                }
            case 4:
                try {
                    ((C4685b) this.f38219v).f39025u.put((C4776c) this.f38218u);
                    return;
                } catch (InterruptedException unused2) {
                    Thread.currentThread().interrupt();
                    return;
                }
            case 5:
                C4687b c4687b = (C4687b) this.f38219v;
                C4688c c4688c = (C4688c) this.f38218u;
                c4688c.getClass();
                try {
                    c4688c.f38724n.b(c4687b.f38704a);
                    return;
                } catch (IllegalStateException e13) {
                    C4287ze.a(c4688c.getContext()).e("AdManagerAdView.loadAd", e13);
                    return;
                }
            case 6:
                W.e eVar = ((SwipeDismissBehavior) this.f38219v).f35986a;
                if (eVar == null || !eVar.g()) {
                    return;
                }
                WeakHashMap weakHashMap = X.f2240a;
                ((View) this.f38218u).postOnAnimation(this);
                return;
            case 7:
                ((BinderC4845e) this.f38219v).f39753u.d((Bundle) this.f38218u);
                return;
            case 8:
                p2.j.f39798C.f39810k.getClass();
                C3288h1.A((C3165eo) this.f38218u, "cld_r", SystemClock.elapsedRealtime() - ((Long) this.f38219v).longValue());
                return;
            case 9:
                G0 g02 = (G0) this.f38218u;
                g02.getClass();
                g02.f39954l.addView((View) V2.b.A0((V2.a) this.f38219v));
                return;
            case 10:
                ((BinderC4996d) ((C2858Xf) this.f38218u).f28660w).f40455u.getWindow().setBackgroundDrawable((BitmapDrawable) this.f38219v);
                return;
            case 11:
                E e14 = (E) this.f38218u;
                Context context = (Context) this.f38219v;
                e14.getClass();
                SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                try {
                    synchronized (e14.f40830a) {
                        try {
                            e14.f40835f = sharedPreferences;
                            e14.f40836g = edit;
                            NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                            e14.f40837h = e14.f40835f.getBoolean("use_https", e14.f40837h);
                            e14.f40849u = e14.f40835f.getBoolean("content_url_opted_out", e14.f40849u);
                            e14.i = e14.f40835f.getString("content_url_hashes", e14.i);
                            e14.f40839k = e14.f40835f.getBoolean("gad_idless", e14.f40839k);
                            e14.f40850v = e14.f40835f.getBoolean("content_vertical_opted_out", e14.f40850v);
                            e14.f40838j = e14.f40835f.getString("content_vertical_hashes", e14.f40838j);
                            e14.f40846r = e14.f40835f.getInt("version_code", e14.f40846r);
                            if (((Boolean) AbstractC2530Ea.f24773g.r()).booleanValue() && r.f40116e.f40119c.f31018j) {
                                e14.f40842n = new C2841Wf("", 0L);
                            } else {
                                e14.f40842n = new C2841Wf(e14.f40835f.getString("app_settings_json", e14.f40842n.f28423e), e14.f40835f.getLong("app_settings_last_update_ms", e14.f40842n.f28424f));
                            }
                            e14.f40843o = e14.f40835f.getLong("app_last_background_time_ms", e14.f40843o);
                            e14.f40845q = e14.f40835f.getInt("request_in_session_count", e14.f40845q);
                            e14.f40844p = e14.f40835f.getLong("first_ad_req_time_ms", e14.f40844p);
                            e14.f40847s = e14.f40835f.getStringSet("never_pool_slots", e14.f40847s);
                            e14.f40851w = e14.f40835f.getString("display_cutout", e14.f40851w);
                            e14.f40824B = e14.f40835f.getInt("app_measurement_npa", e14.f40824B);
                            e14.f40825C = e14.f40835f.getInt("sd_app_measure_npa", e14.f40825C);
                            e14.f40826D = e14.f40835f.getLong("sd_app_measure_npa_ts", e14.f40826D);
                            e14.f40852x = e14.f40835f.getString("inspector_info", e14.f40852x);
                            e14.f40853y = e14.f40835f.getBoolean("linked_device", e14.f40853y);
                            e14.f40854z = e14.f40835f.getString("linked_ad_unit", e14.f40854z);
                            e14.f40823A = e14.f40835f.getString("inspector_ui_storage", e14.f40823A);
                            e14.f40840l = e14.f40835f.getString("IABTCF_TCString", e14.f40840l);
                            e14.f40841m = e14.f40835f.getInt("gad_has_consent_for_cookies", e14.f40841m);
                            e14.f40827E = e14.f40835f.getBoolean("is_install_referrer_reported", e14.f40827E);
                            e14.f40828F = e14.f40835f.getInt("total_inflight_ad_limit", e14.f40828F);
                            e14.f40829G = e14.f40835f.getInt("default_queue_capacity", e14.f40829G);
                            try {
                                e14.f40848t = new JSONObject(e14.f40835f.getString("native_advanced_settings", "{}"));
                            } catch (JSONException e15) {
                                int i = C.f40822b;
                                u2.i.g("Could not convert native advanced settings to json object", e15);
                            }
                            e14.j();
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    p2.j.f39798C.f39808h.d("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread", th2);
                    C.l("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", th2);
                    return;
                }
            default:
                ThreadFactoryC5206b threadFactoryC5206b = (ThreadFactoryC5206b) this.f38219v;
                if (threadFactoryC5206b.f41778d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.f38218u).run();
                    return;
                } catch (Throwable th3) {
                    threadFactoryC5206b.f41777c.getClass();
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th3);
                        return;
                    }
                    return;
                }
        }
    }

    public /* synthetic */ l(Object obj, Object obj2, int i, boolean z8) {
        this.f38217n = i;
        this.f38218u = obj;
        this.f38219v = obj2;
    }

    public l(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z8) {
        this.f38217n = 6;
        this.f38219v = swipeDismissBehavior;
        this.f38218u = view;
    }
}
