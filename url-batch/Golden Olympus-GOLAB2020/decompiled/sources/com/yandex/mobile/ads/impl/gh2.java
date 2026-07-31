package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import com.ironsource.b9;
import com.monetization.ads.nativeads.CustomizableMediaView;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class gh2 {
    @NotNull
    public static final ch2 a(@NotNull CustomizableMediaView customizableMediaView, @NotNull String mediaType) {
        Intrinsics.checkNotNullParameter(customizableMediaView, "<this>");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        ViewGroup.LayoutParams layoutParams = customizableMediaView.getLayoutParams();
        Integer valueOf = layoutParams != null ? Integer.valueOf(t72.a(layoutParams.width)) : null;
        ViewGroup.LayoutParams layoutParams2 = customizableMediaView.getLayoutParams();
        Integer valueOf2 = layoutParams2 != null ? Integer.valueOf(t72.a(layoutParams2.height)) : null;
        int a4 = t72.a(View.MeasureSpec.getSize(customizableMediaView.getWidthMeasureSpec()));
        int a5 = t72.a(View.MeasureSpec.getSize(customizableMediaView.getHeightMeasureSpec()));
        int mode = View.MeasureSpec.getMode(customizableMediaView.getWidthMeasureSpec());
        du0 du0Var = mode != Integer.MIN_VALUE ? mode != 0 ? mode != 1073741824 ? du0.f24763d : du0.f24761b : du0.f24763d : du0.f24762c;
        int mode2 = View.MeasureSpec.getMode(customizableMediaView.getHeightMeasureSpec());
        return new ch2(new bh2(t72.a(customizableMediaView.getWidth()), t72.a(customizableMediaView.getHeight())), new vq0(valueOf, valueOf2), new bu0(new cu0(a4, du0Var), new cu0(a5, mode2 != Integer.MIN_VALUE ? mode2 != 0 ? mode2 != 1073741824 ? du0.f24763d : du0.f24761b : du0.f24763d : du0.f24762c)), MapsKt.mapOf(TuplesKt.to("asset", b9.h.f15446I0), TuplesKt.to("media_type", mediaType)));
    }
}
