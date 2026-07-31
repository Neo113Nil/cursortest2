package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.monetization.ads.nativeads.view.pager.MultiBannerControlsContainer;
import com.yandex.mobile.ads.impl.yr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class uw0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d31 f33432a = new d31();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final w21 f33433b = new w21();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final v21 f33434c = new v21();

    @NotNull
    public final qv1 a(@NotNull C2360y7 adResponse, @NotNull C2286v2 adConfiguration, @NotNull CustomizableMediaView mediaView, @NotNull zi0 imageProvider, @NotNull List imageValues, @NotNull ww0 mediaViewRenderController, @Nullable nx1 nx1Var) {
        t21 t21Var;
        Long b4;
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(imageValues, "imageValues");
        Intrinsics.checkNotNullParameter(mediaViewRenderController, "mediaViewRenderController");
        Context context = mediaView.getContext();
        ViewPager2 viewPager = new ViewPager2(context);
        Intrinsics.checkNotNull(context);
        x21 x21Var = new x21(context, adResponse, adConfiguration);
        e31 e31Var = new e31(viewPager);
        long longValue = (nx1Var == null || (b4 = nx1Var.b()) == null) ? 0L : b4.longValue();
        if (longValue > 0) {
            t21Var = new t21(viewPager, e31Var, x21Var, new ss0());
            viewPager.addOnAttachStateChangeListener(new a31(t21Var, longValue));
        } else {
            t21Var = null;
        }
        viewPager.h(new pf1(x21Var, t21Var));
        MultiBannerControlsContainer a4 = this.f33433b.a(context);
        if (a4 != null) {
            a4.a(viewPager);
            a4.setOnClickLeftButtonListener(new yr.a(e31Var, x21Var, t21Var));
            a4.setOnClickRightButtonListener(new yr.b(e31Var, x21Var, t21Var));
        }
        ExtendedViewContainer container = this.f33434c.a(context, imageValues);
        this.f33432a.getClass();
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        Context context2 = mediaView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (!n80.a(context2, m80.f28942e)) {
            mediaView.removeAllViews();
        }
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        container.addView(viewPager, layoutParams);
        if (a4 != null) {
            container.addView(a4, layoutParams);
        }
        mediaView.addView(container, layoutParams);
        f31 f31Var = new f31(viewPager, imageProvider, adConfiguration.p().c(), adResponse);
        return new qv1(mediaView, f31Var, mediaViewRenderController, new lg2(f31Var));
    }
}
