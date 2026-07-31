package com.yandex.mobile.ads.impl;

import android.widget.ProgressBar;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class il1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2160pd f27240a;

    public /* synthetic */ il1() {
        this(new C2160pd());
    }

    public final void a(@NotNull ProgressBar progressBar, long j4, long j5) {
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        this.f27240a.getClass();
        C2160pd.a(progressBar, j5, j4);
    }

    public il1(@NotNull C2160pd animatedProgressBarController) {
        Intrinsics.checkNotNullParameter(animatedProgressBarController, "animatedProgressBarController");
        this.f27240a = animatedProgressBarController;
    }
}
