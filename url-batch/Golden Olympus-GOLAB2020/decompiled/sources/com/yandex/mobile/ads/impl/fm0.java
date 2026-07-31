package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class fm0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final il0 f25862a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final j00 f25863b;

    public /* synthetic */ fm0(il0 il0Var, xm0 xm0Var) {
        this(il0Var, xm0Var, new j00(xm0Var));
    }

    @Nullable
    public final db2 a(@NotNull j70 instreamAdView) {
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        db2 a4 = this.f25862a.a();
        if (a4 != null) {
            return a4;
        }
        j00 j00Var = this.f25863b;
        Context context = instreamAdView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return j00Var.a(context, instreamAdView);
    }

    public fm0(@NotNull il0 customUiElementsHolder, @NotNull xm0 instreamDesign, @NotNull j00 defaultUiElementsCreator) {
        Intrinsics.checkNotNullParameter(customUiElementsHolder, "customUiElementsHolder");
        Intrinsics.checkNotNullParameter(instreamDesign, "instreamDesign");
        Intrinsics.checkNotNullParameter(defaultUiElementsCreator, "defaultUiElementsCreator");
        this.f25862a = customUiElementsHolder;
        this.f25863b = defaultUiElementsCreator;
    }
}
