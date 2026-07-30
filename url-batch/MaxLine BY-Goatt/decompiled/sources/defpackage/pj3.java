package defpackage;

import android.app.Application;
import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.encoders.json.BuildConfig;
import com.google.firebase.messaging.Constants;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pj3 implements qk3 {
    public static volatile pj3 Q;
    public final om3 A;
    public final String B;
    public lh3 C;
    public jo3 D;
    public ed3 E;
    public gh3 F;
    public pm3 G;
    public Boolean I;
    public long J;
    public volatile Boolean K;
    public volatile boolean L;
    public int M;
    public int N;
    public final long P;
    public final Context m;
    public final boolean n;
    public final dq2 o;
    public final ec3 p;
    public final qi3 q;
    public final vh3 r;
    public final lj3 s;
    public final ep3 t;
    public final zq3 u;
    public final nh3 v;
    public final qb2 w;
    public final dn3 x;
    public final jm3 y;
    public final se3 z;
    public boolean H = false;
    public final AtomicInteger O = new AtomicInteger(0);

    public pj3(el3 el3Var) {
        pq2 pq2Var;
        Context context;
        boolean z = false;
        Context context2 = el3Var.a;
        dq2 dq2Var = new dq2(18);
        this.o = dq2Var;
        uj2.b = dq2Var;
        this.m = context2;
        this.n = el3Var.e;
        this.K = el3Var.b;
        this.B = el3Var.g;
        int i = 1;
        this.L = true;
        if (tl3.h == null && context2 != null) {
            Object obj = tl3.g;
            synchronized (obj) {
                try {
                    if (tl3.h == null) {
                        synchronized (obj) {
                            zk3 zk3Var = tl3.h;
                            Context applicationContext = context2.getApplicationContext();
                            if (applicationContext == null) {
                                applicationContext = context2;
                            }
                            if (zk3Var != null) {
                                if (zk3Var.a != applicationContext) {
                                }
                            }
                            if (zk3Var != null) {
                                dl3.c();
                                wl3.a();
                                synchronized (kl3.class) {
                                    try {
                                        kl3 kl3Var = kl3.e;
                                        if (kl3Var != null && (context = (Context) kl3Var.c) != null && ((il3) kl3Var.d) != null && kl3Var.b) {
                                            context.getContentResolver().unregisterContentObserver((il3) kl3.e.d);
                                        }
                                        kl3.e = null;
                                    } finally {
                                    }
                                }
                            }
                            u9 u9Var = new u9(applicationContext, 3);
                            if (u9Var instanceof Serializable) {
                                pq2Var = new qq2(u9Var);
                            } else {
                                rq2 rq2Var = new rq2();
                                rq2Var.m = u9Var;
                                pq2Var = rq2Var;
                            }
                            tl3.h = new zk3(applicationContext, pq2Var);
                            tl3.i.incrementAndGet();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                } finally {
                }
            }
        }
        this.w = qb2.N;
        Long l = el3Var.f;
        this.P = l != null ? l.longValue() : System.currentTimeMillis();
        ec3 ec3Var = new ec3(this);
        ec3Var.p = dq2.o;
        this.p = ec3Var;
        qi3 qi3Var = new qi3(this);
        qi3Var.z();
        this.q = qi3Var;
        vh3 vh3Var = new vh3(this);
        vh3Var.z();
        this.r = vh3Var;
        zq3 zq3Var = new zq3(this);
        zq3Var.z();
        this.u = zq3Var;
        this.v = new nh3(new ti3(el3Var, this));
        this.z = new se3(this);
        dn3 dn3Var = new dn3(this);
        dn3Var.y();
        this.x = dn3Var;
        jm3 jm3Var = new jm3(this);
        jm3Var.y();
        this.y = jm3Var;
        ep3 ep3Var = new ep3(this);
        ep3Var.y();
        this.t = ep3Var;
        om3 om3Var = new om3(this);
        om3Var.z();
        this.A = om3Var;
        lj3 lj3Var = new lj3(this);
        lj3Var.z();
        this.s = lj3Var;
        ye3 ye3Var = el3Var.d;
        boolean z2 = ye3Var == null || ye3Var.n == 0;
        if (context2.getApplicationContext() instanceof Application) {
            l(jm3Var);
            if (((pj3) jm3Var.m).m.getApplicationContext() instanceof Application) {
                Application application = (Application) ((pj3) jm3Var.m).m.getApplicationContext();
                if (jm3Var.o == null) {
                    jm3Var.o = new cg3(i, jm3Var);
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(jm3Var.o);
                    application.registerActivityLifecycleCallbacks(jm3Var.o);
                    vh3 vh3Var2 = ((pj3) jm3Var.m).r;
                    m(vh3Var2);
                    vh3Var2.z.b("Registered activity lifecycle callback");
                }
            }
        } else {
            m(vh3Var);
            vh3Var.u.b("Application context is not an Application");
        }
        lj3Var.F(new iu0(21, this, el3Var, z));
    }

    public static final void j(bg3 bg3Var) {
        if (bg3Var != null) {
            return;
        }
        lh.g("Component not created");
    }

    public static final void k(rp3 rp3Var) {
        if (rp3Var != null) {
            return;
        }
        lh.g("Component not created");
    }

    public static final void l(xg3 xg3Var) {
        if (xg3Var == null) {
            lh.g("Component not created");
        } else {
            if (xg3Var.n) {
                return;
            }
            lh.g("Component not initialized: ".concat(String.valueOf(xg3Var.getClass())));
        }
    }

    public static final void m(ok3 ok3Var) {
        if (ok3Var == null) {
            lh.g("Component not created");
        } else {
            if (ok3Var.n) {
                return;
            }
            lh.g("Component not initialized: ".concat(String.valueOf(ok3Var.getClass())));
        }
    }

    public static pj3 s(Context context, ye3 ye3Var, Long l) {
        Bundle bundle;
        if (ye3Var != null) {
            Bundle bundle2 = ye3Var.p;
            ye3Var = new ye3(ye3Var.m, ye3Var.n, ye3Var.o, bundle2, null);
        }
        ll3.v(context);
        ll3.v(context.getApplicationContext());
        if (Q == null) {
            synchronized (pj3.class) {
                try {
                    if (Q == null) {
                        Q = new pj3(new el3(context, ye3Var, l));
                    }
                } finally {
                }
            }
        } else if (ye3Var != null && (bundle = ye3Var.p) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            ll3.v(Q);
            Q.K = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        ll3.v(Q);
        return Q;
    }

    @Override // defpackage.qk3
    public final vh3 a() {
        vh3 vh3Var = this.r;
        m(vh3Var);
        return vh3Var;
    }

    public final boolean b() {
        return g() == 0;
    }

    @Override // defpackage.qk3
    public final lj3 c() {
        lj3 lj3Var = this.s;
        m(lj3Var);
        return lj3Var;
    }

    @Override // defpackage.qk3
    public final Context d() {
        return this.m;
    }

    @Override // defpackage.qk3
    public final qb2 e() {
        return this.w;
    }

    @Override // defpackage.qk3
    public final dq2 f() {
        return this.o;
    }

    public final int g() {
        lj3 lj3Var = this.s;
        m(lj3Var);
        lj3Var.v();
        ec3 ec3Var = this.p;
        if (ec3Var.J()) {
            return 1;
        }
        m(lj3Var);
        lj3Var.v();
        if (!this.L) {
            return 8;
        }
        qi3 qi3Var = this.q;
        k(qi3Var);
        qi3Var.v();
        Boolean valueOf = qi3Var.A().contains("measurement_enabled") ? Boolean.valueOf(qi3Var.A().getBoolean("measurement_enabled", true)) : null;
        if (valueOf != null) {
            return valueOf.booleanValue() ? 0 : 3;
        }
        dq2 dq2Var = ((pj3) ec3Var.m).o;
        Boolean I = ec3Var.I("firebase_analytics_collection_enabled");
        return I != null ? I.booleanValue() ? 0 : 4 : (this.K == null || this.K.booleanValue()) ? 0 : 7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r7.J) > 1000) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h() {
        boolean z = false;
        if (!this.H) {
            lh.g("AppMeasurement is not initialized");
            return false;
        }
        lj3 lj3Var = this.s;
        m(lj3Var);
        lj3Var.v();
        Boolean bool = this.I;
        qb2 qb2Var = this.w;
        if (bool != null && this.J != 0) {
            if (!bool.booleanValue()) {
                qb2Var.getClass();
            }
            return this.I.booleanValue();
        }
        qb2Var.getClass();
        this.J = SystemClock.elapsedRealtime();
        zq3 zq3Var = this.u;
        k(zq3Var);
        if (zq3Var.U("android.permission.INTERNET") && zq3Var.U("android.permission.ACCESS_NETWORK_STATE")) {
            Context context = this.m;
            if (i93.a(context).d() || this.p.z() || (zq3.n0(context) && zq3.P(context))) {
                z = true;
            }
        }
        this.I = Boolean.valueOf(z);
        if (z) {
            this.I = Boolean.valueOf(zq3Var.A(r().D()));
        }
        return this.I.booleanValue();
    }

    public final void i(int i, Throwable th, byte[] bArr) {
        vh3 vh3Var;
        vh3 vh3Var2;
        int i2 = i;
        vh3 vh3Var3 = this.r;
        if (i2 != 200 && i2 != 204) {
            if (i2 == 304) {
                i2 = 304;
            }
            m(vh3Var3);
            vh3Var3.u.d(Integer.valueOf(i2), th, "Network Request for Deferred Deep Link failed. response, exception");
        }
        if (th == null) {
            qi3 qi3Var = this.q;
            k(qi3Var);
            qi3Var.F.b(true);
            if (bArr == null || bArr.length == 0) {
                m(vh3Var3);
                vh3Var3.y.b("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString(SDKConstants.PARAM_TOURNAMENTS_DEEPLINK, BuildConfig.FLAVOR);
                if (TextUtils.isEmpty(optString)) {
                    m(vh3Var3);
                    vh3Var3.y.b("Deferred Deep Link is empty.");
                    return;
                }
                String optString2 = jSONObject.optString("gclid", BuildConfig.FLAVOR);
                String optString3 = jSONObject.optString("gbraid", BuildConfig.FLAVOR);
                String optString4 = jSONObject.optString("gad_source", BuildConfig.FLAVOR);
                double optDouble = jSONObject.optDouble(SDKConstants.PARAM_DEBUG_MESSAGE_TIMESTAMP, 0.0d);
                Bundle bundle = new Bundle();
                zq3 zq3Var = this.u;
                k(zq3Var);
                pj3 pj3Var = (pj3) zq3Var.m;
                if (TextUtils.isEmpty(optString)) {
                    vh3Var2 = vh3Var3;
                } else {
                    Context context = pj3Var.m;
                    vh3Var2 = vh3Var3;
                    try {
                        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                        if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                            if (!TextUtils.isEmpty(optString3)) {
                                bundle.putString("gbraid", optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                bundle.putString("gad_source", optString4);
                            }
                            bundle.putString("gclid", optString2);
                            bundle.putString("_cis", "ddp");
                            this.y.D("auto", Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundle);
                            if (TextUtils.isEmpty(optString)) {
                                return;
                            }
                            try {
                                SharedPreferences.Editor edit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString(SDKConstants.PARAM_TOURNAMENTS_DEEPLINK, optString);
                                edit.putLong(SDKConstants.PARAM_DEBUG_MESSAGE_TIMESTAMP, Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                    Context context2 = pj3Var.m;
                                    if (Build.VERSION.SDK_INT < 34) {
                                        context2.sendBroadcast(intent);
                                        return;
                                    } else {
                                        context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                        return;
                                    }
                                }
                                return;
                            } catch (RuntimeException e) {
                                vh3 vh3Var4 = ((pj3) zq3Var.m).r;
                                m(vh3Var4);
                                vh3Var4.r.c(e, "Failed to persist Deferred Deep Link. exception");
                                return;
                            }
                        }
                    } catch (JSONException e2) {
                        e = e2;
                        vh3Var = vh3Var2;
                        m(vh3Var);
                        vh3Var.r.c(e, "Failed to parse the Deferred Deep Link response. exception");
                        return;
                    }
                }
                m(vh3Var2);
                vh3Var = vh3Var2;
                try {
                    vh3Var.u.e("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                    return;
                } catch (JSONException e3) {
                    e = e3;
                    m(vh3Var);
                    vh3Var.r.c(e, "Failed to parse the Deferred Deep Link response. exception");
                    return;
                }
            } catch (JSONException e4) {
                e = e4;
                vh3Var = vh3Var3;
            }
        }
        m(vh3Var3);
        vh3Var3.u.d(Integer.valueOf(i2), th, "Network Request for Deferred Deep Link failed. response, exception");
    }

    public final nh3 n() {
        return this.v;
    }

    public final lh3 o() {
        l(this.C);
        return this.C;
    }

    public final jo3 p() {
        l(this.D);
        return this.D;
    }

    public final ed3 q() {
        m(this.E);
        return this.E;
    }

    public final gh3 r() {
        l(this.F);
        return this.F;
    }
}
