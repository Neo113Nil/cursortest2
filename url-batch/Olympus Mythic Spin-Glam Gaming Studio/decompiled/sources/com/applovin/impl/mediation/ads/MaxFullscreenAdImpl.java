package com.applovin.impl.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.c3;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.f2;
import com.applovin.impl.g0;
import com.applovin.impl.i;
import com.applovin.impl.j;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.n7;
import com.applovin.impl.r3;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.a;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.t1;
import com.applovin.impl.t2;
import com.applovin.impl.w3;
import com.applovin.impl.x3;
import com.applovin.impl.x4;
import com.applovin.impl.y2;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class MaxFullscreenAdImpl extends com.applovin.impl.mediation.ads.a implements a.InterfaceC0083a, j.b {
    private final a a;
    private final WeakReference b;
    private final b c;
    private final com.applovin.impl.mediation.b d;
    private final Object e;
    private c3 f;
    private c g;
    private final AtomicBoolean h;
    private final AtomicBoolean i;
    private g0 j;
    private long k;
    private boolean l;
    private boolean m;
    private String n;
    private String o;
    private String p;
    private WeakReference q;
    private WeakReference r;
    private WeakReference s;

    public interface a {
        Activity getActivity();
    }

    public enum c {
        IDLE,
        LOADING,
        READY,
        SHOWING,
        DESTROYED
    }

    public MaxFullscreenAdImpl(String str, MaxAdFormat maxAdFormat, a aVar, String str2, k kVar, Context context) {
        super(str, maxAdFormat, str2, kVar);
        this.e = new Object();
        this.f = null;
        this.g = c.IDLE;
        this.h = new AtomicBoolean();
        this.i = new AtomicBoolean();
        this.q = new WeakReference(null);
        this.r = new WeakReference(null);
        this.s = new WeakReference(null);
        this.a = aVar;
        this.c = createAdListenerWrapper();
        this.d = new com.applovin.impl.mediation.b(kVar);
        this.b = new WeakReference(context);
        kVar.j().a(this);
        o.g(str2, "Created new " + str2 + " (" + this + ")");
    }

    protected b createAdListenerWrapper() {
        return new b();
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        a(c.DESTROYED, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                MaxFullscreenAdImpl.this.c();
            }
        });
    }

    public boolean isReady() {
        boolean z;
        synchronized (this.e) {
            try {
                c3 c3Var = this.f;
                z = c3Var != null && c3Var.X() && this.g == c.READY;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            this.sdk.H().c(this.adUnitId);
        }
        return z;
    }

    public void loadAd() {
        loadAd(i.PUBLISHER_INITIATED);
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0083a
    public void onAdExpired(t1 t1Var) {
        if (o.a()) {
            this.logger.a(this.tag, "Ad expired " + getAdUnitId());
        }
        this.h.set(true);
        a aVar = this.a;
        Activity activity = aVar != null ? aVar.getActivity() : null;
        if (activity == null && (activity = this.sdk.e().b()) == null) {
            e();
            this.c.onAdLoadFailed(this.adUnitId, MaxAdapterError.MISSING_ACTIVITY);
        } else {
            this.extraParameters.put("expired_ad_ad_unit_id", getAdUnitId());
            this.sdk.X().loadAd(this.adUnitId, null, this.adFormat, i.EXPIRED, this.localExtraParameters, this.extraParameters, activity, this.c);
        }
    }

    @Override // com.applovin.impl.j.b
    public void onCreativeIdGenerated(String str, String str2) {
        c3 c3Var = this.f;
        if (c3Var == null || !c3Var.Q().equalsIgnoreCase(str)) {
            return;
        }
        this.f.h(str2);
        t2.b(this.adReviewListener, str2, this.f);
    }

    public void showAd(final String str, final String str2, final Activity activity) {
        c3 c3Var;
        List b2 = this.sdk.s0().b();
        if (!this.sdk.s0().d() || b2 == null || (c3Var = this.f) == null || b2.contains(c3Var.c())) {
            if (activity == null) {
                activity = this.sdk.u0();
            }
            if (a(activity, str)) {
                a(c.SHOWING, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        MaxFullscreenAdImpl.this.a(str, str2, activity);
                    }
                });
                return;
            }
            return;
        }
        final String str3 = "Attempting to show ad from <" + this.f.c() + "> which is not in the list of selected ad networks " + b2;
        o.h(this.tag, str3);
        a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                MaxFullscreenAdImpl.this.b(str3);
            }
        });
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.tag);
        sb.append("{adUnitId='");
        sb.append(this.adUnitId);
        sb.append('\'');
        sb.append(", adListener=");
        Object obj = this.adListener;
        if (obj == this.a) {
            obj = "this";
        }
        sb.append(obj);
        sb.append(", revenueListener=");
        sb.append(this.revenueListener);
        sb.append(", requestListener");
        sb.append(this.requestListener);
        sb.append(", adReviewListener");
        sb.append(this.adReviewListener);
        sb.append(", isReady=");
        sb.append(isReady());
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        c3 c3Var = this.f;
        a((MaxAd) c3Var);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (o.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + c3Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
        }
        t2.a(this.adListener, (MaxAd) c3Var, (MaxError) maxErrorImpl, true);
        this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, c3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        synchronized (this.e) {
            try {
                if (this.f != null) {
                    if (o.a()) {
                        this.logger.a(this.tag, "Destroying ad for '" + this.adUnitId + "'; current ad: " + this.f + "...");
                    }
                    this.sdk.X().destroyAd(this.f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.sdk.j().b(this);
        this.d.a();
        g0 g0Var = this.j;
        if (g0Var != null) {
            g0Var.a();
            this.j = null;
        }
        super.destroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (((Boolean) this.sdk.a(x4.C2)).booleanValue()) {
            this.sdk.p0().b(z4.R);
        }
        if (this.j != null) {
            this.sdk.p0().b(z4.S);
            this.j.a();
            this.j = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        c3 c3Var;
        if (this.h.compareAndSet(true, false)) {
            synchronized (this.e) {
                c3Var = this.f;
                this.f = null;
            }
            this.sdk.X().destroyAd(c3Var);
            this.extraParameters.remove("expired_ad_ad_unit_id");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        final Long l = (Long) this.sdk.a(x4.D2);
        if (l.longValue() <= 0) {
            return;
        }
        this.j = g0.a(l.longValue(), true, this.sdk, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                MaxFullscreenAdImpl.this.a(l);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Activity activity = (Activity) this.q.get();
        if (activity == null) {
            activity = this.sdk.u0();
        }
        Activity activity2 = activity;
        if (this.l) {
            showAd(this.n, this.o, (ViewGroup) this.r.get(), (Lifecycle) this.s.get(), activity2);
        } else {
            showAd(this.n, this.o, activity2);
        }
    }

    public void loadAd(final i iVar) {
        if (o.a()) {
            this.logger.a(this.tag, "Loading ad for '" + this.adUnitId + "'...");
        }
        if (this.g == c.DESTROYED) {
            boolean c2 = n7.c(this.sdk);
            this.sdk.D().a(d2.S0, "attemptingToLoadDestroyedAd", CollectionUtils.hashMap("details", "debug=" + c2));
            if (c2) {
                throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (!isReady()) {
            a aVar = this.a;
            final Activity activity = aVar != null ? aVar.getActivity() : null;
            final Context context = (Context) this.b.get();
            a(c.LOADING, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    MaxFullscreenAdImpl.this.a(activity, context, iVar);
                }
            });
            return;
        }
        if (o.a()) {
            this.logger.a(this.tag, "An ad is already loaded for '" + this.adUnitId + "'");
        }
        if (o.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdLoaded(ad=" + this.f + "), listener=" + this.adListener);
        }
        t2.f(this.adListener, (MaxAd) this.f, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity, Context context, i iVar) {
        Context context2;
        Context context3 = activity;
        if (activity == null) {
            if (context == null) {
                if (this.sdk.u0() != null) {
                    context3 = this.sdk.u0();
                } else {
                    context3 = k.o();
                }
            } else {
                context2 = context;
                this.sdk.X().loadAd(this.adUnitId, null, this.adFormat, iVar, this.localExtraParameters, this.extraParameters, context2, this.c);
            }
        }
        context2 = context3;
        this.sdk.X().loadAd(this.adUnitId, null, this.adFormat, iVar, this.localExtraParameters, this.extraParameters, context2, this.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(y2 y2Var) {
        if (((Boolean) this.sdk.a(x4.C2)).booleanValue()) {
            List b2 = y2Var.b("mappk_urls");
            if (CollectionUtils.isEmpty(b2)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putLong(jSONObject, "timestamp_ms", System.currentTimeMillis());
            JsonUtils.putJsonArray(jSONObject, "app_killed_urls", new JSONArray((Collection) b2));
            JsonUtils.putJSONObject(jSONObject, "ad_info", new JSONObject(f2.a(y2Var)));
            JsonUtils.putJSONObject(jSONObject, "user_info", new JSONObject(w3.a(y2Var, this.sdk)));
            this.sdk.p0().b(z4.R, jSONObject.toString());
        }
    }

    protected class b implements MaxAdListener, MaxAdRevenueListener, a.InterfaceC0079a {
        protected b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(c3 c3Var, MaxAd maxAd) {
            if (MaxFullscreenAdImpl.this.m) {
                o oVar = MaxFullscreenAdImpl.this.logger;
                if (o.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "Attempting ad failover");
                }
                c3Var.j(MaxFullscreenAdImpl.this.p);
                MaxFullscreenAdImpl.this.sdk.P().a(d2.z0, c3Var, CollectionUtils.hashMap("details", MaxFullscreenAdImpl.this.p));
                MaxFullscreenAdImpl.this.g();
                return;
            }
            o oVar2 = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl2.logger.a(maxFullscreenAdImpl2.tag, "MaxAdListener.onAdLoaded(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            t2.f(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            o oVar = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdClicked(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            t2.a(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(final MaxAd maxAd, final MaxError maxError) {
            final c3 c3Var = (c3) maxAd;
            MaxFullscreenAdImpl.this.d();
            final boolean z = MaxFullscreenAdImpl.this.m;
            if (z) {
                o oVar = MaxFullscreenAdImpl.this.logger;
                if (o.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.b(maxFullscreenAdImpl.tag, "Ad failover failed");
                }
                MaxFullscreenAdImpl.this.sdk.P().a(d2.B0, c3Var, CollectionUtils.hashMap("details", c3Var.u0()));
                MaxFullscreenAdImpl.this.m = false;
            }
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$b$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    MaxFullscreenAdImpl.b.this.a(maxAd, z, c3Var, maxError);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            final c3 c3Var = (c3) maxAd;
            if (MaxFullscreenAdImpl.this.m) {
                o oVar = MaxFullscreenAdImpl.this.logger;
                if (o.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "Ad failover succeeded");
                }
                MaxFullscreenAdImpl.this.sdk.P().a(d2.A0, c3Var, CollectionUtils.hashMap("details", c3Var.u0()));
                MaxFullscreenAdImpl.this.m = false;
            }
            MaxFullscreenAdImpl.this.sdk.f().a(c3Var);
            MaxFullscreenAdImpl.this.b(c3Var);
            MaxFullscreenAdImpl.this.f();
            if (((Integer) MaxFullscreenAdImpl.this.sdk.a(r3.p8)).intValue() > 0) {
                MaxFullscreenAdImpl.this.sdk.q0().b(new r6(MaxFullscreenAdImpl.this.sdk, "ReportAdHiddenCallbackNotCalled", new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$b$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        MaxFullscreenAdImpl.b.this.a(c3Var);
                    }
                }), d6.b.TIMEOUT, TimeUnit.SECONDS.toMillis(r1.intValue()));
            }
            o oVar2 = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl2.logger.a(maxFullscreenAdImpl2.tag, "MaxAdListener.onAdDisplayed(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            t2.c(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(final MaxAd maxAd) {
            MaxFullscreenAdImpl.this.m = false;
            MaxFullscreenAdImpl.this.d();
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$b$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MaxFullscreenAdImpl.b.this.a(maxAd);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, final MaxError maxError) {
            MaxFullscreenAdImpl.this.e();
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$b$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    MaxFullscreenAdImpl.b.this.a(str, maxError);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(final MaxAd maxAd) {
            c3 c3Var;
            synchronized (MaxFullscreenAdImpl.this.e) {
                c3Var = MaxFullscreenAdImpl.this.f;
            }
            MaxFullscreenAdImpl.this.sdk.H().a(MaxFullscreenAdImpl.this.adUnitId);
            final c3 c3Var2 = (c3) maxAd;
            MaxFullscreenAdImpl.this.a(c3Var2);
            if (!MaxFullscreenAdImpl.this.h.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.a(c.READY, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$b$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        MaxFullscreenAdImpl.b.this.a(c3Var2, maxAd);
                    }
                });
                return;
            }
            MaxFullscreenAdImpl.this.extraParameters.remove("expired_ad_ad_unit_id");
            if (MaxFullscreenAdImpl.this.i.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.g();
            }
            o oVar = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onExpiredAdReloaded(expiredAd=" + c3Var + ", newAd=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.expirationListener);
            }
            t2.a(MaxFullscreenAdImpl.this.expirationListener, (MaxAd) c3Var, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            o oVar = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdRequestListener.onAdRequestStarted(adUnitId=" + str + "), listener=" + MaxFullscreenAdImpl.this.requestListener);
            }
            t2.a(MaxFullscreenAdImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            o oVar = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.revenueListener);
            }
            t2.a(MaxFullscreenAdImpl.this.revenueListener, maxAd, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(String str, MaxError maxError) {
            o oVar = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            t2.a(MaxFullscreenAdImpl.this.adListener, str, maxError, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(c3 c3Var) {
            if (c3Var.w().get()) {
                return;
            }
            MaxFullscreenAdImpl.this.sdk.P().a(d2.t0, c3Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd) {
            MaxFullscreenAdImpl.this.a(maxAd);
            o oVar = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdHidden(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            t2.e(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd, boolean z, c3 c3Var, MaxError maxError) {
            MaxFullscreenAdImpl.this.a(maxAd);
            if (!z && c3Var.z0()) {
                if (MaxFullscreenAdImpl.this.b()) {
                    AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$b$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            MaxFullscreenAdImpl.b.this.a();
                        }
                    });
                    return;
                }
                o oVar = MaxFullscreenAdImpl.this.logger;
                if (o.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.b(maxFullscreenAdImpl.tag, "Unable to attempt ad failover due to missing cached ad");
                }
                MaxFullscreenAdImpl.this.sdk.P().a(d2.y0, c3Var);
            }
            o oVar2 = MaxFullscreenAdImpl.this.logger;
            if (o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl2.logger.a(maxFullscreenAdImpl2.tag, "MaxAdListener.onAdDisplayFailed(ad=" + maxAd + ", error=" + maxError + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            t2.a(MaxFullscreenAdImpl.this.adListener, maxAd, maxError, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            MaxFullscreenAdImpl.this.m = true;
            MaxFullscreenAdImpl.this.loadAd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, Activity activity) {
        a(str, str2);
        this.l = false;
        this.q = new WeakReference(activity);
        this.sdk.X().showFullscreenAd(this.f, activity, this.localExtraParameters, this.extraParameters, this.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        if (this.sdk.R() != null) {
            return this.sdk.R().e(this.adUnitId);
        }
        return this.sdk.Q().d(this.adUnitId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, Activity activity, ViewGroup viewGroup, Lifecycle lifecycle) {
        a(str, str2);
        this.l = true;
        this.q = new WeakReference(activity);
        this.r = new WeakReference(viewGroup);
        this.s = new WeakReference(lifecycle);
        this.sdk.X().showFullscreenAd(this.f, viewGroup, lifecycle, activity, this.localExtraParameters, this.extraParameters, this.c);
    }

    public void showAd(final String str, final String str2, final ViewGroup viewGroup, final Lifecycle lifecycle, Activity activity) {
        c3 c3Var;
        if (viewGroup != null && lifecycle != null) {
            if (!viewGroup.isShown() && ((Boolean) this.sdk.a(r3.k8)).booleanValue()) {
                o.h(this.tag, "Attempting to show ad when containerView and/or its ancestors are not visible");
                MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, "Attempting to show ad when containerView and/or its ancestors are not visible");
                t2.a(this.adListener, (MaxAd) this.f, (MaxError) maxErrorImpl, true);
                this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f);
                return;
            }
            List b2 = this.sdk.s0().b();
            if (this.sdk.s0().d() && b2 != null && (c3Var = this.f) != null && !b2.contains(c3Var.c())) {
                final String str3 = "Attempting to show ad from <" + this.f.c() + "> which is not in the list of selected ad networks " + b2;
                o.h(this.tag, str3);
                a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        MaxFullscreenAdImpl.this.c(str3);
                    }
                });
                return;
            }
            if (activity == null) {
                activity = this.sdk.u0();
            }
            final Activity activity2 = activity;
            if (a(activity2, str)) {
                a(c.SHOWING, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        MaxFullscreenAdImpl.this.a(str, str2, activity2, viewGroup, lifecycle);
                    }
                });
                return;
            }
            return;
        }
        o.h(this.tag, "Attempting to show ad with null containerView or lifecycle.");
        MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-1, "Attempting to show ad with null containerView or lifecycle.");
        if (o.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.f + ", error=" + maxErrorImpl2 + "), listener=" + this.adListener);
        }
        t2.a(this.adListener, (MaxAd) this.f, (MaxError) maxErrorImpl2, true);
        this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        c3 c3Var = this.f;
        a((MaxAd) c3Var);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (o.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + c3Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
        }
        t2.a(this.adListener, (MaxAd) c3Var, (MaxError) maxErrorImpl, true);
        this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, c3Var);
    }

    private boolean a(Activity activity, final String str) {
        if (activity == null && MaxAdFormat.APP_OPEN != this.adFormat) {
            throw new IllegalArgumentException("Attempting to show ad without a valid activity.");
        }
        if (this.g == c.DESTROYED) {
            boolean c2 = n7.c(this.sdk);
            this.sdk.D().a(d2.S0, "attemptingToShowDestroyedAd", CollectionUtils.hashMap("details", "debug=" + c2));
            if (c2) {
                throw new IllegalStateException("Attempting to show ad that is destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (!isReady()) {
            String str2 = "Attempting to show ad before it is ready - please check ad readiness using " + this.tag + "#isReady()";
            o.h(this.tag, str2);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, str2);
            x3 x3Var = new x3(this.adUnitId, this.adFormat, str);
            if (o.a()) {
                this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + x3Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            t2.a(this.adListener, (MaxAd) x3Var, (MaxError) maxErrorImpl, true);
            if (this.f != null) {
                this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f);
            }
            return false;
        }
        Long l = (Long) this.sdk.a(r3.V7);
        Long l2 = (Long) this.sdk.a(r3.O7);
        if (l.longValue() > 0 && (this.f.getTimeToLiveMillis() < l2.longValue() || this.h.get())) {
            this.i.set(true);
            this.sdk.q0().a(new r6(this.sdk, "handleShowOnLoadTimeoutError", new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    MaxFullscreenAdImpl.this.a(str);
                }
            }), d6.b.TIMEOUT, l.longValue());
            return false;
        }
        if (n7.a(k.o()) != 0 && this.sdk.n0().shouldFailAdDisplayIfDontKeepActivitiesIsEnabled()) {
            if (!n7.c(this.sdk)) {
                if (((Boolean) this.sdk.a(r3.j8)).booleanValue()) {
                    o.h(this.tag, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-5602, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    if (o.a()) {
                        this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.f + ", error=" + maxErrorImpl2 + "), listener=" + this.adListener);
                    }
                    t2.a(this.adListener, (MaxAd) this.f, (MaxError) maxErrorImpl2, true);
                    this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f);
                    return false;
                }
            } else {
                throw new IllegalStateException("Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
            }
        }
        if (!this.sdk.H().e() && !this.sdk.H().d()) {
            return true;
        }
        o.h(this.tag, "Attempting to show ad when another fullscreen ad is already showing");
        MaxErrorImpl maxErrorImpl3 = new MaxErrorImpl(-23, "Attempting to show ad when another fullscreen ad is already showing");
        if (o.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.f + ", error=" + maxErrorImpl3 + "), listener=" + this.adListener);
        }
        t2.a(this.adListener, (MaxAd) this.f, (MaxError) maxErrorImpl3, true);
        this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl3, this.f);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        if (this.i.compareAndSet(true, false)) {
            o.h(this.tag, "Failed to show an ad. Failed to load an ad in time to show.");
            this.sdk.H().c(this.adUnitId);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, "Failed to show an ad. Failed to load an ad in time to show.");
            x3 x3Var = new x3(this.adUnitId, this.adFormat, str);
            if (o.a()) {
                this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + x3Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            t2.a(this.adListener, (MaxAd) x3Var, (MaxError) maxErrorImpl, true);
            if (this.f != null) {
                this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f);
            }
        }
    }

    private void a(String str, String str2) {
        this.d.e(this.f);
        this.f.g(str);
        this.f.f(str2);
        this.n = str;
        this.o = str2;
        this.p = this.f.getNetworkName();
        this.sdk.y().d(this.f);
        if (o.a()) {
            this.logger.a(this.tag, "Showing ad for '" + this.adUnitId + "'; loaded ad: " + this.f + "...");
        }
        a((y2) this.f);
    }

    private void a() {
        c3 c3Var;
        synchronized (this.e) {
            c3Var = this.f;
            this.f = null;
        }
        this.sdk.X().destroyAd(c3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l) {
        this.k += l.longValue();
        this.sdk.p0().b(z4.S, Long.valueOf(this.k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c3 c3Var) {
        if (this.sdk.f().a(c3Var, this)) {
            if (o.a()) {
                this.logger.a(this.tag, "Handle ad loaded for regular ad: " + c3Var);
            }
            this.f = c3Var;
            return;
        }
        if (o.a()) {
            this.logger.a(this.tag, "Loaded an expired ad, running expire logic...");
        }
        onAdExpired(c3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c cVar, Runnable runnable) {
        boolean z;
        c cVar2 = this.g;
        synchronized (this.e) {
            try {
                c cVar3 = c.IDLE;
                if (cVar2 == cVar3) {
                    if (cVar != c.LOADING && cVar != c.DESTROYED) {
                        if (cVar == c.SHOWING) {
                            o.h(this.tag, "No ad is loading or loaded");
                        } else if (o.a()) {
                            this.logger.b(this.tag, "Unable to transition to: " + cVar);
                        }
                        z = false;
                    }
                    z = true;
                } else {
                    c cVar4 = c.LOADING;
                    if (cVar2 == cVar4) {
                        if (cVar != cVar3) {
                            if (cVar == cVar4) {
                                o.h(this.tag, "An ad is already loading");
                            } else if (cVar != c.READY) {
                                if (cVar == c.SHOWING) {
                                    o.h(this.tag, "An ad is not ready to be shown yet");
                                } else if (cVar != c.DESTROYED) {
                                    if (o.a()) {
                                        this.logger.b(this.tag, "Unable to transition to: " + cVar);
                                    }
                                }
                            }
                            z = false;
                        }
                        z = true;
                    } else {
                        c cVar5 = c.READY;
                        if (cVar2 == cVar5) {
                            if (cVar != cVar3) {
                                if (cVar == cVar4) {
                                    o.h(this.tag, "An ad is already loaded");
                                } else if (cVar == cVar5) {
                                    if (o.a()) {
                                        this.logger.b(this.tag, "An ad is already marked as ready");
                                    }
                                } else if (cVar != c.SHOWING && cVar != c.DESTROYED) {
                                    if (o.a()) {
                                        this.logger.b(this.tag, "Unable to transition to: " + cVar);
                                    }
                                }
                                z = false;
                            }
                            z = true;
                        } else {
                            c cVar6 = c.SHOWING;
                            if (cVar2 == cVar6) {
                                if (cVar != cVar3) {
                                    if (cVar == cVar4) {
                                        o.h(this.tag, "Can not load another ad while the ad is showing");
                                    } else if (cVar == cVar5) {
                                        if (o.a()) {
                                            this.logger.b(this.tag, "An ad is already showing, ignoring");
                                        }
                                    } else if (cVar == cVar6) {
                                        o.h(this.tag, "The ad is already showing, not showing another one");
                                    } else if (cVar != c.DESTROYED) {
                                        if (o.a()) {
                                            this.logger.b(this.tag, "Unable to transition to: " + cVar);
                                        }
                                    }
                                }
                                z = true;
                            } else if (cVar2 == c.DESTROYED) {
                                o.h(this.tag, "No operations are allowed on a destroyed instance");
                            } else if (o.a()) {
                                this.logger.b(this.tag, "Unknown state: " + this.g);
                            }
                            z = false;
                        }
                    }
                }
                if (z) {
                    if (o.a()) {
                        this.logger.a(this.tag, "Transitioning from " + this.g + " to " + cVar + "...");
                    }
                    this.g = cVar;
                } else if (o.a()) {
                    this.logger.k(this.tag, "Not allowed to transition from " + this.g + " to " + cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.sdk.f().a((c3) maxAd);
        this.d.a();
        a();
        this.sdk.a0().a((y2) maxAd);
    }
}
