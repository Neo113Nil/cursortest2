package com.google.android.material.button;

import B0.o;
import H0.j;
import H0.k;
import K.X;
import M0.a;
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
import com.fortuneink.neonpad.R;
import com.google.android.material.timepicker.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import l.C0274n;
import n0.AbstractC0303a;
import t0.d;
import t0.e;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f1821k = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1822a;

    /* renamed from: b, reason: collision with root package name */
    public final C0274n f1823b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f1824c;

    /* renamed from: d, reason: collision with root package name */
    public final d f1825d;

    /* renamed from: e, reason: collision with root package name */
    public Integer[] f1826e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1827f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1828g;
    public boolean h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public HashSet f1829j;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f1822a = new ArrayList();
        this.f1823b = new C0274n(this);
        this.f1824c = new LinkedHashSet();
        this.f1825d = new d(this);
        this.f1827f = false;
        this.f1829j = new HashSet();
        TypedArray f2 = o.f(getContext(), attributeSet, AbstractC0303a.f3638k, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(f2.getBoolean(3, false));
        this.i = f2.getResourceId(1, -1);
        this.h = f2.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(f2.getBoolean(0, true));
        f2.recycle();
        WeakHashMap weakHashMap = X.f418a;
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
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && c(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = X.f418a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f1823b);
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
        b(materialButton.getId(), materialButton.f1818o);
        k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f1822a.add(new e(shapeAppearanceModel.f308e, shapeAppearanceModel.h, shapeAppearanceModel.f309f, shapeAppearanceModel.f310g));
        materialButton.setEnabled(isEnabled());
        X.l(materialButton, new B0.a(3, this));
    }

    public final void b(int i, boolean z2) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f1829j);
        if (z2 && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f1828g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z2 || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        d(hashSet);
    }

    public final boolean c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void d(Set set) {
        HashSet hashSet = this.f1829j;
        this.f1829j = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f1827f = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f1827f = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f1824c.iterator();
                while (it.hasNext()) {
                    ((f) it.next()).a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f1825d);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.f1826e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        e eVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            if (materialButton.getVisibility() != 8) {
                j e2 = materialButton.getShapeAppearanceModel().e();
                e eVar2 = (e) this.f1822a.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z2 = getOrientation() == 0;
                    H0.a aVar = e.f4219e;
                    if (i == firstVisibleChildIndex) {
                        eVar = z2 ? o.e(this) ? new e(aVar, aVar, eVar2.f4221b, eVar2.f4222c) : new e(eVar2.f4220a, eVar2.f4223d, aVar, aVar) : new e(eVar2.f4220a, aVar, eVar2.f4221b, aVar);
                    } else if (i == lastVisibleChildIndex) {
                        eVar = z2 ? o.e(this) ? new e(eVar2.f4220a, eVar2.f4223d, aVar, aVar) : new e(aVar, aVar, eVar2.f4221b, eVar2.f4222c) : new e(aVar, eVar2.f4223d, aVar, eVar2.f4222c);
                    } else {
                        eVar2 = null;
                    }
                    eVar2 = eVar;
                }
                if (eVar2 == null) {
                    e2.f298e = new H0.a(0.0f);
                    e2.f299f = new H0.a(0.0f);
                    e2.f300g = new H0.a(0.0f);
                    e2.h = new H0.a(0.0f);
                } else {
                    e2.f298e = eVar2.f4220a;
                    e2.h = eVar2.f4223d;
                    e2.f299f = eVar2.f4221b;
                    e2.f300g = eVar2.f4222c;
                }
                materialButton.setShapeAppearanceModel(e2.a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f1828g || this.f1829j.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f1829j.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.f1829j.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f1826e;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i2;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.i;
        if (i != -1) {
            d(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f1828g ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        e();
        a();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f1822a.remove(indexOfChild);
        }
        e();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z2);
        }
    }

    public void setSelectionRequired(boolean z2) {
        this.h = z2;
    }

    public void setSingleSelection(boolean z2) {
        if (this.f1828g != z2) {
            this.f1828g = z2;
            d(new HashSet());
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName((this.f1828g ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
