package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import b2.AbstractC1372b;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class u21 extends hn {

    /* renamed from: g, reason: collision with root package name */
    static final /* synthetic */ m2.h[] f32788g = {C1873da.a(u21.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0)};

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final e31 f32789c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final x21 f32790d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ao1 f32791e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private a f32792f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f32793b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f32794c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ a[] f32795d;

        static {
            a aVar = new a(0, "LEFT");
            f32793b = aVar;
            a aVar2 = new a(1, "RIGHT");
            f32794c = aVar2;
            a[] aVarArr = {aVar, aVar2};
            f32795d = aVarArr;
            AbstractC1372b.a(aVarArr);
        }

        private a(int i4, String str) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f32795d.clone();
        }
    }

    public u21(@NotNull ViewPager2 viewPager, @NotNull e31 multiBannerSwiper, @NotNull x21 multiBannerEventTracker) {
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        Intrinsics.checkNotNullParameter(multiBannerSwiper, "multiBannerSwiper");
        Intrinsics.checkNotNullParameter(multiBannerEventTracker, "multiBannerEventTracker");
        this.f32789c = multiBannerSwiper;
        this.f32790d = multiBannerEventTracker;
        this.f32791e = bo1.a(viewPager);
        this.f32792f = a.f32793b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Unit unit;
        ViewPager2 viewPager2 = (ViewPager2) this.f32791e.getValue(this, f32788g[0]);
        if (viewPager2 != null) {
            if (lh2.b(viewPager2) > 0) {
                RecyclerView.h adapter = viewPager2.getAdapter();
                int itemCount = adapter != null ? adapter.getItemCount() : 0;
                if (itemCount != 0) {
                    int currentItem = viewPager2.getCurrentItem();
                    if (currentItem == 0) {
                        this.f32792f = a.f32793b;
                    } else if (currentItem == itemCount - 1) {
                        this.f32792f = a.f32794c;
                    }
                } else {
                    a();
                }
                int ordinal = this.f32792f.ordinal();
                if (ordinal == 0) {
                    this.f32789c.a();
                } else if (ordinal == 1) {
                    this.f32789c.b();
                }
                this.f32790d.a();
            }
            unit = Unit.f41027a;
        } else {
            unit = null;
        }
        if (unit == null) {
            a();
        }
    }
}
