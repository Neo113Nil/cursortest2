package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.TextureView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class pb1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1791a0 f30402a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final qe2 f30403b;

    public /* synthetic */ pb1() {
        this(new C1791a0(), new qe2());
    }

    @NotNull
    public final mb1 a(@NotNull Context context, @NotNull me2 videoOptions, @NotNull iv0 customControls, @Nullable ab2 ab2Var, int i4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoOptions, "videoOptions");
        Intrinsics.checkNotNullParameter(customControls, "customControls");
        TextureView textureView = new TextureView(context);
        textureView.setVisibility(8);
        ea1 a4 = this.f30402a.a(context, videoOptions, customControls, i4);
        a4.setVisibility(8);
        pe2 a5 = this.f30403b.a(context, ab2Var);
        a5.setVisibility(8);
        mb1 mb1Var = new mb1(context, a5, textureView, a4);
        mb1Var.addView(a5);
        mb1Var.addView(textureView);
        mb1Var.addView(a4);
        mb1Var.setTag(jh2.a("native_video_view"));
        return mb1Var;
    }

    public pb1(@NotNull C1791a0 actionViewsContainerCreator, @NotNull qe2 placeholderViewCreator) {
        Intrinsics.checkNotNullParameter(actionViewsContainerCreator, "actionViewsContainerCreator");
        Intrinsics.checkNotNullParameter(placeholderViewCreator, "placeholderViewCreator");
        this.f30402a = actionViewsContainerCreator;
        this.f30403b = placeholderViewCreator;
    }
}
