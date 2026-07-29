package com.youappi.sdk.ui.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.view.View;

/* loaded from: classes2.dex */
public class CircularProgressBarView extends View {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9516a = "CircularProgressBarView";

    /* renamed from: b, reason: collision with root package name */
    private int f9517b;

    /* renamed from: c, reason: collision with root package name */
    private int f9518c;

    /* renamed from: d, reason: collision with root package name */
    private float f9519d;
    private int e;
    private int f;
    private int g;
    private float h;
    private int i;
    private final Paint j;
    private final Paint k;
    private final Paint l;
    private Paint m;
    private Paint n;
    private final RectF o;
    private final RectF p;
    private int q;
    private int r;

    public CircularProgressBarView(Context context) {
        super(context);
        this.f9517b = 210;
        double d2 = this.f9517b;
        Double.isNaN(d2);
        this.f9518c = (int) (d2 * 0.72d);
        this.f9519d = 0.35f;
        this.e = (int) ((this.f9518c / 2) * this.f9519d);
        this.f = this.f9518c / 2;
        this.g = (this.f9518c / 2) - (this.e / 2);
        this.h = (this.f9518c / 2) - (this.f / 2);
        this.i = 4;
        this.j = new Paint();
        this.k = new Paint();
        this.l = new Paint();
        this.m = new Paint();
        this.n = new Paint();
        this.o = new RectF();
        this.p = new RectF();
        this.q = 100;
        this.r = 0;
        a(context);
    }

    private void b(Canvas canvas) {
        float progressAngle = getProgressAngle();
        canvas.drawCircle(this.f9517b / 2, this.f9517b / 2, this.f9517b / 2, this.m);
        canvas.drawArc(this.o, 0.0f, 360.0f, false, this.k);
        float f = -progressAngle;
        canvas.drawArc(this.p, 272.0f, f, false, this.n);
        canvas.drawArc(this.o, 272.0f, f, false, this.j);
    }

    private int getProgress() {
        return this.r;
    }

    private float getProgressAngle() {
        return (getProgress() / this.q) * 360.0f;
    }

    protected void a(Context context) {
        this.m = new Paint();
        this.m.setColor(-16777216);
        this.m.setStrokeWidth(1.0f);
        this.m.setStyle(Paint.Style.FILL_AND_STROKE);
        this.m.setShader(new RadialGradient(this.f9517b / 2, this.f9517b / 2, this.f9517b / 2, Color.parseColor("#59000000"), 0, Shader.TileMode.CLAMP));
        this.j.setColor(-1);
        this.j.setAntiAlias(true);
        this.j.setStrokeWidth(this.i);
        this.j.setStyle(Paint.Style.STROKE);
        this.n.setColor(0);
        this.n.setAntiAlias(true);
        this.n.setStrokeWidth(this.f);
        this.n.setStyle(Paint.Style.STROKE);
        this.k.setColor(-7829368);
        this.k.setAntiAlias(true);
        this.k.setStrokeWidth(this.i);
        this.k.setStyle(Paint.Style.STROKE);
        this.l.setColor(-1);
        this.l.setTextSize(this.f9518c / 3);
        this.l.setTextAlign(Paint.Align.CENTER);
        this.l.setAntiAlias(true);
        if (this.l.getTypeface() == null) {
            this.l.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        }
        this.p.left = (this.f9517b / 2) - this.h;
        this.p.top = (this.f9517b / 2) - this.h;
        this.p.right = this.p.left + (this.h * 2.0f);
        this.p.bottom = this.p.top + (this.h * 2.0f);
        this.o.left = (this.f9517b / 2) - this.g;
        this.o.top = (this.f9517b / 2) - this.g;
        this.o.right = this.o.left + (this.g * 2);
        this.o.bottom = this.o.top + (this.g * 2);
    }

    public void a(Context context, int i) {
        this.f9518c = i;
        double d2 = this.f9518c;
        Double.isNaN(d2);
        this.f9517b = (int) (d2 * 1.2d);
        this.f9519d = 0.35f;
        this.e = (int) ((this.f9518c / 2) * this.f9519d);
        this.f = this.f9518c / 2;
        this.g = (this.f9518c / 2) - (this.e / 2);
        this.h = (this.f9518c / 2) - (this.f / 2);
        a(context);
    }

    protected void a(Canvas canvas) {
        canvas.drawText(String.valueOf(this.r), (int) (this.o.left + this.g), (int) ((this.o.top + this.g) - (this.l.ascent() / 2.0f)), this.l);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        b(canvas);
        a(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(this.f9517b, this.f9517b);
    }

    public void setMaxProgress(int i) {
        this.q = i;
        postInvalidate();
    }

    public void setProgress(int i) {
        this.r = i;
        postInvalidate();
    }
}
