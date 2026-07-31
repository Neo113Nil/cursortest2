package com.yandex.mobile.ads.impl;

import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class pf1 extends ViewPager2.i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final x21 f30432a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final t21 f30433b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f30434c;

    public pf1(@NotNull x21 multiBannerEventTracker, @Nullable t21 t21Var) {
        Intrinsics.checkNotNullParameter(multiBannerEventTracker, "multiBannerEventTracker");
        this.f30432a = multiBannerEventTracker;
        this.f30433b = t21Var;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void onPageScrollStateChanged(int i4) {
        if (i4 == 0) {
            this.f30434c = false;
        } else {
            if (i4 != 1) {
                return;
            }
            t21 t21Var = this.f30433b;
            if (t21Var != null) {
                t21Var.a();
            }
            this.f30434c = true;
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void onPageSelected(int i4) {
        if (this.f30434c) {
            this.f30432a.c();
            this.f30434c = false;
        }
    }
}
