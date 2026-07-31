package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C1513m5;
import com.ironsource.C1529o5;
import com.ironsource.InterfaceC1530p;
import com.ironsource.InterfaceC1555s4;
import com.ironsource.a8;
import com.ironsource.al;
import com.ironsource.bl;
import com.ironsource.br;
import com.ironsource.cg;
import com.ironsource.dr;
import com.ironsource.eg;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.eo;
import com.ironsource.eq;
import com.ironsource.er;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.h;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.nc;
import com.ironsource.nm;
import com.ironsource.o9;
import com.ironsource.qk;
import com.ironsource.rs;
import com.ironsource.w7;
import com.ironsource.z7;
import com.ironsource.zb;
import com.ironsource.zq;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class q extends m implements al, er, InterfaceC1555s4, eg, eo, InterfaceC1530p {

    /* renamed from: A, reason: collision with root package name */
    private long f17802A;

    /* renamed from: B, reason: collision with root package name */
    private Boolean f17803B;

    /* renamed from: C, reason: collision with root package name */
    private final Object f17804C;

    /* renamed from: D, reason: collision with root package name */
    private nc f17805D;

    /* renamed from: E, reason: collision with root package name */
    private final long f17806E;

    /* renamed from: F, reason: collision with root package name */
    private final cg.a f17807F;

    /* renamed from: G, reason: collision with root package name */
    private final cg f17808G;

    /* renamed from: e, reason: collision with root package name */
    private bl f17809e;

    /* renamed from: f, reason: collision with root package name */
    private ConcurrentHashMap<String, C1513m5> f17810f;

    /* renamed from: g, reason: collision with root package name */
    private ConcurrentHashMap<String, h.a> f17811g;

    /* renamed from: h, reason: collision with root package name */
    private C1513m5 f17812h;

    /* renamed from: i, reason: collision with root package name */
    private h f17813i;

    /* renamed from: j, reason: collision with root package name */
    private com.ironsource.mediationsdk.e f17814j;

    /* renamed from: k, reason: collision with root package name */
    private JSONObject f17815k;

    /* renamed from: l, reason: collision with root package name */
    private dr f17816l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f17817m;

    /* renamed from: n, reason: collision with root package name */
    private long f17818n;

    /* renamed from: o, reason: collision with root package name */
    private String f17819o;

    /* renamed from: p, reason: collision with root package name */
    private int f17820p;

    /* renamed from: q, reason: collision with root package name */
    private NetworkStateReceiver f17821q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f17822r;

    /* renamed from: s, reason: collision with root package name */
    private final ConcurrentHashMap<String, r> f17823s;

    /* renamed from: t, reason: collision with root package name */
    private rs f17824t;

    /* renamed from: u, reason: collision with root package name */
    private int f17825u;

    /* renamed from: v, reason: collision with root package name */
    private String f17826v;

    /* renamed from: w, reason: collision with root package name */
    private int f17827w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f17828x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f17829y;

    /* renamed from: z, reason: collision with root package name */
    private e f17830z;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ NetworkSettings f17831a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ zq f17832b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f17833c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f17834d;

        a(NetworkSettings networkSettings, zq zqVar, String str, String str2) {
            this.f17831a = networkSettings;
            this.f17832b = zqVar;
            this.f17833c = str;
            this.f17834d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            q.this.a(this.f17831a, this.f17832b, this.f17833c, this.f17834d);
        }
    }

    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            q.this.j();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q.this.d("makeAuction()");
            q.this.f17818n = new Date().getTime();
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            q.this.b(hashMap, arrayList, sb, arrayList2);
            q.this.a(hashMap, arrayList, sb, arrayList2);
        }
    }

    class d implements z7.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f17838a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ StringBuilder f17839b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f17840c;

        d(Map map, StringBuilder sb, List list) {
            this.f17838a = map;
            this.f17839b = sb;
            this.f17840c = list;
        }

        @Override // com.ironsource.z7.b
        public void a(@NotNull List<a8> list, long j4, @NotNull List<String> list2) {
            q.this.c(IronSourceConstants.RV_COLLECT_TOKENS_COMPLETED, qk.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4)}}));
            for (a8 a8Var : list) {
                r rVar = (r) q.this.f17823s.get(a8Var.c());
                if (a8Var.a() != null) {
                    this.f17838a.put(a8Var.c(), a8Var.a());
                    StringBuilder sb = this.f17839b;
                    sb.append(a8Var.d());
                    sb.append(a8Var.c());
                    sb.append(StringUtils.COMMA);
                    if (rVar != null) {
                        rVar.a(1021, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(a8Var.e())}});
                    }
                } else if (rVar != null) {
                    rVar.a(1022, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(a8Var.e())}, new Object[]{"reason", a8Var.b()}});
                }
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                r rVar2 = (r) q.this.f17823s.get(it.next());
                if (rVar2 != null) {
                    rVar2.a(1023, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4)}});
                }
            }
            q.this.a((Map<String, Object>) this.f17838a, (List<String>) this.f17840c, this.f17839b.toString());
        }

        @Override // com.ironsource.z7.b
        public void onFailure(String str) {
            q.this.c(IronSourceConstants.RV_COLLECT_TOKENS_FAILED, qk.a(new Object[][]{new Object[]{"reason", str}}));
            q.this.a((Map<String, Object>) this.f17838a, (List<String>) this.f17840c, this.f17839b.toString());
        }
    }

    private enum e {
        RV_STATE_INITIATING,
        RV_STATE_AUCTION_IN_PROGRESS,
        RV_STATE_NOT_LOADED,
        RV_STATE_LOADING_SMASHES,
        RV_STATE_READY_TO_SHOW
    }

    public q(List<NetworkSettings> list, zq zqVar, String str, String str2, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        super(hashSet, ironSourceSegment);
        this.f17819o = "";
        this.f17822r = false;
        this.f17825u = 1;
        this.f17804C = new Object();
        this.f17807F = nm.M().m();
        this.f17808G = nm.S().B();
        long time = new Date().getTime();
        c(IronSourceConstants.RV_MANAGER_INIT_STARTED, qk.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.LWS_RV_MANAGER_NAME}}));
        a(e.RV_STATE_INITIATING);
        this.f17803B = null;
        this.f17827w = zqVar.g();
        this.f17828x = zqVar.j();
        this.f17826v = "";
        this.f17815k = null;
        C1529o5 k4 = zqVar.k();
        this.f17829y = false;
        this.f17809e = new bl(zqVar.k().f(), zqVar.k().i());
        this.f17810f = new ConcurrentHashMap<>();
        this.f17811g = new ConcurrentHashMap<>();
        this.f17802A = new Date().getTime();
        boolean z4 = k4.g() > 0;
        this.f17817m = z4;
        if (z4) {
            this.f17814j = new com.ironsource.mediationsdk.e(IronSource.AD_UNIT.REWARDED_VIDEO, k4, this);
        }
        this.f17816l = new dr(k4, this);
        ConcurrentHashMap<String, r> concurrentHashMap = new ConcurrentHashMap<>();
        this.f17823s = concurrentHashMap;
        a(list, zqVar, str, str2);
        this.f17813i = new h(list, k4.c());
        rs rsVar = new rs();
        this.f17824t = rsVar;
        rsVar.a(new ArrayList(concurrentHashMap.values()));
        this.f17805D = new nc(zqVar.c(), this);
        this.f17806E = zqVar.l();
        c(IronSourceConstants.RV_MANAGER_INIT_ENDED, qk.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - time)}}));
        a(k4.k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i4, Map<String, Object> map) {
        a(i4, map, false, false);
    }

    private List<C1513m5> g() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (r rVar : this.f17823s.values()) {
            if (!rVar.p() && !this.f17824t.b(rVar) && this.f17809e.b(rVar)) {
                copyOnWriteArrayList.add(new C1513m5(rVar.c()));
            }
        }
        return copyOnWriteArrayList;
    }

    private void h() {
        a(e.RV_STATE_NOT_LOADED);
        if (!this.f17829y) {
            b(false);
        }
        this.f17816l.a();
    }

    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1095)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1049)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    private void i() {
        /*
            r4 = this;
            com.ironsource.bl r0 = r4.f17809e
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.c()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L38
            java.lang.String r0 = "loadSmashes -  waterfall is empty"
            r4.d(r0)
            r0 = 80004(0x13884, float:1.1211E-40)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "errorCode"
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            java.lang.String r1 = "reason"
            java.lang.String r2 = "waterfall is empty"
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.Object[][] r0 = new java.lang.Object[][]{r0, r1}
            java.util.Map r0 = com.ironsource.qk.a(r0)
            r1 = 81001(0x13c69, float:1.13507E-40)
            r4.a(r1, r0)
            r4.h()
            return
        L38:
            com.ironsource.mediationsdk.q$e r0 = com.ironsource.mediationsdk.q.e.RV_STATE_LOADING_SMASHES
            r4.a(r0)
            r0 = 0
            r1 = r0
        L3f:
            com.ironsource.bl r2 = r4.f17809e
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.c()
            int r2 = r2.size()
            if (r0 >= r2) goto Lb8
            int r2 = r4.f17827w
            if (r1 >= r2) goto Lb8
            com.ironsource.bl r2 = r4.f17809e
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.c()
            java.lang.Object r2 = r2.get(r0)
            com.ironsource.mediationsdk.r r2 = (com.ironsource.mediationsdk.r) r2
            boolean r3 = r2.h()
            if (r3 == 0) goto Lb5
            boolean r3 = r4.f17828x
            if (r3 == 0) goto Lb0
            boolean r3 = r2.p()
            if (r3 == 0) goto Lb0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            if (r1 != 0) goto L91
            r0.<init>()
            java.lang.String r1 = "Advanced Loading: Starting to load bidder "
            r0.append(r1)
            java.lang.String r1 = r2.c()
            r0.append(r1)
            java.lang.String r1 = ". No other instances will be loaded at the same time."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.d(r0)
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r0)
            r4.g(r2)
            return
        L91:
            r0.<init>()
            java.lang.String r1 = "Advanced Loading: Won't start loading bidder "
            r0.append(r1)
            java.lang.String r1 = r2.c()
            r0.append(r1)
            java.lang.String r1 = " as a non bidder is being loaded"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.d(r0)
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r0)
            return
        Lb0:
            r4.g(r2)
            int r1 = r1 + 1
        Lb5:
            int r0 = r0 + 1
            goto L3f
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.q.i():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        synchronized (this.f17804C) {
            try {
                e eVar = this.f17830z;
                e eVar2 = e.RV_STATE_AUCTION_IN_PROGRESS;
                if (eVar != eVar2) {
                    a(eVar2);
                    AsyncTask.execute(new c());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void k() {
        a(g(), "fallback_" + System.currentTimeMillis(), this.f17815k);
    }

    @Override // com.ironsource.al
    public void d(r rVar) {
        this.f17809e.a(rVar);
        this.f17825u++;
        a(rVar, "onRewardedVideoAdOpened");
        if (this.f17817m) {
            C1513m5 c1513m5 = this.f17810f.get(rVar.c());
            if (c1513m5 != null) {
                bl blVar = this.f17809e;
                blVar.a(blVar.d(), c1513m5.a(this.f17826v), c1513m5.d());
                this.f17814j.a(c1513m5, rVar.g(), this.f17812h, this.f17826v);
                this.f17811g.put(rVar.c(), h.a.ISAuctionPerformanceShowedSuccessfully);
                a(c1513m5, this.f17826v);
            } else {
                String c4 = rVar.c();
                c("onRewardedVideoAdOpened showing instance " + c4 + " missing from waterfall");
                StringBuilder sb = new StringBuilder();
                sb.append("Showing missing ");
                sb.append(this.f17830z);
                a(IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, qk.a(new Object[][]{new Object[]{"errorCode", 1011}, new Object[]{"reason", sb.toString()}, new Object[]{IronSourceConstants.EVENTS_EXT1, c4}}));
            }
        }
        eq.a().c(this.f17809e.a(rVar.u()));
        b(false);
        this.f17816l.c();
    }

    @Override // com.ironsource.al
    public void e(r rVar) {
        synchronized (this.f17804C) {
            try {
                a(rVar, "onLoadSuccess mState=" + this.f17830z);
                if (rVar.u() == this.f17809e.d() && this.f17830z != e.RV_STATE_AUCTION_IN_PROGRESS) {
                    this.f17811g.put(rVar.c(), h.a.ISAuctionPerformanceLoadedSuccessfully);
                    e eVar = this.f17830z;
                    e eVar2 = e.RV_STATE_LOADING_SMASHES;
                    if (eVar == eVar2) {
                        a(e.RV_STATE_READY_TO_SHOW);
                        a(1003, qk.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - this.f17818n)}}));
                        this.f17805D.a(0L);
                        if (this.f17817m) {
                            C1513m5 c1513m5 = this.f17810f.get(rVar.c());
                            if (c1513m5 != null) {
                                bl blVar = this.f17809e;
                                blVar.a(blVar.d(), c1513m5.a(""), c1513m5.d());
                                this.f17814j.a(c1513m5, rVar.g(), this.f17812h);
                                this.f17814j.a(this.f17809e.c(), this.f17810f, rVar.g(), this.f17812h, c1513m5);
                            } else {
                                String c4 = rVar.c();
                                c("onLoadSuccess winner instance " + c4 + " missing from waterfall. auctionId: " + rVar.u() + " and the current id is " + this.f17809e.d());
                                StringBuilder sb = new StringBuilder();
                                sb.append("Loaded missing ");
                                sb.append(eVar2);
                                a(IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, qk.a(new Object[][]{new Object[]{"errorCode", 1010}, new Object[]{"reason", sb.toString()}, new Object[]{IronSourceConstants.EVENTS_EXT1, c4}}));
                            }
                        }
                        b(true);
                    }
                }
                d("onLoadSuccess was invoked with auctionId: " + rVar.u() + " and the current id is " + this.f17809e.d());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onLoadSuccess wrong auction ID ");
                sb2.append(this.f17830z);
                rVar.a(IronSourceConstants.RV_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{"errorCode", 2}, new Object[]{"reason", sb2.toString()}});
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ironsource.al
    public void f(r rVar) {
        a(rVar, "onRewardedVideoAdEnded");
        eq.a().b();
    }

    private String a(C1513m5 c1513m5) {
        r rVar = this.f17823s.get(c1513m5.c());
        return (rVar != null ? Integer.toString(rVar.g()) : TextUtils.isEmpty(c1513m5.k()) ? "1" : "2") + c1513m5.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager: " + str, 0);
    }

    private void g(r rVar) {
        String k4 = this.f17810f.get(rVar.c()).k();
        JSONObject a4 = this.f17810f.get(rVar.c()).a();
        rVar.c(k4);
        rVar.a(k4, a4);
    }

    @Override // com.ironsource.er
    public void b() {
        d("onLoadTriggered: RV load was triggered in " + this.f17830z + " state");
        a(0L);
    }

    @Override // com.ironsource.al
    public void c(r rVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        synchronized (this.f17804C) {
            try {
                a(rVar, "onLoadError mState=" + this.f17830z);
                if (rVar.u() == this.f17809e.d() && this.f17830z != e.RV_STATE_AUCTION_IN_PROGRESS) {
                    this.f17811g.put(rVar.c(), h.a.ISAuctionPerformanceFailedToLoad);
                    e eVar = this.f17830z;
                    if (eVar == e.RV_STATE_LOADING_SMASHES || eVar == e.RV_STATE_READY_TO_SHOW) {
                        Iterator<r> it = this.f17809e.c().iterator();
                        boolean z4 = false;
                        boolean z5 = false;
                        while (it.hasNext()) {
                            r next = it.next();
                            if (next.h()) {
                                if (this.f17828x && next.p()) {
                                    if (!z4 && !z5) {
                                        String str = "Advanced Loading: Starting to load bidder " + next.c() + ". No other instances will be loaded at the same time.";
                                        d(str);
                                        IronSourceUtils.sendAutomationLog(str);
                                    }
                                    String str2 = "Advanced Loading: Won't start loading bidder " + next.c() + " as " + (z4 ? "a non bidder is being loaded" : "a non bidder was already loaded successfully");
                                    d(str2);
                                    IronSourceUtils.sendAutomationLog(str2);
                                }
                                if (this.f17810f.get(next.c()) != null) {
                                    copyOnWriteArrayList.add(next);
                                    if (!this.f17828x || !rVar.p() || next.p() || copyOnWriteArrayList.size() >= this.f17827w) {
                                        break;
                                    } else {
                                        z4 = true;
                                    }
                                } else {
                                    continue;
                                }
                            } else if (next.z()) {
                                z4 = true;
                            } else if (next.A()) {
                                z5 = true;
                            }
                        }
                        if (copyOnWriteArrayList.size() == 0 && !z5 && !z4) {
                            d("onLoadError(): No other available smashes");
                            if (!this.f17829y) {
                                b(false);
                            }
                            a(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, qk.a(new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW)}, new Object[]{"reason", "Mediation No fill"}}));
                            a(e.RV_STATE_NOT_LOADED);
                            this.f17816l.a();
                        }
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (it2.hasNext()) {
                            g((r) it2.next());
                        }
                        return;
                    }
                }
                d("onLoadError was invoked with auctionId:" + rVar.u() + " and the current id is " + this.f17809e.d());
                StringBuilder sb = new StringBuilder();
                sb.append("loadError wrong auction ID ");
                sb.append(this.f17830z);
                rVar.a(IronSourceConstants.RV_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{"errorCode", 4}, new Object[]{"reason", sb.toString()}});
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void b(int i4) {
        a(i4, (Map<String, Object>) null, false, false);
    }

    private void c(r rVar, Placement placement) {
        d("showVideo()");
        this.f17824t.a(rVar);
        if (this.f17824t.b(rVar)) {
            rVar.B();
            IronSourceUtils.sendAutomationLog(rVar.c() + " rewarded video is now session capped");
        }
        cg.a aVar = this.f17807F;
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        String placementName = placement.getPlacementName();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        aVar.a(applicationContext, placementName, ad_unit);
        if (this.f17808G.b(ContextProvider.getInstance().getApplicationContext(), placement, ad_unit)) {
            a(IronSourceConstants.RV_CAP_PLACEMENT);
        }
        this.f17805D.a();
        rVar.a(placement);
    }

    @Override // com.ironsource.InterfaceC1530p
    public void a() {
        a(e.RV_STATE_NOT_LOADED);
        a(false, qk.a(new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{"reason", "loaded ads are expired"}}));
        a(0L);
    }

    @Override // com.ironsource.eg
    public boolean d() {
        if ((!this.f17822r || IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) && this.f17830z == e.RV_STATE_READY_TO_SHOW && !this.f17829y) {
            Iterator<r> it = this.f17809e.c().iterator();
            while (it.hasNext()) {
                if (it.next().A()) {
                    return true;
                }
            }
        }
        return false;
    }

    private void a(int i4) {
        a(i4, (Map<String, Object>) null, true, true);
    }

    private void b(int i4, Map<String, Object> map) {
        a(i4, map, true, true);
    }

    private void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager: " + str, 3);
    }

    private boolean c(int i4) {
        return i4 == 1003 || i4 == 1302 || i4 == 1301 || i4 == 1303;
    }

    @Override // com.ironsource.InterfaceC1555s4
    public void a(int i4, String str, int i5, String str2, long j4) {
        String str3 = "Auction failed | moving to fallback waterfall (error " + i4 + " - " + str + ")";
        d(str3);
        IronSourceUtils.sendAutomationLog("RV: " + str3);
        this.f17820p = i5;
        this.f17819o = str2;
        this.f17815k = null;
        k();
        boolean isEmpty = TextUtils.isEmpty(str);
        Object[] objArr = {"errorCode", Integer.valueOf(i4)};
        a(1301, isEmpty ? qk.a(new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4)}}) : qk.a(new Object[][]{objArr, new Object[]{"reason", str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4)}}));
        i();
    }

    private void a(int i4, Map<String, Object> map) {
        a(i4, map, false, true);
    }

    private boolean c(boolean z4) {
        Boolean bool = this.f17803B;
        if (bool == null) {
            return false;
        }
        if (z4 && !bool.booleanValue() && d()) {
            return true;
        }
        return !z4 && this.f17803B.booleanValue();
    }

    @Override // com.ironsource.al
    public void b(r rVar) {
        String str;
        a(rVar, "onRewardedVideoAdClosed, mediation state: " + this.f17830z.name());
        eq.a().b(this.f17809e.a(rVar.u()));
        this.f17829y = false;
        boolean z4 = this.f17830z == e.RV_STATE_READY_TO_SHOW;
        StringBuilder sb = new StringBuilder();
        if (z4) {
            Iterator<r> it = this.f17809e.c().iterator();
            while (it.hasNext()) {
                r next = it.next();
                if (next.y()) {
                    sb.append(next.c() + ";");
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("otherRVAvailable = ");
        if (sb.length() > 0) {
            str = "true|" + ((Object) sb);
        } else {
            str = "false";
        }
        sb2.append(str);
        rVar.b(1203, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}});
        if (rVar.equals(this.f17809e.f())) {
            this.f17809e.a((r) null);
            if (this.f17830z != e.RV_STATE_READY_TO_SHOW) {
                b(false);
            }
        }
    }

    private void a(int i4, Map<String, Object> map, boolean z4, boolean z5) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 2);
        if (z5 && !TextUtils.isEmpty(this.f17809e.d())) {
            hashMap.put("auctionId", this.f17809e.d());
        }
        JSONObject jSONObject = this.f17815k;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put("genericParams", this.f17815k);
        }
        if (z4 && !TextUtils.isEmpty(this.f17826v)) {
            hashMap.put("placement", this.f17826v);
        }
        if (c(i4)) {
            br.i().a(hashMap, this.f17820p, this.f17819o);
        }
        hashMap.put("sessionDepth", Integer.valueOf(this.f17825u));
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    hashMap.putAll(map);
                }
            } catch (Exception e4) {
                o9.d().a(e4);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager: RV sendMediationEvent " + Log.getStackTraceString(e4), 3);
            }
        }
        br.i().a(new zb(i4, new JSONObject(hashMap)));
    }

    @Override // com.ironsource.al
    public void b(r rVar, Placement placement) {
        a(rVar, "onRewardedVideoAdClicked");
        eq.a().a(placement, this.f17809e.a(rVar.u()));
    }

    private void a(long j4) {
        if (this.f17824t.a()) {
            d("all smashes are capped");
            a(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, qk.a(new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceConstants.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED)}, new Object[]{"reason", "all smashes are capped"}}));
            h();
            return;
        }
        a(IronSource.AD_UNIT.REWARDED_VIDEO);
        if (this.f17817m) {
            if (!this.f17811g.isEmpty()) {
                this.f17813i.a(this.f17811g);
                this.f17811g.clear();
            }
            new Timer().schedule(new b(), j4);
            return;
        }
        d("auction fallback flow starting");
        k();
        if (!this.f17809e.c().isEmpty()) {
            b(1000);
            i();
        } else {
            d("loadSmashes -  waterfall is empty");
            a(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, qk.a(new Object[][]{new Object[]{"errorCode", 80004}, new Object[]{"reason", "waterfall is empty"}}));
            h();
        }
    }

    private void b(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<String, Object> map, List<String> list, StringBuilder sb, List<w7> list2) {
        for (r rVar : this.f17823s.values()) {
            if (!this.f17824t.b(rVar) && this.f17809e.b(rVar)) {
                if (rVar.p()) {
                    list2.add(new w7(rVar.g(), rVar.c(), null, rVar, null, null));
                } else {
                    list.add(rVar.c());
                    sb.append(rVar.g() + rVar.c() + StringUtils.COMMA);
                }
            }
        }
    }

    @Override // com.ironsource.eg
    public void a(Activity activity, Placement placement) {
        synchronized (this.f17804C) {
            try {
                if (placement == null) {
                    a("showRewardedVideo error: empty default placement");
                    IronSourceError ironSourceError = new IronSourceError(1021, "showRewardedVideo error: empty default placement");
                    eq a4 = eq.a();
                    bl blVar = this.f17809e;
                    a4.a(ironSourceError, blVar.a(blVar.d()));
                    a(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, qk.a(new Object[][]{new Object[]{"errorCode", 1021}, new Object[]{"reason", "showRewardedVideo error: empty default placement"}}), false, true);
                } else {
                    this.f17826v = placement.getPlacementName();
                    b("showRewardedVideo(" + placement + ")");
                    r rVar = null;
                    b(IronSourceConstants.RV_API_SHOW_CALLED, activity != null ? qk.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.EVENTS_INIT_CONTEXT_FLOW}}) : null);
                    if (this.f17829y) {
                        a("showRewardedVideo error: can't show ad while an ad is already showing");
                        IronSourceError ironSourceError2 = new IronSourceError(1022, "showRewardedVideo error: can't show ad while an ad is already showing");
                        eq a5 = eq.a();
                        bl blVar2 = this.f17809e;
                        a5.a(ironSourceError2, blVar2.a(blVar2.d()));
                        b(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, qk.a(new Object[][]{new Object[]{"errorCode", 1022}, new Object[]{"reason", "showRewardedVideo error: can't show ad while an ad is already showing"}}));
                    } else if (this.f17830z != e.RV_STATE_READY_TO_SHOW) {
                        a("showRewardedVideo error: show called while no ads are available");
                        IronSourceError ironSourceError3 = new IronSourceError(1023, "showRewardedVideo error: show called while no ads are available");
                        eq a6 = eq.a();
                        bl blVar3 = this.f17809e;
                        a6.a(ironSourceError3, blVar3.a(blVar3.d()));
                        b(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, qk.a(new Object[][]{new Object[]{"errorCode", 1023}, new Object[]{"reason", "showRewardedVideo error: show called while no ads are available"}}));
                    } else if (this.f17808G.b(ContextProvider.getInstance().getApplicationContext(), placement, IronSource.AD_UNIT.REWARDED_VIDEO)) {
                        String str = "showRewardedVideo error: placement " + this.f17826v + " is capped";
                        a(str);
                        IronSourceError ironSourceError4 = new IronSourceError(IronSourceError.ERROR_PLACEMENT_CAPPED, str);
                        eq a7 = eq.a();
                        bl blVar4 = this.f17809e;
                        a7.a(ironSourceError4, blVar4.a(blVar4.d()));
                        b(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, qk.a(new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceError.ERROR_PLACEMENT_CAPPED)}, new Object[]{"reason", str}}));
                    } else {
                        StringBuffer stringBuffer = new StringBuffer();
                        Iterator<r> it = this.f17809e.c().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            r next = it.next();
                            if (next.A()) {
                                this.f17829y = true;
                                next.b(true);
                                a(e.RV_STATE_NOT_LOADED);
                                rVar = next;
                                break;
                            }
                            if (next.e() != null) {
                                stringBuffer.append(next.c() + StringUtils.PROCESS_POSTFIX_DELIMITER + next.e() + StringUtils.COMMA);
                            }
                            next.b(false);
                        }
                        if (rVar != null) {
                            c(rVar, placement);
                            return;
                        }
                        d("showRewardedVideo(): No ads to show");
                        eq a8 = eq.a();
                        IronSourceError buildNoAdsToShowError = ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
                        bl blVar5 = this.f17809e;
                        a8.a(buildNoAdsToShowError, blVar5.a(blVar5.d()));
                        HashMap hashMap = new HashMap();
                        hashMap.put("errorCode", Integer.valueOf(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW));
                        hashMap.put("reason", "showRewardedVideo(): No ads to show");
                        if (stringBuffer.length() != 0) {
                            hashMap.put(IronSourceConstants.EVENTS_EXT1, stringBuffer.toString());
                        }
                        b(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, hashMap);
                        this.f17816l.b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void b(boolean z4) {
        a(z4, (Map<String, Object>) null);
    }

    @Override // com.ironsource.eg
    public void a(Context context, boolean z4) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager Should Track Network State: " + z4, 0);
        try {
            this.f17822r = z4;
            if (z4) {
                if (this.f17821q == null) {
                    this.f17821q = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f17821q, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f17821q != null) {
                context.getApplicationContext().unregisterReceiver(this.f17821q);
            }
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error("Got an error from receiver with message: " + e4.getMessage());
        }
    }

    @Override // com.ironsource.al
    public void a(IronSourceError ironSourceError, r rVar) {
        C1513m5 c1513m5;
        if (this.f17817m && (c1513m5 = this.f17810f.get(rVar.c())) != null) {
            bl blVar = this.f17809e;
            blVar.a(blVar.d(), c1513m5.a(this.f17826v), c1513m5.d());
        }
        a(rVar, "onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.f17829y = false;
        b(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, qk.a(new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}}));
        eq.a().a(ironSourceError, this.f17809e.a(rVar.u()));
        this.f17811g.put(rVar.c(), h.a.ISAuctionPerformanceFailedToShow);
        if (this.f17830z != e.RV_STATE_READY_TO_SHOW) {
            b(false);
        }
        this.f17816l.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(NetworkSettings networkSettings, zq zqVar, String str, String str2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(String.format("Start initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName()));
        AbstractAdapter a4 = com.ironsource.mediationsdk.c.b().a(networkSettings, networkSettings.getRewardedVideoSettings(), false);
        if (a4 != null) {
            r rVar = new r(str, str2, networkSettings, this, zqVar.h(), a4, this.f17825u);
            this.f17823s.put(rVar.c(), rVar);
        }
        ironLog.verbose(String.format("Done initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName()));
    }

    private void a(e eVar) {
        d("current state=" + this.f17830z + ", new state=" + eVar);
        this.f17830z = eVar;
    }

    @Override // com.ironsource.al
    public void a(r rVar) {
        a(rVar, "onRewardedVideoAdStarted");
        eq.a().c();
    }

    @Override // com.ironsource.al
    public void a(r rVar, Placement placement) {
        a(rVar, "onRewardedVideoAdRewarded");
        eq.a().b(placement, this.f17809e.a(rVar.u()));
    }

    private void a(r rVar, String str) {
        String str2 = rVar.c() + " : " + str;
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "LWSProgRvManager: " + str2, 0);
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 3);
    }

    private void a(List<NetworkSettings> list, zq zqVar, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Iterator<NetworkSettings> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new a(it.next(), zqVar, str, str2));
        }
        IronSourceThreadManager.INSTANCE.executeTasks(zqVar.f(), zqVar.o(), arrayList);
    }

    @Override // com.ironsource.InterfaceC1555s4
    public void a(List<C1513m5> list, String str, C1513m5 c1513m5, JSONObject jSONObject, JSONObject jSONObject2, int i4, long j4, int i5, String str2) {
        d("makeAuction(): success");
        this.f17812h = c1513m5;
        this.f17820p = i4;
        this.f17815k = jSONObject;
        this.f17819o = "";
        if (!TextUtils.isEmpty(str2)) {
            a(88002, qk.a(new Object[][]{new Object[]{"errorCode", Integer.valueOf(i5)}, new Object[]{"reason", str2}}));
        }
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        a(jSONObject2, ad_unit);
        if (this.f17668b.a(ad_unit)) {
            a(IronSourceConstants.RV_AD_UNIT_CAPPED, qk.a(new Object[][]{new Object[]{"auctionId", str}}));
            h();
        } else {
            a(list, str, this.f17815k);
            a(IronSourceConstants.RV_AUCTION_SUCCESS, qk.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j4)}}));
            i();
        }
    }

    private void a(List<C1513m5> list, String str, JSONObject jSONObject) {
        this.f17810f.clear();
        this.f17811g.clear();
        CopyOnWriteArrayList<r> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (C1513m5 c1513m5 : list) {
            sb.append(a(c1513m5) + StringUtils.COMMA);
            r rVar = this.f17823s.get(c1513m5.c());
            if (rVar != null) {
                AbstractAdapter a4 = com.ironsource.mediationsdk.c.b().a(rVar.f18020b.h());
                if (a4 != null) {
                    r rVar2 = new r(rVar, this, a4, this.f17825u, str, jSONObject, this.f17820p, this.f17819o);
                    rVar2.a(true);
                    copyOnWriteArrayList.add(rVar2);
                    this.f17810f.put(rVar2.c(), c1513m5);
                    this.f17811g.put(c1513m5.c(), h.a.ISAuctionPerformanceDidntAttemptToLoad);
                }
            } else {
                d("updateWaterfall() - could not find matching smash for auction response item " + c1513m5.c());
            }
        }
        this.f17809e.a(copyOnWriteArrayList, str);
        if (this.f17809e.a()) {
            a(IronSourceConstants.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD, qk.a(new Object[][]{new Object[]{"reason", "waterfalls hold too many with size=" + this.f17809e.e()}}));
        }
        d("updateWaterfall() - next waterfall is " + sb.toString());
        if (sb.length() == 0) {
            d("Updated waterfall is empty");
        }
        a(IronSourceConstants.RV_AUCTION_RESPONSE_WATERFALL, qk.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, String str) {
        if (map.keySet().size() == 0 && list.size() == 0) {
            c(1301, qk.a(new Object[][]{new Object[]{"errorCode", 1005}, new Object[]{IronSourceConstants.EVENTS_DURATION, 0}}));
            d("makeAuction() failed - No candidates available for auctioning");
            h();
            return;
        }
        d("makeAuction() - request waterfall is: " + str);
        b(1000);
        b(IronSourceConstants.RV_AUCTION_REQUEST);
        c(IronSourceConstants.RV_AUCTION_REQUEST_WATERFALL, qk.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, str.toString()}}));
        this.f17814j.a(ContextProvider.getInstance().getApplicationContext(), map, list, this.f17813i, this.f17825u, this.f17669c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb, List<w7> list2) {
        if (list2.isEmpty()) {
            a(map, list, sb.toString());
            return;
        }
        z7 z7Var = new z7();
        d dVar = new d(map, sb, list);
        b(IronSourceConstants.RV_COLLECT_TOKENS);
        z7Var.a(list2, dVar, this.f17806E, TimeUnit.MILLISECONDS);
    }

    @Override // com.ironsource.eo
    public void a(boolean z4) {
        if (this.f17822r) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "Network Availability Changed To: " + z4, 0);
            if (c(z4)) {
                b(z4);
            }
        }
    }

    private void a(boolean z4, Map<String, Object> map) {
        synchronized (this.f17804C) {
            try {
                Boolean bool = this.f17803B;
                if (bool != null) {
                    if (bool.booleanValue() != z4) {
                    }
                }
                this.f17803B = Boolean.valueOf(z4);
                long time = new Date().getTime() - this.f17802A;
                this.f17802A = new Date().getTime();
                if (map == null) {
                    map = new HashMap<>();
                }
                map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(time));
                a(z4 ? IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE : IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, map);
                eq a4 = eq.a();
                bl blVar = this.f17809e;
                a4.a(z4, blVar.a(blVar.d()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
