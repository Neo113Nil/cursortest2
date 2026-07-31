package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class uy1 implements Comparable<uy1> {

    /* renamed from: b, reason: collision with root package name */
    private final int f33447b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33448c;

    public uy1(int i4, int i5) {
        this.f33447b = i4;
        this.f33448c = i5;
    }

    public final int a() {
        return this.f33448c;
    }

    public final int b() {
        return this.f33447b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(uy1 uy1Var) {
        uy1 other = uy1Var;
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.compare(this.f33447b * this.f33448c, other.f33447b * other.f33448c);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy1)) {
            return false;
        }
        uy1 uy1Var = (uy1) obj;
        return this.f33447b == uy1Var.f33447b && this.f33448c == uy1Var.f33448c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f33448c) + (Integer.hashCode(this.f33447b) * 31);
    }

    @NotNull
    public final String toString() {
        return "Size(width=" + this.f33447b + ", height=" + this.f33448c + ")";
    }
}
