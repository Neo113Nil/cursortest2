package com.facebook.ads.internal.view.e.c;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class j extends View implements com.facebook.ads.internal.view.e.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final Paint f5763a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f5764b;

    /* renamed from: c, reason: collision with root package name */
    private final Paint f5765c;

    /* renamed from: d, reason: collision with root package name */
    private a f5766d;
    private final Paint e;
    private final RectF f;
    private com.facebook.ads.internal.view.e.b g;
    private int h;
    private final AtomicInteger i;
    private final AtomicBoolean j;
    private final com.facebook.ads.internal.view.e.b.m k;
    private final com.facebook.ads.internal.view.e.b.o l;
    private final com.facebook.ads.internal.view.e.b.c m;

    public enum a {
        CLOSE_BUTTON_MODE,
        SKIP_BUTTON_MODE
    }

    public j(Context context, int i, int i2) {
        super(context);
        this.f5766d = a.CLOSE_BUTTON_MODE;
        this.i = new AtomicInteger(0);
        this.j = new AtomicBoolean(false);
        this.k = new com.facebook.ads.internal.view.e.b.m() { // from class: com.facebook.ads.internal.view.e.c.j.1
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.l lVar) {
                j.this.j.set(true);
            }
        };
        this.l = new com.facebook.ads.internal.view.e.b.o() { // from class: com.facebook.ads.internal.view.e.c.j.2
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.n nVar) {
                if (j.this.g == null) {
                    return;
                }
                int i3 = j.this.h;
                int duration = j.this.g.getDuration();
                if (i3 <= 0) {
                    j.this.i.set(0);
                } else {
                    int min = Math.min(duration, i3 * 1000);
                    if (min == 0) {
                        return;
                    } else {
                        j.this.i.set(((min - j.this.g.getCurrentPosition()) * 100) / min);
                    }
                }
                j.this.postInvalidate();
            }
        };
        this.m = new com.facebook.ads.internal.view.e.b.c() { // from class: com.facebook.ads.internal.view.e.c.j.3
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.b bVar) {
                j.this.h = 0;
                j.this.i.set(0);
                j.this.postInvalidate();
            }
        };
        float f = getResources().getDisplayMetrics().density;
        this.h = i;
        this.f5764b = new Paint();
        this.f5764b.setStyle(Paint.Style.FILL);
        this.f5764b.setColor(i2);
        this.f5765c = new Paint();
        this.f5765c.setColor(-1);
        this.f5765c.setAlpha(230);
        this.f5765c.setStyle(Paint.Style.FILL);
        this.f5765c.setStrokeWidth(1.0f * f);
        this.f5765c.setAntiAlias(true);
        this.f5763a = new Paint();
        this.f5763a.setColor(-16777216);
        this.f5763a.setStyle(Paint.Style.STROKE);
        this.f5763a.setAlpha(102);
        this.f5763a.setStrokeWidth(1.5f * f);
        this.f5763a.setAntiAlias(true);
        setLayerType(1, null);
        this.f5763a.setMaskFilter(new BlurMaskFilter(6.0f, BlurMaskFilter.Blur.NORMAL));
        this.e = new Paint();
        this.e.setColor(-10066330);
        this.e.setStyle(Paint.Style.STROKE);
        this.e.setStrokeWidth(f * 2.0f);
        this.e.setAntiAlias(true);
        this.f = new RectF();
    }

    @Override // com.facebook.ads.internal.view.e.a.b
    public void a(com.facebook.ads.internal.view.e.b bVar) {
        this.g = bVar;
        this.g.getEventBus().a(this.k, this.l, this.m);
    }

    public boolean a() {
        return this.g != null && (this.h <= 0 || this.i.get() < 0);
    }

    @Override // com.facebook.ads.internal.view.e.a.b
    public void b(com.facebook.ads.internal.view.e.b bVar) {
        this.g.getEventBus().b(this.m, this.l, this.k);
        this.g = null;
    }

    public int getSkipSeconds() {
        return this.h;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (!this.j.get()) {
            super.onDraw(canvas);
            return;
        }
        int min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        float f = min / 2;
        canvas.drawCircle(getPaddingLeft() + r1, getPaddingTop() + r1, f, this.f5763a);
        canvas.drawCircle(getPaddingLeft() + r1, getPaddingTop() + r1, f, this.f5765c);
        if (this.i.get() > 0) {
            this.f.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            canvas.drawArc(this.f, -90.0f, (-(this.i.get() * 360)) / 100.0f, true, this.f5764b);
        } else if (this.f5766d == a.SKIP_BUTTON_MODE) {
            int i = min / 4;
            Path path = new Path();
            path.moveTo(getPaddingLeft() + i, getPaddingTop() + r0);
            path.lineTo(getPaddingLeft() + r1, getPaddingTop() + r1);
            int i2 = (min / 3) * 2;
            path.lineTo(getPaddingLeft() + i, getPaddingTop() + i2);
            canvas.drawPath(path, this.e);
            Path path2 = new Path();
            path2.moveTo(getPaddingLeft() + r1, r0 + getPaddingTop());
            path2.lineTo((i * 3) + getPaddingLeft(), getPaddingTop() + r1);
            path2.lineTo(r1 + getPaddingLeft(), i2 + getPaddingTop());
            canvas.drawPath(path2, this.e);
        } else {
            int i3 = (min / 3) * 2;
            canvas.drawLine(getPaddingLeft() + r0, getPaddingTop() + r0, getPaddingLeft() + i3, getPaddingTop() + i3, this.e);
            canvas.drawLine(getPaddingLeft() + i3, getPaddingTop() + r0, r0 + getPaddingLeft(), i3 + getPaddingTop(), this.e);
        }
        super.onDraw(canvas);
    }

    public void setButtonMode(a aVar) {
        this.f5766d = aVar;
    }
}
