package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.TypedValue;
import j2.AbstractC3185a;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class k30 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d10 f27994a = new d10();

    @NotNull
    public final LayerDrawable a(@NotNull Context context, int i4, int i5) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f27994a.getClass();
        int a4 = d10.a(context, 6.0f);
        this.f27994a.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        int c4 = AbstractC3185a.c(TypedValue.applyDimension(1, 4.0f, context.getResources().getDisplayMetrics()));
        this.f27994a.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        int c5 = AbstractC3185a.c(TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics()));
        this.f27994a.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        int c6 = AbstractC3185a.c(TypedValue.applyDimension(1, 12.0f, context.getResources().getDisplayMetrics()));
        int i6 = ((i5 + 1) * c4) + (a4 * i5);
        float f4 = c6;
        RectF rectF = new RectF(0.0f, 0.0f, i6, f4);
        float[] fArr = new float[8];
        int i7 = 0;
        for (int i8 = 0; i8 < 8; i8++) {
            fArr[i8] = f4;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, rectF, null));
        shapeDrawable.setIntrinsicWidth(i6);
        shapeDrawable.setIntrinsicHeight(c6);
        shapeDrawable.getPaint().setColor(-16777216);
        shapeDrawable.setAlpha(102);
        ShapeDrawable[] shapeDrawableArr = new ShapeDrawable[i5];
        for (int i9 = 0; i9 < i5; i9++) {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
            shapeDrawable2.setIntrinsicHeight(a4);
            shapeDrawable2.setIntrinsicWidth(a4);
            shapeDrawable2.getPaint().setColor(-1);
            if (i9 != i4) {
                shapeDrawable2.setAlpha(102);
            }
            Unit unit = Unit.f41027a;
            shapeDrawableArr[i9] = shapeDrawable2;
        }
        kotlin.jvm.internal.K k4 = new kotlin.jvm.internal.K(2);
        k4.a(shapeDrawable);
        k4.b(shapeDrawableArr);
        LayerDrawable layerDrawable = new LayerDrawable((Drawable[]) k4.d(new ShapeDrawable[k4.c()]));
        while (i7 < i5) {
            int i10 = c4 + a4;
            int i11 = i7 + 1;
            layerDrawable.setLayerInset(i11, (i10 * i7) + c4, c5, i6 - (i10 * i11), c5);
            i7 = i11;
        }
        return layerDrawable;
    }
}
