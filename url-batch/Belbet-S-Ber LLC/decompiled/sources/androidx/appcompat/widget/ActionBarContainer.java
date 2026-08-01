package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.gdmhkmf.belbet.R;
import l.a;
import l.m2;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    public boolean f283f;

    /* renamed from: g, reason: collision with root package name */
    public View f284g;
    public View h;
    public Drawable i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f285j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f286k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f287l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f288m;

    /* renamed from: n, reason: collision with root package name */
    public final int f289n;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new a(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f1390a);
        boolean z4 = false;
        this.i = obtainStyledAttributes.getDrawable(0);
        this.f285j = obtainStyledAttributes.getDrawable(2);
        this.f289n = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f287l = true;
            this.f286k = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f287l ? !(this.i != null || this.f285j != null) : this.f286k == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.i;
        if (drawable != null && drawable.isStateful()) {
            this.i.setState(getDrawableState());
        }
        Drawable drawable2 = this.f285j;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f285j.setState(getDrawableState());
        }
        Drawable drawable3 = this.f286k;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f286k.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f285j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f286k;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f284g = findViewById(R.id.action_bar);
        this.h = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f283f || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i4, int i5, int i6) {
        super.onLayout(z4, i, i4, i5, i6);
        boolean z5 = true;
        if (this.f287l) {
            Drawable drawable = this.f286k;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z5 = false;
            }
        } else {
            if (this.i == null) {
                z5 = false;
            } else if (this.f284g.getVisibility() == 0) {
                this.i.setBounds(this.f284g.getLeft(), this.f284g.getTop(), this.f284g.getRight(), this.f284g.getBottom());
            } else {
                View view = this.h;
                if (view == null || view.getVisibility() != 0) {
                    this.i.setBounds(0, 0, 0, 0);
                } else {
                    this.i.setBounds(this.h.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom());
                }
            }
            this.f288m = false;
        }
        if (z5) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        int i5;
        if (this.f284g == null && View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE && (i5 = this.f289n) >= 0) {
            i4 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, View.MeasureSpec.getSize(i4)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i4);
        if (this.f284g == null) {
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
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.i);
        }
        this.i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f284g;
            if (view != null) {
                this.i.setBounds(view.getLeft(), this.f284g.getTop(), this.f284g.getRight(), this.f284g.getBottom());
            }
        }
        boolean z4 = false;
        if (!this.f287l ? !(this.i != null || this.f285j != null) : this.f286k == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f286k;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f286k);
        }
        this.f286k = drawable;
        boolean z4 = this.f287l;
        boolean z5 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z4 && (drawable2 = this.f286k) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z4 ? !(this.i != null || this.f285j != null) : this.f286k == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f285j;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f285j);
        }
        this.f285j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f288m && this.f285j != null) {
                throw null;
            }
        }
        boolean z4 = false;
        if (!this.f287l ? !(this.i != null || this.f285j != null) : this.f286k == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z4) {
        this.f283f = z4;
        setDescendantFocusability(z4 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z4 = i == 0;
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.setVisible(z4, false);
        }
        Drawable drawable2 = this.f285j;
        if (drawable2 != null) {
            drawable2.setVisible(z4, false);
        }
        Drawable drawable3 = this.f286k;
        if (drawable3 != null) {
            drawable3.setVisible(z4, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.i;
        boolean z4 = this.f287l;
        if (drawable == drawable2 && !z4) {
            return true;
        }
        if (drawable == this.f285j && this.f288m) {
            return true;
        }
        return (drawable == this.f286k && z4) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public void setTabContainer(m2 m2Var) {
    }
}
