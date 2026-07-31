package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class k02 implements InterfaceC2237t {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f27966a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<n02> f27967b;

    public k02(@NotNull String actionType, @NotNull ArrayList items) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f27966a = actionType;
        this.f27967b = items;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2237t
    @NotNull
    public final String a() {
        return this.f27966a;
    }

    @NotNull
    public final List<n02> c() {
        return this.f27967b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k02)) {
            return false;
        }
        k02 k02Var = (k02) obj;
        return Intrinsics.areEqual(this.f27966a, k02Var.f27966a) && Intrinsics.areEqual(this.f27967b, k02Var.f27967b);
    }

    public final int hashCode() {
        return this.f27967b.hashCode() + (this.f27966a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "SocialAction(actionType=" + this.f27966a + ", items=" + this.f27967b + ")";
    }
}
