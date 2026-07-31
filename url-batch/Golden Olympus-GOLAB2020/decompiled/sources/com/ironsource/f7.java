package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.AdSize;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class f7 implements fm {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final BannerAdRequest f16221a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final BannerAdLoaderListener f16222b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC1455e3 f16223c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC1534p3 f16224d;

    public f7(@NotNull BannerAdRequest adRequest, @NotNull BannerAdLoaderListener publisherListener, @NotNull InterfaceC1455e3 adapterConfigProvider, @NotNull InterfaceC1534p3 analyticsFactory) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        Intrinsics.checkNotNullParameter(adapterConfigProvider, "adapterConfigProvider");
        Intrinsics.checkNotNullParameter(analyticsFactory, "analyticsFactory");
        this.f16221a = adRequest;
        this.f16222b = publisherListener;
        this.f16223c = adapterConfigProvider;
        this.f16224d = analyticsFactory;
    }

    @Override // com.ironsource.fm
    @NotNull
    public cm a() {
        IronSourceError a4;
        String instanceId = this.f16221a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        Intrinsics.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
        InterfaceC1541q3 a5 = this.f16224d.a(new C1497k3(sDKVersion, instanceId, ad_unit, false, false, false, 56, null));
        try {
            dm a6 = new em(this.f16221a.getAdm(), this.f16221a.getProviderName$mediationsdk_release(), this.f16223c, ln.f17101e.a().c().get()).a();
            new d7(a6, this.f16221a.getSize()).a();
            xn xnVar = new xn();
            C1499k5 c1499k5 = new C1499k5(this.f16221a.getAdm(), this.f16221a.getProviderName$mediationsdk_release());
            BannerAdRequest bannerAdRequest = this.f16221a;
            AdSize size = bannerAdRequest.getSize();
            Intrinsics.checkNotNull(a6);
            ig igVar = ig.f16710a;
            return new c7(bannerAdRequest, size, c1499k5, a6, xnVar, a5, new e7(igVar, this.f16222b), new e6(a5, igVar.c()), null, null, 768, null);
        } catch (Exception e4) {
            o9.d().a(e4);
            if (e4 instanceof pr) {
                a4 = ((pr) e4).a();
            } else {
                wb wbVar = wb.f20181a;
                String message = e4.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                a4 = wbVar.a(message);
            }
            return new vb(a4, new e7(ig.f16710a, this.f16222b), a5);
        }
    }

    public /* synthetic */ f7(BannerAdRequest bannerAdRequest, BannerAdLoaderListener bannerAdLoaderListener, InterfaceC1455e3 interfaceC1455e3, InterfaceC1534p3 interfaceC1534p3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(bannerAdRequest, bannerAdLoaderListener, interfaceC1455e3, (i4 & 8) != 0 ? new C1527o3(IronSource.AD_UNIT.BANNER) : interfaceC1534p3);
    }
}
