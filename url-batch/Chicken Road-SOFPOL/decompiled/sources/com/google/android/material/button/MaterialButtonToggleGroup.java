package com.google.android.material.button;

import a6.a;
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
import com.google.android.material.timepicker.i;
import com.snovikpovik.vuevnxsj.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import l5.d;
import l5.f;
import q3.k0;
import r5.k;
import w5.z;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends d {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f1890t = 0;

    /* renamed from: n, reason: collision with root package name */
    public final LinkedHashSet f1891n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1892o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1893p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1894q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1895r;

    /* renamed from: s, reason: collision with root package name */
    public HashSet f1896s;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet);
        this.f1891n = new LinkedHashSet();
        this.f1892o = false;
        this.f1896s = new HashSet();
        TypedArray e8 = k.e(getContext(), attributeSet, f5.a.f2745k, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(e8.getBoolean(7, false));
        this.f1895r = e8.getResourceId(2, -1);
        this.f1894q = e8.getBoolean(4, false);
        if (this.i == null) {
            this.i = z.b(new w5.a(0.0f));
        }
        setEnabled(e8.getBoolean(0, true));
        e8.recycle();
        setImportantForAccessibility(1);
    }

    private String getChildrenA11yClassName() {
        return (this.f1893p ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            if ((getChildAt(i8) instanceof MaterialButton) && getChildAt(i8).getVisibility() != 8) {
                i++;
            }
        }
        return i;
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    @Override // l5.d, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        f(materialButton.getId(), materialButton.f1881r);
        k0.k(materialButton, new f(this, 0));
    }

    public final void f(int i, boolean z3) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f1896s);
        if (z3 && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f1893p && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z3 || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.f1894q || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        g(hashSet);
    }

    public final void g(Set set) {
        HashSet hashSet = this.f1896s;
        this.f1896s = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f1892o = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f1892o = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f1891n.iterator();
                while (it.hasNext()) {
                    ((i) it.next()).a();
                }
            }
        }
        invalidate();
    }

    public int getCheckedButtonId() {
        if (!this.f1893p || this.f1896s.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f1896s.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.f1896s.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f1895r;
        if (i != -1) {
            g(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f1893p ? 1 : 2));
    }

    public void setSelectionRequired(boolean z3) {
        this.f1894q = z3;
    }

    public void setSingleSelection(boolean z3) {
        if (this.f1893p != z3) {
            this.f1893p = z3;
            g(new HashSet());
        }
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName(childrenA11yClassName);
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
