package com.google.android.material.button;

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
import com.gdmhkmf.belbet.R;
import com.google.android.material.datepicker.n;
import com.google.android.material.timepicker.i;
import i2.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import n0.p0;
import o2.a0;
import u2.a;
import w1.h;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends h {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f982x = 0;

    /* renamed from: r, reason: collision with root package name */
    public final LinkedHashSet f983r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f984s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f985t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f986u;

    /* renamed from: v, reason: collision with root package name */
    public final int f987v;

    /* renamed from: w, reason: collision with root package name */
    public HashSet f988w;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(a.b(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet);
        this.f983r = new LinkedHashSet();
        this.f984s = false;
        this.f988w = new HashSet();
        TypedArray e4 = o.e(getContext(), attributeSet, q1.a.f3154r, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(e4.getBoolean(7, false));
        this.f987v = e4.getResourceId(2, -1);
        this.f986u = e4.getBoolean(4, false);
        if (this.f3789k == null) {
            this.f3789k = a0.b(new o2.a(0.0f));
        }
        setEnabled(e4.getBoolean(0, true));
        e4.recycle();
        setImportantForAccessibility(1);
    }

    private String getChildrenA11yClassName() {
        return (this.f985t ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            if ((getChildAt(i4) instanceof MaterialButton) && getChildAt(i4).getVisibility() != 8) {
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

    @Override // w1.h, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        l(materialButton.getId(), materialButton.f981z);
        p0.m(materialButton, new n(3, this));
    }

    public int getCheckedButtonId() {
        if (!this.f985t || this.f988w.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f988w.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.f988w.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    public final void l(int i, boolean z4) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f988w);
        if (z4 && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f985t && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z4 || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.f986u || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        m(hashSet);
    }

    public final void m(Set set) {
        HashSet hashSet = this.f988w;
        this.f988w = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f984s = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f984s = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f983r.iterator();
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
        int i = this.f987v;
        if (i != -1) {
            m(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f985t ? 1 : 2));
    }

    public void setSelectionRequired(boolean z4) {
        this.f986u = z4;
    }

    public void setSingleSelection(boolean z4) {
        if (this.f985t != z4) {
            this.f985t = z4;
            m(new HashSet());
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
