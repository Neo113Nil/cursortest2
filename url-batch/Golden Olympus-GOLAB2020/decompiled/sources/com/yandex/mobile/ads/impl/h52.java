package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class h52 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f26566a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final bu1 f26567b;

    public h52(@Nullable String str, @Nullable bu1 bu1Var) {
        this.f26566a = str;
        this.f26567b = bu1Var;
    }

    @Nullable
    public final String a() {
        return this.f26566a;
    }

    @Nullable
    public final bu1 b() {
        return this.f26567b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h52)) {
            return false;
        }
        h52 h52Var = (h52) obj;
        return Intrinsics.areEqual(this.f26566a, h52Var.f26566a) && this.f26567b == h52Var.f26567b;
    }

    public final int hashCode() {
        String str = this.f26566a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        bu1 bu1Var = this.f26567b;
        return hashCode + (bu1Var != null ? bu1Var.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "TokenResult(bidderToken=" + this.f26566a + ", stubReason=" + this.f26567b + ")";
    }
}
