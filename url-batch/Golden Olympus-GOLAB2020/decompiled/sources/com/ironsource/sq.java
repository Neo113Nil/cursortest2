package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class sq implements fm {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final RewardedAdRequest f19634a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final RewardedAdLoaderListener f19635b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC1455e3 f19636c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC1534p3 f19637d;

    public sq(@NotNull RewardedAdRequest adRequest, @NotNull RewardedAdLoaderListener publisherListener, @NotNull InterfaceC1455e3 adapterConfigProvider, @NotNull InterfaceC1534p3 analyticsFactory) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        Intrinsics.checkNotNullParameter(adapterConfigProvider, "adapterConfigProvider");
        Intrinsics.checkNotNullParameter(analyticsFactory, "analyticsFactory");
        this.f19634a = adRequest;
        this.f19635b = publisherListener;
        this.f19636c = adapterConfigProvider;
        this.f19637d = analyticsFactory;
    }

    @Override // com.ironsource.fm
    @NotNull
    public cm a() {
        IronSourceError d4;
        String instanceId = this.f19634a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        Intrinsics.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
        InterfaceC1541q3 a4 = this.f19637d.a(new C1497k3(sDKVersion, instanceId, ad_unit, false, false, false, 56, null));
        try {
            dm a5 = new em(this.f19634a.getAdm(), this.f19634a.getProviderName$mediationsdk_release(), this.f19636c, ln.f17101e.a().c().get()).a();
            new qq(a5).a();
            xn xnVar = new xn();
            C1499k5 c1499k5 = new C1499k5(this.f19634a.getAdm(), this.f19634a.getProviderName$mediationsdk_release());
            RewardedAdRequest rewardedAdRequest = this.f19634a;
            Intrinsics.checkNotNull(a5);
            ig igVar = ig.f16710a;
            return new pq(rewardedAdRequest, a5, new rq(igVar, this.f19635b), c1499k5, xnVar, a4, new kq(a4, igVar.c()), null, null, 384, null);
        } catch (Exception e4) {
            o9.d().a(e4);
            if (e4 instanceof pr) {
                d4 = ((pr) e4).a();
            } else {
                wb wbVar = wb.f20181a;
                String message = e4.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                d4 = wbVar.d(message);
            }
            return new yb(this.f19634a, new rq(ig.f16710a, this.f19635b), a4, d4);
        }
    }

    public /* synthetic */ sq(RewardedAdRequest rewardedAdRequest, RewardedAdLoaderListener rewardedAdLoaderListener, InterfaceC1455e3 interfaceC1455e3, InterfaceC1534p3 interfaceC1534p3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(rewardedAdRequest, rewardedAdLoaderListener, interfaceC1455e3, (i4 & 8) != 0 ? new C1527o3(IronSource.AD_UNIT.REWARDED_VIDEO) : interfaceC1534p3);
    }
}
