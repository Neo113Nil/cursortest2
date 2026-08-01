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
import com.moontiko.really.admiralcasino.R;
import defpackage.c;
import defpackage.e1;
import defpackage.ed0;
import defpackage.fx;
import defpackage.g9;
import defpackage.i1;
import defpackage.ic0;
import defpackage.m1;
import defpackage.mw;
import defpackage.mz;
import defpackage.v0;
import defpackage.wc0;
import defpackage.z00;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public final c f;
    public final Context g;
    public ActionMenuView h;
    public i1 i;
    public int j;
    public wc0 k;
    public boolean l;
    public boolean m;
    public CharSequence n;
    public CharSequence o;
    public View p;
    public View q;
    public View r;
    public LinearLayout s;
    public TextView t;
    public TextView u;
    public final int v;
    public final int w;
    public boolean x;
    public final int y;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        this.f = new c(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.g = context;
        } else {
            this.g = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z00.d, R.attr.actionModeStyle, 0);
        setBackground((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : mz.m(context, resourceId));
        this.v = obtainStyledAttributes.getResourceId(5, 0);
        this.w = obtainStyledAttributes.getResourceId(4, 0);
        this.j = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.y = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
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

    public final void c(m1 m1Var) {
        View view = this.p;
        int i = 0;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.y, (ViewGroup) this, false);
            this.p = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.p);
        }
        View findViewById = this.p.findViewById(R.id.action_mode_close_button);
        this.q = findViewById;
        findViewById.setOnClickListener(new v0(i, m1Var));
        mw c = m1Var.c();
        i1 i1Var = this.i;
        if (i1Var != null) {
            i1Var.d();
            e1 e1Var = i1Var.y;
            if (e1Var != null && e1Var.b()) {
                e1Var.j.dismiss();
            }
        }
        i1 i1Var2 = new i1(getContext());
        this.i = i1Var2;
        i1Var2.q = true;
        i1Var2.r = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c.b(this.i, this.g);
        i1 i1Var3 = this.i;
        fx fxVar = i1Var3.m;
        if (fxVar == null) {
            fx fxVar2 = (fx) i1Var3.i.inflate(i1Var3.k, (ViewGroup) this, false);
            i1Var3.m = fxVar2;
            fxVar2.b(i1Var3.h);
            i1Var3.g();
        }
        fx fxVar3 = i1Var3.m;
        if (fxVar != fxVar3) {
            ((ActionMenuView) fxVar3).setPresenter(i1Var3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) fxVar3;
        this.h = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.h, layoutParams);
    }

    public final void d() {
        if (this.s == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.s = linearLayout;
            this.t = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.u = (TextView) this.s.findViewById(R.id.action_bar_subtitle);
            int i = this.v;
            if (i != 0) {
                this.t.setTextAppearance(getContext(), i);
            }
            int i2 = this.w;
            if (i2 != 0) {
                this.u.setTextAppearance(getContext(), i2);
            }
        }
        this.t.setText(this.n);
        this.u.setText(this.o);
        boolean isEmpty = TextUtils.isEmpty(this.n);
        boolean isEmpty2 = TextUtils.isEmpty(this.o);
        this.u.setVisibility(!isEmpty2 ? 0 : 8);
        this.s.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.s.getParent() == null) {
            addView(this.s);
        }
    }

    public final void e() {
        removeAllViews();
        this.r = null;
        this.h = null;
        this.i = null;
        View view = this.q;
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
        return this.k != null ? this.f.b : getVisibility();
    }

    public int getContentHeight() {
        return this.j;
    }

    public CharSequence getSubtitle() {
        return this.o;
    }

    public CharSequence getTitle() {
        return this.n;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            wc0 wc0Var = this.k;
            if (wc0Var != null) {
                wc0Var.b();
            }
            super.setVisibility(i);
        }
    }

    public final wc0 i(int i, long j) {
        wc0 wc0Var = this.k;
        if (wc0Var != null) {
            wc0Var.b();
        }
        c cVar = this.f;
        if (i != 0) {
            wc0 a = ic0.a(this);
            a.a(0.0f);
            a.c(j);
            cVar.c.k = a;
            cVar.b = i;
            a.d(cVar);
            return a;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        wc0 a2 = ic0.a(this);
        a2.a(1.0f);
        a2.c(j);
        cVar.c.k = a2;
        cVar.b = i;
        a2.d(cVar);
        return a2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, z00.a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        i1 i1Var = this.i;
        if (i1Var != null) {
            Configuration configuration2 = i1Var.g.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            i1Var.u = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            mw mwVar = i1Var.h;
            if (mwVar != null) {
                mwVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i1 i1Var = this.i;
        if (i1Var != null) {
            i1Var.d();
            e1 e1Var = this.i.y;
            if (e1Var == null || !e1Var.b()) {
                return;
            }
            e1Var.j.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.m = false;
        }
        if (!this.m) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.m = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.m = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = ed0.a;
        boolean z3 = getLayoutDirection() == 1;
        int paddingRight = z3 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.p;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.p.getLayoutParams();
            int i5 = z3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z3 ? paddingRight - i5 : paddingRight + i5;
            int g = g(this.p, i7, paddingTop, paddingTop2, z3) + i7;
            paddingRight = z3 ? g - i6 : g + i6;
        }
        LinearLayout linearLayout = this.s;
        if (linearLayout != null && this.r == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.s, paddingRight, paddingTop, paddingTop2, z3);
        }
        View view2 = this.r;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, z3);
        }
        int paddingLeft = z3 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.h;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            g9.s(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            g9.s(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.j;
        if (i3 <= 0) {
            i3 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i4 = i3 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        View view = this.p;
        if (view != null) {
            int f = f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.p.getLayoutParams();
            paddingLeft = f - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.h;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.h, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.s;
        if (linearLayout != null && this.r == null) {
            if (this.x) {
                this.s.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.s.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.s.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.r;
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
            this.r.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i4, i8));
        }
        if (this.j > 0) {
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
            this.l = false;
        }
        if (!this.l) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.l = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.l = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.j = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.r;
        if (view2 != null) {
            removeView(view2);
        }
        this.r = view;
        if (view != null && (linearLayout = this.s) != null) {
            removeView(linearLayout);
            this.s = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.o = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.n = charSequence;
        d();
        ic0.n(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.x) {
            requestLayout();
        }
        this.x = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
