package com.ironsource;

import com.ironsource.C1526o2;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class jj extends C1571u0 {

    /* renamed from: s, reason: collision with root package name */
    @Nullable
    private final String f16850s;

    /* renamed from: t, reason: collision with root package name */
    @Nullable
    private final List<NetworkSettings> f16851t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final nj f16852u;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jj(@Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull nj configs) {
        super(r1, str, list, r4, configs.c(), configs.d(), configs.f(), configs.b(), -1, new C1526o2(C1526o2.a.MANUAL, configs.g().j(), configs.g().b(), -1L), new C1482i2(-1L), configs.h(), configs.k(), configs.m(), configs.l(), false, 32768, null);
        Intrinsics.checkNotNullParameter(configs, "configs");
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
        C1529o5 g4 = configs.g();
        Intrinsics.checkNotNullExpressionValue(g4, "configs.interstitialAuctionSettings");
        this.f16850s = str;
        this.f16851t = list;
        this.f16852u = configs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ jj a(jj jjVar, String str, List list, nj njVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = jjVar.f16850s;
        }
        if ((i4 & 2) != 0) {
            list = jjVar.f16851t;
        }
        if ((i4 & 4) != 0) {
            njVar = jjVar.f16852u;
        }
        return jjVar.a(str, list, njVar);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj)) {
            return false;
        }
        jj jjVar = (jj) obj;
        return Intrinsics.areEqual(this.f16850s, jjVar.f16850s) && Intrinsics.areEqual(this.f16851t, jjVar.f16851t) && Intrinsics.areEqual(this.f16852u, jjVar.f16852u);
    }

    public int hashCode() {
        String str = this.f16850s;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.f16851t;
        return ((hashCode + (list != null ? list.hashCode() : 0)) * 31) + this.f16852u.hashCode();
    }

    @Override // com.ironsource.C1571u0
    @Nullable
    public List<NetworkSettings> j() {
        return this.f16851t;
    }

    @Override // com.ironsource.C1571u0
    @Nullable
    public String o() {
        return this.f16850s;
    }

    @Nullable
    public final String s() {
        return this.f16850s;
    }

    @Nullable
    public final List<NetworkSettings> t() {
        return this.f16851t;
    }

    @NotNull
    public String toString() {
        return "InterstitialAdManagerData(userId=" + this.f16850s + ", providerList=" + this.f16851t + ", configs=" + this.f16852u + ')';
    }

    @NotNull
    public final nj u() {
        return this.f16852u;
    }

    @NotNull
    public final nj v() {
        return this.f16852u;
    }

    @NotNull
    public final jj a(@Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull nj configs) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new jj(str, list, configs);
    }
}
