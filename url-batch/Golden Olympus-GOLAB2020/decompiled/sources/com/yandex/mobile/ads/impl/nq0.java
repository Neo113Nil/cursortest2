package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class nq0<V extends ViewGroup> {

    /* renamed from: a, reason: collision with root package name */
    private final int f29727a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Class<V> f29728b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final q00<V> f29729c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final r00 f29730d;

    public nq0(int i4, @NotNull nq designComponentBinder, @NotNull r00 designConstraint) {
        Intrinsics.checkNotNullParameter(ExtendedNativeAdView.class, "layoutViewClass");
        Intrinsics.checkNotNullParameter(designComponentBinder, "designComponentBinder");
        Intrinsics.checkNotNullParameter(designConstraint, "designConstraint");
        this.f29727a = i4;
        this.f29728b = ExtendedNativeAdView.class;
        this.f29729c = designComponentBinder;
        this.f29730d = designConstraint;
    }

    @NotNull
    public final q00<V> a() {
        return this.f29729c;
    }

    @NotNull
    public final r00 b() {
        return this.f29730d;
    }

    public final int c() {
        return this.f29727a;
    }

    @NotNull
    public final Class<V> d() {
        return this.f29728b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq0)) {
            return false;
        }
        nq0 nq0Var = (nq0) obj;
        return this.f29727a == nq0Var.f29727a && Intrinsics.areEqual(this.f29728b, nq0Var.f29728b) && Intrinsics.areEqual(this.f29729c, nq0Var.f29729c) && Intrinsics.areEqual(this.f29730d, nq0Var.f29730d);
    }

    public final int hashCode() {
        return this.f29730d.hashCode() + ((this.f29729c.hashCode() + ((this.f29728b.hashCode() + (Integer.hashCode(this.f29727a) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "LayoutDesign(layoutId=" + this.f29727a + ", layoutViewClass=" + this.f29728b + ", designComponentBinder=" + this.f29729c + ", designConstraint=" + this.f29730d + ")";
    }
}
