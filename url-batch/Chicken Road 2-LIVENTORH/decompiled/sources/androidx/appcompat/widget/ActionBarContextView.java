package androidx.appcompat.widget;

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
import com.oriondriftchasers.arordrft.R;
import k.a0;
import k.m;
import l.a;
import l.g;
import l.l;
import l.l3;
import n0.l0;
import n0.p0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: f, reason: collision with root package name */
    public final a f159f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f160g;

    /* renamed from: h, reason: collision with root package name */
    public ActionMenuView f161h;
    public l i;

    /* renamed from: j, reason: collision with root package name */
    public int f162j;

    /* renamed from: k, reason: collision with root package name */
    public p0 f163k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f164l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f165m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f166n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f167o;

    /* renamed from: p, reason: collision with root package name */
    public View f168p;

    /* renamed from: q, reason: collision with root package name */
    public View f169q;

    /* renamed from: r, reason: collision with root package name */
    public View f170r;

    /* renamed from: s, reason: collision with root package name */
    public LinearLayout f171s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f172t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f173u;

    /* renamed from: v, reason: collision with root package name */
    public final int f174v;

    /* renamed from: w, reason: collision with root package name */
    public final int f175w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f176x;

    /* renamed from: y, reason: collision with root package name */
    public final int f177y;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        this.f159f = new a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f160g = context;
        } else {
            this.f160g = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.d, R.attr.actionModeStyle, 0);
        setBackground((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : h.a.x(context, resourceId));
        this.f174v = obtainStyledAttributes.getResourceId(5, 0);
        this.f175w = obtainStyledAttributes.getResourceId(4, 0);
        this.f162j = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f177y = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int f(View view, int i, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i4);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int g(View view, int i, int i4, int i5, boolean z3) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i6 = ((i5 - measuredHeight) / 2) + i4;
        if (z3) {
            view.layout(i - measuredWidth, i6, i, measuredHeight + i6);
        } else {
            view.layout(i, i6, i + measuredWidth, measuredHeight + i6);
        }
        return z3 ? -measuredWidth : measuredWidth;
    }

    public final void c(j.a aVar) {
        View view = this.f168p;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f177y, (ViewGroup) this, false);
            this.f168p = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f168p);
        }
        View findViewById = this.f168p.findViewById(R.id.action_mode_close_button);
        this.f169q = findViewById;
        findViewById.setOnClickListener(new com.google.android.material.datepicker.l(3, aVar));
        m c4 = aVar.c();
        l lVar = this.i;
        if (lVar != null) {
            lVar.f();
            g gVar = lVar.f2378z;
            if (gVar != null && gVar.b()) {
                gVar.i.dismiss();
            }
        }
        l lVar2 = new l(getContext());
        this.i = lVar2;
        lVar2.f2370r = true;
        lVar2.f2371s = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c4.b(this.i, this.f160g);
        l lVar3 = this.i;
        a0 a0Var = lVar3.f2365m;
        if (a0Var == null) {
            a0 a0Var2 = (a0) lVar3.i.inflate(lVar3.f2363k, (ViewGroup) this, false);
            lVar3.f2365m = a0Var2;
            a0Var2.c(lVar3.f2361h);
            lVar3.m(true);
        }
        a0 a0Var3 = lVar3.f2365m;
        if (a0Var != a0Var3) {
            ((ActionMenuView) a0Var3).setPresenter(lVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) a0Var3;
        this.f161h = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f161h, layoutParams);
    }

    public final void d() {
        if (this.f171s == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f171s = linearLayout;
            this.f172t = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f173u = (TextView) this.f171s.findViewById(R.id.action_bar_subtitle);
            int i = this.f174v;
            if (i != 0) {
                this.f172t.setTextAppearance(getContext(), i);
            }
            int i4 = this.f175w;
            if (i4 != 0) {
                this.f173u.setTextAppearance(getContext(), i4);
            }
        }
        this.f172t.setText(this.f166n);
        this.f173u.setText(this.f167o);
        boolean isEmpty = TextUtils.isEmpty(this.f166n);
        boolean isEmpty2 = TextUtils.isEmpty(this.f167o);
        this.f173u.setVisibility(!isEmpty2 ? 0 : 8);
        this.f171s.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f171s.getParent() == null) {
            addView(this.f171s);
        }
    }

    public final void e() {
        removeAllViews();
        this.f170r = null;
        this.f161h = null;
        this.i = null;
        View view = this.f169q;
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
        return this.f163k != null ? this.f159f.f2241b : getVisibility();
    }

    public int getContentHeight() {
        return this.f162j;
    }

    public CharSequence getSubtitle() {
        return this.f167o;
    }

    public CharSequence getTitle() {
        return this.f166n;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            p0 p0Var = this.f163k;
            if (p0Var != null) {
                p0Var.b();
            }
            super.setVisibility(i);
        }
    }

    public final p0 i(int i, long j4) {
        p0 p0Var = this.f163k;
        if (p0Var != null) {
            p0Var.b();
        }
        a aVar = this.f159f;
        if (i != 0) {
            p0 a2 = l0.a(this);
            a2.a(0.0f);
            a2.c(j4);
            aVar.f2242c.f163k = a2;
            aVar.f2241b = i;
            a2.d(aVar);
            return a2;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        p0 a4 = l0.a(this);
        a4.a(1.0f);
        a4.c(j4);
        aVar.f2242c.f163k = a4;
        aVar.f2241b = i;
        a4.d(aVar);
        return a4;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, f.a.f1240a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        l lVar = this.i;
        if (lVar != null) {
            Configuration configuration2 = lVar.f2360g.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i4 = configuration2.screenHeightDp;
            lVar.f2374v = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i4 > 720) || (i > 720 && i4 > 960)) ? 5 : (i >= 500 || (i > 640 && i4 > 480) || (i > 480 && i4 > 640)) ? 4 : i >= 360 ? 3 : 2;
            m mVar = lVar.f2361h;
            if (mVar != null) {
                mVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l lVar = this.i;
        if (lVar != null) {
            lVar.f();
            g gVar = this.i.f2378z;
            if (gVar == null || !gVar.b()) {
                return;
            }
            gVar.i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f165m = false;
        }
        if (!this.f165m) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f165m = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f165m = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        boolean z4 = l3.f2381a;
        boolean z5 = getLayoutDirection() == 1;
        int paddingRight = z5 ? (i5 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i6 - i4) - getPaddingTop()) - getPaddingBottom();
        View view = this.f168p;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f168p.getLayoutParams();
            int i7 = z5 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i8 = z5 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i9 = z5 ? paddingRight - i7 : paddingRight + i7;
            int g4 = g(this.f168p, i9, paddingTop, paddingTop2, z5) + i9;
            paddingRight = z5 ? g4 - i8 : g4 + i8;
        }
        LinearLayout linearLayout = this.f171s;
        if (linearLayout != null && this.f170r == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.f171s, paddingRight, paddingTop, paddingTop2, z5);
        }
        View view2 = this.f170r;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, z5);
        }
        int paddingLeft = z5 ? getPaddingLeft() : (i5 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f161h;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z5);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i4) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int i5 = this.f162j;
        if (i5 <= 0) {
            i5 = View.MeasureSpec.getSize(i4);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i6 = i5 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        View view = this.f168p;
        if (view != null) {
            int f2 = f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f168p.getLayoutParams();
            paddingLeft = f2 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f161h;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f161h, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f171s;
        if (linearLayout != null && this.f170r == null) {
            if (this.f176x) {
                this.f171s.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f171s.getMeasuredWidth();
                boolean z3 = measuredWidth <= paddingLeft;
                if (z3) {
                    paddingLeft -= measuredWidth;
                }
                this.f171s.setVisibility(z3 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f170r;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i7 = layoutParams.width;
            int i8 = i7 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i7 >= 0) {
                paddingLeft = Math.min(i7, paddingLeft);
            }
            int i9 = layoutParams.height;
            int i10 = i9 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i9 >= 0) {
                i6 = Math.min(i9, i6);
            }
            this.f170r.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i8), View.MeasureSpec.makeMeasureSpec(i6, i10));
        }
        if (this.f162j > 0) {
            setMeasuredDimension(size, i5);
            return;
        }
        int childCount = getChildCount();
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            int measuredHeight = getChildAt(i12).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i11) {
                i11 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f164l = false;
        }
        if (!this.f164l) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f164l = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f164l = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.f162j = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f170r;
        if (view2 != null) {
            removeView(view2);
        }
        this.f170r = view;
        if (view != null && (linearLayout = this.f171s) != null) {
            removeView(linearLayout);
            this.f171s = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f167o = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f166n = charSequence;
        d();
        l0.n(this, charSequence);
    }

    public void setTitleOptional(boolean z3) {
        if (z3 != this.f176x) {
            requestLayout();
        }
        this.f176x = z3;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
