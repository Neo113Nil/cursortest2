package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class WaveAnimImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    int f10552a;

    /* renamed from: b, reason: collision with root package name */
    int f10553b;

    /* renamed from: c, reason: collision with root package name */
    private Paint f10554c;

    /* renamed from: d, reason: collision with root package name */
    private a f10555d;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        float f10556a;

        /* renamed from: b, reason: collision with root package name */
        float f10557b;

        /* renamed from: c, reason: collision with root package name */
        float f10558c;

        public a(float f6, float f9, float f10) {
            this.f10556a = f6;
            this.f10557b = f9;
            this.f10558c = f10;
        }
    }

    public WaveAnimImageView(Context context) {
        super(context);
        a();
    }

    private void a() {
        Paint paint = new Paint();
        this.f10554c = paint;
        paint.setAntiAlias(true);
        this.f10554c.setStyle(Paint.Style.STROKE);
        this.f10554c.setColor(Color.parseColor("#FFFFFF"));
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        a aVar = this.f10555d;
        if (aVar != null) {
            this.f10554c.setAlpha((int) (aVar.f10558c * 255.0f));
            this.f10554c.setStrokeWidth(this.f10555d.f10557b);
            canvas.drawCircle(this.f10552a, this.f10553b, this.f10555d.f10556a, this.f10554c);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z8, int i, int i4, int i9, int i10) {
        super.onLayout(z8, i, i4, i9, i10);
        this.f10552a = getWidth() / 2;
        this.f10553b = getHeight() / 2;
    }

    public void setWaveAnimParams(a aVar) {
        this.f10555d = aVar;
        postInvalidate();
    }

    public WaveAnimImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public WaveAnimImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
