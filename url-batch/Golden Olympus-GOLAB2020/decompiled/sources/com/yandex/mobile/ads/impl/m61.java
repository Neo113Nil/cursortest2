package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ip1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class m61 extends AbstractC2097mj<n61> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final q61 f28919c;

    public /* synthetic */ m61() {
        this(new o91(), new q61());
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2097mj
    @NotNull
    protected final jp1 a(@NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        jp1 a4 = super.a(adConfiguration);
        a4.b(Boolean.valueOf(adConfiguration.t()), "image_loading_automatically");
        List<String> l4 = adConfiguration.l();
        if (!l4.isEmpty()) {
            a4.b(l4, "image_sizes");
        }
        return a4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m61(@NotNull o91 nativeResponseReportDataProvider, @NotNull q61 nativeAdResponseDataProvider) {
        super(nativeResponseReportDataProvider);
        Intrinsics.checkNotNullParameter(nativeResponseReportDataProvider, "nativeResponseReportDataProvider");
        Intrinsics.checkNotNullParameter(nativeAdResponseDataProvider, "nativeAdResponseDataProvider");
        this.f28919c = nativeAdResponseDataProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.AbstractC2097mj
    @NotNull
    protected final jp1 a(int i4, @NotNull C2286v2 adConfiguration, @Nullable qq1 qq1Var) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        jp1 a4 = super.a(i4, adConfiguration, qq1Var);
        ip1.c cVar = null;
        C2360y7 adResponse = qq1Var != null ? (C2360y7) qq1Var.f30869a : null;
        if (204 == i4) {
            cVar = ip1.c.f27371e;
        } else if (adResponse != null && i4 == 200) {
            this.f28919c.getClass();
            Intrinsics.checkNotNullParameter(adResponse, "adResponse");
            n61 n61Var = (n61) adResponse.I();
            if (n61Var != null) {
                cVar = (ip1.c) n61Var.f().get("status");
            } else if (adResponse.D() == null) {
                cVar = ip1.c.f27370d;
            }
        } else {
            cVar = ip1.c.f27370d;
        }
        if (cVar != null) {
            a4.b(cVar.a(), "status");
        }
        return a4;
    }
}
