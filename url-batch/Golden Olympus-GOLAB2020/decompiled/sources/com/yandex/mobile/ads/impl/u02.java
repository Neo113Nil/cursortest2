package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class u02 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final w02 f32760a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final n82 f32761b;

    public u02(@NotNull w02 socialAdInfo, @NotNull n82 urlViewerLauncher) {
        Intrinsics.checkNotNullParameter(socialAdInfo, "socialAdInfo");
        Intrinsics.checkNotNullParameter(urlViewerLauncher, "urlViewerLauncher");
        this.f32760a = socialAdInfo;
        this.f32761b = urlViewerLauncher;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View v4) {
        Intrinsics.checkNotNullParameter(v4, "v");
        Context context = v4.getContext();
        String a4 = this.f32760a.a();
        n82 n82Var = this.f32761b;
        Intrinsics.checkNotNull(context);
        n82Var.a(context, a4);
    }
}
