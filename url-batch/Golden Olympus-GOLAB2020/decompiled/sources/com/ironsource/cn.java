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
public final class cn extends C1571u0 {

    /* renamed from: s, reason: collision with root package name */
    @Nullable
    private final String f15782s;

    /* renamed from: t, reason: collision with root package name */
    @Nullable
    private final List<NetworkSettings> f15783t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final sm f15784u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public cn(@Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull sm configs) {
        super(IronSource.AD_UNIT.NATIVE_AD, str, list, configs.d(), configs.b(), (int) (configs.c() / 1000), configs.a(), configs.f(), -1, new C1526o2(C1526o2.a.MANUAL, configs.d().j(), configs.d().b(), -1L), new C1482i2(-1L), configs.h(), configs.i(), configs.k(), configs.j(), false, 32768, null);
        Intrinsics.checkNotNullParameter(configs, "configs");
        this.f15782s = str;
        this.f15783t = list;
        this.f15784u = configs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ cn a(cn cnVar, String str, List list, sm smVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = cnVar.f15782s;
        }
        if ((i4 & 2) != 0) {
            list = cnVar.f15783t;
        }
        if ((i4 & 4) != 0) {
            smVar = cnVar.f15784u;
        }
        return cnVar.a(str, list, smVar);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn)) {
            return false;
        }
        cn cnVar = (cn) obj;
        return Intrinsics.areEqual(this.f15782s, cnVar.f15782s) && Intrinsics.areEqual(this.f15783t, cnVar.f15783t) && Intrinsics.areEqual(this.f15784u, cnVar.f15784u);
    }

    public int hashCode() {
        String str = this.f15782s;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.f15783t;
        return ((hashCode + (list != null ? list.hashCode() : 0)) * 31) + this.f15784u.hashCode();
    }

    @Override // com.ironsource.C1571u0
    @Nullable
    public List<NetworkSettings> j() {
        return this.f15783t;
    }

    @Override // com.ironsource.C1571u0
    @Nullable
    public String o() {
        return this.f15782s;
    }

    @Nullable
    public final String s() {
        return this.f15782s;
    }

    @Nullable
    public final List<NetworkSettings> t() {
        return this.f15783t;
    }

    @NotNull
    public String toString() {
        return "NativeAdManagerData(userId=" + this.f15782s + ", providerList=" + this.f15783t + ", configs=" + this.f15784u + ')';
    }

    @NotNull
    public final sm u() {
        return this.f15784u;
    }

    @NotNull
    public final sm v() {
        return this.f15784u;
    }

    @NotNull
    public final cn a(@Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull sm configs) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new cn(str, list, configs);
    }
}
