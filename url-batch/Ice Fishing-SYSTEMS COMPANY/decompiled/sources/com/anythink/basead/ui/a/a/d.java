package com.anythink.basead.ui.a.a;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class d extends a {

    /* renamed from: e, reason: collision with root package name */
    private int f10571e;

    /* renamed from: f, reason: collision with root package name */
    private Paint f10572f;

    /* renamed from: g, reason: collision with root package name */
    private Paint f10573g;

    /* renamed from: h, reason: collision with root package name */
    private Paint f10574h;
    private Canvas i;

    /* renamed from: j, reason: collision with root package name */
    private RectF f10575j;

    /* renamed from: k, reason: collision with root package name */
    private Bitmap f10576k;

    /* renamed from: l, reason: collision with root package name */
    private int f10577l;

    /* renamed from: m, reason: collision with root package name */
    private int f10578m;

    /* renamed from: n, reason: collision with root package name */
    private int f10579n;

    /* renamed from: o, reason: collision with root package name */
    private int f10580o;

    /* renamed from: p, reason: collision with root package name */
    private int f10581p;

    /* renamed from: q, reason: collision with root package name */
    private int f10582q;

    public d(View view) {
        super(view);
        if (view == null) {
            return;
        }
        this.f10582q = q.a(view.getContext(), 5.0f);
        this.f10577l = q.a(view.getContext(), 24.0f);
        this.f10580o = q.a(view.getContext(), 30.0f);
        this.f10571e = 20;
        Paint paint = new Paint(1);
        this.f10572f = paint;
        paint.setColor(Color.parseColor("#cfffffff"));
        Paint paint2 = new Paint(1);
        this.f10573g = paint2;
        paint2.setColor(-16777216);
        this.f10573g.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        Paint paint3 = new Paint(1);
        this.f10574h = paint3;
        paint3.setColor(-16777216);
        this.f10572f.setStrokeWidth(this.f10582q);
        this.f10572f.setMaskFilter(new BlurMaskFilter(this.f10571e, BlurMaskFilter.Blur.NORMAL));
        int i = -this.f10582q;
        this.f10578m = i;
        this.f10579n = i - this.f10580o;
    }

    @Override // com.anythink.basead.ui.a.a.a
    public final ValueAnimator e() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(1200L);
        ofFloat.setRepeatMode(1);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.ui.a.a.d.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view = d.this.f10564a;
                if (view == null || view.getVisibility() != 0) {
                    return;
                }
                if (d.this.f10576k == null && d.this.i == null) {
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d dVar = d.this;
                d.this.f10581p = (int) (((d.this.f10582q * 2) + dVar.f10580o + dVar.f10566c) * floatValue);
                d.this.f10564a.postInvalidate();
            }
        });
        return ofFloat;
    }

    @Override // com.anythink.basead.ui.a.a.a
    public final void f() {
        super.f();
        if (this.f10564a == null || this.f10566c == 0 || this.f10567d == 0) {
            return;
        }
        try {
            int i = (int) (this.f10566c * 0.1d);
            this.f10580o = i;
            this.f10579n = this.f10578m - i;
            RectF rectF = new RectF();
            this.f10575j = rectF;
            rectF.left = 0.0f;
            rectF.top = 0.0f;
            int i4 = this.f10566c;
            rectF.right = i4;
            int i9 = this.f10567d;
            rectF.bottom = i9;
            this.f10576k = Bitmap.createBitmap(i4, i9, Bitmap.Config.ARGB_8888);
            this.i = new Canvas(this.f10576k);
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.basead.ui.a.a.a, com.anythink.basead.ui.a.b
    public void a(int i, int i4) {
        if (this.f10566c != i || this.f10567d != i4) {
            f();
        }
        super.a(i, i4);
    }

    @Override // com.anythink.basead.ui.a.a.a, com.anythink.basead.ui.a.b
    public void a(Canvas canvas) {
        ValueAnimator valueAnimator;
        super.a(canvas);
        View view = this.f10564a;
        if (view == null || view.getVisibility() != 0 || (valueAnimator = this.f10565b) == null || !valueAnimator.isStarted() || this.f10576k == null || this.i == null) {
            return;
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, this.f10566c, this.f10567d, null, 31);
        this.f10576k.eraseColor(0);
        int i = this.f10578m;
        int i4 = this.f10581p;
        canvas.drawLine(i + i4, 0.0f, this.f10579n + i4, this.f10567d, this.f10572f);
        Canvas canvas2 = this.i;
        RectF rectF = this.f10575j;
        int i9 = this.f10577l;
        canvas2.drawRoundRect(rectF, i9, i9, this.f10574h);
        canvas.drawBitmap(this.f10576k, 0.0f, 0.0f, this.f10573g);
        canvas.restoreToCount(saveLayer);
    }
}
