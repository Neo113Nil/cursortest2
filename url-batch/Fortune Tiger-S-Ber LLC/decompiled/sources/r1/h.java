package r1;

import a2.p;
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
import c3.l;
import com.gglhk.bofio.fortunetiger.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import g2.a0;
import g2.b0;
import g2.c0;
import g2.d0;
import g2.m;
import g2.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class h extends LinearLayout {

    /* renamed from: q, reason: collision with root package name */
    public static final Object f3179q = null;

    /* renamed from: f, reason: collision with root package name */
    public int f3180f;
    public final ArrayList g;
    public final r0.a h;

    /* renamed from: i, reason: collision with root package name */
    public final f f3181i;

    /* renamed from: j, reason: collision with root package name */
    public Integer[] f3182j;

    /* renamed from: k, reason: collision with root package name */
    public a0 f3183k;

    /* renamed from: l, reason: collision with root package name */
    public b0 f3184l;

    /* renamed from: m, reason: collision with root package name */
    public int f3185m;

    /* renamed from: n, reason: collision with root package name */
    public d0 f3186n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3187o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f3188p;

    /* JADX WARN: Type inference failed for: r0v3, types: [r1.f] */
    public h(Context context, AttributeSet attributeSet) {
        super(l2.a.b(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        a0 b2;
        XmlResourceParser xml;
        int next;
        int next2;
        this.f3180f = 0;
        this.g = new ArrayList();
        final MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.h = new r0.a(materialButtonToggleGroup);
        this.f3181i = new Comparator() { // from class: r1.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int compareTo = Boolean.valueOf(materialButton.f1244z).compareTo(Boolean.valueOf(materialButton2.f1244z));
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
        this.f3187o = true;
        new HashMap();
        new HashMap();
        new ArrayList();
        new ArrayList();
        this.f3188p = new ArrayList();
        Context context2 = getContext();
        TypedArray e4 = p.e(context2, attributeSet, l1.a.f2866l, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (e4.hasValue(2)) {
            int resourceId = e4.getResourceId(2, 0);
            d0 d0Var = null;
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                    try {
                        d0 d0Var2 = new d0();
                        d0Var2.c = new int[10][];
                        d0Var2.f1840d = new a2.e[10];
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
                            d0Var2.a(context2, xml, asAttributeSet, context2.getTheme());
                        }
                        xml.close();
                        d0Var = d0Var2;
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                }
            }
            this.f3186n = d0Var;
        }
        if (e4.hasValue(6)) {
            b0 g = b0.g(context2, e4, 6);
            this.f3184l = g;
            if (g == null) {
                int resourceId2 = e4.getResourceId(6, 0);
                int resourceId3 = e4.getResourceId(7, 0);
                g2.a aVar = new g2.a(0);
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context2, resourceId2);
                if (resourceId3 != 0) {
                    contextThemeWrapper.getTheme().applyStyle(resourceId3, true);
                }
                this.f3184l = new l(o.g(contextThemeWrapper.obtainStyledAttributes(l1.a.A), aVar).a()).c();
            }
        }
        if (e4.hasValue(3)) {
            g2.a aVar2 = new g2.a(0.0f);
            int resourceId4 = e4.getResourceId(3, 0);
            if (resourceId4 == 0) {
                b2 = a0.b(o.h(e4, 3, aVar2));
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
                b2 = a0.b(o.h(e4, 3, aVar2));
            }
            this.f3183k = b2;
        }
        this.f3185m = e4.getDimensionPixelSize(1, 0);
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
        for (int i4 = 0; i4 < childCount; i4++) {
            if (i(i4)) {
                return i4;
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
        int i4;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i5 = firstVisibleChildIndex + 1; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            View childAt2 = getChildAt(i5 - 1);
            if ((childAt instanceof MaterialButton) && (childAt2 instanceof MaterialButton)) {
                MaterialButton materialButton = (MaterialButton) childAt;
                MaterialButton materialButton2 = (MaterialButton) childAt2;
                if (this.f3185m <= 0) {
                    i4 = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                    materialButton.setShouldDrawSurfaceColorStroke(true);
                    materialButton2.setShouldDrawSurfaceColorStroke(true);
                    LinearLayout.LayoutParams d4 = d(childAt);
                    if (getOrientation() != 0) {
                        d4.setMarginEnd(0);
                        d4.setMarginStart(this.f3185m - i4);
                        d4.topMargin = 0;
                    } else {
                        d4.bottomMargin = 0;
                        d4.topMargin = this.f3185m - i4;
                        d4.setMarginStart(0);
                    }
                    childAt.setLayoutParams(d4);
                } else {
                    materialButton.setShouldDrawSurfaceColorStroke(false);
                    materialButton2.setShouldDrawSurfaceColorStroke(false);
                }
            }
            i4 = 0;
            LinearLayout.LayoutParams d42 = d(childAt);
            if (getOrientation() != 0) {
            }
            childAt.setLayoutParams(d42);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams d5 = d((MaterialButton) getChildAt(firstVisibleChildIndex));
        if (getOrientation() == 1) {
            d5.topMargin = 0;
            d5.bottomMargin = 0;
        } else {
            d5.setMarginEnd(0);
            d5.setMarginStart(0);
            d5.leftMargin = 0;
            d5.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        j();
        this.f3187o = true;
        int indexOfChild = indexOfChild(null);
        if (indexOfChild < 0 || i4 != -1) {
            super.addView(view, i4, layoutParams);
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
        if (firstVisibleChildIndex == -1 || this.f3186n == null) {
            return;
        }
        if (this.f3180f != 2) {
            c(firstVisibleChildIndex, lastVisibleChildIndex);
            return;
        }
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f3188p;
            if (i4 >= arrayList.size()) {
                return;
            }
            c(((Integer) arrayList.get(i4)).intValue(), (i4 == arrayList.size() + (-1) ? getChildCount() : ((Integer) arrayList.get(i4 + 1)).intValue()) - 1);
            i4++;
        }
    }

    public final void c(int i4, int i5) {
        float max;
        if (i4 == i5) {
            ((MaterialButton) getChildAt(i4)).setWidthChangeDirection(e.f3175f);
            return;
        }
        int i6 = Integer.MAX_VALUE;
        int i7 = i4;
        while (i7 <= i5) {
            if (i(i7)) {
                ((MaterialButton) getChildAt(i7)).setWidthChangeDirection(i7 == i4 ? e.h : i7 == i5 ? e.g : e.f3176i);
                if (i(i7) && this.f3186n != null) {
                    MaterialButton materialButton = (MaterialButton) getChildAt(i7);
                    d0 d0Var = this.f3186n;
                    int width = materialButton.getWidth();
                    int i8 = -width;
                    for (int i9 = 0; i9 < d0Var.f1838a; i9++) {
                        c0 c0Var = (c0) d0Var.f1840d[i9].g;
                        int i10 = c0Var.f1836a;
                        float f4 = c0Var.f1837b;
                        if (i10 == 2) {
                            max = Math.max(i8, f4);
                        } else if (i10 == 1) {
                            max = Math.max(i8, width * f4);
                        }
                        i8 = (int) max;
                    }
                    int max2 = Math.max(0, i8);
                    MaterialButton h = h(i7);
                    int allowedWidthDecrease = h == null ? 0 : h.getAllowedWidthDecrease();
                    MaterialButton g = g(i7);
                    r4 = Math.min(max2, allowedWidthDecrease + (g != null ? g.getAllowedWidthDecrease() : 0));
                }
                if (i7 != i4 && i7 != i5) {
                    r4 /= 2;
                }
                i6 = Math.min(i6, r4);
            }
            i7++;
        }
        while (i4 <= i5) {
            if (i(i4)) {
                MaterialButton materialButton2 = (MaterialButton) getChildAt(i4);
                materialButton2.setSizeChange(this.f3186n);
                materialButton2.setWidthChangeMax(i6 * 2);
            }
            i4++;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f3181i);
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            treeMap.put((MaterialButton) getChildAt(i4), Integer.valueOf(i4));
        }
        this.f3182j = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final g generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        g gVar = new g(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l1.a.f2867m);
        obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.getText(1);
        obtainStyledAttributes.recycle();
        return gVar;
    }

    public final MaterialButton g(int i4) {
        int childCount = getChildCount();
        int i5 = i4 + 1;
        while (true) {
            if (i5 >= childCount) {
                i5 = -1;
                break;
            }
            if (i(i5)) {
                break;
            }
            i5++;
        }
        ArrayList arrayList = this.f3188p;
        if (!arrayList.isEmpty()) {
            int i6 = 0;
            while (i6 < arrayList.size()) {
                int intValue = ((Integer) arrayList.get(i6)).intValue();
                int intValue2 = i6 == arrayList.size() + (-1) ? childCount - 1 : ((Integer) arrayList.get(i6 + 1)).intValue() - 1;
                if (i4 >= intValue && i4 <= intValue2 && (i5 < intValue || i5 > intValue2)) {
                    return null;
                }
                i6++;
            }
        }
        if (i5 == -1) {
            return null;
        }
        return (MaterialButton) getChildAt(i5);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    public d0 getButtonSizeChange() {
        return this.f3186n;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i4, int i5) {
        Integer[] numArr = this.f3182j;
        if (numArr != null && i5 < numArr.length) {
            return numArr[i5].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i5;
    }

    public g2.d getInnerCornerSize() {
        return this.f3183k.f1826b;
    }

    public a0 getInnerCornerSizeStateList() {
        return this.f3183k;
    }

    public Drawable getOverflowButtonIcon() {
        throw null;
    }

    public int getOverflowMode() {
        return this.f3180f;
    }

    public o getShapeAppearance() {
        b0 b0Var = this.f3184l;
        if (b0Var == null) {
            return null;
        }
        return b0Var.h();
    }

    public int getSpacing() {
        return this.f3185m;
    }

    public b0 getStateListShapeAppearance() {
        return this.f3184l;
    }

    public final MaterialButton h(int i4) {
        int childCount = getChildCount();
        int i5 = i4 - 1;
        while (true) {
            if (i5 < 0) {
                i5 = -1;
                break;
            }
            if (i(i5)) {
                break;
            }
            i5--;
        }
        ArrayList arrayList = this.f3188p;
        if (!arrayList.isEmpty()) {
            int i6 = 0;
            while (i6 < arrayList.size()) {
                int intValue = ((Integer) arrayList.get(i6)).intValue();
                int intValue2 = i6 == arrayList.size() + (-1) ? childCount : ((Integer) arrayList.get(i6 + 1)).intValue();
                if (i4 >= intValue && i4 < intValue2 && (i5 < intValue || i5 >= intValue2)) {
                    return null;
                }
                i6++;
            }
        }
        if (i5 == -1) {
            return null;
        }
        return (MaterialButton) getChildAt(i5);
    }

    public final boolean i(int i4) {
        return getChildAt(i4).getVisibility() != 8;
    }

    public final void j() {
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i4);
            LinearLayout.LayoutParams layoutParams = materialButton.H;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.H = null;
                materialButton.E = -2.1474836E9f;
            }
        }
    }

    public final void k() {
        int i4;
        if (!(this.f3183k == null && this.f3184l == null) && this.f3187o) {
            this.f3187o = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i5 = 0;
            while (i5 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i5);
                if (materialButton.getVisibility() != 8) {
                    boolean z3 = i5 == firstVisibleChildIndex;
                    boolean z4 = i5 == lastVisibleChildIndex;
                    m mVar = this.f3184l;
                    ArrayList arrayList = this.g;
                    if (mVar == null || (!z3 && !z4)) {
                        mVar = (m) arrayList.get(i5);
                    }
                    l lVar = !(mVar instanceof b0) ? new l((o) arrayList.get(i5)) : ((b0) mVar).i();
                    boolean z5 = getOrientation() == 0;
                    boolean z6 = getLayoutDirection() == 1;
                    if (z5) {
                        i4 = z3 ? 5 : 0;
                        if (z4) {
                            i4 |= 10;
                        }
                        if (z6) {
                            i4 = ((i4 & 5) << 1) | ((i4 & 10) >> 1);
                        }
                    } else {
                        i4 = z3 ? 3 : 0;
                        if (z4) {
                            i4 |= 12;
                        }
                    }
                    int i6 = ~i4;
                    a0 a0Var = this.f3183k;
                    if ((i6 | 1) == i6) {
                        lVar.f1073f = a0Var;
                    }
                    if ((i6 | 2) == i6) {
                        lVar.g = a0Var;
                    }
                    if ((i6 | 4) == i6) {
                        lVar.h = a0Var;
                    }
                    if ((i6 | 8) == i6) {
                        lVar.f1074i = a0Var;
                    }
                    b0 c = lVar.c();
                    boolean e4 = c.e();
                    o oVar = c;
                    if (!e4) {
                        oVar = c.h();
                    }
                    materialButton.setShapeAppearance(oVar);
                }
                i5++;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        if (z3) {
            j();
            b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        a();
        if (this.f3180f != 2) {
            i6 = 0;
        } else {
            if (getOrientation() == 1) {
                throw new IllegalArgumentException("The wrap overflow mode is not compatible to the vertical orientation.");
            }
            if (View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE) {
                throw new IllegalArgumentException("The wrap overflow mode is not compatible with wrap_content layout width.");
            }
            ArrayList arrayList = this.f3188p;
            arrayList.clear();
            int size = View.MeasureSpec.getSize(i4);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                if (i(i10)) {
                    View view = (MaterialButton) getChildAt(i10);
                    measureChild(view, i4, i5);
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (measuredWidth > 0) {
                        LinearLayout.LayoutParams d4 = d(view);
                        if (i7 + measuredWidth + (arrayList2.isEmpty() ? 0 : this.f3185m) > size || arrayList2.isEmpty()) {
                            if (!arrayList2.isEmpty()) {
                                arrayList3.add(Integer.valueOf(i7));
                            }
                            i9 += i8 + (arrayList.isEmpty() ? 0 : this.f3185m);
                            arrayList.add(Integer.valueOf(i10));
                            d4.setMarginStart(-i7);
                            arrayList2.clear();
                            i7 = 0;
                            i8 = 0;
                        }
                        i7 += measuredWidth + (i7 == 0 ? 0 : this.f3185m);
                        i8 = Math.max(i8, measuredHeight);
                        arrayList2.add(Integer.valueOf(i10));
                        d4.topMargin += i9;
                        view.setLayoutParams(d4);
                    }
                }
            }
            arrayList3.add(Integer.valueOf(i7));
            int intValue = ((Integer) Collections.max(arrayList3)).intValue();
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                int intValue2 = ((Integer) arrayList.get(i12)).intValue();
                int intValue3 = ((Integer) arrayList3.get(i12)).intValue();
                MaterialButton materialButton = (MaterialButton) getChildAt(intValue2);
                LinearLayout.LayoutParams d5 = d(materialButton);
                int i13 = d5.gravity & 8388615;
                int absoluteGravity = Gravity.getAbsoluteGravity(i13, getLayoutDirection());
                int i14 = intValue - intValue3;
                if (i13 != 8388611) {
                    if (absoluteGravity == 1) {
                        i14 /= 2;
                    }
                    d5.setMarginStart((d5.getMarginStart() + i14) - i11);
                    materialButton.setLayoutParams(d5);
                    i11 = i14;
                }
            }
            i6 = getPaddingBottom() + getPaddingTop() + i9 + i8;
        }
        k();
        super.onMeasure(i4, i5);
        if (this.f3180f != 2 || i6 == getMeasuredHeight()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), i6);
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
        this.f3187o = true;
        k();
        j();
        a();
    }

    public void setButtonSizeChange(d0 d0Var) {
        if (this.f3186n != d0Var) {
            this.f3186n = d0Var;
            b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            ((MaterialButton) getChildAt(i4)).setEnabled(z3);
        }
    }

    public void setInnerCornerSize(g2.d dVar) {
        this.f3183k = a0.b(dVar);
        this.f3187o = true;
        k();
        invalidate();
    }

    public void setInnerCornerSizeStateList(a0 a0Var) {
        this.f3183k = a0Var;
        this.f3187o = true;
        k();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i4) {
        if (getOrientation() != i4) {
            this.f3187o = true;
        }
        super.setOrientation(i4);
    }

    public void setOverflowButtonIcon(Drawable drawable) {
        throw null;
    }

    public void setOverflowButtonIconResource(int i4) {
        throw null;
    }

    public void setOverflowMode(int i4) {
        if (this.f3180f != i4) {
            this.f3180f = i4;
            requestLayout();
            invalidate();
        }
    }

    public void setShapeAppearance(o oVar) {
        this.f3184l = new l(oVar).c();
        this.f3187o = true;
        k();
        invalidate();
    }

    public void setSpacing(int i4) {
        this.f3185m = i4;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(b0 b0Var) {
        this.f3184l = b0Var;
        this.f3187o = true;
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
