package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c50 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d10 f24062a = new d10();

    public final boolean a(@NotNull View view, int i4, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(view, "view");
        int i8 = i6 - i4;
        int i9 = i7 - i5;
        d10 d10Var = this.f24062a;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        d10Var.getClass();
        int a4 = d10.a(context, 144.0f);
        d10 d10Var2 = this.f24062a;
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        d10Var2.getClass();
        return i8 >= a4 && i9 >= d10.a(context2, 96.0f);
    }
}
