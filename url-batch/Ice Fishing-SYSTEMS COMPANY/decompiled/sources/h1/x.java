package h1;

import android.graphics.PointF;
import c1.C0537a;
import i1.AbstractC4574a;
import java.util.ArrayList;
import java.util.Collections;
import m5.C4782a;

/* loaded from: classes.dex */
public final class x implements D {

    /* renamed from: n, reason: collision with root package name */
    public static final x f38202n = new x();

    /* renamed from: u, reason: collision with root package name */
    public static final S0.s f38203u = S0.s.i("c", "v", "i", C4782a.PUSH_MINIFIED_BUTTONS_LIST);

    @Override // h1.D
    public final Object a(AbstractC4574a abstractC4574a, float f6) {
        if (abstractC4574a.I() == 1) {
            abstractC4574a.b();
        }
        abstractC4574a.j();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        boolean z8 = false;
        while (abstractC4574a.D()) {
            int K8 = abstractC4574a.K(f38203u);
            if (K8 == 0) {
                z8 = abstractC4574a.E();
            } else if (K8 == 1) {
                arrayList = n.c(abstractC4574a, f6);
            } else if (K8 == 2) {
                arrayList2 = n.c(abstractC4574a, f6);
            } else if (K8 != 3) {
                abstractC4574a.V();
                abstractC4574a.W();
            } else {
                arrayList3 = n.c(abstractC4574a, f6);
            }
        }
        abstractC4574a.B();
        if (abstractC4574a.I() == 2) {
            abstractC4574a.z();
        }
        if (arrayList == null || arrayList2 == null || arrayList3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayList.isEmpty()) {
            return new e1.k(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayList.size();
        PointF pointF = (PointF) arrayList.get(0);
        ArrayList arrayList4 = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) arrayList.get(i);
            int i4 = i - 1;
            arrayList4.add(new C0537a(j1.h.a((PointF) arrayList.get(i4), (PointF) arrayList3.get(i4)), j1.h.a(pointF2, (PointF) arrayList2.get(i)), pointF2));
        }
        if (z8) {
            PointF pointF3 = (PointF) arrayList.get(0);
            int i9 = size - 1;
            arrayList4.add(new C0537a(j1.h.a((PointF) arrayList.get(i9), (PointF) arrayList3.get(i9)), j1.h.a(pointF3, (PointF) arrayList2.get(0)), pointF3));
        }
        return new e1.k(pointF, z8, arrayList4);
    }
}
