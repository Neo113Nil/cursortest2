package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class v5 extends AbstractC1516n implements o6, j7 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1525o1 f19990b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final j6 f19991c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final WeakReference<w5> f19992d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private LevelPlayAdInfo f19993e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private LevelPlayAdInfo f19994f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final i7 f19995g;

    public v5(@NotNull w5 listener, @NotNull C1525o1 adTools, @NotNull j6 bannerAdProperties, @NotNull w6 bannerViewContainer) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
        Intrinsics.checkNotNullParameter(bannerViewContainer, "bannerViewContainer");
        this.f19990b = adTools;
        this.f19991c = bannerAdProperties;
        this.f19992d = new WeakReference<>(listener);
        this.f19993e = j();
        this.f19994f = j();
        this.f19995g = i7.f16690c.a(adTools, bannerViewContainer, adTools.b(bannerAdProperties.c()), bannerAdProperties, this, i());
    }

    private final l6 a(C1525o1 c1525o1, j6 j6Var, boolean z4) {
        IronLog.INTERNAL.verbose();
        return new l6(c1525o1, m6.f17194z.a(j6Var, h().a(), z4), this);
    }

    private final n6 i() {
        return new n6() { // from class: com.ironsource.N3
            @Override // com.ironsource.n6
            public final l6 a(boolean z4) {
                l6 a4;
                a4 = v5.a(v5.this, z4);
                return a4;
            }
        };
    }

    private final LevelPlayAdInfo j() {
        String uuid = this.f19991c.b().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "bannerAdProperties.adId.toString()");
        String c4 = this.f19991c.c();
        String ad_unit = this.f19991c.a().toString();
        Intrinsics.checkNotNullExpressionValue(ad_unit, "bannerAdProperties.adFormat.toString()");
        return new LevelPlayAdInfo(uuid, c4, ad_unit, null, null, null, null, 120, null);
    }

    @Override // com.ironsource.InterfaceC1496k2
    public void c() {
        w5 w5Var = this.f19992d.get();
        if (w5Var != null) {
            w5Var.e(this.f19993e);
        }
    }

    @Override // com.ironsource.o6
    public /* bridge */ /* synthetic */ Unit d() {
        m();
        return Unit.f41027a;
    }

    @Override // com.ironsource.o6
    public /* bridge */ /* synthetic */ Unit e() {
        o();
        return Unit.f41027a;
    }

    @Override // com.ironsource.j7
    public void f() {
        this.f19993e = this.f19994f;
        this.f19994f = j();
        w5 w5Var = this.f19992d.get();
        if (w5Var != null) {
            w5Var.c(this.f19993e);
        }
    }

    @Override // com.ironsource.o6
    public /* bridge */ /* synthetic */ Unit g() {
        n();
        return Unit.f41027a;
    }

    public final void k() {
        this.f19995g.c();
    }

    public final void l() {
        this.f19995g.f();
    }

    public void m() {
        w5 w5Var = this.f19992d.get();
        if (w5Var != null) {
            w5Var.g(this.f19993e);
        }
    }

    public void n() {
        w5 w5Var = this.f19992d.get();
        if (w5Var != null) {
            w5Var.d(this.f19993e);
        }
    }

    public void o() {
        w5 w5Var = this.f19992d.get();
        if (w5Var != null) {
            w5Var.a(this.f19993e);
        }
    }

    public final void p() {
        this.f19995g.g();
    }

    public final void q() {
        this.f19995g.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l6 a(v5 this$0, boolean z4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.a(this$0.f19990b, this$0.f19991c, z4);
    }

    @Override // com.ironsource.j7
    public void c(@Nullable IronSourceError ironSourceError) {
        w5 w5Var = this.f19992d.get();
        if (w5Var != null) {
            String uuid = this.f19991c.b().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "bannerAdProperties.adId.toString()");
            w5Var.a(new LevelPlayAdError(ironSourceError, uuid, this.f19991c.c()));
        }
    }

    @Override // com.ironsource.j7
    public void d(@Nullable IronSourceError ironSourceError) {
        w5 w5Var = this.f19992d.get();
        if (w5Var != null) {
            LevelPlayAdInfo levelPlayAdInfo = this.f19993e;
            String uuid = this.f19991c.b().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "bannerAdProperties.adId.toString()");
            w5Var.a(levelPlayAdInfo, new LevelPlayAdError(ironSourceError, uuid, this.f19991c.c()));
        }
    }

    @Override // com.ironsource.j7
    public void a(@NotNull C1565t1 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        LevelPlayAdInfo c4 = adUnitCallback.c();
        if (c4 != null) {
            this.f19994f = c4;
            w5 w5Var = this.f19992d.get();
            if (w5Var != null) {
                w5Var.a(c4, false);
            }
        }
    }
}
