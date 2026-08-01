package a2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import k.u1;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class h extends u1 {

    /* renamed from: u, reason: collision with root package name */
    public Drawable f41u;

    /* renamed from: v, reason: collision with root package name */
    public final Rect f42v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f43w;

    /* renamed from: x, reason: collision with root package name */
    public int f44x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f45y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f46z;

    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f42v = new Rect();
        this.f43w = new Rect();
        this.f44x = 119;
        this.f45y = true;
        this.f46z = false;
        p.a(context, attributeSet, 0, 0);
        int[] iArr = l1.a.f2863i;
        p.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f44x = obtainStyledAttributes.getInt(1, this.f44x);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f45y = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f41u;
        if (drawable != null) {
            if (this.f46z) {
                this.f46z = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z3 = this.f45y;
                Rect rect = this.f42v;
                if (z3) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i4 = this.f44x;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f43w;
                Gravity.apply(i4, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f4, float f5) {
        super.drawableHotspotChanged(f4, f5);
        Drawable drawable = this.f41u;
        if (drawable != null) {
            drawable.setHotspot(f4, f5);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f41u;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f41u.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f41u;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f44x;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f41u;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // k.u1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        this.f46z = z3 | this.f46z;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        this.f46z = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f41u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f41u);
            }
            this.f41u = drawable;
            this.f46z = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f44x == 119) {
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
    public void setForegroundGravity(int i4) {
        if (this.f44x != i4) {
            if ((8388615 & i4) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            this.f44x = i4;
            if (i4 == 119 && this.f41u != null) {
                this.f41u.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f41u;
    }
}
