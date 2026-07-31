package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class dm {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final xi f15901a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f15902b;

    /* renamed from: c, reason: collision with root package name */
    private final long f15903c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f15904d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f15905e;

    public dm(@NotNull xi instanceType, @NotNull String adSourceNameForEvents, long j4, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        Intrinsics.checkNotNullParameter(adSourceNameForEvents, "adSourceNameForEvents");
        this.f15901a = instanceType;
        this.f15902b = adSourceNameForEvents;
        this.f15903c = j4;
        this.f15904d = z4;
        this.f15905e = z5;
    }

    public static /* synthetic */ dm a(dm dmVar, xi xiVar, String str, long j4, boolean z4, boolean z5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            xiVar = dmVar.f15901a;
        }
        if ((i4 & 2) != 0) {
            str = dmVar.f15902b;
        }
        if ((i4 & 4) != 0) {
            j4 = dmVar.f15903c;
        }
        if ((i4 & 8) != 0) {
            z4 = dmVar.f15904d;
        }
        if ((i4 & 16) != 0) {
            z5 = dmVar.f15905e;
        }
        long j5 = j4;
        return dmVar.a(xiVar, str, j5, z4, z5);
    }

    @NotNull
    public final String b() {
        return this.f15902b;
    }

    public final long c() {
        return this.f15903c;
    }

    public final boolean d() {
        return this.f15904d;
    }

    public final boolean e() {
        return this.f15905e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm)) {
            return false;
        }
        dm dmVar = (dm) obj;
        return this.f15901a == dmVar.f15901a && Intrinsics.areEqual(this.f15902b, dmVar.f15902b) && this.f15903c == dmVar.f15903c && this.f15904d == dmVar.f15904d && this.f15905e == dmVar.f15905e;
    }

    @NotNull
    public final String f() {
        return this.f15902b;
    }

    @NotNull
    public final xi g() {
        return this.f15901a;
    }

    public final long h() {
        return this.f15903c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f15901a.hashCode() * 31) + this.f15902b.hashCode()) * 31) + Long.hashCode(this.f15903c)) * 31;
        boolean z4 = this.f15904d;
        int i4 = z4;
        if (z4 != 0) {
            i4 = 1;
        }
        int i5 = (hashCode + i4) * 31;
        boolean z5 = this.f15905e;
        return i5 + (z5 ? 1 : z5 ? 1 : 0);
    }

    public final boolean i() {
        return this.f15905e;
    }

    public final boolean j() {
        return this.f15904d;
    }

    @NotNull
    public String toString() {
        return "LoadTaskConfig(instanceType=" + this.f15901a + ", adSourceNameForEvents=" + this.f15902b + ", loadTimeoutInMills=" + this.f15903c + ", isOneFlow=" + this.f15904d + ", isMultipleAdObjects=" + this.f15905e + ')';
    }

    public /* synthetic */ dm(xi xiVar, String str, long j4, boolean z4, boolean z5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(xiVar, str, j4, z4, (i4 & 16) != 0 ? true : z5);
    }

    @NotNull
    public final dm a(@NotNull xi instanceType, @NotNull String adSourceNameForEvents, long j4, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        Intrinsics.checkNotNullParameter(adSourceNameForEvents, "adSourceNameForEvents");
        return new dm(instanceType, adSourceNameForEvents, j4, z4, z5);
    }

    @NotNull
    public final xi a() {
        return this.f15901a;
    }
}
