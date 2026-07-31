package com.ironsource;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.InterfaceC1531p0;
import com.ironsource.b9;
import com.ironsource.ci;
import com.ironsource.fh;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.C1561e;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class wj implements hr, v9, u9, s9, t9, ck, po {

    /* renamed from: m, reason: collision with root package name */
    private static final String f20202m = "IronSourceAdsPublisherAgent";

    /* renamed from: n, reason: collision with root package name */
    private static wj f20203n;

    /* renamed from: a, reason: collision with root package name */
    private C1561e f20204a;

    /* renamed from: b, reason: collision with root package name */
    private String f20205b;

    /* renamed from: c, reason: collision with root package name */
    private String f20206c;

    /* renamed from: d, reason: collision with root package name */
    private wa f20207d;

    /* renamed from: e, reason: collision with root package name */
    private qn f20208e;

    /* renamed from: g, reason: collision with root package name */
    private e9 f20210g;

    /* renamed from: f, reason: collision with root package name */
    private boolean f20209f = false;

    /* renamed from: h, reason: collision with root package name */
    private FeaturesManager f20211h = FeaturesManager.getInstance();

    /* renamed from: i, reason: collision with root package name */
    private ci.a f20212i = nm.M().g();

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC1531p0.a f20213j = nm.M().E();

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC1531p0 f20214k = nm.S().F();

    /* renamed from: l, reason: collision with root package name */
    private dh f20215l = nm.S().z();

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f20216a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f20217b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ va f20218c;

        a(String str, String str2, va vaVar) {
            this.f20216a = str;
            this.f20217b = str2;
            this.f20218c = vaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            wj.this.f20204a.a(this.f20216a, this.f20217b, this.f20218c, (v9) wj.this);
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f20220a;

        b(JSONObject jSONObject) {
            this.f20220a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            wj.this.f20204a.a(this.f20220a, (v9) wj.this);
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f20222a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f20223b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ va f20224c;

        c(String str, String str2, va vaVar) {
            this.f20222a = str;
            this.f20223b = str2;
            this.f20224c = vaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            wj.this.f20204a.a(this.f20222a, this.f20223b, this.f20224c, (u9) wj.this);
        }
    }

    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f20226a;

        d(String str) {
            this.f20226a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            wj.this.f20204a.a(this.f20226a, wj.this);
        }
    }

    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f20228a;

        e(JSONObject jSONObject) {
            this.f20228a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            wj.this.f20204a.a(this.f20228a, (u9) wj.this);
        }
    }

    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ sj f20230a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f20231b;

        f(sj sjVar, Map map) {
            this.f20230a = sjVar;
            this.f20231b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            fh.e eVar = this.f20230a.i() ? fh.e.Banner : fh.e.Interstitial;
            va a4 = wj.this.f20207d.a(eVar, this.f20230a);
            hh hhVar = new hh();
            hhVar.a(cc.f15752x, Boolean.valueOf(this.f20230a.j())).a(cc.f15714G, Boolean.valueOf(this.f20230a.m())).a(cc.f15750v, this.f20230a.g()).a(cc.f15751w, dk.a(this.f20230a)).a(cc.f15716I, Long.valueOf(C1508m0.f17128a.b(this.f20230a.e())));
            mh.a(fr.f16280h, hhVar.a());
            if (eVar == fh.e.Banner) {
                wj.this.f20204a.a(wj.this.f20205b, wj.this.f20206c, a4, (t9) wj.this);
                wj.this.f20204a.a(a4, this.f20231b, (t9) wj.this);
            } else {
                wj.this.f20204a.a(wj.this.f20205b, wj.this.f20206c, a4, (u9) wj.this);
                wj.this.f20204a.b(a4, this.f20231b, wj.this);
            }
        }
    }

    class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ va f20233a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f20234b;

        g(va vaVar, Map map) {
            this.f20233a = vaVar;
            this.f20234b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            wj.this.f20204a.a(this.f20233a, this.f20234b, (u9) wj.this);
        }
    }

    class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ sj f20236a;

        h(sj sjVar) {
            this.f20236a = sjVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            fh.e eVar = this.f20236a.i() ? fh.e.Banner : fh.e.Interstitial;
            va a4 = wj.this.f20207d.a(eVar, this.f20236a);
            hh hhVar = new hh();
            hhVar.a(cc.f15752x, Boolean.valueOf(this.f20236a.j())).a(cc.f15750v, this.f20236a.g()).a(cc.f15751w, dk.a(this.f20236a)).a("isMultipleAdObjects", Boolean.valueOf(this.f20236a.l()));
            mh.a(fr.f16285m, hhVar.a());
            if (eVar == fh.e.Banner) {
                wj.this.f20204a.a(a4);
            } else {
                a4.a(false);
                wj.this.f20204a.b(a4);
            }
        }
    }

    private wj(Context context, int i4) {
        c(context);
    }

    public static ck a(Context context, String str, String str2) {
        return a(str, str2, context);
    }

    private mo b(va vaVar) {
        if (vaVar == null) {
            return null;
        }
        return (mo) vaVar.i();
    }

    private ro c(va vaVar) {
        if (vaVar == null) {
            return null;
        }
        return (ro) vaVar.i();
    }

    private va d(fh.e eVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f20207d.a(eVar, str);
    }

    @Override // com.ironsource.u9
    public void onInterstitialAdRewarded(String str, int i4) {
        va d4 = d(fh.e.Interstitial, str);
        mo b4 = b(d4);
        if (d4 == null || b4 == null) {
            return;
        }
        b4.onInterstitialAdRewarded(str, i4);
    }

    @Override // com.ironsource.hr, com.ironsource.ck
    public void onPause(Activity activity) {
        if (this.f20209f) {
            return;
        }
        b(activity);
    }

    @Override // com.ironsource.hr, com.ironsource.ck
    public void onResume(Activity activity) {
        if (this.f20209f) {
            return;
        }
        c(activity);
    }

    wj(String str, String str2, Context context) {
        this.f20205b = str;
        this.f20206c = str2;
        c(context);
    }

    public static synchronized ck a(String str, String str2, Context context) {
        wj wjVar;
        synchronized (wj.class) {
            try {
                if (f20203n == null) {
                    mh.a(fr.f16273a);
                    f20203n = new wj(str, str2, context);
                }
                wjVar = f20203n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wjVar;
    }

    private ko a(va vaVar) {
        if (vaVar == null) {
            return null;
        }
        return (ko) vaVar.i();
    }

    public static synchronized wj b(Context context) {
        wj a4;
        synchronized (wj.class) {
            a4 = a(context, 0);
        }
        return a4;
    }

    @Override // com.ironsource.po
    public void c(Activity activity) {
        this.f20210g.a(activity);
        this.f20204a.f();
        this.f20204a.b(activity);
    }

    @Override // com.ironsource.v9
    public void d(String str, String str2) {
        ro c4;
        va d4 = d(fh.e.RewardedVideo, str);
        if (d4 == null || (c4 = c(d4)) == null) {
            return;
        }
        c4.a(str2);
    }

    private void c(Context context) {
        try {
            SDKUtils.getNetworkConfiguration();
            jk.a(context);
            IronSourceStorageUtils.initializeCacheDirectory(context, new st(SDKUtils.getNetworkConfiguration().optJSONObject(b9.a.f15297k)));
            jk.e().d(SDKUtils.getSDKVersion());
            this.f20207d = new wa();
            e9 e9Var = new e9();
            this.f20210g = e9Var;
            if (context instanceof Activity) {
                e9Var.a((Activity) context);
            }
            int debugMode = this.f20211h.getDebugMode();
            this.f20208e = new qn();
            this.f20204a = new C1561e(context, this.f20210g, this.f20207d, ig.f16710a, debugMode, this.f20211h.getDataManagerConfig(), this.f20205b, this.f20206c, this.f20208e);
            Logger.enableLogging(debugMode);
            Logger.i(f20202m, "C'tor");
            a(context);
            this.f20208e.d();
            this.f20208e.e();
            this.f20208e.a(context);
            this.f20208e.b();
            this.f20208e.a();
            this.f20208e.b(context);
            this.f20208e.c();
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    @Override // com.ironsource.ck
    public C1561e a() {
        return this.f20204a;
    }

    @Override // com.ironsource.po
    public void b(Activity activity) {
        try {
            this.f20204a.d();
            this.f20204a.a((Context) activity);
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    @Override // com.ironsource.ek
    public void b(Activity activity, sj sjVar, Map<String, String> map) {
        if (nm.S().d().f()) {
            this.f20210g.a(activity);
        }
        a(sjVar, map);
    }

    @Override // com.ironsource.s9
    public void c(fh.e eVar, String str) {
        ko a4;
        va d4 = d(eVar, str);
        if (d4 != null) {
            if (eVar == fh.e.RewardedVideo) {
                ro c4 = c(d4);
                if (c4 != null) {
                    c4.d();
                    return;
                }
                return;
            }
            if (eVar == fh.e.Interstitial) {
                mo b4 = b(d4);
                if (b4 != null) {
                    b4.onInterstitialClick();
                    return;
                }
                return;
            }
            if (eVar != fh.e.Banner || (a4 = a(d4)) == null) {
                return;
            }
            a4.onBannerClick();
        }
    }

    public static synchronized wj a(Context context, int i4) {
        wj wjVar;
        synchronized (wj.class) {
            try {
                Logger.i(f20202m, "getInstance()");
                if (f20203n == null) {
                    f20203n = new wj(context, i4);
                }
                wjVar = f20203n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wjVar;
    }

    private void c(sj sjVar, Map<String, String> map) {
        try {
            map = a(map);
        } catch (Exception e4) {
            o9.d().a(e4);
            hh a4 = new hh().a(cc.f15708A, e4.getMessage()).a(cc.f15752x, Boolean.valueOf(sjVar.j())).a(cc.f15714G, Boolean.valueOf(sjVar.m())).a(cc.f15750v, sjVar.g()).a(cc.f15751w, dk.a(sjVar)).a(cc.f15716I, Long.valueOf(C1508m0.f17128a.b(sjVar.e())));
            C1508m0.f17128a.a(sjVar.e());
            mh.a(fr.f16283k, a4.a());
            IronLog.INTERNAL.error(e4.toString());
            Logger.d(f20202m, "loadInAppBiddingAd failed decoding  ADM " + e4.getMessage());
        }
        b(sjVar, map);
    }

    @Override // com.ironsource.s9
    public void b(fh.e eVar, String str) {
        ro c4;
        va d4 = d(eVar, str);
        if (d4 != null) {
            if (eVar == fh.e.Interstitial) {
                mo b4 = b(d4);
                if (b4 != null) {
                    b4.onInterstitialOpen();
                    return;
                }
                return;
            }
            if (eVar != fh.e.RewardedVideo || (c4 = c(d4)) == null) {
                return;
            }
            c4.a();
        }
    }

    private Map<String, String> a(Map<String, String> map) {
        map.put("adm", SDKUtils.decodeString(map.get("adm")));
        return map;
    }

    @Override // com.ironsource.ek
    public void b(sj sjVar) {
        Logger.d(f20202m, "destroyInstance " + sjVar.e());
        if (c(sjVar)) {
            this.f20213j.a(EnumC1518n1.DESTROYED, sjVar.e());
            this.f20212i.a(new xs(this.f20214k.a(sjVar.e())));
        }
        this.f20204a.a(new h(sjVar));
    }

    @Override // com.ironsource.v9
    public void c(String str) {
        ro c4;
        va d4 = d(fh.e.RewardedVideo, str);
        if (d4 == null || (c4 = c(d4)) == null) {
            return;
        }
        c4.b();
    }

    private void b(sj sjVar, Map<String, String> map) {
        Logger.d(f20202m, "loadOnNewInstance " + sjVar.e());
        this.f20204a.a(new f(sjVar, map));
    }

    @Override // com.ironsource.hr, com.ironsource.ck
    public void a(Activity activity) {
        try {
            Logger.i(f20202m, "release()");
            za.g();
            this.f20210g.b();
            this.f20204a.a((Context) activity);
            this.f20204a.destroy();
            this.f20204a = null;
        } catch (Exception e4) {
            o9.d().a(e4);
        }
        f20203n = null;
    }

    @Override // com.ironsource.u9
    public void c(String str, String str2) {
        fh.e eVar = fh.e.Interstitial;
        va d4 = d(eVar, str);
        hh hhVar = new hh();
        hhVar.a(cc.f15708A, str2).a(cc.f15750v, str);
        if (d4 != null) {
            hh a4 = hhVar.a(cc.f15751w, nh.a(d4, eVar)).a(cc.f15753y, d4.e() == 2 ? cc.f15712E : cc.f15713F).a(cc.f15752x, Boolean.valueOf(nh.a(d4)));
            C1508m0 c1508m0 = C1508m0.f17128a;
            a4.a(cc.f15716I, Long.valueOf(c1508m0.b(d4.h())));
            c1508m0.a(d4.h());
            mo b4 = b(d4);
            if (b4 != null) {
                b4.onInterstitialLoadFailed(str2);
            }
        }
        mh.a(fr.f16279g, hhVar.a());
    }

    @Override // com.ironsource.ek
    public void a(Activity activity, sj sjVar, Map<String, String> map) {
        this.f20210g.a(activity);
        Logger.i(f20202m, "showAd " + sjVar.e());
        va a4 = this.f20207d.a(fh.e.Interstitial, sjVar.e());
        if (a4 == null) {
            return;
        }
        this.f20204a.a(new g(a4, map));
    }

    @Override // com.ironsource.u9
    public void b(String str) {
        va d4 = d(fh.e.Interstitial, str);
        if (d4 != null) {
            sj c4 = d4.c();
            this.f20213j.a(EnumC1518n1.SHOW_SUCCESS, c4.e());
            if (c(c4)) {
                this.f20212i.a(new bt(this.f20214k.a(c4.e())));
            }
            mo b4 = b(d4);
            if (b4 != null) {
                b4.onInterstitialShowSuccess();
            }
        }
    }

    @Override // com.ironsource.hr
    public void c(JSONObject jSONObject) {
        this.f20204a.a(new e(jSONObject));
    }

    public void a(Context context) {
        this.f20209f = false;
        Boolean c4 = this.f20215l.c(b9.a.f15293g);
        if (c4 == null) {
            c4 = Boolean.FALSE;
        }
        boolean booleanValue = c4.booleanValue();
        this.f20209f = booleanValue;
        if (booleanValue) {
            try {
                ((Application) context).registerActivityLifecycleCallbacks(new C1479i(this));
            } catch (Throwable th) {
                o9.d().a(th);
                hh hhVar = new hh();
                hhVar.a(cc.f15753y, th.getMessage());
                mh.a(fr.f16293u, hhVar.a());
            }
        }
    }

    @Override // com.ironsource.u9
    public void b(String str, String str2) {
        va d4 = d(fh.e.Interstitial, str);
        if (d4 != null) {
            sj c4 = d4.c();
            this.f20213j.a(EnumC1518n1.SHOW_FAIL, c4.e());
            if (c(c4)) {
                this.f20212i.a(new at(this.f20214k.a(c4.e())));
            }
            mo b4 = b(d4);
            if (b4 != null) {
                b4.onInterstitialShowFailed(str2);
            }
        }
    }

    public boolean c(sj sjVar) {
        return sjVar.l() && !sjVar.i() && a(sjVar);
    }

    @Override // com.ironsource.s9
    public void a(fh.e eVar, String str) {
        mo b4;
        va d4 = d(eVar, str);
        if (d4 != null) {
            if (eVar == fh.e.RewardedVideo) {
                ro c4 = c(d4);
                if (c4 != null) {
                    c4.c();
                    return;
                }
                return;
            }
            if (eVar != fh.e.Interstitial || (b4 = b(d4)) == null) {
                return;
            }
            b4.onInterstitialClose();
        }
    }

    @Override // com.ironsource.hr
    public void b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String optString = jSONObject.optString("demandSourceName");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.f20204a.a(new d(optString));
    }

    @Override // com.ironsource.s9
    public void a(fh.e eVar, String str, C1603z2 c1603z2) {
        ko a4;
        va d4 = d(eVar, str);
        if (d4 != null) {
            d4.b(2);
            if (eVar == fh.e.RewardedVideo) {
                ro c4 = c(d4);
                if (c4 != null) {
                    c4.a(c1603z2);
                    return;
                }
                return;
            }
            if (eVar == fh.e.Interstitial) {
                mo b4 = b(d4);
                if (b4 != null) {
                    b4.onInterstitialInitSuccess();
                    return;
                }
                return;
            }
            if (eVar != fh.e.Banner || (a4 = a(d4)) == null) {
                return;
            }
            a4.onBannerInitSuccess();
        }
    }

    @Override // com.ironsource.s9
    public void a(fh.e eVar, String str, String str2) {
        ko a4;
        va d4 = d(eVar, str);
        hh a5 = new hh().a(cc.f15750v, str).a(cc.f15751w, eVar).a(cc.f15708A, str2);
        if (d4 != null) {
            C1508m0 c1508m0 = C1508m0.f17128a;
            a5.a(cc.f15716I, Long.valueOf(c1508m0.b(d4.h())));
            a5.a(cc.f15752x, Boolean.valueOf(nh.a(d4)));
            c1508m0.a(d4.h());
            d4.b(3);
            if (eVar == fh.e.RewardedVideo) {
                ro c4 = c(d4);
                if (c4 != null) {
                    c4.b(str2);
                }
            } else if (eVar == fh.e.Interstitial) {
                mo b4 = b(d4);
                if (b4 != null) {
                    b4.onInterstitialInitFailed(str2);
                }
            } else if (eVar == fh.e.Banner && (a4 = a(d4)) != null) {
                a4.onBannerLoadFail(str2);
            }
        }
        mh.a(fr.f16281i, a5.a());
    }

    @Override // com.ironsource.s9
    public void a(fh.e eVar, String str, String str2, JSONObject jSONObject) {
        ko a4;
        va d4 = d(eVar, str);
        if (d4 == null || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            Logger.i(f20202m, "Received Event Notification: " + str2 + " for demand source: " + d4.f());
            if (eVar == fh.e.Interstitial) {
                mo b4 = b(d4);
                if (b4 != null) {
                    jSONObject.put("demandSourceName", str);
                    b4.onInterstitialEventNotificationReceived(str2, jSONObject);
                    return;
                }
                return;
            }
            if (eVar == fh.e.RewardedVideo) {
                ro c4 = c(d4);
                if (c4 != null) {
                    jSONObject.put("demandSourceName", str);
                    c4.a(str2, jSONObject);
                    return;
                }
                return;
            }
            if (eVar != fh.e.Banner || (a4 = a(d4)) == null) {
                return;
            }
            jSONObject.put("demandSourceName", str);
            if (str2.equalsIgnoreCase("impressions")) {
                a4.onBannerShowSuccess();
            }
        } catch (JSONException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    @Override // com.ironsource.ek
    public void a(sj sjVar, Map<String, String> map) {
        long currentTimeMillis = System.currentTimeMillis();
        map.put(b9.h.f15515y0, String.valueOf(currentTimeMillis));
        C1508m0.f17128a.a(sjVar.e(), currentTimeMillis);
        hh hhVar = new hh();
        hhVar.a(cc.f15752x, Boolean.valueOf(sjVar.j())).a(cc.f15714G, Boolean.valueOf(sjVar.m())).a(cc.f15750v, sjVar.g()).a(cc.f15751w, dk.a(sjVar)).a(cc.f15716I, Long.valueOf(currentTimeMillis));
        mh.a(fr.f16278f, hhVar.a());
        Logger.d(f20202m, "loadAd " + sjVar.e());
        C1524o0 c1524o0 = new C1524o0(sjVar);
        this.f20213j.a(c1524o0);
        this.f20213j.a(new JSONObject(map), EnumC1518n1.LOAD_REQUEST, c1524o0.c());
        if (c(sjVar)) {
            this.f20212i.a(new ys(c1524o0));
        }
        if (sjVar.k()) {
            c(sjVar, map);
        } else {
            b(sjVar, map);
        }
    }

    @Override // com.ironsource.v9
    public void a(String str, int i4) {
        ro c4;
        va d4 = d(fh.e.RewardedVideo, str);
        if (d4 == null || (c4 = c(d4)) == null) {
            return;
        }
        c4.a(i4);
    }

    @Override // com.ironsource.t9
    public void a(String str, wg wgVar) {
        ko a4;
        va d4 = d(fh.e.Banner, str);
        if (d4 == null || (a4 = a(d4)) == null) {
            return;
        }
        a4.onBannerLoadSuccess(d4.c(), wgVar);
    }

    @Override // com.ironsource.t9
    public void a(String str, String str2) {
        ko a4;
        va d4 = d(fh.e.Banner, str);
        if (d4 == null || (a4 = a(d4)) == null) {
            return;
        }
        a4.onBannerLoadFail(str2);
    }

    @Override // com.ironsource.hr
    public void a(String str, String str2, int i4) {
        fh.e productType;
        va a4;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (productType = SDKUtils.getProductType(str)) == null || (a4 = this.f20207d.a(productType, str2)) == null) {
            return;
        }
        a4.c(i4);
    }

    @Override // com.ironsource.hr
    public void a(String str, String str2, String str3, Map<String, String> map, mo moVar) {
        this.f20205b = str;
        this.f20206c = str2;
        this.f20204a.a(new c(str, str2, this.f20207d.a(fh.e.Interstitial, str3, map, moVar)));
    }

    @Override // com.ironsource.hr
    public void a(String str, String str2, String str3, Map<String, String> map, ro roVar) {
        this.f20205b = str;
        this.f20206c = str2;
        this.f20204a.a(new a(str, str2, this.f20207d.a(fh.e.RewardedVideo, str3, map, roVar)));
    }

    @Override // com.ironsource.u9
    public void a(String str, JSONObject jSONObject) {
        fh.e eVar = fh.e.Interstitial;
        va d4 = d(eVar, str);
        hh a4 = new hh().a(cc.f15750v, str);
        if (d4 != null) {
            sj c4 = d4.c();
            this.f20213j.a(jSONObject, EnumC1518n1.LOAD_SUCCESS, c4.e());
            if (c(c4)) {
                this.f20212i.a(new zs(this.f20214k.a(c4.e())));
            }
            hh a5 = a4.a(cc.f15751w, nh.a(d4, eVar)).a(cc.f15752x, Boolean.valueOf(nh.a(d4)));
            C1508m0 c1508m0 = C1508m0.f17128a;
            a5.a(cc.f15716I, Long.valueOf(c1508m0.b(d4.h())));
            c1508m0.a(d4.h());
            mo b4 = b(d4);
            if (b4 != null) {
                b4.onInterstitialLoadSuccess(d4.c());
            }
        }
        mh.a(fr.f16284l, a4.a());
    }

    @Override // com.ironsource.hr
    public void a(JSONObject jSONObject) {
        this.f20204a.a(new b(jSONObject));
    }

    @Override // com.ironsource.ek
    public boolean a(sj sjVar) {
        Logger.d(f20202m, "isAdAvailable " + sjVar.e());
        va a4 = this.f20207d.a(fh.e.Interstitial, sjVar.e());
        if (a4 == null) {
            return false;
        }
        return a4.d();
    }

    @Override // com.ironsource.hr
    public boolean a(String str) {
        return this.f20204a.a(str);
    }
}
