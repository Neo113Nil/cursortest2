package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class qc0 implements tr {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ep f30727a;

    public qc0(@NotNull ep closeButtonController) {
        Intrinsics.checkNotNullParameter(closeButtonController, "closeButtonController");
        this.f30727a = closeButtonController;
    }

    @Override // com.yandex.mobile.ads.impl.tr
    @NotNull
    public final RelativeLayout a(@NotNull ed0 contentView, @NotNull C2360y7 adResponse) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Context context = contentView.getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        Intrinsics.checkNotNull(context);
        Intrinsics.checkNotNullParameter(context, "context");
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setBackgroundColor(0);
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.addView(contentView, new RelativeLayout.LayoutParams(-1, -1));
        relativeLayout.addView(this.f30727a.d(), C2314w7.a(context, contentView));
        return relativeLayout;
    }

    @Override // com.yandex.mobile.ads.impl.tr
    public final void b() {
        this.f30727a.b();
    }

    @Override // com.yandex.mobile.ads.impl.tr
    public final void c() {
        this.f30727a.c();
    }

    @Override // com.yandex.mobile.ads.impl.tr
    public final void d() {
        this.f30727a.invalidate();
    }

    @Override // com.yandex.mobile.ads.impl.tr
    public final void a() {
        this.f30727a.a();
    }

    @Override // com.yandex.mobile.ads.impl.tr
    public final void a(boolean z4) {
        this.f30727a.a(z4);
    }

    @Override // com.yandex.mobile.ads.impl.tr
    public final void a(@NotNull RelativeLayout rootLayout) {
        Intrinsics.checkNotNullParameter(rootLayout, "rootLayout");
        rootLayout.setBackground(C2291v7.f33539b);
    }
}
