package e2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import l.x1;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class d extends x1 {

    /* renamed from: u, reason: collision with root package name */
    public Drawable f1207u;

    /* renamed from: v, reason: collision with root package name */
    public final Rect f1208v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f1209w;

    /* renamed from: x, reason: collision with root package name */
    public int f1210x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f1211y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1212z;

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1208v = new Rect();
        this.f1209w = new Rect();
        this.f1210x = 119;
        this.f1211y = true;
        this.f1212z = false;
        o.a(context, attributeSet, 0, 0);
        int[] iArr = n1.a.f2817j;
        o.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f1210x = obtainStyledAttributes.getInt(1, this.f1210x);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f1211y = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f1207u;
        if (drawable != null) {
            if (this.f1212z) {
                this.f1212z = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z3 = this.f1211y;
                Rect rect = this.f1208v;
                if (z3) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.f1210x;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f1209w;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f2, float f4) {
        super.drawableHotspotChanged(f2, f4);
        Drawable drawable = this.f1207u;
        if (drawable != null) {
            drawable.setHotspot(f2, f4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1207u;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f1207u.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f1207u;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f1210x;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1207u;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // l.x1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        super.onLayout(z3, i, i4, i5, i6);
        this.f1212z = z3 | this.f1212z;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i4, int i5, int i6) {
        super.onSizeChanged(i, i4, i5, i6);
        this.f1212z = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f1207u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f1207u);
            }
            this.f1207u = drawable;
            this.f1212z = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f1210x == 119) {
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
        if (this.f1210x != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f1210x = i;
            if (i == 119 && this.f1207u != null) {
                this.f1207u.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1207u;
    }
}
