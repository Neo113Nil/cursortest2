package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class gu {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final nl1 f26295a;

    public /* synthetic */ gu() {
        this(new nl1());
    }

    public final void a(@NotNull TextView countDownProgress, long j4, long j5) {
        Intrinsics.checkNotNullParameter(countDownProgress, "countDownProgress");
        this.f26295a.getClass();
        countDownProgress.setText(nl1.a(j4 - j5));
    }

    public gu(@NotNull nl1 progressDisplayTimeFormatter) {
        Intrinsics.checkNotNullParameter(progressDisplayTimeFormatter, "progressDisplayTimeFormatter");
        this.f26295a = progressDisplayTimeFormatter;
    }
}
