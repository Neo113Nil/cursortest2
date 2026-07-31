package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.au0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class yt0 implements au0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f35311a;

    /* renamed from: b, reason: collision with root package name */
    private final float f35312b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Context f35313c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final au0.a f35314d;

    public yt0(@NotNull View view, float f4, @NotNull Context context, @NotNull au0.a measureSpecHolder) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(measureSpecHolder, "measureSpecHolder");
        this.f35311a = view;
        this.f35312b = f4;
        this.f35313c = context;
        this.f35314d = measureSpecHolder;
    }

    @Override // com.yandex.mobile.ads.impl.au0
    @NotNull
    public final au0.a a(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        Context context = this.f35313c;
        int i6 = lh2.f28593b;
        Intrinsics.checkNotNullParameter(context, "context");
        int round = Math.round(context.getResources().getDisplayMetrics().widthPixels * this.f35312b);
        ViewGroup.LayoutParams layoutParams = this.f35311a.getLayoutParams();
        Intrinsics.checkNotNullExpressionValue(layoutParams, "getLayoutParams(...)");
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            round = (round - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
        }
        this.f35314d.f23449a = View.MeasureSpec.makeMeasureSpec((int) Math.max(Math.min(size, round), 0.0d), mode);
        au0.a aVar = this.f35314d;
        aVar.f23450b = i5;
        return aVar;
    }
}
