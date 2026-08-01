package com.winfour.winrandom.ui;

import B.b;
import U0.i;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import com.winfour.winrandom.R;
import h.AbstractC0112a;
import h1.d;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class RandomDisplayView extends View {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f2117k = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Paint f2118a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f2119b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f2120c;
    public final Paint d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f2121e;

    /* renamed from: f, reason: collision with root package name */
    public String f2122f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2123g;

    /* renamed from: h, reason: collision with root package name */
    public float f2124h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final i f2125j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RandomDisplayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        d.e(context, "context");
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(getResources().getDisplayMetrics().density * 1.5f);
        paint.setColor(b.a(context, R.color.neon_cyan));
        this.f2118a = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeWidth(getResources().getDisplayMetrics().density * 3.0f);
        paint2.setColor(b.a(context, R.color.neon_cyan_glow));
        this.f2119b = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(b.a(context, R.color.text_primary));
        Paint.Align align = Paint.Align.CENTER;
        paint3.setTextAlign(align);
        this.f2120c = paint3;
        Paint paint4 = new Paint(1);
        paint4.setColor(b.a(context, R.color.text_secondary));
        paint4.setTextAlign(align);
        paint4.setTextSize(getResources().getDisplayMetrics().scaledDensity * 16.0f);
        this.d = paint4;
        this.f2121e = new RectF();
        this.f2122f = "";
        this.f2123g = "";
        this.f2125j = new i(this);
        this.f2123g = context.getString(R.string.display_hint);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.i = false;
        Choreographer.getInstance().removeFrameCallback(this.f2125j);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        d.e(canvas, "canvas");
        super.onDraw(canvas);
        float f2 = getResources().getDisplayMetrics().density * 16.0f;
        RectF rectF = this.f2121e;
        rectF.set(f2, f2, getWidth() - f2, getHeight() - f2);
        float sin = this.i ? (((float) Math.sin(this.f2124h * 3.141592653589793d)) * 0.45f) + 0.55f : 1.0f;
        Paint paint = this.f2119b;
        paint.setAlpha(AbstractC0112a.e((int) (80 * sin), 40, 120));
        Paint paint2 = this.f2118a;
        paint2.setAlpha(AbstractC0112a.e((int) ((75 * sin) + 180), 0, 255));
        canvas.drawRoundRect(rectF, getResources().getDisplayMetrics().density * 24.0f, getResources().getDisplayMetrics().density * 24.0f, paint);
        canvas.drawRoundRect(rectF, getResources().getDisplayMetrics().density * 24.0f, getResources().getDisplayMetrics().density * 24.0f, paint2);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        if (o1.d.G(this.f2122f)) {
            Paint paint3 = this.d;
            canvas.drawText(this.f2123g, width, height - ((paint3.ascent() + paint3.descent()) / 2.0f), paint3);
            return;
        }
        List N2 = o1.d.N(this.f2122f, new String[]{"\n"});
        float f3 = getResources().getDisplayMetrics().density;
        float f4 = (N2.size() != 1 || this.f2122f.length() > 3) ? (N2.size() != 1 || this.f2122f.length() > 6) ? N2.size() <= 3 ? 40.0f : 28.0f : 56.0f : 72.0f;
        Paint paint4 = this.f2120c;
        paint4.setTextSize(((0.08f * sin) + 0.92f) * f4 * f3);
        paint4.setAlpha(AbstractC0112a.e((int) ((55 * sin) + 200), 0, 255));
        float descent = paint4.descent() - paint4.ascent();
        float size = (height - ((N2.size() * descent) / 2.0f)) - paint4.ascent();
        Iterator it = N2.iterator();
        while (it.hasNext()) {
            canvas.drawText((String) it.next(), width, size, paint4);
            size += descent;
        }
    }
}
