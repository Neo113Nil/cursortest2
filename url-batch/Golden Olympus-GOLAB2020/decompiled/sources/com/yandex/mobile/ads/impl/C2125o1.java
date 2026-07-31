package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Intent;
import android.view.Window;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.o1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2125o1 implements InterfaceC2007j1 {
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
        return new C2102n1(activity, c2353y0, new C2170q0(c2353y0.b().p().c()));
    }
}
