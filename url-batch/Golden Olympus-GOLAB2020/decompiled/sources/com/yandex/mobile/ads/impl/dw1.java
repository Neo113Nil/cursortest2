package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class dw1 implements or1 {

    /* renamed from: a, reason: collision with root package name */
    private final int f24985a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f24986b;

    public dw1(int i4, @NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f24985a = i4;
        this.f24986b = type;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw1)) {
            return false;
        }
        dw1 dw1Var = (dw1) obj;
        return this.f24985a == dw1Var.f24985a && Intrinsics.areEqual(this.f24986b, dw1Var.f24986b);
    }

    @Override // com.yandex.mobile.ads.impl.or1
    public final int getAmount() {
        return this.f24985a;
    }

    @Override // com.yandex.mobile.ads.impl.or1
    @NotNull
    public final String getType() {
        return this.f24986b;
    }

    public final int hashCode() {
        return this.f24986b.hashCode() + (Integer.hashCode(this.f24985a) * 31);
    }

    @NotNull
    public final String toString() {
        return "SdkReward(amount=" + this.f24985a + ", type=" + this.f24986b + ")";
    }
}
