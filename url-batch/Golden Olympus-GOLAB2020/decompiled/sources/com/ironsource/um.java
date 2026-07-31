package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class um extends AbstractC1516n implements in, InterfaceC1510m2, InterfaceC1596y1 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final xm f19931b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1525o1 f19932c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final en f19933d;

    /* renamed from: e, reason: collision with root package name */
    private gn f19934e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private LevelPlayAdInfo f19935f;

    public um(@NotNull xm listener, @NotNull C1525o1 adTools, @NotNull en nativeAdProperties) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(nativeAdProperties, "nativeAdProperties");
        this.f19931b = listener;
        this.f19932c = adTools;
        this.f19933d = nativeAdProperties;
        this.f19935f = i();
    }

    private final gn a(C1525o1 c1525o1, en enVar) {
        IronLog.INTERNAL.verbose();
        return new gn(c1525o1, hn.f16626y.a(enVar, h().a()), this);
    }

    private final LevelPlayAdInfo i() {
        String uuid = this.f19933d.b().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "nativeAdProperties.adId.toString()");
        String c4 = this.f19933d.c();
        String ad_unit = this.f19933d.a().toString();
        Intrinsics.checkNotNullExpressionValue(ad_unit, "nativeAdProperties.adFormat.toString()");
        return new LevelPlayAdInfo(uuid, c4, ad_unit, null, null, null, null, 120, null);
    }

    @Override // com.ironsource.InterfaceC1596y1
    public void b() {
        throw new W1.n("An operation is not implemented: Not yet implemented");
    }

    @Override // com.ironsource.InterfaceC1496k2
    public void c() {
        this.f19931b.f(this.f19935f);
    }

    public final void j() {
        this.f19935f = i();
        gn gnVar = this.f19934e;
        if (gnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeAdUnit");
            gnVar = null;
        }
        gnVar.a(true);
    }

    public final void k() {
        gn a4 = a(this.f19932c, this.f19933d);
        this.f19934e = a4;
        if (a4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeAdUnit");
            a4 = null;
        }
        a4.a((InterfaceC1510m2) this);
    }

    @Override // com.ironsource.InterfaceC1510m2
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f19931b.onNativeAdLoadFailed(ironSourceError);
    }

    @Override // com.ironsource.InterfaceC1596y1
    public void b(@Nullable IronSourceError ironSourceError) {
        throw new W1.n("An operation is not implemented: Not yet implemented");
    }

    @Override // com.ironsource.InterfaceC1510m2
    public void c(@NotNull C1565t1 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        LevelPlayAdInfo c4 = adUnitCallback.c();
        if (c4 != null) {
            this.f19935f = c4;
            this.f19931b.b(c4);
        }
    }

    public final void a(@NotNull rm nativeAdBinder) {
        Intrinsics.checkNotNullParameter(nativeAdBinder, "nativeAdBinder");
        gn gnVar = this.f19934e;
        if (gnVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeAdUnit");
            gnVar = null;
        }
        gnVar.a(new zm(nativeAdBinder), this);
    }
}
