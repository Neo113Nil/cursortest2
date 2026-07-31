package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class nh2 {

    public interface a {
        boolean b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return ((a) view).b() && view.hasWindowFocus() && !lh2.d(view);
    }
}
