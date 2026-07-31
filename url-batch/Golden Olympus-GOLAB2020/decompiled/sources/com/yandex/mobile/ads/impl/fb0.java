package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fb0 implements tr {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ep f25735a;

    public fb0(@NotNull ep closeButtonController) {
        Intrinsics.checkNotNullParameter(closeButtonController, "closeButtonController");
        this.f25735a = closeButtonController;
    }

    @Override // com.yandex.mobile.ads.impl.tr
    @NotNull
    public final RelativeLayout a(@NotNull ed0 contentView, @NotNull C2360y7 adResponse) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Context context = contentView.getContext();
        Intrinsics.checkNotNull(context);
        Intrinsics.checkNotNullParameter(context, "context");
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setBackgroundColor(0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        RelativeLayout.LayoutParams a4 = C2314w7.a(context, (C2360y7<?>) adResponse);
        int a5 = lh2.a(context, 64.0f);
        int i4 = a4.width + a5;
        Intrinsics.checkNotNullParameter(context, "context");
        a4.width = Math.min(i4, context.getResources().getDisplayMetrics().widthPixels);
        a4.height = Math.min(a4.height + a5, lh2.c(context));
        relativeLayout.setLayoutParams(a4);
        relativeLayout.addView(contentView, C2314w7.a(context, (C2360y7<?>) adResponse));
        relativeLayout.addView(this.f25735a.d(), C2314w7.a(context, contentView));
        return relativeLayout;
    }

    @Override // com.yandex.mobile.ads.impl.tr
    public final void b() {
        this.f25735a.b();
    }

    @Override // com.yandex.mobile.ads.impl.tr
    public final void c() {
        this.f25735a.c();
    }

    @Override // com.yandex.mobile.ads.impl.tr
    public final void d() {
        this.f25735a.invalidate();
    }

    @Override // com.yandex.mobile.ads.impl.tr
    public final void a() {
        this.f25735a.a();
    }

    @Override // com.yandex.mobile.ads.impl.tr
    public final void a(boolean z4) {
        this.f25735a.a(z4);
    }

    @Override // com.yandex.mobile.ads.impl.tr
    public final void a(@NotNull RelativeLayout rootLayout) {
        Intrinsics.checkNotNullParameter(rootLayout, "rootLayout");
        rootLayout.setBackground(C2291v7.f33538a);
    }
}
