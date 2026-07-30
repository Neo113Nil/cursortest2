package com.anythink.basead.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.anythink.basead.exoplayer.k.p;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public class SpreadAnimLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private Paint f10537a;

    /* renamed from: b, reason: collision with root package name */
    private ValueAnimator f10538b;

    /* renamed from: c, reason: collision with root package name */
    private a f10539c;

    /* renamed from: d, reason: collision with root package name */
    private RectF f10540d;

    /* renamed from: e, reason: collision with root package name */
    private RectF f10541e;

    /* renamed from: f, reason: collision with root package name */
    private int f10542f;

    /* renamed from: g, reason: collision with root package name */
    private int f10543g;

    /* renamed from: h, reason: collision with root package name */
    private int f10544h;
    private Paint i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f10545j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f10546k;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        RectF f10549a;

        /* renamed from: b, reason: collision with root package name */
        int f10550b;
    }

    public SpreadAnimLayout(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (!this.f10545j || !this.f10546k) {
            super.draw(canvas);
            return;
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        this.f10537a.setAlpha(this.f10539c.f10550b);
        RectF rectF = this.f10539c.f10549a;
        int i = this.f10542f;
        canvas.drawRoundRect(rectF, i, i, this.f10537a);
        RectF rectF2 = this.f10540d;
        int i4 = this.f10542f;
        canvas.drawRoundRect(rectF2, i4, i4, this.i);
        canvas.restoreToCount(saveLayer);
        super.draw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i, int i4, int i9, int i10) {
        super.onLayout(z8, i, i4, i9, i10);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        int i9 = this.f10543g;
        setPadding(i9, i9, i9, i9);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.f10545j) {
            if (i == 0) {
                post(new Runnable() { // from class: com.anythink.basead.ui.SpreadAnimLayout.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        SpreadAnimLayout.this.startSpreadAnimation();
                    }
                });
                return;
            }
            ValueAnimator valueAnimator = this.f10538b;
            if (valueAnimator != null) {
                valueAnimator.end();
            }
        }
    }

    public void setMaxSpreadDistance(int i) {
        this.f10543g = i;
    }

    public void setRoundRadius(int i) {
        this.f10542f = i;
    }

    public void startSpreadAnimation() {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        this.f10545j = true;
        if (!this.f10546k) {
            this.f10540d = new RectF(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
            this.f10541e = new RectF(this.f10540d);
            a aVar = new a();
            this.f10539c = aVar;
            aVar.f10550b = p.f8630b;
            aVar.f10549a = this.f10541e;
            this.f10543g = Math.min(this.f10543g, Math.min((getWidth() - childAt.getWidth()) / 2, (getHeight() - childAt.getHeight()) / 2));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f10538b = ofFloat;
            ofFloat.setDuration(this.f10544h);
            this.f10538b.setRepeatMode(1);
            this.f10538b.setRepeatCount(-1);
            this.f10538b.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f10538b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.ui.SpreadAnimLayout.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    SpreadAnimLayout.this.f10539c.f10550b = (int) ((1.0f - floatValue) * 255.0f);
                    SpreadAnimLayout.this.f10539c.f10549a.set(SpreadAnimLayout.this.f10540d);
                    float f6 = -((int) (SpreadAnimLayout.this.f10543g * floatValue));
                    SpreadAnimLayout.this.f10539c.f10549a.inset(f6, f6);
                    SpreadAnimLayout.this.postInvalidate();
                }
            });
            this.f10546k = true;
        }
        this.f10538b.start();
    }

    public SpreadAnimLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpreadAnimLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10545j = true;
        setWillNotDraw(false);
        int color = getResources().getColor(q.a(context, "color_spread", k.f19791d));
        this.f10543g = getResources().getDimensionPixelSize(q.a(getContext(), "myoffer_spread_max_distance_normal", "dimen"));
        this.f10542f = q.a(context, 4.0f);
        this.f10544h = 1000;
        Paint paint = new Paint();
        this.f10537a = paint;
        paint.setAntiAlias(true);
        this.f10537a.setAlpha(p.f8630b);
        this.f10537a.setColor(color);
        Paint paint2 = new Paint(1);
        this.i = paint2;
        paint2.setColor(-1);
        this.i.setStyle(Paint.Style.FILL);
        this.i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }
}
