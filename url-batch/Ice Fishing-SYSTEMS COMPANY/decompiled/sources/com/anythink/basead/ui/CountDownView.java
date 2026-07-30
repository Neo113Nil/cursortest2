package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;

/* loaded from: classes.dex */
public class CountDownView extends CloseImageView {

    /* renamed from: a, reason: collision with root package name */
    private Paint f10152a;

    /* renamed from: b, reason: collision with root package name */
    private Paint f10153b;

    /* renamed from: c, reason: collision with root package name */
    private Paint f10154c;

    /* renamed from: d, reason: collision with root package name */
    private float f10155d;

    /* renamed from: e, reason: collision with root package name */
    private float f10156e;

    /* renamed from: f, reason: collision with root package name */
    private int f10157f;

    /* renamed from: g, reason: collision with root package name */
    private int f10158g;

    /* renamed from: h, reason: collision with root package name */
    private int f10159h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f10160j;

    /* renamed from: k, reason: collision with root package name */
    private int f10161k;

    /* renamed from: l, reason: collision with root package name */
    private RectF f10162l;

    /* renamed from: m, reason: collision with root package name */
    private float f10163m;

    /* renamed from: n, reason: collision with root package name */
    private String f10164n;

    /* renamed from: o, reason: collision with root package name */
    private Rect f10165o;

    /* renamed from: p, reason: collision with root package name */
    private long f10166p;

    /* renamed from: q, reason: collision with root package name */
    private float f10167q;

    /* renamed from: r, reason: collision with root package name */
    private Paint.FontMetrics f10168r;

    /* renamed from: s, reason: collision with root package name */
    private Drawable f10169s;

    public CountDownView(Context context) {
        this(context, null);
    }

    private void a(Context context) {
        this.f10155d = TypedValue.applyDimension(1, 2.5f, context.getResources().getDisplayMetrics());
        this.f10156e = TypedValue.applyDimension(1, 10.0f, context.getResources().getDisplayMetrics());
        this.f10157f = Color.parseColor("#66000000");
        this.f10158g = Color.parseColor("#CC000000");
        this.f10159h = -1;
        Paint paint = new Paint();
        this.f10152a = paint;
        paint.setAntiAlias(true);
        this.f10152a.setStrokeCap(Paint.Cap.ROUND);
        this.f10152a.setStyle(Paint.Style.STROKE);
        this.f10152a.setStrokeWidth(this.f10155d);
        Paint paint2 = new Paint(this.f10152a);
        this.f10153b = paint2;
        paint2.setColor(this.f10157f);
        this.f10153b.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint();
        this.f10154c = paint3;
        paint3.setAntiAlias(true);
        this.f10154c.setTextSize(this.f10156e);
        this.f10154c.setColor(this.f10159h);
        this.f10162l = new RectF();
        this.f10165o = new Rect();
        this.f10166p = -1L;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f10169s != null && TextUtils.equals("0", this.f10164n)) {
            this.f10169s.setBounds(0, 0, getWidth(), getHeight());
            this.f10169s.draw(canvas);
            return;
        }
        canvas.drawCircle(this.f10162l.centerX(), this.f10162l.centerY(), this.f10161k, this.f10153b);
        this.f10152a.setColor(this.f10158g);
        canvas.drawArc(this.f10162l, 0.0f, 360.0f, false, this.f10152a);
        this.f10152a.setColor(this.f10159h);
        canvas.drawArc(this.f10162l, -90.0f, this.f10163m, false, this.f10152a);
        if (TextUtils.isEmpty(this.f10164n)) {
            return;
        }
        Paint paint = this.f10154c;
        String str = this.f10164n;
        paint.getTextBounds(str, 0, str.length(), this.f10165o);
        this.f10167q = this.f10154c.measureText(this.f10164n);
        this.f10168r = this.f10154c.getFontMetrics();
        String str2 = this.f10164n;
        float centerX = this.f10162l.centerX() - (this.f10167q / 2.0f);
        float centerY = this.f10162l.centerY();
        Paint.FontMetrics fontMetrics = this.f10168r;
        float f6 = fontMetrics.bottom;
        canvas.drawText(str2, centerX, (((f6 - fontMetrics.top) / 2.0f) - f6) + centerY, this.f10154c);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i4, int i9, int i10) {
        super.onSizeChanged(i, i4, i9, i10);
        this.i = i;
        this.f10160j = i4;
        a();
    }

    public void refresh(long j9) {
        long j10 = this.f10166p;
        if (j10 >= 0) {
            this.f10163m = ((j9 * 1.0f) / j10) * 360.0f;
            StringBuilder sb = new StringBuilder();
            sb.append((int) Math.ceil((this.f10166p - j9) / 1000.0d));
            this.f10164n = sb.toString();
            postInvalidate();
        }
    }

    public void refreshToEnd() {
        if (this.f10166p > 0) {
            this.f10163m = 360.0f;
            this.f10164n = "0";
            postInvalidate();
        }
    }

    public void setBgColor(int i) {
        this.f10157f = i;
        this.f10153b.setColor(i);
    }

    public void setCountDownEndDrawable(Drawable drawable) {
        this.f10169s = drawable;
        postInvalidate();
    }

    public void setDuration(long j9) {
        this.f10166p = j9;
        StringBuilder sb = new StringBuilder();
        sb.append(j9 / 1000);
        this.f10164n = sb.toString();
    }

    public void setThickInPx(int i) {
        float f6 = i;
        this.f10155d = f6;
        this.f10152a.setStrokeWidth(f6);
        a();
    }

    public void setUnderRingColor(int i) {
        this.f10158g = i;
    }

    public CountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10155d = TypedValue.applyDimension(1, 2.5f, context.getResources().getDisplayMetrics());
        this.f10156e = TypedValue.applyDimension(1, 10.0f, context.getResources().getDisplayMetrics());
        this.f10157f = Color.parseColor("#66000000");
        this.f10158g = Color.parseColor("#CC000000");
        this.f10159h = -1;
        Paint paint = new Paint();
        this.f10152a = paint;
        paint.setAntiAlias(true);
        this.f10152a.setStrokeCap(Paint.Cap.ROUND);
        this.f10152a.setStyle(Paint.Style.STROKE);
        this.f10152a.setStrokeWidth(this.f10155d);
        Paint paint2 = new Paint(this.f10152a);
        this.f10153b = paint2;
        paint2.setColor(this.f10157f);
        this.f10153b.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint();
        this.f10154c = paint3;
        paint3.setAntiAlias(true);
        this.f10154c.setTextSize(this.f10156e);
        this.f10154c.setColor(this.f10159h);
        this.f10162l = new RectF();
        this.f10165o = new Rect();
        this.f10166p = -1L;
    }

    private void a() {
        float f6 = this.f10155d * 0.5f;
        float f9 = 0.0f + f6;
        this.f10162l.set(f9, f9, this.i - f6, this.f10160j - f6);
        this.f10161k = ((int) this.f10162l.width()) >> 1;
    }
}
