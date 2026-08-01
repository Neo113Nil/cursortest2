package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.awerser.monnit.betplay.R;
import defpackage.gj;
import defpackage.ha;
import defpackage.ia;
import defpackage.ja;
import defpackage.ka;
import defpackage.la;
import defpackage.ly;
import defpackage.op;
import defpackage.vw;
import defpackage.w9;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class ChipGroup extends gj {
    public int j;
    public int k;
    public ka l;
    public final w9 m;
    public final int n;
    public final la o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ChipGroup(Context context, AttributeSet attributeSet) {
        super(r10, attributeSet, R.attr.chipGroupStyle);
        Context Z = op.Z(context, attributeSet, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup);
        this.h = false;
        TypedArray obtainStyledAttributes = Z.getTheme().obtainStyledAttributes(attributeSet, ly.j, 0, 0);
        this.f = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.g = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        w9 w9Var = new w9();
        this.m = w9Var;
        la laVar = new la(this);
        this.o = laVar;
        TypedArray Z2 = vw.Z(getContext(), attributeSet, ly.d, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = Z2.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(Z2.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(Z2.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(Z2.getBoolean(5, false));
        setSingleSelection(Z2.getBoolean(6, false));
        setSelectionRequired(Z2.getBoolean(4, false));
        this.n = Z2.getResourceId(0, -1);
        Z2.recycle();
        w9Var.c = new ha(this);
        super.setOnHierarchyChangeListener(laVar);
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
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof ia);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ia(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ia(getContext(), attributeSet);
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
            w9 w9Var = this.m;
            Chip chip = (Chip) w9Var.a.get(Integer.valueOf(i));
            if (chip != null && w9Var.a(chip)) {
                w9Var.d();
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
    public void setOnCheckedChangeListener(ja jaVar) {
        if (jaVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new ha(this));
        }
    }

    public void setOnCheckedStateChangeListener(ka kaVar) {
        this.l = kaVar;
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
        w9 w9Var = this.m;
        if (w9Var.d != z) {
            w9Var.d = z;
            boolean isEmpty = w9Var.b.isEmpty();
            Iterator it = w9Var.a.values().iterator();
            while (it.hasNext()) {
                w9Var.e((Chip) it.next(), false);
            }
            if (isEmpty) {
                return;
            }
            w9Var.d();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ia(layoutParams);
    }

    @Override // defpackage.gj
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
