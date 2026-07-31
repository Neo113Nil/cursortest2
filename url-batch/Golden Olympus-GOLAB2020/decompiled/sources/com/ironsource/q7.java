package com.ironsource;

import android.text.TextUtils;
import com.ironsource.C1454e2;
import com.ironsource.InterfaceC1546r2;
import com.ironsource.ai;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.rt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class q7<Listener extends InterfaceC1546r2> implements NetworkInitializationListener, rt.a, InterfaceC1447d2, AdapterAdListener, ai.b {

    /* renamed from: a, reason: collision with root package name */
    protected C1509m1 f18774a;

    /* renamed from: b, reason: collision with root package name */
    protected Listener f18775b;

    /* renamed from: c, reason: collision with root package name */
    protected BaseAdAdapter<?, AdapterAdListener> f18776c;

    /* renamed from: d, reason: collision with root package name */
    protected C1454e2 f18777d;

    /* renamed from: e, reason: collision with root package name */
    protected h f18778e;

    /* renamed from: g, reason: collision with root package name */
    protected Placement f18780g;

    /* renamed from: h, reason: collision with root package name */
    protected C1441c3 f18781h;

    /* renamed from: i, reason: collision with root package name */
    protected JSONObject f18782i;

    /* renamed from: j, reason: collision with root package name */
    protected String f18783j;

    /* renamed from: k, reason: collision with root package name */
    protected AdData f18784k;

    /* renamed from: l, reason: collision with root package name */
    protected Long f18785l;

    /* renamed from: m, reason: collision with root package name */
    protected ib f18786m;

    /* renamed from: o, reason: collision with root package name */
    private final C1513m5 f18788o;

    /* renamed from: p, reason: collision with root package name */
    private final up f18789p;

    /* renamed from: f, reason: collision with root package name */
    private AtomicBoolean f18779f = new AtomicBoolean(false);

    /* renamed from: n, reason: collision with root package name */
    private rt f18787n = new rt(TimeUnit.SECONDS.toMillis(s()));

    /* renamed from: q, reason: collision with root package name */
    protected final Object f18790q = new Object();

    class a extends ir {
        a() {
        }

        @Override // com.ironsource.ir
        public void a() {
            q7.this.L();
        }
    }

    class b extends ir {
        b() {
        }

        @Override // com.ironsource.ir
        public void a() {
            q7.this.K();
        }
    }

    class c extends ir {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f18793a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f18794b;

        c(int i4, String str) {
            this.f18793a = i4;
            this.f18794b = str;
        }

        @Override // com.ironsource.ir
        public void a() {
            q7.this.a(this.f18793a, this.f18794b);
        }
    }

    class d extends ir {
        d() {
        }

        @Override // com.ironsource.ir
        public void a() {
            q7.this.I();
        }
    }

    class e extends ir {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdapterErrorType f18797a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f18798b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f18799c;

        e(AdapterErrorType adapterErrorType, int i4, String str) {
            this.f18797a = adapterErrorType;
            this.f18798b = i4;
            this.f18799c = str;
        }

        @Override // com.ironsource.ir
        public void a() {
            q7.this.a(this.f18797a, this.f18798b, this.f18799c);
        }
    }

    class f extends ir {
        f() {
        }

        @Override // com.ironsource.ir
        public void a() {
            q7.this.J();
        }
    }

    class g extends ir {
        g() {
        }

        @Override // com.ironsource.ir
        public void a() {
            q7.this.H();
        }
    }

    protected enum h {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        SHOWING,
        FAILED
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q7(up upVar, C1509m1 c1509m1, BaseAdAdapter<?, ?> baseAdAdapter, C1441c3 c1441c3, C1513m5 c1513m5, Listener listener) {
        this.f18774a = c1509m1;
        this.f18775b = listener;
        this.f18777d = new C1454e2(c1509m1.a(), C1454e2.b.PROVIDER, this);
        this.f18781h = c1441c3;
        this.f18782i = c1441c3.c();
        this.f18776c = baseAdAdapter;
        this.f18788o = c1513m5;
        this.f18789p = upVar;
        a(h.NONE);
    }

    private boolean D() {
        return this.f18778e == h.INIT_IN_PROGRESS;
    }

    private void F() {
        IronLog.INTERNAL.verbose(d());
        a(h.LOADING);
        a(false);
        try {
            this.f18787n.a((rt.a) this);
            G();
        } catch (Throwable th) {
            o9.d().a(th);
            String str = "unexpected error while calling adapter.loadAd() - " + th.getMessage() + " - state = " + this.f18778e;
            IronLog.INTERNAL.error(a(str));
            C1454e2 c1454e2 = this.f18777d;
            if (c1454e2 != null) {
                c1454e2.f15956k.g(str);
            }
            onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        IronLog.INTERNAL.verbose(d());
        C1454e2 c1454e2 = this.f18777d;
        if (c1454e2 != null) {
            c1454e2.f15955j.a(j());
        }
        this.f18775b.f(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        boolean z4;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        rt rtVar = this.f18787n;
        if (rtVar != null) {
            rtVar.e();
        }
        synchronized (this.f18790q) {
            try {
                h hVar = this.f18778e;
                z4 = false;
                if (hVar == h.LOADING) {
                    long a4 = ib.a(this.f18786m);
                    ironLog.verbose(a("Load duration = " + a4));
                    if (this.f18777d != null) {
                        if (v()) {
                            this.f18777d.f15952g.a(a4);
                        } else {
                            this.f18777d.f15952g.a(a4, false);
                        }
                    }
                    a(h.LOADED);
                    z4 = O();
                } else if (hVar != h.FAILED) {
                    ironLog.error(a(String.format("unexpected load success for %s, state - %s", k(), this.f18778e)));
                    String format = String.format("unexpected load success, state - %s", this.f18778e);
                    if (this.f18777d != null) {
                        if (v()) {
                            this.f18777d.f15956k.r(format);
                        } else {
                            this.f18777d.f15956k.o(format);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z4) {
            this.f18775b.e(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        IronLog.INTERNAL.verbose(d());
        a(h.SHOWING);
        C1454e2 c1454e2 = this.f18777d;
        if (c1454e2 != null) {
            c1454e2.f15955j.g(j());
        }
        this.f18775b.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        if (D()) {
            rt rtVar = this.f18787n;
            if (rtVar != null) {
                rtVar.e();
            }
            a(h.READY_TO_LOAD);
            F();
            return;
        }
        if (this.f18778e == h.FAILED) {
            return;
        }
        ironLog.error(a(String.format("unexpected init success for %s, state - %s", k(), this.f18778e)));
        if (this.f18777d != null) {
            this.f18777d.f15956k.m(String.format("unexpected init success, state - %s", this.f18778e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        long a4 = ib.a(this.f18786m);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("Load duration = " + a4 + ", state = " + this.f18778e + ", isBidder = " + w()));
        synchronized (this.f18790q) {
            try {
                if (!z()) {
                    ironLog.error(a(String.format("unexpected timeout for %s, state - %s, error - %s", k(), this.f18778e, Integer.valueOf(IronSourceError.ERROR_LOAD_FAILED_TIMEOUT))));
                    if (this.f18777d != null) {
                        this.f18777d.f15956k.t(String.format("unexpected timeout, state - %s, error - %s", this.f18778e, Integer.valueOf(IronSourceError.ERROR_LOAD_FAILED_TIMEOUT)));
                    }
                    return;
                }
                a(h.FAILED);
                C1454e2 c1454e2 = this.f18777d;
                if (c1454e2 != null) {
                    c1454e2.f15952g.a(a4, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, false);
                    this.f18777d.f15952g.a(a4, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, "time out", false);
                }
                this.f18775b.a(ErrorBuilder.buildLoadFailedError("time out"), this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private int o() {
        return 1;
    }

    private int s() {
        C1513m5 c1513m5 = this.f18788o;
        if (c1513m5 == null) {
            return this.f18774a.f();
        }
        Integer f4 = c1513m5.f();
        int f5 = (f4 == null || f4.intValue() <= 0) ? this.f18774a.f() : f4.intValue();
        IronLog.INTERNAL.verbose(a("Load timeout for " + this.f18788o.c() + " - " + f5 + " seconds"));
        return f5;
    }

    public AtomicBoolean A() {
        return this.f18779f;
    }

    public boolean B() {
        return y();
    }

    public boolean C() {
        return this.f18778e == h.SHOWING;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    public void E() {
        String str;
        int c4;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        C1513m5 i4 = i();
        String k4 = i4.k();
        Map<String, Object> a4 = nk.a(i4.a());
        a4.put("adUnit", this.f18774a.a());
        b(k4);
        try {
            boolean z4 = false;
            if (v()) {
                this.f18777d.f15952g.a();
            } else {
                this.f18777d.f15952g.a(false);
            }
            this.f18785l = null;
            this.f18786m = new ib();
            this.f18784k = a(k4, a4);
            synchronized (this.f18790q) {
                if (this.f18778e != h.NONE) {
                    z4 = true;
                } else {
                    a(h.INIT_IN_PROGRESS);
                }
            }
            if (z4) {
                str = "loadAd - incorrect state while loading, state = " + this.f18778e;
                ironLog.error(a(str));
                this.f18777d.f15956k.g(str);
                c4 = C1426a2.c(this.f18774a.a());
            } else {
                this.f18787n.a((rt.a) this);
                ?? networkAdapter = this.f18776c.getNetworkAdapter();
                if (networkAdapter != 0) {
                    networkAdapter.init(this.f18784k, ContextProvider.getInstance().getApplicationContext(), this);
                    return;
                }
                str = "loadAd - network adapter not available " + k();
                ironLog.error(a(str));
                c4 = C1426a2.c(this.f18774a.a());
            }
            onInitFailed(c4, str);
        } catch (Throwable th) {
            o9.d().a(th);
            String str2 = "loadAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str2));
            C1454e2 c1454e2 = this.f18777d;
            if (c1454e2 != null) {
                c1454e2.f15956k.g(str2);
            }
            onInitFailed(C1426a2.c(this.f18774a.a()), str2);
        }
    }

    protected void G() {
        Object obj = this.f18776c;
        if (obj instanceof AdapterAdFullScreenInterface) {
            ((AdapterAdFullScreenInterface) obj).loadAd(this.f18784k, ContextProvider.getInstance().getCurrentActiveActivity(), this);
        } else {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
        }
    }

    public void M() {
        synchronized (this) {
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f18776c;
            if (baseAdAdapter != null) {
                try {
                    baseAdAdapter.releaseMemory();
                    this.f18776c = null;
                } catch (Exception e4) {
                    o9.d().a(e4);
                    String str = "Exception while calling adapter.releaseMemory() from " + this.f18781h.f() + " - " + e4.getMessage() + " - state = " + this.f18778e;
                    IronLog.INTERNAL.error(a(str));
                    C1454e2 c1454e2 = this.f18777d;
                    if (c1454e2 != null) {
                        c1454e2.f15956k.g(str);
                    }
                }
            }
            C1454e2 c1454e22 = this.f18777d;
            if (c1454e22 != null) {
                c1454e22.f();
                this.f18777d = null;
            }
            rt rtVar = this.f18787n;
            if (rtVar != null) {
                rtVar.d();
                this.f18787n = null;
            }
        }
    }

    public void N() {
        IronLog.INTERNAL.verbose(d());
        C1454e2 c1454e2 = this.f18777d;
        if (c1454e2 != null) {
            c1454e2.f15955j.a();
        }
    }

    protected boolean O() {
        return true;
    }

    protected AdData a(String str, Map<String, Object> map) {
        return new AdData(str, q(), a(map));
    }

    @Override // com.ironsource.ai.b
    public int b() {
        return this.f18781h.e();
    }

    @Override // com.ironsource.ai.b
    public String c() {
        return this.f18781h.f();
    }

    protected String d() {
        return a((String) null);
    }

    public Long e() {
        return this.f18785l;
    }

    public AdInfo f() {
        return new AdInfo(this.f18788o.a(j()), this.f18788o.d());
    }

    public IronSource.AD_UNIT g() {
        return this.f18774a.a();
    }

    public String h() {
        return this.f18774a.c();
    }

    public C1513m5 i() {
        return this.f18788o;
    }

    protected String j() {
        Placement placement = this.f18780g;
        return placement == null ? "" : placement.getPlacementName();
    }

    public String k() {
        return String.format("%s %s", c(), Integer.valueOf(hashCode()));
    }

    public int l() {
        return this.f18781h.d();
    }

    public String m() {
        return this.f18781h.h().isMultipleInstances() ? this.f18781h.h().getProviderTypeForReflection() : this.f18781h.f();
    }

    public String n() {
        return this.f18781h.g();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        if (this.f18789p.c()) {
            this.f18789p.a(new g());
        } else {
            H();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(@NotNull AdapterErrorType adapterErrorType, int i4, String str) {
        if (this.f18789p.c()) {
            this.f18789p.a(new e(adapterErrorType, i4, str));
        } else {
            a(adapterErrorType, i4, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        if (this.f18789p.c()) {
            this.f18789p.a(new d());
        } else {
            I();
        }
    }

    public void onAdOpened() {
        if (this.f18789p.c()) {
            this.f18789p.a(new f());
        } else {
            J();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(int i4, String str) {
        if (this.f18789p.c()) {
            this.f18789p.a(new c(i4, str));
        } else {
            a(i4, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() {
        if (this.f18789p.c()) {
            this.f18789p.a(new b());
        } else {
            K();
        }
    }

    public NetworkSettings p() {
        return this.f18774a.g();
    }

    protected Map<String, Object> q() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(nk.a(this.f18782i));
        return hashMap;
    }

    public Integer r() {
        C1509m1 c1509m1 = this.f18774a;
        if (c1509m1 != null) {
            return Integer.valueOf(c1509m1.h());
        }
        return null;
    }

    public h t() {
        return this.f18778e;
    }

    protected up u() {
        return this.f18789p;
    }

    protected boolean v() {
        return false;
    }

    public boolean w() {
        return this.f18781h.j();
    }

    public boolean x() {
        return this.f18778e == h.FAILED;
    }

    public boolean y() {
        return this.f18778e == h.LOADED;
    }

    public boolean z() {
        h hVar = this.f18778e;
        return hVar == h.INIT_IN_PROGRESS || hVar == h.LOADING;
    }

    protected String a(String str) {
        String str2 = this.f18774a.a().name() + " - " + k() + " - state = " + this.f18778e;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str2 + " - " + str;
    }

    /* JADX WARN: Type inference failed for: r2v16, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    /* JADX WARN: Type inference failed for: r2v17, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    public Map<String, Object> a(EnumC1433b2 enumC1433b2) {
        HashMap hashMap = new HashMap();
        try {
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f18776c;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, baseAdAdapter != null ? baseAdAdapter.getNetworkAdapter().getAdapterVersion() : "");
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter2 = this.f18776c;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, baseAdAdapter2 != null ? baseAdAdapter2.getNetworkAdapter().getNetworkSDKVersion() : "");
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(a("could not get adapter version for event data" + k()));
        }
        hashMap.put("spId", this.f18781h.i());
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f18781h.a());
        hashMap.put("instanceType", Integer.valueOf(l()));
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(o()));
        if (!TextUtils.isEmpty(this.f18783j)) {
            hashMap.put("dynamicDemandSource", this.f18783j);
        }
        hashMap.put("sessionDepth", r());
        if (this.f18774a.e() != null && this.f18774a.e().length() > 0) {
            hashMap.put("genericParams", this.f18774a.e());
        }
        if (!TextUtils.isEmpty(this.f18774a.c())) {
            hashMap.put("auctionId", this.f18774a.c());
        }
        if (b(enumC1433b2)) {
            hashMap.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f18774a.d()));
            if (!TextUtils.isEmpty(this.f18774a.b())) {
                hashMap.put(IronSourceConstants.AUCTION_FALLBACK, this.f18774a.b());
            }
        }
        if (!TextUtils.isEmpty(this.f18774a.g().getCustomNetwork())) {
            hashMap.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, this.f18774a.g().getCustomNetwork());
        }
        return hashMap;
    }

    public void b(String str) {
        this.f18783j = com.ironsource.mediationsdk.d.b().c(str);
    }

    private boolean b(EnumC1433b2 enumC1433b2) {
        return new ArrayList(Arrays.asList(EnumC1433b2.LOAD_AD, EnumC1433b2.LOAD_AD_SUCCESS, EnumC1433b2.LOAD_AD_FAILED, EnumC1433b2.LOAD_AD_FAILED_WITH_REASON, EnumC1433b2.LOAD_AD_NO_FILL, EnumC1433b2.RELOAD_AD, EnumC1433b2.RELOAD_AD_SUCCESS, EnumC1433b2.RELOAD_AD_FAILED_WITH_REASON, EnumC1433b2.RELOAD_AD_NO_FILL, EnumC1433b2.DESTROY_AD, EnumC1433b2.AD_PRESENT_SCREEN, EnumC1433b2.AD_DISMISS_SCREEN, EnumC1433b2.AD_LEFT_APPLICATION, EnumC1433b2.AD_OPENED, EnumC1433b2.AD_CLOSED, EnumC1433b2.SHOW_AD, EnumC1433b2.SHOW_AD_FAILED, EnumC1433b2.AD_CLICKED, EnumC1433b2.AD_REWARDED)).contains(enumC1433b2);
    }

    protected Map<String, Object> a(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("userId", this.f18774a.i());
        return map;
    }

    @Override // com.ironsource.rt.a
    public void a() {
        if (this.f18789p.c()) {
            this.f18789p.a(new a());
        } else {
            L();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i4, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("error = " + i4 + ", " + str));
        if (D()) {
            rt rtVar = this.f18787n;
            if (rtVar != null) {
                rtVar.e();
            }
            a(h.FAILED);
            a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i4, str, ib.a(this.f18786m));
            this.f18775b.a(new IronSourceError(i4, str), this);
            return;
        }
        if (this.f18778e == h.FAILED) {
            return;
        }
        ironLog.error(a(String.format("unexpected init failed for %s, state - %s, error - %s, %s", k(), this.f18778e, Integer.valueOf(i4), str)));
        if (this.f18777d != null) {
            this.f18777d.f15956k.l(String.format("unexpected init failed, state - %s, error - %s, %s", this.f18778e, Integer.valueOf(i4), str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NotNull AdapterErrorType adapterErrorType, int i4, String str) {
        long a4 = ib.a(this.f18786m);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("Load duration = " + a4 + ", error = " + i4 + ", " + str));
        rt rtVar = this.f18787n;
        if (rtVar != null) {
            rtVar.e();
        }
        synchronized (this.f18790q) {
            try {
                try {
                    h hVar = this.f18778e;
                    if (hVar == h.LOADING) {
                        a(adapterErrorType, i4, str, a4);
                        a(h.FAILED);
                        this.f18775b.a(new IronSourceError(i4, str), this);
                        return;
                    }
                    if (hVar == h.FAILED) {
                        a(adapterErrorType, i4, str, a4);
                    } else if (hVar == h.LOADED && adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
                        this.f18785l = Long.valueOf(System.currentTimeMillis());
                        ironLog.error(a(String.format("ad expired for %s, state = %s", this.f18781h.f(), this.f18778e)));
                        C1454e2 c1454e2 = this.f18777d;
                        if (c1454e2 != null) {
                            c1454e2.f15956k.a(String.format("ad expired, state = %s", this.f18778e));
                        }
                    } else {
                        ironLog.error(a(String.format("unexpected load failed for %s, state - %s, error - %s, %s", k(), this.f18778e, Integer.valueOf(i4), str)));
                        String format = String.format("unexpected load failed, state - %s, error - %s, %s", this.f18778e, Integer.valueOf(i4), str);
                        if (this.f18777d != null) {
                            if (v()) {
                                this.f18777d.f15956k.q(format);
                            } else if (this.f18774a.a() != IronSource.AD_UNIT.REWARDED_VIDEO || this.f18778e != h.SHOWING) {
                                this.f18777d.f15956k.n(format);
                            }
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    private void a(AdapterErrorType adapterErrorType, int i4, String str, long j4) {
        if (this.f18777d != null) {
            if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
                if (v()) {
                    this.f18777d.f15952g.b(j4, i4);
                    return;
                } else {
                    this.f18777d.f15952g.a(j4, i4);
                    return;
                }
            }
            if (TextUtils.isEmpty(str)) {
                this.f18777d.f15952g.a(j4, i4, false);
            } else if (v()) {
                this.f18777d.f15952g.a(j4, i4, str);
            } else {
                this.f18777d.f15952g.a(j4, i4, str, false);
            }
        }
    }

    protected void a(h hVar) {
        IronLog.INTERNAL.verbose(d());
        this.f18778e = hVar;
    }

    public void a(boolean z4) {
        this.f18779f.set(z4);
    }
}
