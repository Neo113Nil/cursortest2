package androidx.appcompat.widget;

import E.A;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.fc.barca.football.R;
import g.AbstractC0328a;
import java.lang.reflect.Field;
import l.C1079a;
import l.S;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1992a;

    /* renamed from: b, reason: collision with root package name */
    public View f1993b;

    /* renamed from: c, reason: collision with root package name */
    public View f1994c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f1995d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f1996e;
    public Drawable f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1997g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1998h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1999i;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1079a c1079a = new C1079a(this);
        Field field = A.f243a;
        setBackground(c1079a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0328a.f4989a);
        boolean z = false;
        this.f1995d = obtainStyledAttributes.getDrawable(0);
        this.f1996e = obtainStyledAttributes.getDrawable(2);
        this.f1999i = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f1997g = true;
            this.f = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1997g ? !(this.f1995d != null || this.f1996e != null) : this.f == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1995d;
        if (drawable != null && drawable.isStateful()) {
            this.f1995d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1996e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1996e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1995d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1996e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1993b = findViewById(R.id.action_bar);
        this.f1994c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1992a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i3, int i4, int i5, int i6) {
        super.onLayout(z, i3, i4, i5, i6);
        boolean z2 = true;
        if (this.f1997g) {
            Drawable drawable = this.f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f1995d == null) {
                z2 = false;
            } else if (this.f1993b.getVisibility() == 0) {
                this.f1995d.setBounds(this.f1993b.getLeft(), this.f1993b.getTop(), this.f1993b.getRight(), this.f1993b.getBottom());
            } else {
                View view = this.f1994c;
                if (view == null || view.getVisibility() != 0) {
                    this.f1995d.setBounds(0, 0, 0, 0);
                } else {
                    this.f1995d.setBounds(this.f1994c.getLeft(), this.f1994c.getTop(), this.f1994c.getRight(), this.f1994c.getBottom());
                }
            }
            this.f1998h = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        if (this.f1993b == null && View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE && (i5 = this.f1999i) >= 0) {
            i4 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, View.MeasureSpec.getSize(i4)), Integer.MIN_VALUE);
        }
        super.onMeasure(i3, i4);
        if (this.f1993b == null) {
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
        Drawable drawable2 = this.f1995d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1995d);
        }
        this.f1995d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1993b;
            if (view != null) {
                this.f1995d.setBounds(view.getLeft(), this.f1993b.getTop(), this.f1993b.getRight(), this.f1993b.getBottom());
            }
        }
        boolean z = false;
        if (!this.f1997g ? !(this.f1995d != null || this.f1996e != null) : this.f == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f);
        }
        this.f = drawable;
        boolean z = this.f1997g;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.f1995d != null || this.f1996e != null) : this.f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f1996e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1996e);
        }
        this.f1996e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1998h && this.f1996e != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.f1997g ? !(this.f1995d != null || this.f1996e != null) : this.f == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z) {
        this.f1992a = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        boolean z = i3 == 0;
        Drawable drawable = this.f1995d;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f1996e;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f;
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
        Drawable drawable2 = this.f1995d;
        boolean z = this.f1997g;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.f1996e && this.f1998h) {
            return true;
        }
        return (drawable == this.f && z) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i3) {
        if (i3 != 0) {
            return super.startActionModeForChild(view, callback, i3);
        }
        return null;
    }

    public void setTabContainer(S s3) {
    }
}
