package a0;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q0 implements p1.f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final q0 f127a = new q0();

    @Override // p1.f0
    public final p1.g0 a(p1.h0 h0Var, List list, long j8) {
        ArrayList arrayList = new ArrayList(list.size());
        Integer num = 0;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(((p1.e0) list.get(i7)).b(j8));
        }
        int size2 = arrayList.size();
        Integer num2 = num;
        for (int i8 = 0; i8 < size2; i8++) {
            num2 = Integer.valueOf(Math.max(num2.intValue(), ((p1.n0) arrayList.get(i8)).f7063f));
        }
        int intValue = num2.intValue();
        int size3 = arrayList.size();
        for (int i9 = 0; i9 < size3; i9++) {
            num = Integer.valueOf(Math.max(num.intValue(), ((p1.n0) arrayList.get(i9)).f7064g));
        }
        return h0Var.C(intValue, num.intValue(), e6.v.f2827f, new p0(0, arrayList));
    }
}
