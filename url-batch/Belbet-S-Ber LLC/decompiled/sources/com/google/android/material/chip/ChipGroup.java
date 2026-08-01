package com.google.android.material.chip;

import a2.g;
import a2.h;
import a2.j;
import a2.k;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.gdmhkmf.belbet.R;
import i2.a;
import i2.f;
import i2.i;
import i2.o;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class ChipGroup extends f {

    /* renamed from: j, reason: collision with root package name */
    public int f1017j;

    /* renamed from: k, reason: collision with root package name */
    public int f1018k;

    /* renamed from: l, reason: collision with root package name */
    public j f1019l;

    /* renamed from: m, reason: collision with root package name */
    public final a f1020m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1021n;

    /* renamed from: o, reason: collision with root package name */
    public final k f1022o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ChipGroup(Context context, AttributeSet attributeSet) {
        super(r10, attributeSet, R.attr.chipGroupStyle);
        Context b2 = u2.a.b(context, attributeSet, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup);
        this.h = false;
        TypedArray obtainStyledAttributes = b2.getTheme().obtainStyledAttributes(attributeSet, q1.a.f3146j, 0, 0);
        this.f2039f = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f2040g = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        a aVar = new a();
        this.f1020m = aVar;
        k kVar = new k(this);
        this.f1022o = kVar;
        TypedArray e4 = o.e(getContext(), attributeSet, q1.a.d, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = e4.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(e4.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(e4.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(e4.getBoolean(5, false));
        setSingleSelection(e4.getBoolean(6, false));
        setSelectionRequired(e4.getBoolean(4, false));
        this.f1021n = e4.getResourceId(0, -1);
        e4.recycle();
        aVar.f2003c = new g(this);
        super.setOnHierarchyChangeListener(kVar);
    }

    private int getVisibleChipCount() {
        int i = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            if ((getChildAt(i4) instanceof Chip) && getChildAt(i4).getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof h);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new h(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new h(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.f1020m.c();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f1020m.b(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f1017j;
    }

    public int getChipSpacingVertical() {
        return this.f1018k;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f1021n;
        if (i != -1) {
            a aVar = this.f1020m;
            i iVar = (i) aVar.f2001a.get(Integer.valueOf(i));
            if (iVar != null && aVar.a(iVar)) {
                aVar.d();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(getRowCount(), this.h ? getVisibleChipCount() : -1, false, this.f1020m.d ? 1 : 2));
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f1017j != i) {
            this.f1017j = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f1018k != i) {
            this.f1018k = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(a2.i iVar) {
        if (iVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new g(this));
        }
    }

    public void setOnCheckedStateChangeListener(j jVar) {
        this.f1019l = jVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1022o.f135a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z4) {
        this.f1020m.f2004e = z4;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // i2.f
    public void setSingleLine(boolean z4) {
        super.setSingleLine(z4);
    }

    public void setSingleSelection(boolean z4) {
        a aVar = this.f1020m;
        if (aVar.d != z4) {
            aVar.d = z4;
            boolean isEmpty = aVar.f2002b.isEmpty();
            Iterator it = aVar.f2001a.values().iterator();
            while (it.hasNext()) {
                aVar.e((i) it.next(), false);
            }
            if (isEmpty) {
                return;
            }
            aVar.d();
        }
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new h(layoutParams);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
