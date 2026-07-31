package l5;

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
import com.snovikpovik.vuevnxsj.R;
import d2.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;
import r5.k;
import w5.a0;
import w5.b0;
import w5.c0;
import w5.d0;
import w5.n;
import w5.z;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class d extends LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4835d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f4836e;

    /* renamed from: f, reason: collision with root package name */
    public final b1.b f4837f;

    /* renamed from: g, reason: collision with root package name */
    public final w f4838g;

    /* renamed from: h, reason: collision with root package name */
    public Integer[] f4839h;
    public z i;

    /* renamed from: j, reason: collision with root package name */
    public b0 f4840j;

    /* renamed from: k, reason: collision with root package name */
    public int f4841k;

    /* renamed from: l, reason: collision with root package name */
    public d0 f4842l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4843m;

    public d(Context context, AttributeSet attributeSet) {
        super(a6.a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        z b8;
        XmlResourceParser xml;
        int next;
        d0 d0Var;
        AttributeSet asAttributeSet;
        int next2;
        this.f4835d = new ArrayList();
        this.f4836e = new ArrayList();
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.f4837f = new b1.b(22, materialButtonToggleGroup);
        this.f4838g = new w(2, materialButtonToggleGroup);
        this.f4843m = true;
        Context context2 = getContext();
        TypedArray e8 = k.e(context2, attributeSet, f5.a.f2744j, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (e8.hasValue(2)) {
            int resourceId = e8.getResourceId(2, 0);
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                    try {
                        d0Var = new d0();
                        d0Var.f8082c = new int[10][];
                        d0Var.f8083d = new q3.k[10];
                        asAttributeSet = Xml.asAttributeSet(xml);
                        do {
                            next2 = xml.next();
                            if (next2 == 2) {
                                break;
                            }
                        } while (next2 != 1);
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                }
                if (next2 != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (xml.getName().equals("selector")) {
                    d0Var.a(context2, xml, asAttributeSet, context2.getTheme());
                }
                xml.close();
                this.f4842l = d0Var;
            }
            d0Var = null;
            this.f4842l = d0Var;
        }
        if (e8.hasValue(4)) {
            b0 b9 = b0.b(context2, e8, 4);
            this.f4840j = b9;
            if (b9 == null) {
                a0 a0Var = new a0(n.a(context2, e8.getResourceId(4, 0), e8.getResourceId(5, 0), new w5.a(0)).a());
                this.f4840j = a0Var.f8059a != 0 ? new b0(a0Var) : null;
            }
        }
        if (e8.hasValue(3)) {
            w5.a aVar = new w5.a(0.0f);
            int resourceId2 = e8.getResourceId(3, 0);
            if (resourceId2 == 0) {
                b8 = z.b(n.c(e8, 3, aVar));
            } else if (context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId2);
                    try {
                        b8 = new z();
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
                            b8.d(context2, xml, asAttributeSet2, context2.getTheme());
                        }
                        xml.close();
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    b8 = z.b(aVar);
                }
            } else {
                b8 = z.b(n.c(e8, 3, aVar));
            }
            this.i = b8;
        }
        this.f4841k = e8.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(e8.getBoolean(0, true));
        e8.recycle();
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
        for (int i8 = firstVisibleChildIndex + 1; i8 < getChildCount(); i8++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i8);
            MaterialButton materialButton2 = (MaterialButton) getChildAt(i8 - 1);
            if (this.f4841k <= 0) {
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
                layoutParams2.setMarginStart(this.f4841k - i);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = this.f4841k - i;
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
        this.f4843m = true;
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.f4837f);
        this.f4835d.add(materialButton.getShapeAppearanceModel());
        this.f4836e.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    public final void b() {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        float max;
        if (this.f4842l == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int i = Integer.MAX_VALUE;
        for (int i8 = firstVisibleChildIndex; i8 <= lastVisibleChildIndex; i8++) {
            if (c(i8)) {
                if (c(i8) && this.f4842l != null) {
                    MaterialButton materialButton3 = (MaterialButton) getChildAt(i8);
                    d0 d0Var = this.f4842l;
                    int width = materialButton3.getWidth();
                    int i9 = -width;
                    for (int i10 = 0; i10 < d0Var.f8080a; i10++) {
                        c0 c0Var = (c0) d0Var.f8083d[i10].f6119e;
                        int i11 = c0Var.f8078a;
                        float f6 = c0Var.f8079b;
                        if (i11 == 2) {
                            max = Math.max(i9, f6);
                        } else if (i11 == 1) {
                            max = Math.max(i9, width * f6);
                        }
                        i9 = (int) max;
                    }
                    int max2 = Math.max(0, i9);
                    int i12 = i8 - 1;
                    while (true) {
                        materialButton = null;
                        if (i12 < 0) {
                            materialButton2 = null;
                            break;
                        } else {
                            if (c(i12)) {
                                materialButton2 = (MaterialButton) getChildAt(i12);
                                break;
                            }
                            i12--;
                        }
                    }
                    int allowedWidthDecrease = materialButton2 == null ? 0 : materialButton2.getAllowedWidthDecrease();
                    int childCount = getChildCount();
                    int i13 = i8 + 1;
                    while (true) {
                        if (i13 >= childCount) {
                            break;
                        }
                        if (c(i13)) {
                            materialButton = (MaterialButton) getChildAt(i13);
                            break;
                        }
                        i13++;
                    }
                    r5 = Math.min(max2, allowedWidthDecrease + (materialButton != null ? materialButton.getAllowedWidthDecrease() : 0));
                }
                if (i8 != firstVisibleChildIndex && i8 != lastVisibleChildIndex) {
                    r5 /= 2;
                }
                i = Math.min(i, r5);
            }
        }
        int i14 = firstVisibleChildIndex;
        while (i14 <= lastVisibleChildIndex) {
            if (c(i14)) {
                ((MaterialButton) getChildAt(i14)).setSizeChange(this.f4842l);
                ((MaterialButton) getChildAt(i14)).setWidthChangeMax((i14 == firstVisibleChildIndex || i14 == lastVisibleChildIndex) ? i : i * 2);
            }
            i14++;
        }
    }

    public final boolean c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void d() {
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            LinearLayout.LayoutParams layoutParams = materialButton.f1888y;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.f1888y = null;
                materialButton.f1885v = -1.0f;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f4838g);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.f4839h = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        a0 a0Var;
        int i;
        if (!(this.i == null && this.f4840j == null) && this.f4843m) {
            this.f4843m = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i8 = 0;
            while (i8 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i8);
                if (materialButton.getVisibility() != 8) {
                    boolean z3 = i8 == firstVisibleChildIndex;
                    boolean z7 = i8 == lastVisibleChildIndex;
                    b0 b0Var = this.f4840j;
                    if (b0Var == null || (!z3 && !z7)) {
                        b0Var = (b0) this.f4836e.get(i8);
                    }
                    if (b0Var == null) {
                        a0Var = new a0((n) this.f4835d.get(i8));
                    } else {
                        a0 a0Var2 = new a0();
                        int i9 = b0Var.f8069a;
                        a0Var2.f8059a = i9;
                        a0Var2.f8060b = b0Var.f8070b;
                        int[][] iArr = b0Var.f8071c;
                        int[][] iArr2 = new int[iArr.length][];
                        a0Var2.f8061c = iArr2;
                        n[] nVarArr = b0Var.f8072d;
                        a0Var2.f8062d = new n[nVarArr.length];
                        System.arraycopy(iArr, 0, iArr2, 0, i9);
                        System.arraycopy(nVarArr, 0, a0Var2.f8062d, 0, a0Var2.f8059a);
                        a0Var2.f8063e = b0Var.f8073e;
                        a0Var2.f8064f = b0Var.f8074f;
                        a0Var2.f8065g = b0Var.f8075g;
                        a0Var2.f8066h = b0Var.f8076h;
                        a0Var = a0Var2;
                    }
                    boolean z8 = getOrientation() == 0;
                    boolean z9 = getLayoutDirection() == 1;
                    if (z8) {
                        i = z3 ? 5 : 0;
                        if (z7) {
                            i |= 10;
                        }
                        if (z9) {
                            i = ((i & 10) >> 1) | ((i & 5) << 1);
                        }
                    } else {
                        i = z3 ? 3 : 0;
                        if (z7) {
                            i |= 12;
                        }
                    }
                    int i10 = ~i;
                    z zVar = this.i;
                    if ((i10 | 1) == i10) {
                        a0Var.f8063e = zVar;
                    }
                    if ((i10 | 2) == i10) {
                        a0Var.f8064f = zVar;
                    }
                    if ((i10 | 4) == i10) {
                        a0Var.f8065g = zVar;
                    }
                    if ((i10 | 8) == i10) {
                        a0Var.f8066h = zVar;
                    }
                    b0 b0Var2 = a0Var.f8059a == 0 ? null : new b0(a0Var);
                    if (b0Var2.d()) {
                        materialButton.setStateListShapeAppearanceModel(b0Var2);
                    } else {
                        materialButton.setShapeAppearanceModel(b0Var2.c());
                    }
                }
                i8++;
            }
        }
    }

    public d0 getButtonSizeChange() {
        return this.f4842l;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i8) {
        Integer[] numArr = this.f4839h;
        if (numArr != null && i8 < numArr.length) {
            return numArr[i8].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i8;
    }

    public w5.d getInnerCornerSize() {
        return this.i.f8187b;
    }

    public z getInnerCornerSizeStateList() {
        return this.i;
    }

    public n getShapeAppearance() {
        b0 b0Var = this.f4840j;
        if (b0Var == null) {
            return null;
        }
        return b0Var.c();
    }

    public int getSpacing() {
        return this.f4841k;
    }

    public b0 getStateListShapeAppearance() {
        return this.f4840j;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i8, int i9, int i10) {
        super.onLayout(z3, i, i8, i9, i10);
        if (z3) {
            d();
            b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i8) {
        e();
        a();
        super.onMeasure(i, i8);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f4835d.remove(indexOfChild);
            this.f4836e.remove(indexOfChild);
        }
        this.f4843m = true;
        e();
        d();
        a();
    }

    public void setButtonSizeChange(d0 d0Var) {
        if (this.f4842l != d0Var) {
            this.f4842l = d0Var;
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

    public void setInnerCornerSize(w5.d dVar) {
        this.i = z.b(dVar);
        this.f4843m = true;
        e();
        invalidate();
    }

    public void setInnerCornerSizeStateList(z zVar) {
        this.i = zVar;
        this.f4843m = true;
        e();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.f4843m = true;
        }
        super.setOrientation(i);
    }

    public void setShapeAppearance(n nVar) {
        a0 a0Var = new a0(nVar);
        this.f4840j = a0Var.f8059a == 0 ? null : new b0(a0Var);
        this.f4843m = true;
        e();
        invalidate();
    }

    public void setSpacing(int i) {
        this.f4841k = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(b0 b0Var) {
        this.f4840j = b0Var;
        this.f4843m = true;
        e();
        invalidate();
    }
}
