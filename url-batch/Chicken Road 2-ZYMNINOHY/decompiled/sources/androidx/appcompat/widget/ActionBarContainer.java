package androidx.appcompat.widget;

import E.H;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.rockchicken.pump.up.road.R;
import f.AbstractC0410a;
import java.lang.reflect.Field;
import k.AbstractC1192P;
import k.C1202a;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4321a;

    /* renamed from: b, reason: collision with root package name */
    public View f4322b;

    /* renamed from: c, reason: collision with root package name */
    public View f4323c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f4324d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f4325e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f4326f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4327g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4328h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4329i;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1202a c1202a = new C1202a(this);
        Field field = H.f375a;
        setBackground(c1202a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0410a.f8470a);
        boolean z = false;
        this.f4324d = obtainStyledAttributes.getDrawable(0);
        this.f4325e = obtainStyledAttributes.getDrawable(2);
        this.f4329i = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f4327g = true;
            this.f4326f = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f4327g ? !(this.f4324d != null || this.f4325e != null) : this.f4326f == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f4324d;
        if (drawable != null && drawable.isStateful()) {
            this.f4324d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f4325e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f4325e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f4326f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f4326f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4324d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f4325e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f4326f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f4322b = findViewById(R.id.action_bar);
        this.f4323c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f4321a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i4, int i5, int i6, int i7) {
        super.onLayout(z, i4, i5, i6, i7);
        boolean z4 = true;
        if (this.f4327g) {
            Drawable drawable = this.f4326f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z4 = false;
            }
        } else {
            if (this.f4324d == null) {
                z4 = false;
            } else if (this.f4322b.getVisibility() == 0) {
                this.f4324d.setBounds(this.f4322b.getLeft(), this.f4322b.getTop(), this.f4322b.getRight(), this.f4322b.getBottom());
            } else {
                View view = this.f4323c;
                if (view == null || view.getVisibility() != 0) {
                    this.f4324d.setBounds(0, 0, 0, 0);
                } else {
                    this.f4324d.setBounds(this.f4323c.getLeft(), this.f4323c.getTop(), this.f4323c.getRight(), this.f4323c.getBottom());
                }
            }
            this.f4328h = false;
        }
        if (z4) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        if (this.f4322b == null && View.MeasureSpec.getMode(i5) == Integer.MIN_VALUE && (i6 = this.f4329i) >= 0) {
            i5 = View.MeasureSpec.makeMeasureSpec(Math.min(i6, View.MeasureSpec.getSize(i5)), Integer.MIN_VALUE);
        }
        super.onMeasure(i4, i5);
        if (this.f4322b == null) {
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
        Drawable drawable2 = this.f4324d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f4324d);
        }
        this.f4324d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f4322b;
            if (view != null) {
                this.f4324d.setBounds(view.getLeft(), this.f4322b.getTop(), this.f4322b.getRight(), this.f4322b.getBottom());
            }
        }
        boolean z = false;
        if (!this.f4327g ? !(this.f4324d != null || this.f4325e != null) : this.f4326f == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f4326f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f4326f);
        }
        this.f4326f = drawable;
        boolean z = this.f4327g;
        boolean z4 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.f4326f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.f4324d != null || this.f4325e != null) : this.f4326f == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f4325e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f4325e);
        }
        this.f4325e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f4328h && this.f4325e != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.f4327g ? !(this.f4324d != null || this.f4325e != null) : this.f4326f == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z) {
        this.f4321a = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        boolean z = i4 == 0;
        Drawable drawable = this.f4324d;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f4325e;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f4326f;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f4324d;
        boolean z = this.f4327g;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.f4325e && this.f4328h) {
            return true;
        }
        return (drawable == this.f4326f && z) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i4) {
        if (i4 != 0) {
            return super.startActionModeForChild(view, callback, i4);
        }
        return null;
    }

    public void setTabContainer(AbstractC1192P abstractC1192P) {
    }
}
