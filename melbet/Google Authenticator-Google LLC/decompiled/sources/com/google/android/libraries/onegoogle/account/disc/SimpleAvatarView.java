package com.google.android.libraries.onegoogle.account.disc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.apps.authenticator2.R;
import defpackage.dih;
import defpackage.dja;
import defpackage.dpb;
import defpackage.e;
import defpackage.hoq;
import defpackage.wo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SimpleAvatarView extends dpb {
    private static final float d = (float) (Math.sqrt(2.0d) / 2.0d);
    public final Paint b;
    public int c;
    private final Paint e;
    private final RectF f;
    private final int g;
    private Drawable h;
    private int i;
    private Drawable j;
    private Drawable k;
    private int l;
    private int m;
    private int n;
    private wo o;
    private int p;
    private int q;

    public SimpleAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.e = paint;
        Paint paint2 = new Paint();
        this.b = paint2;
        this.f = new RectF();
        this.g = getResources().getDimensionPixelSize(R.dimen.og_apd_badge_wrapper_padding);
        this.i = Integer.MIN_VALUE;
        this.l = Integer.MIN_VALUE;
        this.m = Integer.MIN_VALUE;
        this.n = Integer.MIN_VALUE;
        this.p = 1;
        this.q = 1;
        paint2.setAntiAlias(true);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(getResources().getDimensionPixelSize(R.dimen.og_border_ring_thickness));
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.h = e.f(context, R.drawable.disc_oval);
        this.c = getResources().getColor(dja.r(true));
    }

    private final int s() {
        return (this.l - this.i) / 2;
    }

    private final void t(int i) {
        wo woVar = this.o;
        if (woVar == null || i == Integer.MIN_VALUE) {
            return;
        }
        woVar.a(Integer.valueOf(((dpb) this).a.d(i)));
    }

    private final void u() {
        float f;
        float strokeWidth;
        if (this.j == null || this.i == Integer.MIN_VALUE) {
            return;
        }
        RectF rectF = this.f;
        if (rectF.isEmpty()) {
            return;
        }
        Rect rect = new Rect();
        float p = p(this.i);
        hoq.H((this.i == Integer.MIN_VALUE || rectF.isEmpty()) ? false : true);
        int layoutDirection = getLayoutDirection();
        float centerX = rectF.centerX();
        if (this.p == 2) {
            float f2 = (this.i / 2.0f) * (w() ? d : 0.7241379f);
            f = layoutDirection == 1 ? centerX - f2 : centerX + f2;
        } else {
            float strokeWidth2 = this.b.getStrokeWidth() / 2.0f;
            float p2 = (p(this.i) / 2.0f) - this.g;
            f = layoutDirection == 1 ? (rectF.left - strokeWidth2) + p2 : (rectF.right + strokeWidth2) - p2;
        }
        hoq.H((this.i == Integer.MIN_VALUE || rectF.isEmpty()) ? false : true);
        float centerY = rectF.centerY();
        if (this.p == 2) {
            strokeWidth = centerY + ((this.i / 2.0f) * (w() ? d : 0.55172414f));
        } else {
            strokeWidth = (rectF.bottom + (this.b.getStrokeWidth() / 2.0f)) - (p(this.i) / 2.0f);
        }
        float f3 = p / 2.0f;
        new RectF(f - f3, strokeWidth - f3, f + f3, strokeWidth + f3).round(rect);
        this.j.setBounds(rect);
    }

    private final void v() {
        this.i = ((dpb) this).a.a(this.l);
        int intValue = ((Integer) dih.R(this).d(0)).intValue();
        int i = this.i;
        if (intValue < i) {
            q(i);
        }
        int s = s();
        int i2 = this.m;
        int i3 = this.i;
        setPaddingRelative(s, s, (i2 - i3) - s, (this.n - i3) - s);
        r();
        t(this.i);
    }

    private final boolean w() {
        return ((float) this.i) / getResources().getDisplayMetrics().density >= 80.0f;
    }

    @Override // defpackage.dpb
    public final int a() {
        return this.i;
    }

    @Override // defpackage.dpb
    public final Drawable b() {
        return this.k;
    }

    @Override // defpackage.dpb
    protected final void c() {
        if (this.l != Integer.MIN_VALUE) {
            v();
        }
    }

    @Override // defpackage.dpb
    protected final void d(wo woVar) {
        this.o = woVar;
        t(this.i);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.j;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // defpackage.dpb
    public final void g(Drawable drawable) {
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        u();
    }

    @Override // defpackage.dpb
    public final void i(boolean z) {
        int color = getResources().getColor(dja.r(z));
        this.c = color;
        Paint paint = this.b;
        paint.setColor(color);
        paint.setAlpha(30);
        Drawable drawable = this.h;
        dih.af(drawable, getResources().getColor(dja.s(z)));
        this.h = drawable;
        this.e.setColor(getResources().getColor(dja.q(z)));
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        if (drawable.equals(this.j) || drawable.equals(this.k)) {
            invalidate();
        }
    }

    @Override // defpackage.dpb
    public final void l() {
        setImageDrawable(this.h);
    }

    @Override // defpackage.dpb
    public final void m(Drawable drawable) {
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        r();
    }

    @Override // defpackage.dpb
    public final void o(int i, int i2) {
        this.p = i;
        this.q = i2;
        u();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDraw(Canvas canvas) {
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        super.onDraw(canvas);
        RectF rectF = this.f;
        Paint paint = this.b;
        canvas.drawArc(rectF, 0.0f, 360.0f, false, paint);
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            Rect bounds = drawable2.getBounds();
            float height = bounds.height() - paint.getStrokeWidth();
            if (this.q == 1) {
                canvas.drawCircle(bounds.centerX(), bounds.centerY(), height / 2.0f, this.e);
            }
            this.j.draw(canvas);
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.m = i;
        this.n = i2;
        this.l = Math.min(i, i2);
        v();
    }

    final int p(int i) {
        return dja.n(getResources(), i, this.p);
    }

    public final void q(int i) {
        setTag(R.id.og_avatar_size_hint, Integer.valueOf(i));
    }

    public final void r() {
        int i;
        if (this.m == Integer.MIN_VALUE || this.n == Integer.MIN_VALUE || (i = this.i) == Integer.MIN_VALUE) {
            this.f.setEmpty();
        } else {
            RectF rectF = this.f;
            float f = i;
            rectF.set(0.0f, 0.0f, f, f);
            rectF.offset(getLayoutDirection() == 1 ? (this.m - this.i) - r0 : r0, s());
            rectF.inset(1.0f, 1.0f);
            int d2 = ((dpb) this).a.d(this.i);
            int c = ((dpb) this).a.c(this.i);
            if (this.k != null) {
                RectF rectF2 = new RectF(rectF);
                float f2 = ((-d2) - c) - 2;
                rectF2.inset(f2, f2);
                Rect rect = new Rect();
                rectF2.roundOut(rect);
                this.k.setBounds(rect);
            }
        }
        u();
        invalidate();
    }

    @Override // defpackage.dpb
    public final void f(int i) {
    }

    @Override // defpackage.dpb
    public final void h(boolean z) {
    }

    public SimpleAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SimpleAvatarView(Context context) {
        this(context, null);
    }
}
