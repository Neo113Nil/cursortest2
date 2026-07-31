package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.C1441c3;
import com.ironsource.C1443c5;
import com.ironsource.C1513m5;
import com.ironsource.InterfaceC1429a5;
import com.ironsource.bi;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.ib;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.demandOnly.a;
import com.ironsource.mediationsdk.demandOnly.b;
import com.ironsource.mediationsdk.demandOnly.m;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.nb;
import com.ironsource.nm;
import com.ironsource.o9;
import com.ironsource.pj;
import com.ironsource.zb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class d extends m implements BannerSmashListener, InterfaceC1429a5 {

    /* renamed from: n, reason: collision with root package name */
    private ib f17395n;

    /* renamed from: o, reason: collision with root package name */
    private ib f17396o;

    /* renamed from: p, reason: collision with root package name */
    private String f17397p;

    /* renamed from: q, reason: collision with root package name */
    private String f17398q;

    /* renamed from: r, reason: collision with root package name */
    private C1443c5 f17399r;

    /* renamed from: s, reason: collision with root package name */
    private com.ironsource.mediationsdk.e f17400s;

    /* renamed from: t, reason: collision with root package name */
    private ISDemandOnlyBannerLayout f17401t;

    /* renamed from: u, reason: collision with root package name */
    private final bi f17402u;

    /* renamed from: v, reason: collision with root package name */
    private final bi.a f17403v;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.mediationsdk.i f17404a;

        a(com.ironsource.mediationsdk.i iVar) {
            this.f17404a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.a(83500, (Object[][]) null);
            IronLog.INTERNAL.verbose("auction waterfallString = " + this.f17404a.q());
            d.this.a(83510, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.f17404a.q()}});
            d.this.f17400s.a(ContextProvider.getInstance().getApplicationContext(), this.f17404a, d.this);
        }
    }

    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("load timed out state=" + d.this.k());
            d.this.a(new IronSourceError(608, "load timed out"));
        }
    }

    public d(String str, String str2, NetworkSettings networkSettings, long j4, AbstractAdapter abstractAdapter, com.ironsource.mediationsdk.e eVar) {
        super(new C1441c3(networkSettings, networkSettings.getBannerSettings(), IronSource.AD_UNIT.BANNER), abstractAdapter);
        this.f17402u = nm.S().k();
        this.f17403v = nm.M().e();
        this.f17527f = j4;
        this.f17397p = str;
        this.f17398q = str2;
        this.f17399r = new C1443c5();
        this.f17522a.initBannerForBidding(str, str2, this.f17524c, this);
        this.f17400s = eVar;
    }

    private void c(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                a(new IronSourceError(618, "No available ad to load"));
            } else {
                a(83302, (Object[][]) null);
                this.f17396o = new ib();
                this.f17522a.initBannerForBidding(this.f17397p, this.f17398q, this.f17524c, this);
                this.f17522a.loadBannerForDemandOnlyForBidding(this.f17524c, str, this.f17401t, this);
            }
        }
    }

    private boolean t() {
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.f17401t;
        return iSDemandOnlyBannerLayout == null || iSDemandOnlyBannerLayout.isDestroyed();
    }

    private void u() {
        IronLog.INTERNAL.verbose();
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(q()));
    }

    private void v() {
        this.f17528g = null;
        this.f17529h = null;
        this.f17399r = new C1443c5();
    }

    private void w() {
        IronLog.INTERNAL.verbose();
        a(new b());
    }

    @Override // com.ironsource.mediationsdk.demandOnly.m
    public Map<String, Object> j() {
        HashMap hashMap = new HashMap();
        try {
            if (t()) {
                hashMap.put("reason", "banner is destroyed");
            } else {
                com.ironsource.mediationsdk.l.a(hashMap, this.f17401t.getSize());
            }
            AbstractAdapter abstractAdapter = this.f17522a;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.f17522a;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            hashMap.put("spId", this.f17523b.i());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f17523b.a());
            hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            if (o()) {
                hashMap.put("isOneFlow", 1);
            }
            hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
            hashMap.put("instanceType", Integer.valueOf(this.f17523b.d()));
            if (!TextUtils.isEmpty(this.f17528g)) {
                hashMap.put("auctionId", this.f17528g);
            }
            JSONObject jSONObject = this.f17529h;
            if (jSONObject != null && jSONObject.length() > 0) {
                hashMap.put("genericParams", this.f17529h);
            }
            if (!TextUtils.isEmpty(this.f17531j)) {
                hashMap.put("dynamicDemandSource", this.f17531j);
                return hashMap;
            }
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error("Instance: " + h() + " " + e4.getMessage());
        }
        return hashMap;
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
        IronLog.INTERNAL.verbose("smash - " + s());
        a(3008, (Object[][]) null);
        if (t()) {
            return;
        }
        this.f17401t.getListener().a(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
        IronLog.INTERNAL.verbose("smash - " + s());
        a(3304, (Object[][]) null);
        if (t()) {
            return;
        }
        this.f17401t.getListener().b(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("smash - " + s());
        a(83300, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(ib.a(this.f17396o))}});
        a(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose("smash = " + s());
        bi biVar = this.f17402u;
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        int a4 = biVar.a(ad_unit);
        a(b.c.f17385d, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(a4)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(ib.a(this.f17396o))}});
        if (a(m.a.LOAD_IN_PROGRESS, m.a.LOADED)) {
            p();
            if (!t()) {
                this.f17401t.a(view, layoutParams);
            }
            a(3005, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(a4)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(ib.a(this.f17395n))}});
            this.f17403v.b(ad_unit);
            a(this.f17399r.c(), IronSourceUtils.getCurrentMethodName());
            if (t()) {
                return;
            }
            this.f17401t.getListener().c(l());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
        if (a(m.a.LOADED, m.a.SHOW_IN_PROGRESS)) {
            IronLog.INTERNAL.verbose("smash - " + s());
            a(3009, (Object[][]) null);
            a(this.f17399r.a(), IronSourceUtils.getCurrentMethodName());
            if (t()) {
                return;
            }
            this.f17401t.getListener().d(l());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("smash - " + s() + " " + ironSourceError.toString());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose("smash - " + s());
    }

    com.ironsource.mediationsdk.i q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(h());
        String str = "" + i() + h();
        com.ironsource.mediationsdk.i iVar = new com.ironsource.mediationsdk.i(IronSource.AD_UNIT.BANNER);
        iVar.a(arrayList);
        iVar.d(str);
        iVar.c(l());
        iVar.b(IronSourceUtils.isEncryptedResponse());
        iVar.a(true);
        iVar.c(true);
        iVar.a(this.f17401t.getSize());
        return iVar;
    }

    public void r() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        a(new m.a[]{m.a.LOADED, m.a.LOAD_IN_PROGRESS, m.a.SHOW_IN_PROGRESS}, m.a.NOT_LOADED);
        if (t()) {
            ironLog.error("Banner is null or already destroyed and can't be used anymore");
            return;
        }
        p();
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.f17401t;
        if (iSDemandOnlyBannerLayout != null) {
            iSDemandOnlyBannerLayout.a();
        }
        this.f17401t = null;
        AbstractAdapter abstractAdapter = this.f17522a;
        if (abstractAdapter == null) {
            ironLog.error("can't destroy adapter. mAdapter == null");
        } else {
            abstractAdapter.destroyBanner(this.f17524c);
        }
        a(3305, (Object[][]) null);
        ironLog.verbose("banner layout was destroyed. bannerId: " + l());
    }

    public String s() {
        return this.f17523b.h().isMultipleInstances() ? this.f17523b.h().getProviderTypeForReflection() : this.f17523b.h().getProviderName();
    }

    @Override // com.ironsource.InterfaceC1555s4
    public void a(int i4, String str, int i5, String str2, long j4) {
        IronLog.INTERNAL.verbose("Auction failed. error " + i4 + " - " + str);
        this.f17528g = null;
        this.f17529h = null;
        a(b.c.f17388g, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i4)}, new Object[]{"reason", str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4)}, new Object[]{IronSourceConstants.EVENTS_EXT1, k()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            a(new IronSourceError(621, "No available ad to load"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i4, Object[][] objArr) {
        Map<String, Object> j4 = j();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    if (objArr2[1] != null) {
                        j4.put(objArr2[0].toString(), objArr2[1]);
                    }
                }
            } catch (Exception e4) {
                o9.d().a(e4);
                IronLog.INTERNAL.error(e4.toString());
            }
        }
        pj.i().a(new zb(i4, new JSONObject(j4)));
    }

    @Override // com.ironsource.InterfaceC1429a5
    public void a(@Nullable d.a aVar, int i4, long j4, int i5, @Nullable String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        this.f17528g = aVar.a();
        this.f17529h = aVar.f();
        a.C0153a c0153a = new a.C0153a(aVar.h());
        if (!TextUtils.isEmpty(str)) {
            a(88002, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i5)}, new Object[]{"reason", str}});
        }
        a(b.c.f17389h, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4)}});
        a(b.c.f17391j, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, c0153a.b()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (c0153a.isEmpty()) {
                IronSourceError ironSourceError = new IronSourceError(3306, "There is no available ad to load");
                ironLog.error("loadBanner - empty waterfall");
                a(ironSourceError);
                return;
            }
            C1513m5 c1513m5 = c0153a.get(0);
            this.f17399r.a(c1513m5.b());
            this.f17399r.c(c1513m5.h());
            this.f17399r.b(c1513m5.g());
            String k4 = c1513m5.k();
            b(k4);
            c(k4);
        }
    }

    public void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + k());
        if (iSDemandOnlyBannerLayout == null) {
            a(b.c.f17386e, new Object[][]{new Object[]{"reason", "bannerLayout is null | state: " + k()}});
            return;
        }
        m.a[] aVarArr = {m.a.NOT_LOADED, m.a.LOADED};
        m.a aVar = m.a.LOAD_IN_PROGRESS;
        m.a a4 = a(aVarArr, aVar);
        if (a4 == aVar || a4 == m.a.SHOW_IN_PROGRESS) {
            if (iSDemandOnlyBannerLayout.isDestroyed()) {
                a(b.c.f17386e, new Object[][]{new Object[]{"reason", "bannerLayout is destroyed | state: " + k()}});
                return;
            }
            String str = "banner layout in blocking state | state: " + k();
            iSDemandOnlyBannerLayout.getListener().a(l(), new IronSourceError(619, str));
            a(b.c.f17386e, new Object[][]{new Object[]{"reason", str}});
            return;
        }
        v();
        a(3002, (Object[][]) null);
        if (!o()) {
            ironLog.verbose("can't load banner when isOneFlow = false");
            a(new IronSourceError(1063, "Missing configuration settings"));
            return;
        }
        this.f17401t = iSDemandOnlyBannerLayout;
        this.f17395n = new ib();
        w();
        if (this.f17400s.a()) {
            u();
        } else {
            ironLog.verbose("can't load the banner the auction isn't enabled");
            a(new IronSourceError(1063, "Missing server configuration"));
        }
    }

    public void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, o oVar) {
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + k());
        if (iSDemandOnlyBannerLayout == null) {
            a(b.c.f17386e, new Object[][]{new Object[]{"reason", "bannerLayout is null | state: " + k()}});
            return;
        }
        m.a[] aVarArr = {m.a.NOT_LOADED, m.a.LOADED};
        m.a aVar = m.a.LOAD_IN_PROGRESS;
        m.a a4 = a(aVarArr, aVar);
        if (a4 == aVar || a4 == m.a.SHOW_IN_PROGRESS) {
            if (iSDemandOnlyBannerLayout.isDestroyed()) {
                a(b.c.f17386e, new Object[][]{new Object[]{"reason", "bannerLayout is destroyed | state: " + k()}});
                return;
            }
            String str = "banner layout in blocking state | state: " + k();
            iSDemandOnlyBannerLayout.getListener().a(l(), new IronSourceError(619, str));
            a(b.c.f17386e, new Object[][]{new Object[]{"reason", str}});
            return;
        }
        v();
        a(3002, (Object[][]) null);
        if (iSDemandOnlyBannerLayout.isDestroyed()) {
            a(new IronSourceError(610, "bannerLayout is destroyed"));
            return;
        }
        this.f17401t = iSDemandOnlyBannerLayout;
        if (!n()) {
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadBannerForBidder in IAB flow must be called by bidder instances");
            a(3300, (Object[][]) null);
            a(buildLoadFailedError);
            return;
        }
        try {
            d.a aVar2 = (d.a) oVar.a(new nb());
            C1513m5 a5 = new a.C0153a(aVar2.h()).a(h());
            if (a5 == null) {
                ironSourceError = ErrorBuilder.buildLoadFailedError("loadBannerForBidder invalid enriched ADM");
                a(3300, (Object[][]) null);
            } else {
                String k4 = a5.k();
                if (k4 != null) {
                    b(k4);
                    a(aVar2.a());
                    a(aVar2.f());
                    a(83302, (Object[][]) null);
                    this.f17399r.a(a5.b());
                    this.f17395n = new ib();
                    w();
                    this.f17522a.initBannerForBidding(this.f17397p, this.f17398q, this.f17524c, this);
                    this.f17522a.loadBannerForDemandOnlyForBidding(this.f17524c, k4, iSDemandOnlyBannerLayout, this);
                    return;
                }
                ironLog.error("serverData is null");
                ironSourceError = new IronSourceError(618, "No available ad to load");
            }
            a(ironSourceError);
        } catch (Exception e4) {
            o9.d().a(e4);
            a(ErrorBuilder.buildLoadFailedError("loadBannerForBidder: Exception= " + e4.getMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("error = " + ironSourceError.getErrorMessage() + " smash - " + s());
        if (a(m.a.LOAD_IN_PROGRESS, m.a.NOT_LOADED)) {
            p();
            a(ironSourceError, ib.a(this.f17395n));
            a(this.f17399r.b(), IronSourceUtils.getCurrentMethodName());
            if (t()) {
                return;
            }
            this.f17401t.getListener().a(l(), ironSourceError);
        }
    }

    private void a(IronSourceError ironSourceError, long j4) {
        if (ironSourceError.getErrorCode() == 606) {
            a(3306, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4)}});
        } else {
            a(3300, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4)}});
        }
    }

    private void a(List<String> list, String str) {
        a(list, h(), i(), this.f17531j, str);
    }

    @Override // com.ironsource.InterfaceC1555s4
    public void a(List<C1513m5> list, String str, C1513m5 c1513m5, JSONObject jSONObject, JSONObject jSONObject2, int i4, long j4, int i5, String str2) {
        IronLog.INTERNAL.error("onAuctionSuccess - Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }
}
