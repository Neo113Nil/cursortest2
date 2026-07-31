package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Window;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.impl.ew1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.d1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1864d1 implements InterfaceC2007j1 {
    @Override // com.yandex.mobile.ads.impl.InterfaceC2007j1
    @Nullable
    public final InterfaceC1984i1 a(@NotNull Activity activity, @NotNull RelativeLayout rootLayout, @NotNull C2193r1 listener, @NotNull C1792a1 eventController, @NotNull Intent intent, @NotNull Window window, @Nullable C2353y0 c2353y0) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(rootLayout, "rootLayout");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(eventController, "eventController");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(window, "window");
        if (c2353y0 == null) {
            return null;
        }
        C2360y7<?> c4 = c2353y0.c();
        C2286v2 b4 = c2353y0.b();
        f61 e4 = c2353y0.e();
        av1 g4 = c2353y0.g();
        C2360y7<?> c2360y7 = c4 != null ? c4 : null;
        String str = c2360y7 != null ? (String) c2360y7.I() : null;
        int i4 = ew1.f25476l;
        ew1 a4 = ew1.a.a();
        Context context = window.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        du1 a5 = a4.a(context);
        if (g4 != null && str != null && str.length() != 0) {
            uc0 uc0Var = new uc0(c4, str, g4);
            return new C1840c1(activity, rootLayout, listener, window, uc0Var, a5, new df1(activity, uc0Var.a(), listener), new lc0(activity), new xc0(uc0Var.a().n()));
        }
        if (e4 != null) {
            return new C1936g1(activity, rootLayout, window, e4, c4, listener, eventController, b4, c2353y0.f(), a5, new lc0(activity), new xc0(b4.b()));
        }
        return null;
    }
}
