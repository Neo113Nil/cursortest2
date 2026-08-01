package com.google.android.material.button;

import A0.c;
import D0.d;
import D0.e;
import D0.f;
import K.Q;
import L0.k;
import R0.j;
import W0.a;
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
import androidx.recyclerview.widget.RecyclerView;
import com.fortunequest.neontrack.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import x0.AbstractC0393a;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f2210k = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2211a;

    /* renamed from: b, reason: collision with root package name */
    public final c f2212b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f2213c;
    public final d d;

    /* renamed from: e, reason: collision with root package name */
    public Integer[] f2214e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2215f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2216g;
    public boolean h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public HashSet f2217j;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f2211a = new ArrayList();
        this.f2212b = new c(3, this);
        this.f2213c = new LinkedHashSet();
        this.d = new d(this);
        this.f2215f = false;
        this.f2217j = new HashSet();
        TypedArray f2 = k.f(getContext(), attributeSet, AbstractC0393a.f4550k, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(f2.getBoolean(3, false));
        this.i = f2.getResourceId(1, -1);
        this.h = f2.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(f2.getBoolean(0, true));
        f2.recycle();
        WeakHashMap weakHashMap = Q.f578a;
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
            WeakHashMap weakHashMap = Q.f578a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f2212b);
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
        b(materialButton.getId(), materialButton.f2207o);
        R0.k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f2211a.add(new f(shapeAppearanceModel.f949e, shapeAppearanceModel.h, shapeAppearanceModel.f950f, shapeAppearanceModel.f951g));
        materialButton.setEnabled(isEnabled());
        Q.l(materialButton, new e(0, this));
    }

    public final void b(int i, boolean z2) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f2217j);
        if (z2 && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f2216g && !hashSet.isEmpty()) {
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
        HashSet hashSet = this.f2217j;
        this.f2217j = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f2215f = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f2215f = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f2213c.iterator();
                while (it.hasNext()) {
                    ((com.google.android.material.timepicker.f) it.next()).a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.d);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.f2214e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        f fVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            if (materialButton.getVisibility() != 8) {
                j e2 = materialButton.getShapeAppearanceModel().e();
                f fVar2 = (f) this.f2211a.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z2 = getOrientation() == 0;
                    R0.a aVar = f.f144e;
                    if (i == firstVisibleChildIndex) {
                        fVar = z2 ? k.e(this) ? new f(aVar, aVar, fVar2.f146b, fVar2.f147c) : new f(fVar2.f145a, fVar2.d, aVar, aVar) : new f(fVar2.f145a, aVar, fVar2.f146b, aVar);
                    } else if (i == lastVisibleChildIndex) {
                        fVar = z2 ? k.e(this) ? new f(fVar2.f145a, fVar2.d, aVar, aVar) : new f(aVar, aVar, fVar2.f146b, fVar2.f147c) : new f(aVar, fVar2.d, aVar, fVar2.f147c);
                    } else {
                        fVar2 = null;
                    }
                    fVar2 = fVar;
                }
                if (fVar2 == null) {
                    e2.f940e = new R0.a(RecyclerView.f1937A0);
                    e2.f941f = new R0.a(RecyclerView.f1937A0);
                    e2.f942g = new R0.a(RecyclerView.f1937A0);
                    e2.h = new R0.a(RecyclerView.f1937A0);
                } else {
                    e2.f940e = fVar2.f145a;
                    e2.h = fVar2.d;
                    e2.f941f = fVar2.f146b;
                    e2.f942g = fVar2.f147c;
                }
                materialButton.setShapeAppearanceModel(e2.a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f2216g || this.f2217j.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f2217j.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.f2217j.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f2214e;
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
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f2216g ? 1 : 2));
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
            this.f2211a.remove(indexOfChild);
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
        if (this.f2216g != z2) {
            this.f2216g = z2;
            d(new HashSet());
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName((this.f2216g ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
