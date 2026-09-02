package v1;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.oriondriftchasers.arordrft.R;
import e2.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;
import l2.a0;
import l2.b0;
import l2.c0;
import l2.d0;
import l2.n;
import l2.z;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class e extends LinearLayout {

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3476f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3477g;

    /* renamed from: h, reason: collision with root package name */
    public final u2.a f3478h;
    public final d i;

    /* renamed from: j, reason: collision with root package name */
    public Integer[] f3479j;

    /* renamed from: k, reason: collision with root package name */
    public z f3480k;

    /* renamed from: l, reason: collision with root package name */
    public b0 f3481l;

    /* renamed from: m, reason: collision with root package name */
    public int f3482m;

    /* renamed from: n, reason: collision with root package name */
    public d0 f3483n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3484o;

    /* JADX WARN: Type inference failed for: r12v5, types: [v1.d] */
    public e(Context context, AttributeSet attributeSet) {
        super(q2.a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        z b4;
        XmlResourceParser xml;
        int next;
        d0 d0Var;
        int next2;
        this.f3476f = new ArrayList();
        this.f3477g = new ArrayList();
        final MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.f3478h = new u2.a(materialButtonToggleGroup);
        this.i = new Comparator() { // from class: v1.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int compareTo = Boolean.valueOf(materialButton.f858t).compareTo(Boolean.valueOf(materialButton2.f858t));
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
        this.f3484o = true;
        Context context2 = getContext();
        TypedArray f2 = o.f(context2, attributeSet, n1.a.f2820m, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (f2.hasValue(2)) {
            int resourceId = f2.getResourceId(2, 0);
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                }
                try {
                    d0Var = new d0();
                    d0Var.f2577c = new int[10][];
                    d0Var.d = new a0.a[10];
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
                        d0Var.a(context2, xml, asAttributeSet, context2.getTheme());
                    }
                    xml.close();
                    this.f3483n = d0Var;
                } finally {
                }
            }
            d0Var = null;
            this.f3483n = d0Var;
        }
        if (f2.hasValue(4)) {
            b0 b5 = b0.b(context2, f2, 4);
            this.f3481l = b5;
            if (b5 == null) {
                a0 a0Var = new a0(n.a(context2, f2.getResourceId(4, 0), f2.getResourceId(5, 0)).a());
                this.f3481l = a0Var.f2556a != 0 ? new b0(a0Var) : null;
            }
        }
        if (f2.hasValue(3)) {
            l2.a aVar = new l2.a(0.0f);
            int resourceId2 = f2.getResourceId(3, 0);
            if (resourceId2 == 0) {
                b4 = z.b(n.d(f2, 3, aVar));
            } else if (context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId2);
                    try {
                        b4 = new z();
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
                            b4.d(context2, xml, asAttributeSet2, context2.getTheme());
                        }
                        xml.close();
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    b4 = z.b(aVar);
                }
            } else {
                b4 = z.b(n.d(f2, 3, aVar));
            }
            this.f3480k = b4;
        }
        this.f3482m = f2.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(f2.getBoolean(0, true));
        f2.recycle();
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
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

    public final void a() {
        int i;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i4 = firstVisibleChildIndex + 1; i4 < getChildCount(); i4++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i4);
            MaterialButton materialButton2 = (MaterialButton) getChildAt(i4 - 1);
            if (this.f3482m <= 0) {
                i = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                materialButton.setShouldDrawSurfaceColorStroke(true);
                materialButton2.setShouldDrawSurfaceColorStroke(true);
            } else {
                materialButton.setShouldDrawSurfaceColorStroke(false);
                materialButton2.setShouldDrawSurfaceColorStroke(false);
                i = 0;
            }
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(this.f3482m - i);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = this.f3482m - i;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        d();
        this.f3484o = true;
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.f3478h);
        this.f3476f.add(materialButton.getShapeAppearanceModel());
        this.f3477g.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    public final void b() {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        float max;
        if (this.f3483n == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int i = Integer.MAX_VALUE;
        for (int i4 = firstVisibleChildIndex; i4 <= lastVisibleChildIndex; i4++) {
            if (c(i4)) {
                if (c(i4) && this.f3483n != null) {
                    MaterialButton materialButton3 = (MaterialButton) getChildAt(i4);
                    d0 d0Var = this.f3483n;
                    int width = materialButton3.getWidth();
                    int i5 = -width;
                    for (int i6 = 0; i6 < d0Var.f2575a; i6++) {
                        c0 c0Var = (c0) d0Var.d[i6].f81g;
                        int i7 = c0Var.f2573a;
                        float f2 = c0Var.f2574b;
                        if (i7 == 2) {
                            max = Math.max(i5, f2);
                        } else if (i7 == 1) {
                            max = Math.max(i5, width * f2);
                        }
                        i5 = (int) max;
                    }
                    int max2 = Math.max(0, i5);
                    int i8 = i4 - 1;
                    while (true) {
                        materialButton = null;
                        if (i8 < 0) {
                            materialButton2 = null;
                            break;
                        } else {
                            if (c(i8)) {
                                materialButton2 = (MaterialButton) getChildAt(i8);
                                break;
                            }
                            i8--;
                        }
                    }
                    int allowedWidthDecrease = materialButton2 == null ? 0 : materialButton2.getAllowedWidthDecrease();
                    int childCount = getChildCount();
                    int i9 = i4 + 1;
                    while (true) {
                        if (i9 >= childCount) {
                            break;
                        }
                        if (c(i9)) {
                            materialButton = (MaterialButton) getChildAt(i9);
                            break;
                        }
                        i9++;
                    }
                    r5 = Math.min(max2, allowedWidthDecrease + (materialButton != null ? materialButton.getAllowedWidthDecrease() : 0));
                }
                if (i4 != firstVisibleChildIndex && i4 != lastVisibleChildIndex) {
                    r5 /= 2;
                }
                i = Math.min(i, r5);
            }
        }
        int i10 = firstVisibleChildIndex;
        while (i10 <= lastVisibleChildIndex) {
            if (c(i10)) {
                ((MaterialButton) getChildAt(i10)).setSizeChange(this.f3483n);
                ((MaterialButton) getChildAt(i10)).setWidthChangeMax((i10 == firstVisibleChildIndex || i10 == lastVisibleChildIndex) ? i : i * 2);
            }
            i10++;
        }
    }

    public final boolean c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void d() {
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            LinearLayout.LayoutParams layoutParams = materialButton.A;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.A = null;
                materialButton.f862x = -1.0f;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.i);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.f3479j = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        a0 a0Var;
        int i;
        if (!(this.f3480k == null && this.f3481l == null) && this.f3484o) {
            this.f3484o = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i4 = 0;
            while (i4 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i4);
                if (materialButton.getVisibility() != 8) {
                    boolean z3 = i4 == firstVisibleChildIndex;
                    boolean z4 = i4 == lastVisibleChildIndex;
                    b0 b0Var = this.f3481l;
                    if (b0Var == null || (!z3 && !z4)) {
                        b0Var = (b0) this.f3477g.get(i4);
                    }
                    if (b0Var == null) {
                        a0Var = new a0((n) this.f3476f.get(i4));
                    } else {
                        a0 a0Var2 = new a0();
                        int i5 = b0Var.f2565a;
                        a0Var2.f2556a = i5;
                        a0Var2.f2557b = b0Var.f2566b;
                        int[][] iArr = b0Var.f2567c;
                        int[][] iArr2 = new int[iArr.length][];
                        a0Var2.f2558c = iArr2;
                        n[] nVarArr = b0Var.d;
                        a0Var2.d = new n[nVarArr.length];
                        System.arraycopy(iArr, 0, iArr2, 0, i5);
                        System.arraycopy(nVarArr, 0, a0Var2.d, 0, a0Var2.f2556a);
                        a0Var2.f2559e = b0Var.f2568e;
                        a0Var2.f2560f = b0Var.f2569f;
                        a0Var2.f2561g = b0Var.f2570g;
                        a0Var2.f2562h = b0Var.f2571h;
                        a0Var = a0Var2;
                    }
                    boolean z5 = getOrientation() == 0;
                    boolean z6 = getLayoutDirection() == 1;
                    if (z5) {
                        i = z3 ? 5 : 0;
                        if (z4) {
                            i |= 10;
                        }
                        if (z6) {
                            i = ((i & 10) >> 1) | ((i & 5) << 1);
                        }
                    } else {
                        i = z3 ? 3 : 0;
                        if (z4) {
                            i |= 12;
                        }
                    }
                    int i6 = ~i;
                    z zVar = this.f3480k;
                    if ((i6 | 1) == i6) {
                        a0Var.f2559e = zVar;
                    }
                    if ((i6 | 2) == i6) {
                        a0Var.f2560f = zVar;
                    }
                    if ((i6 | 4) == i6) {
                        a0Var.f2561g = zVar;
                    }
                    if ((i6 | 8) == i6) {
                        a0Var.f2562h = zVar;
                    }
                    b0 b0Var2 = a0Var.f2556a == 0 ? null : new b0(a0Var);
                    if (b0Var2.d()) {
                        materialButton.setStateListShapeAppearanceModel(b0Var2);
                    } else {
                        materialButton.setShapeAppearanceModel(b0Var2.c());
                    }
                }
                i4++;
            }
        }
    }

    public d0 getButtonSizeChange() {
        return this.f3483n;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i4) {
        Integer[] numArr = this.f3479j;
        if (numArr != null && i4 < numArr.length) {
            return numArr[i4].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i4;
    }

    public l2.d getInnerCornerSize() {
        return this.f3480k.f2671b;
    }

    public z getInnerCornerSizeStateList() {
        return this.f3480k;
    }

    public n getShapeAppearance() {
        b0 b0Var = this.f3481l;
        if (b0Var == null) {
            return null;
        }
        return b0Var.c();
    }

    public int getSpacing() {
        return this.f3482m;
    }

    public b0 getStateListShapeAppearance() {
        return this.f3481l;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        super.onLayout(z3, i, i4, i5, i6);
        if (z3) {
            d();
            b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        e();
        a();
        super.onMeasure(i, i4);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f3476f.remove(indexOfChild);
            this.f3477g.remove(indexOfChild);
        }
        this.f3484o = true;
        e();
        d();
        a();
    }

    public void setButtonSizeChange(d0 d0Var) {
        if (this.f3483n != d0Var) {
            this.f3483n = d0Var;
            b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z3);
        }
    }

    public void setInnerCornerSize(l2.d dVar) {
        this.f3480k = z.b(dVar);
        this.f3484o = true;
        e();
        invalidate();
    }

    public void setInnerCornerSizeStateList(z zVar) {
        this.f3480k = zVar;
        this.f3484o = true;
        e();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.f3484o = true;
        }
        super.setOrientation(i);
    }

    public void setShapeAppearance(n nVar) {
        a0 a0Var = new a0(nVar);
        this.f3481l = a0Var.f2556a == 0 ? null : new b0(a0Var);
        this.f3484o = true;
        e();
        invalidate();
    }

    public void setSpacing(int i) {
        this.f3482m = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(b0 b0Var) {
        this.f3481l = b0Var;
        this.f3484o = true;
        e();
        invalidate();
    }
}
