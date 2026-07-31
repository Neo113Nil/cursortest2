package com.ironsource;

import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.ironsource.C1454e2;
import com.ironsource.C1526o2;
import com.ironsource.bi;
import com.ironsource.cg;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.h;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.q7;
import com.ironsource.z7;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class n7<Smash extends q7<?>, Listener extends AdapterAdListener> implements InterfaceC1546r2, InterfaceC1555s4, InterfaceC1447d2, gm, eo, InterfaceC1530p, fw, x7, up {

    /* renamed from: A, reason: collision with root package name */
    private AdInfo f18274A;

    /* renamed from: B, reason: collision with root package name */
    private rk f18275B;

    /* renamed from: C, reason: collision with root package name */
    final bi f18276C;

    /* renamed from: D, reason: collision with root package name */
    final bi.a f18277D;

    /* renamed from: E, reason: collision with root package name */
    protected final cg f18278E;

    /* renamed from: F, reason: collision with root package name */
    private final cg.a f18279F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f18280G;

    /* renamed from: H, reason: collision with root package name */
    private fu f18281H;

    /* renamed from: I, reason: collision with root package name */
    private AtomicBoolean f18282I;

    /* renamed from: J, reason: collision with root package name */
    @Nullable
    private zj f18283J;

    /* renamed from: a, reason: collision with root package name */
    protected ew<Smash> f18284a;

    /* renamed from: b, reason: collision with root package name */
    protected ConcurrentHashMap<String, h.a> f18285b;

    /* renamed from: c, reason: collision with root package name */
    protected com.ironsource.mediationsdk.e f18286c;

    /* renamed from: d, reason: collision with root package name */
    protected com.ironsource.mediationsdk.h f18287d;

    /* renamed from: e, reason: collision with root package name */
    protected int f18288e;

    /* renamed from: f, reason: collision with root package name */
    protected String f18289f;

    /* renamed from: g, reason: collision with root package name */
    protected JSONObject f18290g;

    /* renamed from: h, reason: collision with root package name */
    protected C1513m5 f18291h;

    /* renamed from: i, reason: collision with root package name */
    protected Placement f18292i;

    /* renamed from: j, reason: collision with root package name */
    protected boolean f18293j;

    /* renamed from: k, reason: collision with root package name */
    private NetworkStateReceiver f18294k;

    /* renamed from: l, reason: collision with root package name */
    protected rs f18295l;

    /* renamed from: m, reason: collision with root package name */
    protected ib f18296m;

    /* renamed from: n, reason: collision with root package name */
    protected ib f18297n;

    /* renamed from: o, reason: collision with root package name */
    protected C1571u0 f18298o;

    /* renamed from: p, reason: collision with root package name */
    protected f f18299p;

    /* renamed from: q, reason: collision with root package name */
    protected C1540q2 f18300q;

    /* renamed from: r, reason: collision with root package name */
    protected nc f18301r;

    /* renamed from: s, reason: collision with root package name */
    protected C1454e2 f18302s;

    /* renamed from: t, reason: collision with root package name */
    protected AbstractC1503l2 f18303t;

    /* renamed from: u, reason: collision with root package name */
    protected C1550s f18304u;

    /* renamed from: v, reason: collision with root package name */
    protected IronSourceSegment f18305v;

    /* renamed from: w, reason: collision with root package name */
    protected UUID f18306w;

    /* renamed from: x, reason: collision with root package name */
    protected final Object f18307x;

    /* renamed from: y, reason: collision with root package name */
    private long f18308y;

    /* renamed from: z, reason: collision with root package name */
    private Boolean f18309z;

    class a extends ir {
        a() {
        }

        @Override // com.ironsource.ir
        public void a() {
            n7.this.B();
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ NetworkSettings f18311a;

        b(NetworkSettings networkSettings) {
            this.f18311a = networkSettings;
        }

        @Override // java.lang.Runnable
        public void run() {
            n7.this.c(this.f18311a);
        }
    }

    class c extends TimerTask {
        c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            n7.this.D();
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n7.this.f18290g = new JSONObject();
            n7.this.f18302s.f15954i.a();
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            n7.this.b(hashMap, arrayList, sb, arrayList2);
            n7.this.a(hashMap, arrayList, sb, arrayList2);
        }
    }

    class e implements z7.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f18315a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ StringBuilder f18316b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f18317c;

        e(Map map, StringBuilder sb, List list) {
            this.f18315a = map;
            this.f18316b = sb;
            this.f18317c = list;
        }

        @Override // com.ironsource.z7.b
        public void a(@NotNull List<a8> list, long j4, @NotNull List<String> list2) {
            n7.this.f18302s.f15953h.a(j4);
            for (a8 a8Var : list) {
                NetworkSettings a4 = n7.this.f18298o.a(a8Var.c());
                Map<String, Object> b4 = n7.this.b(a4, com.ironsource.mediationsdk.c.b().b(a4, n7.this.f18298o.b(), n7.this.k()));
                if (a8Var.a() != null) {
                    this.f18315a.put(a8Var.c(), a8Var.a());
                    StringBuilder sb = this.f18316b;
                    sb.append(a8Var.d());
                    sb.append(a8Var.c());
                    sb.append(StringUtils.COMMA);
                    n7.this.f18302s.f15953h.a(b4, a8Var.e());
                } else {
                    n7.this.f18302s.f15953h.a(b4, a8Var.e(), a8Var.b());
                }
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                NetworkSettings a5 = n7.this.f18298o.a(it.next());
                n7.this.f18302s.f15953h.b(n7.this.b(a5, com.ironsource.mediationsdk.c.b().b(a5, n7.this.f18298o.b(), n7.this.k())), j4);
            }
            n7.this.a((Map<String, Object>) this.f18315a, (List<String>) this.f18317c, this.f18316b.toString());
        }

        @Override // com.ironsource.z7.b
        public void onFailure(String str) {
            n7.this.f18302s.f15953h.a(str);
            n7.this.a((Map<String, Object>) this.f18315a, (List<String>) this.f18317c, this.f18316b.toString());
        }
    }

    protected enum f {
        NONE,
        READY_TO_LOAD,
        AUCTION,
        LOADING,
        READY_TO_SHOW,
        SHOWING
    }

    public n7(C1571u0 c1571u0, rk rkVar, IronSourceSegment ironSourceSegment) {
        this(nm.S(), nm.M(), c1571u0, rkVar, ironSourceSegment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        f fVar;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(i());
        synchronized (this.f18307x) {
            try {
                if (this.f18298o.h().e() && this.f18295l.a()) {
                    ironLog.verbose(b("all smashes are capped"));
                    a(C1426a2.a(this.f18298o.b()), "all smashes are capped", false);
                } else if (!t() && this.f18299p == f.SHOWING) {
                    IronLog.API.error(b("load cannot be invoked while showing an ad"));
                    a(new IronSourceError(C1426a2.d(this.f18298o.b()), "load cannot be invoked while showing an ad"));
                } else {
                    if (this.f18298o.h().a() == C1526o2.a.AUTOMATIC_LOAD_WHILE_SHOW || this.f18298o.h().a() == C1526o2.a.MANUAL_WITH_LOAD_ON_SHOW || (((fVar = this.f18299p) == f.READY_TO_LOAD || fVar == f.READY_TO_SHOW) && !com.ironsource.mediationsdk.n.a().b(this.f18298o.b()))) {
                        this.f18290g = new JSONObject();
                        F();
                        if (v()) {
                            this.f18302s.f15952g.a();
                        } else {
                            this.f18302s.f15952g.a(q());
                        }
                        this.f18297n = new ib();
                        if (this.f18298o.q()) {
                            if (!this.f18285b.isEmpty()) {
                                this.f18287d.a(this.f18285b);
                                this.f18285b.clear();
                            }
                            K();
                        } else {
                            a(f.LOADING);
                        }
                        if (this.f18298o.q()) {
                            return;
                        }
                        ironLog.verbose(b("auction disabled"));
                        L();
                        C();
                        return;
                    }
                    IronLog.API.error(b("load is already in progress"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void C() {
        kw<Smash> E4 = E();
        if (E4.c()) {
            a(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill", false);
        }
        Iterator<Smash> it = E4.a().iterator();
        while (it.hasNext()) {
            it.next().E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        IronLog.INTERNAL.verbose(i());
        AsyncTask.execute(new d());
    }

    private kw<Smash> E() {
        IronLog.INTERNAL.verbose();
        return new jw(this.f18298o).d(this.f18284a.b());
    }

    private void F() {
        this.f18304u.a(this.f18298o.b(), false);
    }

    private void K() {
        IronLog.INTERNAL.verbose(i());
        synchronized (this.f18307x) {
            try {
                f fVar = this.f18299p;
                f fVar2 = f.AUCTION;
                if (fVar == fVar2) {
                    return;
                }
                a(fVar2);
                this.f18282I.set(false);
                long k4 = this.f18298o.d().k() - ib.a(this.f18296m);
                if (k4 > 0) {
                    new Timer().schedule(new c(), k4);
                } else {
                    D();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void L() {
        IronLog.INTERNAL.verbose(i());
        a(j(), m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(NetworkSettings networkSettings) {
        IronLog.INTERNAL.verbose(b(String.format("Start initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName())));
        AdData a4 = a(networkSettings, this.f18298o.o());
        AdapterBaseInterface b4 = com.ironsource.mediationsdk.c.b().b(networkSettings, this.f18298o.b(), k());
        if (b4 != null) {
            try {
                b4.init(a4, ContextProvider.getInstance().getApplicationContext(), null);
            } catch (Exception e4) {
                o9.d().a(e4);
                this.f18302s.f15956k.g("initProvider - exception while calling networkAdapter.init with " + networkSettings.getProviderName() + " - " + e4);
            }
        }
        IronLog.INTERNAL.verbose(b(String.format("Done initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName())));
    }

    private boolean d(NetworkSettings networkSettings) {
        AdapterBaseInterface b4 = com.ironsource.mediationsdk.c.b().b(networkSettings, this.f18298o.b(), k());
        if (b4 instanceof AdapterSettingsInterface) {
            return this.f18284a.a(this.f18298o.h().a(), networkSettings.getProviderInstanceName(), networkSettings.getProviderTypeForReflection(), a(networkSettings, b4), b4, this.f18298o.b());
        }
        return false;
    }

    private List<C1513m5> j() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (NetworkSettings networkSettings : this.f18298o.j()) {
            if (!networkSettings.isBidder(this.f18298o.b()) && d(networkSettings)) {
                qs qsVar = new qs(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.f18298o.b()));
                if (!this.f18295l.b(qsVar)) {
                    copyOnWriteArrayList.add(new C1513m5(qsVar.c()));
                }
            }
        }
        return copyOnWriteArrayList;
    }

    private int p() {
        return 1;
    }

    private void r() {
        IronLog.INTERNAL.verbose(i());
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : this.f18298o.j()) {
            if (c(networkSettings, com.ironsource.mediationsdk.c.b().b(networkSettings, this.f18298o.b(), k()))) {
                arrayList.add(new b(networkSettings));
            }
        }
        IronSourceThreadManager.INSTANCE.executeTasks(this.f18298o.k(), this.f18298o.p(), arrayList);
    }

    private void s() {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : this.f18298o.j()) {
            arrayList.add(new qs(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.f18298o.b())));
        }
        rs rsVar = new rs();
        this.f18295l = rsVar;
        rsVar.a(arrayList);
    }

    public void A() {
        if (c()) {
            a(new a());
        } else {
            B();
        }
    }

    protected void G() {
        com.ironsource.mediationsdk.n.a().a(this.f18298o.b(), this.f18298o.f());
    }

    protected boolean H() {
        return true;
    }

    protected boolean I() {
        return true;
    }

    public void J() {
        Iterator<NetworkSettings> it = this.f18298o.j().iterator();
        while (it.hasNext()) {
            com.ironsource.mediationsdk.c.b().b(it.next(), this.f18298o.b(), k());
        }
    }

    protected LoadWhileShowSupportState a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        return LoadWhileShowSupportState.NONE;
    }

    protected abstract Smash a(NetworkSettings networkSettings, BaseAdAdapter<?, Listener> baseAdAdapter, int i4, String str, C1513m5 c1513m5);

    protected String b(String str) {
        String str2 = this.f18298o.b().name() + " state:" + this.f18299p;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str2 + " - " + str;
    }

    protected abstract JSONObject b(NetworkSettings networkSettings);

    @Override // com.ironsource.InterfaceC1546r2
    public void e(q7<?> q7Var) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b(q7Var.k()));
        if (!q7Var.h().equals(this.f18284a.c())) {
            ironLog.error(b("invoked from " + q7Var.c() + " with state = " + this.f18299p + " auctionId: " + q7Var.h() + " and the current id is " + this.f18284a.c()));
            gv gvVar = this.f18302s.f15956k;
            StringBuilder sb = new StringBuilder();
            sb.append("onAdLoadSuccess invoked with state = ");
            sb.append(this.f18299p);
            gvVar.o(sb.toString());
            return;
        }
        if (this.f18298o.m()) {
            List<Smash> b4 = this.f18284a.b();
            jw jwVar = new jw(this.f18298o);
            boolean a4 = jwVar.a(q7Var, b4);
            synchronized (this.f18307x) {
                if (a4) {
                    try {
                        if (w()) {
                            i(q7Var);
                        }
                    } finally {
                    }
                }
                if (jwVar.a(b4)) {
                    i(jwVar.c(b4));
                }
            }
        }
        this.f18285b.put(q7Var.c(), h.a.ISAuctionPerformanceLoadedSuccessfully);
        if (a(f.LOADING, f.READY_TO_SHOW)) {
            long a5 = ib.a(this.f18297n);
            if (v()) {
                this.f18302s.f15952g.a(a5);
            } else {
                this.f18302s.f15952g.a(a5, q());
            }
            if (this.f18298o.h().e()) {
                this.f18301r.a(0L);
            }
            if (!this.f18298o.m()) {
                i(q7Var);
            }
            h(q7Var);
        }
    }

    @Override // com.ironsource.InterfaceC1546r2
    public void f(q7<?> q7Var) {
        IronLog.INTERNAL.verbose(b(q7Var.k()));
        this.f18302s.f15955j.a(n());
        this.f18303t.a(this.f18292i, q7Var.f());
    }

    protected abstract AbstractC1503l2 g();

    protected void g(q7<?> q7Var) {
        this.f18303t.d(q7Var.f());
    }

    protected C1540q2 h() {
        return new C1540q2(this.f18298o.h(), this);
    }

    protected String i() {
        return b((String) null);
    }

    public UUID k() {
        return this.f18306w;
    }

    protected abstract String l();

    protected String m() {
        return "fallback_" + System.currentTimeMillis();
    }

    protected String n() {
        Placement placement = this.f18292i;
        return placement == null ? "" : placement.getPlacementName();
    }

    abstract String o();

    protected boolean q() {
        return false;
    }

    protected boolean t() {
        return false;
    }

    protected boolean u() {
        return false;
    }

    protected abstract boolean v();

    protected boolean w() {
        boolean z4;
        synchronized (this.f18307x) {
            try {
                f fVar = this.f18299p;
                z4 = fVar == f.LOADING || fVar == f.READY_TO_SHOW;
            } finally {
            }
        }
        return z4;
    }

    protected boolean x() {
        boolean z4;
        synchronized (this.f18307x) {
            z4 = this.f18299p == f.READY_TO_SHOW;
        }
        return z4;
    }

    protected boolean y() {
        boolean z4;
        synchronized (this.f18307x) {
            z4 = this.f18299p == f.AUCTION;
        }
        return z4;
    }

    protected boolean z() {
        boolean z4;
        synchronized (this.f18307x) {
            z4 = this.f18299p == f.LOADING;
        }
        return z4;
    }

    n7(yf yfVar, xf xfVar, C1571u0 c1571u0, rk rkVar, IronSourceSegment ironSourceSegment) {
        this.f18289f = "";
        this.f18293j = false;
        this.f18307x = new Object();
        this.f18308y = 0L;
        this.f18282I = new AtomicBoolean(false);
        this.f18306w = UUID.randomUUID();
        this.f18276C = yfVar.k();
        this.f18277D = xfVar.e();
        this.f18278E = yfVar.B();
        this.f18279F = xfVar.m();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("adUnit = " + c1571u0.b() + ", loading mode = " + c1571u0.h().a());
        StringBuilder sb = new StringBuilder();
        sb.append(c1571u0.b());
        sb.append(" initiated object per waterfall mode");
        IronSourceUtils.sendAutomationLog(sb.toString());
        ib ibVar = new ib();
        this.f18283J = a(c1571u0);
        this.f18305v = ironSourceSegment;
        this.f18298o = c1571u0;
        this.f18302s = new C1454e2(c1571u0.b(), C1454e2.b.MEDIATION, this);
        this.f18303t = g();
        this.f18300q = h();
        a(f.NONE);
        this.f18275B = rkVar;
        this.f18284a = new ew<>(this.f18298o.d().f(), this.f18298o.d().i(), this);
        this.f18302s.f15951f.a(o(), this.f18298o.h().a().toString());
        this.f18285b = new ConcurrentHashMap<>();
        this.f18292i = null;
        G();
        this.f18290g = new JSONObject();
        if (this.f18298o.q()) {
            this.f18286c = new com.ironsource.mediationsdk.e(new com.ironsource.mediationsdk.f(this.f18298o.d(), IronSourceUtils.getSessionId()));
        }
        this.f18287d = new com.ironsource.mediationsdk.h(this.f18298o.j(), this.f18298o.d().c());
        s();
        r();
        this.f18296m = new ib();
        a(f.READY_TO_LOAD);
        this.f18301r = new nc(c1571u0.a(), this);
        this.f18304u = new C1550s();
        this.f18302s.f15951f.a(ib.a(ibVar));
        if (this.f18298o.h().e()) {
            ironLog.verbose("first automatic load");
            A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> b(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, networkSettings.getProviderDefaultInstance());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterBaseInterface.getAdapterVersion());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, adapterBaseInterface.getNetworkSDKVersion());
            hashMap.put("spId", networkSettings.getSubProviderId());
            hashMap.put("instanceType", Integer.valueOf(networkSettings.getInstanceType(this.f18298o.b())));
            hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(p()));
            return hashMap;
        } catch (Exception e4) {
            o9.d().a(e4);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getProviderEventData " + networkSettings.getProviderDefaultInstance(), e4);
            return hashMap;
        }
    }

    protected BaseAdAdapter<?, Listener> a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        BaseAdAdapter<?, Listener> baseAdAdapter = (BaseAdAdapter<?, Listener>) com.ironsource.mediationsdk.c.b().a(networkSettings, ad_unit, k());
        if (baseAdAdapter != null) {
            return baseAdAdapter;
        }
        return null;
    }

    @Override // com.ironsource.up
    public boolean c() {
        zj zjVar = this.f18283J;
        if (zjVar == null || zjVar == Thread.currentThread()) {
            return false;
        }
        return this.f18298o.l();
    }

    protected void h(q7<?> q7Var) {
        if (this.f18298o.h().f()) {
            a(q7Var, q7Var.f());
        } else {
            a(true, false, q7Var);
        }
    }

    protected void i(q7<?> q7Var) {
        if (this.f18298o.q() && this.f18282I.compareAndSet(false, true)) {
            C1513m5 i4 = q7Var.i();
            this.f18286c.a(i4, q7Var.l(), this.f18291h);
            ArrayList<String> arrayList = new ArrayList<>();
            ConcurrentHashMap<String, C1513m5> concurrentHashMap = new ConcurrentHashMap<>();
            for (Smash smash : this.f18284a.b()) {
                arrayList.add(smash.c());
                concurrentHashMap.put(smash.c(), smash.i());
            }
            this.f18286c.a(arrayList, concurrentHashMap, q7Var.l(), this.f18291h, i4);
        }
    }

    private boolean c(EnumC1433b2 enumC1433b2) {
        return new ArrayList(Arrays.asList(EnumC1433b2.LOAD_AD_SUCCESS, EnumC1433b2.LOAD_AD_FAILED, EnumC1433b2.LOAD_AD_FAILED_WITH_REASON, EnumC1433b2.AUCTION_SUCCESS, EnumC1433b2.AUCTION_FAILED, EnumC1433b2.AUCTION_FAILED_NO_CANDIDATES, EnumC1433b2.AD_FORMAT_CAPPED, EnumC1433b2.AD_OPENED, EnumC1433b2.SHOW_AD, EnumC1433b2.SHOW_AD_FAILED, EnumC1433b2.AD_CLICKED, EnumC1433b2.RELOAD_AD_FAILED_WITH_REASON, EnumC1433b2.RELOAD_AD_SUCCESS, EnumC1433b2.AD_LEFT_APPLICATION)).contains(enumC1433b2);
    }

    protected AdData a(NetworkSettings networkSettings, String str) {
        return AdData.createAdDataForNetworkAdapter(b(networkSettings), this.f18298o.b(), str);
    }

    public void b() {
        IronLog.INTERNAL.verbose(i());
        A();
    }

    private Smash a(C1513m5 c1513m5, String str) {
        NetworkSettings a4 = this.f18298o.a(c1513m5.c());
        if (a4 == null) {
            String str2 = "could not find matching provider settings for auction response item - item = " + c1513m5.c() + " state = " + this.f18299p;
            IronLog.INTERNAL.error(b(str2));
            this.f18302s.f15956k.h(str2);
            return null;
        }
        com.ironsource.mediationsdk.c.b().b(a4, this.f18298o.b(), k());
        BaseAdAdapter<?, Listener> a5 = a(a4, this.f18298o.b());
        if (a5 != null) {
            Smash a6 = a(a4, a5, this.f18276C.a(this.f18298o.b()), str, c1513m5);
            this.f18285b.put(c1513m5.c(), h.a.ISAuctionPerformanceDidntAttemptToLoad);
            return a6;
        }
        IronLog.INTERNAL.error(b("addSmashToWaterfall - could not load ad adapter for " + a4.getProviderInstanceName()));
        return null;
    }

    private boolean c(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        if (this.f18284a.a(adapterBaseInterface, this.f18298o.b(), networkSettings.getProviderInstanceName())) {
            return false;
        }
        return networkSettings.shouldEarlyInit() || networkSettings.isIronSource() || networkSettings.isBidder(this.f18298o.b());
    }

    protected void b(C1513m5 c1513m5, String str) {
        if (c1513m5 == null) {
            IronLog.INTERNAL.error(b("reportImpressionDataToPublisher - no auctionResponseItem or listener"));
            C1454e2 c1454e2 = this.f18302s;
            if (c1454e2 != null) {
                c1454e2.f15956k.g("reportImpressionDataToPublisher - no auctionResponseItem or listener");
                return;
            }
            return;
        }
        ImpressionData a4 = c1513m5.a(str);
        if (a4 != null) {
            for (ImpressionDataListener impressionDataListener : new HashSet(this.f18275B.a())) {
                IronLog.CALLBACK.info(b("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + a4));
                impressionDataListener.onImpressionSuccess(a4);
            }
        }
    }

    @Nullable
    private zj a(C1571u0 c1571u0) {
        if (c1571u0.l()) {
            return IronSourceThreadManager.INSTANCE.getSharedManagersThread();
        }
        return null;
    }

    private boolean c(boolean z4) {
        Boolean bool = this.f18309z;
        if (bool == null) {
            return false;
        }
        if (z4 && !bool.booleanValue() && u()) {
            return true;
        }
        return !z4 && this.f18309z.booleanValue();
    }

    protected String a(C1513m5 c1513m5, int i4) {
        return String.format("%s%s", Integer.valueOf(i4), c1513m5.c());
    }

    private String a(List<C1513m5> list, String str) {
        IronLog.INTERNAL.verbose(b("waterfall.size() = " + list.size()));
        this.f18285b.clear();
        StringBuilder sb = new StringBuilder();
        CopyOnWriteArrayList<Smash> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        for (int i4 = 0; i4 < list.size(); i4++) {
            C1513m5 c1513m5 = list.get(i4);
            Smash a4 = a(c1513m5, str);
            if (a4 != null) {
                copyOnWriteArrayList.add(a4);
                sb.append(a(c1513m5, a4.l()));
            }
            if (i4 != list.size() - 1) {
                sb.append(StringUtils.COMMA);
            }
        }
        this.f18284a.a(this.f18298o.h().a(), copyOnWriteArrayList, str);
        IronLog.INTERNAL.verbose(b("updateWaterfall() - next waterfall is " + ((Object) sb)));
        return sb.toString();
    }

    @Override // com.ironsource.InterfaceC1546r2
    public void b(q7<?> q7Var) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b(q7Var.k()));
        this.f18302s.f15955j.g(n());
        this.f18284a.a(q7Var);
        this.f18284a.b(q7Var);
        this.f18295l.a(q7Var);
        if (this.f18295l.b(q7Var)) {
            ironLog.verbose(b(q7Var.c() + " was session capped"));
            q7Var.N();
            IronSourceUtils.sendAutomationLog(q7Var.c() + " was session capped");
        }
        this.f18279F.a(ContextProvider.getInstance().getApplicationContext(), n(), this.f18298o.b());
        if (this.f18278E.b(ContextProvider.getInstance().getApplicationContext(), this.f18292i, this.f18298o.b())) {
            ironLog.verbose(b("placement " + n() + " is capped"));
            this.f18302s.f15955j.b(n(), null);
        }
        this.f18277D.b(this.f18298o.b());
        if (this.f18298o.q()) {
            C1513m5 i4 = q7Var.i();
            this.f18286c.a(i4, q7Var.l(), this.f18291h, n());
            this.f18285b.put(q7Var.c(), h.a.ISAuctionPerformanceShowedSuccessfully);
            if (H()) {
                b(i4, n());
            }
        }
        g(q7Var);
        if (this.f18298o.h().e()) {
            b(false);
        }
        this.f18300q.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<String, Object> map, List<String> list, StringBuilder sb, List<w7> list2) {
        StringBuilder sb2;
        String str;
        for (NetworkSettings networkSettings : this.f18298o.j()) {
            fu fuVar = this.f18281H;
            if (fuVar == null || fuVar.a(networkSettings, this.f18298o.b())) {
                if (!this.f18295l.b(new qs(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.f18298o.b()))) && d(networkSettings)) {
                    AdData a4 = a(networkSettings, (String) null);
                    if (networkSettings.isBidder(this.f18298o.b())) {
                        AdapterBaseInterface b4 = com.ironsource.mediationsdk.c.b().b(networkSettings, this.f18298o.b(), k());
                        if (b4 instanceof y7) {
                            list2.add(new w7(networkSettings.getInstanceType(this.f18298o.b()), networkSettings.getProviderInstanceName(), a4, (y7) b4, this, networkSettings));
                        } else {
                            if (b4 == null) {
                                sb2 = new StringBuilder();
                                sb2.append("prepareAuctionCandidates - could not load network adapter ");
                                str = networkSettings.getProviderName();
                            } else {
                                sb2 = new StringBuilder();
                                sb2.append("network adapter ");
                                sb2.append(networkSettings.getProviderName());
                                str = " does not implementing BiddingDataInterface";
                            }
                            sb2.append(str);
                            this.f18302s.f15956k.g(sb2.toString());
                        }
                    } else {
                        list.add(networkSettings.getProviderInstanceName());
                        sb.append(networkSettings.getInstanceType(this.f18298o.b()));
                        sb.append(networkSettings.getProviderInstanceName());
                        sb.append(StringUtils.COMMA);
                    }
                }
            }
        }
    }

    public Map<String, Object> a(EnumC1433b2 enumC1433b2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        JSONObject jSONObject = this.f18290g;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put("genericParams", this.f18290g);
        }
        hashMap.put("sessionDepth", Integer.valueOf(this.f18276C.a(this.f18298o.b())));
        if (c(enumC1433b2)) {
            hashMap.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f18288e));
            if (!TextUtils.isEmpty(this.f18289f)) {
                hashMap.put(IronSourceConstants.AUCTION_FALLBACK, this.f18289f);
            }
        }
        if (b(enumC1433b2) && !TextUtils.isEmpty(this.f18284a.c())) {
            hashMap.put("auctionId", this.f18284a.c());
        }
        return hashMap;
    }

    private void b(JSONObject jSONObject) {
        IronLog ironLog;
        String r4;
        int i4;
        if (jSONObject == null) {
            this.f18298o.b(false);
            ironLog = IronLog.INTERNAL;
            r4 = "loading configuration from auction response is null, using the following: " + this.f18298o.r();
        } else {
            try {
                try {
                    if (jSONObject.has(com.ironsource.mediationsdk.d.f17335x) && (i4 = jSONObject.getInt(com.ironsource.mediationsdk.d.f17335x)) > 0) {
                        this.f18298o.a(i4);
                    }
                    if (jSONObject.has(com.ironsource.mediationsdk.d.f17336y)) {
                        this.f18298o.a(jSONObject.getBoolean(com.ironsource.mediationsdk.d.f17336y));
                    }
                    this.f18298o.b(jSONObject.optBoolean(com.ironsource.mediationsdk.d.f17337z, false));
                    ironLog = IronLog.INTERNAL;
                    r4 = this.f18298o.r();
                } catch (JSONException e4) {
                    o9.d().a(e4);
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.error("failed to update loading configuration for" + this.f18298o.b() + " Error: " + e4.getMessage());
                    ironLog2.verbose(b(this.f18298o.r()));
                    return;
                }
            } catch (Throwable th) {
                IronLog.INTERNAL.verbose(b(this.f18298o.r()));
                throw th;
            }
        }
        ironLog.verbose(b(r4));
    }

    @Override // com.ironsource.InterfaceC1530p
    public void a() {
        if (this.f18298o.h().e()) {
            a(f.READY_TO_LOAD);
            b(true);
            A();
        }
    }

    protected void b(boolean z4) {
        a(false, z4, (q7<?>) null);
    }

    private boolean b(EnumC1433b2 enumC1433b2) {
        return !new ArrayList(Arrays.asList(EnumC1433b2.INIT_STARTED, EnumC1433b2.LOAD_AD, EnumC1433b2.AUCTION_REQUEST, EnumC1433b2.AUCTION_REQUEST_WATERFALL, EnumC1433b2.AUCTION_FAILED_NO_CANDIDATES, EnumC1433b2.COLLECT_TOKEN, EnumC1433b2.COLLECT_TOKENS_COMPLETED, EnumC1433b2.COLLECT_TOKENS_FAILED, EnumC1433b2.INSTANCE_COLLECT_TOKEN, EnumC1433b2.INSTANCE_COLLECT_TOKEN_SUCCESS, EnumC1433b2.INSTANCE_COLLECT_TOKEN_FAILED, EnumC1433b2.INSTANCE_COLLECT_TOKEN_TIMED_OUT)).contains(enumC1433b2);
    }

    @Override // com.ironsource.fw
    public void a(int i4) {
        this.f18302s.f15956k.u("waterfalls hold too many with size = " + i4);
    }

    @Override // com.ironsource.InterfaceC1555s4
    public void a(int i4, String str, int i5, String str2, long j4) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(i());
        if (!y()) {
            String str3 = "unexpected auction fail - error = " + i4 + ", " + str + " state = " + this.f18299p;
            ironLog.error(b(str3));
            this.f18302s.f15956k.i(str3);
            return;
        }
        String str4 = "Auction failed | moving to fallback waterfall (error " + i4 + " - " + str + ")";
        ironLog.verbose(b(str4));
        IronSourceUtils.sendAutomationLog(l() + ": " + str4);
        this.f18288e = i5;
        this.f18289f = str2;
        this.f18290g = new JSONObject();
        L();
        this.f18302s.f15954i.a(j4, i4, str);
        a(f.LOADING);
        C();
    }

    protected void a(int i4, String str, boolean z4) {
        int i5;
        String str2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        a(f.READY_TO_LOAD);
        ironLog.verbose(b("errorCode = " + i4 + ", errorReason = " + str));
        if (this.f18298o.h().f()) {
            if (z4) {
                i5 = i4;
                str2 = str;
            } else {
                i5 = i4;
                str2 = str;
                this.f18302s.f15952g.a(ib.a(this.f18297n), i5, str2, q());
            }
            a(new IronSourceError(i5, str2));
        } else {
            if (!z4) {
                this.f18302s.f15956k.b(i4, str);
            }
            b(false);
        }
        this.f18300q.e();
    }

    protected void a(Context context, com.ironsource.mediationsdk.i iVar, InterfaceC1555s4 interfaceC1555s4) {
        com.ironsource.mediationsdk.e eVar = this.f18286c;
        if (eVar != null) {
            eVar.a(context, iVar, interfaceC1555s4);
        } else {
            IronLog.INTERNAL.error(b("mAuctionHandler is null"));
        }
    }

    public void a(Context context, boolean z4) {
        IronLog.INTERNAL.verbose(b("track = " + z4));
        try {
            this.f18293j = z4;
            if (z4) {
                if (this.f18294k == null) {
                    this.f18294k = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f18294k, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f18294k != null) {
                context.getApplicationContext().unregisterReceiver(this.f18294k);
            }
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error("Got an error from receiver with message: " + e4.getMessage());
        }
    }

    public void a(fu fuVar) {
        this.f18281H = fuVar;
        this.f18280G = fuVar != null;
        this.f18309z = null;
    }

    protected void a(AbstractC1503l2 abstractC1503l2) {
        this.f18303t = abstractC1503l2;
    }

    public void a(IronSourceSegment ironSourceSegment) {
        this.f18305v = ironSourceSegment;
    }

    protected void a(IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.n.a().b(this.f18298o.b(), ironSourceError);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bd A[ORIG_RETURN, RETURN] */
    @Override // com.ironsource.InterfaceC1546r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(IronSourceError ironSourceError, q7<?> q7Var) {
        kw<Smash> E4;
        q7<?> c4;
        synchronized (this.f18307x) {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose(b(q7Var.k() + " - error = " + ironSourceError));
                if (q7Var.h().equals(this.f18284a.c()) && this.f18299p != f.AUCTION) {
                    this.f18285b.put(q7Var.c(), h.a.ISAuctionPerformanceFailedToLoad);
                    if (!z() && !x()) {
                        E4 = null;
                        if (E4 != null) {
                            return;
                        }
                        if (this.f18298o.m()) {
                            synchronized (this.f18307x) {
                                try {
                                    if (E4.b() && w() && (c4 = new jw(this.f18298o).c(this.f18284a.b())) != null) {
                                        i(c4);
                                    }
                                } finally {
                                }
                            }
                        }
                        Iterator<Smash> it = E4.a().iterator();
                        while (it.hasNext()) {
                            it.next().E();
                        }
                        return;
                    }
                    E4 = E();
                    if (E4.c()) {
                        a(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill", false);
                    }
                    if (E4 != null) {
                    }
                }
                ironLog.error(b("onAdLoadFailed was invoked from " + q7Var.c() + " with state =" + this.f18299p + " auctionId: " + q7Var.h() + " and the current id is " + this.f18284a.c()));
                gv gvVar = this.f18302s.f15956k;
                StringBuilder sb = new StringBuilder();
                sb.append("onAdLoadFailed was invoked with state =");
                sb.append(this.f18299p);
                gvVar.n(sb.toString());
            } finally {
            }
        }
    }

    @Override // com.ironsource.x7
    public void a(NetworkSettings networkSettings) {
        AdapterBaseInterface b4 = com.ironsource.mediationsdk.c.b().b(networkSettings, this.f18298o.b(), k());
        if (b4 != null) {
            this.f18302s.f15953h.a(b(networkSettings, b4));
        }
    }

    protected void a(f fVar) {
        synchronized (this.f18307x) {
            IronLog.INTERNAL.verbose("set current state to = " + fVar);
            this.f18299p = fVar;
        }
    }

    protected void a(q7<?> q7Var, AdInfo adInfo) {
        this.f18303t.c(adInfo);
    }

    @Override // com.ironsource.up
    public void a(Runnable runnable) {
        zj zjVar = this.f18283J;
        if (zjVar != null) {
            zjVar.a(runnable);
        }
    }

    @Override // com.ironsource.x7
    public void a(String str) {
        this.f18302s.f15956k.g(str);
    }

    @Override // com.ironsource.InterfaceC1555s4
    public void a(List<C1513m5> list, String str, C1513m5 c1513m5, JSONObject jSONObject, JSONObject jSONObject2, int i4, long j4, int i5, String str2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(i());
        if (!y()) {
            ironLog.error(b("unexpected auction success for auctionId - " + str + " state = " + this.f18299p));
            gv gvVar = this.f18302s.f15956k;
            StringBuilder sb = new StringBuilder();
            sb.append("unexpected auction success, state = ");
            sb.append(this.f18299p);
            gvVar.j(sb.toString());
            return;
        }
        this.f18289f = "";
        this.f18288e = i4;
        this.f18291h = c1513m5;
        this.f18290g = jSONObject;
        if (!TextUtils.isEmpty(str2)) {
            this.f18302s.f15956k.a(i5, str2);
        }
        a(jSONObject2);
        if (this.f18304u.a(this.f18298o.b())) {
            this.f18302s.f15954i.a(str);
            a(IronSourceError.ERROR_AD_FORMAT_CAPPED, "Ad unit is capped", true);
            return;
        }
        String a4 = a(list, str);
        this.f18302s.f15954i.a(j4, this.f18298o.r());
        this.f18302s.f15954i.c(a4);
        a(f.LOADING);
        C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b("auction waterfallString = " + str));
        boolean z4 = false;
        if (map.size() == 0 && list.size() == 0) {
            ironLog.verbose(b("auction failed - no candidates"));
            this.f18302s.f15954i.a(1005, "No candidates available for auctioning");
            a(C1426a2.e(this.f18298o.b()), "no available ad to load", false);
            return;
        }
        this.f18302s.f15954i.b(str);
        if (this.f18286c == null) {
            ironLog.error(b("mAuctionHandler is null"));
            return;
        }
        int a4 = this.f18276C.a(this.f18298o.b());
        com.ironsource.mediationsdk.i iVar = new com.ironsource.mediationsdk.i(this.f18298o.b());
        iVar.b(IronSourceUtils.isEncryptedResponse());
        iVar.a(map);
        iVar.a(list);
        iVar.a(this.f18287d);
        iVar.a(a4);
        iVar.a(this.f18305v);
        iVar.d(this.f18280G);
        fu fuVar = this.f18281H;
        if (fuVar != null && fuVar.b()) {
            z4 = true;
        }
        iVar.e(z4);
        a(ContextProvider.getInstance().getApplicationContext(), iVar, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb, List<w7> list2) {
        if (list2.isEmpty()) {
            a(map, list, sb.toString());
            return;
        }
        z7 z7Var = new z7();
        e eVar = new e(map, sb, list);
        this.f18302s.f15953h.a();
        z7Var.a(list2, eVar, this.f18298o.e(), TimeUnit.MILLISECONDS);
    }

    private void a(JSONObject jSONObject) {
        this.f18304u.a(this.f18298o.b(), jSONObject != null ? jSONObject.optBoolean(com.ironsource.mediationsdk.d.f17317f, false) : false);
        b(jSONObject);
    }

    @Override // com.ironsource.eo
    public void a(boolean z4) {
        if (!this.f18293j || this.f18298o.h().f()) {
            return;
        }
        IronLog.INTERNAL.verbose("network availability changed to - " + z4);
        if (c(z4)) {
            a(z4, false, (q7<?>) null);
        }
    }

    protected void a(boolean z4, boolean z5, q7<?> q7Var) {
        synchronized (this.f18307x) {
            try {
                Boolean bool = this.f18309z;
                if (bool != null) {
                    if (bool.booleanValue() != z4) {
                    }
                }
                this.f18309z = Boolean.valueOf(z4);
                long j4 = 0;
                if (this.f18308y != 0) {
                    j4 = new Date().getTime() - this.f18308y;
                }
                this.f18308y = new Date().getTime();
                this.f18302s.f15952g.a(z4, j4, z5);
                AdInfo f4 = q7Var != null ? q7Var.f() : this.f18274A;
                this.f18274A = f4;
                AbstractC1503l2 abstractC1503l2 = this.f18303t;
                if (!z4) {
                    f4 = null;
                }
                abstractC1503l2.a(z4, f4);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected boolean a(f fVar, f fVar2) {
        boolean z4;
        synchronized (this.f18307x) {
            try {
                if (this.f18299p == fVar) {
                    IronLog.INTERNAL.verbose("expected state = " + fVar + ", state to set = " + fVar2);
                    this.f18299p = fVar2;
                    z4 = true;
                } else {
                    IronLog.INTERNAL.verbose("wrong state, current state = " + this.f18299p + ", expected state = " + fVar);
                    z4 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }
}
