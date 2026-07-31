package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class hj implements fm {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterstitialAdRequest f16594a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterstitialAdLoaderListener f16595b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC1455e3 f16596c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC1534p3 f16597d;

    public hj(@NotNull InterstitialAdRequest adRequest, @NotNull InterstitialAdLoaderListener publisherListener, @NotNull InterfaceC1455e3 adapterConfigProvider, @NotNull InterfaceC1534p3 analyticsFactory) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        Intrinsics.checkNotNullParameter(adapterConfigProvider, "adapterConfigProvider");
        Intrinsics.checkNotNullParameter(analyticsFactory, "analyticsFactory");
        this.f16594a = adRequest;
        this.f16595b = publisherListener;
        this.f16596c = adapterConfigProvider;
        this.f16597d = analyticsFactory;
    }

    @Override // com.ironsource.fm
    @NotNull
    public cm a() {
        IronSourceError b4;
        String instanceId = this.f16594a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
        Intrinsics.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
        InterfaceC1541q3 a4 = this.f16597d.a(new C1497k3(sDKVersion, instanceId, ad_unit, false, false, false, 56, null));
        try {
            dm a5 = new em(this.f16594a.getAdm(), this.f16594a.getProviderName$mediationsdk_release(), this.f16596c, ln.f17101e.a().c().get()).a();
            new fj(a5).a();
            xn xnVar = new xn();
            C1499k5 c1499k5 = new C1499k5(this.f16594a.getAdm(), this.f16594a.getProviderName$mediationsdk_release());
            InterstitialAdRequest interstitialAdRequest = this.f16594a;
            Intrinsics.checkNotNull(a5);
            ig igVar = ig.f16710a;
            return new ej(interstitialAdRequest, a5, new gj(igVar, this.f16595b), c1499k5, xnVar, a4, new aj(a4, igVar.c()), null, null, 384, null);
        } catch (Exception e4) {
            o9.d().a(e4);
            if (e4 instanceof pr) {
                b4 = ((pr) e4).a();
            } else {
                wb wbVar = wb.f20181a;
                String message = e4.getMessage();
                if (message == null) {
                    message = "unknown error";
                }
                b4 = wbVar.b(message);
            }
            return new xb(this.f16594a, new gj(ig.f16710a, this.f16595b), a4, b4);
        }
    }

    public /* synthetic */ hj(InterstitialAdRequest interstitialAdRequest, InterstitialAdLoaderListener interstitialAdLoaderListener, InterfaceC1455e3 interfaceC1455e3, InterfaceC1534p3 interfaceC1534p3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(interstitialAdRequest, interstitialAdLoaderListener, interfaceC1455e3, (i4 & 8) != 0 ? new C1527o3(IronSource.AD_UNIT.INTERSTITIAL) : interfaceC1534p3);
    }
}
