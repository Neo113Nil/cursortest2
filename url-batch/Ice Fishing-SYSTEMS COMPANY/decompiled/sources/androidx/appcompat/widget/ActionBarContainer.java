package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.icefishing.icefishingliveapp.C5284R;
import g.AbstractC4518a;
import m.C4725b;
import m.L0;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: A, reason: collision with root package name */
    public boolean f4616A;

    /* renamed from: B, reason: collision with root package name */
    public final int f4617B;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4618n;

    /* renamed from: u, reason: collision with root package name */
    public View f4619u;

    /* renamed from: v, reason: collision with root package name */
    public View f4620v;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f4621w;

    /* renamed from: x, reason: collision with root package name */
    public Drawable f4622x;

    /* renamed from: y, reason: collision with root package name */
    public Drawable f4623y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f4624z;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C4725b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4518a.f37818a);
        boolean z8 = false;
        this.f4621w = obtainStyledAttributes.getDrawable(0);
        this.f4622x = obtainStyledAttributes.getDrawable(2);
        this.f4617B = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == C5284R.id.split_action_bar) {
            this.f4624z = true;
            this.f4623y = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f4624z ? !(this.f4621w != null || this.f4622x != null) : this.f4623y == null) {
            z8 = true;
        }
        setWillNotDraw(z8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f4621w;
        if (drawable != null && drawable.isStateful()) {
            this.f4621w.setState(getDrawableState());
        }
        Drawable drawable2 = this.f4622x;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f4622x.setState(getDrawableState());
        }
        Drawable drawable3 = this.f4623y;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f4623y.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4621w;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f4622x;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f4623y;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f4619u = findViewById(C5284R.id.action_bar);
        this.f4620v = findViewById(C5284R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f4618n || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i, int i4, int i9, int i10) {
        super.onLayout(z8, i, i4, i9, i10);
        boolean z9 = true;
        if (this.f4624z) {
            Drawable drawable = this.f4623y;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z9 = false;
            }
        } else {
            if (this.f4621w == null) {
                z9 = false;
            } else if (this.f4619u.getVisibility() == 0) {
                this.f4621w.setBounds(this.f4619u.getLeft(), this.f4619u.getTop(), this.f4619u.getRight(), this.f4619u.getBottom());
            } else {
                View view = this.f4620v;
                if (view == null || view.getVisibility() != 0) {
                    this.f4621w.setBounds(0, 0, 0, 0);
                } else {
                    this.f4621w.setBounds(this.f4620v.getLeft(), this.f4620v.getTop(), this.f4620v.getRight(), this.f4620v.getBottom());
                }
            }
            this.f4616A = false;
        }
        if (z9) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        int i9;
        if (this.f4619u == null && View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE && (i9 = this.f4617B) >= 0) {
            i4 = View.MeasureSpec.makeMeasureSpec(Math.min(i9, View.MeasureSpec.getSize(i4)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i4);
        if (this.f4619u == null) {
            return;
        }
        View.MeasureSpec.getMode(i4);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f4621w;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f4621w);
        }
        this.f4621w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f4619u;
            if (view != null) {
                this.f4621w.setBounds(view.getLeft(), this.f4619u.getTop(), this.f4619u.getRight(), this.f4619u.getBottom());
            }
        }
        boolean z8 = false;
        if (!this.f4624z ? !(this.f4621w != null || this.f4622x != null) : this.f4623y == null) {
            z8 = true;
        }
        setWillNotDraw(z8);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f4623y;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f4623y);
        }
        this.f4623y = drawable;
        boolean z8 = this.f4624z;
        boolean z9 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z8 && (drawable2 = this.f4623y) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z8 ? !(this.f4621w != null || this.f4622x != null) : this.f4623y == null) {
            z9 = true;
        }
        setWillNotDraw(z9);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f4622x;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f4622x);
        }
        this.f4622x = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f4616A && this.f4622x != null) {
                throw null;
            }
        }
        boolean z8 = false;
        if (!this.f4624z ? !(this.f4621w != null || this.f4622x != null) : this.f4623y == null) {
            z8 = true;
        }
        setWillNotDraw(z8);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z8) {
        this.f4618n = z8;
        setDescendantFocusability(z8 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z8 = i == 0;
        Drawable drawable = this.f4621w;
        if (drawable != null) {
            drawable.setVisible(z8, false);
        }
        Drawable drawable2 = this.f4622x;
        if (drawable2 != null) {
            drawable2.setVisible(z8, false);
        }
        Drawable drawable3 = this.f4623y;
        if (drawable3 != null) {
            drawable3.setVisible(z8, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f4621w;
        boolean z8 = this.f4624z;
        if (drawable == drawable2 && !z8) {
            return true;
        }
        if (drawable == this.f4622x && this.f4616A) {
            return true;
        }
        return (drawable == this.f4623y && z8) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public void setTabContainer(L0 l02) {
    }
}
