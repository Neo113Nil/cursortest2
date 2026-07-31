package com.ironsource;

import com.ironsource.C1539q1;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1424a0 implements AdapterAdListener, NetworkInitializationListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1585w2 f14967a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1431b0 f14968b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1473h0 f14969c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private WeakReference<InterfaceC1452e0> f14970d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC1459f0 f14971e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final BaseAdAdapter<?, ?> f14972f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private ib f14973g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private ir f14974h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f14975i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f14976j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f14977k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f14978l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final AdData f14979m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final C1513m5 f14980n;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    private final C1513m5 f14981o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f14982p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final String f14983q;

    /* renamed from: r, reason: collision with root package name */
    private final int f14984r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final String f14985s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final IronSource.AD_UNIT f14986t;

    /* renamed from: u, reason: collision with root package name */
    private final int f14987u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final C1480i0 f14988v;

    @Metadata
    /* renamed from: com.ironsource.a0$a */
    public static final class a extends ir {
        a() {
        }

        @Override // com.ironsource.ir
        public void a() {
            long a4 = ib.a(AbstractC1424a0.this.f14973g);
            IronLog.INTERNAL.verbose(AbstractC1424a0.this.a("Load duration = " + a4 + ", isBidder = " + AbstractC1424a0.this.t()));
            AbstractC1424a0.this.f14978l = true;
            AbstractC1424a0.this.f().e().e().a(a4, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, false);
            AbstractC1424a0.this.f().e().e().a(a4, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, "time out", false);
            AbstractC1424a0 abstractC1424a0 = AbstractC1424a0.this;
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("time out");
            Intrinsics.checkNotNullExpressionValue(buildLoadFailedError, "buildLoadFailedError(errorMessage)");
            abstractC1424a0.a(buildLoadFailedError);
        }
    }

    public AbstractC1424a0(@NotNull C1585w2 adTools, @NotNull C1431b0 instanceData, @NotNull C1473h0 adInstancePayload, @NotNull InterfaceC1452e0 listener) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f14967a = adTools;
        this.f14968b = instanceData;
        this.f14969c = adInstancePayload;
        this.f14970d = new WeakReference<>(listener);
        this.f14979m = instanceData.g();
        this.f14980n = instanceData.n();
        this.f14981o = instanceData.p();
        this.f14982p = instanceData.j().j();
        this.f14983q = instanceData.r();
        this.f14984r = instanceData.s();
        this.f14985s = instanceData.w();
        this.f14986t = instanceData.h();
        this.f14987u = instanceData.v();
        this.f14988v = instanceData.t();
        BaseAdAdapter<?, ?> a4 = a(instanceData);
        this.f14972f = a4;
        adTools.e().a(new C1438c0(adTools, instanceData, a4));
        adTools.e().a(new C1575u4(instanceData.k()));
    }

    private final void A() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        try {
            F();
            z();
        } catch (Throwable th) {
            o9.d().a(th);
            String str = "unexpected error while calling adapter.loadAd() - " + th.getMessage();
            IronLog.INTERNAL.error(a(str));
            this.f14967a.e().h().g(str);
            a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, str);
        }
    }

    private final void B() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        this.f14967a.e().a().a(k());
        InterfaceC1452e0 interfaceC1452e0 = this.f14970d.get();
        if (interfaceC1452e0 != null) {
            interfaceC1452e0.a(this);
        }
    }

    private final void C() {
        gv h4;
        String str;
        IronLog ironLog = IronLog.INTERNAL;
        InterfaceC1459f0 interfaceC1459f0 = null;
        ironLog.verbose(a(this, (String) null, 1, (Object) null));
        G();
        if (this.f14978l) {
            c();
            h4 = this.f14967a.e().h();
            str = "instance load success after it was already failed";
        } else {
            if (!this.f14976j) {
                this.f14976j = true;
                long a4 = ib.a(this.f14973g);
                ironLog.verbose(a("Load duration = " + a4));
                this.f14967a.e().e().a(a4, false);
                a(C1539q1.a.LoadedSuccessfully);
                InterfaceC1459f0 interfaceC1459f02 = this.f14971e;
                if (interfaceC1459f02 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loadListener");
                } else {
                    interfaceC1459f0 = interfaceC1459f02;
                }
                interfaceC1459f0.a(this);
                return;
            }
            h4 = this.f14967a.e().h();
            str = "instance load success after it was already loaded";
        }
        h4.f(str);
    }

    private final void D() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        if (this.f14977k) {
            this.f14967a.e().h().f("instance opened after it was already opened");
            return;
        }
        this.f14977k = true;
        this.f14967a.e().a().g(k());
        a(C1539q1.a.ShowedSuccessfully);
        InterfaceC1452e0 interfaceC1452e0 = this.f14970d.get();
        if (interfaceC1452e0 != null) {
            interfaceC1452e0.b(this);
        }
    }

    private final void E() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        G();
        if (this.f14978l) {
            return;
        }
        A();
    }

    private final void F() {
        G();
        a a4 = a();
        this.f14974h = a4;
        if (a4 != null) {
            this.f14967a.a((ir) a4, TimeUnit.SECONDS.toMillis(n()));
        }
    }

    private final void G() {
        ir irVar = this.f14974h;
        if (irVar != null) {
            this.f14967a.b(irVar);
            this.f14974h = null;
        }
    }

    private final a a() {
        return new a();
    }

    private final int n() {
        Integer f4 = this.f14968b.n().f();
        return (f4 == null || f4.intValue() <= 0) ? this.f14968b.i().h() : f4.intValue();
    }

    public abstract void a(@NotNull InterfaceC1487j0 interfaceC1487j0);

    public void b() {
        IronLog.INTERNAL.verbose(a(this, (String) null, 1, (Object) null));
        G();
        this.f14967a.e().e().a(this.f14987u);
    }

    public void c() {
    }

    @NotNull
    public final IronSource.AD_UNIT d() {
        return this.f14986t;
    }

    @NotNull
    public LevelPlayAdInfo e() {
        String uuid = this.f14968b.i().b().b().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "instanceData.adUnitData.…roperties.adId.toString()");
        String c4 = this.f14968b.i().b().c();
        String ad_unit = this.f14968b.h().toString();
        Intrinsics.checkNotNullExpressionValue(ad_unit, "instanceData.adFormat.toString()");
        return new LevelPlayAdInfo(uuid, c4, ad_unit, this.f14968b.n().a(k()), this.f14968b.n().d(), null, null, 96, null);
    }

    @Nullable
    public final C1513m5 l() {
        return this.f14981o;
    }

    @NotNull
    protected final C1431b0 m() {
        return this.f14968b;
    }

    @NotNull
    public final String o() {
        return this.f14983q;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        a(new Runnable() { // from class: com.ironsource.A
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1424a0.b(AbstractC1424a0.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(@NotNull final AdapterErrorType adapterErrorType, final int i4, @NotNull final String errorMessage) {
        Intrinsics.checkNotNullParameter(adapterErrorType, "adapterErrorType");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        a(new Runnable() { // from class: com.ironsource.F
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1424a0.a(AbstractC1424a0.this, adapterErrorType, i4, errorMessage);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        a(new Runnable() { // from class: com.ironsource.D
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1424a0.c(AbstractC1424a0.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        a(new Runnable() { // from class: com.ironsource.C
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1424a0.d(AbstractC1424a0.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(final int i4, @Nullable final String str) {
        a(new Runnable() { // from class: com.ironsource.B
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1424a0.a(AbstractC1424a0.this, i4, str);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() {
        a(new Runnable() { // from class: com.ironsource.E
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1424a0.e(AbstractC1424a0.this);
            }
        });
    }

    @NotNull
    public final String p() {
        return this.f14985s;
    }

    public final int q() {
        return this.f14984r;
    }

    @NotNull
    public final C1480i0 r() {
        return this.f14988v;
    }

    public final int s() {
        return this.f14987u;
    }

    public final boolean t() {
        return this.f14982p;
    }

    public final boolean u() {
        return this.f14978l;
    }

    public final boolean v() {
        return this.f14976j;
    }

    public final boolean w() {
        return this.f14975i;
    }

    public final boolean x() {
        return this.f14977k;
    }

    public boolean y() {
        return this.f14976j;
    }

    protected abstract void z();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(AbstractC1424a0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(AbstractC1424a0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(AbstractC1424a0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(AbstractC1424a0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.E();
    }

    @NotNull
    public final C1585w2 f() {
        return this.f14967a;
    }

    @Nullable
    public final BaseAdAdapter<?, ?> g() {
        return this.f14972f;
    }

    @NotNull
    public final C1513m5 h() {
        return this.f14980n;
    }

    @NotNull
    protected final AdData i() {
        return this.f14979m;
    }

    @Nullable
    protected final Placement j() {
        return this.f14968b.i().b().e();
    }

    @NotNull
    protected final String k() {
        return this.f14968b.i().l();
    }

    private final BaseAdAdapter<?, ?> a(C1431b0 c1431b0) {
        return c1431b0.i().e().p() ? this.f14969c.b() : this.f14967a.a(c1431b0);
    }

    public static /* synthetic */ String a(AbstractC1424a0 abstractC1424a0, String str, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogMessage");
        }
        if ((i4 & 1) != 0) {
            str = null;
        }
        return abstractC1424a0.a(str);
    }

    @NotNull
    protected final String a(@Nullable String str) {
        return this.f14967a.a(str, this.f14985s);
    }

    private final void a(int i4, String str) {
        IronLog.INTERNAL.verbose(a("error = " + i4 + ", " + str));
        G();
        this.f14978l = true;
        a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i4, str, ib.a(this.f14973g));
        a(new IronSourceError(i4, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(AbstractC1424a0 this$0, int i4, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a(i4, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(AbstractC1424a0 this$0, AdapterErrorType adapterErrorType, int i4, String errorMessage) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adapterErrorType, "$adapterErrorType");
        Intrinsics.checkNotNullParameter(errorMessage, "$errorMessage");
        this$0.a(adapterErrorType, i4, errorMessage);
    }

    /* JADX WARN: Type inference failed for: r4v9, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    public final void a(@NotNull InterfaceC1459f0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a(this, (String) null, 1, (Object) null));
        this.f14971e = listener;
        this.f14975i = true;
        try {
            this.f14967a.e().e().a(false);
            this.f14973g = new ib();
            F();
            BaseAdAdapter<?, ?> baseAdAdapter = this.f14972f;
            Intrinsics.checkNotNull(baseAdAdapter);
            ?? networkAdapter = baseAdAdapter.getNetworkAdapter();
            if (networkAdapter != 0) {
                networkAdapter.init(this.f14968b.g(), ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str = "loadAd - network adapter not available " + this.f14985s;
            ironLog.error(a(str));
            a(C1426a2.c(this.f14968b.h()), str);
        } catch (Throwable th) {
            o9.d().a(th);
            String str2 = "loadAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str2));
            this.f14967a.e().h().g(str2);
            a(C1426a2.c(this.f14968b.h()), str2);
        }
    }

    private final void a(AdapterErrorType adapterErrorType, int i4, String str) {
        long a4 = ib.a(this.f14973g);
        IronLog.INTERNAL.verbose(a("Load duration = " + a4 + ", error = " + i4 + ", " + str));
        G();
        if (this.f14978l) {
            c();
            this.f14967a.e().h().f("instance load failed after it was already failed");
        } else {
            if (this.f14976j) {
                this.f14967a.e().h().f("instance load failed after it was already loaded");
                return;
            }
            this.f14978l = true;
            c();
            a(adapterErrorType, i4, str, a4);
            a(new IronSourceError(i4, str));
        }
    }

    private final void a(AdapterErrorType adapterErrorType, int i4, String str, long j4) {
        if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
            this.f14967a.e().e().a(j4, i4);
        } else {
            this.f14967a.e().e().a(j4, i4, str, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(IronSourceError ironSourceError) {
        a(C1539q1.a.FailedToLoad);
        InterfaceC1459f0 interfaceC1459f0 = this.f14971e;
        if (interfaceC1459f0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadListener");
            interfaceC1459f0 = null;
        }
        interfaceC1459f0.a(ironSourceError, this);
    }

    protected final void a(@NotNull C1539q1.a performance) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        this.f14968b.a(performance);
    }

    protected final void a(@NotNull Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f14967a.a(callback);
    }

    public final void a(boolean z4) {
        this.f14967a.e().a().a(z4);
    }
}
