package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.v1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1578v1 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f19984a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<NetworkSettings> f19985b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final rk f19986c;

    /* JADX WARN: Multi-variable type inference failed */
    public C1578v1(@Nullable String str, @NotNull List<? extends NetworkSettings> providerList, @NotNull rk publisherDataHolder) {
        Intrinsics.checkNotNullParameter(providerList, "providerList");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        this.f19984a = str;
        this.f19985b = providerList;
        this.f19986c = publisherDataHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C1578v1 a(C1578v1 c1578v1, String str, List list, rk rkVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = c1578v1.f19984a;
        }
        if ((i4 & 2) != 0) {
            list = c1578v1.f19985b;
        }
        if ((i4 & 4) != 0) {
            rkVar = c1578v1.f19986c;
        }
        return c1578v1.a(str, list, rkVar);
    }

    @NotNull
    public final List<NetworkSettings> b() {
        return this.f19985b;
    }

    @NotNull
    public final rk c() {
        return this.f19986c;
    }

    @NotNull
    public final List<NetworkSettings> d() {
        return this.f19985b;
    }

    @NotNull
    public final rk e() {
        return this.f19986c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1578v1)) {
            return false;
        }
        C1578v1 c1578v1 = (C1578v1) obj;
        return Intrinsics.areEqual(this.f19984a, c1578v1.f19984a) && Intrinsics.areEqual(this.f19985b, c1578v1.f19985b) && Intrinsics.areEqual(this.f19986c, c1578v1.f19986c);
    }

    @Nullable
    public final String f() {
        return this.f19984a;
    }

    public int hashCode() {
        String str = this.f19984a;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.f19985b.hashCode()) * 31) + this.f19986c.hashCode();
    }

    @NotNull
    public String toString() {
        return "AdUnitCommonData(userId=" + this.f19984a + ", providerList=" + this.f19985b + ", publisherDataHolder=" + this.f19986c + ')';
    }

    @NotNull
    public final C1578v1 a(@Nullable String str, @NotNull List<? extends NetworkSettings> providerList, @NotNull rk publisherDataHolder) {
        Intrinsics.checkNotNullParameter(providerList, "providerList");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        return new C1578v1(str, providerList, publisherDataHolder);
    }

    @Nullable
    public final String a() {
        return this.f19984a;
    }
}
