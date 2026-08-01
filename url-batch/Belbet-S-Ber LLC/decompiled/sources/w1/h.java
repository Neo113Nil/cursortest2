package w1;

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
import com.gdmhkmf.belbet.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import i2.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;
import o2.a0;
import o2.b0;
import o2.c0;
import o2.d0;
import o2.e0;
import o2.m;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class h extends LinearLayout {

    /* renamed from: q, reason: collision with root package name */
    public static final Object f3785q = null;

    /* renamed from: f, reason: collision with root package name */
    public int f3786f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3787g;
    public final q3.a h;
    public final f i;

    /* renamed from: j, reason: collision with root package name */
    public Integer[] f3788j;

    /* renamed from: k, reason: collision with root package name */
    public a0 f3789k;

    /* renamed from: l, reason: collision with root package name */
    public c0 f3790l;

    /* renamed from: m, reason: collision with root package name */
    public int f3791m;

    /* renamed from: n, reason: collision with root package name */
    public e0 f3792n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3793o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f3794p;

    /* JADX WARN: Type inference failed for: r0v3, types: [w1.f] */
    public h(Context context, AttributeSet attributeSet) {
        super(u2.a.b(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        a0 b2;
        XmlResourceParser xml;
        int next;
        int next2;
        this.f3786f = 0;
        this.f3787g = new ArrayList();
        final MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.h = new q3.a(materialButtonToggleGroup);
        this.i = new Comparator() { // from class: w1.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int compareTo = Boolean.valueOf(materialButton.f981z).compareTo(Boolean.valueOf(materialButton2.f981z));
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
        this.f3793o = true;
        new HashMap();
        new HashMap();
        new ArrayList();
        new ArrayList();
        this.f3794p = new ArrayList();
        Context context2 = getContext();
        TypedArray e4 = o.e(context2, attributeSet, q1.a.f3152p, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (e4.hasValue(2)) {
            int resourceId = e4.getResourceId(2, 0);
            e0 e0Var = null;
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                    try {
                        e0 e0Var2 = new e0();
                        e0Var2.f2937c = new int[10][];
                        e0Var2.d = new a0.a[10];
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
                            e0Var2.a(context2, xml, asAttributeSet, context2.getTheme());
                        }
                        xml.close();
                        e0Var = e0Var2;
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                }
            }
            this.f3792n = e0Var;
        }
        if (e4.hasValue(6)) {
            c0 h = c0.h(context2, e4, 6);
            this.f3790l = h;
            if (h == null) {
                int resourceId2 = e4.getResourceId(6, 0);
                int resourceId3 = e4.getResourceId(7, 0);
                o2.a aVar = new o2.a(0);
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context2, resourceId2);
                if (resourceId3 != 0) {
                    contextThemeWrapper.getTheme().applyStyle(resourceId3, true);
                }
                this.f3790l = new b0(o2.o.h(contextThemeWrapper.obtainStyledAttributes(q1.a.F), aVar).a()).b();
            }
        }
        if (e4.hasValue(3)) {
            o2.a aVar2 = new o2.a(0.0f);
            int resourceId4 = e4.getResourceId(3, 0);
            if (resourceId4 == 0) {
                b2 = a0.b(o2.o.i(e4, 3, aVar2));
            } else if (context2.getResources().getResourceTypeName(resourceId4).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId4);
                    try {
                        b2 = new a0();
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
                            b2.d(context2, xml, asAttributeSet2, context2.getTheme());
                        }
                        xml.close();
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    b2 = a0.b(aVar2);
                }
            } else {
                b2 = a0.b(o2.o.i(e4, 3, aVar2));
            }
            this.f3789k = b2;
        }
        this.f3791m = e4.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(e4.getBoolean(0, true));
        setOverflowMode(e4.getInt(5, 0));
        getResources().getDimensionPixelOffset(R.dimen.m3_btn_group_overflow_item_icon_horizontal_padding);
        e4.recycle();
    }

    public static LinearLayout.LayoutParams d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new g(layoutParams.width, layoutParams.height);
    }

    public static g f(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new g((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
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
        for (int i4 = firstVisibleChildIndex + 1; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            View childAt2 = getChildAt(i4 - 1);
            if ((childAt instanceof MaterialButton) && (childAt2 instanceof MaterialButton)) {
                MaterialButton materialButton = (MaterialButton) childAt;
                MaterialButton materialButton2 = (MaterialButton) childAt2;
                if (this.f3791m <= 0) {
                    i = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                    materialButton.setShouldDrawSurfaceColorStroke(true);
                    materialButton2.setShouldDrawSurfaceColorStroke(true);
                    LinearLayout.LayoutParams d = d(childAt);
                    if (getOrientation() != 0) {
                        d.setMarginEnd(0);
                        d.setMarginStart(this.f3791m - i);
                        d.topMargin = 0;
                    } else {
                        d.bottomMargin = 0;
                        d.topMargin = this.f3791m - i;
                        d.setMarginStart(0);
                    }
                    childAt.setLayoutParams(d);
                } else {
                    materialButton.setShouldDrawSurfaceColorStroke(false);
                    materialButton2.setShouldDrawSurfaceColorStroke(false);
                }
            }
            i = 0;
            LinearLayout.LayoutParams d5 = d(childAt);
            if (getOrientation() != 0) {
            }
            childAt.setLayoutParams(d5);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams d6 = d((MaterialButton) getChildAt(firstVisibleChildIndex));
        if (getOrientation() == 1) {
            d6.topMargin = 0;
            d6.bottomMargin = 0;
        } else {
            d6.setMarginEnd(0);
            d6.setMarginStart(0);
            d6.leftMargin = 0;
            d6.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        j();
        this.f3793o = true;
        int indexOfChild = indexOfChild(null);
        if (indexOfChild < 0 || i != -1) {
            super.addView(view, i, layoutParams);
        } else {
            super.addView(view, indexOfChild, layoutParams);
        }
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.h);
        this.f3787g.add(materialButton.getShapeAppearance());
        materialButton.setEnabled(isEnabled());
    }

    public final void b() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        if (firstVisibleChildIndex == -1 || this.f3792n == null) {
            return;
        }
        if (this.f3786f != 2) {
            c(firstVisibleChildIndex, lastVisibleChildIndex);
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3794p;
            if (i >= arrayList.size()) {
                return;
            }
            c(((Integer) arrayList.get(i)).intValue(), (i == arrayList.size() + (-1) ? getChildCount() : ((Integer) arrayList.get(i + 1)).intValue()) - 1);
            i++;
        }
    }

    public final void c(int i, int i4) {
        float max;
        if (i == i4) {
            ((MaterialButton) getChildAt(i)).setWidthChangeDirection(e.f3781f);
            return;
        }
        int i5 = Integer.MAX_VALUE;
        int i6 = i;
        while (i6 <= i4) {
            if (i(i6)) {
                ((MaterialButton) getChildAt(i6)).setWidthChangeDirection(i6 == i ? e.h : i6 == i4 ? e.f3782g : e.i);
                if (i(i6) && this.f3792n != null) {
                    MaterialButton materialButton = (MaterialButton) getChildAt(i6);
                    e0 e0Var = this.f3792n;
                    int width = materialButton.getWidth();
                    int i7 = -width;
                    for (int i8 = 0; i8 < e0Var.f2935a; i8++) {
                        d0 d0Var = (d0) e0Var.d[i8].f79g;
                        int i9 = d0Var.f2933a;
                        float f5 = d0Var.f2934b;
                        if (i9 == 2) {
                            max = Math.max(i7, f5);
                        } else if (i9 == 1) {
                            max = Math.max(i7, width * f5);
                        }
                        i7 = (int) max;
                    }
                    int max2 = Math.max(0, i7);
                    MaterialButton h = h(i6);
                    int allowedWidthDecrease = h == null ? 0 : h.getAllowedWidthDecrease();
                    MaterialButton g3 = g(i6);
                    r4 = Math.min(max2, allowedWidthDecrease + (g3 != null ? g3.getAllowedWidthDecrease() : 0));
                }
                if (i6 != i && i6 != i4) {
                    r4 /= 2;
                }
                i5 = Math.min(i5, r4);
            }
            i6++;
        }
        while (i <= i4) {
            if (i(i)) {
                MaterialButton materialButton2 = (MaterialButton) getChildAt(i);
                materialButton2.setSizeChange(this.f3792n);
                materialButton2.setWidthChangeMax(i5 * 2);
            }
            i++;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.i);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.f3788j = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final g generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        g gVar = new g(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q1.a.f3153q);
        obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.getText(1);
        obtainStyledAttributes.recycle();
        return gVar;
    }

    public final MaterialButton g(int i) {
        int childCount = getChildCount();
        int i4 = i + 1;
        while (true) {
            if (i4 >= childCount) {
                i4 = -1;
                break;
            }
            if (i(i4)) {
                break;
            }
            i4++;
        }
        ArrayList arrayList = this.f3794p;
        if (!arrayList.isEmpty()) {
            int i5 = 0;
            while (i5 < arrayList.size()) {
                int intValue = ((Integer) arrayList.get(i5)).intValue();
                int intValue2 = i5 == arrayList.size() + (-1) ? childCount - 1 : ((Integer) arrayList.get(i5 + 1)).intValue() - 1;
                if (i >= intValue && i <= intValue2 && (i4 < intValue || i4 > intValue2)) {
                    return null;
                }
                i5++;
            }
        }
        if (i4 == -1) {
            return null;
        }
        return (MaterialButton) getChildAt(i4);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    public e0 getButtonSizeChange() {
        return this.f3792n;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i4) {
        Integer[] numArr = this.f3788j;
        if (numArr != null && i4 < numArr.length) {
            return numArr[i4].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i4;
    }

    public o2.d getInnerCornerSize() {
        return this.f3789k.f2916b;
    }

    public a0 getInnerCornerSizeStateList() {
        return this.f3789k;
    }

    public Drawable getOverflowButtonIcon() {
        throw null;
    }

    public int getOverflowMode() {
        return this.f3786f;
    }

    public o2.o getShapeAppearance() {
        c0 c0Var = this.f3790l;
        if (c0Var == null) {
            return null;
        }
        return c0Var.i();
    }

    public int getSpacing() {
        return this.f3791m;
    }

    public c0 getStateListShapeAppearance() {
        return this.f3790l;
    }

    public final MaterialButton h(int i) {
        int childCount = getChildCount();
        int i4 = i - 1;
        while (true) {
            if (i4 < 0) {
                i4 = -1;
                break;
            }
            if (i(i4)) {
                break;
            }
            i4--;
        }
        ArrayList arrayList = this.f3794p;
        if (!arrayList.isEmpty()) {
            int i5 = 0;
            while (i5 < arrayList.size()) {
                int intValue = ((Integer) arrayList.get(i5)).intValue();
                int intValue2 = i5 == arrayList.size() + (-1) ? childCount : ((Integer) arrayList.get(i5 + 1)).intValue();
                if (i >= intValue && i < intValue2 && (i4 < intValue || i4 >= intValue2)) {
                    return null;
                }
                i5++;
            }
        }
        if (i4 == -1) {
            return null;
        }
        return (MaterialButton) getChildAt(i4);
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
        if (!(this.f3789k == null && this.f3790l == null) && this.f3793o) {
            this.f3793o = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i4 = 0;
            while (i4 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i4);
                if (materialButton.getVisibility() != 8) {
                    boolean z4 = i4 == firstVisibleChildIndex;
                    boolean z5 = i4 == lastVisibleChildIndex;
                    m mVar = this.f3790l;
                    ArrayList arrayList = this.f3787g;
                    if (mVar == null || (!z4 && !z5)) {
                        mVar = (m) arrayList.get(i4);
                    }
                    b0 b0Var = !(mVar instanceof c0) ? new b0((o2.o) arrayList.get(i4)) : ((c0) mVar).j();
                    boolean z6 = getOrientation() == 0;
                    boolean z7 = getLayoutDirection() == 1;
                    if (z6) {
                        i = z4 ? 5 : 0;
                        if (z5) {
                            i |= 10;
                        }
                        if (z7) {
                            i = ((i & 5) << 1) | ((i & 10) >> 1);
                        }
                    } else {
                        i = z4 ? 3 : 0;
                        if (z5) {
                            i |= 12;
                        }
                    }
                    int i5 = ~i;
                    a0 a0Var = this.f3789k;
                    if ((i5 | 1) == i5) {
                        b0Var.f2924f = a0Var;
                    }
                    if ((i5 | 2) == i5) {
                        b0Var.f2925g = a0Var;
                    }
                    if ((i5 | 4) == i5) {
                        b0Var.h = a0Var;
                    }
                    if ((i5 | 8) == i5) {
                        b0Var.i = a0Var;
                    }
                    c0 b2 = b0Var.b();
                    boolean f5 = b2.f();
                    o2.o oVar = b2;
                    if (!f5) {
                        oVar = b2.i();
                    }
                    materialButton.setShapeAppearance(oVar);
                }
                i4++;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i4, int i5, int i6) {
        super.onLayout(z4, i, i4, i5, i6);
        if (z4) {
            j();
            b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        int i5;
        a();
        if (this.f3786f != 2) {
            i5 = 0;
        } else {
            if (getOrientation() == 1) {
                throw new IllegalArgumentException("The wrap overflow mode is not compatible to the vertical orientation.");
            }
            if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
                throw new IllegalArgumentException("The wrap overflow mode is not compatible with wrap_content layout width.");
            }
            ArrayList arrayList = this.f3794p;
            arrayList.clear();
            int size = View.MeasureSpec.getSize(i);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < getChildCount(); i9++) {
                if (i(i9)) {
                    View view = (MaterialButton) getChildAt(i9);
                    measureChild(view, i, i4);
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (measuredWidth > 0) {
                        LinearLayout.LayoutParams d = d(view);
                        if (i6 + measuredWidth + (arrayList2.isEmpty() ? 0 : this.f3791m) > size || arrayList2.isEmpty()) {
                            if (!arrayList2.isEmpty()) {
                                arrayList3.add(Integer.valueOf(i6));
                            }
                            i8 += i7 + (arrayList.isEmpty() ? 0 : this.f3791m);
                            arrayList.add(Integer.valueOf(i9));
                            d.setMarginStart(-i6);
                            arrayList2.clear();
                            i6 = 0;
                            i7 = 0;
                        }
                        i6 += measuredWidth + (i6 == 0 ? 0 : this.f3791m);
                        i7 = Math.max(i7, measuredHeight);
                        arrayList2.add(Integer.valueOf(i9));
                        d.topMargin += i8;
                        view.setLayoutParams(d);
                    }
                }
            }
            arrayList3.add(Integer.valueOf(i6));
            int intValue = ((Integer) Collections.max(arrayList3)).intValue();
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                int intValue2 = ((Integer) arrayList.get(i11)).intValue();
                int intValue3 = ((Integer) arrayList3.get(i11)).intValue();
                MaterialButton materialButton = (MaterialButton) getChildAt(intValue2);
                LinearLayout.LayoutParams d5 = d(materialButton);
                int i12 = d5.gravity & 8388615;
                int absoluteGravity = Gravity.getAbsoluteGravity(i12, getLayoutDirection());
                int i13 = intValue - intValue3;
                if (i12 != 8388611) {
                    if (absoluteGravity == 1) {
                        i13 /= 2;
                    }
                    d5.setMarginStart((d5.getMarginStart() + i13) - i10);
                    materialButton.setLayoutParams(d5);
                    i10 = i13;
                }
            }
            i5 = getPaddingBottom() + getPaddingTop() + i8 + i7;
        }
        k();
        super.onMeasure(i, i4);
        if (this.f3786f != 2 || i5 == getMeasuredHeight()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), i5);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f3787g.remove(indexOfChild);
        }
        this.f3793o = true;
        k();
        j();
        a();
    }

    public void setButtonSizeChange(e0 e0Var) {
        if (this.f3792n != e0Var) {
            this.f3792n = e0Var;
            b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z4);
        }
    }

    public void setInnerCornerSize(o2.d dVar) {
        this.f3789k = a0.b(dVar);
        this.f3793o = true;
        k();
        invalidate();
    }

    public void setInnerCornerSizeStateList(a0 a0Var) {
        this.f3789k = a0Var;
        this.f3793o = true;
        k();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.f3793o = true;
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
        if (this.f3786f != i) {
            this.f3786f = i;
            requestLayout();
            invalidate();
        }
    }

    public void setShapeAppearance(o2.o oVar) {
        this.f3790l = new b0(oVar).b();
        this.f3793o = true;
        k();
        invalidate();
    }

    public void setSpacing(int i) {
        this.f3791m = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(c0 c0Var) {
        this.f3790l = c0Var;
        this.f3793o = true;
        k();
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return f(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return f(layoutParams);
    }
}
