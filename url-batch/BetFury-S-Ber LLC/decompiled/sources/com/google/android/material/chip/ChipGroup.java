package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.trembin.nirefon.betfury.R;
import defpackage.c70;
import defpackage.d50;
import defpackage.gb;
import defpackage.mv;
import defpackage.tb;
import defpackage.ub;
import defpackage.vb;
import defpackage.vo;
import defpackage.wb;
import defpackage.xb;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class ChipGroup extends vo {
    public int j;
    public int k;
    public wb l;
    public final gb m;
    public final int n;
    public final xb o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ChipGroup(Context context, AttributeSet attributeSet) {
        super(r10, attributeSet, R.attr.chipGroupStyle);
        Context V = mv.V(context, attributeSet, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup);
        this.h = false;
        TypedArray obtainStyledAttributes = V.getTheme().obtainStyledAttributes(attributeSet, c70.l, 0, 0);
        this.f = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.g = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        gb gbVar = new gb();
        this.m = gbVar;
        xb xbVar = new xb(this);
        this.o = xbVar;
        TypedArray E = d50.E(getContext(), attributeSet, c70.f, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = E.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(E.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(E.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(E.getBoolean(5, false));
        setSingleSelection(E.getBoolean(6, false));
        setSelectionRequired(E.getBoolean(4, false));
        this.n = E.getResourceId(0, -1);
        E.recycle();
        gbVar.c = new tb(this);
        super.setOnHierarchyChangeListener(xbVar);
    }

    private int getVisibleChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof Chip) && getChildAt(i2).getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof ub);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ub(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ub(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.m.c();
    }

    public List<Integer> getCheckedChipIds() {
        return this.m.b(this);
    }

    public int getChipSpacingHorizontal() {
        return this.j;
    }

    public int getChipSpacingVertical() {
        return this.k;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.n;
        if (i != -1) {
            gb gbVar = this.m;
            Chip chip = (Chip) gbVar.a.get(Integer.valueOf(i));
            if (chip != null && gbVar.a(chip)) {
                gbVar.d();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(getRowCount(), this.h ? getVisibleChipCount() : -1, false, this.m.d ? 1 : 2));
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.j != i) {
            this.j = i;
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
        if (this.k != i) {
            this.k = i;
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
    public void setOnCheckedChangeListener(vb vbVar) {
        if (vbVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new tb(this));
        }
    }

    public void setOnCheckedStateChangeListener(wb wbVar) {
        this.l = wbVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.o.a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.m.e = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        gb gbVar = this.m;
        if (gbVar.d != z) {
            gbVar.d = z;
            boolean isEmpty = gbVar.b.isEmpty();
            Iterator it = gbVar.a.values().iterator();
            while (it.hasNext()) {
                gbVar.e((Chip) it.next(), false);
            }
            if (isEmpty) {
                return;
            }
            gbVar.d();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ub(layoutParams);
    }

    @Override // defpackage.vo
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
