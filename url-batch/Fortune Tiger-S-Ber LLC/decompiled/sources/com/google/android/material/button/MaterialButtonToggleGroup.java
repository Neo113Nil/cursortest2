package com.google.android.material.button;

import a2.p;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.gglhk.bofio.fortunetiger.R;
import com.google.android.material.timepicker.i;
import g2.a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import k0.j0;
import l2.a;
import r1.h;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends h {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f1245x = 0;

    /* renamed from: r, reason: collision with root package name */
    public final LinkedHashSet f1246r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1247s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1248t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1249u;

    /* renamed from: v, reason: collision with root package name */
    public final int f1250v;

    /* renamed from: w, reason: collision with root package name */
    public HashSet f1251w;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(a.b(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet);
        this.f1246r = new LinkedHashSet();
        this.f1247s = false;
        this.f1251w = new HashSet();
        TypedArray e4 = p.e(getContext(), attributeSet, l1.a.f2868n, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(e4.getBoolean(7, false));
        this.f1250v = e4.getResourceId(2, -1);
        this.f1249u = e4.getBoolean(4, false);
        if (this.f3183k == null) {
            this.f3183k = a0.b(new g2.a(0.0f));
        }
        setEnabled(e4.getBoolean(0, true));
        e4.recycle();
        setImportantForAccessibility(1);
    }

    private String getChildrenA11yClassName() {
        return (this.f1248t ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            if ((getChildAt(i5) instanceof MaterialButton) && getChildAt(i5).getVisibility() != 8) {
                i4++;
            }
        }
        return i4;
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    @Override // r1.h, android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i4, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        l(materialButton.getId(), materialButton.f1244z);
        j0.m(materialButton, new a2.a(3, this));
    }

    public int getCheckedButtonId() {
        if (!this.f1248t || this.f1251w.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f1251w.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            int id = ((MaterialButton) getChildAt(i4)).getId();
            if (this.f1251w.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    public final void l(int i4, boolean z3) {
        if (i4 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i4);
            return;
        }
        HashSet hashSet = new HashSet(this.f1251w);
        if (z3 && !hashSet.contains(Integer.valueOf(i4))) {
            if (this.f1248t && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i4));
        } else {
            if (z3 || !hashSet.contains(Integer.valueOf(i4))) {
                return;
            }
            if (!this.f1249u || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i4));
            }
        }
        m(hashSet);
    }

    public final void m(Set set) {
        HashSet hashSet = this.f1251w;
        this.f1251w = new HashSet(set);
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            int id = ((MaterialButton) getChildAt(i4)).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f1247s = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f1247s = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f1246r.iterator();
                while (it.hasNext()) {
                    ((i) it.next()).a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i4 = this.f1250v;
        if (i4 != -1) {
            m(Collections.singleton(Integer.valueOf(i4)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f1248t ? 1 : 2));
    }

    public void setSelectionRequired(boolean z3) {
        this.f1249u = z3;
    }

    public void setSingleSelection(boolean z3) {
        if (this.f1248t != z3) {
            this.f1248t = z3;
            m(new HashSet());
        }
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            ((MaterialButton) getChildAt(i4)).setA11yClassName(childrenA11yClassName);
        }
    }

    public void setSingleSelection(int i4) {
        setSingleSelection(getResources().getBoolean(i4));
    }
}
