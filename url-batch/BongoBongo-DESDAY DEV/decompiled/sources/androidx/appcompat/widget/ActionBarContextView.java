package androidx.appcompat.widget;

import L.C0005c0;
import L.T;
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
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.j;
import com.winfour.winrandom.R;
import f.AbstractC0097a;
import h.AbstractC0112a;
import k.AbstractC0147a;
import l.InterfaceC0152A;
import l.MenuC0169m;
import m.C0201a;
import m.C0213g;
import m.C0221k;
import m.o1;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final C0201a f1341a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f1342b;

    /* renamed from: c, reason: collision with root package name */
    public ActionMenuView f1343c;
    public C0221k d;

    /* renamed from: e, reason: collision with root package name */
    public int f1344e;

    /* renamed from: f, reason: collision with root package name */
    public C0005c0 f1345f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1346g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1347h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f1348j;

    /* renamed from: k, reason: collision with root package name */
    public View f1349k;

    /* renamed from: l, reason: collision with root package name */
    public View f1350l;

    /* renamed from: m, reason: collision with root package name */
    public View f1351m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f1352n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f1353o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f1354p;

    /* renamed from: q, reason: collision with root package name */
    public final int f1355q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1356r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1357s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1358t;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        this.f1341a = new C0201a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1342b = context;
        } else {
            this.f1342b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0097a.d, R.attr.actionModeStyle, 0);
        setBackground((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : AbstractC0112a.l(context, resourceId));
        this.f1355q = obtainStyledAttributes.getResourceId(5, 0);
        this.f1356r = obtainStyledAttributes.getResourceId(4, 0);
        this.f1344e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f1358t = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
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

    public final void c(AbstractC0147a abstractC0147a) {
        View view = this.f1349k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f1358t, (ViewGroup) this, false);
            this.f1349k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f1349k);
        }
        View findViewById = this.f1349k.findViewById(R.id.action_mode_close_button);
        this.f1350l = findViewById;
        findViewById.setOnClickListener(new j(2, abstractC0147a));
        MenuC0169m c2 = abstractC0147a.c();
        C0221k c0221k = this.d;
        if (c0221k != null) {
            c0221k.f();
            C0213g c0213g = c0221k.f3140t;
            if (c0213g != null && c0213g.b()) {
                c0213g.i.dismiss();
            }
        }
        C0221k c0221k2 = new C0221k(getContext());
        this.d = c0221k2;
        c0221k2.f3132l = true;
        c0221k2.f3133m = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c2.b(this.d, this.f1342b);
        C0221k c0221k3 = this.d;
        InterfaceC0152A interfaceC0152A = c0221k3.f3129h;
        if (interfaceC0152A == null) {
            InterfaceC0152A interfaceC0152A2 = (InterfaceC0152A) c0221k3.d.inflate(c0221k3.f3127f, (ViewGroup) this, false);
            c0221k3.f3129h = interfaceC0152A2;
            interfaceC0152A2.a(c0221k3.f3125c);
            c0221k3.c();
        }
        InterfaceC0152A interfaceC0152A3 = c0221k3.f3129h;
        if (interfaceC0152A != interfaceC0152A3) {
            ((ActionMenuView) interfaceC0152A3).setPresenter(c0221k3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC0152A3;
        this.f1343c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f1343c, layoutParams);
    }

    public final void d() {
        if (this.f1352n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1352n = linearLayout;
            this.f1353o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f1354p = (TextView) this.f1352n.findViewById(R.id.action_bar_subtitle);
            int i = this.f1355q;
            if (i != 0) {
                this.f1353o.setTextAppearance(getContext(), i);
            }
            int i2 = this.f1356r;
            if (i2 != 0) {
                this.f1354p.setTextAppearance(getContext(), i2);
            }
        }
        this.f1353o.setText(this.i);
        this.f1354p.setText(this.f1348j);
        boolean isEmpty = TextUtils.isEmpty(this.i);
        boolean isEmpty2 = TextUtils.isEmpty(this.f1348j);
        this.f1354p.setVisibility(!isEmpty2 ? 0 : 8);
        this.f1352n.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f1352n.getParent() == null) {
            addView(this.f1352n);
        }
    }

    public final void e() {
        removeAllViews();
        this.f1351m = null;
        this.f1343c = null;
        this.d = null;
        View view = this.f1350l;
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
        return this.f1345f != null ? this.f1341a.f3066b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1344e;
    }

    public CharSequence getSubtitle() {
        return this.f1348j;
    }

    public CharSequence getTitle() {
        return this.i;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            C0005c0 c0005c0 = this.f1345f;
            if (c0005c0 != null) {
                c0005c0.b();
            }
            super.setVisibility(i);
        }
    }

    public final C0005c0 i(int i, long j2) {
        C0005c0 c0005c0 = this.f1345f;
        if (c0005c0 != null) {
            c0005c0.b();
        }
        C0201a c0201a = this.f1341a;
        if (i != 0) {
            C0005c0 a2 = T.a(this);
            a2.a(RecyclerView.A0);
            a2.c(j2);
            c0201a.f3067c.f1345f = a2;
            c0201a.f3066b = i;
            a2.d(c0201a);
            return a2;
        }
        if (getVisibility() != 0) {
            setAlpha(RecyclerView.A0);
        }
        C0005c0 a3 = T.a(this);
        a3.a(1.0f);
        a3.c(j2);
        c0201a.f3067c.f1345f = a3;
        c0201a.f3066b = i;
        a3.d(c0201a);
        return a3;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0097a.f2136a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C0221k c0221k = this.d;
        if (c0221k != null) {
            Configuration configuration2 = c0221k.f3124b.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            c0221k.f3136p = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            MenuC0169m menuC0169m = c0221k.f3125c;
            if (menuC0169m != null) {
                menuC0169m.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0221k c0221k = this.d;
        if (c0221k != null) {
            c0221k.f();
            C0213g c0213g = this.d.f3140t;
            if (c0213g == null || !c0213g.b()) {
                return;
            }
            c0213g.i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1347h = false;
        }
        if (!this.f1347h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1347h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1347h = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        boolean z3 = o1.f3158a;
        boolean z4 = getLayoutDirection() == 1;
        int paddingRight = z4 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1349k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1349k.getLayoutParams();
            int i5 = z4 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z4 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z4 ? paddingRight - i5 : paddingRight + i5;
            int g2 = g(this.f1349k, i7, paddingTop, paddingTop2, z4) + i7;
            paddingRight = z4 ? g2 - i6 : g2 + i6;
        }
        LinearLayout linearLayout = this.f1352n;
        if (linearLayout != null && this.f1351m == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.f1352n, paddingRight, paddingTop, paddingTop2, z4);
        }
        View view2 = this.f1351m;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, z4);
        }
        int paddingLeft = z4 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1343c;
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
        int i3 = this.f1344e;
        if (i3 <= 0) {
            i3 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i4 = i3 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        View view = this.f1349k;
        if (view != null) {
            int f2 = f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1349k.getLayoutParams();
            paddingLeft = f2 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1343c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f1343c, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f1352n;
        if (linearLayout != null && this.f1351m == null) {
            if (this.f1357s) {
                this.f1352n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f1352n.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f1352n.setVisibility(z2 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f1351m;
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
            this.f1351m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i4, i8));
        }
        if (this.f1344e > 0) {
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
            this.f1346g = false;
        }
        if (!this.f1346g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1346g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1346g = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f1344e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1351m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1351m = view;
        if (view != null && (linearLayout = this.f1352n) != null) {
            removeView(linearLayout);
            this.f1352n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1348j = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        d();
        T.m(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f1357s) {
            requestLayout();
        }
        this.f1357s = z2;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
