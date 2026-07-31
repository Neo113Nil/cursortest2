package com.ironsource;

import com.ironsource.AbstractC1584w1;
import com.ironsource.C1526o2;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
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
public final class tq extends AbstractC1584w1 {

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    public static final a f19813z = new a(null);

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final C1460f1 f19814t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f19815u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final C1578v1 f19816v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final zq f19817w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private final String f19818x;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private final String f19819y;

    @Metadata
    public static final class a {
        private a() {
        }

        @NotNull
        public final tq a(@NotNull C1460f1 adProperties, @Nullable fl flVar, boolean z4) {
            List<ao> emptyList;
            ms d4;
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            AbstractC1584w1.a aVar = AbstractC1584w1.f20126r;
            s8 c4 = (flVar == null || (d4 = flVar.d()) == null) ? null : d4.c();
            zq f4 = c4 != null ? c4.f() : null;
            if (f4 == null) {
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
            return new tq(adProperties, z4, new C1578v1(userIdForNetworks, arrayList, b4), f4);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tq(@NotNull C1460f1 adProperties, boolean z4, @NotNull C1578v1 adUnitCommonData, @NotNull zq configs) {
        super(adProperties, z4, r3, r4, r5, r6, configs.g(), configs.h(), configs.j(), configs.b(), configs.c(), new C1526o2(C1526o2.a.MANUAL, configs.k().j(), configs.k().b(), -1L), configs.l(), configs.f(), configs.o(), configs.n(), false, 65536, null);
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        String f4 = adUnitCommonData.f();
        List<NetworkSettings> d4 = adUnitCommonData.d();
        rk e4 = adUnitCommonData.e();
        C1529o5 k4 = configs.k();
        Intrinsics.checkNotNullExpressionValue(k4, "configs.rewardedVideoAuctionSettings");
        this.f19814t = adProperties;
        this.f19815u = z4;
        this.f19816v = adUnitCommonData;
        this.f19817w = configs;
        this.f19818x = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.f19819y = gl.f16530b;
    }

    @NotNull
    public final C1578v1 A() {
        return this.f19816v;
    }

    @NotNull
    public final zq B() {
        return this.f19817w;
    }

    @NotNull
    public final tq a(@NotNull C1460f1 adProperties, boolean z4, @NotNull C1578v1 adUnitCommonData, @NotNull zq configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new tq(adProperties, z4, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC1584w1
    @NotNull
    public C1460f1 b() {
        return this.f19814t;
    }

    @Override // com.ironsource.AbstractC1584w1
    @NotNull
    public String c() {
        return this.f19818x;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq)) {
            return false;
        }
        tq tqVar = (tq) obj;
        return Intrinsics.areEqual(this.f19814t, tqVar.f19814t) && this.f19815u == tqVar.f19815u && Intrinsics.areEqual(this.f19816v, tqVar.f19816v) && Intrinsics.areEqual(this.f19817w, tqVar.f19817w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f19814t.hashCode() * 31;
        boolean z4 = this.f19815u;
        int i4 = z4;
        if (z4 != 0) {
            i4 = 1;
        }
        return ((((hashCode + i4) * 31) + this.f19816v.hashCode()) * 31) + this.f19817w.hashCode();
    }

    @Override // com.ironsource.AbstractC1584w1
    @NotNull
    public String j() {
        return this.f19819y;
    }

    @NotNull
    public String toString() {
        return "RewardedAdUnitData(adProperties=" + this.f19814t + ", isPublisherLoad=" + this.f19815u + ", adUnitCommonData=" + this.f19816v + ", configs=" + this.f19817w + ')';
    }

    @Override // com.ironsource.AbstractC1584w1
    public boolean u() {
        return this.f19815u;
    }

    @NotNull
    public final C1460f1 w() {
        return this.f19814t;
    }

    public final boolean x() {
        return this.f19815u;
    }

    @NotNull
    public final C1578v1 y() {
        return this.f19816v;
    }

    @NotNull
    public final zq z() {
        return this.f19817w;
    }

    public static /* synthetic */ tq a(tq tqVar, C1460f1 c1460f1, boolean z4, C1578v1 c1578v1, zq zqVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            c1460f1 = tqVar.f19814t;
        }
        if ((i4 & 2) != 0) {
            z4 = tqVar.f19815u;
        }
        if ((i4 & 4) != 0) {
            c1578v1 = tqVar.f19816v;
        }
        if ((i4 & 8) != 0) {
            zqVar = tqVar.f19817w;
        }
        return tqVar.a(c1460f1, z4, c1578v1, zqVar);
    }

    @Override // com.ironsource.AbstractC1584w1
    @NotNull
    public JSONObject b(@NotNull NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject rewardedVideoSettings = providerSettings.getRewardedVideoSettings();
        Intrinsics.checkNotNullExpressionValue(rewardedVideoSettings, "providerSettings.rewardedVideoSettings");
        return rewardedVideoSettings;
    }
}
