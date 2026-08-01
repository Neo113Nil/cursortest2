package com.winpower.neonfit.ui;

import V0.a;
import a.AbstractC0058a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import com.winpower.neonfit.data.UserPreferences;
import j1.h;

/* loaded from: classes.dex */
public final class CalorieCoreView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f2615a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f2616b;

    /* renamed from: c, reason: collision with root package name */
    public final Path f2617c;

    /* renamed from: d, reason: collision with root package name */
    public final Path f2618d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public float f2619f;

    /* renamed from: g, reason: collision with root package name */
    public int f2620g;

    /* renamed from: h, reason: collision with root package name */
    public int f2621h;
    public final a i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalorieCoreView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);
        paint.setColor(-1507542);
        this.f2615a = paint;
        this.f2616b = new Paint(1);
        this.f2617c = new Path();
        this.f2618d = new Path();
        this.f2621h = UserPreferences.DEFAULT_CALORIE_GOAL;
        this.i = new a(this, 0);
    }

    public final int getConsumed() {
        return this.f2620g;
    }

    public final int getGoal() {
        return this.f2621h;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        Choreographer.getInstance().postFrameCallback(this.i);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.e = false;
        Choreographer.getInstance().removeFrameCallback(this.i);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        h.e(canvas, "canvas");
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float min = (Math.min(getWidth(), getHeight()) / 2.0f) - 16.0f;
        float l2 = AbstractC0058a.l(this.f2620g / this.f2621h, 1.2f);
        canvas.drawCircle(width, height, min, this.f2615a);
        RadialGradient radialGradient = new RadialGradient(width, height, min, new int[]{1726545706, 587148693, 0}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        Paint paint = this.f2616b;
        paint.setShader(radialGradient);
        canvas.drawCircle(width, height, min - 6.0f, paint);
        float f2 = (height + min) - 6.0f;
        float f3 = f2 - ((2.0f * min) * l2);
        Path path = this.f2618d;
        path.reset();
        path.addCircle(width, height, min - 8.0f, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        Path path2 = this.f2617c;
        path2.reset();
        float f4 = width - min;
        path2.moveTo(f4, f2);
        while (true) {
            float f5 = width + min;
            if (f4 > f5) {
                path2.lineTo(f5, f2);
                path2.close();
                paint.setShader(new LinearGradient(width, f3, width, f2, new int[]{-53867, -1507542}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                canvas.drawPath(path2, paint);
                canvas.restore();
                paint.setShader(null);
                paint.setColor(-1507542);
                paint.setTextSize(36.0f);
                paint.setTextAlign(Paint.Align.CENTER);
                canvas.drawText(String.valueOf(this.f2620g), width, 12.0f + height, paint);
                paint.setTextSize(18.0f);
                paint.setColor(-1);
                canvas.drawText("kcal", width, height + 34.0f, paint);
                return;
            }
            path2.lineTo(f4, (((float) Math.sin((f4 / 24.0f) + this.f2619f)) * 8.0f) + f3);
            f4 += 8.0f;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size > size2) {
            size = size2;
        }
        setMeasuredDimension(size, size);
    }

    public final void setConsumed(int i) {
        this.f2620g = i;
        invalidate();
    }

    public final void setGoal(int i) {
        if (i < 1) {
            i = 1;
        }
        this.f2621h = i;
        invalidate();
    }
}
