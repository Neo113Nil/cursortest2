package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class sr1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c52 f31926a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final e42 f31927b;

    public /* synthetic */ sr1(d52 d52Var) {
        this(d52Var, new e42());
    }

    public final void a(@NotNull View timerView, long j4, long j5) {
        Intrinsics.checkNotNullParameter(timerView, "timerView");
        timerView.setVisibility(0);
        TextView a4 = this.f31926a.a(timerView);
        if (a4 != null) {
            this.f31927b.getClass();
            e42.a(a4, j4, j5);
        }
    }

    public sr1(@NotNull d52 timerViewProvider, @NotNull e42 textDelayViewController) {
        Intrinsics.checkNotNullParameter(timerViewProvider, "timerViewProvider");
        Intrinsics.checkNotNullParameter(textDelayViewController, "textDelayViewController");
        this.f31926a = timerViewProvider;
        this.f31927b = textDelayViewController;
    }
}
