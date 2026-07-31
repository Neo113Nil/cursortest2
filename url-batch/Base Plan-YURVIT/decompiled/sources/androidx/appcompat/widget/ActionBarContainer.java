package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.crane.slab.beam.R;
import d.AbstractC0119a;
import i.C0154a;
import i.S;
import java.lang.reflect.Field;
import y.x;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public boolean f1205e;

    /* renamed from: f, reason: collision with root package name */
    public View f1206f;

    /* renamed from: g, reason: collision with root package name */
    public View f1207g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f1208h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f1209i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f1210j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1211k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1212l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1213m;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0154a c0154a = new C0154a(this);
        Field field = x.f3160a;
        setBackground(c0154a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0119a.f1787a);
        boolean z2 = false;
        this.f1208h = obtainStyledAttributes.getDrawable(0);
        this.f1209i = obtainStyledAttributes.getDrawable(2);
        this.f1213m = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f1211k = true;
            this.f1210j = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1211k ? !(this.f1208h != null || this.f1209i != null) : this.f1210j == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1208h;
        if (drawable != null && drawable.isStateful()) {
            this.f1208h.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1209i;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1209i.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1210j;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1210j.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1208h;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1209i;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1210j;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1206f = findViewById(R.id.action_bar);
        this.f1207g = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1205e || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        boolean z3 = true;
        if (this.f1211k) {
            Drawable drawable = this.f1210j;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z3 = false;
            }
        } else {
            if (this.f1208h == null) {
                z3 = false;
            } else if (this.f1206f.getVisibility() == 0) {
                this.f1208h.setBounds(this.f1206f.getLeft(), this.f1206f.getTop(), this.f1206f.getRight(), this.f1206f.getBottom());
            } else {
                View view = this.f1207g;
                if (view == null || view.getVisibility() != 0) {
                    this.f1208h.setBounds(0, 0, 0, 0);
                } else {
                    this.f1208h.setBounds(this.f1207g.getLeft(), this.f1207g.getTop(), this.f1207g.getRight(), this.f1207g.getBottom());
                }
            }
            this.f1212l = false;
        }
        if (z3) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        if (this.f1206f == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i4 = this.f1213m) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.f1206f == null) {
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
        Drawable drawable2 = this.f1208h;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1208h);
        }
        this.f1208h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1206f;
            if (view != null) {
                this.f1208h.setBounds(view.getLeft(), this.f1206f.getTop(), this.f1206f.getRight(), this.f1206f.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.f1211k ? !(this.f1208h != null || this.f1209i != null) : this.f1210j == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1210j;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1210j);
        }
        this.f1210j = drawable;
        boolean z2 = this.f1211k;
        boolean z3 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z2 && (drawable2 = this.f1210j) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z2 ? !(this.f1208h != null || this.f1209i != null) : this.f1210j == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f1209i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1209i);
        }
        this.f1209i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1212l && this.f1209i != null) {
                throw null;
            }
        }
        boolean z2 = false;
        if (!this.f1211k ? !(this.f1208h != null || this.f1209i != null) : this.f1210j == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z2) {
        this.f1205e = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.f1208h;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f1209i;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f1210j;
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
        Drawable drawable2 = this.f1208h;
        boolean z2 = this.f1211k;
        if (drawable == drawable2 && !z2) {
            return true;
        }
        if (drawable == this.f1209i && this.f1212l) {
            return true;
        }
        return (drawable == this.f1210j && z2) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    public void setTabContainer(S s2) {
    }
}
