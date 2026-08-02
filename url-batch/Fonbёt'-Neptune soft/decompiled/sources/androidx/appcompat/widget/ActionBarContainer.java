package androidx.appcompat.widget;

import A.z;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import c.AbstractC0165a;
import com.neptunesoft.languesbacdz.R;
import j.C0225a;
import j.U;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public boolean f1364e;

    /* renamed from: f, reason: collision with root package name */
    public View f1365f;

    /* renamed from: g, reason: collision with root package name */
    public View f1366g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f1367h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f1368i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f1369j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1370k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1371l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1372m;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0225a c0225a = new C0225a(this);
        Field field = z.f58a;
        setBackground(c0225a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0165a.f1963a);
        boolean z2 = false;
        this.f1367h = obtainStyledAttributes.getDrawable(0);
        this.f1368i = obtainStyledAttributes.getDrawable(2);
        this.f1372m = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f1370k = true;
            this.f1369j = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1370k ? !(this.f1367h != null || this.f1368i != null) : this.f1369j == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1367h;
        if (drawable != null && drawable.isStateful()) {
            this.f1367h.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1368i;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1368i.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1369j;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1369j.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1367h;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1368i;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1369j;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1365f = findViewById(R.id.action_bar);
        this.f1366g = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1364e || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        boolean z3 = true;
        if (this.f1370k) {
            Drawable drawable = this.f1369j;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z3 = false;
            }
        } else {
            if (this.f1367h == null) {
                z3 = false;
            } else if (this.f1365f.getVisibility() == 0) {
                this.f1367h.setBounds(this.f1365f.getLeft(), this.f1365f.getTop(), this.f1365f.getRight(), this.f1365f.getBottom());
            } else {
                View view = this.f1366g;
                if (view == null || view.getVisibility() != 0) {
                    this.f1367h.setBounds(0, 0, 0, 0);
                } else {
                    this.f1367h.setBounds(this.f1366g.getLeft(), this.f1366g.getTop(), this.f1366g.getRight(), this.f1366g.getBottom());
                }
            }
            this.f1371l = false;
        }
        if (z3) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        if (this.f1365f == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i4 = this.f1372m) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.f1365f == null) {
            return;
        }
        View.MeasureSpec.getMode(i3);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1367h;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1367h);
        }
        this.f1367h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1365f;
            if (view != null) {
                this.f1367h.setBounds(view.getLeft(), this.f1365f.getTop(), this.f1365f.getRight(), this.f1365f.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.f1370k ? !(this.f1367h != null || this.f1368i != null) : this.f1369j == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1369j;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1369j);
        }
        this.f1369j = drawable;
        boolean z2 = this.f1370k;
        boolean z3 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z2 && (drawable2 = this.f1369j) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z2 ? !(this.f1367h != null || this.f1368i != null) : this.f1369j == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f1368i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1368i);
        }
        this.f1368i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1371l && this.f1368i != null) {
                throw null;
            }
        }
        boolean z2 = false;
        if (!this.f1370k ? !(this.f1367h != null || this.f1368i != null) : this.f1369j == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z2) {
        this.f1364e = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.f1367h;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f1368i;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f1369j;
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
        Drawable drawable2 = this.f1367h;
        boolean z2 = this.f1370k;
        return (drawable == drawable2 && !z2) || (drawable == this.f1368i && this.f1371l) || ((drawable == this.f1369j && z2) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    public void setTabContainer(U u2) {
    }
}
