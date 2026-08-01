package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.oriondriftchasers.arordrft.R;
import f.a;
import l.b;
import l.p2;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    public boolean f151f;

    /* renamed from: g, reason: collision with root package name */
    public View f152g;

    /* renamed from: h, reason: collision with root package name */
    public View f153h;
    public Drawable i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f154j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f155k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f156l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f157m;

    /* renamed from: n, reason: collision with root package name */
    public final int f158n;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1240a);
        boolean z3 = false;
        this.i = obtainStyledAttributes.getDrawable(0);
        this.f154j = obtainStyledAttributes.getDrawable(2);
        this.f158n = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f156l = true;
            this.f155k = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f156l ? !(this.i != null || this.f154j != null) : this.f155k == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.i;
        if (drawable != null && drawable.isStateful()) {
            this.i.setState(getDrawableState());
        }
        Drawable drawable2 = this.f154j;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f154j.setState(getDrawableState());
        }
        Drawable drawable3 = this.f155k;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f155k.setState(getDrawableState());
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
        Drawable drawable2 = this.f154j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f155k;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f152g = findViewById(R.id.action_bar);
        this.f153h = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f151f || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        super.onLayout(z3, i, i4, i5, i6);
        boolean z4 = true;
        if (this.f156l) {
            Drawable drawable = this.f155k;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z4 = false;
            }
        } else {
            if (this.i == null) {
                z4 = false;
            } else if (this.f152g.getVisibility() == 0) {
                this.i.setBounds(this.f152g.getLeft(), this.f152g.getTop(), this.f152g.getRight(), this.f152g.getBottom());
            } else {
                View view = this.f153h;
                if (view == null || view.getVisibility() != 0) {
                    this.i.setBounds(0, 0, 0, 0);
                } else {
                    this.i.setBounds(this.f153h.getLeft(), this.f153h.getTop(), this.f153h.getRight(), this.f153h.getBottom());
                }
            }
            this.f157m = false;
        }
        if (z4) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        int i5;
        if (this.f152g == null && View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE && (i5 = this.f158n) >= 0) {
            i4 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, View.MeasureSpec.getSize(i4)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i4);
        if (this.f152g == null) {
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
            View view = this.f152g;
            if (view != null) {
                this.i.setBounds(view.getLeft(), this.f152g.getTop(), this.f152g.getRight(), this.f152g.getBottom());
            }
        }
        boolean z3 = false;
        if (!this.f156l ? !(this.i != null || this.f154j != null) : this.f155k == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f155k;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f155k);
        }
        this.f155k = drawable;
        boolean z3 = this.f156l;
        boolean z4 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z3 && (drawable2 = this.f155k) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z3 ? !(this.i != null || this.f154j != null) : this.f155k == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f154j;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f154j);
        }
        this.f154j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f157m && this.f154j != null) {
                throw null;
            }
        }
        boolean z3 = false;
        if (!this.f156l ? !(this.i != null || this.f154j != null) : this.f155k == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z3) {
        this.f151f = z3;
        setDescendantFocusability(z3 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z3 = i == 0;
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.setVisible(z3, false);
        }
        Drawable drawable2 = this.f154j;
        if (drawable2 != null) {
            drawable2.setVisible(z3, false);
        }
        Drawable drawable3 = this.f155k;
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
        Drawable drawable2 = this.i;
        boolean z3 = this.f156l;
        if (drawable == drawable2 && !z3) {
            return true;
        }
        if (drawable == this.f154j && this.f157m) {
            return true;
        }
        return (drawable == this.f155k && z3) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public void setTabContainer(p2 p2Var) {
    }
}
