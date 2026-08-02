package com.google.android.libraries.onegoogle.account.disc;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.apps.authenticator2.R;
import defpackage.cov;
import defpackage.dih;
import defpackage.dja;
import defpackage.dpb;
import defpackage.dpm;
import defpackage.dqq;
import defpackage.e;
import defpackage.hoq;
import defpackage.wo;
import defpackage.yq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AvatarView extends dpb {
    private final Paint b;
    private final Paint c;
    private final RectF d;
    private final Path e;
    private final Path f;
    private final int g;
    private Drawable h;
    private int i;
    private float j;
    private Drawable k;
    private Drawable l;
    private int m;
    private final Path n;
    private float o;
    private boolean p;
    private boolean q;
    private wo r;
    private int s;
    private int t;
    private boolean u;
    private Runnable v;
    private boolean w;

    public AvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.b = paint;
        Paint paint2 = new Paint();
        this.c = paint2;
        this.d = new RectF();
        this.e = new Path();
        this.f = new Path();
        this.g = getResources().getDimensionPixelSize(R.dimen.og_apd_badge_wrapper_padding);
        this.i = Integer.MIN_VALUE;
        this.m = Integer.MIN_VALUE;
        this.n = new Path();
        this.o = 1.0f;
        this.r = new dpm();
        this.s = Integer.MIN_VALUE;
        this.t = Integer.MIN_VALUE;
        this.v = new cov(3);
        this.w = true;
        paint2.setAntiAlias(true);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(getResources().getDimensionPixelSize(R.dimen.og_border_ring_thickness));
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.h = e.f(context, R.drawable.disc_oval);
    }

    private static void r(Drawable drawable, Drawable drawable2, boolean z) {
        boolean z2 = true;
        if ((drawable != null || drawable2 != null) && !z) {
            z2 = false;
        }
        hoq.I(z2, "setting ring/badge is only allowed with allowDecorations");
    }

    private static void s(float f, Drawable drawable) {
        boolean z = true;
        if (f != 1.0f && drawable != null && !(drawable instanceof dqq)) {
            z = false;
        }
        hoq.I(z, "Scaling is not allowed when there is a ring drawable and it's not scalable.");
    }

    private final void t(int i) {
        if (i != Integer.MIN_VALUE) {
            this.r.a(Integer.valueOf(((dpb) this).a.d(i)));
        }
    }

    private final void u(int i) {
        int i2 = this.i;
        this.i = i;
        if (i2 == Integer.MIN_VALUE) {
            this.v.run();
        }
        w(this.s, this.t, i);
        y();
        t(i);
    }

    private final void v() {
        Path path = this.f;
        path.rewind();
        Rect rect = new Rect();
        if (Math.min(this.s, this.t) != Integer.MIN_VALUE && this.i != Integer.MIN_VALUE) {
            RectF rectF = this.d;
            if (!rectF.isEmpty() && this.j != 0.0f) {
                float p = p(this.i) * this.j;
                hoq.H((this.i == Integer.MIN_VALUE || rectF.isEmpty()) ? false : true);
                int i = yq.a;
                int layoutDirection = getLayoutDirection();
                float f = rectF.left;
                Paint paint = this.c;
                float strokeWidth = f - (paint.getStrokeWidth() / 2.0f);
                float strokeWidth2 = rectF.right + (paint.getStrokeWidth() / 2.0f);
                float p2 = p(this.i);
                float f2 = this.g;
                float f3 = (p2 / 2.0f) - f2;
                float f4 = layoutDirection == 1 ? strokeWidth + f3 : strokeWidth2 - f3;
                float f5 = p / 2.0f;
                hoq.H((this.i == Integer.MIN_VALUE || rectF.isEmpty()) ? false : true);
                float strokeWidth3 = (rectF.bottom + (paint.getStrokeWidth() / 2.0f)) - (p(this.i) / 2.0f);
                path.addCircle(f4, strokeWidth3, (f2 * this.j) + f5, Path.Direction.CW);
                new RectF(f4 - f5, strokeWidth3 - f5, f4 + f5, strokeWidth3 + f5).round(rect);
            }
        }
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Path path2 = this.e;
        if (!path2.isEmpty()) {
            path2.rewind();
        }
        if (!path.isEmpty()) {
            RectF rectF2 = this.d;
            if (!rectF2.isEmpty() && this.w) {
                path2.addOval(rectF2, Path.Direction.CW);
                path2.op(path2, path, Path.Op.DIFFERENCE);
            }
        }
        invalidate();
    }

    private final void w(int i, int i2, int i3) {
        if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE) {
            return;
        }
        int min = Math.min(i, i2);
        int i4 = (min - i3) / 2;
        setPadding(i4, i4, (i + i4) - min, (i2 + i4) - min);
    }

    private final void x(Drawable drawable, int i) {
        int d = ((dpb) this).a.d(this.i);
        if (drawable == null || i == Integer.MIN_VALUE || i == d) {
            Path path = this.n;
            if (path.isEmpty()) {
                return;
            }
            path.rewind();
            invalidate();
            return;
        }
        Path path2 = this.n;
        path2.rewind();
        RectF rectF = new RectF(drawable.getBounds());
        float f = d - i;
        rectF.inset(f, f);
        path2.addOval(rectF, Path.Direction.CW);
        invalidate();
    }

    private final void y() {
        int i;
        if (Math.min(this.s, this.t) == Integer.MIN_VALUE || (i = this.i) == Integer.MIN_VALUE) {
            this.d.setEmpty();
        } else {
            RectF rectF = this.d;
            float f = i;
            rectF.set(0.0f, 0.0f, f, f);
            float f2 = (int) ((r0 - this.i) / 2.0f);
            rectF.offset(f2, f2);
            rectF.inset(1.0f, 1.0f);
            int d = ((dpb) this).a.d(this.i);
            int c = ((dpb) this).a.c(this.i);
            if (this.l != null) {
                RectF rectF2 = new RectF(rectF);
                int b = ((dpb) this).a.b(this.i);
                float round = ((b - Math.round(this.o * b)) / 2) - ((d + c) + 2);
                rectF2.inset(round, round);
                Rect rect = new Rect();
                rectF2.roundOut(rect);
                this.l.setBounds(rect);
                x(this.l, this.m);
            }
        }
        v();
        invalidate();
    }

    @Override // defpackage.dpb
    public final int a() {
        return this.i;
    }

    @Override // defpackage.dpb
    public final Drawable b() {
        return this.l;
    }

    @Override // defpackage.dpb
    protected final void c() {
        int min = Math.min(this.s, this.t);
        if (min != Integer.MIN_VALUE) {
            u(this.u ? this.i : ((dpb) this).a.a(min));
            invalidate();
        }
    }

    @Override // defpackage.dpb
    protected final void d(wo woVar) {
        this.r = woVar;
        t(this.i);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.k;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // defpackage.dpb
    public final void e() {
        if (this.p) {
            return;
        }
        this.p = true;
        invalidate();
    }

    @Override // defpackage.dpb
    public final void f(int i) {
        this.u = true;
        q(i);
        u(i);
    }

    @Override // defpackage.dpb
    public final void g(Drawable drawable) {
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.k = drawable;
        r(this.l, drawable, this.p);
        Drawable drawable3 = this.k;
        if (drawable3 != null) {
            drawable3.setCallback(this);
        }
        v();
    }

    @Override // defpackage.dpb
    public final void h(boolean z) {
        this.q = z;
        invalidate();
    }

    @Override // defpackage.dpb
    public final void i(boolean z) {
        int color = getResources().getColor(dja.r(z));
        Paint paint = this.c;
        paint.setColor(color);
        paint.setAlpha(30);
        Drawable drawable = this.h;
        dih.af(drawable, getResources().getColor(dja.s(z)));
        this.h = drawable;
        this.b.setColor(getResources().getColor(dja.q(z)));
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        if (drawable.equals(this.k) || drawable.equals(this.l)) {
            invalidate();
        }
    }

    @Override // defpackage.dpb
    public final void k(Runnable runnable) {
        this.v = runnable;
        if (this.i != Integer.MIN_VALUE) {
            runnable.run();
        }
    }

    @Override // defpackage.dpb
    public final void l() {
        setImageDrawable(this.h);
    }

    @Override // defpackage.dpb
    public final void m(Drawable drawable) {
        s(this.o, drawable);
        r(drawable, this.k, this.p);
        Drawable drawable2 = this.l;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.l = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        y();
    }

    @Override // defpackage.dpb
    public final void n(float f) {
        s(f, this.l);
        this.o = f;
        y();
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Drawable drawable;
        int i;
        Path path = this.f;
        boolean z = false;
        if (!path.isEmpty() && this.w) {
            z = true;
        }
        if (z) {
            canvas.save();
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
        if (this.l != null) {
            Path path2 = this.n;
            if (path2.isEmpty()) {
                this.l.draw(canvas);
            } else {
                canvas.save();
                canvas.clipPath(path2);
                this.l.draw(canvas);
                canvas.restore();
            }
        }
        float a = (!this.p || (i = this.i) == Integer.MIN_VALUE) ? this.o : ((dpb) this).a.a(Math.round(this.o * ((dpb) this).a.b(i))) / this.i;
        float min = Math.min(this.s, this.t) / 2.0f;
        canvas.scale(a, a, min, min);
        super.onDraw(canvas);
        if (z) {
            canvas.restore();
        }
        if (!this.q) {
            return;
        }
        Path path3 = this.e;
        if (path3.isEmpty()) {
            RectF rectF = this.d;
            if (!rectF.isEmpty()) {
                canvas2 = canvas;
                canvas2.drawArc(rectF, 0.0f, 360.0f, false, this.c);
                drawable = this.k;
                if (drawable == null) {
                    float height = drawable.getBounds().height();
                    Paint paint = this.c;
                    float strokeWidth = (height - paint.getStrokeWidth()) / 2.0f;
                    canvas2.drawCircle(r11.centerX(), r11.centerY(), strokeWidth, this.b);
                    this.k.draw(canvas2);
                    if (this.w) {
                        canvas2.drawCircle(r11.centerX(), r11.centerY(), strokeWidth, paint);
                        return;
                    }
                    return;
                }
                return;
            }
        } else {
            canvas.drawPath(path3, this.c);
        }
        canvas2 = canvas;
        drawable = this.k;
        if (drawable == null) {
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.s = i;
        this.t = i2;
        w(i, i2, this.i);
        y();
        if (this.u) {
            return;
        }
        int min = Math.min(i, i2);
        if (this.p) {
            min = ((dpb) this).a.a(min);
        }
        if (((Integer) dih.R(this).d(0)).intValue() < min) {
            q(min);
        }
        u(min);
    }

    final int p(int i) {
        Resources resources = getResources();
        resources.getClass();
        return dja.n(resources, i, 1);
    }

    public final void q(int i) {
        setTag(R.id.og_avatar_size_hint, Integer.valueOf(i));
    }

    public void setBadgeScale(float f) {
        this.j = f;
        v();
    }

    protected void setCurrRingThickness(int i) {
        if (i == this.m) {
            return;
        }
        this.m = i;
        x(this.l, i);
    }

    public AvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AvatarView(Context context) {
        this(context, null);
    }
}
