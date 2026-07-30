package androidx.appcompat.widget;

import I.T;
import I.Y;
import O6.g;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
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
import com.icefishing.icefish.ice.fishing.s294s.R;
import h.AbstractC0454a;
import i.ViewOnClickListenerC0516c;
import java.util.WeakHashMap;
import l.AbstractC0646b;
import m.InterfaceC0673B;
import m.m;
import n.C0698a;
import n.C0708f;
import n.C0716j;
import n.z1;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public boolean f3147A;

    /* renamed from: B, reason: collision with root package name */
    public final int f3148B;

    /* renamed from: d, reason: collision with root package name */
    public final C0698a f3149d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f3150e;

    /* renamed from: i, reason: collision with root package name */
    public ActionMenuView f3151i;

    /* renamed from: l, reason: collision with root package name */
    public C0716j f3152l;

    /* renamed from: m, reason: collision with root package name */
    public int f3153m;

    /* renamed from: n, reason: collision with root package name */
    public Y f3154n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3155o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3156p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f3157q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f3158r;

    /* renamed from: s, reason: collision with root package name */
    public View f3159s;

    /* renamed from: t, reason: collision with root package name */
    public View f3160t;

    /* renamed from: u, reason: collision with root package name */
    public View f3161u;

    /* renamed from: v, reason: collision with root package name */
    public LinearLayout f3162v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f3163w;

    /* renamed from: x, reason: collision with root package name */
    public TextView f3164x;

    /* renamed from: y, reason: collision with root package name */
    public final int f3165y;

    /* renamed from: z, reason: collision with root package name */
    public final int f3166z;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        this.f3149d = new C0698a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f3150e = context;
        } else {
            this.f3150e = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0454a.f5040d, R.attr.actionModeStyle, 0);
        Drawable drawable = (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : g.M(context, resourceId);
        WeakHashMap weakHashMap = T.f1153a;
        setBackground(drawable);
        this.f3165y = obtainStyledAttributes.getResourceId(5, 0);
        this.f3166z = obtainStyledAttributes.getResourceId(4, 0);
        this.f3153m = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f3148B = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int f(View view, int i2, int i5) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i5);
        return Math.max(0, i2 - view.getMeasuredWidth());
    }

    public static int g(View view, int i2, int i5, int i7, boolean z7) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i8 = ((i7 - measuredHeight) / 2) + i5;
        if (z7) {
            view.layout(i2 - measuredWidth, i8, i2, measuredHeight + i8);
        } else {
            view.layout(i2, i8, i2 + measuredWidth, measuredHeight + i8);
        }
        return z7 ? -measuredWidth : measuredWidth;
    }

    public final void c(AbstractC0646b abstractC0646b) {
        View view = this.f3159s;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f3148B, (ViewGroup) this, false);
            this.f3159s = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f3159s);
        }
        View findViewById = this.f3159s.findViewById(R.id.action_mode_close_button);
        this.f3160t = findViewById;
        findViewById.setOnClickListener(new ViewOnClickListenerC0516c(1, abstractC0646b));
        m c7 = abstractC0646b.c();
        C0716j c0716j = this.f3152l;
        if (c0716j != null) {
            c0716j.c();
            C0708f c0708f = c0716j.f6794B;
            if (c0708f != null && c0708f.b()) {
                c0708f.f6484i.dismiss();
            }
        }
        C0716j c0716j2 = new C0716j(getContext());
        this.f3152l = c0716j2;
        c0716j2.f6809t = true;
        c0716j2.f6810u = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c7.b(this.f3152l, this.f3150e);
        C0716j c0716j3 = this.f3152l;
        InterfaceC0673B interfaceC0673B = c0716j3.f6805p;
        if (interfaceC0673B == null) {
            InterfaceC0673B interfaceC0673B2 = (InterfaceC0673B) c0716j3.f6801l.inflate(c0716j3.f6803n, (ViewGroup) this, false);
            c0716j3.f6805p = interfaceC0673B2;
            interfaceC0673B2.a(c0716j3.f6800i);
            c0716j3.d();
        }
        InterfaceC0673B interfaceC0673B3 = c0716j3.f6805p;
        if (interfaceC0673B != interfaceC0673B3) {
            ((ActionMenuView) interfaceC0673B3).setPresenter(c0716j3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC0673B3;
        this.f3151i = actionMenuView;
        WeakHashMap weakHashMap = T.f1153a;
        actionMenuView.setBackground(null);
        addView(this.f3151i, layoutParams);
    }

    public final void d() {
        if (this.f3162v == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f3162v = linearLayout;
            this.f3163w = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f3164x = (TextView) this.f3162v.findViewById(R.id.action_bar_subtitle);
            int i2 = this.f3165y;
            if (i2 != 0) {
                this.f3163w.setTextAppearance(getContext(), i2);
            }
            int i5 = this.f3166z;
            if (i5 != 0) {
                this.f3164x.setTextAppearance(getContext(), i5);
            }
        }
        this.f3163w.setText(this.f3157q);
        this.f3164x.setText(this.f3158r);
        boolean isEmpty = TextUtils.isEmpty(this.f3157q);
        boolean isEmpty2 = TextUtils.isEmpty(this.f3158r);
        this.f3164x.setVisibility(!isEmpty2 ? 0 : 8);
        this.f3162v.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f3162v.getParent() == null) {
            addView(this.f3162v);
        }
    }

    public final void e() {
        removeAllViews();
        this.f3161u = null;
        this.f3151i = null;
        this.f3152l = null;
        View view = this.f3160t;
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
        return this.f3154n != null ? this.f3149d.f6738b : getVisibility();
    }

    public int getContentHeight() {
        return this.f3153m;
    }

    public CharSequence getSubtitle() {
        return this.f3158r;
    }

    public CharSequence getTitle() {
        return this.f3157q;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            Y y7 = this.f3154n;
            if (y7 != null) {
                y7.b();
            }
            super.setVisibility(i2);
        }
    }

    public final Y i(long j, int i2) {
        Y y7 = this.f3154n;
        if (y7 != null) {
            y7.b();
        }
        C0698a c0698a = this.f3149d;
        if (i2 != 0) {
            Y a7 = T.a(this);
            a7.a(0.0f);
            a7.c(j);
            c0698a.f6739c.f3154n = a7;
            c0698a.f6738b = i2;
            a7.d(c0698a);
            return a7;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        Y a8 = T.a(this);
        a8.a(1.0f);
        a8.c(j);
        c0698a.f6739c.f3154n = a8;
        c0698a.f6738b = i2;
        a8.d(c0698a);
        return a8;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0454a.f5037a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C0716j c0716j = this.f3152l;
        if (c0716j != null) {
            Configuration configuration2 = c0716j.f6799e.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i5 = configuration2.screenHeightDp;
            c0716j.f6813x = (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || (i2 > 960 && i5 > 720) || (i2 > 720 && i5 > 960)) ? 5 : (i2 >= 500 || (i2 > 640 && i5 > 480) || (i2 > 480 && i5 > 640)) ? 4 : i2 >= 360 ? 3 : 2;
            m mVar = c0716j.f6800i;
            if (mVar != null) {
                mVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0716j c0716j = this.f3152l;
        if (c0716j != null) {
            c0716j.c();
            C0708f c0708f = this.f3152l.f6794B;
            if (c0708f == null || !c0708f.b()) {
                return;
            }
            c0708f.f6484i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3156p = false;
        }
        if (!this.f3156p) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f3156p = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f3156p = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i2, int i5, int i7, int i8) {
        boolean a7 = z1.a(this);
        int paddingRight = a7 ? (i7 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i8 - i5) - getPaddingTop()) - getPaddingBottom();
        View view = this.f3159s;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f3159s.getLayoutParams();
            int i9 = a7 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i10 = a7 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i11 = a7 ? paddingRight - i9 : paddingRight + i9;
            int g7 = g(this.f3159s, i11, paddingTop, paddingTop2, a7) + i11;
            paddingRight = a7 ? g7 - i10 : g7 + i10;
        }
        LinearLayout linearLayout = this.f3162v;
        if (linearLayout != null && this.f3161u == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.f3162v, paddingRight, paddingTop, paddingTop2, a7);
        }
        View view2 = this.f3161u;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, a7);
        }
        int paddingLeft = a7 ? getPaddingLeft() : (i7 - i2) - getPaddingRight();
        ActionMenuView actionMenuView = this.f3151i;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !a7);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i5) {
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i5) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i2);
        int i7 = this.f3153m;
        if (i7 <= 0) {
            i7 = View.MeasureSpec.getSize(i5);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i8 = i7 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE);
        View view = this.f3159s;
        if (view != null) {
            int f7 = f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f3159s.getLayoutParams();
            paddingLeft = f7 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f3151i;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f3151i, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f3162v;
        if (linearLayout != null && this.f3161u == null) {
            if (this.f3147A) {
                this.f3162v.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f3162v.getMeasuredWidth();
                boolean z7 = measuredWidth <= paddingLeft;
                if (z7) {
                    paddingLeft -= measuredWidth;
                }
                this.f3162v.setVisibility(z7 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f3161u;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i9 = layoutParams.width;
            int i10 = i9 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i9 >= 0) {
                paddingLeft = Math.min(i9, paddingLeft);
            }
            int i11 = layoutParams.height;
            int i12 = i11 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i11 >= 0) {
                i8 = Math.min(i11, i8);
            }
            this.f3161u.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i10), View.MeasureSpec.makeMeasureSpec(i8, i12));
        }
        if (this.f3153m > 0) {
            setMeasuredDimension(size, i7);
            return;
        }
        int childCount = getChildCount();
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            int measuredHeight = getChildAt(i14).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i13) {
                i13 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i13);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3155o = false;
        }
        if (!this.f3155o) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f3155o = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f3155o = false;
        return true;
    }

    public void setContentHeight(int i2) {
        this.f3153m = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f3161u;
        if (view2 != null) {
            removeView(view2);
        }
        this.f3161u = view;
        if (view != null && (linearLayout = this.f3162v) != null) {
            removeView(linearLayout);
            this.f3162v = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f3158r = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f3157q = charSequence;
        d();
        T.j(this, charSequence);
    }

    public void setTitleOptional(boolean z7) {
        if (z7 != this.f3147A) {
            requestLayout();
        }
        this.f3147A = z7;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
