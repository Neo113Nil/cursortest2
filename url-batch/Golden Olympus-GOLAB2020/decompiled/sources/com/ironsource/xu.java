package com.ironsource;

import com.ironsource.i7;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class xu extends i7 implements InterfaceC1510m2, InterfaceC1596y1 {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C1525o1 f20342d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final w6 f20343e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final j7 f20344f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final n6 f20345g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private fv f20346h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C1586w3 f20347i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final vv f20348j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final lm f20349k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    private a f20350l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private a f20351m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f20352n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f20353o;

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    private C1565t1 f20354p;

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    private IronSourceError f20355q;

    @Metadata
    private final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final l6 f20356a;

        /* renamed from: b, reason: collision with root package name */
        public C1565t1 f20357b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f20358c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ xu f20359d;

        public a(xu xuVar, @NotNull n6 bannerAdUnitFactory, boolean z4) {
            Intrinsics.checkNotNullParameter(bannerAdUnitFactory, "bannerAdUnitFactory");
            this.f20359d = xuVar;
            this.f20356a = bannerAdUnitFactory.a(z4);
            this.f20358c = true;
        }

        @NotNull
        public final C1565t1 a() {
            C1565t1 c1565t1 = this.f20357b;
            if (c1565t1 != null) {
                return c1565t1;
            }
            Intrinsics.throwUninitializedPropertyAccessException("adUnitCallback");
            return null;
        }

        @NotNull
        public final l6 b() {
            return this.f20356a;
        }

        public final boolean c() {
            return this.f20358c;
        }

        public final boolean d() {
            return this.f20356a.d().a();
        }

        public final void e() {
            this.f20356a.a((InterfaceC1510m2) this.f20359d);
        }

        public final void a(@NotNull C1565t1 c1565t1) {
            Intrinsics.checkNotNullParameter(c1565t1, "<set-?>");
            this.f20357b = c1565t1;
        }

        public final void b(boolean z4) {
            this.f20358c = z4;
        }

        public final void a(boolean z4) {
            this.f20356a.a(z4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu(@NotNull C1525o1 adTools, @NotNull w6 bannerContainer, @NotNull i7.b config, @NotNull j6 bannerAdProperties, @NotNull j7 bannerStrategyListener, @NotNull n6 bannerAdUnitFactory) {
        super(config, bannerAdProperties);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
        Intrinsics.checkNotNullParameter(bannerStrategyListener, "bannerStrategyListener");
        Intrinsics.checkNotNullParameter(bannerAdUnitFactory, "bannerAdUnitFactory");
        this.f20342d = adTools;
        this.f20343e = bannerContainer;
        this.f20344f = bannerStrategyListener;
        this.f20345g = bannerAdUnitFactory;
        IronLog.INTERNAL.verbose(C1525o1.a(adTools, "refresh interval: " + d() + ", auto refresh: " + e(), (String) null, 2, (Object) null));
        this.f20347i = new C1586w3(adTools.b());
        this.f20348j = new vv(bannerContainer);
        this.f20349k = new lm(e() ^ true);
        this.f20351m = new a(this, bannerAdUnitFactory, true);
        this.f20353o = true;
    }

    private final void l() {
        this.f20353o = false;
        this.f20351m.b().a(this.f20343e.getViewBinder(), this);
        this.f20344f.a(this.f20351m.a());
        a aVar = this.f20350l;
        if (aVar != null) {
            aVar.a(false);
        }
        this.f20350l = this.f20351m;
        i();
        a(this.f20348j, this.f20347i, this.f20349k);
    }

    @Override // com.ironsource.InterfaceC1510m2
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f20351m.b(false);
        this.f20355q = ironSourceError;
        if (this.f20353o) {
            k();
            a(this.f20347i, this.f20349k);
        } else if (this.f20352n) {
            k();
            i();
            a(this.f20347i, this.f20349k);
        }
    }

    @Override // com.ironsource.InterfaceC1596y1
    public void b() {
        this.f20344f.f();
    }

    @Override // com.ironsource.i7
    public void c() {
        this.f20347i.e();
        this.f20348j.e();
        fv fvVar = this.f20346h;
        if (fvVar != null) {
            fvVar.c();
        }
        this.f20346h = null;
        a aVar = this.f20350l;
        if (aVar != null) {
            aVar.a(true);
        }
        this.f20351m.a(true);
    }

    @Override // com.ironsource.i7
    public void f() {
        this.f20351m.e();
    }

    @Override // com.ironsource.i7
    public void g() {
        if (e()) {
            this.f20349k.e();
        }
    }

    @Override // com.ironsource.i7
    public void h() {
        if (e()) {
            this.f20349k.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(xu this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f20352n = true;
        if (this$0.f20351m.d()) {
            this$0.l();
            return;
        }
        this$0.k();
        if (this$0.f20351m.c()) {
            return;
        }
        this$0.i();
        this$0.a(this$0.f20347i, this$0.f20349k);
    }

    private final void i() {
        if (e()) {
            a aVar = new a(this, this.f20345g, false);
            this.f20351m = aVar;
            aVar.e();
        }
    }

    private final void j() {
        this.f20342d.a(new Runnable() { // from class: com.ironsource.X4
            @Override // java.lang.Runnable
            public final void run() {
                xu.a(xu.this);
            }
        });
    }

    private final void k() {
        this.f20344f.c(this.f20355q);
        this.f20354p = null;
        this.f20355q = null;
    }

    @Override // com.ironsource.InterfaceC1596y1
    public void b(@Nullable IronSourceError ironSourceError) {
        this.f20344f.d(ironSourceError);
    }

    @Override // com.ironsource.InterfaceC1510m2
    public void c(@NotNull C1565t1 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f20351m.a(adUnitCallback);
        this.f20351m.b(false);
        if (this.f20352n || this.f20353o) {
            l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final xu this$0, hp[] triggers) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(triggers, "$triggers");
        this$0.f20352n = false;
        fv fvVar = this$0.f20346h;
        if (fvVar != null) {
            fvVar.c();
        }
        this$0.f20346h = new fv(this$0.f20342d, new Runnable() { // from class: com.ironsource.Y4
            @Override // java.lang.Runnable
            public final void run() {
                xu.b(xu.this);
            }
        }, this$0.d(), AbstractC3219i.G0(triggers));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(xu this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.j();
    }

    private final void a(final hp... hpVarArr) {
        this.f20342d.c(new Runnable() { // from class: com.ironsource.Z4
            @Override // java.lang.Runnable
            public final void run() {
                xu.a(xu.this, hpVarArr);
            }
        });
    }
}
