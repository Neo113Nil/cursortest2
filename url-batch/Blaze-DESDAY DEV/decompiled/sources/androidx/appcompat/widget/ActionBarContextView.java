package androidx.appcompat.widget;

import K.C0005c0;
import K.T;
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
import com.winworm.neongrid.R;
import f.a;
import j.AbstractC0144a;
import k.InterfaceC0149A;
import k.MenuC0166m;
import l.C0199a;
import l.C0211g;
import l.C0219k;
import l.i1;
import z1.l;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final C0199a f1289a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f1290b;

    /* renamed from: c, reason: collision with root package name */
    public ActionMenuView f1291c;
    public C0219k d;

    /* renamed from: e, reason: collision with root package name */
    public int f1292e;

    /* renamed from: f, reason: collision with root package name */
    public C0005c0 f1293f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1294g;
    public boolean h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f1295j;

    /* renamed from: k, reason: collision with root package name */
    public View f1296k;

    /* renamed from: l, reason: collision with root package name */
    public View f1297l;

    /* renamed from: m, reason: collision with root package name */
    public View f1298m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f1299n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f1300o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f1301p;

    /* renamed from: q, reason: collision with root package name */
    public final int f1302q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1303r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1304s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1305t;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        this.f1289a = new C0199a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1290b = context;
        } else {
            this.f1290b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.d, R.attr.actionModeStyle, 0);
        setBackground((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : l.w(context, resourceId));
        this.f1302q = obtainStyledAttributes.getResourceId(5, 0);
        this.f1303r = obtainStyledAttributes.getResourceId(4, 0);
        this.f1292e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f1305t = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
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

    public final void c(AbstractC0144a abstractC0144a) {
        View view = this.f1296k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f1305t, (ViewGroup) this, false);
            this.f1296k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f1296k);
        }
        View findViewById = this.f1296k.findViewById(R.id.action_mode_close_button);
        this.f1297l = findViewById;
        findViewById.setOnClickListener(new j(2, abstractC0144a));
        MenuC0166m c2 = abstractC0144a.c();
        C0219k c0219k = this.d;
        if (c0219k != null) {
            c0219k.e();
            C0211g c0211g = c0219k.f2973t;
            if (c0211g != null && c0211g.b()) {
                c0211g.i.dismiss();
            }
        }
        C0219k c0219k2 = new C0219k(getContext());
        this.d = c0219k2;
        c0219k2.f2965l = true;
        c0219k2.f2966m = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c2.b(this.d, this.f1290b);
        C0219k c0219k3 = this.d;
        InterfaceC0149A interfaceC0149A = c0219k3.h;
        if (interfaceC0149A == null) {
            InterfaceC0149A interfaceC0149A2 = (InterfaceC0149A) c0219k3.d.inflate(c0219k3.f2961f, (ViewGroup) this, false);
            c0219k3.h = interfaceC0149A2;
            interfaceC0149A2.c(c0219k3.f2959c);
            c0219k3.c();
        }
        InterfaceC0149A interfaceC0149A3 = c0219k3.h;
        if (interfaceC0149A != interfaceC0149A3) {
            ((ActionMenuView) interfaceC0149A3).setPresenter(c0219k3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC0149A3;
        this.f1291c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f1291c, layoutParams);
    }

    public final void d() {
        if (this.f1299n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1299n = linearLayout;
            this.f1300o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f1301p = (TextView) this.f1299n.findViewById(R.id.action_bar_subtitle);
            int i = this.f1302q;
            if (i != 0) {
                this.f1300o.setTextAppearance(getContext(), i);
            }
            int i2 = this.f1303r;
            if (i2 != 0) {
                this.f1301p.setTextAppearance(getContext(), i2);
            }
        }
        this.f1300o.setText(this.i);
        this.f1301p.setText(this.f1295j);
        boolean isEmpty = TextUtils.isEmpty(this.i);
        boolean isEmpty2 = TextUtils.isEmpty(this.f1295j);
        this.f1301p.setVisibility(!isEmpty2 ? 0 : 8);
        this.f1299n.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f1299n.getParent() == null) {
            addView(this.f1299n);
        }
    }

    public final void e() {
        removeAllViews();
        this.f1298m = null;
        this.f1291c = null;
        this.d = null;
        View view = this.f1297l;
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
        return this.f1293f != null ? this.f1289a.f2908b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1292e;
    }

    public CharSequence getSubtitle() {
        return this.f1295j;
    }

    public CharSequence getTitle() {
        return this.i;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            C0005c0 c0005c0 = this.f1293f;
            if (c0005c0 != null) {
                c0005c0.b();
            }
            super.setVisibility(i);
        }
    }

    public final C0005c0 i(int i, long j2) {
        C0005c0 c0005c0 = this.f1293f;
        if (c0005c0 != null) {
            c0005c0.b();
        }
        C0199a c0199a = this.f1289a;
        if (i != 0) {
            C0005c0 a2 = T.a(this);
            a2.a(RecyclerView.f1559A0);
            a2.c(j2);
            c0199a.f2909c.f1293f = a2;
            c0199a.f2908b = i;
            a2.d(c0199a);
            return a2;
        }
        if (getVisibility() != 0) {
            setAlpha(RecyclerView.f1559A0);
        }
        C0005c0 a3 = T.a(this);
        a3.a(1.0f);
        a3.c(j2);
        c0199a.f2909c.f1293f = a3;
        c0199a.f2908b = i;
        a3.d(c0199a);
        return a3;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, a.f2098a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C0219k c0219k = this.d;
        if (c0219k != null) {
            Configuration configuration2 = c0219k.f2958b.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            c0219k.f2969p = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            MenuC0166m menuC0166m = c0219k.f2959c;
            if (menuC0166m != null) {
                menuC0166m.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0219k c0219k = this.d;
        if (c0219k != null) {
            c0219k.e();
            C0211g c0211g = this.d.f2973t;
            if (c0211g == null || !c0211g.b()) {
                return;
            }
            c0211g.i.dismiss();
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
        boolean z3 = i1.f2954a;
        boolean z4 = getLayoutDirection() == 1;
        int paddingRight = z4 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1296k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1296k.getLayoutParams();
            int i5 = z4 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z4 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z4 ? paddingRight - i5 : paddingRight + i5;
            int g2 = g(this.f1296k, i7, paddingTop, paddingTop2, z4) + i7;
            paddingRight = z4 ? g2 - i6 : g2 + i6;
        }
        LinearLayout linearLayout = this.f1299n;
        if (linearLayout != null && this.f1298m == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.f1299n, paddingRight, paddingTop, paddingTop2, z4);
        }
        View view2 = this.f1298m;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, z4);
        }
        int paddingLeft = z4 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1291c;
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
        int i3 = this.f1292e;
        if (i3 <= 0) {
            i3 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i4 = i3 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        View view = this.f1296k;
        if (view != null) {
            int f2 = f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1296k.getLayoutParams();
            paddingLeft = f2 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1291c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f1291c, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f1299n;
        if (linearLayout != null && this.f1298m == null) {
            if (this.f1304s) {
                this.f1299n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f1299n.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f1299n.setVisibility(z2 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f1298m;
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
            this.f1298m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i4, i8));
        }
        if (this.f1292e > 0) {
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
            this.f1294g = false;
        }
        if (!this.f1294g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1294g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1294g = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f1292e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1298m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1298m = view;
        if (view != null && (linearLayout = this.f1299n) != null) {
            removeView(linearLayout);
            this.f1299n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1295j = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        d();
        T.m(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f1304s) {
            requestLayout();
        }
        this.f1304s = z2;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
