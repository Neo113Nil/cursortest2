package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.snovikpovik.vuevnxsj.R;
import l.a;
import l.t1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f358d;

    /* renamed from: e, reason: collision with root package name */
    public View f359e;

    /* renamed from: f, reason: collision with root package name */
    public View f360f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f361g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f362h;
    public Drawable i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f363j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f364k;

    /* renamed from: l, reason: collision with root package name */
    public final int f365l;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new a(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f3049a);
        boolean z3 = false;
        this.f361g = obtainStyledAttributes.getDrawable(0);
        this.f362h = obtainStyledAttributes.getDrawable(2);
        this.f365l = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f363j = true;
            this.i = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f363j ? !(this.f361g != null || this.f362h != null) : this.i == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f361g;
        if (drawable != null && drawable.isStateful()) {
            this.f361g.setState(getDrawableState());
        }
        Drawable drawable2 = this.f362h;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f362h.setState(getDrawableState());
        }
        Drawable drawable3 = this.i;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.i.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f361g;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f362h;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.i;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f359e = findViewById(R.id.action_bar);
        this.f360f = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f358d || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i8, int i9, int i10) {
        super.onLayout(z3, i, i8, i9, i10);
        boolean z7 = true;
        if (this.f363j) {
            Drawable drawable = this.i;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z7 = false;
            }
        } else {
            if (this.f361g == null) {
                z7 = false;
            } else if (this.f359e.getVisibility() == 0) {
                this.f361g.setBounds(this.f359e.getLeft(), this.f359e.getTop(), this.f359e.getRight(), this.f359e.getBottom());
            } else {
                View view = this.f360f;
                if (view == null || view.getVisibility() != 0) {
                    this.f361g.setBounds(0, 0, 0, 0);
                } else {
                    this.f361g.setBounds(this.f360f.getLeft(), this.f360f.getTop(), this.f360f.getRight(), this.f360f.getBottom());
                }
            }
            this.f364k = false;
        }
        if (z7) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i8) {
        int i9;
        if (this.f359e == null && View.MeasureSpec.getMode(i8) == Integer.MIN_VALUE && (i9 = this.f365l) >= 0) {
            i8 = View.MeasureSpec.makeMeasureSpec(Math.min(i9, View.MeasureSpec.getSize(i8)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i8);
        if (this.f359e == null) {
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
        Drawable drawable2 = this.f361g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f361g);
        }
        this.f361g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f359e;
            if (view != null) {
                this.f361g.setBounds(view.getLeft(), this.f359e.getTop(), this.f359e.getRight(), this.f359e.getBottom());
            }
        }
        boolean z3 = false;
        if (!this.f363j ? !(this.f361g != null || this.f362h != null) : this.i == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.i;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.i);
        }
        this.i = drawable;
        boolean z3 = this.f363j;
        boolean z7 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z3 && (drawable2 = this.i) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z3 ? !(this.f361g != null || this.f362h != null) : this.i == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f362h;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f362h);
        }
        this.f362h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f364k && this.f362h != null) {
                throw null;
            }
        }
        boolean z3 = false;
        if (!this.f363j ? !(this.f361g != null || this.f362h != null) : this.i == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z3) {
        this.f358d = z3;
        setDescendantFocusability(z3 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z3 = i == 0;
        Drawable drawable = this.f361g;
        if (drawable != null) {
            drawable.setVisible(z3, false);
        }
        Drawable drawable2 = this.f362h;
        if (drawable2 != null) {
            drawable2.setVisible(z3, false);
        }
        Drawable drawable3 = this.i;
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
        Drawable drawable2 = this.f361g;
        boolean z3 = this.f363j;
        if (drawable == drawable2 && !z3) {
            return true;
        }
        if (drawable == this.f362h && this.f364k) {
            return true;
        }
        return (drawable == this.i && z3) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public void setTabContainer(t1 t1Var) {
    }
}
