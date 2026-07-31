package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C1441c3;
import com.ironsource.al;
import com.ironsource.bi;
import com.ironsource.br;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.nk;
import com.ironsource.nm;
import com.ironsource.o9;
import com.ironsource.y7;
import com.ironsource.zb;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class r extends y implements RewardedVideoSmashListener, y7 {

    /* renamed from: h, reason: collision with root package name */
    private b f17848h;

    /* renamed from: i, reason: collision with root package name */
    private al f17849i;

    /* renamed from: j, reason: collision with root package name */
    private Timer f17850j;

    /* renamed from: k, reason: collision with root package name */
    private int f17851k;

    /* renamed from: l, reason: collision with root package name */
    private String f17852l;

    /* renamed from: m, reason: collision with root package name */
    private String f17853m;

    /* renamed from: n, reason: collision with root package name */
    private Placement f17854n;

    /* renamed from: o, reason: collision with root package name */
    private long f17855o;

    /* renamed from: p, reason: collision with root package name */
    private String f17856p;

    /* renamed from: q, reason: collision with root package name */
    private JSONObject f17857q;

    /* renamed from: r, reason: collision with root package name */
    private int f17858r;

    /* renamed from: s, reason: collision with root package name */
    private String f17859s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f17860t;

    /* renamed from: u, reason: collision with root package name */
    private final Object f17861u;

    /* renamed from: v, reason: collision with root package name */
    private long f17862v;

    /* renamed from: w, reason: collision with root package name */
    private final bi.a f17863w;

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            int i4;
            boolean z4;
            b bVar = r.this.f17848h;
            b bVar2 = b.LOAD_IN_PROGRESS;
            String str = "Rewarded Video - load instance time out";
            if (bVar == bVar2 || r.this.f17848h == b.INIT_IN_PROGRESS) {
                if (r.this.f17848h == bVar2) {
                    i4 = 1025;
                } else {
                    str = "Rewarded Video - init instance time out";
                    i4 = 1032;
                }
                r.this.a(b.NOT_LOADED);
                z4 = true;
            } else {
                z4 = false;
                i4 = 510;
            }
            r.this.a(str);
            if (!z4) {
                r.this.a(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceError.ERROR_LOAD_FAILED_TIMEOUT)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(r.this.v())}, new Object[]{IronSourceConstants.EVENTS_EXT1, r.this.f17848h.name()}});
                return;
            }
            r.this.a(1200, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i4)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(r.this.v())}});
            r.this.a(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i4)}, new Object[]{"reason", str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(r.this.v())}});
            r.this.f17849i.c(r.this);
        }
    }

    protected enum b {
        NO_INIT,
        INIT_IN_PROGRESS,
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS,
        ENDED
    }

    public r(r rVar, al alVar, AbstractAdapter abstractAdapter, int i4, String str, JSONObject jSONObject, int i5, String str2) {
        this(rVar.f17852l, rVar.f17853m, rVar.f18020b.h(), alVar, rVar.f17851k, abstractAdapter, i4);
        this.f17856p = str;
        this.f17857q = jSONObject;
        this.f17858r = i5;
        this.f17859s = str2;
    }

    private void C() {
        try {
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (TextUtils.isEmpty(pluginType)) {
                return;
            }
            this.f18019a.setPluginData(pluginType);
        } catch (Throwable th) {
            o9.d().a(th);
            a("setCustomParams() " + th.getMessage());
        }
    }

    private void D() {
        synchronized (this.f17861u) {
            Timer timer = new Timer();
            this.f17850j = timer;
            timer.schedule(new a(), this.f17851k * 1000);
        }
    }

    private void E() {
        synchronized (this.f17861u) {
            try {
                Timer timer = this.f17850j;
                if (timer != null) {
                    timer.cancel();
                    this.f17850j = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void t() {
        a("isBidder = " + p() + ", shouldEarlyInit = " + s());
        a(b.INIT_IN_PROGRESS);
        C();
        try {
            this.f18019a.initRewardedVideoWithCallback(this.f17852l, this.f17853m, this.f18022d, this);
        } catch (Throwable th) {
            o9.d().a(th);
            b("initForBidding exception: " + th.getLocalizedMessage());
            onRewardedVideoInitFailed(new IronSourceError(IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long v() {
        return new Date().getTime() - this.f17855o;
    }

    public boolean A() {
        if (this.f17848h != b.LOADED) {
            return false;
        }
        try {
            return this.f18019a.isRewardedVideoAvailable(this.f18022d);
        } catch (Throwable th) {
            o9.d().a(th);
            b("isReadyToShow exception: " + th.getLocalizedMessage());
            a(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceConstants.errorCode_isReadyException)}, new Object[]{"reason", th.getLocalizedMessage()}});
            return false;
        }
    }

    public void B() {
        a(IronSourceConstants.RV_CAP_SESSION);
    }

    @Override // com.ironsource.y7
    public void collectBiddingData(AdData adData, @NotNull BiddingDataCallback biddingDataCallback) {
        a(1020);
        try {
            this.f18019a.collectRewardedVideoBiddingData(this.f18022d, adData != null ? nk.a(adData.getAdUnitData()) : null, biddingDataCallback);
        } catch (Throwable th) {
            o9.d().a(th);
            b("collectBiddingData exception: " + th.getLocalizedMessage());
            IronLog.INTERNAL.error(th.toString());
        }
    }

    @Override // com.ironsource.mediationsdk.y
    public IronSource.AD_UNIT d() {
        return IronSource.AD_UNIT.REWARDED_VIDEO;
    }

    @Override // com.ironsource.mediationsdk.y
    public String k() {
        return "LWSProgRvSmash";
    }

    @Override // com.ironsource.mediationsdk.y
    public int l() {
        return 2;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
        a("onRewardedVideoAdClicked");
        this.f17849i.b(this, this.f17854n);
        b(1006);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
        a("onRewardedVideoAdClosed");
        synchronized (this.f17860t) {
            try {
                if (this.f17848h == b.SHOW_IN_PROGRESS) {
                    a(b.ENDED);
                    this.f17862v = new Date().getTime();
                    this.f17849i.b(this);
                } else {
                    b(1203);
                    a(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceConstants.errorCode_adClosed)}, new Object[]{"reason", "adClosed: " + this.f17848h}});
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
        a("onRewardedVideoAdEnded");
        this.f17849i.f(this);
        b(IronSourceConstants.RV_INSTANCE_ENDED);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
        a("onRewardedVideoAdOpened");
        this.f17849i.d(this);
        b(1005);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() {
        a("onRewardedVideoAdRewarded");
        long time = new Date().getTime();
        this.f17849i.a(this, this.f17854n);
        Map<String, Object> m4 = m();
        Placement placement = this.f17854n;
        if (placement != null) {
            m4.put("placement", placement.getPlacementName());
            m4.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f17854n.getRewardName());
            m4.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.f17854n.getRewardAmount()));
        }
        if (!TextUtils.isEmpty(p.m().l())) {
            m4.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, p.m().l());
        }
        if (p.m().s() != null) {
            for (String str : p.m().s().keySet()) {
                m4.put("custom_" + str, p.m().s().get(str));
            }
        }
        if (!TextUtils.isEmpty(this.f17856p)) {
            m4.put("auctionId", this.f17856p);
        }
        JSONObject jSONObject = this.f17857q;
        if (jSONObject != null && jSONObject.length() > 0) {
            m4.put("genericParams", this.f17857q);
        }
        if (c(1010)) {
            br.i().a(m4, this.f17858r, this.f17859s);
        }
        m4.put("sessionDepth", Integer.valueOf(this.f18024f));
        zb zbVar = new zb(1010, new JSONObject(m4));
        zbVar.a("transId", IronSourceUtils.getTransId(zbVar.d(), c()));
        long j4 = this.f17862v;
        if (j4 != 0) {
            long j5 = time - j4;
            a("onRewardedVideoAdRewarded timeAfterClosed=" + j5);
            zbVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j5));
        }
        br.i().a(zbVar);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        a("onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        b(1202, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        synchronized (this.f17860t) {
            try {
                if (this.f17848h == b.SHOW_IN_PROGRESS) {
                    a(b.ENDED);
                    this.f17849i.a(ironSourceError, this);
                    return;
                }
                a(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceConstants.errorCode_showFailed)}, new Object[]{"reason", "showFailed: " + this.f17848h}});
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
        a("onRewardedVideoAdStarted");
        this.f17849i.a(this);
        b(IronSourceConstants.RV_INSTANCE_STARTED);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
        a("onRewardedVideoAdVisible");
        b(1206);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z4) {
        boolean z5;
        a("onRewardedVideoAvailabilityChanged available=" + z4 + " state=" + this.f17848h.name());
        synchronized (this.f17860t) {
            try {
                if (this.f17848h == b.LOAD_IN_PROGRESS) {
                    a(z4 ? b.LOADED : b.NOT_LOADED);
                    z5 = false;
                } else {
                    z5 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z5) {
            if (z4) {
                a(IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.f17848h.name()}});
                return;
            } else {
                a(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(v())}, new Object[]{IronSourceConstants.EVENTS_EXT1, this.f17848h.name()}});
                return;
            }
        }
        E();
        a(z4 ? 1002 : 1200, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(v())}});
        if (z4) {
            this.f17849i.e(this);
        } else {
            this.f17849i.c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        a("onRewardedVideoInitFailed error=" + ironSourceError.getErrorMessage());
        E();
        a(1200, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(v())}});
        a(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(v())}});
        synchronized (this.f17860t) {
            try {
                if (this.f17848h == b.INIT_IN_PROGRESS) {
                    a(b.NO_INIT);
                    this.f17849i.c(this);
                    return;
                }
                a(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceConstants.errorCode_initFailed)}, new Object[]{"reason", "initFailed: " + this.f17848h}});
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
        a("onRewardedVideoInitSuccess");
        synchronized (this.f17860t) {
            try {
                if (this.f17848h != b.INIT_IN_PROGRESS) {
                    a(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceConstants.errorCode_initSuccess)}, new Object[]{"reason", "initSuccess: " + this.f17848h}});
                } else {
                    a(b.NOT_LOADED);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 1058) {
            a(1213, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(v())}});
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.f18025g = Long.valueOf(System.currentTimeMillis());
        }
        a(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(v())}});
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
    }

    public String u() {
        return this.f17856p;
    }

    public LoadWhileShowSupportState w() {
        try {
            return this.f18019a.getLoadWhileShowSupportState(this.f18022d);
        } catch (Throwable th) {
            o9.d().a(th);
            b("Exception while calling adapter.getLoadWhileShowSupportState() - " + th.getLocalizedMessage());
            return LoadWhileShowSupportState.NONE;
        }
    }

    public Placement x() {
        return this.f17854n;
    }

    public boolean y() {
        return this.f17848h == b.LOADED;
    }

    public boolean z() {
        b bVar = this.f17848h;
        return bVar == b.INIT_IN_PROGRESS || bVar == b.LOAD_IN_PROGRESS;
    }

    public r(String str, String str2, NetworkSettings networkSettings, al alVar, int i4, AbstractAdapter abstractAdapter, int i5) {
        super(new C1441c3(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.f17860t = new Object();
        this.f17861u = new Object();
        this.f17863w = nm.M().e();
        this.f17852l = str;
        this.f17853m = str2;
        this.f17849i = alVar;
        this.f17850j = null;
        this.f17851k = i4;
        this.f18024f = i5;
        this.f17848h = b.NO_INIT;
        this.f17862v = 0L;
        if (r()) {
            t();
        }
    }

    private void b(int i4) {
        b(i4, null);
    }

    private boolean c(int i4) {
        return i4 == 1001 || i4 == 1002 || i4 == 1200 || i4 == 1212 || i4 == 1213 || i4 == 1005 || i4 == 1203 || i4 == 1201 || i4 == 1202 || i4 == 1006 || i4 == 1010;
    }

    public void a(int i4) {
        a(i4, null, false);
    }

    public void a(int i4, Object[][] objArr) {
        a(i4, objArr, false);
    }

    public void b(int i4, Object[][] objArr) {
        a(i4, objArr, true);
    }

    private void a(int i4, Object[][] objArr, boolean z4) {
        Placement placement;
        Map<String, Object> m4 = m();
        if (!TextUtils.isEmpty(this.f17856p)) {
            m4.put("auctionId", this.f17856p);
        }
        JSONObject jSONObject = this.f17857q;
        if (jSONObject != null && jSONObject.length() > 0) {
            m4.put("genericParams", this.f17857q);
        }
        if (z4 && (placement = this.f17854n) != null && !TextUtils.isEmpty(placement.getPlacementName())) {
            m4.put("placement", this.f17854n.getPlacementName());
        }
        if (c(i4)) {
            br.i().a(m4, this.f17858r, this.f17859s);
        }
        m4.put("sessionDepth", Integer.valueOf(this.f18024f));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    m4.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e4) {
                o9.d().a(e4);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, c() + " smash: RV sendProviderEvent " + Log.getStackTraceString(e4), 3);
            }
        }
        br.i().a(new zb(i4, new JSONObject(m4)));
        if (i4 == 1203) {
            this.f17863w.b(IronSource.AD_UNIT.REWARDED_VIDEO);
        }
    }

    public void b(boolean z4) {
        b(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, new Object[][]{new Object[]{"status", z4 ? com.ironsource.mediationsdk.metadata.a.f17681g : "false"}});
    }

    public void a(Placement placement) {
        E();
        a("showVideo()");
        this.f17854n = placement;
        a(b.SHOW_IN_PROGRESS);
        b(1201);
        try {
            this.f18019a.showRewardedVideo(this.f18022d, this);
        } catch (Throwable th) {
            o9.d().a(th);
            b("showVideo exception: " + th.getLocalizedMessage());
            onRewardedVideoAdShowFailed(new IronSourceError(IronSourceError.ERROR_RV_SHOW_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar) {
        a("current state=" + this.f17848h + ", new state=" + bVar);
        synchronized (this.f17860t) {
            this.f17848h = bVar;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:55:0x0109
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(java.lang.String r7, org.json.JSONObject r8) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.r.a(java.lang.String, org.json.JSONObject):void");
    }
}
