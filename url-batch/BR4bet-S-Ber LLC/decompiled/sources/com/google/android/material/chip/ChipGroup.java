package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.moontiko.really.admiralcasino.R;
import defpackage.ab;
import defpackage.bb;
import defpackage.la0;
import defpackage.ma;
import defpackage.pl;
import defpackage.xa;
import defpackage.y00;
import defpackage.ya;
import defpackage.za;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class ChipGroup extends pl {
    public int j;
    public int k;
    public ab l;
    public final ma m;
    public final int n;
    public final bb o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ChipGroup(Context context, AttributeSet attributeSet) {
        super(r10, attributeSet, R.attr.chipGroupStyle);
        Context j0 = la0.j0(context, attributeSet, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup);
        this.h = false;
        TypedArray obtainStyledAttributes = j0.getTheme().obtainStyledAttributes(attributeSet, y00.l, 0, 0);
        this.f = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.g = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        ma maVar = new ma();
        this.m = maVar;
        bb bbVar = new bb(this);
        this.o = bbVar;
        TypedArray O = la0.O(getContext(), attributeSet, y00.f, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = O.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(O.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(O.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(O.getBoolean(5, false));
        setSingleSelection(O.getBoolean(6, false));
        setSelectionRequired(O.getBoolean(4, false));
        this.n = O.getResourceId(0, -1);
        O.recycle();
        maVar.c = new xa(this);
        super.setOnHierarchyChangeListener(bbVar);
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
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof ya);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ya(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ya(getContext(), attributeSet);
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
            ma maVar = this.m;
            Chip chip = (Chip) maVar.a.get(Integer.valueOf(i));
            if (chip != null && maVar.a(chip)) {
                maVar.d();
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
    public void setOnCheckedChangeListener(za zaVar) {
        if (zaVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new xa(this));
        }
    }

    public void setOnCheckedStateChangeListener(ab abVar) {
        this.l = abVar;
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
        ma maVar = this.m;
        if (maVar.d != z) {
            maVar.d = z;
            boolean isEmpty = maVar.b.isEmpty();
            Iterator it = maVar.a.values().iterator();
            while (it.hasNext()) {
                maVar.e((Chip) it.next(), false);
            }
            if (isEmpty) {
                return;
            }
            maVar.d();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ya(layoutParams);
    }

    @Override // defpackage.pl
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
