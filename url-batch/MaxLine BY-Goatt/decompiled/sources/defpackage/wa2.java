package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.majelw.libystne.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wa2 extends ViewGroup {
    public final int m;
    public final ArrayList n;
    public final ArrayList o;
    public final tt1 p;
    public int q;

    public wa2(Context context) {
        super(context);
        this.m = 5;
        ArrayList arrayList = new ArrayList();
        this.n = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.o = arrayList2;
        this.p = new tt1(8);
        setClipChildren(false);
        ya2 ya2Var = new ya2(context);
        addView(ya2Var);
        arrayList.add(ya2Var);
        arrayList2.add(ya2Var);
        this.q = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final ya2 a(xa2 xa2Var) {
        tt1 tt1Var = this.p;
        LinkedHashMap linkedHashMap = (LinkedHashMap) tt1Var.n;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) tt1Var.n;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) tt1Var.o;
        ya2 ya2Var = (ya2) linkedHashMap.get(xa2Var);
        if (ya2Var != null) {
            return ya2Var;
        }
        ArrayList arrayList = this.o;
        arrayList.getClass();
        ya2 ya2Var2 = (ya2) (arrayList.isEmpty() ? null : arrayList.remove(0));
        if (ya2Var2 == null) {
            int i = this.q;
            ArrayList arrayList2 = this.n;
            if (i > qv.f(arrayList2)) {
                ya2Var2 = new ya2(getContext());
                addView(ya2Var2);
                arrayList2.add(ya2Var2);
            } else {
                ya2Var2 = (ya2) arrayList2.get(this.q);
                xa2 xa2Var2 = (xa2) linkedHashMap3.get(ya2Var2);
                if (xa2Var2 != null) {
                    xa2Var2.j0();
                    ya2 ya2Var3 = (ya2) linkedHashMap2.get(xa2Var2);
                    if (ya2Var3 != null) {
                    }
                    linkedHashMap2.remove(xa2Var2);
                    ya2Var2.c();
                }
            }
            int i2 = this.q;
            if (i2 < this.m - 1) {
                this.q = i2 + 1;
            } else {
                this.q = 0;
            }
        }
        linkedHashMap2.put(xa2Var, ya2Var2);
        linkedHashMap3.put(ya2Var2, xa2Var);
        return ya2Var2;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
