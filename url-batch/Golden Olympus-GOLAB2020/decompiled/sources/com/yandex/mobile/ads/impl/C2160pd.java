package com.yandex.mobile.ads.impl;

import android.widget.ProgressBar;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.pd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2160pd {
    public static void a(@NotNull ProgressBar progressBar, long j4, long j5) {
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        progressBar.clearAnimation();
        if (j4 > 0) {
            progressBar.setMax((int) j4);
            gl1 gl1Var = new gl1(progressBar, progressBar.getProgress(), (int) j5);
            gl1Var.setDuration(200L);
            progressBar.startAnimation(gl1Var);
        }
    }
}
