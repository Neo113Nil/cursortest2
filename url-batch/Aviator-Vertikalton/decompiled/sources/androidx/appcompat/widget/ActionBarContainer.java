package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.fortuneink.neonpad.R;
import f.a;
import l.C0250b;
import l.R0;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f981a;

    /* renamed from: b, reason: collision with root package name */
    public View f982b;

    /* renamed from: c, reason: collision with root package name */
    public View f983c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f984d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f985e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f986f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f987g;
    public boolean h;
    public final int i;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C0250b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f2387a);
        boolean z2 = false;
        this.f984d = obtainStyledAttributes.getDrawable(0);
        this.f985e = obtainStyledAttributes.getDrawable(2);
        this.i = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f987g = true;
            this.f986f = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f987g ? !(this.f984d != null || this.f985e != null) : this.f986f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f984d;
        if (drawable != null && drawable.isStateful()) {
            this.f984d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f985e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f985e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f986f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f986f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f984d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f985e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f986f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f982b = findViewById(R.id.action_bar);
        this.f983c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f981a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        boolean z3 = true;
        if (this.f987g) {
            Drawable drawable = this.f986f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z3 = false;
            }
        } else {
            if (this.f984d == null) {
                z3 = false;
            } else if (this.f982b.getVisibility() == 0) {
                this.f984d.setBounds(this.f982b.getLeft(), this.f982b.getTop(), this.f982b.getRight(), this.f982b.getBottom());
            } else {
                View view = this.f983c;
                if (view == null || view.getVisibility() != 0) {
                    this.f984d.setBounds(0, 0, 0, 0);
                } else {
                    this.f984d.setBounds(this.f983c.getLeft(), this.f983c.getTop(), this.f983c.getRight(), this.f983c.getBottom());
                }
            }
            this.h = false;
        }
        if (z3) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f982b == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.i) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f982b == null) {
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
        Drawable drawable2 = this.f984d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f984d);
        }
        this.f984d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f982b;
            if (view != null) {
                this.f984d.setBounds(view.getLeft(), this.f982b.getTop(), this.f982b.getRight(), this.f982b.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.f987g ? !(this.f984d != null || this.f985e != null) : this.f986f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f986f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f986f);
        }
        this.f986f = drawable;
        boolean z2 = this.f987g;
        boolean z3 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z2 && (drawable2 = this.f986f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z2 ? !(this.f984d != null || this.f985e != null) : this.f986f == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f985e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f985e);
        }
        this.f985e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.h && this.f985e != null) {
                throw null;
            }
        }
        boolean z2 = false;
        if (!this.f987g ? !(this.f984d != null || this.f985e != null) : this.f986f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(R0 r02) {
    }

    public void setTransitioning(boolean z2) {
        this.f981a = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z2 = i == 0;
        Drawable drawable = this.f984d;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f985e;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f986f;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f984d;
        boolean z2 = this.f987g;
        return (drawable == drawable2 && !z2) || (drawable == this.f985e && this.h) || ((drawable == this.f986f && z2) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }
}
