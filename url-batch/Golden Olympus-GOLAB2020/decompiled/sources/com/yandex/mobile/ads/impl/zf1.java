package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zf1 {
    @NotNull
    public static yf1 a(@NotNull kg0 htmlWebViewRenderer) {
        Intrinsics.checkNotNullParameter(htmlWebViewRenderer, "htmlWebViewRenderer");
        return new yf1(htmlWebViewRenderer, new Handler(Looper.getMainLooper()), new sy1(), new RunnableC1822b7());
    }
}
