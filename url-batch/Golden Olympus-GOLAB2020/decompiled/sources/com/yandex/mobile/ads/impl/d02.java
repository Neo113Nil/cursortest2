package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.preference.PreferenceManager;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d02 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final zz1 f24387a = new zz1();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Matrix f24388b = new Matrix();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Paint f24389c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Rect f24390d;

    public d02() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.parseColor("#2E7D32"));
        paint.setStrokeWidth(10.0f);
        this.f24389c = paint;
        this.f24390d = new Rect();
    }

    public final void a(@NotNull ImageView view, @NotNull Bitmap bitmap, @NotNull xz1 smartCenter) {
        float f4;
        float c4;
        float f5;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(smartCenter, "smartCenter");
        float width = view.getWidth();
        float height = view.getHeight();
        float width2 = bitmap.getWidth();
        float height2 = bitmap.getHeight();
        Float valueOf = Float.valueOf(0.0f);
        if (height == 0.0f || height2 == 0.0f) {
            return;
        }
        boolean z4 = width / height > width2 / height2;
        float f6 = z4 ? width / width2 : height / height2;
        float f7 = width2 * f6;
        float f8 = height2 * f6;
        if (z4) {
            c4 = 0.0f;
            f4 = 0.0f;
        } else {
            f4 = 0.0f;
            c4 = (width / 2) - (((smartCenter.c() / 2) + smartCenter.d()) * f6);
            Float valueOf2 = c4 > 0.0f ? valueOf : c4 + f7 < width ? Float.valueOf(width - f7) : null;
            if (valueOf2 != null) {
                c4 = valueOf2.floatValue();
            }
        }
        if (z4) {
            float b4 = (height / 2) - (((smartCenter.b() / 2) + smartCenter.e()) * f6);
            if (b4 <= f4) {
                valueOf = b4 + f8 < height ? Float.valueOf(height - f8) : null;
            }
            f5 = valueOf != null ? valueOf.floatValue() : b4;
        } else {
            f5 = f4;
        }
        this.f24388b.setScale(f6, f6);
        this.f24388b.postTranslate(c4, f5);
        view.setScaleType(ImageView.ScaleType.MATRIX);
        view.setImageMatrix(this.f24388b);
        zz1 zz1Var = this.f24387a;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        zz1Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        if (PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preference_smart_centers_debug_enabled", false)) {
            Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            Canvas canvas = new Canvas(copy);
            Rect rect = this.f24390d;
            rect.set(smartCenter.d(), smartCenter.e(), smartCenter.c() + smartCenter.d(), smartCenter.b() + smartCenter.e());
            canvas.drawRect(rect, this.f24389c);
            view.setImageBitmap(copy);
        }
    }

    public final void a(@NotNull ImageView view, @NotNull Bitmap bitmap, @NotNull xz1 smartCenter, @NotNull String backGroundColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(smartCenter, "smartCenter");
        Intrinsics.checkNotNullParameter(backGroundColor, "backGroundColor");
        float width = view.getWidth();
        float height = view.getHeight();
        float width2 = bitmap.getWidth();
        float height2 = bitmap.getHeight();
        float c4 = smartCenter.c();
        float b4 = smartCenter.b();
        if (height == 0.0f || b4 == 0.0f || height2 == 0.0f) {
            return;
        }
        float f4 = width / height;
        float f5 = f4 < c4 / b4 ? width / c4 : height / b4;
        if (f5 > 1.0f) {
            f5 = f4 < width2 / height2 ? width / width2 : height / height2;
        }
        float f6 = 2;
        this.f24388b.setScale(f5, f5);
        this.f24388b.postTranslate((width / f6) - (((smartCenter.c() / 2) + smartCenter.d()) * f5), (height / f6) - (((smartCenter.b() / 2) + smartCenter.e()) * f5));
        view.setScaleType(ImageView.ScaleType.MATRIX);
        view.setImageMatrix(this.f24388b);
        view.setBackgroundColor(Color.parseColor(backGroundColor));
        zz1 zz1Var = this.f24387a;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        zz1Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        if (PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preference_smart_centers_debug_enabled", false)) {
            Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            Canvas canvas = new Canvas(copy);
            Rect rect = this.f24390d;
            rect.set(smartCenter.d(), smartCenter.e(), smartCenter.c() + smartCenter.d(), smartCenter.b() + smartCenter.e());
            canvas.drawRect(rect, this.f24389c);
            view.setImageBitmap(copy);
        }
    }
}
