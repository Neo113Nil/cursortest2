package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f44408a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f44409b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f44410c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f44411d;

    public k1(@NotNull String name, @NotNull String logoUrl, @NotNull String packageName, @NotNull String schema) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(schema, "schema");
        this.f44408a = name;
        this.f44409b = logoUrl;
        this.f44410c = packageName;
        this.f44411d = schema;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return Intrinsics.areEqual(this.f44408a, k1Var.f44408a) && Intrinsics.areEqual(this.f44409b, k1Var.f44409b) && Intrinsics.areEqual(this.f44410c, k1Var.f44410c) && Intrinsics.areEqual(this.f44411d, k1Var.f44411d);
    }

    public final int hashCode() {
        return this.f44411d.hashCode() + j1.a(this.f44410c, j1.a(this.f44409b, this.f44408a.hashCode() * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BankAppDto(name=");
        sb.append(this.f44408a);
        sb.append(", logoUrl=");
        sb.append(this.f44409b);
        sb.append(", packageName=");
        sb.append(this.f44410c);
        sb.append(", schema=");
        return i1.a(sb, this.f44411d, ')');
    }
}
