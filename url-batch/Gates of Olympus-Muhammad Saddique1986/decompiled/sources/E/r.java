package E;

import android.content.Context;
import android.view.ViewGroup;
import com.gatesof.olympus.martu.marku.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import z.C1256t;

/* loaded from: classes.dex */
public final class r extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final int f992d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f993e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f994f;

    /* renamed from: g, reason: collision with root package name */
    public final C1256t f995g;

    /* renamed from: h, reason: collision with root package name */
    public int f996h;

    public r(Context context) {
        super(context);
        this.f992d = 5;
        ArrayList arrayList = new ArrayList();
        this.f993e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f994f = arrayList2;
        this.f995g = new C1256t(1);
        setClipChildren(false);
        u uVar = new u(context);
        addView(uVar);
        arrayList.add(uVar);
        arrayList2.add(uVar);
        this.f996h = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final u a(s sVar) {
        C1256t c1256t = this.f995g;
        u uVar = (u) ((LinkedHashMap) c1256t.f10466e).get(sVar);
        if (uVar != null) {
            return uVar;
        }
        ArrayList arrayList = this.f994f;
        f2.j.f(arrayList, "<this>");
        u uVar2 = (u) (arrayList.isEmpty() ? null : arrayList.remove(0));
        LinkedHashMap linkedHashMap = (LinkedHashMap) c1256t.f10466e;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) c1256t.f10467f;
        if (uVar2 == null) {
            int i3 = this.f996h;
            ArrayList arrayList2 = this.f993e;
            if (i3 > S1.m.z0(arrayList2)) {
                uVar2 = new u(getContext());
                addView(uVar2);
                arrayList2.add(uVar2);
            } else {
                uVar2 = (u) arrayList2.get(this.f996h);
                s sVar2 = (s) linkedHashMap2.get(uVar2);
                if (sVar2 != null) {
                    sVar2.Q();
                    u uVar3 = (u) linkedHashMap.get(sVar2);
                    if (uVar3 != null) {
                    }
                    linkedHashMap.remove(sVar2);
                    uVar2.c();
                }
            }
            int i4 = this.f996h;
            if (i4 < this.f992d - 1) {
                this.f996h = i4 + 1;
            } else {
                this.f996h = 0;
            }
        }
        linkedHashMap.put(sVar, uVar2);
        linkedHashMap2.put(uVar2, sVar);
        return uVar2;
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
    }
}
