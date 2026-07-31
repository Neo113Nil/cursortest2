package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class r7 implements InterfaceC1455e3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final s8 f18896a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final dq f18897b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final IronSource.AD_UNIT f18898c;

    @Metadata
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18899a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            try {
                iArr[IronSource.AD_UNIT.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f18899a = iArr;
        }
    }

    public r7(@NotNull s8 adFormatConfigurations, @Nullable dq dqVar, @NotNull IronSource.AD_UNIT adFormat) {
        Intrinsics.checkNotNullParameter(adFormatConfigurations, "adFormatConfigurations");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.f18896a = adFormatConfigurations;
        this.f18897b = dqVar;
        this.f18898c = adFormat;
    }

    @Override // com.ironsource.InterfaceC1455e3
    @Nullable
    public vi a(@NotNull zp providerName) {
        NetworkSettings b4;
        zq f4;
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        dq dqVar = this.f18897b;
        if (dqVar == null || (b4 = dqVar.b(providerName.value())) == null) {
            return null;
        }
        int i4 = a.f18899a[this.f18898c.ordinal()];
        if (i4 == 1) {
            u6 c4 = this.f18896a.c();
            if (c4 != null) {
                return new z6(new C1441c3(b4, b4.getBannerSettings(), this.f18898c), c4);
            }
            return null;
        }
        if (i4 != 2) {
            if (i4 == 3 && (f4 = this.f18896a.f()) != null) {
                return new mq(new C1441c3(b4, b4.getRewardedVideoSettings(), this.f18898c), f4);
            }
            return null;
        }
        nj d4 = this.f18896a.d();
        if (d4 != null) {
            return new qj(new C1441c3(b4, b4.getInterstitialSettings(), this.f18898c), d4);
        }
        return null;
    }
}
