package androidx.appcompat.widget;

import I.T;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.icefishing.icefish.ice.fishing.s294s.R;
import h.AbstractC0454a;
import java.util.WeakHashMap;
import n.C0700b;
import n.T0;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f3138d;

    /* renamed from: e, reason: collision with root package name */
    public View f3139e;

    /* renamed from: i, reason: collision with root package name */
    public View f3140i;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f3141l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f3142m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f3143n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f3144o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3145p;

    /* renamed from: q, reason: collision with root package name */
    public final int f3146q;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0700b c0700b = new C0700b(this);
        WeakHashMap weakHashMap = T.f1153a;
        setBackground(c0700b);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0454a.f5037a);
        boolean z7 = false;
        this.f3141l = obtainStyledAttributes.getDrawable(0);
        this.f3142m = obtainStyledAttributes.getDrawable(2);
        this.f3146q = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f3144o = true;
            this.f3143n = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f3144o ? !(this.f3141l != null || this.f3142m != null) : this.f3143n == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3141l;
        if (drawable != null && drawable.isStateful()) {
            this.f3141l.setState(getDrawableState());
        }
        Drawable drawable2 = this.f3142m;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f3142m.setState(getDrawableState());
        }
        Drawable drawable3 = this.f3143n;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f3143n.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3141l;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f3142m;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f3143n;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3139e = findViewById(R.id.action_bar);
        this.f3140i = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f3138d || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i2, int i5, int i7, int i8) {
        super.onLayout(z7, i2, i5, i7, i8);
        boolean z8 = true;
        if (this.f3144o) {
            Drawable drawable = this.f3143n;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z8 = false;
            }
        } else {
            if (this.f3141l == null) {
                z8 = false;
            } else if (this.f3139e.getVisibility() == 0) {
                this.f3141l.setBounds(this.f3139e.getLeft(), this.f3139e.getTop(), this.f3139e.getRight(), this.f3139e.getBottom());
            } else {
                View view = this.f3140i;
                if (view == null || view.getVisibility() != 0) {
                    this.f3141l.setBounds(0, 0, 0, 0);
                } else {
                    this.f3141l.setBounds(this.f3140i.getLeft(), this.f3140i.getTop(), this.f3140i.getRight(), this.f3140i.getBottom());
                }
            }
            this.f3145p = false;
        }
        if (z8) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i5) {
        int i7;
        if (this.f3139e == null && View.MeasureSpec.getMode(i5) == Integer.MIN_VALUE && (i7 = this.f3146q) >= 0) {
            i5 = View.MeasureSpec.makeMeasureSpec(Math.min(i7, View.MeasureSpec.getSize(i5)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i5);
        if (this.f3139e == null) {
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
        Drawable drawable2 = this.f3141l;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f3141l);
        }
        this.f3141l = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f3139e;
            if (view != null) {
                this.f3141l.setBounds(view.getLeft(), this.f3139e.getTop(), this.f3139e.getRight(), this.f3139e.getBottom());
            }
        }
        boolean z7 = false;
        if (!this.f3144o ? !(this.f3141l != null || this.f3142m != null) : this.f3143n == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f3143n;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f3143n);
        }
        this.f3143n = drawable;
        boolean z7 = this.f3144o;
        boolean z8 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z7 && (drawable2 = this.f3143n) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z7 ? !(this.f3141l != null || this.f3142m != null) : this.f3143n == null) {
            z8 = true;
        }
        setWillNotDraw(z8);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f3142m;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f3142m);
        }
        this.f3142m = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f3145p && this.f3142m != null) {
                throw null;
            }
        }
        boolean z7 = false;
        if (!this.f3144o ? !(this.f3141l != null || this.f3142m != null) : this.f3143n == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z7) {
        this.f3138d = z7;
        setDescendantFocusability(z7 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z7 = i2 == 0;
        Drawable drawable = this.f3141l;
        if (drawable != null) {
            drawable.setVisible(z7, false);
        }
        Drawable drawable2 = this.f3142m;
        if (drawable2 != null) {
            drawable2.setVisible(z7, false);
        }
        Drawable drawable3 = this.f3143n;
        if (drawable3 != null) {
            drawable3.setVisible(z7, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3141l;
        boolean z7 = this.f3144o;
        if (drawable == drawable2 && !z7) {
            return true;
        }
        if (drawable == this.f3142m && this.f3145p) {
            return true;
        }
        return (drawable == this.f3143n && z7) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    public void setTabContainer(T0 t02) {
    }
}
