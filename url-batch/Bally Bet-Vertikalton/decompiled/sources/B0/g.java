package B0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import l.AbstractC0272y0;
import n0.AbstractC0279a;

/* loaded from: classes.dex */
public abstract class g extends AbstractC0272y0 {

    /* renamed from: p, reason: collision with root package name */
    public Drawable f116p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f117q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f118r;

    /* renamed from: s, reason: collision with root package name */
    public int f119s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f120t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f121u;

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f117q = new Rect();
        this.f118r = new Rect();
        this.f119s = 119;
        this.f120t = true;
        this.f121u = false;
        int[] iArr = AbstractC0279a.h;
        o.a(context, attributeSet, 0, 0);
        o.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f119s = obtainStyledAttributes.getInt(1, this.f119s);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f120t = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f116p;
        if (drawable != null) {
            if (this.f121u) {
                this.f121u = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z2 = this.f120t;
                Rect rect = this.f117q;
                if (z2) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.f119s;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f118r;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.f116p;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f116p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f116p.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f116p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f119s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f116p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // l.AbstractC0272y0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        this.f121u = z2 | this.f121u;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f121u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f116p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f116p);
            }
            this.f116p = drawable;
            this.f121u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f119s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f119s != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f119s = i;
            if (i == 119 && this.f116p != null) {
                this.f116p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f116p;
    }
}
