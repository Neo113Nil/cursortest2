package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.appsflyer.AdRevenueScheme;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.mobile.ads.impl.ip1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ro {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f31319a;

    public ro(@NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.f31319a = adConfiguration;
    }

    public final void a(@NotNull Context context, @NotNull String adUnitID, @NotNull gs adType, @NotNull ak1 prefetchedMediationInfo, @Nullable Long l4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adUnitID, "adUnitID");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(prefetchedMediationInfo, "prefetchedMediationInfo");
        jp1 jp1Var = new jp1((Map) null, 3);
        jp1Var.b(adUnitID, "block_id");
        jp1Var.b(adType, AdRevenueScheme.AD_TYPE);
        jp1Var.b(l4, IronSourceConstants.EVENTS_DURATION);
        LinkedHashMap a4 = ck1.a(prefetchedMediationInfo);
        jp1Var.a(a4);
        String str = (String) a4.get(com.ironsource.ge.f16389B1);
        jp1 a5 = kp1.a(jp1Var, new jq().a(null, this.f31319a));
        ip1.b bVar = ip1.b.f27344d0;
        Map<String, Object> b4 = a5.b();
        ip1 ip1Var = new ip1(bVar.a(), (Map<String, Object>) MapsKt.toMutableMap(b4), ve1.a(a5, bVar, "reportType", b4, "reportData"));
        this.f31319a.p().f();
        C1900ed.a(context, zm2.f35627a, this.f31319a.p().b()).a(ip1Var);
        new C2388zc(context).a(bVar, ip1Var.b(), str, null);
    }
}
