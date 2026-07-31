package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class h6 extends C1571u0 {

    /* renamed from: s, reason: collision with root package name */
    @Nullable
    private final String f16569s;

    /* renamed from: t, reason: collision with root package name */
    @Nullable
    private final List<NetworkSettings> f16570t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final u6 f16571u;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h6(@Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull u6 configs) {
        super(r1, str, list, r4, r5, r6, r7, r8, -1, r10, new C1482i2(configs.j()), configs.e(), configs.l(), configs.n(), configs.m(), false, 32768, null);
        C1526o2 b4;
        Intrinsics.checkNotNullParameter(configs, "configs");
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        C1529o5 d4 = configs.d();
        Intrinsics.checkNotNullExpressionValue(d4, "configs.bannerAuctionSettings");
        int a4 = configs.a();
        int b5 = (int) (configs.b() / 1000);
        boolean c4 = configs.c();
        int f4 = configs.f();
        b4 = i6.b(configs);
        this.f16569s = str;
        this.f16570t = list;
        this.f16571u = configs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ h6 a(h6 h6Var, String str, List list, u6 u6Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = h6Var.f16569s;
        }
        if ((i4 & 2) != 0) {
            list = h6Var.f16570t;
        }
        if ((i4 & 4) != 0) {
            u6Var = h6Var.f16571u;
        }
        return h6Var.a(str, list, u6Var);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6)) {
            return false;
        }
        h6 h6Var = (h6) obj;
        return Intrinsics.areEqual(this.f16569s, h6Var.f16569s) && Intrinsics.areEqual(this.f16570t, h6Var.f16570t) && Intrinsics.areEqual(this.f16571u, h6Var.f16571u);
    }

    public int hashCode() {
        String str = this.f16569s;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.f16570t;
        return ((hashCode + (list != null ? list.hashCode() : 0)) * 31) + this.f16571u.hashCode();
    }

    @Override // com.ironsource.C1571u0
    @Nullable
    public List<NetworkSettings> j() {
        return this.f16570t;
    }

    @Override // com.ironsource.C1571u0
    @Nullable
    public String o() {
        return this.f16569s;
    }

    @Nullable
    public final String s() {
        return this.f16569s;
    }

    @Nullable
    public final List<NetworkSettings> t() {
        return this.f16570t;
    }

    @NotNull
    public String toString() {
        return "BannerAdManagerData(userId=" + this.f16569s + ", providerList=" + this.f16570t + ", configs=" + this.f16571u + ')';
    }

    @NotNull
    public final u6 u() {
        return this.f16571u;
    }

    @NotNull
    public final u6 v() {
        return this.f16571u;
    }

    @NotNull
    public final h6 a(@Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull u6 configs) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new h6(str, list, configs);
    }
}
