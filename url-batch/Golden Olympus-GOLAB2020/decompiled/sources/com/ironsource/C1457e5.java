package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.e5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1457e5 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC1584w1 f15974a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f15975b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<String> f15976c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final StringBuilder f15977d;

    public C1457e5(@NotNull AbstractC1584w1 adUnitData) {
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.f15974a = adUnitData;
        this.f15975b = new HashMap();
        this.f15976c = new ArrayList();
        this.f15977d = new StringBuilder();
    }

    @NotNull
    public final Map<String, Object> a() {
        return this.f15975b;
    }

    @NotNull
    public final List<String> b() {
        return this.f15976c;
    }

    @NotNull
    public final StringBuilder c() {
        return this.f15977d;
    }

    public final boolean d() {
        return (this.f15975b.isEmpty() && this.f15976c.isEmpty()) ? false : true;
    }

    public final void a(@NotNull a8 biddingResponse) {
        Intrinsics.checkNotNullParameter(biddingResponse, "biddingResponse");
        String c4 = biddingResponse.c();
        Intrinsics.checkNotNullExpressionValue(c4, "biddingResponse.instanceName");
        int d4 = biddingResponse.d();
        Map<String, Object> a4 = biddingResponse.a();
        Intrinsics.checkNotNullExpressionValue(a4, "biddingResponse.biddingData");
        a(c4, d4, a4);
    }

    public final void a(@NotNull NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        List<String> list = this.f15976c;
        String providerInstanceName = providerSettings.getProviderInstanceName();
        Intrinsics.checkNotNullExpressionValue(providerInstanceName, "providerSettings.providerInstanceName");
        list.add(providerInstanceName);
        StringBuilder sb = this.f15977d;
        sb.append(providerSettings.getInstanceType(this.f15974a.b().a()));
        sb.append(providerSettings.getProviderInstanceName());
        sb.append(StringUtils.COMMA);
    }

    public final void a(@NotNull NetworkSettings providerSettings, @NotNull Map<String, ? extends Object> biddingData) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Intrinsics.checkNotNullParameter(biddingData, "biddingData");
        String providerInstanceName = providerSettings.getProviderInstanceName();
        Intrinsics.checkNotNullExpressionValue(providerInstanceName, "providerSettings.providerInstanceName");
        a(providerInstanceName, providerSettings.getInstanceType(this.f15974a.b().a()), biddingData);
    }

    private final void a(String str, int i4, Map<String, ? extends Object> map) {
        this.f15975b.put(str, map);
        StringBuilder sb = this.f15977d;
        sb.append(i4);
        sb.append(str);
        sb.append(StringUtils.COMMA);
    }
}
