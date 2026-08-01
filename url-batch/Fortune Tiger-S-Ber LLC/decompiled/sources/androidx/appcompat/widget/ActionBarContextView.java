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
import com.gglhk.bofio.fortunetiger.R;
import j.a0;
import k.a;
import k.e3;
import k.g;
import k.k;
import k0.j0;
import k0.l0;
import k3.m;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: f, reason: collision with root package name */
    public final a f182f;
    public final Context g;
    public ActionMenuView h;

    /* renamed from: i, reason: collision with root package name */
    public k f183i;

    /* renamed from: j, reason: collision with root package name */
    public int f184j;

    /* renamed from: k, reason: collision with root package name */
    public l0 f185k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f186l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f187m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f188n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f189o;

    /* renamed from: p, reason: collision with root package name */
    public View f190p;

    /* renamed from: q, reason: collision with root package name */
    public View f191q;

    /* renamed from: r, reason: collision with root package name */
    public View f192r;

    /* renamed from: s, reason: collision with root package name */
    public LinearLayout f193s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f194t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f195u;

    /* renamed from: v, reason: collision with root package name */
    public final int f196v;

    /* renamed from: w, reason: collision with root package name */
    public final int f197w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f198x;

    /* renamed from: y, reason: collision with root package name */
    public final int f199y;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        this.f182f = new a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.g = context;
        } else {
            this.g = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.a.f1497d, R.attr.actionModeStyle, 0);
        setBackground((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : m.w(context, resourceId));
        this.f196v = obtainStyledAttributes.getResourceId(5, 0);
        this.f197w = obtainStyledAttributes.getResourceId(4, 0);
        this.f184j = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f199y = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int f(View view, int i4, int i5) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i5);
        return Math.max(0, i4 - view.getMeasuredWidth());
    }

    public static int g(View view, int i4, int i5, int i6, boolean z3) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i7 = ((i6 - measuredHeight) / 2) + i5;
        if (z3) {
            view.layout(i4 - measuredWidth, i7, i4, measuredHeight + i7);
        } else {
            view.layout(i4, i7, i4 + measuredWidth, measuredHeight + i7);
        }
        return z3 ? -measuredWidth : measuredWidth;
    }

    public final void c(i.a aVar) {
        View view = this.f190p;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f199y, (ViewGroup) this, false);
            this.f190p = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f190p);
        }
        View findViewById = this.f190p.findViewById(R.id.action_mode_close_button);
        this.f191q = findViewById;
        findViewById.setOnClickListener(new com.google.android.material.datepicker.k(2, aVar));
        j.m c = aVar.c();
        k kVar = this.f183i;
        if (kVar != null) {
            kVar.c();
            g gVar = kVar.f2584y;
            if (gVar != null && gVar.b()) {
                gVar.f2250j.dismiss();
            }
        }
        k kVar2 = new k(getContext());
        this.f183i = kVar2;
        kVar2.f2576q = true;
        kVar2.f2577r = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c.b(this.f183i, this.g);
        k kVar3 = this.f183i;
        a0 a0Var = kVar3.f2572m;
        if (a0Var == null) {
            a0 a0Var2 = (a0) kVar3.f2568i.inflate(kVar3.f2570k, (ViewGroup) this, false);
            kVar3.f2572m = a0Var2;
            a0Var2.a(kVar3.h);
            kVar3.e();
        }
        a0 a0Var3 = kVar3.f2572m;
        if (a0Var != a0Var3) {
            ((ActionMenuView) a0Var3).setPresenter(kVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) a0Var3;
        this.h = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.h, layoutParams);
    }

    public final void d() {
        if (this.f193s == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f193s = linearLayout;
            this.f194t = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f195u = (TextView) this.f193s.findViewById(R.id.action_bar_subtitle);
            int i4 = this.f196v;
            if (i4 != 0) {
                this.f194t.setTextAppearance(getContext(), i4);
            }
            int i5 = this.f197w;
            if (i5 != 0) {
                this.f195u.setTextAppearance(getContext(), i5);
            }
        }
        this.f194t.setText(this.f188n);
        this.f195u.setText(this.f189o);
        boolean isEmpty = TextUtils.isEmpty(this.f188n);
        boolean isEmpty2 = TextUtils.isEmpty(this.f189o);
        this.f195u.setVisibility(!isEmpty2 ? 0 : 8);
        this.f193s.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f193s.getParent() == null) {
            addView(this.f193s);
        }
    }

    public final void e() {
        removeAllViews();
        this.f192r = null;
        this.h = null;
        this.f183i = null;
        View view = this.f191q;
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
        return this.f185k != null ? this.f182f.g : getVisibility();
    }

    public int getContentHeight() {
        return this.f184j;
    }

    public CharSequence getSubtitle() {
        return this.f189o;
    }

    public CharSequence getTitle() {
        return this.f188n;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i4) {
        if (i4 != getVisibility()) {
            l0 l0Var = this.f185k;
            if (l0Var != null) {
                l0Var.b();
            }
            super.setVisibility(i4);
        }
    }

    public final l0 i(int i4, long j4) {
        l0 l0Var = this.f185k;
        if (l0Var != null) {
            l0Var.b();
        }
        a aVar = this.f182f;
        if (i4 != 0) {
            l0 a4 = j0.a(this);
            a4.a(0.0f);
            a4.c(j4);
            aVar.h.f185k = a4;
            aVar.g = i4;
            a4.d(aVar);
            return a4;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        l0 a5 = j0.a(this);
        a5.a(1.0f);
        a5.c(j4);
        aVar.h.f185k = a5;
        aVar.g = i4;
        a5.d(aVar);
        return a5;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, e.a.f1495a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        k kVar = this.f183i;
        if (kVar != null) {
            Configuration configuration2 = kVar.g.getResources().getConfiguration();
            int i4 = configuration2.screenWidthDp;
            int i5 = configuration2.screenHeightDp;
            kVar.f2580u = (configuration2.smallestScreenWidthDp > 600 || i4 > 600 || (i4 > 960 && i5 > 720) || (i4 > 720 && i5 > 960)) ? 5 : (i4 >= 500 || (i4 > 640 && i5 > 480) || (i4 > 480 && i5 > 640)) ? 4 : i4 >= 360 ? 3 : 2;
            j.m mVar = kVar.h;
            if (mVar != null) {
                mVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k kVar = this.f183i;
        if (kVar != null) {
            kVar.c();
            g gVar = this.f183i.f2584y;
            if (gVar == null || !gVar.b()) {
                return;
            }
            gVar.f2250j.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f187m = false;
        }
        if (!this.f187m) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f187m = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f187m = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        boolean z4 = e3.f2538a;
        boolean z5 = getLayoutDirection() == 1;
        int paddingRight = z5 ? (i6 - i4) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i7 - i5) - getPaddingTop()) - getPaddingBottom();
        View view = this.f190p;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f190p.getLayoutParams();
            int i8 = z5 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i9 = z5 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i10 = z5 ? paddingRight - i8 : paddingRight + i8;
            int g = g(this.f190p, i10, paddingTop, paddingTop2, z5) + i10;
            paddingRight = z5 ? g - i9 : g + i9;
        }
        LinearLayout linearLayout = this.f193s;
        if (linearLayout != null && this.f192r == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.f193s, paddingRight, paddingTop, paddingTop2, z5);
        }
        View view2 = this.f192r;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, z5);
        }
        int paddingLeft = z5 ? getPaddingLeft() : (i6 - i4) - getPaddingRight();
        ActionMenuView actionMenuView = this.h;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z5);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        if (View.MeasureSpec.getMode(i4) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i5) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i4);
        int i6 = this.f184j;
        if (i6 <= 0) {
            i6 = View.MeasureSpec.getSize(i5);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i7 = i6 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
        View view = this.f190p;
        if (view != null) {
            int f4 = f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f190p.getLayoutParams();
            paddingLeft = f4 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.h;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.h, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f193s;
        if (linearLayout != null && this.f192r == null) {
            if (this.f198x) {
                this.f193s.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f193s.getMeasuredWidth();
                boolean z3 = measuredWidth <= paddingLeft;
                if (z3) {
                    paddingLeft -= measuredWidth;
                }
                this.f193s.setVisibility(z3 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f192r;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i8 = layoutParams.width;
            int i9 = i8 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i8 >= 0) {
                paddingLeft = Math.min(i8, paddingLeft);
            }
            int i10 = layoutParams.height;
            int i11 = i10 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i10 >= 0) {
                i7 = Math.min(i10, i7);
            }
            this.f192r.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i9), View.MeasureSpec.makeMeasureSpec(i7, i11));
        }
        if (this.f184j > 0) {
            setMeasuredDimension(size, i6);
            return;
        }
        int childCount = getChildCount();
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            int measuredHeight = getChildAt(i13).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i12) {
                i12 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f186l = false;
        }
        if (!this.f186l) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f186l = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f186l = false;
        return true;
    }

    public void setContentHeight(int i4) {
        this.f184j = i4;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f192r;
        if (view2 != null) {
            removeView(view2);
        }
        this.f192r = view;
        if (view != null && (linearLayout = this.f193s) != null) {
            removeView(linearLayout);
            this.f193s = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f189o = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f188n = charSequence;
        d();
        j0.n(this, charSequence);
    }

    public void setTitleOptional(boolean z3) {
        if (z3 != this.f198x) {
            requestLayout();
        }
        this.f198x = z3;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
