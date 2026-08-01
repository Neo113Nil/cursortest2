package g2;

import a.y;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.BaselineLayout;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class f extends FrameLayout implements i {

    /* renamed from: o0, reason: collision with root package name */
    public static final int[] f1712o0 = {R.attr.state_checked};

    /* renamed from: p0, reason: collision with root package name */
    public static final l2.f f1713p0 = new l2.f(15);

    /* renamed from: q0, reason: collision with root package name */
    public static final e f1714q0 = new e(15);
    public final TextView A;
    public final TextView B;
    public final BaselineLayout C;
    public final TextView D;
    public final TextView E;
    public BaselineLayout F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public ColorStateList L;
    public boolean M;
    public k.o N;
    public ColorStateList O;
    public Drawable P;
    public Drawable Q;
    public ValueAnimator R;
    public l2.f S;
    public float T;
    public boolean U;
    public int V;
    public int W;

    /* renamed from: a0, reason: collision with root package name */
    public int f1715a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f1716b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f1717c0;
    public int d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f1718e0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1719f;

    /* renamed from: f0, reason: collision with root package name */
    public q1.a f1720f0;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f1721g;

    /* renamed from: g0, reason: collision with root package name */
    public int f1722g0;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f1723h;

    /* renamed from: h0, reason: collision with root package name */
    public int f1724h0;
    public int i;
    public int i0;

    /* renamed from: j, reason: collision with root package name */
    public int f1725j;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f1726j0;

    /* renamed from: k, reason: collision with root package name */
    public int f1727k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f1728k0;

    /* renamed from: l, reason: collision with root package name */
    public int f1729l;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f1730l0;

    /* renamed from: m, reason: collision with root package name */
    public float f1731m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f1732m0;

    /* renamed from: n, reason: collision with root package name */
    public float f1733n;

    /* renamed from: n0, reason: collision with root package name */
    public Rect f1734n0;

    /* renamed from: o, reason: collision with root package name */
    public float f1735o;

    /* renamed from: p, reason: collision with root package name */
    public float f1736p;

    /* renamed from: q, reason: collision with root package name */
    public float f1737q;

    /* renamed from: r, reason: collision with root package name */
    public float f1738r;

    /* renamed from: s, reason: collision with root package name */
    public int f1739s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1740t;

    /* renamed from: u, reason: collision with root package name */
    public final LinearLayout f1741u;

    /* renamed from: v, reason: collision with root package name */
    public final LinearLayout f1742v;

    /* renamed from: w, reason: collision with root package name */
    public final View f1743w;

    /* renamed from: x, reason: collision with root package name */
    public final FrameLayout f1744x;

    /* renamed from: y, reason: collision with root package name */
    public final ImageView f1745y;

    /* renamed from: z, reason: collision with root package name */
    public final BaselineLayout f1746z;

    public f(Context context) {
        super(context);
        this.f1719f = false;
        this.G = -1;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.M = false;
        this.S = f1713p0;
        this.T = 0.0f;
        this.U = false;
        this.V = 0;
        this.W = 0;
        this.f1715a0 = -2;
        this.f1716b0 = 0;
        this.f1717c0 = false;
        this.d0 = 0;
        this.f1718e0 = 0;
        this.f1724h0 = 0;
        this.i0 = 49;
        this.f1726j0 = false;
        this.f1728k0 = false;
        this.f1730l0 = false;
        this.f1732m0 = false;
        this.f1734n0 = new Rect();
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f1741u = (LinearLayout) findViewById(com.oriondriftchasers.arordrft.R.id.navigation_bar_item_content_container);
        LinearLayout linearLayout = (LinearLayout) findViewById(com.oriondriftchasers.arordrft.R.id.navigation_bar_item_inner_content_container);
        this.f1742v = linearLayout;
        this.f1743w = findViewById(com.oriondriftchasers.arordrft.R.id.navigation_bar_item_active_indicator_view);
        this.f1744x = (FrameLayout) findViewById(com.oriondriftchasers.arordrft.R.id.navigation_bar_item_icon_container);
        this.f1745y = (ImageView) findViewById(com.oriondriftchasers.arordrft.R.id.navigation_bar_item_icon_view);
        BaselineLayout baselineLayout = (BaselineLayout) findViewById(com.oriondriftchasers.arordrft.R.id.navigation_bar_item_labels_group);
        this.f1746z = baselineLayout;
        TextView textView = (TextView) findViewById(com.oriondriftchasers.arordrft.R.id.navigation_bar_item_small_label_view);
        this.A = textView;
        TextView textView2 = (TextView) findViewById(com.oriondriftchasers.arordrft.R.id.navigation_bar_item_large_label_view);
        this.B = textView2;
        float dimension = getResources().getDimension(com.oriondriftchasers.arordrft.R.dimen.default_navigation_text_size);
        float dimension2 = getResources().getDimension(com.oriondriftchasers.arordrft.R.dimen.default_navigation_active_text_size);
        BaselineLayout baselineLayout2 = new BaselineLayout(getContext(), null, 0);
        baselineLayout2.f977f = -1;
        this.C = baselineLayout2;
        baselineLayout2.setVisibility(8);
        this.C.setDuplicateParentStateEnabled(true);
        this.C.setMeasurePaddingFromBaseline(this.f1730l0);
        TextView textView3 = new TextView(getContext());
        this.D = textView3;
        textView3.setMaxLines(1);
        TextView textView4 = this.D;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView4.setEllipsize(truncateAt);
        this.D.setDuplicateParentStateEnabled(true);
        this.D.setIncludeFontPadding(false);
        this.D.setGravity(16);
        this.D.setTextSize(dimension);
        TextView textView5 = new TextView(getContext());
        this.E = textView5;
        textView5.setMaxLines(1);
        this.E.setEllipsize(truncateAt);
        this.E.setDuplicateParentStateEnabled(true);
        this.E.setVisibility(4);
        this.E.setIncludeFontPadding(false);
        this.E.setGravity(16);
        this.E.setTextSize(dimension2);
        this.C.addView(this.D);
        this.C.addView(this.E);
        this.F = baselineLayout;
        setBackgroundResource(getItemBackgroundResId());
        this.i = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f1725j = baselineLayout.getPaddingBottom();
        this.f1727k = 0;
        this.f1729l = 0;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        this.D.setImportantForAccessibility(2);
        this.E.setImportantForAccessibility(2);
        setFocusable(true);
        a();
        this.f1716b0 = getResources().getDimensionPixelSize(com.oriondriftchasers.arordrft.R.dimen.m3_navigation_item_expanded_active_indicator_height_default);
        linearLayout.addOnLayoutChangeListener(new c(0, (t1.a) this));
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i4 = 0; i4 < indexOfChild; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            if ((childAt instanceof f) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconWidth() {
        q1.a aVar = this.f1720f0;
        int minimumWidth = aVar == null ? 0 : aVar.getMinimumWidth() - this.f1720f0.f3073j.f3103b.B.intValue();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1744x.getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.f1745y.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public static void i(View view, int i, int i4, int i5) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i4;
        layoutParams.gravity = i5;
        view.setLayoutParams(layoutParams);
    }

    private void setLabelPivots(TextView textView) {
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
    }

    public final void a() {
        float textSize = this.A.getTextSize();
        float textSize2 = this.B.getTextSize();
        this.f1731m = textSize - textSize2;
        this.f1733n = (textSize2 * 1.0f) / textSize;
        this.f1735o = (textSize * 1.0f) / textSize2;
        float textSize3 = this.D.getTextSize();
        float textSize4 = this.E.getTextSize();
        this.f1736p = textSize3 - textSize4;
        this.f1737q = (textSize4 * 1.0f) / textSize3;
        this.f1738r = (textSize3 * 1.0f) / textSize4;
    }

    @Override // k.z
    public final void b(k.o oVar) {
        this.N = oVar;
        setCheckable(oVar.isCheckable());
        setChecked(oVar.isChecked());
        setEnabled(oVar.isEnabled());
        setIcon(oVar.getIcon());
        setTitle(oVar.f2088e);
        setId(oVar.f2085a);
        if (!TextUtils.isEmpty(oVar.f2099q)) {
            setContentDescription(oVar.f2099q);
        }
        h.a.l0(this, !TextUtils.isEmpty(oVar.f2100r) ? oVar.f2100r : oVar.f2088e);
        m();
        this.f1719f = true;
    }

    public final void c() {
        Drawable drawable = this.f1723h;
        RippleDrawable rippleDrawable = null;
        boolean z3 = true;
        if (this.f1721g != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.U && getActiveIndicatorDrawable() != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(j2.a.b(this.f1721g), null, activeIndicatorDrawable);
                z3 = false;
            } else if (drawable == null) {
                ColorStateList colorStateList = this.f1721g;
                int[] iArr = j2.a.d;
                int a2 = j2.a.a(colorStateList, j2.a.f1974c);
                int[] iArr2 = j2.a.f1973b;
                drawable = new RippleDrawable(new ColorStateList(new int[][]{iArr, iArr2, StateSet.NOTHING}, new int[]{a2, j2.a.a(colorStateList, iArr2), j2.a.a(colorStateList, j2.a.f1972a)}), null, null);
            }
        }
        FrameLayout frameLayout = this.f1744x;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setForeground(rippleDrawable);
        setBackground(drawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z3);
        }
    }

    public final void d(float f2, float f4) {
        l2.f fVar = this.S;
        fVar.getClass();
        float a2 = o1.a.a(0.4f, 1.0f, f2);
        View view = this.f1743w;
        view.setScaleX(a2);
        view.setScaleY(fVar.e(f2));
        view.setAlpha(o1.a.b(0.0f, 1.0f, f4 == 0.0f ? 0.8f : 0.0f, f4 == 0.0f ? 1.0f : 0.2f, f2));
        this.T = f2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.U) {
            this.f1744x.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        int i = this.f1745y.getLayoutParams().width > 0 ? this.f1729l : 0;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.C.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.rightMargin = getLayoutDirection() == 1 ? i : 0;
            layoutParams.leftMargin = getLayoutDirection() != 1 ? i : 0;
        }
    }

    public final void f(TextView textView, TextView textView2, float f2, float f4) {
        i(this.f1741u, this.f1722g0 == 0 ? (int) (this.i + f4) : 0, 0, this.i0);
        int i = this.f1722g0;
        i(this.f1742v, i == 0 ? 0 : this.f1734n0.top, i == 0 ? 0 : this.f1734n0.bottom, i == 0 ? 17 : 8388627);
        int i4 = this.f1725j;
        BaselineLayout baselineLayout = this.f1746z;
        baselineLayout.setPadding(baselineLayout.getPaddingLeft(), baselineLayout.getPaddingTop(), baselineLayout.getPaddingRight(), i4);
        this.F.setVisibility(0);
        textView.setScaleX(1.0f);
        textView.setScaleY(1.0f);
        textView.setVisibility(0);
        textView2.setScaleX(f2);
        textView2.setScaleY(f2);
        textView2.setVisibility(4);
    }

    public final void g() {
        int i = this.i;
        i(this.f1741u, i, i, this.f1722g0 == 0 ? 17 : this.i0);
        i(this.f1742v, 0, 0, 17);
        BaselineLayout baselineLayout = this.f1746z;
        baselineLayout.setPadding(baselineLayout.getPaddingLeft(), baselineLayout.getPaddingTop(), baselineLayout.getPaddingRight(), 0);
        this.F.setVisibility(8);
    }

    public Drawable getActiveIndicatorDrawable() {
        return this.f1743w.getBackground();
    }

    public q1.a getBadge() {
        return this.f1720f0;
    }

    public BaselineLayout getExpandedLabelGroup() {
        return this.C;
    }

    public int getItemBackgroundResId() {
        return com.oriondriftchasers.arordrft.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // k.z
    public k.o getItemData() {
        return this.N;
    }

    public int getItemDefaultMarginResId() {
        return com.oriondriftchasers.arordrft.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.G;
    }

    public BaselineLayout getLabelGroup() {
        return this.f1746z;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        LinearLayout linearLayout = this.f1741u;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        return linearLayout.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        if (this.f1722g0 == 1) {
            LinearLayout linearLayout = this.f1742v;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            return linearLayout.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        }
        BaselineLayout baselineLayout = this.f1746z;
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) baselineLayout.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), baselineLayout.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(TextView textView, int i) {
        int i4;
        if (this.f1732m0) {
            textView.setTextAppearance(i);
            return;
        }
        textView.setTextAppearance(i);
        Context context = textView.getContext();
        if (i != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, f.a.f1259v);
            TypedValue typedValue = new TypedValue();
            boolean value = obtainStyledAttributes.getValue(0, typedValue);
            obtainStyledAttributes.recycle();
            if (value) {
                i4 = typedValue.getComplexUnit() == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
                if (i4 == 0) {
                    textView.setTextSize(0, i4);
                    return;
                }
                return;
            }
        }
        i4 = 0;
        if (i4 == 0) {
        }
    }

    public final void j(View view) {
        if (this.f1720f0 != null) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                q1.a aVar = this.f1720f0;
                if (aVar != null) {
                    if (aVar.d() != null) {
                        aVar.d().setForeground(null);
                    } else {
                        view.getOverlay().remove(aVar);
                    }
                }
            }
            this.f1720f0 = null;
        }
    }

    public final void k(int i) {
        if (i > 0 || getVisibility() != 0) {
            int min = Math.min(this.V, i - (this.d0 * 2));
            int i4 = this.W;
            if (this.f1722g0 == 1) {
                int i5 = i - (this.f1718e0 * 2);
                int i6 = this.f1715a0;
                if (i6 != -1) {
                    i5 = i6 == -2 ? this.f1741u.getMeasuredWidth() : Math.min(i6, i5);
                }
                min = i5;
                i4 = Math.max(this.f1716b0, this.f1742v.getMeasuredHeight());
            }
            View view = this.f1743w;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (this.f1717c0 && this.f1739s == 2) {
                i4 = min;
            }
            layoutParams.height = i4;
            layoutParams.width = Math.max(0, min);
            view.setLayoutParams(layoutParams);
        }
    }

    public final void l(TextView textView, int i) {
        if (textView == null) {
            return;
        }
        h(textView, i);
        a();
        textView.setMinimumHeight(h.a.J(textView.getContext(), i));
        ColorStateList colorStateList = this.L;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        TextView textView2 = this.B;
        textView2.setTypeface(textView2.getTypeface(), this.M ? 1 : 0);
        TextView textView3 = this.E;
        textView3.setTypeface(textView3.getTypeface(), this.M ? 1 : 0);
    }

    public final void m() {
        k.o oVar = this.N;
        if (oVar != null) {
            setVisibility((!oVar.isVisible() || (!this.f1726j0 && this.f1728k0)) ? 8 : 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        k.o oVar = this.N;
        if (oVar != null && oVar.isCheckable() && this.N.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1712o0);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        q1.a aVar = this.f1720f0;
        if (aVar != null && aVar.isVisible()) {
            k.o oVar = this.N;
            CharSequence charSequence = oVar.f2088e;
            if (!TextUtils.isEmpty(oVar.f2099q)) {
                charSequence = this.N.f2099q;
            }
            StringBuilder sb = new StringBuilder();
            sb.append((Object) charSequence);
            sb.append(", ");
            q1.a aVar2 = this.f1720f0;
            q1.c cVar = aVar2.f3073j;
            Object obj = null;
            if (aVar2.isVisible()) {
                q1.b bVar = cVar.f3103b;
                if (bVar.f3090o != null) {
                    obj = bVar.f3095t;
                    if (obj == null) {
                        obj = aVar2.f3073j.f3103b.f3090o;
                    }
                } else if (!aVar2.g()) {
                    obj = bVar.f3096u;
                } else if (bVar.f3097v != 0 && (context = (Context) aVar2.f3070f.get()) != null) {
                    if (aVar2.f3076m != -2) {
                        int e4 = aVar2.e();
                        int i = aVar2.f3076m;
                        if (e4 > i) {
                            obj = context.getString(bVar.f3098w, Integer.valueOf(i));
                        }
                    }
                    obj = context.getResources().getQuantityString(bVar.f3097v, aVar2.e(), Integer.valueOf(aVar2.e()));
                }
            }
            sb.append(obj);
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) o0.c.f2850e.f2857a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.oriondriftchasers.arordrft.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i4, int i5, int i6) {
        super.onSizeChanged(i, i4, i5, i6);
        post(new androidx.emoji2.text.j(i, 2, this));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        this.f1743w.setBackground(drawable);
        c();
    }

    public void setActiveIndicatorEnabled(boolean z3) {
        this.U = z3;
        c();
        this.f1743w.setVisibility(z3 ? 0 : 8);
        requestLayout();
    }

    public void setActiveIndicatorExpandedHeight(int i) {
        this.f1716b0 = i;
        k(getWidth());
    }

    public void setActiveIndicatorExpandedMarginHorizontal(int i) {
        this.f1718e0 = i;
        if (this.f1722g0 == 1) {
            setPadding(i, 0, i, 0);
        }
        k(getWidth());
    }

    public void setActiveIndicatorExpandedPadding(Rect rect) {
        this.f1734n0 = rect;
    }

    public void setActiveIndicatorExpandedWidth(int i) {
        this.f1715a0 = i;
        k(getWidth());
    }

    public void setActiveIndicatorHeight(int i) {
        this.W = i;
        k(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i) {
        if (this.f1727k != i) {
            this.f1727k = i;
            ((LinearLayout.LayoutParams) this.f1746z.getLayoutParams()).topMargin = i;
            if (this.C.getLayoutParams() != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.C.getLayoutParams();
                layoutParams.rightMargin = getLayoutDirection() == 1 ? i : 0;
                if (getLayoutDirection() == 1) {
                    i = 0;
                }
                layoutParams.leftMargin = i;
                requestLayout();
            }
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.d0 = i;
        k(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z3) {
        this.f1717c0 = z3;
    }

    public void setActiveIndicatorWidth(int i) {
        this.V = i;
        k(getWidth());
    }

    public void setBadge(q1.a aVar) {
        q1.a aVar2 = this.f1720f0;
        if (aVar2 == aVar) {
            return;
        }
        ImageView imageView = this.f1745y;
        if (aVar2 != null && imageView != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            j(imageView);
        }
        this.f1720f0 = aVar;
        int i = this.f1724h0;
        q1.c cVar = aVar.f3073j;
        if (cVar.f3111l != i) {
            cVar.f3111l = i;
            aVar.j();
        }
        if (imageView == null || this.f1720f0 == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        q1.a aVar3 = this.f1720f0;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        aVar3.setBounds(rect);
        aVar3.i(imageView, null);
        if (aVar3.d() != null) {
            aVar3.d().setForeground(aVar3);
        } else {
            imageView.getOverlay().add(aVar3);
        }
    }

    public void setCheckable(boolean z3) {
        refreshDrawableState();
    }

    public void setChecked(boolean z3) {
        TextView textView = this.B;
        setLabelPivots(textView);
        TextView textView2 = this.A;
        setLabelPivots(textView2);
        TextView textView3 = this.E;
        setLabelPivots(textView3);
        TextView textView4 = this.D;
        setLabelPivots(textView4);
        float f2 = z3 ? 1.0f : 0.0f;
        if (this.U && this.f1719f && isAttachedToWindow()) {
            ValueAnimator valueAnimator = this.R;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.R = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.T, f2);
            this.R = ofFloat;
            ofFloat.addUpdateListener(new d(this, f2));
            this.R.setInterpolator(y.S(getContext(), com.oriondriftchasers.arordrft.R.attr.motionEasingEmphasizedInterpolator, o1.a.f2865b));
            this.R.setDuration(y.R(getContext(), com.oriondriftchasers.arordrft.R.attr.motionDurationLong2, getResources().getInteger(com.oriondriftchasers.arordrft.R.integer.material_motion_duration_long_1)));
            this.R.start();
        } else {
            d(f2, f2);
        }
        float f4 = this.f1731m;
        float f5 = this.f1733n;
        float f6 = this.f1735o;
        if (this.f1722g0 == 1) {
            f4 = this.f1736p;
            f5 = this.f1737q;
            f6 = this.f1738r;
            textView = textView3;
            textView2 = textView4;
        }
        int i = this.f1739s;
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        g();
                    }
                } else if (z3) {
                    f(textView, textView2, f5, f4);
                } else {
                    f(textView2, textView, f6, 0.0f);
                }
            } else if (z3) {
                f(textView, textView2, f5, 0.0f);
            } else {
                g();
            }
        } else if (this.f1740t) {
            if (z3) {
                f(textView, textView2, f5, 0.0f);
            } else {
                g();
            }
        } else if (z3) {
            f(textView, textView2, f5, f4);
        } else {
            f(textView2, textView, f6, 0.0f);
        }
        refreshDrawableState();
        setSelected(z3);
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        this.A.setEnabled(z3);
        this.B.setEnabled(z3);
        this.D.setEnabled(z3);
        this.E.setEnabled(z3);
        this.f1745y.setEnabled(z3);
    }

    @Override // g2.i
    public void setExpanded(boolean z3) {
        this.f1726j0 = z3;
        m();
    }

    public void setHorizontalTextAppearanceActive(int i) {
        this.J = i;
        if (i == 0) {
            i = this.H;
        }
        l(this.E, i);
    }

    public void setHorizontalTextAppearanceInactive(int i) {
        this.K = i;
        if (i == 0) {
            i = this.I;
        }
        TextView textView = this.D;
        if (textView == null) {
            return;
        }
        h(textView, i);
        a();
        textView.setMinimumHeight(h.a.J(textView.getContext(), i));
        ColorStateList colorStateList = this.L;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.P) {
            return;
        }
        this.P = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.Q = drawable;
            ColorStateList colorStateList = this.O;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.f1745y.setImageDrawable(drawable);
    }

    public void setIconLabelHorizontalSpacing(int i) {
        if (this.f1729l != i) {
            this.f1729l = i;
            e();
            requestLayout();
        }
    }

    public void setIconSize(int i) {
        ImageView imageView = this.f1745y;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
        e();
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.O = colorStateList;
        if (this.N == null || (drawable = this.Q) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.Q.invalidateSelf();
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : getContext().getDrawable(i));
    }

    public void setItemGravity(int i) {
        this.i0 = i;
        requestLayout();
    }

    public void setItemIconGravity(int i) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (this.f1722g0 != i) {
            this.f1722g0 = i;
            this.f1724h0 = 0;
            BaselineLayout baselineLayout = this.f1746z;
            this.F = baselineLayout;
            LinearLayout linearLayout = this.f1742v;
            int i10 = 8;
            if (i == 1) {
                if (this.C.getParent() == null) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 17;
                    linearLayout.addView(this.C, layoutParams);
                    e();
                }
                Rect rect = this.f1734n0;
                int i11 = rect.left;
                int i12 = rect.right;
                int i13 = rect.top;
                i4 = rect.bottom;
                this.f1724h0 = 1;
                int i14 = this.f1718e0;
                this.F = this.C;
                i8 = i13;
                i7 = i12;
                i6 = i11;
                i5 = i14;
                i9 = 0;
            } else {
                i4 = 0;
                i5 = 0;
                i6 = 0;
                i7 = 0;
                i8 = 0;
                i9 = 8;
                i10 = 0;
            }
            baselineLayout.setVisibility(i10);
            this.C.setVisibility(i9);
            ((FrameLayout.LayoutParams) this.f1741u.getLayoutParams()).gravity = this.i0;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams2.leftMargin = i6;
            layoutParams2.rightMargin = i7;
            layoutParams2.topMargin = i8;
            layoutParams2.bottomMargin = i4;
            setPadding(i5, 0, i5, 0);
            k(getWidth());
            c();
        }
    }

    public void setItemPaddingBottom(int i) {
        if (this.f1725j != i) {
            this.f1725j = i;
            k.o oVar = this.N;
            if (oVar != null) {
                setChecked(oVar.isChecked());
            }
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.i != i) {
            this.i = i;
            k.o oVar = this.N;
            if (oVar != null) {
                setChecked(oVar.isChecked());
            }
        }
    }

    public void setItemPosition(int i) {
        this.G = i;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f1721g = colorStateList;
        c();
    }

    public void setLabelFontScalingEnabled(boolean z3) {
        this.f1732m0 = z3;
        setTextAppearanceActive(this.H);
        setTextAppearanceInactive(this.I);
        setHorizontalTextAppearanceActive(this.J);
        setHorizontalTextAppearanceInactive(this.K);
    }

    public void setLabelMaxLines(int i) {
        TextView textView = this.A;
        textView.setMaxLines(i);
        TextView textView2 = this.B;
        textView2.setMaxLines(i);
        this.D.setMaxLines(i);
        this.E.setMaxLines(i);
        if (Build.VERSION.SDK_INT > 34) {
            textView.setGravity(17);
            textView2.setGravity(17);
        } else if (i > 1) {
            textView.setEllipsize(null);
            textView2.setEllipsize(null);
            textView.setGravity(17);
            textView2.setGravity(17);
        } else {
            textView.setGravity(16);
            textView2.setGravity(16);
        }
        requestLayout();
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f1739s != i) {
            this.f1739s = i;
            if (this.f1717c0 && i == 2) {
                this.S = f1714q0;
            } else {
                this.S = f1713p0;
            }
            k(getWidth());
            k.o oVar = this.N;
            if (oVar != null) {
                setChecked(oVar.isChecked());
            }
        }
    }

    public void setMeasureBottomPaddingFromLabelBaseline(boolean z3) {
        this.f1730l0 = z3;
        this.f1746z.setMeasurePaddingFromBaseline(z3);
        this.A.setIncludeFontPadding(z3);
        this.B.setIncludeFontPadding(z3);
        this.C.setMeasurePaddingFromBaseline(z3);
        this.D.setIncludeFontPadding(z3);
        this.E.setIncludeFontPadding(z3);
        requestLayout();
    }

    @Override // g2.i
    public void setOnlyShowWhenExpanded(boolean z3) {
        this.f1728k0 = z3;
        m();
    }

    public void setShifting(boolean z3) {
        if (this.f1740t != z3) {
            this.f1740t = z3;
            k.o oVar = this.N;
            if (oVar != null) {
                setChecked(oVar.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i) {
        this.H = i;
        l(this.B, i);
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z3) {
        this.M = z3;
        setTextAppearanceActive(this.H);
        setHorizontalTextAppearanceActive(this.J);
        TextView textView = this.B;
        textView.setTypeface(textView.getTypeface(), this.M ? 1 : 0);
        TextView textView2 = this.E;
        textView2.setTypeface(textView2.getTypeface(), this.M ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i) {
        this.I = i;
        TextView textView = this.A;
        if (textView == null) {
            return;
        }
        h(textView, i);
        a();
        textView.setMinimumHeight(h.a.J(textView.getContext(), i));
        ColorStateList colorStateList = this.L;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.L = colorStateList;
        if (colorStateList != null) {
            this.A.setTextColor(colorStateList);
            this.B.setTextColor(colorStateList);
            this.D.setTextColor(colorStateList);
            this.E.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.A.setText(charSequence);
        this.B.setText(charSequence);
        this.D.setText(charSequence);
        this.E.setText(charSequence);
        k.o oVar = this.N;
        if (oVar == null || TextUtils.isEmpty(oVar.f2099q)) {
            setContentDescription(charSequence);
        }
        k.o oVar2 = this.N;
        if (oVar2 != null && !TextUtils.isEmpty(oVar2.f2100r)) {
            charSequence = this.N.f2100r;
        }
        h.a.l0(this, charSequence);
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f1723h = drawable;
        c();
    }
}
