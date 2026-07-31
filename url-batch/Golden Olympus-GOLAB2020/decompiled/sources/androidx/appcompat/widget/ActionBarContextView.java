package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.AbstractC1281a0;
import androidx.core.view.C1301k0;
import e.AbstractC2405a;

/* loaded from: classes.dex */
public class ActionBarContextView extends AbstractC1252a {

    /* renamed from: i, reason: collision with root package name */
    private CharSequence f10475i;

    /* renamed from: j, reason: collision with root package name */
    private CharSequence f10476j;

    /* renamed from: k, reason: collision with root package name */
    private View f10477k;

    /* renamed from: l, reason: collision with root package name */
    private View f10478l;

    /* renamed from: m, reason: collision with root package name */
    private View f10479m;

    /* renamed from: n, reason: collision with root package name */
    private LinearLayout f10480n;

    /* renamed from: o, reason: collision with root package name */
    private TextView f10481o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f10482p;

    /* renamed from: q, reason: collision with root package name */
    private int f10483q;

    /* renamed from: r, reason: collision with root package name */
    private int f10484r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f10485s;

    /* renamed from: t, reason: collision with root package name */
    private int f10486t;

    class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.view.b f10487a;

        a(androidx.appcompat.view.b bVar) {
            this.f10487a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f10487a.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    private void i() {
        if (this.f10480n == null) {
            LayoutInflater.from(getContext()).inflate(e.g.f36322a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f10480n = linearLayout;
            this.f10481o = (TextView) linearLayout.findViewById(e.f.f36300e);
            this.f10482p = (TextView) this.f10480n.findViewById(e.f.f36299d);
            if (this.f10483q != 0) {
                this.f10481o.setTextAppearance(getContext(), this.f10483q);
            }
            if (this.f10484r != 0) {
                this.f10482p.setTextAppearance(getContext(), this.f10484r);
            }
        }
        this.f10481o.setText(this.f10475i);
        this.f10482p.setText(this.f10476j);
        boolean isEmpty = TextUtils.isEmpty(this.f10475i);
        boolean isEmpty2 = TextUtils.isEmpty(this.f10476j);
        this.f10482p.setVisibility(!isEmpty2 ? 0 : 8);
        this.f10480n.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f10480n.getParent() == null) {
            addView(this.f10480n);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC1252a
    public /* bridge */ /* synthetic */ C1301k0 f(int i4, long j4) {
        return super.f(i4, j4);
    }

    public void g() {
        if (this.f10477k == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbstractC1252a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC1252a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f10476j;
    }

    public CharSequence getTitle() {
        return this.f10475i;
    }

    public void h(androidx.appcompat.view.b bVar) {
        View view = this.f10477k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f10486t, (ViewGroup) this, false);
            this.f10477k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f10477k);
        }
        View findViewById = this.f10477k.findViewById(e.f.f36304i);
        this.f10478l = findViewById;
        findViewById.setOnClickListener(new a(bVar));
        androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) bVar.e();
        ActionMenuPresenter actionMenuPresenter = this.f10864d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.y();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f10864d = actionMenuPresenter2;
        actionMenuPresenter2.J(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.addMenuPresenter(this.f10864d, this.f10862b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f10864d.o(this);
        this.f10863c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f10863c, layoutParams);
    }

    public boolean j() {
        return this.f10485s;
    }

    public void k() {
        removeAllViews();
        this.f10479m = null;
        this.f10863c = null;
        this.f10864d = null;
        View view = this.f10478l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        ActionMenuPresenter actionMenuPresenter = this.f10864d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.K();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f10864d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.B();
            this.f10864d.C();
        }
    }

    @Override // androidx.appcompat.widget.AbstractC1252a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        boolean b4 = k0.b(this);
        int paddingRight = b4 ? (i6 - i4) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i7 - i5) - getPaddingTop()) - getPaddingBottom();
        View view = this.f10477k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f10477k.getLayoutParams();
            int i8 = b4 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i9 = b4 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d4 = AbstractC1252a.d(paddingRight, i8, b4);
            paddingRight = AbstractC1252a.d(d4 + e(this.f10477k, d4, paddingTop, paddingTop2, b4), i9, b4);
        }
        int i10 = paddingRight;
        LinearLayout linearLayout = this.f10480n;
        if (linearLayout != null && this.f10479m == null && linearLayout.getVisibility() != 8) {
            i10 += e(this.f10480n, i10, paddingTop, paddingTop2, b4);
        }
        View view2 = this.f10479m;
        if (view2 != null) {
            e(view2, i10, paddingTop, paddingTop2, b4);
        }
        int paddingLeft = b4 ? getPaddingLeft() : (i6 - i4) - getPaddingRight();
        ActionMenuView actionMenuView = this.f10863c;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b4);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        if (View.MeasureSpec.getMode(i4) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i5) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i4);
        int i6 = this.f10865e;
        if (i6 <= 0) {
            i6 = View.MeasureSpec.getSize(i5);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i7 = i6 - paddingTop;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
        View view = this.f10477k;
        if (view != null) {
            int c4 = c(view, paddingLeft, makeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f10477k.getLayoutParams();
            paddingLeft = c4 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f10863c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f10863c, paddingLeft, makeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f10480n;
        if (linearLayout != null && this.f10479m == null) {
            if (this.f10485s) {
                this.f10480n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f10480n.getMeasuredWidth();
                boolean z4 = measuredWidth <= paddingLeft;
                if (z4) {
                    paddingLeft -= measuredWidth;
                }
                this.f10480n.setVisibility(z4 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
            }
        }
        View view2 = this.f10479m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i8 = layoutParams.width;
            int i9 = i8 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i8 >= 0) {
                paddingLeft = Math.min(i8, paddingLeft);
            }
            int i10 = layoutParams.height;
            int i11 = i10 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i10 >= 0) {
                i7 = Math.min(i10, i7);
            }
            this.f10479m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i9), View.MeasureSpec.makeMeasureSpec(i7, i11));
        }
        if (this.f10865e > 0) {
            setMeasuredDimension(size, i6);
            return;
        }
        int childCount = getChildCount();
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            int measuredHeight = getChildAt(i13).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i12) {
                i12 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i12);
    }

    @Override // androidx.appcompat.widget.AbstractC1252a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbstractC1252a
    public void setContentHeight(int i4) {
        this.f10865e = i4;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f10479m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f10479m = view;
        if (view != null && (linearLayout = this.f10480n) != null) {
            removeView(linearLayout);
            this.f10480n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f10476j = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f10475i = charSequence;
        i();
        AbstractC1281a0.r0(this, charSequence);
    }

    public void setTitleOptional(boolean z4) {
        if (z4 != this.f10485s) {
            requestLayout();
        }
        this.f10485s = z4;
    }

    @Override // androidx.appcompat.widget.AbstractC1252a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i4) {
        super.setVisibility(i4);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2405a.f36193g);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Z v4 = Z.v(context, attributeSet, e.j.f36590y, i4, 0);
        setBackground(v4.g(e.j.f36595z));
        this.f10483q = v4.n(e.j.f36375D, 0);
        this.f10484r = v4.n(e.j.f36370C, 0);
        this.f10865e = v4.m(e.j.f36365B, 0);
        this.f10486t = v4.n(e.j.f36360A, e.g.f36325d);
        v4.x();
    }
}
