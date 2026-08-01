package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.appsflyer.R;
import m.a;
import m.m1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f394d;

    /* renamed from: e, reason: collision with root package name */
    public View f395e;

    /* renamed from: i, reason: collision with root package name */
    public View f396i;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f397r;

    /* renamed from: s, reason: collision with root package name */
    public Drawable f398s;

    /* renamed from: t, reason: collision with root package name */
    public Drawable f399t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f400u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f401v;

    /* renamed from: w, reason: collision with root package name */
    public final int f402w;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new a(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a.f4540a);
        boolean z10 = false;
        this.f397r = obtainStyledAttributes.getDrawable(0);
        this.f398s = obtainStyledAttributes.getDrawable(2);
        this.f402w = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f400u = true;
            this.f399t = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f400u ? !(this.f397r != null || this.f398s != null) : this.f399t == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f397r;
        if (drawable != null && drawable.isStateful()) {
            this.f397r.setState(getDrawableState());
        }
        Drawable drawable2 = this.f398s;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f398s.setState(getDrawableState());
        }
        Drawable drawable3 = this.f399t;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f399t.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f397r;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f398s;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f399t;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f395e = findViewById(R.id.action_bar);
        this.f396i = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f394d || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        boolean z11 = true;
        if (this.f400u) {
            Drawable drawable = this.f399t;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z11 = false;
            }
        } else {
            if (this.f397r == null) {
                z11 = false;
            } else if (this.f395e.getVisibility() == 0) {
                this.f397r.setBounds(this.f395e.getLeft(), this.f395e.getTop(), this.f395e.getRight(), this.f395e.getBottom());
            } else {
                View view = this.f396i;
                if (view == null || view.getVisibility() != 0) {
                    this.f397r.setBounds(0, 0, 0, 0);
                } else {
                    this.f397r.setBounds(this.f396i.getLeft(), this.f396i.getTop(), this.f396i.getRight(), this.f396i.getBottom());
                }
            }
            this.f401v = false;
        }
        if (z11) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        if (this.f395e == null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE && (i11 = this.f402w) >= 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i11, View.MeasureSpec.getSize(i10)), Integer.MIN_VALUE);
        }
        super.onMeasure(i3, i10);
        if (this.f395e == null) {
            return;
        }
        View.MeasureSpec.getMode(i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f397r;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f397r);
        }
        this.f397r = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f395e;
            if (view != null) {
                this.f397r.setBounds(view.getLeft(), this.f395e.getTop(), this.f395e.getRight(), this.f395e.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f400u ? !(this.f397r != null || this.f398s != null) : this.f399t == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f399t;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f399t);
        }
        this.f399t = drawable;
        boolean z10 = this.f400u;
        boolean z11 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z10 && (drawable2 = this.f399t) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z10 ? !(this.f397r != null || this.f398s != null) : this.f399t == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f398s;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f398s);
        }
        this.f398s = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f401v && this.f398s != null) {
                throw null;
            }
        }
        boolean z10 = false;
        if (!this.f400u ? !(this.f397r != null || this.f398s != null) : this.f399t == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z10) {
        this.f394d = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        boolean z10 = i3 == 0;
        Drawable drawable = this.f397r;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f398s;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f399t;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i3) {
        if (i3 != 0) {
            return super.startActionModeForChild(view, callback, i3);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f397r;
        boolean z10 = this.f400u;
        if (drawable == drawable2 && !z10) {
            return true;
        }
        if (drawable == this.f398s && this.f401v) {
            return true;
        }
        return (drawable == this.f399t && z10) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public void setTabContainer(m1 m1Var) {
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }
}
