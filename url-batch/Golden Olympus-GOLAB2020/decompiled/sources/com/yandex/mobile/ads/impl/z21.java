package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class z21 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final zi0 f35445a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f35446b;

    private static final class a implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(@Nullable View view) {
            ViewParent parent = view != null ? view.getParent() : null;
            ViewParent parent2 = parent != null ? parent.getParent() : null;
            ViewPager2 viewPager2 = parent2 instanceof ViewPager2 ? (ViewPager2) parent2 : null;
            if (viewPager2 != null) {
                viewPager2.callOnClick();
            }
        }
    }

    public z21(@NotNull zi0 imageProvider, @NotNull C2360y7<?> adResponse) {
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f35445a = imageProvider;
        this.f35446b = adResponse;
    }

    @NotNull
    public final y21 a(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNull(context);
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setOnClickListener(new a());
        return new y21(imageView, new mj0(imageView, this.f35445a, this.f35446b));
    }
}
