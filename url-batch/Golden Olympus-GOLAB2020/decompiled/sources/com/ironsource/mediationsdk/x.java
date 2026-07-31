package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.C1441c3;
import com.ironsource.h7;
import com.ironsource.ib;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.nk;
import com.ironsource.o9;
import com.ironsource.pj;
import com.ironsource.rt;
import com.ironsource.wp;
import com.ironsource.y7;
import com.ironsource.zb;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class x extends y implements BannerSmashListener, rt.a, y7 {

    /* renamed from: h, reason: collision with root package name */
    private k f17996h;

    /* renamed from: i, reason: collision with root package name */
    private rt f17997i;

    /* renamed from: j, reason: collision with root package name */
    private a f17998j;

    /* renamed from: k, reason: collision with root package name */
    private wp f17999k;

    /* renamed from: l, reason: collision with root package name */
    private IronSourceBannerLayout f18000l;

    /* renamed from: m, reason: collision with root package name */
    private String f18001m;

    /* renamed from: n, reason: collision with root package name */
    private JSONObject f18002n;

    /* renamed from: o, reason: collision with root package name */
    private int f18003o;

    /* renamed from: p, reason: collision with root package name */
    private String f18004p;

    /* renamed from: q, reason: collision with root package name */
    private h7 f18005q;

    /* renamed from: r, reason: collision with root package name */
    private final Object f18006r;

    /* renamed from: s, reason: collision with root package name */
    private ib f18007s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f18008t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f18009u;

    /* renamed from: v, reason: collision with root package name */
    private JSONObject f18010v;

    protected enum a {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        LOAD_FAILED,
        DESTROYED
    }

    x(k kVar, wp wpVar, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i4, String str, JSONObject jSONObject, int i5, String str2, boolean z4) {
        super(new C1441c3(networkSettings, networkSettings.getBannerSettings(), IronSource.AD_UNIT.BANNER), abstractAdapter);
        this.f18006r = new Object();
        this.f17998j = a.NONE;
        this.f17996h = kVar;
        this.f17997i = new rt(kVar.e());
        this.f17999k = wpVar;
        this.f18024f = i4;
        this.f18001m = str;
        this.f18003o = i5;
        this.f18004p = str2;
        this.f18002n = jSONObject;
        this.f18008t = z4;
        this.f18010v = null;
        if (r()) {
            u();
        }
    }

    private void A() {
        IronLog.INTERNAL.verbose();
        a(a.INIT_IN_PROGRESS);
        F();
        try {
            if (this.f18019a != null) {
                if (p()) {
                    this.f18019a.initBannerForBidding(this.f17996h.a(), this.f17996h.i(), this.f18022d, this);
                } else {
                    this.f18019a.initBanners(this.f17996h.a(), this.f17996h.i(), this.f18022d, this);
                }
            }
        } catch (Throwable th) {
            o9.d().a(th);
            IronLog.INTERNAL.error("Exception while trying to init banner from " + this.f18019a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            onBannerInitFailed(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_EXCEPTION, th.getLocalizedMessage()));
            a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceConstants.errorCode_initFailed)}, new Object[]{"reason", th.getLocalizedMessage()}});
        }
    }

    private boolean B() {
        boolean z4;
        synchronized (this.f18006r) {
            z4 = this.f17998j == a.DESTROYED;
        }
        return z4;
    }

    private boolean C() {
        boolean z4;
        synchronized (this.f18006r) {
            z4 = this.f17998j == a.LOADED;
        }
        return z4;
    }

    private void F() {
        if (this.f18019a == null) {
            return;
        }
        try {
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (TextUtils.isEmpty(pluginType)) {
                return;
            }
            this.f18019a.setPluginData(pluginType);
        } catch (Throwable th) {
            o9.d().a(th);
            IronLog.INTERNAL.error("Exception while trying to set custom params from " + this.f18019a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceConstants.errorCode_internal)}, new Object[]{"reason", th.getLocalizedMessage()}});
        }
    }

    private boolean b(int i4) {
        return i4 == 3005 || i4 == 3002 || i4 == 3012 || i4 == 3015 || i4 == 3008 || i4 == 3305 || i4 == 3300 || i4 == 3306 || i4 == 3307 || i4 == 3302 || i4 == 3303 || i4 == 3304 || i4 == 3009;
    }

    private void u() {
        IronLog.INTERNAL.verbose("isBidder = " + p() + ", shouldEarlyInit = " + s());
        this.f18009u = true;
        A();
    }

    public void D() {
        this.f18019a.onBannerViewBound(this.f18020b.h().getBannerSettings());
    }

    public void E() {
        this.f18019a.onBannerViewWillBind(this.f18020b.h().getBannerSettings());
    }

    @Override // com.ironsource.rt.a
    public void a() {
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        a aVar = a.INIT_IN_PROGRESS;
        a aVar2 = a.LOAD_FAILED;
        if (a(aVar, aVar2)) {
            ironLog.verbose("init timed out");
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT, "Timed out");
        } else {
            if (!a(a.LOADING, aVar2)) {
                ironLog.error("unexpected state - " + this.f17998j);
                return;
            }
            ironLog.verbose("load timed out");
            ironSourceError = new IronSourceError(608, "Timed out");
        }
        a(ironSourceError);
    }

    @Override // com.ironsource.y7
    public void collectBiddingData(AdData adData, @NotNull BiddingDataCallback biddingDataCallback) {
        a(IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN);
        try {
            this.f18019a.collectBannerBiddingData(this.f18022d, adData != null ? nk.a(adData.getAdUnitData()) : null, biddingDataCallback);
        } catch (Throwable th) {
            o9.d().a(th);
            IronLog.INTERNAL.error("Exception while trying to collectBannerBiddingData from " + this.f18019a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.y
    public IronSource.AD_UNIT d() {
        return IronSource.AD_UNIT.BANNER;
    }

    @Override // com.ironsource.mediationsdk.y
    public String k() {
        return "ProgBannerSmash";
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
        IronLog.INTERNAL.verbose(f());
        a(3008);
        wp wpVar = this.f17999k;
        if (wpVar != null) {
            wpVar.b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
        IronLog.INTERNAL.verbose(f());
        a(3304);
        wp wpVar = this.f17999k;
        if (wpVar != null) {
            wpVar.c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose(y() + "error = " + ironSourceError);
        this.f17997i.e();
        if (a(a.LOADING, a.LOAD_FAILED)) {
            a(ironSourceError);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose(f());
        this.f17997i.e();
        if (!a(a.LOADING, a.LOADED)) {
            a(this.f18008t ? IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS : IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS);
            return;
        }
        a(this.f18008t ? IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS : 3005, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(ib.a(this.f18007s))}});
        wp wpVar = this.f17999k;
        if (wpVar != null) {
            wpVar.a(this, view, layoutParams);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
        IronLog.INTERNAL.verbose(f());
        a(IronSourceConstants.BN_INSTANCE_DISMISS_SCREEN);
        wp wpVar = this.f17999k;
        if (wpVar != null) {
            wpVar.e(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
        IronLog.INTERNAL.verbose(f());
        a(IronSourceConstants.BN_INSTANCE_PRESENT_SCREEN);
        wp wpVar = this.f17999k;
        if (wpVar != null) {
            wpVar.d(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        if (C()) {
            a(3009);
            wp wpVar = this.f17999k;
            if (wpVar != null) {
                wpVar.a(this);
                return;
            }
            return;
        }
        ironLog.warning("wrong state - mState = " + this.f17998j);
        a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{"errorCode", 1}, new Object[]{"reason", "Wrong State - " + this.f17998j}, new Object[]{IronSourceConstants.EVENTS_EXT1, c()}});
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(y() + "error = " + ironSourceError);
        this.f17997i.e();
        if (a(a.INIT_IN_PROGRESS, a.NONE)) {
            wp wpVar = this.f17999k;
            if (wpVar != null) {
                wpVar.a(ironSourceError, this, false);
                return;
            }
            return;
        }
        ironLog.warning("wrong state - mState = " + this.f17998j);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose(f());
        if (a(a.INIT_IN_PROGRESS, a.READY_TO_LOAD)) {
            if (this.f18009u) {
                this.f18009u = false;
            } else {
                if (p()) {
                    return;
                }
                if (l.c(this.f18000l)) {
                    a((String) null, this.f18010v);
                } else {
                    this.f17999k.a(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, this.f18000l == null ? "banner is null" : "banner is destroyed"), this, false);
                }
            }
        }
    }

    @Override // com.ironsource.mediationsdk.y
    public void q() {
        this.f17997i.d();
        super.q();
    }

    public void t() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        a(3305);
        a(a.DESTROYED);
        AbstractAdapter abstractAdapter = this.f18019a;
        if (abstractAdapter == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            abstractAdapter.destroyBanner(this.f18020b.h().getBannerSettings());
        } catch (Throwable th) {
            o9.d().a(th);
            IronLog.INTERNAL.error("Exception while trying to destroy banner from " + this.f18019a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceConstants.errorCode_destroy)}, new Object[]{"reason", th.getLocalizedMessage()}});
        }
    }

    public String v() {
        return !TextUtils.isEmpty(this.f18020b.h().getAdSourceNameForEvents()) ? this.f18020b.h().getAdSourceNameForEvents() : i();
    }

    public AbstractAdapter w() {
        return this.f18019a;
    }

    public String x() {
        return this.f18001m;
    }

    public String y() {
        return String.format("%s - ", f());
    }

    public String z() {
        return this.f18020b.i();
    }

    x(k kVar, wp wpVar, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i4, boolean z4) {
        this(kVar, wpVar, networkSettings, abstractAdapter, i4, "", null, 0, "", z4);
    }

    public void a(int i4) {
        a(i4, (Object[][]) null);
    }

    public void a(int i4, Object[][] objArr) {
        Map<String, Object> m4 = m();
        if (B()) {
            m4.put("reason", "banner is destroyed");
        } else {
            IronSourceBannerLayout ironSourceBannerLayout = this.f18000l;
            if (ironSourceBannerLayout != null) {
                l.a(m4, ironSourceBannerLayout.getSize());
            }
        }
        if (!TextUtils.isEmpty(this.f18001m)) {
            m4.put("auctionId", this.f18001m);
        }
        JSONObject jSONObject = this.f18002n;
        if (jSONObject != null && jSONObject.length() > 0) {
            m4.put("genericParams", this.f18002n);
        }
        h7 h7Var = this.f18005q;
        if (h7Var != null) {
            m4.put("placement", h7Var.getPlacementName());
        }
        if (b(i4)) {
            pj.i().a(m4, this.f18003o, this.f18004p);
        }
        m4.put("sessionDepth", Integer.valueOf(this.f18024f));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    m4.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e4) {
                o9.d().a(e4);
                IronLog.INTERNAL.error(c() + " smash: BN sendMediationEvent " + Log.getStackTraceString(e4));
            }
        }
        pj.i().a(new zb(i4, new JSONObject(m4)));
    }

    public void a(IronSourceBannerLayout ironSourceBannerLayout, h7 h7Var, String str, JSONObject jSONObject) {
        wp wpVar;
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        this.f18005q = h7Var;
        this.f18010v = jSONObject;
        if (!l.c(ironSourceBannerLayout)) {
            String str2 = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
            ironLog.verbose(str2);
            wpVar = this.f17999k;
            ironSourceError = new IronSourceError(610, str2);
        } else {
            if (this.f18019a != null) {
                this.f18000l = ironSourceBannerLayout;
                this.f17997i.a((rt.a) this);
                try {
                    if (p()) {
                        a(str, this.f18010v);
                        return;
                    } else {
                        A();
                        return;
                    }
                } catch (Throwable th) {
                    o9.d().a(th);
                    IronLog.INTERNAL.error("exception = " + th.getLocalizedMessage());
                    onBannerAdLoadFailed(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, th.getLocalizedMessage()));
                    return;
                }
            }
            ironLog.verbose("mAdapter is null");
            wpVar = this.f17999k;
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_ADAPTER, "mAdapter is null");
        }
        wpVar.a(ironSourceError, this, false);
    }

    private void a(IronSourceError ironSourceError) {
        boolean z4 = ironSourceError.getErrorCode() == 606;
        boolean z5 = this.f18008t;
        if (z4) {
            a(z5 ? IronSourceConstants.BN_INSTANCE_RELOAD_NO_FILL : 3306, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(ib.a(this.f18007s))}});
        } else {
            a(z5 ? IronSourceConstants.BN_INSTANCE_RELOAD_ERROR : 3300, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(ib.a(this.f18007s))}});
        }
        wp wpVar = this.f17999k;
        if (wpVar != null) {
            wpVar.a(ironSourceError, this, z4);
        }
    }

    private void a(a aVar) {
        IronLog.INTERNAL.verbose(y() + "state = " + aVar.name());
        synchronized (this.f18006r) {
            this.f17998j = aVar;
        }
    }

    private void a(String str, JSONObject jSONObject) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        if (!a(a.READY_TO_LOAD, a.LOADING)) {
            ironLog.error("wrong state - state = " + this.f17998j);
            return;
        }
        this.f18007s = new ib();
        a(this.f18008t ? IronSourceConstants.BN_INSTANCE_RELOAD : 3002);
        if (this.f18019a != null) {
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (p()) {
                    this.f18019a.loadBannerForBidding(this.f18022d, this.f18010v, str, this.f18000l, this);
                } else {
                    this.f18019a.loadBanner(this.f18022d, this.f18010v, this.f18000l, this);
                }
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                o9.d().a(th3);
                IronLog.INTERNAL.error("Exception while trying to load banner from " + this.f18019a.getProviderName() + ", exception =  " + th3.getLocalizedMessage());
                onBannerAdLoadFailed(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, th3.getLocalizedMessage()));
                a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceConstants.errorCode_loadException)}, new Object[]{"reason", th3.getLocalizedMessage()}});
            }
        }
    }

    private boolean a(a aVar, a aVar2) {
        boolean z4;
        synchronized (this.f18006r) {
            try {
                if (this.f17998j == aVar) {
                    IronLog.INTERNAL.verbose(y() + "set state from '" + this.f17998j + "' to '" + aVar2 + "'");
                    this.f17998j = aVar2;
                    z4 = true;
                } else {
                    z4 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }
}
