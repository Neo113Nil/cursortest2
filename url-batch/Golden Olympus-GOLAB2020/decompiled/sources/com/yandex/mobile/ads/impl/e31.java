package com.yandex.mobile.ads.impl;

import androidx.viewpager2.widget.ViewPager2;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e31 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final WeakReference<ViewPager2> f25084a;

    public e31(@NotNull ViewPager2 viewPager) {
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        this.f25084a = new WeakReference<>(viewPager);
    }

    public final void a() {
        ViewPager2 viewPager2 = this.f25084a.get();
        if (viewPager2 != null) {
            viewPager2.l(viewPager2.getCurrentItem() + 1, true);
        }
    }

    public final void b() {
        ViewPager2 viewPager2 = this.f25084a.get();
        if (viewPager2 != null) {
            viewPager2.l(viewPager2.getCurrentItem() - 1, true);
        }
    }
}
