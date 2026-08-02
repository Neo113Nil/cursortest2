package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.focus.FocusRingDrawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class fmt extends Toolbar {
    public final TextView A;
    public final int B;
    public final ColorStateList C;
    public final fmy D;
    public View E;
    public int F;
    public fob G;
    public int H;
    public int I;
    private final FrameLayout J;
    private boolean K;
    private final boolean L;
    private final boolean M;
    private final Drawable N;
    private final boolean O;
    private final boolean P;
    private Integer Q;
    private Drawable R;
    private boolean S;
    private boolean T;
    private int U;
    private final boolean V;
    private final int W;
    private ActionMenuView aa;
    private ImageButton ab;
    private final kee ac;
    public final TextView z;

    public fmt(Context context, AttributeSet attributeSet, int i) {
        super(frj.a(context, attributeSet, i, R.style.Widget_Material3_SearchBar), attributeSet, i);
        boolean z;
        this.F = -1;
        this.ac = new kee(this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "title") != null) {
                throw new UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "subtitle") != null) {
                throw new UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
            }
        }
        this.W = getResources().getDimensionPixelSize(R.dimen.m3_searchbar_parent_width_breakpoint);
        Drawable f = e.f(context2, C());
        this.N = f;
        this.D = new fmy();
        TypedArray a = fjw.a(context2, attributeSet, fmr.a, i, R.style.Widget_Material3_SearchBar, new int[0]);
        fog fogVar = new fog(fog.k(context2, attributeSet, i, R.style.Widget_Material3_SearchBar));
        int color = a.getColor(5, 0);
        this.B = color;
        this.C = fny.e(context2, a, 13);
        float dimension = a.getDimension(8, 0.0f);
        this.M = a.getBoolean(6, true);
        this.S = a.getBoolean(7, true);
        boolean z2 = a.getBoolean(11, false);
        this.P = a.getBoolean(10, false);
        this.O = a.getBoolean(19, true);
        if (a.hasValue(14)) {
            this.Q = Integer.valueOf(a.getColor(14, -1));
        }
        int resourceId = a.getResourceId(0, -1);
        CharSequence string = a.getString(2);
        String string2 = a.getString(3);
        float dimension2 = a.getDimension(17, -1.0f);
        int color2 = a.getColor(16, 0);
        this.T = a.getBoolean(18, false);
        this.K = a.getBoolean(12, false);
        this.U = a.getDimensionPixelSize(1, -1);
        this.V = a.getBoolean(4, false);
        this.H = a.getResourceId(15, -1);
        this.I = a.getResourceId(9, -1);
        a.recycle();
        if (z2) {
            z = true;
        } else {
            q(e() != null ? e() : f);
            z = true;
            K(true);
        }
        setClickable(z);
        setFocusable(z);
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_bar, this);
        this.L = z;
        TextView textView = (TextView) findViewById(R.id.open_search_bar_text_view);
        this.z = textView;
        TextView textView2 = (TextView) findViewById(R.id.open_search_bar_placeholder_text_view);
        this.A = textView2;
        this.J = (FrameLayout) findViewById(R.id.open_search_bar_text_view_container);
        setElevation(dimension);
        if (resourceId != -1) {
            textView.setTextAppearance(resourceId);
            textView2.setTextAppearance(resourceId);
        }
        I(string);
        textView.setHint(string2);
        boolean z3 = this.T;
        if (textView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
            if (z3) {
                layoutParams.gravity = 1;
                textView.setGravity(1);
            } else {
                layoutParams.gravity = 0;
                textView.setGravity(0);
            }
            textView.setLayoutParams(layoutParams);
            textView2.setLayoutParams(layoutParams);
        }
        fob fobVar = new fob(fogVar);
        this.G = fobVar;
        fobVar.J(getContext());
        this.G.L(dimension);
        if (dimension2 >= 0.0f) {
            this.G.R(dimension2, color2);
        }
        int c = fhq.c(this, R.attr.colorControlHighlight);
        this.G.M(ColorStateList.valueOf(color));
        ColorStateList valueOf = ColorStateList.valueOf(c);
        fob fobVar2 = this.G;
        RippleDrawable rippleDrawable = new RippleDrawable(valueOf, fobVar2, fobVar2);
        FocusRingDrawable.a(getContext(), rippleDrawable, this.G);
        setBackground(rippleDrawable);
    }

    private final void J() {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        boolean z = getLayoutDirection() == 1;
        ImageButton b = fjx.b(this);
        int width = (b == null || !b.isClickable()) ? 0 : z ? getWidth() - b.getLeft() : b.getRight();
        ActionMenuView a = fjx.a(this);
        int right = a != null ? z ? a.getRight() : getWidth() - a.getLeft() : 0;
        int i = true != z ? width : right;
        if (true != z) {
            width = right;
        }
        setHandwritingBoundsOffsets(-i, 0.0f, -width, 0.0f);
    }

    private final void K(boolean z) {
        ImageButton b = fjx.b(this);
        if (b == null) {
            return;
        }
        boolean z2 = !z;
        b.setClickable(z2);
        b.setFocusable(z2);
        Drawable background = b.getBackground();
        if (background != null) {
            this.R = background;
        }
        b.setBackgroundDrawable(z ? null : this.R);
        J();
    }

    private static final int L(int i, int i2) {
        return i == 0 ? i2 : i;
    }

    protected int B() {
        return R.dimen.m3_searchbar_margin_vertical;
    }

    protected int C() {
        return R.drawable.ic_search_black_24;
    }

    public final float D() {
        return this.G.w();
    }

    final AppBarLayout E() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof AppBarLayout) {
                return (AppBarLayout) parent;
            }
        }
        return null;
    }

    public final CharSequence F() {
        return this.z.getHint();
    }

    public final CharSequence G() {
        return this.z.getText();
    }

    final void H(String str) {
        this.A.setText(str);
    }

    public final void I(CharSequence charSequence) {
        this.z.setText(charSequence);
        this.A.setText(charSequence);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.L && this.E == null && !(view instanceof ActionMenuView)) {
            this.E = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.support.v7.widget.Toolbar
    public final void m(int i) {
        super.m(i);
        this.F = i;
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        AppBarLayout E;
        super.onAttachedToWindow();
        fhq.y(this, this.G);
        if (this.M && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(B());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = L(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = L(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = L(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = L(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
        if (getLayoutParams() instanceof ffb) {
            ffb ffbVar = (ffb) getLayoutParams();
            if (this.S) {
                if (ffbVar.a == 0) {
                    ffbVar.a = 53;
                }
            } else if (ffbVar.a == 53) {
                ffbVar.a = 0;
            }
        }
        if (!this.K || (E = E()) == null || this.C == null) {
            return;
        }
        E.g.add(this.ac);
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AppBarLayout E = E();
        if (E != null) {
            E.g.remove(this.ac);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence G = G();
        boolean isEmpty = TextUtils.isEmpty(G);
        accessibilityNodeInfo.setHintText(F());
        accessibilityNodeInfo.setShowingHintText(isEmpty);
        if (isEmpty) {
            G = F();
        }
        accessibilityNodeInfo.setText(G);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.widget.ImageButton] */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.widget.ImageButton] */
    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.E;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
            int i5 = measuredWidth + measuredWidth2;
            int measuredHeight = view.getMeasuredHeight();
            int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
            int i6 = measuredHeight + measuredHeight2;
            if (getLayoutDirection() == 1) {
                view.layout(getMeasuredWidth() - i5, measuredHeight2, getMeasuredWidth() - measuredWidth2, i6);
            } else {
                view.layout(measuredWidth2, measuredHeight2, i5, i6);
            }
        }
        J();
        TextView textView = this.z;
        if (textView == null || !this.T) {
            return;
        }
        int measuredWidth3 = getMeasuredWidth() / 2;
        FrameLayout frameLayout = this.J;
        int measuredWidth4 = measuredWidth3 - (frameLayout.getMeasuredWidth() / 2);
        int measuredWidth5 = frameLayout.getMeasuredWidth() + measuredWidth4;
        int measuredHeight3 = (getMeasuredHeight() / 2) - (frameLayout.getMeasuredHeight() / 2);
        int measuredHeight4 = frameLayout.getMeasuredHeight() + measuredHeight3;
        int layoutDirection = getLayoutDirection();
        ActionMenuView actionMenuView = this.aa;
        if (actionMenuView == null) {
            actionMenuView = fjx.a(this);
            this.aa = actionMenuView;
        }
        ?? r4 = this.ab;
        ActionMenuView actionMenuView2 = r4;
        if (r4 == 0) {
            ?? b = fjx.b(this);
            this.ab = b;
            actionMenuView2 = b;
        }
        int measuredWidth6 = (frameLayout.getMeasuredWidth() / 2) - (textView.getMeasuredWidth() / 2);
        int measuredWidth7 = textView.getMeasuredWidth() + measuredWidth6;
        int i7 = measuredWidth6 + measuredWidth4;
        int i8 = measuredWidth7 + measuredWidth4;
        ActionMenuView actionMenuView3 = layoutDirection == 1 ? actionMenuView : actionMenuView2;
        if (layoutDirection == 1) {
            actionMenuView = actionMenuView2;
        }
        int max = actionMenuView3 != null ? Math.max(actionMenuView3.getRight() - i7, 0) : 0;
        int i9 = i7 + max;
        int i10 = i8 + max;
        int max2 = actionMenuView != null ? Math.max(i10 - actionMenuView.getLeft(), 0) : 0;
        int i11 = i9 - max2;
        int i12 = i10 - max2;
        int paddingLeft = getPaddingLeft() - i11;
        lt ltVar = this.n;
        int max3 = Math.max(paddingLeft, (ltVar != null ? ltVar.a : 0) - i11);
        int measuredWidth8 = i12 - (getMeasuredWidth() - getPaddingRight());
        int measuredWidth9 = getMeasuredWidth();
        lt ltVar2 = this.n;
        int max4 = ((max - max2) + Math.max(max3, 0)) - Math.max(Math.max(measuredWidth8, i12 - (measuredWidth9 - (ltVar2 != null ? ltVar2.b : 0))), 0);
        frameLayout.layout(measuredWidth4 + max4, measuredHeight3, measuredWidth5 + max4, measuredHeight4);
    }

    @Override // android.support.v7.widget.Toolbar, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int i4 = this.U;
        if (i4 >= 0 && size > i4) {
            i = View.MeasureSpec.makeMeasureSpec(i4, mode);
        } else if (this.V && size > (i3 = this.W)) {
            i = View.MeasureSpec.makeMeasureSpec(Math.max(i3, Math.round(size * 0.5f)), mode);
        }
        super.onMeasure(i, i2);
        View view = this.E;
        if (view != null) {
            view.measure(i, i2);
        }
    }

    @Override // android.support.v7.widget.Toolbar, android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof fms)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        fms fmsVar = (fms) parcelable;
        super.onRestoreInstanceState(fmsVar.d);
        I(fmsVar.a);
    }

    @Override // android.support.v7.widget.Toolbar, android.view.View
    protected final Parcelable onSaveInstanceState() {
        fms fmsVar = new fms(super.onSaveInstanceState());
        CharSequence G = G();
        fmsVar.a = G == null ? null : G.toString();
        return fmsVar;
    }

    @Override // android.support.v7.widget.Toolbar
    public final void q(Drawable drawable) {
        int c;
        if (this.O && drawable != null) {
            Integer num = this.Q;
            if (num != null) {
                c = num.intValue();
            } else {
                c = fhq.c(this, drawable == this.N ? R.attr.colorOnSurfaceVariant : R.attr.colorOnSurface);
            }
            drawable = drawable.mutate();
            drawable.setTint(c);
        }
        super.q(drawable);
    }

    @Override // android.support.v7.widget.Toolbar
    public final void r(View.OnClickListener onClickListener) {
        if (this.P) {
            return;
        }
        super.r(onClickListener);
        K(false);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        fob fobVar = this.G;
        if (fobVar != null) {
            fobVar.L(f);
        }
    }

    @Override // android.support.v7.widget.Toolbar
    public final void t(CharSequence charSequence) {
    }

    @Override // android.support.v7.widget.Toolbar
    public final void u(CharSequence charSequence) {
    }

    public fmt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchBarStyle);
    }

    public fmt(Context context) {
        this(context, null);
    }
}
