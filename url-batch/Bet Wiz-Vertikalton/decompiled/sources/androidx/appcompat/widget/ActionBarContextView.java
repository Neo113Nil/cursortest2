package androidx.appcompat.widget;

import K.S;
import K.Z;
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
import com.neonpulse.gridlogic.R;
import f.a;
import j.AbstractC0139a;
import k.InterfaceC0143A;
import k.MenuC0160m;
import l.C0205a;
import l.C0217g;
import l.C0225k;
import l.i1;
import x1.l;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final C0205a f1244a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f1245b;

    /* renamed from: c, reason: collision with root package name */
    public ActionMenuView f1246c;
    public C0225k d;

    /* renamed from: e, reason: collision with root package name */
    public int f1247e;

    /* renamed from: f, reason: collision with root package name */
    public Z f1248f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1249g;
    public boolean h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f1250j;

    /* renamed from: k, reason: collision with root package name */
    public View f1251k;

    /* renamed from: l, reason: collision with root package name */
    public View f1252l;

    /* renamed from: m, reason: collision with root package name */
    public View f1253m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f1254n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f1255o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f1256p;

    /* renamed from: q, reason: collision with root package name */
    public final int f1257q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1258r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1259s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1260t;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        this.f1244a = new C0205a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1245b = context;
        } else {
            this.f1245b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.d, R.attr.actionModeStyle, 0);
        setBackground((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : l.z(context, resourceId));
        this.f1257q = obtainStyledAttributes.getResourceId(5, 0);
        this.f1258r = obtainStyledAttributes.getResourceId(4, 0);
        this.f1247e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f1260t = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
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

    public final void c(AbstractC0139a abstractC0139a) {
        View view = this.f1251k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f1260t, (ViewGroup) this, false);
            this.f1251k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f1251k);
        }
        View findViewById = this.f1251k.findViewById(R.id.action_mode_close_button);
        this.f1252l = findViewById;
        findViewById.setOnClickListener(new j(2, abstractC0139a));
        MenuC0160m c2 = abstractC0139a.c();
        C0225k c0225k = this.d;
        if (c0225k != null) {
            c0225k.e();
            C0217g c0217g = c0225k.f3009t;
            if (c0217g != null && c0217g.b()) {
                c0217g.i.dismiss();
            }
        }
        C0225k c0225k2 = new C0225k(getContext());
        this.d = c0225k2;
        c0225k2.f3001l = true;
        c0225k2.f3002m = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c2.b(this.d, this.f1245b);
        C0225k c0225k3 = this.d;
        InterfaceC0143A interfaceC0143A = c0225k3.h;
        if (interfaceC0143A == null) {
            InterfaceC0143A interfaceC0143A2 = (InterfaceC0143A) c0225k3.d.inflate(c0225k3.f2997f, (ViewGroup) this, false);
            c0225k3.h = interfaceC0143A2;
            interfaceC0143A2.c(c0225k3.f2995c);
            c0225k3.c();
        }
        InterfaceC0143A interfaceC0143A3 = c0225k3.h;
        if (interfaceC0143A != interfaceC0143A3) {
            ((ActionMenuView) interfaceC0143A3).setPresenter(c0225k3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC0143A3;
        this.f1246c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f1246c, layoutParams);
    }

    public final void d() {
        if (this.f1254n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1254n = linearLayout;
            this.f1255o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f1256p = (TextView) this.f1254n.findViewById(R.id.action_bar_subtitle);
            int i = this.f1257q;
            if (i != 0) {
                this.f1255o.setTextAppearance(getContext(), i);
            }
            int i2 = this.f1258r;
            if (i2 != 0) {
                this.f1256p.setTextAppearance(getContext(), i2);
            }
        }
        this.f1255o.setText(this.i);
        this.f1256p.setText(this.f1250j);
        boolean isEmpty = TextUtils.isEmpty(this.i);
        boolean isEmpty2 = TextUtils.isEmpty(this.f1250j);
        this.f1256p.setVisibility(!isEmpty2 ? 0 : 8);
        this.f1254n.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f1254n.getParent() == null) {
            addView(this.f1254n);
        }
    }

    public final void e() {
        removeAllViews();
        this.f1253m = null;
        this.f1246c = null;
        this.d = null;
        View view = this.f1252l;
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
        return this.f1248f != null ? this.f1244a.f2944b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1247e;
    }

    public CharSequence getSubtitle() {
        return this.f1250j;
    }

    public CharSequence getTitle() {
        return this.i;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            Z z2 = this.f1248f;
            if (z2 != null) {
                z2.b();
            }
            super.setVisibility(i);
        }
    }

    public final Z i(int i, long j2) {
        Z z2 = this.f1248f;
        if (z2 != null) {
            z2.b();
        }
        C0205a c0205a = this.f1244a;
        if (i != 0) {
            Z a2 = S.a(this);
            a2.a(0.0f);
            a2.c(j2);
            c0205a.f2945c.f1248f = a2;
            c0205a.f2944b = i;
            a2.d(c0205a);
            return a2;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        Z a3 = S.a(this);
        a3.a(1.0f);
        a3.c(j2);
        c0205a.f2945c.f1248f = a3;
        c0205a.f2944b = i;
        a3.d(c0205a);
        return a3;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, a.f2057a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C0225k c0225k = this.d;
        if (c0225k != null) {
            Configuration configuration2 = c0225k.f2994b.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            c0225k.f3005p = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            MenuC0160m menuC0160m = c0225k.f2995c;
            if (menuC0160m != null) {
                menuC0160m.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0225k c0225k = this.d;
        if (c0225k != null) {
            c0225k.e();
            C0217g c0217g = this.d.f3009t;
            if (c0217g == null || !c0217g.b()) {
                return;
            }
            c0217g.i.dismiss();
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
        boolean z3 = i1.f2990a;
        boolean z4 = getLayoutDirection() == 1;
        int paddingRight = z4 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1251k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1251k.getLayoutParams();
            int i5 = z4 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z4 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z4 ? paddingRight - i5 : paddingRight + i5;
            int g2 = g(this.f1251k, i7, paddingTop, paddingTop2, z4) + i7;
            paddingRight = z4 ? g2 - i6 : g2 + i6;
        }
        LinearLayout linearLayout = this.f1254n;
        if (linearLayout != null && this.f1253m == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.f1254n, paddingRight, paddingTop, paddingTop2, z4);
        }
        View view2 = this.f1253m;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, z4);
        }
        int paddingLeft = z4 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1246c;
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
        int i3 = this.f1247e;
        if (i3 <= 0) {
            i3 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i4 = i3 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        View view = this.f1251k;
        if (view != null) {
            int f2 = f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1251k.getLayoutParams();
            paddingLeft = f2 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1246c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f1246c, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f1254n;
        if (linearLayout != null && this.f1253m == null) {
            if (this.f1259s) {
                this.f1254n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f1254n.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f1254n.setVisibility(z2 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f1253m;
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
            this.f1253m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i4, i8));
        }
        if (this.f1247e > 0) {
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
            this.f1249g = false;
        }
        if (!this.f1249g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1249g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1249g = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f1247e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1253m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1253m = view;
        if (view != null && (linearLayout = this.f1254n) != null) {
            removeView(linearLayout);
            this.f1254n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1250j = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        d();
        S.m(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f1259s) {
            requestLayout();
        }
        this.f1259s = z2;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
