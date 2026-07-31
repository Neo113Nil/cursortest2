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
public final class wu extends i7 implements InterfaceC1510m2, InterfaceC1596y1 {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C1525o1 f20249d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final w6 f20250e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final j7 f20251f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final n6 f20252g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private fv f20253h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C1586w3 f20254i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final vv f20255j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final lm f20256k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    private a f20257l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private a f20258m;

    @Metadata
    private final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final l6 f20259a;

        /* renamed from: b, reason: collision with root package name */
        public C1565t1 f20260b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ wu f20261c;

        public a(wu wuVar, @NotNull n6 bannerAdUnitFactory, boolean z4) {
            Intrinsics.checkNotNullParameter(bannerAdUnitFactory, "bannerAdUnitFactory");
            this.f20261c = wuVar;
            this.f20259a = bannerAdUnitFactory.a(z4);
        }

        @NotNull
        public final C1565t1 a() {
            C1565t1 c1565t1 = this.f20260b;
            if (c1565t1 != null) {
                return c1565t1;
            }
            Intrinsics.throwUninitializedPropertyAccessException("adUnitCallback");
            return null;
        }

        @NotNull
        public final l6 b() {
            return this.f20259a;
        }

        @NotNull
        public final InterfaceC1488j1 c() {
            return this.f20259a.d();
        }

        public final void d() {
            this.f20259a.a((InterfaceC1510m2) this.f20261c);
        }

        public final void a(@NotNull C1565t1 c1565t1) {
            Intrinsics.checkNotNullParameter(c1565t1, "<set-?>");
            this.f20260b = c1565t1;
        }

        public final void a(boolean z4) {
            this.f20259a.a(z4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu(@NotNull C1525o1 adTools, @NotNull w6 bannerContainer, @NotNull i7.b config, @NotNull j6 bannerAdProperties, @NotNull j7 bannerStrategyListener, @NotNull n6 bannerAdUnitFactory) {
        super(config, bannerAdProperties);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
        Intrinsics.checkNotNullParameter(bannerStrategyListener, "bannerStrategyListener");
        Intrinsics.checkNotNullParameter(bannerAdUnitFactory, "bannerAdUnitFactory");
        this.f20249d = adTools;
        this.f20250e = bannerContainer;
        this.f20251f = bannerStrategyListener;
        this.f20252g = bannerAdUnitFactory;
        IronLog.INTERNAL.verbose(C1525o1.a(adTools, "refresh interval: " + d() + ", auto refresh: " + e(), (String) null, 2, (Object) null));
        this.f20254i = new C1586w3(adTools.b());
        this.f20255j = new vv(bannerContainer);
        this.f20256k = new lm(e() ^ true);
        this.f20258m = new a(this, bannerAdUnitFactory, true);
    }

    @Override // com.ironsource.InterfaceC1510m2
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f20251f.c(ironSourceError);
        a(this.f20254i, this.f20256k);
    }

    @Override // com.ironsource.InterfaceC1596y1
    public void b() {
        this.f20251f.f();
    }

    @Override // com.ironsource.i7
    public void c() {
        this.f20254i.e();
        this.f20255j.e();
        fv fvVar = this.f20253h;
        if (fvVar != null) {
            fvVar.c();
        }
        this.f20253h = null;
        a aVar = this.f20257l;
        if (aVar != null) {
            aVar.a(true);
        }
        this.f20257l = null;
        this.f20258m.a(true);
    }

    @Override // com.ironsource.i7
    public void f() {
        this.f20258m.d();
    }

    @Override // com.ironsource.i7
    public void g() {
        if (e()) {
            this.f20256k.e();
        }
    }

    @Override // com.ironsource.i7
    public void h() {
        if (e()) {
            this.f20256k.f();
        }
    }

    private final void a(C1565t1 c1565t1) {
        this.f20258m.a(c1565t1);
        this.f20258m.b().a(this.f20250e.getViewBinder(), this);
        this.f20251f.a(this.f20258m.a());
        a aVar = this.f20257l;
        if (aVar != null) {
            aVar.a(false);
        }
        this.f20257l = null;
    }

    private final void i() {
        this.f20257l = this.f20258m;
        a aVar = new a(this, this.f20252g, false);
        this.f20258m = aVar;
        aVar.d();
    }

    private final void j() {
        this.f20249d.a(new Runnable() { // from class: com.ironsource.O4
            @Override // java.lang.Runnable
            public final void run() {
                wu.a(wu.this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC1596y1
    public void b(@Nullable IronSourceError ironSourceError) {
        this.f20251f.d(ironSourceError);
    }

    @Override // com.ironsource.InterfaceC1510m2
    public void c(@NotNull C1565t1 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        a(adUnitCallback);
        a(this.f20255j, this.f20254i, this.f20256k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(wu this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(wu this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final wu this$0, hp[] triggers) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(triggers, "$triggers");
        this$0.f20253h = new fv(this$0.f20249d, new Runnable() { // from class: com.ironsource.P4
            @Override // java.lang.Runnable
            public final void run() {
                wu.b(wu.this);
            }
        }, this$0.d(), AbstractC3219i.G0(triggers));
    }

    private final void a(final hp... hpVarArr) {
        this.f20249d.c(new Runnable() { // from class: com.ironsource.N4
            @Override // java.lang.Runnable
            public final void run() {
                wu.a(wu.this, hpVarArr);
            }
        });
    }
}
