package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.majelw.libystne.R;
import defpackage.b3;
import defpackage.b62;
import defpackage.c63;
import defpackage.cl1;
import defpackage.e3;
import defpackage.e53;
import defpackage.fk1;
import defpackage.i3;
import defpackage.j8;
import defpackage.lh;
import defpackage.q;
import defpackage.s2;
import defpackage.w53;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public TextView A;
    public TextView B;
    public final int C;
    public final int D;
    public boolean E;
    public final int F;
    public final q m;
    public final Context n;
    public ActionMenuView o;
    public e3 p;
    public int q;
    public w53 r;
    public boolean s;
    public boolean t;
    public CharSequence u;
    public CharSequence v;
    public View w;
    public View x;
    public View y;
    public LinearLayout z;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        this.m = new q(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.n = context;
        } else {
            this.n = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b62.d, R.attr.actionModeStyle, 0);
        setBackground((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : j8.F(context, resourceId));
        this.C = obtainStyledAttributes.getResourceId(5, 0);
        this.D = obtainStyledAttributes.getResourceId(4, 0);
        this.q = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.F = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int g(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public final void c(i3 i3Var) {
        View view = this.w;
        int i = 0;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.F, (ViewGroup) this, false);
            this.w = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.w);
        }
        View findViewById = this.w.findViewById(R.id.action_mode_close_button);
        this.x = findViewById;
        findViewById.setOnClickListener(new s2(i, i3Var));
        fk1 c = i3Var.c();
        e3 e3Var = this.p;
        if (e3Var != null) {
            e3Var.c();
            b3 b3Var = e3Var.F;
            if (b3Var != null && b3Var.b()) {
                b3Var.i.dismiss();
            }
        }
        e3 e3Var2 = new e3(getContext());
        this.p = e3Var2;
        e3Var2.x = true;
        e3Var2.y = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c.b(this.p, this.n);
        e3 e3Var3 = this.p;
        cl1 cl1Var = e3Var3.t;
        if (cl1Var == null) {
            cl1 cl1Var2 = (cl1) e3Var3.p.inflate(e3Var3.r, (ViewGroup) this, false);
            e3Var3.t = cl1Var2;
            cl1Var2.b(e3Var3.o);
            e3Var3.g();
        }
        cl1 cl1Var3 = e3Var3.t;
        if (cl1Var != cl1Var3) {
            ((ActionMenuView) cl1Var3).setPresenter(e3Var3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) cl1Var3;
        this.o = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.o, layoutParams);
    }

    public final void d() {
        if (this.z == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.z = linearLayout;
            this.A = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.B = (TextView) this.z.findViewById(R.id.action_bar_subtitle);
            int i = this.C;
            if (i != 0) {
                this.A.setTextAppearance(getContext(), i);
            }
            int i2 = this.D;
            if (i2 != 0) {
                this.B.setTextAppearance(getContext(), i2);
            }
        }
        this.A.setText(this.u);
        this.B.setText(this.v);
        boolean isEmpty = TextUtils.isEmpty(this.u);
        boolean isEmpty2 = TextUtils.isEmpty(this.v);
        this.B.setVisibility(!isEmpty2 ? 0 : 8);
        this.z.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.z.getParent() == null) {
            addView(this.z);
        }
    }

    public final void e() {
        removeAllViews();
        this.y = null;
        this.o = null;
        this.p = null;
        View view = this.x;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.r != null ? this.m.a : getVisibility();
    }

    public int getContentHeight() {
        return this.q;
    }

    public CharSequence getSubtitle() {
        return this.v;
    }

    public CharSequence getTitle() {
        return this.u;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            w53 w53Var = this.r;
            if (w53Var != null) {
                w53Var.b();
            }
            super.setVisibility(i);
        }
    }

    public final w53 i(long j, int i) {
        w53 w53Var = this.r;
        if (w53Var != null) {
            w53Var.b();
        }
        q qVar = this.m;
        if (i != 0) {
            w53 a = e53.a(this);
            a.a(0.0f);
            a.c(j);
            ((ActionBarContextView) qVar.c).r = a;
            qVar.a = i;
            a.d(qVar);
            return a;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        w53 a2 = e53.a(this);
        a2.a(1.0f);
        a2.c(j);
        ((ActionBarContextView) qVar.c).r = a2;
        qVar.a = i;
        a2.d(qVar);
        return a2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, b62.a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        e3 e3Var = this.p;
        if (e3Var != null) {
            Configuration configuration2 = e3Var.n.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            e3Var.B = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            fk1 fk1Var = e3Var.o;
            if (fk1Var != null) {
                fk1Var.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e3 e3Var = this.p;
        if (e3Var != null) {
            e3Var.c();
            b3 b3Var = this.p.F;
            if (b3Var == null || !b3Var.b()) {
                return;
            }
            b3Var.i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.t = false;
        }
        if (!this.t) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.t = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.t = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = c63.a;
        boolean z3 = getLayoutDirection() == 1;
        int paddingRight = z3 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.w;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.w.getLayoutParams();
            int i5 = z3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z3 ? paddingRight - i5 : paddingRight + i5;
            int g = g(this.w, i7, paddingTop, paddingTop2, z3) + i7;
            paddingRight = z3 ? g - i6 : g + i6;
        }
        LinearLayout linearLayout = this.z;
        if (linearLayout != null && this.y == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.z, paddingRight, paddingTop, paddingTop2, z3);
        }
        View view2 = this.y;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, z3);
        }
        int paddingLeft = z3 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.o;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            lh.g(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            lh.g(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.q;
        if (i3 <= 0) {
            i3 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i4 = i3 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        View view = this.w;
        if (view != null) {
            int f = f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.w.getLayoutParams();
            paddingLeft = f - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.o;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.o, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.z;
        if (linearLayout != null && this.y == null) {
            if (this.E) {
                this.z.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.z.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.z.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.y;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i5 = layoutParams.width;
            int i6 = i5 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i5 >= 0) {
                paddingLeft = Math.min(i5, paddingLeft);
            }
            int i7 = layoutParams.height;
            int i8 = i7 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i7 >= 0) {
                i4 = Math.min(i7, i4);
            }
            this.y.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i4, i8));
        }
        if (this.q > 0) {
            setMeasuredDimension(size, i3);
            return;
        }
        int childCount = getChildCount();
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i9) {
                i9 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i9);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.s = false;
        }
        if (!this.s) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.s = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.s = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.q = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.y;
        if (view2 != null) {
            removeView(view2);
        }
        this.y = view;
        if (view != null && (linearLayout = this.z) != null) {
            removeView(linearLayout);
            this.z = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.v = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.u = charSequence;
        d();
        e53.j(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.E) {
            requestLayout();
        }
        this.E = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
