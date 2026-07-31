package r5;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import l.b1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class d extends b1 {

    /* renamed from: s, reason: collision with root package name */
    public Drawable f6653s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f6654t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f6655u;

    /* renamed from: v, reason: collision with root package name */
    public int f6656v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f6657w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f6658x;

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f6654t = new Rect();
        this.f6655u = new Rect();
        this.f6656v = 119;
        this.f6657w = true;
        this.f6658x = false;
        k.a(context, attributeSet, 0, 0);
        int[] iArr = f5.a.f2743h;
        k.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f6656v = obtainStyledAttributes.getInt(1, this.f6656v);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f6657w = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f6653s;
        if (drawable != null) {
            if (this.f6658x) {
                this.f6658x = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z3 = this.f6657w;
                Rect rect = this.f6654t;
                if (z3) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.f6656v;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f6655u;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f6, float f8) {
        super.drawableHotspotChanged(f6, f8);
        Drawable drawable = this.f6653s;
        if (drawable != null) {
            drawable.setHotspot(f6, f8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f6653s;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f6653s.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f6653s;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f6656v;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f6653s;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // l.b1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i8, int i9, int i10) {
        super.onLayout(z3, i, i8, i9, i10);
        this.f6658x = z3 | this.f6658x;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i8, int i9, int i10) {
        super.onSizeChanged(i, i8, i9, i10);
        this.f6658x = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f6653s;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f6653s);
            }
            this.f6653s = drawable;
            this.f6658x = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f6656v == 119) {
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
        if (this.f6656v != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f6656v = i;
            if (i == 119 && this.f6653s != null) {
                this.f6653s.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f6653s;
    }
}
