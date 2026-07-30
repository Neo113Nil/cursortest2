package w3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import i3.AbstractC4576a;
import m.AbstractC4763u0;

/* renamed from: w3.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5165d extends AbstractC4763u0 {

    /* renamed from: I, reason: collision with root package name */
    public Drawable f41652I;
    public final Rect J;

    /* renamed from: K, reason: collision with root package name */
    public final Rect f41653K;

    /* renamed from: L, reason: collision with root package name */
    public int f41654L;

    /* renamed from: M, reason: collision with root package name */
    public final boolean f41655M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f41656N;

    public AbstractC5165d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.J = new Rect();
        this.f41653K = new Rect();
        this.f41654L = 119;
        this.f41655M = true;
        this.f41656N = false;
        int[] iArr = AbstractC4576a.f38299h;
        k.a(context, attributeSet, 0, 0);
        k.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f41654L = obtainStyledAttributes.getInt(1, this.f41654L);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f41655M = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f41652I;
        if (drawable != null) {
            if (this.f41656N) {
                this.f41656N = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z8 = this.f41655M;
                Rect rect = this.J;
                if (z8) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.f41654L;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f41653K;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f6, float f9) {
        super.drawableHotspotChanged(f6, f9);
        Drawable drawable = this.f41652I;
        if (drawable != null) {
            drawable.setHotspot(f6, f9);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f41652I;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f41652I.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f41652I;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f41654L;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f41652I;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // m.AbstractC4763u0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i, int i4, int i9, int i10) {
        super.onLayout(z8, i, i4, i9, i10);
        this.f41656N = z8 | this.f41656N;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i4, int i9, int i10) {
        super.onSizeChanged(i, i4, i9, i10);
        this.f41656N = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f41652I;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f41652I);
            }
            this.f41652I = drawable;
            this.f41656N = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f41654L == 119) {
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
        if (this.f41654L != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f41654L = i;
            if (i == 119 && this.f41652I != null) {
                this.f41652I.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f41652I;
    }
}
