package androidx.appcompat.widget;

import H1.d;
import M.P;
import M.W;
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
import com.winpower.neonfit.R;
import g.AbstractC0122a;
import l.AbstractC0204a;
import m.InterfaceC0212A;
import m.MenuC0229m;
import n.C0262a;
import n.C0274g;
import n.C0282k;
import n.n1;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final C0262a f1708a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f1709b;

    /* renamed from: c, reason: collision with root package name */
    public ActionMenuView f1710c;

    /* renamed from: d, reason: collision with root package name */
    public C0282k f1711d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public W f1712f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1713g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1714h;
    public CharSequence i;
    public CharSequence j;

    /* renamed from: k, reason: collision with root package name */
    public View f1715k;

    /* renamed from: l, reason: collision with root package name */
    public View f1716l;

    /* renamed from: m, reason: collision with root package name */
    public View f1717m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f1718n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f1719o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f1720p;

    /* renamed from: q, reason: collision with root package name */
    public final int f1721q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1722r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1723s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1724t;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        this.f1708a = new C0262a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1709b = context;
        } else {
            this.f1709b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0122a.f2698d, R.attr.actionModeStyle, 0);
        setBackground((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : d.F(context, resourceId));
        this.f1721q = obtainStyledAttributes.getResourceId(5, 0);
        this.f1722r = obtainStyledAttributes.getResourceId(4, 0);
        this.e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f1724t = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
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

    public final void c(AbstractC0204a abstractC0204a) {
        View view = this.f1715k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f1724t, (ViewGroup) this, false);
            this.f1715k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f1715k);
        }
        View findViewById = this.f1715k.findViewById(R.id.action_mode_close_button);
        this.f1716l = findViewById;
        findViewById.setOnClickListener(new j(2, abstractC0204a));
        MenuC0229m d2 = abstractC0204a.d();
        C0282k c0282k = this.f1711d;
        if (c0282k != null) {
            c0282k.e();
            C0274g c0274g = c0282k.f3666t;
            if (c0274g != null && c0274g.b()) {
                c0274g.i.dismiss();
            }
        }
        C0282k c0282k2 = new C0282k(getContext());
        this.f1711d = c0282k2;
        c0282k2.f3658l = true;
        c0282k2.f3659m = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        d2.b(this.f1711d, this.f1709b);
        C0282k c0282k3 = this.f1711d;
        InterfaceC0212A interfaceC0212A = c0282k3.f3656h;
        if (interfaceC0212A == null) {
            InterfaceC0212A interfaceC0212A2 = (InterfaceC0212A) c0282k3.f3653d.inflate(c0282k3.f3654f, (ViewGroup) this, false);
            c0282k3.f3656h = interfaceC0212A2;
            interfaceC0212A2.b(c0282k3.f3652c);
            c0282k3.d();
        }
        InterfaceC0212A interfaceC0212A3 = c0282k3.f3656h;
        if (interfaceC0212A != interfaceC0212A3) {
            ((ActionMenuView) interfaceC0212A3).setPresenter(c0282k3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC0212A3;
        this.f1710c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f1710c, layoutParams);
    }

    public final void d() {
        if (this.f1718n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1718n = linearLayout;
            this.f1719o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f1720p = (TextView) this.f1718n.findViewById(R.id.action_bar_subtitle);
            int i = this.f1721q;
            if (i != 0) {
                this.f1719o.setTextAppearance(getContext(), i);
            }
            int i2 = this.f1722r;
            if (i2 != 0) {
                this.f1720p.setTextAppearance(getContext(), i2);
            }
        }
        this.f1719o.setText(this.i);
        this.f1720p.setText(this.j);
        boolean isEmpty = TextUtils.isEmpty(this.i);
        boolean isEmpty2 = TextUtils.isEmpty(this.j);
        this.f1720p.setVisibility(!isEmpty2 ? 0 : 8);
        this.f1718n.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f1718n.getParent() == null) {
            addView(this.f1718n);
        }
    }

    public final void e() {
        removeAllViews();
        this.f1717m = null;
        this.f1710c = null;
        this.f1711d = null;
        View view = this.f1716l;
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
        return this.f1712f != null ? this.f1708a.f3594b : getVisibility();
    }

    public int getContentHeight() {
        return this.e;
    }

    public CharSequence getSubtitle() {
        return this.j;
    }

    public CharSequence getTitle() {
        return this.i;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            W w2 = this.f1712f;
            if (w2 != null) {
                w2.b();
            }
            super.setVisibility(i);
        }
    }

    public final W i(int i, long j) {
        W w2 = this.f1712f;
        if (w2 != null) {
            w2.b();
        }
        C0262a c0262a = this.f1708a;
        if (i != 0) {
            W a2 = P.a(this);
            a2.a(0.0f);
            a2.c(j);
            c0262a.f3595c.f1712f = a2;
            c0262a.f3594b = i;
            a2.d(c0262a);
            return a2;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        W a3 = P.a(this);
        a3.a(1.0f);
        a3.c(j);
        c0262a.f3595c.f1712f = a3;
        c0262a.f3594b = i;
        a3.d(c0262a);
        return a3;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0122a.f2695a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C0282k c0282k = this.f1711d;
        if (c0282k != null) {
            Configuration configuration2 = c0282k.f3651b.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            c0282k.f3662p = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            MenuC0229m menuC0229m = c0282k.f3652c;
            if (menuC0229m != null) {
                menuC0229m.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0282k c0282k = this.f1711d;
        if (c0282k != null) {
            c0282k.e();
            C0274g c0274g = this.f1711d.f3666t;
            if (c0274g == null || !c0274g.b()) {
                return;
            }
            c0274g.i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1714h = false;
        }
        if (!this.f1714h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1714h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1714h = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        boolean z3 = n1.f3683a;
        boolean z4 = getLayoutDirection() == 1;
        int paddingRight = z4 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1715k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1715k.getLayoutParams();
            int i5 = z4 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z4 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z4 ? paddingRight - i5 : paddingRight + i5;
            int g2 = g(this.f1715k, i7, paddingTop, paddingTop2, z4) + i7;
            paddingRight = z4 ? g2 - i6 : g2 + i6;
        }
        LinearLayout linearLayout = this.f1718n;
        if (linearLayout != null && this.f1717m == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.f1718n, paddingRight, paddingTop, paddingTop2, z4);
        }
        View view2 = this.f1717m;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, z4);
        }
        int paddingLeft = z4 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1710c;
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
        int i3 = this.e;
        if (i3 <= 0) {
            i3 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i4 = i3 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        View view = this.f1715k;
        if (view != null) {
            int f2 = f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1715k.getLayoutParams();
            paddingLeft = f2 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1710c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f1710c, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f1718n;
        if (linearLayout != null && this.f1717m == null) {
            if (this.f1723s) {
                this.f1718n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f1718n.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f1718n.setVisibility(z2 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f1717m;
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
            this.f1717m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i4, i8));
        }
        if (this.e > 0) {
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
            this.f1713g = false;
        }
        if (!this.f1713g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1713g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1713g = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1717m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1717m = view;
        if (view != null && (linearLayout = this.f1718n) != null) {
            removeView(linearLayout);
            this.f1718n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.j = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        d();
        P.m(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f1723s) {
            requestLayout();
        }
        this.f1723s = z2;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
