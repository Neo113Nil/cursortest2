package c0;

import android.content.Context;
import android.view.ViewGroup;
import com.android.installreferrer.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l extends ViewGroup {

    /* renamed from: f, reason: collision with root package name */
    public final int f1480f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f1481g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f1482h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.room.c f1483i;

    /* renamed from: j, reason: collision with root package name */
    public int f1484j;

    public l(Context context) {
        super(context);
        this.f1480f = 5;
        ArrayList arrayList = new ArrayList();
        this.f1481g = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f1482h = arrayList2;
        this.f1483i = new androidx.room.c(2);
        setClipChildren(false);
        n nVar = new n(context);
        addView(nVar);
        arrayList.add(nVar);
        arrayList2.add(nVar);
        this.f1484j = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final n a(m mVar) {
        androidx.room.c cVar = this.f1483i;
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f1069g;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) cVar.f1069g;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) cVar.f1070h;
        n nVar = (n) linkedHashMap.get(mVar);
        if (nVar != null) {
            return nVar;
        }
        ArrayList arrayList = this.f1482h;
        r6.k.f(arrayList, "<this>");
        n nVar2 = (n) (arrayList.isEmpty() ? null : arrayList.remove(0));
        if (nVar2 == null) {
            int i7 = this.f1484j;
            ArrayList arrayList2 = this.f1481g;
            if (i7 > e6.m.W(arrayList2)) {
                nVar2 = new n(getContext());
                addView(nVar2);
                arrayList2.add(nVar2);
            } else {
                nVar2 = (n) arrayList2.get(this.f1484j);
                m mVar2 = (m) linkedHashMap3.get(nVar2);
                if (mVar2 != null) {
                    mVar2.d0();
                    n nVar3 = (n) linkedHashMap2.get(mVar2);
                    if (nVar3 != null) {
                    }
                    linkedHashMap2.remove(mVar2);
                    nVar2.c();
                }
            }
            int i8 = this.f1484j;
            if (i8 < this.f1480f - 1) {
                this.f1484j = i8 + 1;
            } else {
                this.f1484j = 0;
            }
        }
        linkedHashMap2.put(mVar, nVar2);
        linkedHashMap3.put(nVar2, mVar);
        return nVar2;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i7, int i8, int i9, int i10) {
    }
}
