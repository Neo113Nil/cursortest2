package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.xt1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class qs0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Handler f30882a = new Handler(Looper.getMainLooper());

    public final void a() {
        this.f30882a.removeCallbacksAndMessages(null);
    }

    public final void a(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f30882a.post(runnable);
    }

    public final void a(@NotNull xt1.a runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f30882a.postDelayed(runnable, 50L);
    }
}
