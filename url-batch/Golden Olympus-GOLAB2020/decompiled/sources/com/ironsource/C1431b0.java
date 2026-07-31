package com.ironsource;

import com.ironsource.C1539q1;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1431b0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC1584w1 f15136a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final NetworkSettings f15137b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1492j5 f15138c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C1441c3 f15139d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C1513m5 f15140e;

    /* renamed from: f, reason: collision with root package name */
    private final int f15141f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C1480i0 f15142g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final IronSource.AD_UNIT f15143h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private final JSONObject f15144i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final String f15145j;

    /* renamed from: k, reason: collision with root package name */
    private final int f15146k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final String f15147l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    private final C1513m5 f15148m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final String f15149n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final String f15150o;

    /* renamed from: p, reason: collision with root package name */
    private final int f15151p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final AdData f15152q;

    public C1431b0(@NotNull AbstractC1584w1 adUnitData, @NotNull NetworkSettings providerSettings, @NotNull C1492j5 auctionData, @NotNull C1441c3 adapterConfig, @NotNull C1513m5 auctionResponseItem, int i4) {
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        Intrinsics.checkNotNullParameter(adapterConfig, "adapterConfig");
        Intrinsics.checkNotNullParameter(auctionResponseItem, "auctionResponseItem");
        this.f15136a = adUnitData;
        this.f15137b = providerSettings;
        this.f15138c = auctionData;
        this.f15139d = adapterConfig;
        this.f15140e = auctionResponseItem;
        this.f15141f = i4;
        this.f15142g = new C1480i0(C1539q1.a.DidntAttemptToLoad);
        IronSource.AD_UNIT a4 = adUnitData.b().a();
        this.f15143h = a4;
        this.f15144i = auctionData.h();
        this.f15145j = auctionData.g();
        this.f15146k = auctionData.i();
        this.f15147l = auctionData.f();
        this.f15148m = auctionData.j();
        String f4 = adapterConfig.f();
        Intrinsics.checkNotNullExpressionValue(f4, "adapterConfig.providerName");
        this.f15149n = f4;
        kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
        String format = String.format("%s %s", Arrays.copyOf(new Object[]{f4, Integer.valueOf(hashCode())}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        this.f15150o = format;
        this.f15151p = adapterConfig.d();
        String k4 = auctionResponseItem.k();
        Map<String, Object> a5 = nk.a(auctionResponseItem.a());
        Intrinsics.checkNotNullExpressionValue(a5, "jsonObjectToMap(auctionResponseItem.adData)");
        a5.put("adUnit", a4);
        HashMap hashMap = new HashMap();
        Map<String, Object> a6 = nk.a(adapterConfig.c());
        Intrinsics.checkNotNullExpressionValue(a6, "jsonObjectToMap(adapterConfig.adUnitSettings)");
        hashMap.putAll(a6);
        a5.put("userId", adUnitData.r());
        a5.put("adUnitId", adUnitData.b().c());
        a5.put("isMultipleAdUnits", Boolean.TRUE);
        this.f15152q = new AdData(k4, hashMap, a5);
    }

    public static /* synthetic */ C1431b0 a(C1431b0 c1431b0, AbstractC1584w1 abstractC1584w1, NetworkSettings networkSettings, C1492j5 c1492j5, C1441c3 c1441c3, C1513m5 c1513m5, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            abstractC1584w1 = c1431b0.f15136a;
        }
        if ((i5 & 2) != 0) {
            networkSettings = c1431b0.f15137b;
        }
        if ((i5 & 4) != 0) {
            c1492j5 = c1431b0.f15138c;
        }
        if ((i5 & 8) != 0) {
            c1441c3 = c1431b0.f15139d;
        }
        if ((i5 & 16) != 0) {
            c1513m5 = c1431b0.f15140e;
        }
        if ((i5 & 32) != 0) {
            i4 = c1431b0.f15141f;
        }
        C1513m5 c1513m52 = c1513m5;
        int i6 = i4;
        return c1431b0.a(abstractC1584w1, networkSettings, c1492j5, c1441c3, c1513m52, i6);
    }

    @NotNull
    public final NetworkSettings b() {
        return this.f15137b;
    }

    @NotNull
    public final C1492j5 c() {
        return this.f15138c;
    }

    @NotNull
    public final C1441c3 d() {
        return this.f15139d;
    }

    @NotNull
    public final C1513m5 e() {
        return this.f15140e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1431b0)) {
            return false;
        }
        C1431b0 c1431b0 = (C1431b0) obj;
        return Intrinsics.areEqual(this.f15136a, c1431b0.f15136a) && Intrinsics.areEqual(this.f15137b, c1431b0.f15137b) && Intrinsics.areEqual(this.f15138c, c1431b0.f15138c) && Intrinsics.areEqual(this.f15139d, c1431b0.f15139d) && Intrinsics.areEqual(this.f15140e, c1431b0.f15140e) && this.f15141f == c1431b0.f15141f;
    }

    public final int f() {
        return this.f15141f;
    }

    @NotNull
    public final AdData g() {
        return this.f15152q;
    }

    @NotNull
    public final IronSource.AD_UNIT h() {
        return this.f15143h;
    }

    public int hashCode() {
        return (((((((((this.f15136a.hashCode() * 31) + this.f15137b.hashCode()) * 31) + this.f15138c.hashCode()) * 31) + this.f15139d.hashCode()) * 31) + this.f15140e.hashCode()) * 31) + Integer.hashCode(this.f15141f);
    }

    @NotNull
    public final AbstractC1584w1 i() {
        return this.f15136a;
    }

    @NotNull
    public final C1441c3 j() {
        return this.f15139d;
    }

    @NotNull
    public final C1492j5 k() {
        return this.f15138c;
    }

    @NotNull
    public final String l() {
        return this.f15147l;
    }

    @NotNull
    public final String m() {
        return this.f15145j;
    }

    @NotNull
    public final C1513m5 n() {
        return this.f15140e;
    }

    public final int o() {
        return this.f15146k;
    }

    @Nullable
    public final C1513m5 p() {
        return this.f15148m;
    }

    @Nullable
    public final JSONObject q() {
        return this.f15144i;
    }

    @NotNull
    public final String r() {
        return this.f15149n;
    }

    public final int s() {
        return this.f15151p;
    }

    @NotNull
    public final C1480i0 t() {
        return this.f15142g;
    }

    @NotNull
    public String toString() {
        return "AdInstanceData(adUnitData=" + this.f15136a + ", providerSettings=" + this.f15137b + ", auctionData=" + this.f15138c + ", adapterConfig=" + this.f15139d + ", auctionResponseItem=" + this.f15140e + ", sessionDepth=" + this.f15141f + ')';
    }

    @NotNull
    public final NetworkSettings u() {
        return this.f15137b;
    }

    public final int v() {
        return this.f15141f;
    }

    @NotNull
    public final String w() {
        return this.f15150o;
    }

    @NotNull
    public final C1431b0 a(@NotNull AbstractC1584w1 adUnitData, @NotNull NetworkSettings providerSettings, @NotNull C1492j5 auctionData, @NotNull C1441c3 adapterConfig, @NotNull C1513m5 auctionResponseItem, int i4) {
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        Intrinsics.checkNotNullParameter(adapterConfig, "adapterConfig");
        Intrinsics.checkNotNullParameter(auctionResponseItem, "auctionResponseItem");
        return new C1431b0(adUnitData, providerSettings, auctionData, adapterConfig, auctionResponseItem, i4);
    }

    @NotNull
    public final AbstractC1584w1 a() {
        return this.f15136a;
    }

    public final void a(@NotNull C1539q1.a performance) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        this.f15142g.b(performance);
    }
}
