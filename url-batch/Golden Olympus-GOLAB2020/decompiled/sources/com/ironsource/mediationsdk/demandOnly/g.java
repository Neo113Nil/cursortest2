package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C1441c3;
import com.ironsource.C1443c5;
import com.ironsource.C1464f5;
import com.ironsource.C1513m5;
import com.ironsource.InterfaceC1429a5;
import com.ironsource.bi;
import com.ironsource.environment.ContextProvider;
import com.ironsource.ib;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.demandOnly.a;
import com.ironsource.mediationsdk.demandOnly.e;
import com.ironsource.mediationsdk.demandOnly.m;
import com.ironsource.mediationsdk.demandOnly.n;
import com.ironsource.mediationsdk.demandOnly.p;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.nb;
import com.ironsource.nm;
import com.ironsource.o9;
import com.ironsource.pj;
import com.ironsource.zb;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class g extends m implements n.a, InterstitialSmashListener, InterfaceC1429a5 {

    /* renamed from: n, reason: collision with root package name */
    private ib f17448n;

    /* renamed from: o, reason: collision with root package name */
    private ib f17449o;

    /* renamed from: p, reason: collision with root package name */
    private ISDemandOnlyInterstitialListener f17450p;

    /* renamed from: q, reason: collision with root package name */
    private C1443c5 f17451q;

    /* renamed from: r, reason: collision with root package name */
    private com.ironsource.mediationsdk.e f17452r;

    /* renamed from: s, reason: collision with root package name */
    private p f17453s;

    /* renamed from: t, reason: collision with root package name */
    private final bi f17454t;

    /* renamed from: u, reason: collision with root package name */
    private final bi.a f17455u;

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("load timed out state=" + g.this.k());
            g.this.a(new IronSourceError(1052, "load timed out"));
        }
    }

    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("load timed out state=" + g.this.k());
            g.this.a(new IronSourceError(1052, "load timed out"));
        }
    }

    public g(String str, String str2, NetworkSettings networkSettings, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener, long j4, AbstractAdapter abstractAdapter, com.ironsource.mediationsdk.e eVar) {
        super(new C1441c3(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), abstractAdapter);
        this.f17453s = new p.b();
        this.f17454t = nm.S().k();
        this.f17455u = nm.M().e();
        this.f17450p = iSDemandOnlyInterstitialListener;
        this.f17527f = j4;
        this.f17452r = eVar;
        this.f17522a.initInterstitial(str, str2, this.f17524c, this);
    }

    private com.ironsource.mediationsdk.i q() {
        String str = i() + h();
        com.ironsource.mediationsdk.i iVar = new com.ironsource.mediationsdk.i(this.f17534m);
        iVar.b(IronSourceUtils.isEncryptedResponse());
        iVar.a(true);
        iVar.c(true);
        iVar.d(str);
        iVar.c(l());
        iVar.a(this.f17454t.a(this.f17534m));
        C1464f5 c1464f5 = new C1464f5(h(), false);
        c1464f5.a(this.f17453s.value());
        Map<String, Object> interstitialBiddingData = this.f17522a.getInterstitialBiddingData(this.f17524c, new JSONObject());
        if (interstitialBiddingData != null) {
            c1464f5.b(interstitialBiddingData);
        }
        iVar.a(c1464f5);
        return iVar;
    }

    private void r() {
        this.f17449o = new ib();
        this.f17522a.loadInterstitial(this.f17524c, null, this);
    }

    private void s() {
        if (!this.f17452r.a()) {
            IronLog.INTERNAL.verbose("can't load the interstitial the auction isn't enabled");
            a(new IronSourceError(1063, "Missing server configuration"));
            return;
        }
        a(82500, (Object[][]) null);
        com.ironsource.mediationsdk.i q4 = q();
        IronLog.INTERNAL.verbose("auction waterfallString = " + q4.q());
        a(82510, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, q4.q()}});
        this.f17452r.a(ContextProvider.getInstance().getApplicationContext(), q4, this);
    }

    private void t() {
        this.f17528g = null;
        this.f17529h = null;
        this.f17531j = null;
        this.f17451q = new C1443c5();
    }

    private void u() {
        this.f17448n = new ib();
        a(new b());
        if (n()) {
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitial must be called by non bidder instances");
            a(2303, (Object[][]) null);
            a(buildLoadFailedError);
        } else if (o()) {
            s();
        } else {
            r();
        }
    }

    @Override // com.ironsource.InterfaceC1555s4
    public void a(int i4, String str, int i5, String str2, long j4) {
        IronLog.INTERNAL.verbose("error " + i4 + " - " + str);
        this.f17528g = null;
        this.f17529h = null;
        a(82300, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i4)}, new Object[]{"reason", str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4)}, new Object[]{IronSourceConstants.EVENTS_EXT1, k()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            a(new IronSourceError(e.a.f17416j, "No available ad to load"));
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.a
    public void b() {
        IronLog.INTERNAL.verbose("instanceName = " + h() + ", state=" + k());
        a(2201, (Object[][]) null);
        m.a aVar = m.a.LOADED;
        m.a aVar2 = m.a.SHOW_IN_PROGRESS;
        if (a(aVar, aVar2)) {
            this.f17522a.showInterstitial(this.f17524c, this);
        } else {
            onInterstitialAdShowFailed(a(aVar2) ? new IronSourceError(1064, "showInterstitial error: can't show ad while an ad is already showing") : a(m.a.LOAD_IN_PROGRESS) ? new IronSourceError(1065, "showInterstitial error: can't show ad while an ad is loading") : new IronSourceError(1066, "showInterstitial error: no available ads to show"));
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.a
    public void c() {
        IronLog.INTERNAL.verbose("state=" + k());
        m.a aVar = m.a.NOT_LOADED;
        m.a aVar2 = m.a.LOADED;
        m.a aVar3 = m.a.LOAD_IN_PROGRESS;
        m.a a4 = a(new m.a[]{aVar, aVar2}, aVar3);
        if (a4 != aVar && a4 != aVar2) {
            this.f17450p.onInterstitialAdLoadFailed(l(), new IronSourceError(1050, a4 == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        t();
        a(2002, (Object[][]) null);
        u();
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(2006, new Object[0][]);
        this.f17450p.onInterstitialAdClicked(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClosed() {
        b(m.a.NOT_LOADED);
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(2204, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(this.f17454t.a(this.f17534m))}});
        this.f17455u.b(this.f17534m);
        this.f17450p.onInterstitialAdClosed(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.getErrorMessage() + " instance name= " + h() + " state=" + k());
        a(e.c.f17438d, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(ib.a(this.f17449o))}});
        a(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(2005, new Object[0][]);
        a(this.f17451q.a(), IronSourceUtils.getCurrentMethodName());
        this.f17450p.onInterstitialAdOpened(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdReady() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h() + " state=" + k());
        p();
        a(e.c.f17437c, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(ib.a(this.f17449o))}});
        if (a(m.a.LOAD_IN_PROGRESS, m.a.LOADED)) {
            a(2003, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(ib.a(this.f17448n))}});
            a(this.f17451q.c(), IronSourceUtils.getCurrentMethodName());
            this.f17450p.onInterstitialAdReady(l());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.toString() + " instance name= " + h() + " state=" + k());
        b(m.a.NOT_LOADED);
        a(2203, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        this.f17450p.onInterstitialAdShowFailed(l(), ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowSucceeded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdVisible() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(2210, new Object[0][]);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitSuccess() {
    }

    private void a(int i4, Object[][] objArr) {
        Map<String, Object> j4 = j();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    j4.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e4) {
                o9.d().a(e4);
                IronLog.INTERNAL.error("Exception: " + Log.getStackTraceString(e4));
            }
        }
        pj.i().a(new zb(i4, new JSONObject(j4)));
    }

    private void c(o oVar) {
        IronSourceError ironSourceError;
        this.f17448n = new ib();
        a(new a());
        if (!n()) {
            a(new IronSourceError(2303, "loadInterstitialWithAdm: must be called by bidder instance"));
            return;
        }
        try {
            d.a aVar = (d.a) oVar.a(new nb());
            C1513m5 a4 = new a.C0153a(aVar.h()).a(h());
            if (a4 == null) {
                ironSourceError = ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm invalid enriched adm");
                a(2303, (Object[][]) null);
            } else {
                String k4 = a4.k();
                if (k4 != null) {
                    b(k4);
                    a(aVar.a());
                    a(aVar.f());
                    a(82002, (Object[][]) null);
                    this.f17451q.a(a4.b());
                    this.f17449o = new ib();
                    this.f17522a.loadInterstitialForBidding(this.f17524c, null, k4, this);
                    return;
                }
                IronLog.INTERNAL.error("serverData is null");
                ironSourceError = new IronSourceError(e.a.f17415i, "No available ad to load");
            }
            a(ironSourceError);
        } catch (Exception e4) {
            o9.d().a(e4);
            a(ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm: Exception= " + e4.getMessage()));
        }
    }

    private void c(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                a(new IronSourceError(e.a.f17415i, "No available ad to load"));
            } else {
                a(82002, (Object[][]) null);
                this.f17522a.loadInterstitialForBidding(this.f17524c, null, str, this);
            }
        }
    }

    @Override // com.ironsource.InterfaceC1429a5
    public void a(d.a aVar, int i4, long j4, int i5, String str) {
        String str2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        this.f17528g = aVar.a();
        this.f17529h = aVar.f();
        this.f17453s = aVar.a(l());
        a.C0153a c0153a = new a.C0153a(aVar.h());
        if (c0153a.isEmpty()) {
            str2 = "";
        } else {
            C1513m5 c1513m5 = c0153a.get(0);
            this.f17451q.a(c1513m5.b());
            this.f17451q.c(c1513m5.h());
            this.f17451q.b(c1513m5.g());
            str2 = c1513m5.k();
            b(str2);
        }
        if (!TextUtils.isEmpty(str)) {
            a(88002, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i5)}, new Object[]{"reason", str}});
        }
        a(82301, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4)}});
        a(82302, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, c0153a.b()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (!c0153a.isEmpty()) {
                c(str2);
                return;
            }
            IronSourceError ironSourceError = new IronSourceError(1158, "There is no available ad to load");
            ironLog.error("interstitial - empty waterfall");
            a(ironSourceError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.a
    public void a(o oVar) {
        IronLog.INTERNAL.verbose("state=" + k());
        m.a aVar = m.a.NOT_LOADED;
        m.a aVar2 = m.a.LOADED;
        m.a aVar3 = m.a.LOAD_IN_PROGRESS;
        m.a a4 = a(new m.a[]{aVar, aVar2}, aVar3);
        if (a4 != aVar && a4 != aVar2) {
            a(new IronSourceError(1050, a4 == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        t();
        a(2002, (Object[][]) null);
        c(oVar);
    }

    void a(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("instanceName = " + h() + ", error = " + ironSourceError.getErrorMessage());
        p();
        if (a(m.a.LOAD_IN_PROGRESS, m.a.NOT_LOADED)) {
            a(ironSourceError, ib.a(this.f17448n));
            a(this.f17451q.b(), IronSourceUtils.getCurrentMethodName());
            this.f17450p.onInterstitialAdLoadFailed(l(), ironSourceError);
        }
    }

    private void a(IronSourceError ironSourceError, long j4) {
        int errorCode = ironSourceError.getErrorCode();
        Object[] objArr = {IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4)};
        if (errorCode == 1158) {
            a(2213, new Object[][]{objArr, new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}});
        } else {
            a(2200, new Object[][]{objArr, new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        }
    }

    private void a(List<String> list, String str) {
        a(list, h(), i(), this.f17531j, str);
    }

    @Override // com.ironsource.InterfaceC1555s4
    public void a(List<C1513m5> list, String str, C1513m5 c1513m5, JSONObject jSONObject, JSONObject jSONObject2, int i4, long j4, int i5, String str2) {
        IronLog.INTERNAL.error("Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.a
    public boolean a() {
        boolean z4 = false;
        if (!a(m.a.LOADED)) {
            a(2212, (Object[][]) null);
            return false;
        }
        try {
            z4 = this.f17522a.isInterstitialReady(this.f17524c);
            a(z4 ? 2211 : 2212, (Object[][]) null);
            return z4;
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error("exception=" + e4.getMessage());
            return z4;
        }
    }
}
