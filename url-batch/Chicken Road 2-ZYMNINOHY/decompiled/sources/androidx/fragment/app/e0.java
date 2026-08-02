package androidx.fragment.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class e0 implements InterfaceC0198c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f4829a;

    public e0(f0 f0Var) {
        this.f4829a = f0Var;
    }

    @Override // androidx.fragment.app.InterfaceC0198c0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        f0 f0Var = this.f4829a;
        ArrayList arrayList3 = f0Var.f4850d;
        C0193a c0193a = (C0193a) arrayList3.get(arrayList3.size() - 1);
        f0Var.f4854h = c0193a;
        ArrayList arrayList4 = c0193a.f4788a;
        int size = arrayList4.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList4.get(i5);
            i5++;
            F f4 = ((o0) obj).f4941b;
            if (f4 != null) {
                f4.mTransitioning = true;
            }
        }
        boolean Q4 = f0Var.Q(arrayList, arrayList2, -1, 0);
        if (!f0Var.f4859m.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            int i6 = 0;
            while (i6 < size2) {
                Object obj2 = arrayList.get(i6);
                i6++;
                linkedHashSet.addAll(f0.E((C0193a) obj2));
            }
            ArrayList arrayList5 = f0Var.f4859m;
            int size3 = arrayList5.size();
            while (i4 < size3) {
                Object obj3 = arrayList5.get(i4);
                i4++;
                if (obj3 != null) {
                    throw new ClassCastException();
                }
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw null;
                }
            }
        }
        return Q4;
    }
}
