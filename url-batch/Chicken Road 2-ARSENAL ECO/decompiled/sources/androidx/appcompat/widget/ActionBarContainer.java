package androidx.appcompat.widget;

import D.D;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.strategylink.Row.Five.R;
import g.AbstractC0389a;
import java.lang.reflect.Field;
import k.C0442a;
import k.V;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    public boolean f3250f;

    /* renamed from: g, reason: collision with root package name */
    public View f3251g;

    /* renamed from: h, reason: collision with root package name */
    public View f3252h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f3253i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f3254j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f3255k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f3256l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3257m;

    /* renamed from: n, reason: collision with root package name */
    public final int f3258n;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0442a c0442a = new C0442a(this);
        Field field = D.f240a;
        setBackground(c0442a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0389a.f4254a);
        boolean z5 = false;
        this.f3253i = obtainStyledAttributes.getDrawable(0);
        this.f3254j = obtainStyledAttributes.getDrawable(2);
        this.f3258n = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f3256l = true;
            this.f3255k = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f3256l ? !(this.f3253i != null || this.f3254j != null) : this.f3255k == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3253i;
        if (drawable != null && drawable.isStateful()) {
            this.f3253i.setState(getDrawableState());
        }
        Drawable drawable2 = this.f3254j;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f3254j.setState(getDrawableState());
        }
        Drawable drawable3 = this.f3255k;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f3255k.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3253i;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f3254j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f3255k;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3251g = findViewById(R.id.action_bar);
        this.f3252h = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f3250f || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i7, int i8, int i9, int i10) {
        super.onLayout(z5, i7, i8, i9, i10);
        boolean z6 = true;
        if (this.f3256l) {
            Drawable drawable = this.f3255k;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z6 = false;
            }
        } else {
            if (this.f3253i == null) {
                z6 = false;
            } else if (this.f3251g.getVisibility() == 0) {
                this.f3253i.setBounds(this.f3251g.getLeft(), this.f3251g.getTop(), this.f3251g.getRight(), this.f3251g.getBottom());
            } else {
                View view = this.f3252h;
                if (view == null || view.getVisibility() != 0) {
                    this.f3253i.setBounds(0, 0, 0, 0);
                } else {
                    this.f3253i.setBounds(this.f3252h.getLeft(), this.f3252h.getTop(), this.f3252h.getRight(), this.f3252h.getBottom());
                }
            }
            this.f3257m = false;
        }
        if (z6) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        if (this.f3251g == null && View.MeasureSpec.getMode(i8) == Integer.MIN_VALUE && (i9 = this.f3258n) >= 0) {
            i8 = View.MeasureSpec.makeMeasureSpec(Math.min(i9, View.MeasureSpec.getSize(i8)), Integer.MIN_VALUE);
        }
        super.onMeasure(i7, i8);
        if (this.f3251g == null) {
            return;
        }
        View.MeasureSpec.getMode(i8);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f3253i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f3253i);
        }
        this.f3253i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f3251g;
            if (view != null) {
                this.f3253i.setBounds(view.getLeft(), this.f3251g.getTop(), this.f3251g.getRight(), this.f3251g.getBottom());
            }
        }
        boolean z5 = false;
        if (!this.f3256l ? !(this.f3253i != null || this.f3254j != null) : this.f3255k == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f3255k;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f3255k);
        }
        this.f3255k = drawable;
        boolean z5 = this.f3256l;
        boolean z6 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z5 && (drawable2 = this.f3255k) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z5 ? !(this.f3253i != null || this.f3254j != null) : this.f3255k == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f3254j;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f3254j);
        }
        this.f3254j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f3257m && this.f3254j != null) {
                throw null;
            }
        }
        boolean z5 = false;
        if (!this.f3256l ? !(this.f3253i != null || this.f3254j != null) : this.f3255k == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z5) {
        this.f3250f = z5;
        setDescendantFocusability(z5 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        boolean z5 = i7 == 0;
        Drawable drawable = this.f3253i;
        if (drawable != null) {
            drawable.setVisible(z5, false);
        }
        Drawable drawable2 = this.f3254j;
        if (drawable2 != null) {
            drawable2.setVisible(z5, false);
        }
        Drawable drawable3 = this.f3255k;
        if (drawable3 != null) {
            drawable3.setVisible(z5, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3253i;
        boolean z5 = this.f3256l;
        if (drawable == drawable2 && !z5) {
            return true;
        }
        if (drawable == this.f3254j && this.f3257m) {
            return true;
        }
        return (drawable == this.f3255k && z5) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i7) {
        if (i7 != 0) {
            return super.startActionModeForChild(view, callback, i7);
        }
        return null;
    }

    public void setTabContainer(V v5) {
    }
}
