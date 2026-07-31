package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Intent;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.u0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2261u0 implements InterfaceC2007j1 {
    @Override // com.yandex.mobile.ads.impl.InterfaceC2007j1
    @Nullable
    public final InterfaceC1984i1 a(@NotNull Activity context, @NotNull RelativeLayout rootLayout, @NotNull C2193r1 listener, @NotNull C1792a1 eventController, @NotNull Intent intent, @NotNull Window window, @Nullable C2353y0 c2353y0) {
        Intrinsics.checkNotNullParameter(context, "activity");
        Intrinsics.checkNotNullParameter(rootLayout, "rootLayout");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(eventController, "eventController");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(window, "window");
        String stringExtra = intent.getStringExtra("extra_browser_url");
        if (stringExtra == null || stringExtra.length() <= 0) {
            return null;
        }
        try {
            C2126o2 c2126o2 = new C2126o2(context);
            Intrinsics.checkNotNullParameter(context, "context");
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setId(1);
            linearLayout.setOrientation(0);
            linearLayout.setBackgroundColor(C2154p7.b());
            return new C2238t0(context, rootLayout, listener, window, stringExtra, c2126o2, linearLayout, C2199r7.c(context), C2199r7.d(context), new n82(new m82()));
        } catch (ij2 unused) {
            return null;
        }
    }
}
