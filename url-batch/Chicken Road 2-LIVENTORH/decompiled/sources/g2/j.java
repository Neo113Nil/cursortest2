package g2;

import a.y;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashSet;
import k.a0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class j extends ViewGroup implements a0 {

    /* renamed from: e0, reason: collision with root package name */
    public static final int[] f1752e0 = {R.attr.state_checked};

    /* renamed from: f0, reason: collision with root package name */
    public static final int[] f1753f0 = {-16842910};
    public final SparseArray A;
    public int B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public l2.n N;
    public boolean O;
    public ColorStateList P;
    public l Q;
    public h R;
    public boolean S;
    public boolean T;
    public int U;
    public int V;
    public boolean W;

    /* renamed from: a0, reason: collision with root package name */
    public MenuItem f1754a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f1755b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f1756c0;
    public final Rect d0;

    /* renamed from: f, reason: collision with root package name */
    public final j1.a f1757f;

    /* renamed from: g, reason: collision with root package name */
    public final com.google.android.material.datepicker.l f1758g;

    /* renamed from: h, reason: collision with root package name */
    public m0.c f1759h;
    public final SparseArray i;

    /* renamed from: j, reason: collision with root package name */
    public int f1760j;

    /* renamed from: k, reason: collision with root package name */
    public int f1761k;

    /* renamed from: l, reason: collision with root package name */
    public i[] f1762l;

    /* renamed from: m, reason: collision with root package name */
    public int f1763m;

    /* renamed from: n, reason: collision with root package name */
    public int f1764n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f1765o;

    /* renamed from: p, reason: collision with root package name */
    public int f1766p;

    /* renamed from: q, reason: collision with root package name */
    public ColorStateList f1767q;

    /* renamed from: r, reason: collision with root package name */
    public final ColorStateList f1768r;

    /* renamed from: s, reason: collision with root package name */
    public int f1769s;

    /* renamed from: t, reason: collision with root package name */
    public int f1770t;

    /* renamed from: u, reason: collision with root package name */
    public int f1771u;

    /* renamed from: v, reason: collision with root package name */
    public int f1772v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1773w;

    /* renamed from: x, reason: collision with root package name */
    public Drawable f1774x;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f1775y;

    /* renamed from: z, reason: collision with root package name */
    public int f1776z;

    public j(Context context) {
        super(context);
        this.i = new SparseArray();
        this.f1763m = -1;
        this.f1764n = -1;
        this.A = new SparseArray();
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = -1;
        this.M = 49;
        this.O = false;
        this.U = 1;
        this.V = 0;
        this.f1754a0 = null;
        this.f1755b0 = 7;
        this.f1756c0 = false;
        this.d0 = new Rect();
        this.f1768r = b();
        if (isInEditMode()) {
            this.f1757f = null;
        } else {
            j1.a aVar = new j1.a();
            this.f1757f = aVar;
            aVar.M(0);
            aVar.n();
            aVar.B(y.R(getContext(), com.oriondriftchasers.arordrft.R.attr.motionDurationMedium4, getResources().getInteger(com.oriondriftchasers.arordrft.R.integer.material_motion_duration_long_1)));
            aVar.D(y.S(getContext(), com.oriondriftchasers.arordrft.R.attr.motionEasingStandard, o1.a.f2865b));
            aVar.J(new e2.m());
        }
        this.f1758g = new com.google.android.material.datepicker.l(2, (t1.b) this);
        setImportantForAccessibility(1);
    }

    private int getCollapsedVisibleItemCount() {
        return Math.min(this.f1755b0, this.R.f1751e);
    }

    private f getNewItem() {
        m0.c cVar = this.f1759h;
        f fVar = cVar != null ? (f) cVar.a() : null;
        return fVar == null ? new t1.a(getContext()) : fVar;
    }

    private void setBadgeIfNeeded(f fVar) {
        q1.a aVar;
        int id = fVar.getId();
        if (id == -1 || (aVar = (q1.a) this.A.get(id)) == null) {
            return;
        }
        fVar.setBadge(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        f fVar;
        removeAllViews();
        i[] iVarArr = this.f1762l;
        if (iVarArr != null && this.f1759h != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    f fVar2 = (f) iVar;
                    this.f1759h.c(fVar2);
                    fVar2.j(fVar2.f1745y);
                    fVar2.N = null;
                    fVar2.T = 0.0f;
                    fVar2.f1719f = false;
                }
            }
        }
        this.Q.f1780g = true;
        this.R.b();
        this.Q.f1780g = false;
        int i = this.R.f1750c;
        if (i == 0) {
            this.f1763m = 0;
            this.f1764n = 0;
            this.f1762l = null;
            this.f1759h = null;
            return;
        }
        if (this.f1759h == null || this.V != i) {
            this.V = i;
            this.f1759h = new m0.c(i);
        }
        HashSet hashSet = new HashSet();
        for (int i4 = 0; i4 < this.R.f1749b.size(); i4++) {
            hashSet.add(Integer.valueOf(this.R.a(i4).getItemId()));
        }
        int i5 = 0;
        while (true) {
            SparseArray sparseArray = this.A;
            if (i5 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i5);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                sparseArray.delete(keyAt);
            }
            i5++;
        }
        int size = this.R.f1749b.size();
        this.f1762l = new i[size];
        int i6 = this.f1760j;
        boolean z3 = i6 != -1 ? i6 == 0 : getCurrentVisibleContentItemCount() > 3;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            MenuItem a2 = this.R.a(i9);
            boolean z4 = a2 instanceof a;
            if (z4) {
                Context context = getContext();
                b bVar = new b(context);
                LayoutInflater.from(context).inflate(com.oriondriftchasers.arordrft.R.layout.m3_navigation_menu_divider, (ViewGroup) bVar, true);
                bVar.a();
                bVar.setOnlyShowWhenExpanded(true);
                bVar.setDividersEnabled(this.f1756c0);
                fVar = bVar;
            } else if (a2.hasSubMenu()) {
                if (i7 > 0) {
                    throw new IllegalArgumentException("Only one layer of submenu is supported; a submenu inside a submenu is not supported by the Navigation Bar.");
                }
                m mVar = new m(getContext());
                int i10 = this.f1772v;
                if (i10 == 0) {
                    i10 = this.f1770t;
                }
                mVar.setTextAppearance(i10);
                mVar.setTextColor(this.f1767q);
                mVar.setOnlyShowWhenExpanded(true);
                mVar.b((k.o) a2);
                i7 = a2.getSubMenu().size();
                fVar = mVar;
            } else if (i7 > 0) {
                i7--;
                fVar = e(i9, (k.o) a2, z3, true);
            } else {
                k.o oVar = (k.o) a2;
                boolean z5 = i8 >= this.f1755b0;
                i8++;
                fVar = e(i9, oVar, z3, z5);
            }
            if (!z4 && a2.isCheckable() && this.f1764n == -1) {
                this.f1764n = i9;
            }
            this.f1762l[i9] = fVar;
            addView(fVar);
        }
        int min = Math.min(size - 1, this.f1764n);
        this.f1764n = min;
        setCheckedItem(this.f1762l[min].getItemData());
    }

    public final ColorStateList b() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList B = y.B(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.oriondriftchasers.arordrft.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = B.getDefaultColor();
        int[] iArr = f1752e0;
        int[] iArr2 = ViewGroup.EMPTY_STATE_SET;
        int[] iArr3 = f1753f0;
        return new ColorStateList(new int[][]{iArr3, iArr, iArr2}, new int[]{B.getColorForState(iArr3, defaultColor), i, defaultColor});
    }

    @Override // k.a0
    public final void c(k.m mVar) {
        this.R = new h(mVar);
    }

    public final l2.j d() {
        if (this.N == null || this.P == null) {
            return null;
        }
        l2.j jVar = new l2.j(this.N);
        jVar.q(this.P);
        return jVar;
    }

    public final f e(int i, k.o oVar, boolean z3, boolean z4) {
        this.Q.f1780g = true;
        oVar.setCheckable(true);
        this.Q.f1780g = false;
        f newItem = getNewItem();
        newItem.setShifting(z3);
        newItem.setLabelMaxLines(this.U);
        newItem.setIconTintList(this.f1765o);
        newItem.setIconSize(this.f1766p);
        newItem.setTextColor(this.f1768r);
        newItem.setTextAppearanceInactive(this.f1769s);
        newItem.setTextAppearanceActive(this.f1770t);
        newItem.setHorizontalTextAppearanceInactive(this.f1771u);
        newItem.setHorizontalTextAppearanceActive(this.f1772v);
        newItem.setTextAppearanceActiveBoldEnabled(this.f1773w);
        newItem.setTextColor(this.f1767q);
        int i4 = this.B;
        if (i4 != -1) {
            newItem.setItemPaddingTop(i4);
        }
        int i5 = this.C;
        if (i5 != -1) {
            newItem.setItemPaddingBottom(i5);
        }
        newItem.setMeasureBottomPaddingFromLabelBaseline(this.S);
        newItem.setLabelFontScalingEnabled(this.T);
        int i6 = this.D;
        if (i6 != -1) {
            newItem.setActiveIndicatorLabelPadding(i6);
        }
        int i7 = this.E;
        if (i7 != -1) {
            newItem.setIconLabelHorizontalSpacing(i7);
        }
        newItem.setActiveIndicatorWidth(this.G);
        newItem.setActiveIndicatorHeight(this.H);
        newItem.setActiveIndicatorExpandedWidth(this.I);
        newItem.setActiveIndicatorExpandedHeight(this.J);
        newItem.setActiveIndicatorMarginHorizontal(this.K);
        newItem.setItemGravity(this.M);
        newItem.setActiveIndicatorExpandedPadding(this.d0);
        newItem.setActiveIndicatorExpandedMarginHorizontal(this.L);
        newItem.setActiveIndicatorDrawable(d());
        newItem.setActiveIndicatorResizeable(this.O);
        newItem.setActiveIndicatorEnabled(this.F);
        Drawable drawable = this.f1774x;
        if (drawable != null) {
            newItem.setItemBackground(drawable);
        } else {
            newItem.setItemBackground(this.f1776z);
        }
        newItem.setItemRippleColor(this.f1775y);
        newItem.setLabelVisibilityMode(this.f1760j);
        newItem.setItemIconGravity(this.f1761k);
        newItem.setOnlyShowWhenExpanded(z4);
        newItem.setExpanded(this.W);
        newItem.b(oVar);
        newItem.setItemPosition(i);
        int i8 = oVar.f2085a;
        newItem.setOnTouchListener((View.OnTouchListener) this.i.get(i8));
        newItem.setOnClickListener(this.f1758g);
        int i9 = this.f1763m;
        if (i9 != 0 && i8 == i9) {
            this.f1764n = i;
        }
        setBadgeIfNeeded(newItem);
        return newItem;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.D;
    }

    public SparseArray<q1.a> getBadgeDrawables() {
        return this.A;
    }

    public int getCurrentVisibleContentItemCount() {
        return this.W ? this.R.d : getCollapsedVisibleItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.f1772v;
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.f1771u;
    }

    public int getIconLabelHorizontalSpacing() {
        return this.E;
    }

    public ColorStateList getIconTintList() {
        return this.f1765o;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.P;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.F;
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.J;
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.L;
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.I;
    }

    public int getItemActiveIndicatorHeight() {
        return this.H;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.K;
    }

    public l2.n getItemActiveIndicatorShapeAppearance() {
        return this.N;
    }

    public int getItemActiveIndicatorWidth() {
        return this.G;
    }

    public Drawable getItemBackground() {
        i[] iVarArr = this.f1762l;
        if (iVarArr != null && iVarArr.length > 0) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    return ((f) iVar).getBackground();
                }
            }
        }
        return this.f1774x;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f1776z;
    }

    public int getItemGravity() {
        return this.M;
    }

    public int getItemIconGravity() {
        return this.f1761k;
    }

    public int getItemIconSize() {
        return this.f1766p;
    }

    public int getItemPaddingBottom() {
        return this.C;
    }

    public int getItemPaddingTop() {
        return this.B;
    }

    public ColorStateList getItemRippleColor() {
        return this.f1775y;
    }

    public int getItemTextAppearanceActive() {
        return this.f1770t;
    }

    public int getItemTextAppearanceInactive() {
        return this.f1769s;
    }

    public ColorStateList getItemTextColor() {
        return this.f1767q;
    }

    public int getLabelMaxLines() {
        return this.U;
    }

    public int getLabelVisibilityMode() {
        return this.f1760j;
    }

    public h getMenu() {
        return this.R;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.T;
    }

    public int getSelectedItemId() {
        return this.f1763m;
    }

    public int getSelectedItemPosition() {
        return this.f1764n;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getCurrentVisibleContentItemCount(), false, 1));
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.D = i;
        i[] iVarArr = this.f1762l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setActiveIndicatorLabelPadding(i);
                }
            }
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        if (this.f1754a0 == menuItem || !menuItem.isCheckable()) {
            return;
        }
        MenuItem menuItem2 = this.f1754a0;
        if (menuItem2 != null && menuItem2.isChecked()) {
            this.f1754a0.setChecked(false);
        }
        menuItem.setChecked(true);
        this.f1754a0 = menuItem;
    }

    public void setCollapsedMaxItemCount(int i) {
        this.f1755b0 = i;
    }

    public void setExpanded(boolean z3) {
        this.W = z3;
        i[] iVarArr = this.f1762l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                iVar.setExpanded(z3);
            }
        }
    }

    public void setHorizontalItemTextAppearanceActive(int i) {
        this.f1772v = i;
        i[] iVarArr = this.f1762l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setHorizontalTextAppearanceActive(i);
                }
            }
        }
    }

    public void setHorizontalItemTextAppearanceInactive(int i) {
        this.f1771u = i;
        i[] iVarArr = this.f1762l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setHorizontalTextAppearanceInactive(i);
                }
            }
        }
    }

    public void setIconLabelHorizontalSpacing(int i) {
        this.E = i;
        i[] iVarArr = this.f1762l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setIconLabelHorizontalSpacing(i);
                }
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f1765o = colorStateList;
        i[] iVarArr = this.f1762l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setIconTintList(colorStateList);
                }
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.P = colorStateList;
        i[] iVarArr = this.f1762l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setActiveIndicatorDrawable(d());
                }
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z3) {
        this.F = z3;
        i[] iVarArr = this.f1762l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setActiveIndicatorEnabled(z3);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedHeight(int i) {
        this.J = i;
        i[] iVarArr = this.f1762l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setActiveIndicatorExpandedHeight(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i) {
        this.L = i;
        i[] iVarArr = this.f1762l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setActiveIndicatorExpandedMarginHorizontal(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedWidth(int i) {
        this.I = i;
        i[] iVarArr = this.f1762l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setActiveIndicatorExpandedWidth(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.H = i;
        i[] iVarArr = this.f1762l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setActiveIndicatorHeight(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.K = i;
        i[] iVarArr = this.f1762l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setActiveIndicatorMarginHorizontal(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z3) {
        this.O = z3;
        i[] iVarArr = this.f1762l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setActiveIndicatorResizeable(z3);
                }
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(l2.n nVar) {
        this.N = nVar;
        i[] iVarArr = this.f1762l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setActiveIndicatorDrawable(d());
                }
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.G = i;
        i[] iVarArr = this.f1762l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setActiveIndicatorWidth(i);
                }
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f1774x = drawable;
        i[] iVarArr = this.f1762l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setItemBackground(drawable);
                }
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f1776z = i;
        i[] iVarArr = this.f1762l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setItemBackground(i);
                }
            }
        }
    }

    public void setItemGravity(int i) {
        this.M = i;
        i[] iVarArr = this.f1762l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setItemGravity(i);
                }
            }
        }
    }

    public void setItemIconGravity(int i) {
        this.f1761k = i;
        i[] iVarArr = this.f1762l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setItemIconGravity(i);
                }
            }
        }
    }

    public void setItemIconSize(int i) {
        this.f1766p = i;
        i[] iVarArr = this.f1762l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setIconSize(i);
                }
            }
        }
    }

    public void setItemPaddingBottom(int i) {
        this.C = i;
        i[] iVarArr = this.f1762l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setItemPaddingBottom(this.C);
                }
            }
        }
    }

    public void setItemPaddingTop(int i) {
        this.B = i;
        i[] iVarArr = this.f1762l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setItemPaddingTop(i);
                }
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f1775y = colorStateList;
        i[] iVarArr = this.f1762l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setItemRippleColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.f1770t = i;
        i[] iVarArr = this.f1762l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setTextAppearanceActive(i);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z3) {
        this.f1773w = z3;
        i[] iVarArr = this.f1762l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setTextAppearanceActiveBoldEnabled(z3);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f1769s = i;
        i[] iVarArr = this.f1762l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setTextAppearanceInactive(i);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f1767q = colorStateList;
        i[] iVarArr = this.f1762l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setTextColor(colorStateList);
                }
            }
        }
    }

    public void setLabelFontScalingEnabled(boolean z3) {
        this.T = z3;
        i[] iVarArr = this.f1762l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setLabelFontScalingEnabled(z3);
                }
            }
        }
    }

    public void setLabelMaxLines(int i) {
        this.U = i;
        i[] iVarArr = this.f1762l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setLabelMaxLines(i);
                }
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.f1760j = i;
    }

    public void setMeasurePaddingFromLabelBaseline(boolean z3) {
        this.S = z3;
        i[] iVarArr = this.f1762l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof f) {
                    ((f) iVar).setMeasureBottomPaddingFromLabelBaseline(z3);
                }
            }
        }
    }

    public void setPresenter(l lVar) {
        this.Q = lVar;
    }

    public void setSubmenuDividersEnabled(boolean z3) {
        if (this.f1756c0 == z3) {
            return;
        }
        this.f1756c0 = z3;
        i[] iVarArr = this.f1762l;
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                if (iVar instanceof b) {
                    ((b) iVar).setDividersEnabled(z3);
                }
            }
        }
    }
}
