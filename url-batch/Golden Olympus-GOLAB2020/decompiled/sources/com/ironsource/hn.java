package com.ironsource;

import com.ironsource.AbstractC1584w1;
import com.ironsource.C1526o2;
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
public final class hn extends AbstractC1584w1 {

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    public static final a f16626y = new a(null);

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final C1460f1 f16627t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final C1578v1 f16628u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final sm f16629v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final String f16630w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private final String f16631x;

    @Metadata
    public static final class a {
        private a() {
        }

        @NotNull
        public final hn a(@NotNull C1460f1 adProperties, @Nullable fl flVar) {
            List<ao> emptyList;
            ms d4;
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            AbstractC1584w1.a aVar = AbstractC1584w1.f20126r;
            s8 c4 = (flVar == null || (d4 = flVar.d()) == null) ? null : d4.c();
            sm e4 = c4 != null ? c4.e() : null;
            if (e4 == null) {
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
            return new hn(adProperties, new C1578v1(userIdForNetworks, arrayList, b4), e4);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn(@NotNull C1460f1 adProperties, @NotNull C1578v1 adUnitCommonData, @NotNull sm configs) {
        super(adProperties, true, adUnitCommonData.f(), adUnitCommonData.d(), adUnitCommonData.e(), configs.d(), configs.b(), (int) (configs.c() / 1000), configs.a(), configs.f(), -1, new C1526o2(C1526o2.a.MANUAL, configs.d().j(), configs.d().b(), -1L), configs.h(), configs.i(), configs.k(), configs.j(), false, 65536, null);
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        this.f16627t = adProperties;
        this.f16628u = adUnitCommonData;
        this.f16629v = configs;
        this.f16630w = "NA";
        this.f16631x = gl.f16533e;
    }

    @NotNull
    public final sm A() {
        return this.f16629v;
    }

    @NotNull
    public final hn a(@NotNull C1460f1 adProperties, @NotNull C1578v1 adUnitCommonData, @NotNull sm configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new hn(adProperties, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC1584w1
    @NotNull
    public C1460f1 b() {
        return this.f16627t;
    }

    @Override // com.ironsource.AbstractC1584w1
    @NotNull
    public String c() {
        return this.f16630w;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn)) {
            return false;
        }
        hn hnVar = (hn) obj;
        return Intrinsics.areEqual(this.f16627t, hnVar.f16627t) && Intrinsics.areEqual(this.f16628u, hnVar.f16628u) && Intrinsics.areEqual(this.f16629v, hnVar.f16629v);
    }

    public int hashCode() {
        return (((this.f16627t.hashCode() * 31) + this.f16628u.hashCode()) * 31) + this.f16629v.hashCode();
    }

    @Override // com.ironsource.AbstractC1584w1
    @NotNull
    public String j() {
        return this.f16631x;
    }

    @NotNull
    public String toString() {
        return "NativeAdUnitData(adProperties=" + this.f16627t + ", adUnitCommonData=" + this.f16628u + ", configs=" + this.f16629v + ')';
    }

    @NotNull
    public final C1460f1 w() {
        return this.f16627t;
    }

    @NotNull
    public final C1578v1 x() {
        return this.f16628u;
    }

    @NotNull
    public final sm y() {
        return this.f16629v;
    }

    @NotNull
    public final C1578v1 z() {
        return this.f16628u;
    }

    public static /* synthetic */ hn a(hn hnVar, C1460f1 c1460f1, C1578v1 c1578v1, sm smVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            c1460f1 = hnVar.f16627t;
        }
        if ((i4 & 2) != 0) {
            c1578v1 = hnVar.f16628u;
        }
        if ((i4 & 4) != 0) {
            smVar = hnVar.f16629v;
        }
        return hnVar.a(c1460f1, c1578v1, smVar);
    }

    @Override // com.ironsource.AbstractC1584w1
    @NotNull
    public JSONObject b(@NotNull NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject nativeAdSettings = providerSettings.getNativeAdSettings();
        Intrinsics.checkNotNullExpressionValue(nativeAdSettings, "providerSettings.nativeAdSettings");
        return nativeAdSettings;
    }
}
