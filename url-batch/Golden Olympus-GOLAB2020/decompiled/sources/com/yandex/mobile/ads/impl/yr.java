package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class yr implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final x21 f35294a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final t21 f35295b;

    public static final class a extends yr {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final e31 f35296c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull e31 multiBannerSwiper, @NotNull x21 multiBannerEventTracker, @Nullable t21 t21Var) {
            super(multiBannerEventTracker, t21Var, 0);
            Intrinsics.checkNotNullParameter(multiBannerSwiper, "multiBannerSwiper");
            Intrinsics.checkNotNullParameter(multiBannerEventTracker, "multiBannerEventTracker");
            this.f35296c = multiBannerSwiper;
        }

        @Override // com.yandex.mobile.ads.impl.yr, android.view.View.OnClickListener
        public final void onClick(@Nullable View view) {
            this.f35296c.b();
            super.onClick(view);
        }
    }

    public static final class b extends yr {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final e31 f35297c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull e31 multiBannerSwiper, @NotNull x21 multiBannerEventTracker, @Nullable t21 t21Var) {
            super(multiBannerEventTracker, t21Var, 0);
            Intrinsics.checkNotNullParameter(multiBannerSwiper, "multiBannerSwiper");
            Intrinsics.checkNotNullParameter(multiBannerEventTracker, "multiBannerEventTracker");
            this.f35297c = multiBannerSwiper;
        }

        @Override // com.yandex.mobile.ads.impl.yr, android.view.View.OnClickListener
        public final void onClick(@Nullable View view) {
            this.f35297c.a();
            super.onClick(view);
        }
    }

    private yr(x21 x21Var, t21 t21Var) {
        this.f35294a = x21Var;
        this.f35295b = t21Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View view) {
        t21 t21Var = this.f35295b;
        if (t21Var != null) {
            t21Var.a();
        }
        this.f35294a.b();
    }

    public /* synthetic */ yr(x21 x21Var, t21 t21Var, int i4) {
        this(x21Var, t21Var);
    }
}
