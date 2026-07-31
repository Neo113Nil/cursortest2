package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ja0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC2143oj f27608a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2158pb f27609b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final g20 f27610c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final bg2 f27611d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ge2 f27612e;

    public ja0(@NotNull InterfaceC2143oj action, @NotNull C2158pb adtuneRenderer, @NotNull g20 divKitAdtuneRenderer, @NotNull bg2 videoTracker, @NotNull ge2 videoEventUrlsTracker) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(adtuneRenderer, "adtuneRenderer");
        Intrinsics.checkNotNullParameter(divKitAdtuneRenderer, "divKitAdtuneRenderer");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        Intrinsics.checkNotNullParameter(videoEventUrlsTracker, "videoEventUrlsTracker");
        this.f27608a = action;
        this.f27609b = adtuneRenderer;
        this.f27610c = divKitAdtuneRenderer;
        this.f27611d = videoTracker;
        this.f27612e = videoEventUrlsTracker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View adtune) {
        Intrinsics.checkNotNullParameter(adtune, "adtune");
        this.f27611d.a("feedback");
        this.f27612e.a(this.f27608a.b(), null);
        InterfaceC2143oj interfaceC2143oj = this.f27608a;
        if (interfaceC2143oj instanceof C1802ab) {
            this.f27609b.a(adtune, (C1802ab) interfaceC2143oj);
        } else if (interfaceC2143oj instanceof c20) {
            g20 g20Var = this.f27610c;
            Context context = adtune.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            g20Var.a(context, (c20) interfaceC2143oj);
        }
    }
}
