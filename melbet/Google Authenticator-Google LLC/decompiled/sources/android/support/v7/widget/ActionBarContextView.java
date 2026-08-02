package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;
import defpackage.byo;
import defpackage.cx;
import defpackage.em;
import defpackage.fg;
import defpackage.gd;
import defpackage.gr;
import defpackage.gz;
import defpackage.hk;
import defpackage.kt;
import defpackage.yq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ActionBarContextView extends gz {
    public CharSequence g;
    public CharSequence h;
    public View i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    private View n;
    private View o;
    private LinearLayout p;
    private TextView q;
    private TextView r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        byo u = byo.u(context, attributeSet, em.d, i, 0);
        setBackground(u.j(0));
        this.s = u.h(5, 0);
        this.t = u.h(4, 0);
        this.e = u.g(3, 0);
        this.u = u.h(2, R.layout.abc_action_mode_close_item_material);
        u.n();
        this.v = getPaddingLeft();
        this.w = getPaddingTop();
        this.x = getPaddingRight();
        this.y = getPaddingBottom();
    }

    private final void p() {
        if (this.p == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.p = linearLayout;
            this.q = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.r = (TextView) this.p.findViewById(R.id.action_bar_subtitle);
            if (this.s != 0) {
                this.q.setTextAppearance(getContext(), this.s);
            }
            if (this.t != 0) {
                this.r.setTextAppearance(getContext(), this.t);
            }
        }
        this.q.setText(this.g);
        this.r.setText(this.h);
        boolean isEmpty = TextUtils.isEmpty(this.g);
        boolean isEmpty2 = TextUtils.isEmpty(this.h);
        this.r.setVisibility(true != isEmpty2 ? 0 : 8);
        this.p.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.p.getParent() == null) {
            addView(this.p);
        }
    }

    @Override // defpackage.gz
    public final void c(int i) {
        this.e = i;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final void h(fg fgVar) {
        View view = this.i;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.u, (ViewGroup) this, false);
            this.i = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.i);
        }
        View findViewById = this.i.findViewById(R.id.action_mode_close_button);
        this.n = findViewById;
        findViewById.setOnClickListener(new cx(fgVar, 2));
        Menu a = fgVar.a();
        hk hkVar = this.d;
        if (hkVar != null) {
            hkVar.p();
        }
        this.d = new hk(getContext());
        this.d.r();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        ((gd) a).h(this.d, this.b);
        hk hkVar2 = this.d;
        gr grVar = hkVar2.f;
        if (hkVar2.f == null) {
            hkVar2.f = (gr) hkVar2.d.inflate(R.layout.abc_action_menu_layout, (ViewGroup) this, false);
            hkVar2.f.a(hkVar2.c);
            hkVar2.j();
        }
        gr grVar2 = hkVar2.f;
        if (grVar != grVar2) {
            ((ActionMenuView) grVar2).k(hkVar2);
        }
        this.c = (ActionMenuView) grVar2;
        this.c.setBackground(null);
        addView(this.c, layoutParams);
    }

    public final void i() {
        removeAllViews();
        this.o = null;
        this.c = null;
        this.d = null;
        View view = this.n;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public final void j(View view) {
        LinearLayout linearLayout;
        View view2 = this.o;
        if (view2 != null) {
            removeView(view2);
        }
        this.o = view;
        if (view != null && (linearLayout = this.p) != null) {
            removeView(linearLayout);
            this.p = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public final void k(CharSequence charSequence) {
        this.h = charSequence;
        p();
    }

    public final void l(CharSequence charSequence) {
        this.g = charSequence;
        p();
        yq.n(this, charSequence);
    }

    public final void m(boolean z) {
        if (z != this.j) {
            requestLayout();
        }
        this.j = z;
    }

    public final void n() {
        super.setPadding(this.k + this.v, this.l + this.w, this.m + this.x, this.y);
    }

    public final void o() {
        hk hkVar = this.d;
        if (hkVar != null) {
            hkVar.o();
        }
    }

    @Override // defpackage.gz, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, em.d, R.attr.actionModeStyle, 0);
        this.e = obtainStyledAttributes.getLayoutDimension(3, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hk hkVar = this.d;
        if (hkVar != null) {
            hkVar.l();
            this.d.s();
        }
    }

    @Override // defpackage.gz, android.view.View
    public final /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean v = kt.v(this);
        int paddingRight = v ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.i;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.i.getLayoutParams();
            int i5 = v ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = v ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int a = a(paddingRight, i5, v);
            paddingRight = a(a + f(this.i, a, paddingTop, paddingTop2, v), i6, v);
        }
        LinearLayout linearLayout = this.p;
        if (linearLayout != null && this.o == null && linearLayout.getVisibility() != 8) {
            paddingRight += f(this.p, paddingRight, paddingTop, paddingTop2, v);
        }
        View view2 = this.o;
        if (view2 != null) {
            f(view2, paddingRight, paddingTop, paddingTop2, v);
        }
        int paddingLeft = v ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null) {
            f(actionMenuView, paddingLeft, paddingTop, paddingTop2, !v);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i3 = this.e;
        int size2 = i3 > 0 ? i3 + this.l : View.MeasureSpec.getSize(i2);
        int i4 = size2 - paddingTop;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        View view = this.i;
        if (view != null) {
            int e = e(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.i.getLayoutParams();
            paddingLeft = e - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = e(this.c, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.p;
        if (linearLayout != null && this.o == null) {
            if (this.j) {
                this.p.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.p.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.p.setVisibility(true != z ? 8 : 0);
            } else {
                paddingLeft = e(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.o;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i5 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (layoutParams.width >= 0) {
                paddingLeft = Math.min(layoutParams.width, paddingLeft);
            }
            int i6 = layoutParams.height == -2 ? Integer.MIN_VALUE : 1073741824;
            if (layoutParams.height >= 0) {
                i4 = Math.min(layoutParams.height, i4);
            }
            this.o.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(i4, i6));
        }
        if (this.e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // defpackage.gz, android.view.View
    public final /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.v = i;
        this.w = i2;
        this.x = i3;
        this.y = i4;
        n();
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        if (getLayoutDirection() == 1) {
            i3 = i;
            i = i3;
        }
        this.v = i;
        this.x = i3;
        this.w = i2;
        this.y = i4;
        n();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }
}
