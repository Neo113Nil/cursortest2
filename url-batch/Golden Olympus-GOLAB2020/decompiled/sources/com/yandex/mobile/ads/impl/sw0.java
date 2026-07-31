package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.monetization.ads.nativeads.CustomizableMediaView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class sw0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f32057a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final dj0 f32058b;

    public /* synthetic */ sw0(C2360y7 c2360y7) {
        this(c2360y7, new dj0());
    }

    @NotNull
    public final ov1 a(@NotNull CustomizableMediaView mediaView, @NotNull zi0 imageProvider, @NotNull ww0 mediaViewRenderController) {
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(mediaViewRenderController, "mediaViewRenderController");
        ImageView imageView = new ImageView(mediaView.getContext());
        this.f32058b.getClass();
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Context context = mediaView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (!n80.a(context, m80.f28942e)) {
            mediaView.removeAllViews();
        }
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        mediaView.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        mj0 mj0Var = new mj0(imageView, imageProvider, this.f32057a);
        return new ov1(mediaView, mj0Var, mediaViewRenderController, new lg2(mj0Var));
    }

    public sw0(@NotNull C2360y7<?> adResponse, @NotNull dj0 imageSubViewBinder) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(imageSubViewBinder, "imageSubViewBinder");
        this.f32057a = adResponse;
        this.f32058b = imageSubViewBinder;
    }
}
