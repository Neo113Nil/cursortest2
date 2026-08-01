package i2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import l.u1;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class g extends u1 {

    /* renamed from: u, reason: collision with root package name */
    public Drawable f2041u;

    /* renamed from: v, reason: collision with root package name */
    public final Rect f2042v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f2043w;

    /* renamed from: x, reason: collision with root package name */
    public int f2044x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f2045y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2046z;

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2042v = new Rect();
        this.f2043w = new Rect();
        this.f2044x = 119;
        this.f2045y = true;
        this.f2046z = false;
        o.a(context, attributeSet, 0, 0);
        int[] iArr = q1.a.f3148l;
        o.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f2044x = obtainStyledAttributes.getInt(1, this.f2044x);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f2045y = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f2041u;
        if (drawable != null) {
            if (this.f2046z) {
                this.f2046z = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z4 = this.f2045y;
                Rect rect = this.f2042v;
                if (z4) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.f2044x;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f2043w;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f5, float f6) {
        super.drawableHotspotChanged(f5, f6);
        Drawable drawable = this.f2041u;
        if (drawable != null) {
            drawable.setHotspot(f5, f6);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2041u;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f2041u.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f2041u;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f2044x;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2041u;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // l.u1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i4, int i5, int i6) {
        super.onLayout(z4, i, i4, i5, i6);
        this.f2046z = z4 | this.f2046z;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i4, int i5, int i6) {
        super.onSizeChanged(i, i4, i5, i6);
        this.f2046z = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f2041u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f2041u);
            }
            this.f2041u = drawable;
            this.f2046z = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f2044x == 119) {
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
        if (this.f2044x != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f2044x = i;
            if (i == 119 && this.f2041u != null) {
                this.f2041u.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2041u;
    }
}
