package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.au0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class xt0 implements au0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f34667a;

    /* renamed from: b, reason: collision with root package name */
    private final float f34668b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Context f34669c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final au0.a f34670d;

    public /* synthetic */ xt0(View view, float f4, Context context) {
        this(view, f4, context, new au0.a());
    }

    @Override // com.yandex.mobile.ads.impl.au0
    @NotNull
    public final au0.a a(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int round = Math.round(lh2.c(this.f34669c) * this.f34668b);
        ViewGroup.LayoutParams layoutParams = this.f34667a.getLayoutParams();
        Intrinsics.checkNotNullExpressionValue(layoutParams, "getLayoutParams(...)");
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            round = (round - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
        }
        int max = (int) Math.max(Math.min(size, round), 0.0d);
        au0.a aVar = this.f34670d;
        aVar.f23449a = i4;
        aVar.f23450b = View.MeasureSpec.makeMeasureSpec(max, mode);
        return this.f34670d;
    }

    public xt0(@NotNull View view, float f4, @NotNull Context context, @NotNull au0.a measureSpecHolder) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(measureSpecHolder, "measureSpecHolder");
        this.f34667a = view;
        this.f34668b = f4;
        this.f34669c = context;
        this.f34670d = measureSpecHolder;
    }
}
