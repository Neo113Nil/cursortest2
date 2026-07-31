package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class t21 {

    /* renamed from: g, reason: collision with root package name */
    static final /* synthetic */ m2.h[] f32132g = {C1873da.a(t21.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0)};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final e31 f32133a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final x21 f32134b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ss0 f32135c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ao1 f32136d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private rs0 f32137e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f32138f;

    public t21(@NotNull ViewPager2 viewPager, @NotNull e31 multiBannerSwiper, @NotNull x21 multiBannerEventTracker, @NotNull ss0 jobSchedulerFactory) {
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        Intrinsics.checkNotNullParameter(multiBannerSwiper, "multiBannerSwiper");
        Intrinsics.checkNotNullParameter(multiBannerEventTracker, "multiBannerEventTracker");
        Intrinsics.checkNotNullParameter(jobSchedulerFactory, "jobSchedulerFactory");
        this.f32133a = multiBannerSwiper;
        this.f32134b = multiBannerEventTracker;
        this.f32135c = jobSchedulerFactory;
        this.f32136d = bo1.a(viewPager);
        this.f32138f = true;
    }

    public final void a() {
        b();
        this.f32138f = false;
    }

    public final void b() {
        rs0 rs0Var = this.f32137e;
        if (rs0Var != null) {
            rs0Var.a();
        }
        this.f32137e = null;
    }

    public final void a(long j4) {
        Unit unit;
        if (j4 <= 0 || !this.f32138f) {
            return;
        }
        b();
        ViewPager2 viewPager2 = (ViewPager2) this.f32136d.getValue(this, f32132g[0]);
        if (viewPager2 != null) {
            u21 u21Var = new u21(viewPager2, this.f32133a, this.f32134b);
            this.f32135c.getClass();
            rs0 rs0Var = new rs0(new Handler(Looper.getMainLooper()));
            this.f32137e = rs0Var;
            rs0Var.a(j4, u21Var);
            unit = Unit.f41027a;
        } else {
            unit = null;
        }
        if (unit == null) {
            b();
            this.f32138f = false;
        }
    }
}
