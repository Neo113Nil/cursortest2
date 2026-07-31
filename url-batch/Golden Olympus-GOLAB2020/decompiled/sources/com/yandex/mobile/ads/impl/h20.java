package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class h20 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final i20 f26531a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f26532b;

    public h20(@NotNull i20 type, @NotNull String assetName) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        this.f26531a = type;
        this.f26532b = assetName;
    }

    @NotNull
    public final String a() {
        return this.f26532b;
    }

    @NotNull
    public final i20 b() {
        return this.f26531a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h20)) {
            return false;
        }
        h20 h20Var = (h20) obj;
        return this.f26531a == h20Var.f26531a && Intrinsics.areEqual(this.f26532b, h20Var.f26532b);
    }

    public final int hashCode() {
        return this.f26532b.hashCode() + (this.f26531a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "DivKitAsset(type=" + this.f26531a + ", assetName=" + this.f26532b + ")";
    }
}
