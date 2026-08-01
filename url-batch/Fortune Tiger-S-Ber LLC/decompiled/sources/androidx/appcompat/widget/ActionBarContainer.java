package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.gglhk.bofio.fortunetiger.R;
import e.a;
import k.b;
import k.m2;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    public boolean f175f;
    public View g;
    public View h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f176i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f177j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f178k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f179l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f180m;

    /* renamed from: n, reason: collision with root package name */
    public final int f181n;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1495a);
        boolean z3 = false;
        this.f176i = obtainStyledAttributes.getDrawable(0);
        this.f177j = obtainStyledAttributes.getDrawable(2);
        this.f181n = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f179l = true;
            this.f178k = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f179l ? !(this.f176i != null || this.f177j != null) : this.f178k == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f176i;
        if (drawable != null && drawable.isStateful()) {
            this.f176i.setState(getDrawableState());
        }
        Drawable drawable2 = this.f177j;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f177j.setState(getDrawableState());
        }
        Drawable drawable3 = this.f178k;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f178k.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f176i;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f177j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f178k;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.g = findViewById(R.id.action_bar);
        this.h = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f175f || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        boolean z4 = true;
        if (this.f179l) {
            Drawable drawable = this.f178k;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z4 = false;
            }
        } else {
            if (this.f176i == null) {
                z4 = false;
            } else if (this.g.getVisibility() == 0) {
                this.f176i.setBounds(this.g.getLeft(), this.g.getTop(), this.g.getRight(), this.g.getBottom());
            } else {
                View view = this.h;
                if (view == null || view.getVisibility() != 0) {
                    this.f176i.setBounds(0, 0, 0, 0);
                } else {
                    this.f176i.setBounds(this.h.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom());
                }
            }
            this.f180m = false;
        }
        if (z4) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        if (this.g == null && View.MeasureSpec.getMode(i5) == Integer.MIN_VALUE && (i6 = this.f181n) >= 0) {
            i5 = View.MeasureSpec.makeMeasureSpec(Math.min(i6, View.MeasureSpec.getSize(i5)), Integer.MIN_VALUE);
        }
        super.onMeasure(i4, i5);
        if (this.g == null) {
            return;
        }
        View.MeasureSpec.getMode(i5);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f176i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f176i);
        }
        this.f176i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.g;
            if (view != null) {
                this.f176i.setBounds(view.getLeft(), this.g.getTop(), this.g.getRight(), this.g.getBottom());
            }
        }
        boolean z3 = false;
        if (!this.f179l ? !(this.f176i != null || this.f177j != null) : this.f178k == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f178k;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f178k);
        }
        this.f178k = drawable;
        boolean z3 = this.f179l;
        boolean z4 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z3 && (drawable2 = this.f178k) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z3 ? !(this.f176i != null || this.f177j != null) : this.f178k == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f177j;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f177j);
        }
        this.f177j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f180m && this.f177j != null) {
                throw null;
            }
        }
        boolean z3 = false;
        if (!this.f179l ? !(this.f176i != null || this.f177j != null) : this.f178k == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z3) {
        this.f175f = z3;
        setDescendantFocusability(z3 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        boolean z3 = i4 == 0;
        Drawable drawable = this.f176i;
        if (drawable != null) {
            drawable.setVisible(z3, false);
        }
        Drawable drawable2 = this.f177j;
        if (drawable2 != null) {
            drawable2.setVisible(z3, false);
        }
        Drawable drawable3 = this.f178k;
        if (drawable3 != null) {
            drawable3.setVisible(z3, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f176i;
        boolean z3 = this.f179l;
        if (drawable == drawable2 && !z3) {
            return true;
        }
        if (drawable == this.f177j && this.f180m) {
            return true;
        }
        return (drawable == this.f178k && z3) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i4) {
        if (i4 != 0) {
            return super.startActionModeForChild(view, callback, i4);
        }
        return null;
    }

    public void setTabContainer(m2 m2Var) {
    }
}
