package E;

import android.content.Context;
import android.view.ViewGroup;
import com.gates.olympus.miruv.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class s extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final int f692d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f693e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f694f;

    /* renamed from: g, reason: collision with root package name */
    public final C2.c f695g;

    /* renamed from: h, reason: collision with root package name */
    public int f696h;

    public s(Context context) {
        super(context);
        this.f692d = 5;
        ArrayList arrayList = new ArrayList();
        this.f693e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f694f = arrayList2;
        this.f695g = new C2.c(1);
        setClipChildren(false);
        v vVar = new v(context);
        addView(vVar);
        arrayList.add(vVar);
        arrayList2.add(vVar);
        this.f696h = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final v a(t tVar) {
        C2.c cVar = this.f695g;
        v vVar = (v) ((LinkedHashMap) cVar.f484e).get(tVar);
        if (vVar != null) {
            return vVar;
        }
        ArrayList arrayList = this.f694f;
        Z1.i.f(arrayList, "<this>");
        v vVar2 = (v) (arrayList.isEmpty() ? null : arrayList.remove(0));
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f484e;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) cVar.f485f;
        if (vVar2 == null) {
            int i3 = this.f696h;
            ArrayList arrayList2 = this.f693e;
            if (i3 > M1.m.b0(arrayList2)) {
                vVar2 = new v(getContext());
                addView(vVar2);
                arrayList2.add(vVar2);
            } else {
                vVar2 = (v) arrayList2.get(this.f696h);
                t tVar2 = (t) linkedHashMap2.get(vVar2);
                if (tVar2 != null) {
                    tVar2.N();
                    v vVar3 = (v) linkedHashMap.get(tVar2);
                    if (vVar3 != null) {
                    }
                    linkedHashMap.remove(tVar2);
                    vVar2.c();
                }
            }
            int i4 = this.f696h;
            if (i4 < this.f692d - 1) {
                this.f696h = i4 + 1;
            } else {
                this.f696h = 0;
            }
        }
        linkedHashMap.put(tVar, vVar2);
        linkedHashMap2.put(vVar2, tVar);
        return vVar2;
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
