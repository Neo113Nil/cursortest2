package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private boolean f10465a;

    /* renamed from: b, reason: collision with root package name */
    private View f10466b;

    /* renamed from: c, reason: collision with root package name */
    private View f10467c;

    /* renamed from: d, reason: collision with root package name */
    private View f10468d;

    /* renamed from: e, reason: collision with root package name */
    Drawable f10469e;

    /* renamed from: f, reason: collision with root package name */
    Drawable f10470f;

    /* renamed from: g, reason: collision with root package name */
    Drawable f10471g;

    /* renamed from: h, reason: collision with root package name */
    boolean f10472h;

    /* renamed from: i, reason: collision with root package name */
    boolean f10473i;

    /* renamed from: j, reason: collision with root package name */
    private int f10474j;

    private static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C1253b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f36470a);
        this.f10469e = obtainStyledAttributes.getDrawable(e.j.f36475b);
        this.f10470f = obtainStyledAttributes.getDrawable(e.j.f36485d);
        this.f10474j = obtainStyledAttributes.getDimensionPixelSize(e.j.f36515j, -1);
        boolean z4 = true;
        if (getId() == e.f.f36287H) {
            this.f10472h = true;
            this.f10471g = obtainStyledAttributes.getDrawable(e.j.f36480c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f10472h ? this.f10469e != null || this.f10470f != null : this.f10471g != null) {
            z4 = false;
        }
        setWillNotDraw(z4);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f10469e;
        if (drawable != null && drawable.isStateful()) {
            this.f10469e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f10470f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f10470f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f10471g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f10471g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f10466b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f10469e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f10470f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f10471g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f10467c = findViewById(e.f.f36296a);
        this.f10468d = findViewById(e.f.f36301f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f10465a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        Drawable drawable;
        super.onLayout(z4, i4, i5, i6, i7);
        View view = this.f10466b;
        boolean z5 = true;
        boolean z6 = false;
        boolean z7 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i8 = layoutParams.bottomMargin;
            view.layout(i4, measuredHeight2 - i8, i6, measuredHeight - i8);
        }
        if (this.f10472h) {
            Drawable drawable2 = this.f10471g;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            z5 = z6;
        } else {
            if (this.f10469e != null) {
                if (this.f10467c.getVisibility() == 0) {
                    this.f10469e.setBounds(this.f10467c.getLeft(), this.f10467c.getTop(), this.f10467c.getRight(), this.f10467c.getBottom());
                } else {
                    View view2 = this.f10468d;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f10469e.setBounds(0, 0, 0, 0);
                    } else {
                        this.f10469e.setBounds(this.f10468d.getLeft(), this.f10468d.getTop(), this.f10468d.getRight(), this.f10468d.getBottom());
                    }
                }
                z6 = true;
            }
            this.f10473i = z7;
            if (z7 && (drawable = this.f10470f) != null) {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            z5 = z6;
        }
        if (z5) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i4, int i5) {
        int i6;
        if (this.f10467c == null && View.MeasureSpec.getMode(i5) == Integer.MIN_VALUE && (i6 = this.f10474j) >= 0) {
            i5 = View.MeasureSpec.makeMeasureSpec(Math.min(i6, View.MeasureSpec.getSize(i5)), Integer.MIN_VALUE);
        }
        super.onMeasure(i4, i5);
        if (this.f10467c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i5);
        View view = this.f10466b;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min((!b(this.f10467c) ? a(this.f10467c) : !b(this.f10468d) ? a(this.f10468d) : 0) + a(this.f10466b), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i5) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f10469e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f10469e);
        }
        this.f10469e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f10467c;
            if (view != null) {
                this.f10469e.setBounds(view.getLeft(), this.f10467c.getTop(), this.f10467c.getRight(), this.f10467c.getBottom());
            }
        }
        boolean z4 = false;
        if (!this.f10472h ? !(this.f10469e != null || this.f10470f != null) : this.f10471g == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f10471g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f10471g);
        }
        this.f10471g = drawable;
        boolean z4 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f10472h && (drawable2 = this.f10471g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f10472h ? !(this.f10469e != null || this.f10470f != null) : this.f10471g == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f10470f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f10470f);
        }
        this.f10470f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f10473i && (drawable2 = this.f10470f) != null) {
                drawable2.setBounds(this.f10466b.getLeft(), this.f10466b.getTop(), this.f10466b.getRight(), this.f10466b.getBottom());
            }
        }
        boolean z4 = false;
        if (!this.f10472h ? !(this.f10469e != null || this.f10470f != null) : this.f10471g == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(S s4) {
        View view = this.f10466b;
        if (view != null) {
            removeView(view);
        }
        this.f10466b = s4;
    }

    public void setTransitioning(boolean z4) {
        this.f10465a = z4;
        setDescendantFocusability(z4 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        boolean z4 = i4 == 0;
        Drawable drawable = this.f10469e;
        if (drawable != null) {
            drawable.setVisible(z4, false);
        }
        Drawable drawable2 = this.f10470f;
        if (drawable2 != null) {
            drawable2.setVisible(z4, false);
        }
        Drawable drawable3 = this.f10471g;
        if (drawable3 != null) {
            drawable3.setVisible(z4, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.f10469e && !this.f10472h) {
            return true;
        }
        if (drawable == this.f10470f && this.f10473i) {
            return true;
        }
        return (drawable == this.f10471g && this.f10472h) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i4) {
        if (i4 != 0) {
            return super.startActionModeForChild(view, callback, i4);
        }
        return null;
    }
}
