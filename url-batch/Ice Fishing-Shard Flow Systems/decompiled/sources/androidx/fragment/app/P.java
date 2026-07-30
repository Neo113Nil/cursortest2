package androidx.fragment.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class P implements N {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Q f3597a;

    public P(Q q4) {
        this.f3597a = q4;
    }

    @Override // androidx.fragment.app.N
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        Q q4 = this.f3597a;
        ArrayList arrayList3 = q4.f3616d;
        C0210a c0210a = (C0210a) arrayList3.get(arrayList3.size() - 1);
        q4.f3620h = c0210a;
        ArrayList arrayList4 = c0210a.f3682a;
        int size = arrayList4.size();
        int i2 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList4.get(i5);
            i5++;
            ComponentCallbacksC0228t componentCallbacksC0228t = ((Z) obj).f3674b;
            if (componentCallbacksC0228t != null) {
                componentCallbacksC0228t.f3811u = true;
            }
        }
        boolean R4 = q4.R(arrayList, arrayList2, -1, 0);
        if (!q4.f3624m.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            int i7 = 0;
            while (i7 < size2) {
                Object obj2 = arrayList.get(i7);
                i7++;
                linkedHashSet.addAll(Q.E((C0210a) obj2));
            }
            ArrayList arrayList5 = q4.f3624m;
            int size3 = arrayList5.size();
            while (i2 < size3) {
                Object obj3 = arrayList5.get(i2);
                i2++;
                if (obj3 != null) {
                    throw new ClassCastException();
                }
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw null;
                }
            }
        }
        return R4;
    }
}
