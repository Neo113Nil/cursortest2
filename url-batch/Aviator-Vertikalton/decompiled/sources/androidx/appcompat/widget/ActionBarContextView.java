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
import com.fortuneink.neonpad.R;
import com.google.android.material.datepicker.j;
import f.a;
import j.AbstractC0169b;
import k.InterfaceC0183A;
import k.MenuC0200m;
import l.C0248a;
import l.C0260g;
import l.C0268k;
import l.j1;
import q1.d;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final C0248a f988a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f989b;

    /* renamed from: c, reason: collision with root package name */
    public ActionMenuView f990c;

    /* renamed from: d, reason: collision with root package name */
    public C0268k f991d;

    /* renamed from: e, reason: collision with root package name */
    public int f992e;

    /* renamed from: f, reason: collision with root package name */
    public C0009e0 f993f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f994g;
    public boolean h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f995j;

    /* renamed from: k, reason: collision with root package name */
    public View f996k;

    /* renamed from: l, reason: collision with root package name */
    public View f997l;

    /* renamed from: m, reason: collision with root package name */
    public View f998m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f999n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f1000o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f1001p;

    /* renamed from: q, reason: collision with root package name */
    public final int f1002q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1003r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1004s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1005t;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        this.f988a = new C0248a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f989b = context;
        } else {
            this.f989b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f2390d, R.attr.actionModeStyle, 0);
        setBackground((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : d.z(context, resourceId));
        this.f1002q = obtainStyledAttributes.getResourceId(5, 0);
        this.f1003r = obtainStyledAttributes.getResourceId(4, 0);
        this.f992e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f1005t = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
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

    public final void c(AbstractC0169b abstractC0169b) {
        View view = this.f996k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f1005t, (ViewGroup) this, false);
            this.f996k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f996k);
        }
        View findViewById = this.f996k.findViewById(R.id.action_mode_close_button);
        this.f997l = findViewById;
        findViewById.setOnClickListener(new j(2, abstractC0169b));
        MenuC0200m c2 = abstractC0169b.c();
        C0268k c0268k = this.f991d;
        if (c0268k != null) {
            c0268k.f();
            C0260g c0260g = c0268k.f3403t;
            if (c0260g != null && c0260g.b()) {
                c0260g.i.dismiss();
            }
        }
        C0268k c0268k2 = new C0268k(getContext());
        this.f991d = c0268k2;
        c0268k2.f3395l = true;
        c0268k2.f3396m = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c2.b(this.f991d, this.f989b);
        C0268k c0268k3 = this.f991d;
        InterfaceC0183A interfaceC0183A = c0268k3.h;
        if (interfaceC0183A == null) {
            InterfaceC0183A interfaceC0183A2 = (InterfaceC0183A) c0268k3.f3389d.inflate(c0268k3.f3391f, (ViewGroup) this, false);
            c0268k3.h = interfaceC0183A2;
            interfaceC0183A2.c(c0268k3.f3388c);
            c0268k3.c();
        }
        InterfaceC0183A interfaceC0183A3 = c0268k3.h;
        if (interfaceC0183A != interfaceC0183A3) {
            ((ActionMenuView) interfaceC0183A3).setPresenter(c0268k3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC0183A3;
        this.f990c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f990c, layoutParams);
    }

    public final void d() {
        if (this.f999n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f999n = linearLayout;
            this.f1000o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f1001p = (TextView) this.f999n.findViewById(R.id.action_bar_subtitle);
            int i = this.f1002q;
            if (i != 0) {
                this.f1000o.setTextAppearance(getContext(), i);
            }
            int i2 = this.f1003r;
            if (i2 != 0) {
                this.f1001p.setTextAppearance(getContext(), i2);
            }
        }
        this.f1000o.setText(this.i);
        this.f1001p.setText(this.f995j);
        boolean isEmpty = TextUtils.isEmpty(this.i);
        boolean isEmpty2 = TextUtils.isEmpty(this.f995j);
        this.f1001p.setVisibility(!isEmpty2 ? 0 : 8);
        this.f999n.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f999n.getParent() == null) {
            addView(this.f999n);
        }
    }

    public final void e() {
        removeAllViews();
        this.f998m = null;
        this.f990c = null;
        this.f991d = null;
        View view = this.f997l;
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
        return this.f993f != null ? this.f988a.f3321b : getVisibility();
    }

    public int getContentHeight() {
        return this.f992e;
    }

    public CharSequence getSubtitle() {
        return this.f995j;
    }

    public CharSequence getTitle() {
        return this.i;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            C0009e0 c0009e0 = this.f993f;
            if (c0009e0 != null) {
                c0009e0.b();
            }
            super.setVisibility(i);
        }
    }

    public final C0009e0 i(int i, long j2) {
        C0009e0 c0009e0 = this.f993f;
        if (c0009e0 != null) {
            c0009e0.b();
        }
        C0248a c0248a = this.f988a;
        if (i != 0) {
            C0009e0 a2 = X.a(this);
            a2.a(0.0f);
            a2.c(j2);
            c0248a.f3322c.f993f = a2;
            c0248a.f3321b = i;
            a2.d(c0248a);
            return a2;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C0009e0 a3 = X.a(this);
        a3.a(1.0f);
        a3.c(j2);
        c0248a.f3322c.f993f = a3;
        c0248a.f3321b = i;
        a3.d(c0248a);
        return a3;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, a.f2387a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C0268k c0268k = this.f991d;
        if (c0268k != null) {
            Configuration configuration2 = c0268k.f3387b.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            c0268k.f3399p = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            MenuC0200m menuC0200m = c0268k.f3388c;
            if (menuC0200m != null) {
                menuC0200m.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0268k c0268k = this.f991d;
        if (c0268k != null) {
            c0268k.f();
            C0260g c0260g = this.f991d.f3403t;
            if (c0260g == null || !c0260g.b()) {
                return;
            }
            c0260g.i.dismiss();
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
        boolean z3 = j1.f3383a;
        boolean z4 = getLayoutDirection() == 1;
        int paddingRight = z4 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f996k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f996k.getLayoutParams();
            int i5 = z4 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z4 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z4 ? paddingRight - i5 : paddingRight + i5;
            int g2 = g(this.f996k, i7, paddingTop, paddingTop2, z4) + i7;
            paddingRight = z4 ? g2 - i6 : g2 + i6;
        }
        LinearLayout linearLayout = this.f999n;
        if (linearLayout != null && this.f998m == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.f999n, paddingRight, paddingTop, paddingTop2, z4);
        }
        View view2 = this.f998m;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, z4);
        }
        int paddingLeft = z4 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f990c;
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
        int i3 = this.f992e;
        if (i3 <= 0) {
            i3 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i4 = i3 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        View view = this.f996k;
        if (view != null) {
            int f2 = f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f996k.getLayoutParams();
            paddingLeft = f2 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f990c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f990c, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f999n;
        if (linearLayout != null && this.f998m == null) {
            if (this.f1004s) {
                this.f999n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f999n.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f999n.setVisibility(z2 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f998m;
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
            this.f998m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i4, i8));
        }
        if (this.f992e > 0) {
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
            this.f994g = false;
        }
        if (!this.f994g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f994g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f994g = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f992e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f998m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f998m = view;
        if (view != null && (linearLayout = this.f999n) != null) {
            removeView(linearLayout);
            this.f999n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f995j = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        d();
        X.m(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f1004s) {
            requestLayout();
        }
        this.f1004s = z2;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
