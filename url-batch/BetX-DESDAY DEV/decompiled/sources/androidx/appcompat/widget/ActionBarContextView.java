package androidx.appcompat.widget;

import K.C0009e0;
import K.X;
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
import com.google.android.material.datepicker.j;
import com.luckyarcade.spinthrow.R;
import f.a;
import j.AbstractC0170b;
import k.InterfaceC0185A;
import k.MenuC0202m;
import l.C0250a;
import l.C0262g;
import l.C0270k;
import l.i1;
import q1.d;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final C0250a f989a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f990b;

    /* renamed from: c, reason: collision with root package name */
    public ActionMenuView f991c;

    /* renamed from: d, reason: collision with root package name */
    public C0270k f992d;

    /* renamed from: e, reason: collision with root package name */
    public int f993e;

    /* renamed from: f, reason: collision with root package name */
    public C0009e0 f994f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f995g;
    public boolean h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f996j;

    /* renamed from: k, reason: collision with root package name */
    public View f997k;

    /* renamed from: l, reason: collision with root package name */
    public View f998l;

    /* renamed from: m, reason: collision with root package name */
    public View f999m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f1000n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f1001o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f1002p;

    /* renamed from: q, reason: collision with root package name */
    public final int f1003q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1004r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1005s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1006t;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        this.f989a = new C0250a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f990b = context;
        } else {
            this.f990b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f2394d, R.attr.actionModeStyle, 0);
        setBackground((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : d.z(context, resourceId));
        this.f1003q = obtainStyledAttributes.getResourceId(5, 0);
        this.f1004r = obtainStyledAttributes.getResourceId(4, 0);
        this.f993e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f1006t = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int g(View view, int i, int i2, int i3, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z2) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z2 ? -measuredWidth : measuredWidth;
    }

    public final void c(AbstractC0170b abstractC0170b) {
        View view = this.f997k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f1006t, (ViewGroup) this, false);
            this.f997k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f997k);
        }
        View findViewById = this.f997k.findViewById(R.id.action_mode_close_button);
        this.f998l = findViewById;
        findViewById.setOnClickListener(new j(2, abstractC0170b));
        MenuC0202m c2 = abstractC0170b.c();
        C0270k c0270k = this.f992d;
        if (c0270k != null) {
            c0270k.e();
            C0262g c0262g = c0270k.f3406t;
            if (c0262g != null && c0262g.b()) {
                c0262g.i.dismiss();
            }
        }
        C0270k c0270k2 = new C0270k(getContext());
        this.f992d = c0270k2;
        c0270k2.f3398l = true;
        c0270k2.f3399m = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c2.b(this.f992d, this.f990b);
        C0270k c0270k3 = this.f992d;
        InterfaceC0185A interfaceC0185A = c0270k3.h;
        if (interfaceC0185A == null) {
            InterfaceC0185A interfaceC0185A2 = (InterfaceC0185A) c0270k3.f3392d.inflate(c0270k3.f3394f, (ViewGroup) this, false);
            c0270k3.h = interfaceC0185A2;
            interfaceC0185A2.c(c0270k3.f3391c);
            c0270k3.c();
        }
        InterfaceC0185A interfaceC0185A3 = c0270k3.h;
        if (interfaceC0185A != interfaceC0185A3) {
            ((ActionMenuView) interfaceC0185A3).setPresenter(c0270k3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC0185A3;
        this.f991c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f991c, layoutParams);
    }

    public final void d() {
        if (this.f1000n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1000n = linearLayout;
            this.f1001o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f1002p = (TextView) this.f1000n.findViewById(R.id.action_bar_subtitle);
            int i = this.f1003q;
            if (i != 0) {
                this.f1001o.setTextAppearance(getContext(), i);
            }
            int i2 = this.f1004r;
            if (i2 != 0) {
                this.f1002p.setTextAppearance(getContext(), i2);
            }
        }
        this.f1001o.setText(this.i);
        this.f1002p.setText(this.f996j);
        boolean isEmpty = TextUtils.isEmpty(this.i);
        boolean isEmpty2 = TextUtils.isEmpty(this.f996j);
        this.f1002p.setVisibility(!isEmpty2 ? 0 : 8);
        this.f1000n.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f1000n.getParent() == null) {
            addView(this.f1000n);
        }
    }

    public final void e() {
        removeAllViews();
        this.f999m = null;
        this.f991c = null;
        this.f992d = null;
        View view = this.f998l;
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
        return this.f994f != null ? this.f989a.f3334b : getVisibility();
    }

    public int getContentHeight() {
        return this.f993e;
    }

    public CharSequence getSubtitle() {
        return this.f996j;
    }

    public CharSequence getTitle() {
        return this.i;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            C0009e0 c0009e0 = this.f994f;
            if (c0009e0 != null) {
                c0009e0.b();
            }
            super.setVisibility(i);
        }
    }

    public final C0009e0 i(int i, long j2) {
        C0009e0 c0009e0 = this.f994f;
        if (c0009e0 != null) {
            c0009e0.b();
        }
        C0250a c0250a = this.f989a;
        if (i != 0) {
            C0009e0 a2 = X.a(this);
            a2.a(0.0f);
            a2.c(j2);
            c0250a.f3335c.f994f = a2;
            c0250a.f3334b = i;
            a2.d(c0250a);
            return a2;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C0009e0 a3 = X.a(this);
        a3.a(1.0f);
        a3.c(j2);
        c0250a.f3335c.f994f = a3;
        c0250a.f3334b = i;
        a3.d(c0250a);
        return a3;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, a.f2391a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C0270k c0270k = this.f992d;
        if (c0270k != null) {
            Configuration configuration2 = c0270k.f3390b.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            c0270k.f3402p = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            MenuC0202m menuC0202m = c0270k.f3391c;
            if (menuC0202m != null) {
                menuC0202m.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0270k c0270k = this.f992d;
        if (c0270k != null) {
            c0270k.e();
            C0262g c0262g = this.f992d.f3406t;
            if (c0262g == null || !c0262g.b()) {
                return;
            }
            c0262g.i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.h = false;
        }
        if (!this.h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.h = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        boolean z3 = i1.f3382a;
        boolean z4 = getLayoutDirection() == 1;
        int paddingRight = z4 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f997k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f997k.getLayoutParams();
            int i5 = z4 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z4 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z4 ? paddingRight - i5 : paddingRight + i5;
            int g2 = g(this.f997k, i7, paddingTop, paddingTop2, z4) + i7;
            paddingRight = z4 ? g2 - i6 : g2 + i6;
        }
        LinearLayout linearLayout = this.f1000n;
        if (linearLayout != null && this.f999m == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.f1000n, paddingRight, paddingTop, paddingTop2, z4);
        }
        View view2 = this.f999m;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, z4);
        }
        int paddingLeft = z4 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f991c;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z4);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.f993e;
        if (i3 <= 0) {
            i3 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i4 = i3 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        View view = this.f997k;
        if (view != null) {
            int f2 = f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f997k.getLayoutParams();
            paddingLeft = f2 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f991c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f991c, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f1000n;
        if (linearLayout != null && this.f999m == null) {
            if (this.f1005s) {
                this.f1000n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f1000n.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f1000n.setVisibility(z2 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f999m;
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
            this.f999m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i4, i8));
        }
        if (this.f993e > 0) {
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
            this.f995g = false;
        }
        if (!this.f995g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f995g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f995g = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f993e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f999m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f999m = view;
        if (view != null && (linearLayout = this.f1000n) != null) {
            removeView(linearLayout);
            this.f1000n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f996j = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        d();
        X.m(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f1005s) {
            requestLayout();
        }
        this.f1005s = z2;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
