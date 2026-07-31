package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import android.content.Context;
import android.view.ViewGroup;
import android.view.Window;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.kb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2041kb {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f28144a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1994ib f28145b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1922fb f28146c;

    public C2041kb(@NotNull C2089mb adtuneOptOutWebView, @NotNull Context context, @NotNull C1994ib adtuneOptOutContainerCreator, @NotNull C1922fb adtuneControlsConfigurator) {
        Intrinsics.checkNotNullParameter(adtuneOptOutWebView, "adtuneOptOutWebView");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adtuneOptOutContainerCreator, "adtuneOptOutContainerCreator");
        Intrinsics.checkNotNullParameter(adtuneControlsConfigurator, "adtuneControlsConfigurator");
        this.f28144a = context;
        this.f28145b = adtuneOptOutContainerCreator;
        this.f28146c = adtuneControlsConfigurator;
    }

    @NotNull
    public final Dialog a() {
        Dialog dialog = new Dialog(this.f28144a, R.style.MonetizationAdsInternal_BottomAdtuneDialog);
        ViewGroup a4 = this.f28145b.a();
        this.f28146c.a(a4, dialog);
        dialog.setContentView(a4);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        return dialog;
    }
}
