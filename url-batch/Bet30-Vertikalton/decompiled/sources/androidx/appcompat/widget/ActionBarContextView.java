package androidx.appcompat.widget;

import K.C0001a0;
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
import com.google.android.material.datepicker.j;
import com.lasercut.dash.R;
import f.a;
import j.AbstractC0137a;
import k.InterfaceC0140A;
import k.MenuC0157m;
import l.C0222a;
import l.C0234g;
import l.C0244l;
import l.i1;
import q1.l;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final C0222a f1139a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f1140b;

    /* renamed from: c, reason: collision with root package name */
    public ActionMenuView f1141c;
    public C0244l d;

    /* renamed from: e, reason: collision with root package name */
    public int f1142e;

    /* renamed from: f, reason: collision with root package name */
    public C0001a0 f1143f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1144g;
    public boolean h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f1145j;

    /* renamed from: k, reason: collision with root package name */
    public View f1146k;

    /* renamed from: l, reason: collision with root package name */
    public View f1147l;

    /* renamed from: m, reason: collision with root package name */
    public View f1148m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f1149n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f1150o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f1151p;

    /* renamed from: q, reason: collision with root package name */
    public final int f1152q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1153r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1154s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1155t;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        this.f1139a = new C0222a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1140b = context;
        } else {
            this.f1140b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.d, R.attr.actionModeStyle, 0);
        setBackground((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : l.v(context, resourceId));
        this.f1152q = obtainStyledAttributes.getResourceId(5, 0);
        this.f1153r = obtainStyledAttributes.getResourceId(4, 0);
        this.f1142e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f1155t = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
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

    public final void c(AbstractC0137a abstractC0137a) {
        View view = this.f1146k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f1155t, (ViewGroup) this, false);
            this.f1146k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f1146k);
        }
        View findViewById = this.f1146k.findViewById(R.id.action_mode_close_button);
        this.f1147l = findViewById;
        findViewById.setOnClickListener(new j(2, abstractC0137a));
        MenuC0157m c2 = abstractC0137a.c();
        C0244l c0244l = this.d;
        if (c0244l != null) {
            c0244l.f();
            C0234g c0234g = c0244l.f3024t;
            if (c0234g != null && c0234g.b()) {
                c0234g.i.dismiss();
            }
        }
        C0244l c0244l2 = new C0244l(getContext());
        this.d = c0244l2;
        c0244l2.f3016l = true;
        c0244l2.f3017m = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c2.b(this.d, this.f1140b);
        C0244l c0244l3 = this.d;
        InterfaceC0140A interfaceC0140A = c0244l3.h;
        if (interfaceC0140A == null) {
            InterfaceC0140A interfaceC0140A2 = (InterfaceC0140A) c0244l3.d.inflate(c0244l3.f3012f, (ViewGroup) this, false);
            c0244l3.h = interfaceC0140A2;
            interfaceC0140A2.c(c0244l3.f3010c);
            c0244l3.c();
        }
        InterfaceC0140A interfaceC0140A3 = c0244l3.h;
        if (interfaceC0140A != interfaceC0140A3) {
            ((ActionMenuView) interfaceC0140A3).setPresenter(c0244l3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC0140A3;
        this.f1141c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f1141c, layoutParams);
    }

    public final void d() {
        if (this.f1149n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1149n = linearLayout;
            this.f1150o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f1151p = (TextView) this.f1149n.findViewById(R.id.action_bar_subtitle);
            int i = this.f1152q;
            if (i != 0) {
                this.f1150o.setTextAppearance(getContext(), i);
            }
            int i2 = this.f1153r;
            if (i2 != 0) {
                this.f1151p.setTextAppearance(getContext(), i2);
            }
        }
        this.f1150o.setText(this.i);
        this.f1151p.setText(this.f1145j);
        boolean isEmpty = TextUtils.isEmpty(this.i);
        boolean isEmpty2 = TextUtils.isEmpty(this.f1145j);
        this.f1151p.setVisibility(!isEmpty2 ? 0 : 8);
        this.f1149n.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f1149n.getParent() == null) {
            addView(this.f1149n);
        }
    }

    public final void e() {
        removeAllViews();
        this.f1148m = null;
        this.f1141c = null;
        this.d = null;
        View view = this.f1147l;
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
        return this.f1143f != null ? this.f1139a.f2957b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1142e;
    }

    public CharSequence getSubtitle() {
        return this.f1145j;
    }

    public CharSequence getTitle() {
        return this.i;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            C0001a0 c0001a0 = this.f1143f;
            if (c0001a0 != null) {
                c0001a0.b();
            }
            super.setVisibility(i);
        }
    }

    public final C0001a0 i(int i, long j2) {
        C0001a0 c0001a0 = this.f1143f;
        if (c0001a0 != null) {
            c0001a0.b();
        }
        C0222a c0222a = this.f1139a;
        if (i != 0) {
            C0001a0 a2 = T.a(this);
            a2.a(0.0f);
            a2.c(j2);
            c0222a.f2958c.f1143f = a2;
            c0222a.f2957b = i;
            a2.d(c0222a);
            return a2;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C0001a0 a3 = T.a(this);
        a3.a(1.0f);
        a3.c(j2);
        c0222a.f2958c.f1143f = a3;
        c0222a.f2957b = i;
        a3.d(c0222a);
        return a3;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, a.f1925a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C0244l c0244l = this.d;
        if (c0244l != null) {
            Configuration configuration2 = c0244l.f3009b.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            c0244l.f3020p = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            MenuC0157m menuC0157m = c0244l.f3010c;
            if (menuC0157m != null) {
                menuC0157m.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0244l c0244l = this.d;
        if (c0244l != null) {
            c0244l.f();
            C0234g c0234g = this.d.f3024t;
            if (c0234g == null || !c0234g.b()) {
                return;
            }
            c0234g.i.dismiss();
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
        boolean z3 = i1.f3001a;
        boolean z4 = getLayoutDirection() == 1;
        int paddingRight = z4 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1146k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1146k.getLayoutParams();
            int i5 = z4 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z4 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z4 ? paddingRight - i5 : paddingRight + i5;
            int g2 = g(this.f1146k, i7, paddingTop, paddingTop2, z4) + i7;
            paddingRight = z4 ? g2 - i6 : g2 + i6;
        }
        LinearLayout linearLayout = this.f1149n;
        if (linearLayout != null && this.f1148m == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.f1149n, paddingRight, paddingTop, paddingTop2, z4);
        }
        View view2 = this.f1148m;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, z4);
        }
        int paddingLeft = z4 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1141c;
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
        int i3 = this.f1142e;
        if (i3 <= 0) {
            i3 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i4 = i3 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        View view = this.f1146k;
        if (view != null) {
            int f2 = f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1146k.getLayoutParams();
            paddingLeft = f2 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1141c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f1141c, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f1149n;
        if (linearLayout != null && this.f1148m == null) {
            if (this.f1154s) {
                this.f1149n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f1149n.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f1149n.setVisibility(z2 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f1148m;
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
            this.f1148m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i4, i8));
        }
        if (this.f1142e > 0) {
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
            this.f1144g = false;
        }
        if (!this.f1144g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1144g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1144g = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f1142e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1148m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1148m = view;
        if (view != null && (linearLayout = this.f1149n) != null) {
            removeView(linearLayout);
            this.f1149n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1145j = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        d();
        T.m(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f1154s) {
            requestLayout();
        }
        this.f1154s = z2;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
