package com.ironsource;

import com.ironsource.AbstractC1584w1;
import com.ironsource.C1526o2;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class m6 extends AbstractC1584w1 {

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    public static final a f17194z = new a(null);

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final j6 f17195t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f17196u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final C1578v1 f17197v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final u6 f17198w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private final String f17199x;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private final String f17200y;

    @Metadata
    public static final class a {
        private a() {
        }

        @NotNull
        public final m6 a(@NotNull j6 adProperties, @Nullable fl flVar, boolean z4) {
            List<ao> emptyList;
            ms d4;
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            AbstractC1584w1.a aVar = AbstractC1584w1.f20126r;
            s8 c4 = (flVar == null || (d4 = flVar.d()) == null) ? null : d4.c();
            u6 c5 = c4 != null ? c4.c() : null;
            if (c5 == null) {
                throw new IllegalStateException("Error getting " + adProperties.a() + " configurations");
            }
            if (flVar == null || (emptyList = flVar.c(adProperties.d(), adProperties.c())) == null) {
                emptyList = CollectionsKt.emptyList();
            }
            String userIdForNetworks = IronSourceUtils.getUserIdForNetworks();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(emptyList, 10));
            Iterator<T> it = emptyList.iterator();
            while (it.hasNext()) {
                arrayList.add(((ao) it.next()).f());
            }
            rk b4 = rk.b();
            Intrinsics.checkNotNullExpressionValue(b4, "getInstance()");
            return new m6(adProperties, z4, new C1578v1(userIdForNetworks, arrayList, b4), c5);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m6(@NotNull j6 adProperties, boolean z4, @NotNull C1578v1 adUnitCommonData, @NotNull u6 configs) {
        super(adProperties, z4, r3, r4, r5, r6, configs.a(), (int) (configs.b() / 1000), configs.c(), configs.f(), -1, new C1526o2(C1526o2.a.MANUAL_WITH_AUTOMATIC_RELOAD, configs.d().j(), configs.d().b(), 1000 * configs.h()), configs.e(), configs.l(), configs.n(), configs.m(), false, 65536, null);
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        String f4 = adUnitCommonData.f();
        List<NetworkSettings> d4 = adUnitCommonData.d();
        rk e4 = adUnitCommonData.e();
        C1529o5 d5 = configs.d();
        Intrinsics.checkNotNullExpressionValue(d5, "configs.bannerAuctionSettings");
        this.f17195t = adProperties;
        this.f17196u = z4;
        this.f17197v = adUnitCommonData;
        this.f17198w = configs;
        this.f17199x = "BN";
        this.f17200y = gl.f16532d;
    }

    @Override // com.ironsource.AbstractC1584w1
    @NotNull
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public j6 b() {
        return this.f17195t;
    }

    @NotNull
    public final C1578v1 B() {
        return this.f17197v;
    }

    @NotNull
    public final u6 C() {
        return this.f17198w;
    }

    @NotNull
    public final m6 a(@NotNull j6 adProperties, boolean z4, @NotNull C1578v1 adUnitCommonData, @NotNull u6 configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new m6(adProperties, z4, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC1584w1
    @NotNull
    public String c() {
        return this.f17199x;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6)) {
            return false;
        }
        m6 m6Var = (m6) obj;
        return Intrinsics.areEqual(this.f17195t, m6Var.f17195t) && this.f17196u == m6Var.f17196u && Intrinsics.areEqual(this.f17197v, m6Var.f17197v) && Intrinsics.areEqual(this.f17198w, m6Var.f17198w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f17195t.hashCode() * 31;
        boolean z4 = this.f17196u;
        int i4 = z4;
        if (z4 != 0) {
            i4 = 1;
        }
        return ((((hashCode + i4) * 31) + this.f17197v.hashCode()) * 31) + this.f17198w.hashCode();
    }

    @Override // com.ironsource.AbstractC1584w1
    @NotNull
    public String j() {
        return this.f17200y;
    }

    @NotNull
    public String toString() {
        return "BannerAdUnitData(adProperties=" + this.f17195t + ", isPublisherLoad=" + this.f17196u + ", adUnitCommonData=" + this.f17197v + ", configs=" + this.f17198w + ')';
    }

    @Override // com.ironsource.AbstractC1584w1
    public boolean u() {
        return this.f17196u;
    }

    @NotNull
    public final j6 w() {
        return this.f17195t;
    }

    public final boolean x() {
        return this.f17196u;
    }

    @NotNull
    public final C1578v1 y() {
        return this.f17197v;
    }

    @NotNull
    public final u6 z() {
        return this.f17198w;
    }

    public static /* synthetic */ m6 a(m6 m6Var, j6 j6Var, boolean z4, C1578v1 c1578v1, u6 u6Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j6Var = m6Var.f17195t;
        }
        if ((i4 & 2) != 0) {
            z4 = m6Var.f17196u;
        }
        if ((i4 & 4) != 0) {
            c1578v1 = m6Var.f17197v;
        }
        if ((i4 & 8) != 0) {
            u6Var = m6Var.f17198w;
        }
        return m6Var.a(j6Var, z4, c1578v1, u6Var);
    }

    @Override // com.ironsource.AbstractC1584w1
    @NotNull
    public JSONObject b(@NotNull NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject bannerSettings = providerSettings.getBannerSettings();
        Intrinsics.checkNotNullExpressionValue(bannerSettings, "providerSettings.bannerSettings");
        return bannerSettings;
    }

    @Override // com.ironsource.AbstractC1584w1
    @NotNull
    public AdData a(@NotNull NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        AdData createAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(b(providerSettings), b().a(), r(), new IronSourceBannerLayout(ContextProvider.getInstance().getApplicationContext(), new C1502l1().b(b().g())));
        Intrinsics.checkNotNullExpressionValue(createAdDataForNetworkAdapter, "createAdDataForNetworkAd…ze(adProperties.adSize)))");
        return createAdDataForNetworkAdapter;
    }
}
