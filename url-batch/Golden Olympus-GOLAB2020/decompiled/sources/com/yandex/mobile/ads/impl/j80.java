package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class j80 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c80 f27564a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1920f9 f27565b;

    public /* synthetic */ j80(Context context, C2286v2 c2286v2, c80 c80Var) {
        this(context, c2286v2, c80Var, new C1920f9(context, c2286v2));
    }

    public final void a(long j4) {
        if (j4 <= this.f27564a.c()) {
            this.f27565b.a(this.f27564a.d(), o62.f29920e);
        }
    }

    public j80(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull c80 falseClick, @NotNull C1920f9 adTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(falseClick, "falseClick");
        Intrinsics.checkNotNullParameter(adTracker, "adTracker");
        this.f27564a = falseClick;
        this.f27565b = adTracker;
    }
}
