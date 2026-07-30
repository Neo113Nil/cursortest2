package com.google.android.material.button;

import C3.j;
import G0.f;
import H3.a;
import O.X;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.icefishing.icefishingliveapp.C5284R;
import i3.AbstractC4576a;
import i8.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import o3.C4835d;
import o3.C4836e;
import w3.k;

/* loaded from: classes2.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ int f36061D = 0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f36062A;

    /* renamed from: B, reason: collision with root package name */
    public final int f36063B;

    /* renamed from: C, reason: collision with root package name */
    public HashSet f36064C;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f36065n;

    /* renamed from: u, reason: collision with root package name */
    public final m f36066u;

    /* renamed from: v, reason: collision with root package name */
    public final LinkedHashSet f36067v;

    /* renamed from: w, reason: collision with root package name */
    public final C4835d f36068w;

    /* renamed from: x, reason: collision with root package name */
    public Integer[] f36069x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f36070y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f36071z;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, C5284R.attr.materialButtonToggleGroupStyle, C5284R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, C5284R.attr.materialButtonToggleGroupStyle);
        this.f36065n = new ArrayList();
        this.f36066u = new m(this);
        this.f36067v = new LinkedHashSet();
        this.f36068w = new C4835d(this);
        this.f36070y = false;
        this.f36064C = new HashSet();
        TypedArray f6 = k.f(getContext(), attributeSet, AbstractC4576a.f38301k, C5284R.attr.materialButtonToggleGroupStyle, C5284R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(f6.getBoolean(3, false));
        this.f36063B = f6.getResourceId(1, -1);
        this.f36062A = f6.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(f6.getBoolean(0, true));
        f6.recycle();
        WeakHashMap weakHashMap = X.f2240a;
        setImportantForAccessibility(1);
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

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            if ((getChildAt(i4) instanceof MaterialButton) && c(i4)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = X.f2240a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f36066u);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            int min = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-min);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -min;
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
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.f36055H);
        C3.k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f36065n.add(new C4836e(shapeAppearanceModel.f436e, shapeAppearanceModel.f439h, shapeAppearanceModel.f437f, shapeAppearanceModel.f438g));
        materialButton.setEnabled(isEnabled());
        X.o(materialButton, new f(2, this));
    }

    public final void b(int i, boolean z8) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f36064C);
        if (z8 && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f36071z && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z8 || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.f36062A || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        d(hashSet);
    }

    public final boolean c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void d(Set set) {
        HashSet hashSet = this.f36064C;
        this.f36064C = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f36070y = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f36070y = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f36067v.iterator();
                while (it.hasNext()) {
                    ((com.google.android.material.timepicker.f) it.next()).a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f36068w);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.f36069x = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        C4836e c4836e;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            if (materialButton.getVisibility() != 8) {
                j e6 = materialButton.getShapeAppearanceModel().e();
                C4836e c4836e2 = (C4836e) this.f36065n.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z8 = getOrientation() == 0;
                    C3.a aVar = C4836e.f39723e;
                    if (i == firstVisibleChildIndex) {
                        c4836e = z8 ? k.e(this) ? new C4836e(aVar, aVar, c4836e2.f39725b, c4836e2.f39726c) : new C4836e(c4836e2.f39724a, c4836e2.f39727d, aVar, aVar) : new C4836e(c4836e2.f39724a, aVar, c4836e2.f39725b, aVar);
                    } else if (i == lastVisibleChildIndex) {
                        c4836e = z8 ? k.e(this) ? new C4836e(c4836e2.f39724a, c4836e2.f39727d, aVar, aVar) : new C4836e(aVar, aVar, c4836e2.f39725b, c4836e2.f39726c) : new C4836e(aVar, c4836e2.f39727d, aVar, c4836e2.f39726c);
                    } else {
                        c4836e2 = null;
                    }
                    c4836e2 = c4836e;
                }
                if (c4836e2 == null) {
                    e6.f425e = new C3.a(0.0f);
                    e6.f426f = new C3.a(0.0f);
                    e6.f427g = new C3.a(0.0f);
                    e6.f428h = new C3.a(0.0f);
                } else {
                    e6.f425e = c4836e2.f39724a;
                    e6.f428h = c4836e2.f39727d;
                    e6.f426f = c4836e2.f39725b;
                    e6.f427g = c4836e2.f39726c;
                }
                materialButton.setShapeAppearanceModel(e6.a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f36071z || this.f36064C.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f36064C.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.f36064C.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i4) {
        Integer[] numArr = this.f36069x;
        if (numArr != null && i4 < numArr.length) {
            return numArr[i4].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i4;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f36063B;
        if (i != -1) {
            d(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f36071z ? 1 : 2));
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
            this.f36065n.remove(indexOfChild);
        }
        e();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z8) {
        super.setEnabled(z8);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z8);
        }
    }

    public void setSelectionRequired(boolean z8) {
        this.f36062A = z8;
    }

    public void setSingleSelection(boolean z8) {
        if (this.f36071z != z8) {
            this.f36071z = z8;
            d(new HashSet());
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName((this.f36071z ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
