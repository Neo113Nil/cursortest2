package androidx.appcompat.widget;

import M.Q;
import M.Y;
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
import com.winfour.neondrop.R;
import f.AbstractC0084a;
import j.AbstractC0144a;
import k.InterfaceC0158A;
import k.m;
import l.C0175a;
import l.C0187g;
import l.C0195k;
import l.j1;
import z1.l;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final C0175a f1346a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f1347b;

    /* renamed from: c, reason: collision with root package name */
    public ActionMenuView f1348c;
    public C0195k d;

    /* renamed from: e, reason: collision with root package name */
    public int f1349e;

    /* renamed from: f, reason: collision with root package name */
    public Y f1350f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1351g;
    public boolean h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f1352j;

    /* renamed from: k, reason: collision with root package name */
    public View f1353k;

    /* renamed from: l, reason: collision with root package name */
    public View f1354l;

    /* renamed from: m, reason: collision with root package name */
    public View f1355m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f1356n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f1357o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f1358p;

    /* renamed from: q, reason: collision with root package name */
    public final int f1359q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1360r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1361s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1362t;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        this.f1346a = new C0175a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1347b = context;
        } else {
            this.f1347b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0084a.d, R.attr.actionModeStyle, 0);
        setBackground((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : l.F(context, resourceId));
        this.f1359q = obtainStyledAttributes.getResourceId(5, 0);
        this.f1360r = obtainStyledAttributes.getResourceId(4, 0);
        this.f1349e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f1362t = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
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
        View view = this.f1353k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f1362t, (ViewGroup) this, false);
            this.f1353k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f1353k);
        }
        View findViewById = this.f1353k.findViewById(R.id.action_mode_close_button);
        this.f1354l = findViewById;
        findViewById.setOnClickListener(new j(2, abstractC0144a));
        m c2 = abstractC0144a.c();
        C0195k c0195k = this.d;
        if (c0195k != null) {
            c0195k.f();
            C0187g c0187g = c0195k.f3029t;
            if (c0187g != null && c0187g.b()) {
                c0187g.i.dismiss();
            }
        }
        C0195k c0195k2 = new C0195k(getContext());
        this.d = c0195k2;
        c0195k2.f3021l = true;
        c0195k2.f3022m = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c2.b(this.d, this.f1347b);
        C0195k c0195k3 = this.d;
        InterfaceC0158A interfaceC0158A = c0195k3.h;
        if (interfaceC0158A == null) {
            InterfaceC0158A interfaceC0158A2 = (InterfaceC0158A) c0195k3.d.inflate(c0195k3.f3017f, (ViewGroup) this, false);
            c0195k3.h = interfaceC0158A2;
            interfaceC0158A2.c(c0195k3.f3015c);
            c0195k3.c();
        }
        InterfaceC0158A interfaceC0158A3 = c0195k3.h;
        if (interfaceC0158A != interfaceC0158A3) {
            ((ActionMenuView) interfaceC0158A3).setPresenter(c0195k3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC0158A3;
        this.f1348c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f1348c, layoutParams);
    }

    public final void d() {
        if (this.f1356n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1356n = linearLayout;
            this.f1357o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f1358p = (TextView) this.f1356n.findViewById(R.id.action_bar_subtitle);
            int i = this.f1359q;
            if (i != 0) {
                this.f1357o.setTextAppearance(getContext(), i);
            }
            int i2 = this.f1360r;
            if (i2 != 0) {
                this.f1358p.setTextAppearance(getContext(), i2);
            }
        }
        this.f1357o.setText(this.i);
        this.f1358p.setText(this.f1352j);
        boolean isEmpty = TextUtils.isEmpty(this.i);
        boolean isEmpty2 = TextUtils.isEmpty(this.f1352j);
        this.f1358p.setVisibility(!isEmpty2 ? 0 : 8);
        this.f1356n.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f1356n.getParent() == null) {
            addView(this.f1356n);
        }
    }

    public final void e() {
        removeAllViews();
        this.f1355m = null;
        this.f1348c = null;
        this.d = null;
        View view = this.f1354l;
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
        return this.f1350f != null ? this.f1346a.f2960b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1349e;
    }

    public CharSequence getSubtitle() {
        return this.f1352j;
    }

    public CharSequence getTitle() {
        return this.i;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            Y y2 = this.f1350f;
            if (y2 != null) {
                y2.b();
            }
            super.setVisibility(i);
        }
    }

    public final Y i(int i, long j2) {
        Y y2 = this.f1350f;
        if (y2 != null) {
            y2.b();
        }
        C0175a c0175a = this.f1346a;
        if (i != 0) {
            Y a2 = Q.a(this);
            a2.a(0.0f);
            a2.c(j2);
            c0175a.f2961c.f1350f = a2;
            c0175a.f2960b = i;
            a2.d(c0175a);
            return a2;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        Y a3 = Q.a(this);
        a3.a(1.0f);
        a3.c(j2);
        c0175a.f2961c.f1350f = a3;
        c0175a.f2960b = i;
        a3.d(c0175a);
        return a3;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0084a.f2127a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C0195k c0195k = this.d;
        if (c0195k != null) {
            Configuration configuration2 = c0195k.f3014b.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            c0195k.f3025p = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            m mVar = c0195k.f3015c;
            if (mVar != null) {
                mVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0195k c0195k = this.d;
        if (c0195k != null) {
            c0195k.f();
            C0187g c0187g = this.d.f3029t;
            if (c0187g == null || !c0187g.b()) {
                return;
            }
            c0187g.i.dismiss();
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
        boolean z3 = j1.f3010a;
        boolean z4 = getLayoutDirection() == 1;
        int paddingRight = z4 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1353k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1353k.getLayoutParams();
            int i5 = z4 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z4 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z4 ? paddingRight - i5 : paddingRight + i5;
            int g2 = g(this.f1353k, i7, paddingTop, paddingTop2, z4) + i7;
            paddingRight = z4 ? g2 - i6 : g2 + i6;
        }
        LinearLayout linearLayout = this.f1356n;
        if (linearLayout != null && this.f1355m == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.f1356n, paddingRight, paddingTop, paddingTop2, z4);
        }
        View view2 = this.f1355m;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, z4);
        }
        int paddingLeft = z4 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1348c;
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
        int i3 = this.f1349e;
        if (i3 <= 0) {
            i3 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i4 = i3 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        View view = this.f1353k;
        if (view != null) {
            int f2 = f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1353k.getLayoutParams();
            paddingLeft = f2 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1348c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f1348c, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f1356n;
        if (linearLayout != null && this.f1355m == null) {
            if (this.f1361s) {
                this.f1356n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f1356n.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f1356n.setVisibility(z2 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f1355m;
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
            this.f1355m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i4, i8));
        }
        if (this.f1349e > 0) {
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
            this.f1351g = false;
        }
        if (!this.f1351g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1351g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1351g = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f1349e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1355m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1355m = view;
        if (view != null && (linearLayout = this.f1356n) != null) {
            removeView(linearLayout);
            this.f1356n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1352j = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        d();
        Q.m(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f1361s) {
            requestLayout();
        }
        this.f1361s = z2;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
