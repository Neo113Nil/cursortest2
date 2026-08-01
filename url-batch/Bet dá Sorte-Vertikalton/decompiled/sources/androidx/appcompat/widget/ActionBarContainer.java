package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.glasspulse.glasspulse.R;
import f.a;
import l.C0201b;
import l.O0;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1207a;

    /* renamed from: b, reason: collision with root package name */
    public View f1208b;

    /* renamed from: c, reason: collision with root package name */
    public View f1209c;
    public Drawable d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f1210e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f1211f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1212g;
    public boolean h;
    public final int i;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C0201b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f2032a);
        boolean z2 = false;
        this.d = obtainStyledAttributes.getDrawable(0);
        this.f1210e = obtainStyledAttributes.getDrawable(2);
        this.i = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f1212g = true;
            this.f1211f = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1212g ? !(this.d != null || this.f1210e != null) : this.f1211f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.d;
        if (drawable != null && drawable.isStateful()) {
            this.d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1210e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1210e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1211f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1211f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1210e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1211f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1208b = findViewById(R.id.action_bar);
        this.f1209c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1207a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        boolean z3 = true;
        if (this.f1212g) {
            Drawable drawable = this.f1211f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z3 = false;
            }
        } else {
            if (this.d == null) {
                z3 = false;
            } else if (this.f1208b.getVisibility() == 0) {
                this.d.setBounds(this.f1208b.getLeft(), this.f1208b.getTop(), this.f1208b.getRight(), this.f1208b.getBottom());
            } else {
                View view = this.f1209c;
                if (view == null || view.getVisibility() != 0) {
                    this.d.setBounds(0, 0, 0, 0);
                } else {
                    this.d.setBounds(this.f1209c.getLeft(), this.f1209c.getTop(), this.f1209c.getRight(), this.f1209c.getBottom());
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
        if (this.f1208b == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.i) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f1208b == null) {
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
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.d);
        }
        this.d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1208b;
            if (view != null) {
                this.d.setBounds(view.getLeft(), this.f1208b.getTop(), this.f1208b.getRight(), this.f1208b.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.f1212g ? !(this.d != null || this.f1210e != null) : this.f1211f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1211f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1211f);
        }
        this.f1211f = drawable;
        boolean z2 = this.f1212g;
        boolean z3 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z2 && (drawable2 = this.f1211f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z2 ? !(this.d != null || this.f1210e != null) : this.f1211f == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f1210e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1210e);
        }
        this.f1210e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.h && this.f1210e != null) {
                throw null;
            }
        }
        boolean z2 = false;
        if (!this.f1212g ? !(this.d != null || this.f1210e != null) : this.f1211f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(O0 o02) {
    }

    public void setTransitioning(boolean z2) {
        this.f1207a = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z2 = i == 0;
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f1210e;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f1211f;
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
        Drawable drawable2 = this.d;
        boolean z2 = this.f1212g;
        return (drawable == drawable2 && !z2) || (drawable == this.f1210e && this.h) || ((drawable == this.f1211f && z2) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }
}
