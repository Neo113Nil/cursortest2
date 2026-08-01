package B0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import l.AbstractC0299z0;
import n0.AbstractC0303a;

/* loaded from: classes.dex */
public abstract class g extends AbstractC0299z0 {

    /* renamed from: p, reason: collision with root package name */
    public Drawable f125p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f126q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f127r;

    /* renamed from: s, reason: collision with root package name */
    public int f128s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f129t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f130u;

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f126q = new Rect();
        this.f127r = new Rect();
        this.f128s = 119;
        this.f129t = true;
        this.f130u = false;
        int[] iArr = AbstractC0303a.h;
        o.a(context, attributeSet, 0, 0);
        o.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f128s = obtainStyledAttributes.getInt(1, this.f128s);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f129t = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f125p;
        if (drawable != null) {
            if (this.f130u) {
                this.f130u = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z2 = this.f129t;
                Rect rect = this.f126q;
                if (z2) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.f128s;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f127r;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.f125p;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f125p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f125p.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f125p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f128s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f125p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // l.AbstractC0299z0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        this.f130u = z2 | this.f130u;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f130u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f125p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f125p);
            }
            this.f125p = drawable;
            this.f130u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f128s == 119) {
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
        if (this.f128s != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f128s = i;
            if (i == 119 && this.f125p != null) {
                this.f125p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f125p;
    }
}
