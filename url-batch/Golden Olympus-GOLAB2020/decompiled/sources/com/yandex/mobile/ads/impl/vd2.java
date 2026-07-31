package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class vd2 implements jo {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mb1 f33586a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final hu f33587b;

    public vd2(@NotNull mb1 nativeVideoView, @Nullable hu huVar) {
        Intrinsics.checkNotNullParameter(nativeVideoView, "nativeVideoView");
        this.f33586a = nativeVideoView;
        this.f33587b = huVar;
    }

    @Override // com.yandex.mobile.ads.impl.jo
    @SuppressLint({"ClickableViewAccessibility"})
    public final void a(@NotNull dr0 link, @NotNull lo clickListenerCreator) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(clickListenerCreator, "clickListenerCreator");
        Context context = this.f33586a.getContext();
        ud2 ud2Var = new ud2(link, clickListenerCreator, this.f33587b);
        Intrinsics.checkNotNull(context);
        co coVar = new co(context, ud2Var);
        mb1 mb1Var = this.f33586a;
        mb1Var.setOnTouchListener(coVar);
        mb1Var.setOnClickListener(coVar);
        ImageView a4 = this.f33586a.b().a();
        if (a4 != null) {
            a4.setOnTouchListener(coVar);
            a4.setOnClickListener(coVar);
        }
    }
}
