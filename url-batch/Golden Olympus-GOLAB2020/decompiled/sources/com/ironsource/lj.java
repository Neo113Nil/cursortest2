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
public final class lj extends AbstractC1584w1 {

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    public static final a f17088z = new a(null);

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final C1460f1 f17089t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f17090u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final C1578v1 f17091v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final nj f17092w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private final String f17093x;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private final String f17094y;

    @Metadata
    public static final class a {
        private a() {
        }

        @NotNull
        public final lj a(@NotNull C1460f1 adProperties, @Nullable fl flVar, boolean z4) {
            List<ao> emptyList;
            ms d4;
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            AbstractC1584w1.a aVar = AbstractC1584w1.f20126r;
            s8 c4 = (flVar == null || (d4 = flVar.d()) == null) ? null : d4.c();
            nj d5 = c4 != null ? c4.d() : null;
            if (d5 == null) {
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
            return new lj(adProperties, z4, new C1578v1(userIdForNetworks, arrayList, b4), d5);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lj(@NotNull C1460f1 adProperties, boolean z4, @NotNull C1578v1 adUnitCommonData, @NotNull nj configs) {
        super(adProperties, z4, r3, r4, r5, r6, configs.c(), configs.d(), configs.f(), configs.b(), -1, new C1526o2(C1526o2.a.MANUAL, configs.g().j(), configs.g().b(), -1L), configs.h(), configs.k(), configs.m(), configs.l(), false, 65536, null);
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        String f4 = adUnitCommonData.f();
        List<NetworkSettings> d4 = adUnitCommonData.d();
        rk e4 = adUnitCommonData.e();
        C1529o5 g4 = configs.g();
        Intrinsics.checkNotNullExpressionValue(g4, "configs.interstitialAuctionSettings");
        this.f17089t = adProperties;
        this.f17090u = z4;
        this.f17091v = adUnitCommonData;
        this.f17092w = configs;
        this.f17093x = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.f17094y = gl.f16531c;
    }

    @NotNull
    public final C1578v1 A() {
        return this.f17091v;
    }

    @NotNull
    public final nj B() {
        return this.f17092w;
    }

    @NotNull
    public final lj a(@NotNull C1460f1 adProperties, boolean z4, @NotNull C1578v1 adUnitCommonData, @NotNull nj configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new lj(adProperties, z4, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC1584w1
    @NotNull
    public C1460f1 b() {
        return this.f17089t;
    }

    @Override // com.ironsource.AbstractC1584w1
    @NotNull
    public String c() {
        return this.f17093x;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj)) {
            return false;
        }
        lj ljVar = (lj) obj;
        return Intrinsics.areEqual(this.f17089t, ljVar.f17089t) && this.f17090u == ljVar.f17090u && Intrinsics.areEqual(this.f17091v, ljVar.f17091v) && Intrinsics.areEqual(this.f17092w, ljVar.f17092w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f17089t.hashCode() * 31;
        boolean z4 = this.f17090u;
        int i4 = z4;
        if (z4 != 0) {
            i4 = 1;
        }
        return ((((hashCode + i4) * 31) + this.f17091v.hashCode()) * 31) + this.f17092w.hashCode();
    }

    @Override // com.ironsource.AbstractC1584w1
    @NotNull
    public String j() {
        return this.f17094y;
    }

    @NotNull
    public String toString() {
        return "InterstitialAdUnitData(adProperties=" + this.f17089t + ", isPublisherLoad=" + this.f17090u + ", adUnitCommonData=" + this.f17091v + ", configs=" + this.f17092w + ')';
    }

    @Override // com.ironsource.AbstractC1584w1
    public boolean u() {
        return this.f17090u;
    }

    @NotNull
    public final C1460f1 w() {
        return this.f17089t;
    }

    public final boolean x() {
        return this.f17090u;
    }

    @NotNull
    public final C1578v1 y() {
        return this.f17091v;
    }

    @NotNull
    public final nj z() {
        return this.f17092w;
    }

    public static /* synthetic */ lj a(lj ljVar, C1460f1 c1460f1, boolean z4, C1578v1 c1578v1, nj njVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            c1460f1 = ljVar.f17089t;
        }
        if ((i4 & 2) != 0) {
            z4 = ljVar.f17090u;
        }
        if ((i4 & 4) != 0) {
            c1578v1 = ljVar.f17091v;
        }
        if ((i4 & 8) != 0) {
            njVar = ljVar.f17092w;
        }
        return ljVar.a(c1460f1, z4, c1578v1, njVar);
    }

    @Override // com.ironsource.AbstractC1584w1
    @NotNull
    public JSONObject b(@NotNull NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject interstitialSettings = providerSettings.getInterstitialSettings();
        Intrinsics.checkNotNullExpressionValue(interstitialSettings, "providerSettings.interstitialSettings");
        return interstitialSettings;
    }
}
