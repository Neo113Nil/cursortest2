package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class xj {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f20322a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f20323b;

    public xj(@NotNull String advId, @NotNull String advIdType) {
        Intrinsics.checkNotNullParameter(advId, "advId");
        Intrinsics.checkNotNullParameter(advIdType, "advIdType");
        this.f20322a = advId;
        this.f20323b = advIdType;
    }

    public static /* synthetic */ xj a(xj xjVar, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = xjVar.f20322a;
        }
        if ((i4 & 2) != 0) {
            str2 = xjVar.f20323b;
        }
        return xjVar.a(str, str2);
    }

    @NotNull
    public final String b() {
        return this.f20323b;
    }

    @NotNull
    public final String c() {
        return this.f20322a;
    }

    @NotNull
    public final String d() {
        return this.f20323b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj)) {
            return false;
        }
        xj xjVar = (xj) obj;
        return Intrinsics.areEqual(this.f20322a, xjVar.f20322a) && Intrinsics.areEqual(this.f20323b, xjVar.f20323b);
    }

    public int hashCode() {
        return (this.f20322a.hashCode() * 31) + this.f20323b.hashCode();
    }

    @NotNull
    public String toString() {
        return "IronSourceAdvId(advId=" + this.f20322a + ", advIdType=" + this.f20323b + ')';
    }

    @NotNull
    public final xj a(@NotNull String advId, @NotNull String advIdType) {
        Intrinsics.checkNotNullParameter(advId, "advId");
        Intrinsics.checkNotNullParameter(advIdType, "advIdType");
        return new xj(advId, advIdType);
    }

    @NotNull
    public final String a() {
        return this.f20322a;
    }
}
