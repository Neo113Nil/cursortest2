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
import b4.d;
import com.gdmhkmf.belbet.R;
import com.google.android.material.datepicker.p;
import f.a;
import f2.b;
import k.a0;
import k.m;
import l.f;
import l.f3;
import l.j;
import n0.p0;
import n0.t0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: f, reason: collision with root package name */
    public final b f290f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f291g;
    public ActionMenuView h;
    public j i;

    /* renamed from: j, reason: collision with root package name */
    public int f292j;

    /* renamed from: k, reason: collision with root package name */
    public t0 f293k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f294l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f295m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f296n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f297o;

    /* renamed from: p, reason: collision with root package name */
    public View f298p;

    /* renamed from: q, reason: collision with root package name */
    public View f299q;

    /* renamed from: r, reason: collision with root package name */
    public View f300r;

    /* renamed from: s, reason: collision with root package name */
    public LinearLayout f301s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f302t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f303u;

    /* renamed from: v, reason: collision with root package name */
    public final int f304v;

    /* renamed from: w, reason: collision with root package name */
    public final int f305w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f306x;

    /* renamed from: y, reason: collision with root package name */
    public final int f307y;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        this.f290f = new b(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f291g = context;
        } else {
            this.f291g = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.d, R.attr.actionModeStyle, 0);
        setBackground((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : d.y(context, resourceId));
        this.f304v = obtainStyledAttributes.getResourceId(5, 0);
        this.f305w = obtainStyledAttributes.getResourceId(4, 0);
        this.f292j = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f307y = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int f(View view, int i, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i4);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int g(View view, int i, int i4, int i5, boolean z4) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i6 = ((i5 - measuredHeight) / 2) + i4;
        if (z4) {
            view.layout(i - measuredWidth, i6, i, measuredHeight + i6);
        } else {
            view.layout(i, i6, i + measuredWidth, measuredHeight + i6);
        }
        return z4 ? -measuredWidth : measuredWidth;
    }

    public final void c(j.a aVar) {
        View view = this.f298p;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f307y, (ViewGroup) this, false);
            this.f298p = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f298p);
        }
        View findViewById = this.f298p.findViewById(R.id.action_mode_close_button);
        this.f299q = findViewById;
        findViewById.setOnClickListener(new p(2, aVar));
        m c5 = aVar.c();
        j jVar = this.i;
        if (jVar != null) {
            jVar.e();
            f fVar = jVar.f2479y;
            if (fVar != null && fVar.b()) {
                fVar.f2273j.dismiss();
            }
        }
        j jVar2 = new j(getContext());
        this.i = jVar2;
        jVar2.f2471q = true;
        jVar2.f2472r = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c5.b(this.i, this.f291g);
        j jVar3 = this.i;
        a0 a0Var = jVar3.f2467m;
        if (a0Var == null) {
            a0 a0Var2 = (a0) jVar3.i.inflate(jVar3.f2465k, (ViewGroup) this, false);
            jVar3.f2467m = a0Var2;
            a0Var2.c(jVar3.h);
            jVar3.g();
        }
        a0 a0Var3 = jVar3.f2467m;
        if (a0Var != a0Var3) {
            ((ActionMenuView) a0Var3).setPresenter(jVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) a0Var3;
        this.h = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.h, layoutParams);
    }

    public final void d() {
        if (this.f301s == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f301s = linearLayout;
            this.f302t = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f303u = (TextView) this.f301s.findViewById(R.id.action_bar_subtitle);
            int i = this.f304v;
            if (i != 0) {
                this.f302t.setTextAppearance(getContext(), i);
            }
            int i4 = this.f305w;
            if (i4 != 0) {
                this.f303u.setTextAppearance(getContext(), i4);
            }
        }
        this.f302t.setText(this.f296n);
        this.f303u.setText(this.f297o);
        boolean isEmpty = TextUtils.isEmpty(this.f296n);
        boolean isEmpty2 = TextUtils.isEmpty(this.f297o);
        this.f303u.setVisibility(!isEmpty2 ? 0 : 8);
        this.f301s.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f301s.getParent() == null) {
            addView(this.f301s);
        }
    }

    public final void e() {
        removeAllViews();
        this.f300r = null;
        this.h = null;
        this.i = null;
        View view = this.f299q;
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
        return this.f293k != null ? this.f290f.f1437g : getVisibility();
    }

    public int getContentHeight() {
        return this.f292j;
    }

    public CharSequence getSubtitle() {
        return this.f297o;
    }

    public CharSequence getTitle() {
        return this.f296n;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            t0 t0Var = this.f293k;
            if (t0Var != null) {
                t0Var.b();
            }
            super.setVisibility(i);
        }
    }

    public final t0 i(int i, long j2) {
        t0 t0Var = this.f293k;
        if (t0Var != null) {
            t0Var.b();
        }
        b bVar = this.f290f;
        if (i != 0) {
            t0 a5 = p0.a(this);
            a5.a(0.0f);
            a5.c(j2);
            ((ActionBarContextView) bVar.h).f293k = a5;
            bVar.f1437g = i;
            a5.d(bVar);
            return a5;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        t0 a6 = p0.a(this);
        a6.a(1.0f);
        a6.c(j2);
        ((ActionBarContextView) bVar.h).f293k = a6;
        bVar.f1437g = i;
        a6.d(bVar);
        return a6;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, a.f1390a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        j jVar = this.i;
        if (jVar != null) {
            Configuration configuration2 = jVar.f2463g.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i4 = configuration2.screenHeightDp;
            jVar.f2475u = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i4 > 720) || (i > 720 && i4 > 960)) ? 5 : (i >= 500 || (i > 640 && i4 > 480) || (i > 480 && i4 > 640)) ? 4 : i >= 360 ? 3 : 2;
            m mVar = jVar.h;
            if (mVar != null) {
                mVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.i;
        if (jVar != null) {
            jVar.e();
            f fVar = this.i.f2479y;
            if (fVar == null || !fVar.b()) {
                return;
            }
            fVar.f2273j.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f295m = false;
        }
        if (!this.f295m) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f295m = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f295m = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i4, int i5, int i6) {
        boolean z5 = f3.f2448a;
        boolean z6 = getLayoutDirection() == 1;
        int paddingRight = z6 ? (i5 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i6 - i4) - getPaddingTop()) - getPaddingBottom();
        View view = this.f298p;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f298p.getLayoutParams();
            int i7 = z6 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i8 = z6 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i9 = z6 ? paddingRight - i7 : paddingRight + i7;
            int g3 = g(this.f298p, i9, paddingTop, paddingTop2, z6) + i9;
            paddingRight = z6 ? g3 - i8 : g3 + i8;
        }
        LinearLayout linearLayout = this.f301s;
        if (linearLayout != null && this.f300r == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.f301s, paddingRight, paddingTop, paddingTop2, z6);
        }
        View view2 = this.f300r;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, z6);
        }
        int paddingLeft = z6 ? getPaddingLeft() : (i5 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.h;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z6);
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
        int i5 = this.f292j;
        if (i5 <= 0) {
            i5 = View.MeasureSpec.getSize(i4);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i6 = i5 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        View view = this.f298p;
        if (view != null) {
            int f5 = f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f298p.getLayoutParams();
            paddingLeft = f5 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.h;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.h, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f301s;
        if (linearLayout != null && this.f300r == null) {
            if (this.f306x) {
                this.f301s.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f301s.getMeasuredWidth();
                boolean z4 = measuredWidth <= paddingLeft;
                if (z4) {
                    paddingLeft -= measuredWidth;
                }
                this.f301s.setVisibility(z4 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f300r;
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
            this.f300r.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i8), View.MeasureSpec.makeMeasureSpec(i6, i10));
        }
        if (this.f292j > 0) {
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
            this.f294l = false;
        }
        if (!this.f294l) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f294l = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f294l = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.f292j = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f300r;
        if (view2 != null) {
            removeView(view2);
        }
        this.f300r = view;
        if (view != null && (linearLayout = this.f301s) != null) {
            removeView(linearLayout);
            this.f301s = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f297o = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f296n = charSequence;
        d();
        p0.n(this, charSequence);
    }

    public void setTitleOptional(boolean z4) {
        if (z4 != this.f306x) {
            requestLayout();
        }
        this.f306x = z4;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
