package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.moontiko.really.admiralcasino.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class hv extends LinearLayout {
    public static final Object q = null;
    public int f;
    public final ArrayList g;
    public final rc0 h;
    public final fv i;
    public Integer[] j;
    public z60 k;
    public a70 l;
    public int m;
    public c70 n;
    public boolean o;
    public final ArrayList p;

    /* JADX WARN: Type inference failed for: r0v3, types: [fv] */
    public hv(Context context, AttributeSet attributeSet) {
        super(la0.j0(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        z60 b;
        XmlResourceParser xml;
        int next;
        int next2;
        this.f = 0;
        this.g = new ArrayList();
        final MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.h = new rc0(29, materialButtonToggleGroup);
        this.i = new Comparator() { // from class: fv
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int compareTo = Boolean.valueOf(materialButton.z).compareTo(Boolean.valueOf(materialButton2.z));
                if (compareTo != 0) {
                    return compareTo;
                }
                int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                MaterialButtonToggleGroup materialButtonToggleGroup2 = MaterialButtonToggleGroup.this;
                return Integer.compare(materialButtonToggleGroup2.indexOfChild(materialButton), materialButtonToggleGroup2.indexOfChild(materialButton2));
            }
        };
        this.o = true;
        new HashMap();
        new HashMap();
        new ArrayList();
        new ArrayList();
        this.p = new ArrayList();
        Context context2 = getContext();
        TypedArray O = la0.O(context2, attributeSet, y00.r, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (O.hasValue(2)) {
            int resourceId = O.getResourceId(2, 0);
            c70 c70Var = null;
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                    try {
                        c70 c70Var2 = new c70();
                        c70Var2.c = new int[10][];
                        c70Var2.d = new pw[10];
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                        do {
                            next2 = xml.next();
                            if (next2 == 2) {
                                break;
                            }
                        } while (next2 != 1);
                        if (next2 != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml.getName().equals("selector")) {
                            c70Var2.a(context2, xml, asAttributeSet, context2.getTheme());
                        }
                        xml.close();
                        c70Var = c70Var2;
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                }
            }
            this.n = c70Var;
        }
        if (O.hasValue(6)) {
            a70 h = a70.h(context2, O, 6);
            this.l = h;
            if (h == null) {
                int resourceId2 = O.getResourceId(6, 0);
                int resourceId3 = O.getResourceId(7, 0);
                g gVar = new g(0.0f);
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context2, resourceId2);
                if (resourceId3 != 0) {
                    contextThemeWrapper.getTheme().applyStyle(resourceId3, true);
                }
                this.l = new tq(f50.h(contextThemeWrapper.obtainStyledAttributes(y00.H), gVar).a()).c();
            }
        }
        if (O.hasValue(3)) {
            g gVar2 = new g(0.0f);
            int resourceId4 = O.getResourceId(3, 0);
            if (resourceId4 == 0) {
                b = z60.b(f50.i(O, 3, gVar2));
            } else if (context2.getResources().getResourceTypeName(resourceId4).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId4);
                    try {
                        b = new z60();
                        AttributeSet asAttributeSet2 = Xml.asAttributeSet(xml);
                        do {
                            next = xml.next();
                            if (next == 2) {
                                break;
                            }
                        } while (next != 1);
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml.getName().equals("selector")) {
                            b.d(context2, xml, asAttributeSet2, context2.getTheme());
                        }
                        xml.close();
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    b = z60.b(gVar2);
                }
            } else {
                b = z60.b(f50.i(O, 3, gVar2));
            }
            this.k = b;
        }
        this.m = O.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(O.getBoolean(0, true));
        setOverflowMode(O.getInt(5, 0));
        getResources().getDimensionPixelOffset(R.dimen.m3_btn_group_overflow_item_icon_horizontal_padding);
        O.recycle();
    }

    public static LinearLayout.LayoutParams d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new gv(layoutParams.width, layoutParams.height);
    }

    public static gv f(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new gv((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new gv((ViewGroup.MarginLayoutParams) layoutParams) : new gv(layoutParams);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (i(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (i(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i2 = firstVisibleChildIndex + 1; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            View childAt2 = getChildAt(i2 - 1);
            if ((childAt instanceof MaterialButton) && (childAt2 instanceof MaterialButton)) {
                MaterialButton materialButton = (MaterialButton) childAt;
                MaterialButton materialButton2 = (MaterialButton) childAt2;
                if (this.m <= 0) {
                    i = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                    materialButton.setShouldDrawSurfaceColorStroke(true);
                    materialButton2.setShouldDrawSurfaceColorStroke(true);
                    LinearLayout.LayoutParams d = d(childAt);
                    if (getOrientation() != 0) {
                        d.setMarginEnd(0);
                        d.setMarginStart(this.m - i);
                        d.topMargin = 0;
                    } else {
                        d.bottomMargin = 0;
                        d.topMargin = this.m - i;
                        d.setMarginStart(0);
                    }
                    childAt.setLayoutParams(d);
                } else {
                    materialButton.setShouldDrawSurfaceColorStroke(false);
                    materialButton2.setShouldDrawSurfaceColorStroke(false);
                }
            }
            i = 0;
            LinearLayout.LayoutParams d2 = d(childAt);
            if (getOrientation() != 0) {
            }
            childAt.setLayoutParams(d2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams d3 = d((MaterialButton) getChildAt(firstVisibleChildIndex));
        if (getOrientation() == 1) {
            d3.topMargin = 0;
            d3.bottomMargin = 0;
        } else {
            d3.setMarginEnd(0);
            d3.setMarginStart(0);
            d3.leftMargin = 0;
            d3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        j();
        this.o = true;
        int indexOfChild = indexOfChild(null);
        if (indexOfChild < 0 || i != -1) {
            super.addView(view, i, layoutParams);
        } else {
            super.addView(view, indexOfChild, layoutParams);
        }
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.h);
        this.g.add(materialButton.getShapeAppearance());
        materialButton.setEnabled(isEnabled());
    }

    public final void b() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        if (firstVisibleChildIndex == -1 || this.n == null) {
            return;
        }
        if (this.f != 2) {
            c(firstVisibleChildIndex, lastVisibleChildIndex);
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.p;
            if (i >= arrayList.size()) {
                return;
            }
            c(((Integer) arrayList.get(i)).intValue(), (i == arrayList.size() + (-1) ? getChildCount() : ((Integer) arrayList.get(i + 1)).intValue()) - 1);
            i++;
        }
    }

    public final void c(int i, int i2) {
        float max;
        if (i == i2) {
            ((MaterialButton) getChildAt(i)).setWidthChangeDirection(ev.f);
            return;
        }
        int i3 = Integer.MAX_VALUE;
        int i4 = i;
        while (i4 <= i2) {
            if (i(i4)) {
                ((MaterialButton) getChildAt(i4)).setWidthChangeDirection(i4 == i ? ev.h : i4 == i2 ? ev.g : ev.i);
                if (i(i4) && this.n != null) {
                    MaterialButton materialButton = (MaterialButton) getChildAt(i4);
                    c70 c70Var = this.n;
                    int width = materialButton.getWidth();
                    int i5 = -width;
                    for (int i6 = 0; i6 < c70Var.a; i6++) {
                        b70 b70Var = (b70) c70Var.d[i6].f;
                        int i7 = b70Var.a;
                        float f = b70Var.b;
                        if (i7 == 2) {
                            max = Math.max(i5, f);
                        } else if (i7 == 1) {
                            max = Math.max(i5, width * f);
                        }
                        i5 = (int) max;
                    }
                    int max2 = Math.max(0, i5);
                    MaterialButton h = h(i4);
                    int allowedWidthDecrease = h == null ? 0 : h.getAllowedWidthDecrease();
                    MaterialButton g = g(i4);
                    r4 = Math.min(max2, allowedWidthDecrease + (g != null ? g.getAllowedWidthDecrease() : 0));
                }
                if (i4 != i && i4 != i2) {
                    r4 /= 2;
                }
                i3 = Math.min(i3, r4);
            }
            i4++;
        }
        while (i <= i2) {
            if (i(i)) {
                MaterialButton materialButton2 = (MaterialButton) getChildAt(i);
                materialButton2.setSizeChange(this.n);
                materialButton2.setWidthChangeMax(i3 * 2);
            }
            i++;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof gv;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.i);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.j = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final gv generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        gv gvVar = new gv(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y00.s);
        obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.getText(1);
        obtainStyledAttributes.recycle();
        return gvVar;
    }

    public final MaterialButton g(int i) {
        int childCount = getChildCount();
        int i2 = i + 1;
        while (true) {
            if (i2 >= childCount) {
                i2 = -1;
                break;
            }
            if (i(i2)) {
                break;
            }
            i2++;
        }
        ArrayList arrayList = this.p;
        if (!arrayList.isEmpty()) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                int intValue = ((Integer) arrayList.get(i3)).intValue();
                int intValue2 = i3 == arrayList.size() + (-1) ? childCount - 1 : ((Integer) arrayList.get(i3 + 1)).intValue() - 1;
                if (i >= intValue && i <= intValue2 && (i2 < intValue || i2 > intValue2)) {
                    return null;
                }
                i3++;
            }
        }
        if (i2 == -1) {
            return null;
        }
        return (MaterialButton) getChildAt(i2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new gv(-2, -2);
    }

    public c70 getButtonSizeChange() {
        return this.n;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.j;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i2;
    }

    public ve getInnerCornerSize() {
        return this.k.b;
    }

    public z60 getInnerCornerSizeStateList() {
        return this.k;
    }

    public Drawable getOverflowButtonIcon() {
        throw null;
    }

    public int getOverflowMode() {
        return this.f;
    }

    public f50 getShapeAppearance() {
        a70 a70Var = this.l;
        if (a70Var == null) {
            return null;
        }
        return a70Var.i();
    }

    public int getSpacing() {
        return this.m;
    }

    public a70 getStateListShapeAppearance() {
        return this.l;
    }

    public final MaterialButton h(int i) {
        int childCount = getChildCount();
        int i2 = i - 1;
        while (true) {
            if (i2 < 0) {
                i2 = -1;
                break;
            }
            if (i(i2)) {
                break;
            }
            i2--;
        }
        ArrayList arrayList = this.p;
        if (!arrayList.isEmpty()) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                int intValue = ((Integer) arrayList.get(i3)).intValue();
                int intValue2 = i3 == arrayList.size() + (-1) ? childCount : ((Integer) arrayList.get(i3 + 1)).intValue();
                if (i >= intValue && i < intValue2 && (i2 < intValue || i2 >= intValue2)) {
                    return null;
                }
                i3++;
            }
        }
        if (i2 == -1) {
            return null;
        }
        return (MaterialButton) getChildAt(i2);
    }

    public final boolean i(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void j() {
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            LinearLayout.LayoutParams layoutParams = materialButton.H;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.H = null;
                materialButton.E = -2.1474836E9f;
            }
        }
    }

    public final void k() {
        int i;
        if (!(this.k == null && this.l == null) && this.o) {
            this.o = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i2 = 0;
            while (i2 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i2);
                if (materialButton.getVisibility() != 8) {
                    boolean z = i2 == firstVisibleChildIndex;
                    boolean z2 = i2 == lastVisibleChildIndex;
                    Object obj = this.l;
                    ArrayList arrayList = this.g;
                    if (obj == null || (!z && !z2)) {
                        obj = (d50) arrayList.get(i2);
                    }
                    tq tqVar = !(obj instanceof a70) ? new tq((f50) arrayList.get(i2)) : ((a70) obj).j();
                    boolean z3 = getOrientation() == 0;
                    boolean z4 = getLayoutDirection() == 1;
                    if (z3) {
                        i = z ? 5 : 0;
                        if (z2) {
                            i |= 10;
                        }
                        if (z4) {
                            i = ((i & 5) << 1) | ((i & 10) >> 1);
                        }
                    } else {
                        i = z ? 3 : 0;
                        if (z2) {
                            i |= 12;
                        }
                    }
                    int i3 = ~i;
                    z60 z60Var = this.k;
                    if ((i3 | 1) == i3) {
                        tqVar.f = z60Var;
                    }
                    if ((i3 | 2) == i3) {
                        tqVar.g = z60Var;
                    }
                    if ((i3 | 4) == i3) {
                        tqVar.h = z60Var;
                    }
                    if ((i3 | 8) == i3) {
                        tqVar.i = z60Var;
                    }
                    a70 c = tqVar.c();
                    boolean f = c.f();
                    f50 f50Var = c;
                    if (!f) {
                        f50Var = c.i();
                    }
                    materialButton.setShapeAppearance(f50Var);
                }
                i2++;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            j();
            b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        a();
        if (this.f != 2) {
            i3 = 0;
        } else {
            if (getOrientation() == 1) {
                g9.i("The wrap overflow mode is not compatible to the vertical orientation.");
                return;
            }
            if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
                g9.i("The wrap overflow mode is not compatible with wrap_content layout width.");
                return;
            }
            ArrayList arrayList = this.p;
            arrayList.clear();
            int size = View.MeasureSpec.getSize(i);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                if (i(i7)) {
                    View view = (MaterialButton) getChildAt(i7);
                    measureChild(view, i, i2);
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (measuredWidth > 0) {
                        LinearLayout.LayoutParams d = d(view);
                        if (i4 + measuredWidth + (arrayList2.isEmpty() ? 0 : this.m) > size || arrayList2.isEmpty()) {
                            if (!arrayList2.isEmpty()) {
                                arrayList3.add(Integer.valueOf(i4));
                            }
                            i6 += i5 + (arrayList.isEmpty() ? 0 : this.m);
                            arrayList.add(Integer.valueOf(i7));
                            d.setMarginStart(-i4);
                            arrayList2.clear();
                            i4 = 0;
                            i5 = 0;
                        }
                        i4 += measuredWidth + (i4 == 0 ? 0 : this.m);
                        i5 = Math.max(i5, measuredHeight);
                        arrayList2.add(Integer.valueOf(i7));
                        d.topMargin += i6;
                        view.setLayoutParams(d);
                    }
                }
            }
            arrayList3.add(Integer.valueOf(i4));
            int intValue = ((Integer) Collections.max(arrayList3)).intValue();
            int i8 = 0;
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                int intValue2 = ((Integer) arrayList.get(i9)).intValue();
                int intValue3 = ((Integer) arrayList3.get(i9)).intValue();
                MaterialButton materialButton = (MaterialButton) getChildAt(intValue2);
                LinearLayout.LayoutParams d2 = d(materialButton);
                int i10 = d2.gravity & 8388615;
                int absoluteGravity = Gravity.getAbsoluteGravity(i10, getLayoutDirection());
                int i11 = intValue - intValue3;
                if (i10 != 8388611) {
                    if (absoluteGravity == 1) {
                        i11 /= 2;
                    }
                    d2.setMarginStart((d2.getMarginStart() + i11) - i8);
                    materialButton.setLayoutParams(d2);
                    i8 = i11;
                }
            }
            i3 = getPaddingBottom() + getPaddingTop() + i6 + i5;
        }
        k();
        super.onMeasure(i, i2);
        if (this.f != 2 || i3 == getMeasuredHeight()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), i3);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.g.remove(indexOfChild);
        }
        this.o = true;
        k();
        j();
        a();
    }

    public void setButtonSizeChange(c70 c70Var) {
        if (this.n != c70Var) {
            this.n = c70Var;
            b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z);
        }
    }

    public void setInnerCornerSize(ve veVar) {
        this.k = z60.b(veVar);
        this.o = true;
        k();
        invalidate();
    }

    public void setInnerCornerSizeStateList(z60 z60Var) {
        this.k = z60Var;
        this.o = true;
        k();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.o = true;
        }
        super.setOrientation(i);
    }

    public void setOverflowButtonIcon(Drawable drawable) {
        throw null;
    }

    public void setOverflowButtonIconResource(int i) {
        throw null;
    }

    public void setOverflowMode(int i) {
        if (this.f != i) {
            this.f = i;
            requestLayout();
            invalidate();
        }
    }

    public void setShapeAppearance(f50 f50Var) {
        this.l = new tq(f50Var).c();
        this.o = true;
        k();
        invalidate();
    }

    public void setSpacing(int i) {
        this.m = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(a70 a70Var) {
        this.l = a70Var;
        this.o = true;
        k();
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return f(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new gv(-2, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return f(layoutParams);
    }
}
