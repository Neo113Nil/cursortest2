package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class bj0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f23833a;

    public bj0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f23833a = context.getApplicationContext();
    }

    @NotNull
    public final String a(int i4, int i5) {
        Context context = this.f23833a;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int a4 = lh2.a(context, i4);
        Context context2 = this.f23833a;
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        int a5 = lh2.a(context2, i5);
        ap0.a(new Object[0]);
        return (a4 >= 320 || a5 >= 240) ? "large" : (a4 >= 160 || a5 >= 160) ? "medium" : "small";
    }
}
