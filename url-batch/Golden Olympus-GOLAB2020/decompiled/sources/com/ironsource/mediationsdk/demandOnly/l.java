package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C1441c3;
import com.ironsource.C1443c5;
import com.ironsource.C1464f5;
import com.ironsource.C1513m5;
import com.ironsource.InterfaceC1429a5;
import com.ironsource.bi;
import com.ironsource.br;
import com.ironsource.environment.ContextProvider;
import com.ironsource.ib;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.demandOnly.a;
import com.ironsource.mediationsdk.demandOnly.j;
import com.ironsource.mediationsdk.demandOnly.m;
import com.ironsource.mediationsdk.demandOnly.n;
import com.ironsource.mediationsdk.demandOnly.p;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.nb;
import com.ironsource.nm;
import com.ironsource.o9;
import com.ironsource.zb;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class l extends m implements n.b, RewardedVideoSmashListener, InterfaceC1429a5 {

    /* renamed from: n, reason: collision with root package name */
    private ib f17513n;

    /* renamed from: o, reason: collision with root package name */
    private ib f17514o;

    /* renamed from: p, reason: collision with root package name */
    private ISDemandOnlyRewardedVideoListener f17515p;

    /* renamed from: q, reason: collision with root package name */
    private C1443c5 f17516q;

    /* renamed from: r, reason: collision with root package name */
    private com.ironsource.mediationsdk.e f17517r;

    /* renamed from: s, reason: collision with root package name */
    private p f17518s;

    /* renamed from: t, reason: collision with root package name */
    private final bi f17519t;

    /* renamed from: u, reason: collision with root package name */
    private final bi.a f17520u;

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("load timed out state=" + l.this.k());
            l.this.a(new IronSourceError(1055, "load timed out"));
        }
    }

    l(String str, String str2, NetworkSettings networkSettings, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener, long j4, AbstractAdapter abstractAdapter, com.ironsource.mediationsdk.e eVar) {
        super(new C1441c3(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.f17518s = new p.b();
        this.f17519t = nm.S().k();
        this.f17520u = nm.M().e();
        this.f17515p = iSDemandOnlyRewardedVideoListener;
        this.f17527f = j4;
        this.f17517r = eVar;
        this.f17522a.initRewardedVideoForDemandOnly(str, str2, this.f17524c, this);
    }

    private void c(o oVar) {
        IronSourceError ironSourceError;
        this.f17513n = new ib();
        a(s());
        if (!n()) {
            a(new IronSourceError(j.a.f17482k, "loadRewardedVideoWithAdm: must be called by bidder instance"));
            return;
        }
        try {
            d.a aVar = (d.a) oVar.a(new nb());
            C1513m5 a4 = new a.C0153a(aVar.h()).a(h());
            if (a4 == null) {
                ironSourceError = ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm invalid enriched adm");
                a(j.a.f17482k, (Object[][]) null);
            } else {
                String k4 = a4.k();
                if (k4 != null) {
                    b(k4);
                    a(aVar.a());
                    a(aVar.f());
                    a(81002, (Object[][]) null);
                    this.f17516q.a(a4.b());
                    this.f17514o = new ib();
                    this.f17522a.loadRewardedVideoForBidding(this.f17524c, null, k4, this);
                    return;
                }
                IronLog.INTERNAL.error("serverData is null");
                ironSourceError = new IronSourceError(1062, "No available ad to load");
            }
            a(ironSourceError);
        } catch (Exception e4) {
            o9.d().a(e4);
            a(ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm: Exception= " + e4.getMessage()));
        }
    }

    private IronSourceError q() {
        return a(m.a.SHOW_IN_PROGRESS) ? new IronSourceError(1067, "showRewardedVideo error: can't show ad while an ad is already showing") : a(m.a.LOAD_IN_PROGRESS) ? new IronSourceError(1068, "showRewardedVideo error: can't show ad while an ad is loading") : new IronSourceError(1069, "showRewardedVideo error: no available ads to show");
    }

    private com.ironsource.mediationsdk.i r() {
        String str = i() + h();
        com.ironsource.mediationsdk.i iVar = new com.ironsource.mediationsdk.i(this.f17534m);
        iVar.b(IronSourceUtils.isEncryptedResponse());
        iVar.a(true);
        iVar.c(true);
        iVar.d(str);
        iVar.c(l());
        iVar.a(this.f17519t.a(this.f17534m));
        C1464f5 c1464f5 = new C1464f5(h(), false);
        c1464f5.a(this.f17518s.value());
        Map<String, Object> rewardedVideoBiddingData = this.f17522a.getRewardedVideoBiddingData(this.f17524c, new JSONObject());
        if (rewardedVideoBiddingData != null) {
            c1464f5.b(rewardedVideoBiddingData);
        }
        iVar.a(c1464f5);
        return iVar;
    }

    private TimerTask s() {
        return new a();
    }

    private void t() {
        this.f17514o = new ib();
        this.f17522a.loadRewardedVideo(this.f17524c, null, this);
    }

    private void u() {
        if (!this.f17517r.a()) {
            IronLog.INTERNAL.verbose("can't load the rewarded video the auction isn't enabled");
            a(new IronSourceError(1063, "Missing server configuration"));
            return;
        }
        a(81500, (Object[][]) null);
        com.ironsource.mediationsdk.i r4 = r();
        IronLog.INTERNAL.verbose("auction waterfallString = " + r4.q());
        a(81510, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, r4.q()}});
        this.f17517r.a(ContextProvider.getInstance().getApplicationContext(), r4, this);
    }

    private void v() {
        this.f17528g = null;
        this.f17529h = null;
        this.f17531j = null;
        this.f17516q = new C1443c5();
    }

    private void w() {
        this.f17513n = new ib();
        a(s());
        if (n()) {
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideo must be called by non bidder instances");
            a(j.a.f17482k, (Object[][]) null);
            a(buildLoadFailedError);
        } else if (o()) {
            u();
        } else {
            t();
        }
    }

    @Override // com.ironsource.InterfaceC1555s4
    public void a(int i4, String str, int i5, String str2, long j4) {
        IronLog.INTERNAL.verbose("Auction failed. error " + i4 + " - " + str);
        this.f17528g = null;
        this.f17529h = null;
        a(81300, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i4)}, new Object[]{"reason", str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4)}, new Object[]{IronSourceConstants.EVENTS_EXT1, k()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            a(new IronSourceError(j.a.f17481j, "No available ad to load"));
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public void b(o oVar) {
        IronLog.INTERNAL.verbose("state=" + k());
        m.a aVar = m.a.NOT_LOADED;
        m.a aVar2 = m.a.LOADED;
        m.a aVar3 = m.a.LOAD_IN_PROGRESS;
        m.a a4 = a(new m.a[]{aVar, aVar2}, aVar3);
        if (a4 != aVar && a4 != aVar2) {
            a(new IronSourceError(1053, a4 == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        v();
        a(1001, (Object[][]) null);
        c(oVar);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public void d() {
        IronLog.INTERNAL.verbose("state=" + k());
        m.a aVar = m.a.NOT_LOADED;
        m.a aVar2 = m.a.LOADED;
        m.a aVar3 = m.a.LOAD_IN_PROGRESS;
        m.a a4 = a(new m.a[]{aVar, aVar2}, aVar3);
        if (a4 != aVar && a4 != aVar2) {
            this.f17515p.onRewardedVideoAdLoadFailed(l(), new IronSourceError(1053, a4 == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        v();
        a(1001, (Object[][]) null);
        w();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public void e() {
        IronLog.INTERNAL.verbose("instanceName = " + h() + ", state=" + k());
        a(1201, (Object[][]) null);
        if (a(m.a.LOADED, m.a.SHOW_IN_PROGRESS)) {
            this.f17522a.showRewardedVideo(this.f17524c, this);
        } else {
            onRewardedVideoAdShowFailed(q());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(1006, new Object[0][]);
        this.f17515p.onRewardedVideoAdClicked(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
        b(m.a.NOT_LOADED);
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(1203, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(this.f17519t.a(this.f17534m))}});
        this.f17520u.b(this.f17534m);
        this.f17515p.onRewardedVideoAdClosed(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(1005, new Object[0][]);
        a(this.f17516q.a(), IronSourceUtils.getCurrentMethodName());
        this.f17515p.onRewardedVideoAdOpened(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        Map<String, Object> j4 = j();
        if (!TextUtils.isEmpty(com.ironsource.mediationsdk.p.m().l())) {
            j4.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, com.ironsource.mediationsdk.p.m().l());
        }
        if (com.ironsource.mediationsdk.p.m().s() != null) {
            for (String str : com.ironsource.mediationsdk.p.m().s().keySet()) {
                j4.put("custom_" + str, com.ironsource.mediationsdk.p.m().s().get(str));
            }
        }
        Placement a4 = com.ironsource.mediationsdk.p.m().h().c().f().a();
        if (a4 != null) {
            j4.put("placement", a4.getPlacementName());
            j4.put(IronSourceConstants.EVENTS_REWARD_NAME, a4.getRewardName());
            j4.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(a4.getRewardAmount()));
        } else {
            IronLog.INTERNAL.error("defaultPlacement is null");
        }
        zb zbVar = new zb(1010, new JSONObject(j4));
        zbVar.a("transId", IronSourceUtils.getTransId(zbVar.d(), h()));
        br.i().a(zbVar);
        this.f17515p.onRewardedVideoAdRewarded(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.toString() + " instance name= " + h() + " state=" + k());
        b(m.a.NOT_LOADED);
        a(1202, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        this.f17515p.onRewardedVideoAdShowFailed(l(), ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(1206, new Object[0][]);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z4) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.getErrorMessage() + "instance name= " + h() + " state=" + k());
        a(j.c.f17503d, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(ib.a(this.f17514o))}});
        a(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h() + " state=" + k());
        p();
        a(j.c.f17502c, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(ib.a(this.f17514o))}});
        if (a(m.a.LOAD_IN_PROGRESS, m.a.LOADED)) {
            a(1002, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(ib.a(this.f17513n))}});
            a(this.f17516q.c(), IronSourceUtils.getCurrentMethodName());
            this.f17515p.onRewardedVideoAdLoadSuccess(l());
        }
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
        br.i().a(new zb(i4, new JSONObject(j4)));
    }

    private void c(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                a(new IronSourceError(1062, "No available ad to load"));
            } else {
                a(81002, (Object[][]) null);
                this.f17522a.loadRewardedVideoForBidding(this.f17524c, null, str, this);
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
        this.f17518s = aVar.a(l());
        a.C0153a c0153a = new a.C0153a(aVar.h());
        if (c0153a.isEmpty()) {
            str2 = "";
        } else {
            C1513m5 c1513m5 = c0153a.get(0);
            this.f17516q.a(c1513m5.b());
            this.f17516q.c(c1513m5.h());
            this.f17516q.b(c1513m5.g());
            str2 = c1513m5.k();
            b(str2);
        }
        if (!TextUtils.isEmpty(str)) {
            a(88002, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i5)}, new Object[]{"reason", str}});
        }
        a(81301, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4)}});
        a(81302, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, c0153a.b()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (!c0153a.isEmpty()) {
                c(str2);
                return;
            }
            IronSourceError ironSourceError = new IronSourceError(1058, "There is no available ad to load");
            ironLog.error("rewardedVideo - empty waterfall");
            a(ironSourceError);
        }
    }

    void a(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("instanceName = " + h() + ", error = " + ironSourceError.getErrorMessage());
        p();
        if (a(m.a.LOAD_IN_PROGRESS, m.a.NOT_LOADED)) {
            a(ironSourceError, ib.a(this.f17513n));
            a(this.f17516q.b(), IronSourceUtils.getCurrentMethodName());
            this.f17515p.onRewardedVideoAdLoadFailed(l(), ironSourceError);
        }
    }

    private void a(IronSourceError ironSourceError, long j4) {
        int errorCode = ironSourceError.getErrorCode();
        Object[] objArr = {IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4)};
        if (errorCode == 1058) {
            a(1213, new Object[][]{objArr, new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}});
        } else {
            a(1200, new Object[][]{objArr, new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        }
    }

    private void a(List<String> list, String str) {
        a(list, h(), i(), this.f17531j, str);
    }

    @Override // com.ironsource.InterfaceC1555s4
    public void a(List<C1513m5> list, String str, C1513m5 c1513m5, JSONObject jSONObject, JSONObject jSONObject2, int i4, long j4, int i5, String str2) {
        IronLog.INTERNAL.error("Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public boolean a() {
        boolean z4 = false;
        if (!a(m.a.LOADED)) {
            a(1211, (Object[][]) null);
            return false;
        }
        try {
            z4 = this.f17522a.isRewardedVideoAvailable(this.f17524c);
            a(z4 ? 1210 : 1211, (Object[][]) null);
            return z4;
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error("exception=" + e4.getMessage());
            return z4;
        }
    }
}
