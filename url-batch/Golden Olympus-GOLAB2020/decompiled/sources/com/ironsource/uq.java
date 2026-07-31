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
public final class uq extends C1571u0 {

    /* renamed from: s, reason: collision with root package name */
    @Nullable
    private final String f19938s;

    /* renamed from: t, reason: collision with root package name */
    @Nullable
    private final List<NetworkSettings> f19939t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final zq f19940u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f19941v;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public uq(@Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull zq configs, boolean z4) {
        super(r1, str, list, r4, r5, r6, r7, r8, r9, r10, new C1482i2(-1L), configs.l(), configs.f(), configs.o(), configs.n(), false, 32768, null);
        C1526o2 b4;
        Intrinsics.checkNotNullParameter(configs, "configs");
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        C1529o5 k4 = configs.k();
        Intrinsics.checkNotNullExpressionValue(k4, "configs.rewardedVideoAuctionSettings");
        int g4 = configs.g();
        int h4 = configs.h();
        boolean j4 = configs.j();
        int b5 = configs.b();
        int c4 = configs.c();
        b4 = vq.b(configs, z4);
        this.f19938s = str;
        this.f19939t = list;
        this.f19940u = configs;
        this.f19941v = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ uq a(uq uqVar, String str, List list, zq zqVar, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = uqVar.f19938s;
        }
        if ((i4 & 2) != 0) {
            list = uqVar.f19939t;
        }
        if ((i4 & 4) != 0) {
            zqVar = uqVar.f19940u;
        }
        if ((i4 & 8) != 0) {
            z4 = uqVar.f19941v;
        }
        return uqVar.a(str, list, zqVar, z4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq)) {
            return false;
        }
        uq uqVar = (uq) obj;
        return Intrinsics.areEqual(this.f19938s, uqVar.f19938s) && Intrinsics.areEqual(this.f19939t, uqVar.f19939t) && Intrinsics.areEqual(this.f19940u, uqVar.f19940u) && this.f19941v == uqVar.f19941v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.f19938s;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.f19939t;
        int hashCode2 = (((hashCode + (list != null ? list.hashCode() : 0)) * 31) + this.f19940u.hashCode()) * 31;
        boolean z4 = this.f19941v;
        int i4 = z4;
        if (z4 != 0) {
            i4 = 1;
        }
        return hashCode2 + i4;
    }

    @Override // com.ironsource.C1571u0
    @Nullable
    public List<NetworkSettings> j() {
        return this.f19939t;
    }

    @Override // com.ironsource.C1571u0
    @Nullable
    public String o() {
        return this.f19938s;
    }

    @Nullable
    public final String s() {
        return this.f19938s;
    }

    @Nullable
    public final List<NetworkSettings> t() {
        return this.f19939t;
    }

    @NotNull
    public String toString() {
        return "RewardedVideoAdDataManager(userId=" + this.f19938s + ", providerList=" + this.f19939t + ", configs=" + this.f19940u + ", isManual=" + this.f19941v + ')';
    }

    @NotNull
    public final zq u() {
        return this.f19940u;
    }

    public final boolean v() {
        return this.f19941v;
    }

    @NotNull
    public final zq w() {
        return this.f19940u;
    }

    public final boolean x() {
        return this.f19941v;
    }

    @NotNull
    public final uq a(@Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull zq configs, boolean z4) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new uq(str, list, configs, z4);
    }
}
