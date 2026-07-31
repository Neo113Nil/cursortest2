package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.ViewGroup;
import android.view.Window;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.gb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1946gb {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f26087a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1874db f26088b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1922fb f26089c;

    public C1946gb(@NotNull Activity context, @NotNull C2226sb adtuneWebView, @NotNull C1874db adtuneContainerCreator, @NotNull C1922fb adtuneControlsConfigurator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adtuneWebView, "adtuneWebView");
        Intrinsics.checkNotNullParameter(adtuneContainerCreator, "adtuneContainerCreator");
        Intrinsics.checkNotNullParameter(adtuneControlsConfigurator, "adtuneControlsConfigurator");
        this.f26087a = context;
        this.f26088b = adtuneContainerCreator;
        this.f26089c = adtuneControlsConfigurator;
    }

    @NotNull
    public final Dialog a() {
        Dialog dialog = new Dialog(this.f26087a, R.style.MonetizationAdsInternal_BottomAdtuneDialog);
        ViewGroup a4 = this.f26088b.a();
        this.f26089c.a(a4, dialog);
        dialog.setContentView(a4);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        return dialog;
    }
}
