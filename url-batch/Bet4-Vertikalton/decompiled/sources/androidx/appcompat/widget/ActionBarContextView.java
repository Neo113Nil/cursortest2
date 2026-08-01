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
import com.playbag.tripgear.R;
import f.a;
import j.AbstractC0142a;
import k.InterfaceC0147A;
import k.MenuC0164m;
import l.C0196a;
import l.C0208g;
import l.C0216k;
import l.i1;
import w1.l;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final C0196a f1258a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f1259b;

    /* renamed from: c, reason: collision with root package name */
    public ActionMenuView f1260c;
    public C0216k d;

    /* renamed from: e, reason: collision with root package name */
    public int f1261e;

    /* renamed from: f, reason: collision with root package name */
    public C0005c0 f1262f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1263g;
    public boolean h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f1264j;

    /* renamed from: k, reason: collision with root package name */
    public View f1265k;

    /* renamed from: l, reason: collision with root package name */
    public View f1266l;

    /* renamed from: m, reason: collision with root package name */
    public View f1267m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f1268n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f1269o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f1270p;

    /* renamed from: q, reason: collision with root package name */
    public final int f1271q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1272r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1273s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1274t;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        this.f1258a = new C0196a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1259b = context;
        } else {
            this.f1259b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.d, R.attr.actionModeStyle, 0);
        setBackground((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : l.z(context, resourceId));
        this.f1271q = obtainStyledAttributes.getResourceId(5, 0);
        this.f1272r = obtainStyledAttributes.getResourceId(4, 0);
        this.f1261e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f1274t = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
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

    public final void c(AbstractC0142a abstractC0142a) {
        View view = this.f1265k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f1274t, (ViewGroup) this, false);
            this.f1265k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f1265k);
        }
        View findViewById = this.f1265k.findViewById(R.id.action_mode_close_button);
        this.f1266l = findViewById;
        findViewById.setOnClickListener(new j(2, abstractC0142a));
        MenuC0164m c2 = abstractC0142a.c();
        C0216k c0216k = this.d;
        if (c0216k != null) {
            c0216k.f();
            C0208g c0208g = c0216k.f2948t;
            if (c0208g != null && c0208g.b()) {
                c0208g.i.dismiss();
            }
        }
        C0216k c0216k2 = new C0216k(getContext());
        this.d = c0216k2;
        c0216k2.f2940l = true;
        c0216k2.f2941m = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c2.b(this.d, this.f1259b);
        C0216k c0216k3 = this.d;
        InterfaceC0147A interfaceC0147A = c0216k3.h;
        if (interfaceC0147A == null) {
            InterfaceC0147A interfaceC0147A2 = (InterfaceC0147A) c0216k3.d.inflate(c0216k3.f2936f, (ViewGroup) this, false);
            c0216k3.h = interfaceC0147A2;
            interfaceC0147A2.c(c0216k3.f2934c);
            c0216k3.c();
        }
        InterfaceC0147A interfaceC0147A3 = c0216k3.h;
        if (interfaceC0147A != interfaceC0147A3) {
            ((ActionMenuView) interfaceC0147A3).setPresenter(c0216k3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC0147A3;
        this.f1260c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f1260c, layoutParams);
    }

    public final void d() {
        if (this.f1268n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1268n = linearLayout;
            this.f1269o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f1270p = (TextView) this.f1268n.findViewById(R.id.action_bar_subtitle);
            int i = this.f1271q;
            if (i != 0) {
                this.f1269o.setTextAppearance(getContext(), i);
            }
            int i2 = this.f1272r;
            if (i2 != 0) {
                this.f1270p.setTextAppearance(getContext(), i2);
            }
        }
        this.f1269o.setText(this.i);
        this.f1270p.setText(this.f1264j);
        boolean isEmpty = TextUtils.isEmpty(this.i);
        boolean isEmpty2 = TextUtils.isEmpty(this.f1264j);
        this.f1270p.setVisibility(!isEmpty2 ? 0 : 8);
        this.f1268n.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f1268n.getParent() == null) {
            addView(this.f1268n);
        }
    }

    public final void e() {
        removeAllViews();
        this.f1267m = null;
        this.f1260c = null;
        this.d = null;
        View view = this.f1266l;
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
        return this.f1262f != null ? this.f1258a.f2882b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1261e;
    }

    public CharSequence getSubtitle() {
        return this.f1264j;
    }

    public CharSequence getTitle() {
        return this.i;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            C0005c0 c0005c0 = this.f1262f;
            if (c0005c0 != null) {
                c0005c0.b();
            }
            super.setVisibility(i);
        }
    }

    public final C0005c0 i(int i, long j2) {
        C0005c0 c0005c0 = this.f1262f;
        if (c0005c0 != null) {
            c0005c0.b();
        }
        C0196a c0196a = this.f1258a;
        if (i != 0) {
            C0005c0 a2 = T.a(this);
            a2.a(RecyclerView.f1530C0);
            a2.c(j2);
            c0196a.f2883c.f1262f = a2;
            c0196a.f2882b = i;
            a2.d(c0196a);
            return a2;
        }
        if (getVisibility() != 0) {
            setAlpha(RecyclerView.f1530C0);
        }
        C0005c0 a3 = T.a(this);
        a3.a(1.0f);
        a3.c(j2);
        c0196a.f2883c.f1262f = a3;
        c0196a.f2882b = i;
        a3.d(c0196a);
        return a3;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, a.f2055a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C0216k c0216k = this.d;
        if (c0216k != null) {
            Configuration configuration2 = c0216k.f2933b.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            c0216k.f2944p = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            MenuC0164m menuC0164m = c0216k.f2934c;
            if (menuC0164m != null) {
                menuC0164m.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0216k c0216k = this.d;
        if (c0216k != null) {
            c0216k.f();
            C0208g c0208g = this.d.f2948t;
            if (c0208g == null || !c0208g.b()) {
                return;
            }
            c0208g.i.dismiss();
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
        boolean z3 = i1.f2929a;
        boolean z4 = getLayoutDirection() == 1;
        int paddingRight = z4 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1265k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1265k.getLayoutParams();
            int i5 = z4 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z4 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z4 ? paddingRight - i5 : paddingRight + i5;
            int g2 = g(this.f1265k, i7, paddingTop, paddingTop2, z4) + i7;
            paddingRight = z4 ? g2 - i6 : g2 + i6;
        }
        LinearLayout linearLayout = this.f1268n;
        if (linearLayout != null && this.f1267m == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.f1268n, paddingRight, paddingTop, paddingTop2, z4);
        }
        View view2 = this.f1267m;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, z4);
        }
        int paddingLeft = z4 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1260c;
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
        int i3 = this.f1261e;
        if (i3 <= 0) {
            i3 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i4 = i3 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        View view = this.f1265k;
        if (view != null) {
            int f2 = f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1265k.getLayoutParams();
            paddingLeft = f2 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1260c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f1260c, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f1268n;
        if (linearLayout != null && this.f1267m == null) {
            if (this.f1273s) {
                this.f1268n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f1268n.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f1268n.setVisibility(z2 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f1267m;
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
            this.f1267m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i4, i8));
        }
        if (this.f1261e > 0) {
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
            this.f1263g = false;
        }
        if (!this.f1263g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1263g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1263g = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f1261e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1267m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1267m = view;
        if (view != null && (linearLayout = this.f1268n) != null) {
            removeView(linearLayout);
            this.f1268n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1264j = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        d();
        T.m(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f1273s) {
            requestLayout();
        }
        this.f1273s = z2;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
