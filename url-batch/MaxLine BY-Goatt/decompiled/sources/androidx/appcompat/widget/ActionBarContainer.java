package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.majelw.libystne.R;
import defpackage.b62;
import defpackage.dg2;
import defpackage.r2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public boolean m;
    public View n;
    public View o;
    public Drawable p;
    public Drawable q;
    public Drawable r;
    public final boolean s;
    public boolean t;
    public final int u;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new r2(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b62.a);
        boolean z = false;
        this.p = obtainStyledAttributes.getDrawable(0);
        this.q = obtainStyledAttributes.getDrawable(2);
        this.u = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.s = true;
            this.r = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.s ? !(this.p != null || this.q != null) : this.r == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.p;
        if (drawable != null && drawable.isStateful()) {
            this.p.setState(getDrawableState());
        }
        Drawable drawable2 = this.q;
        if (drawable2 != null && drawable2.isStateful()) {
            this.q.setState(getDrawableState());
        }
        Drawable drawable3 = this.r;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.r.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.q;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.r;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.n = findViewById(R.id.action_bar);
        this.o = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.m || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.s) {
            Drawable drawable = this.r;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.p == null) {
                z2 = false;
            } else if (this.n.getVisibility() == 0) {
                this.p.setBounds(this.n.getLeft(), this.n.getTop(), this.n.getRight(), this.n.getBottom());
            } else {
                View view = this.o;
                if (view == null || view.getVisibility() != 0) {
                    this.p.setBounds(0, 0, 0, 0);
                } else {
                    this.p.setBounds(this.o.getLeft(), this.o.getTop(), this.o.getRight(), this.o.getBottom());
                }
            }
            this.t = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.n == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.u) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.n == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.p;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.p);
        }
        this.p = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.n;
            if (view != null) {
                this.p.setBounds(view.getLeft(), this.n.getTop(), this.n.getRight(), this.n.getBottom());
            }
        }
        boolean z = false;
        if (!this.s ? !(this.p != null || this.q != null) : this.r == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.r;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.r);
        }
        this.r = drawable;
        boolean z = this.s;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.r) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.p != null || this.q != null) : this.r == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.q;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.q);
        }
        this.q = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.t && this.q != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.s ? !(this.p != null || this.q != null) : this.r == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z) {
        this.m = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.p;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.q;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.r;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.p;
        boolean z = this.s;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.q && this.t) {
            return true;
        }
        return (drawable == this.r && z) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public void setTabContainer(dg2 dg2Var) {
    }
}
