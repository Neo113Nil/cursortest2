package u;

import a2.o0;
import a2.s0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p implements a2.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final t f9540a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9541b;

    public p(t tVar) {
        this.f9540a = tVar;
    }

    @Override // a2.g0
    public final a2.h0 a(a2.i0 i0Var, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i3 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            o0 c10 = ((a2.f0) list.get(i11)).c(j);
            i3 = Math.max(i3, c10.f131d);
            i10 = Math.max(i10, c10.f132e);
            arrayList.add(c10);
        }
        boolean j3 = i0Var.j();
        t tVar = this.f9540a;
        if (j3) {
            this.f9541b = true;
            tVar.f9549a.setValue(new x2.k((4294967295L & i10) | (i3 << 32)));
        } else if (!this.f9541b) {
            tVar.f9549a.setValue(new x2.k((4294967295L & i10) | (i3 << 32)));
        }
        return a2.i0.V(i0Var, i3, i10, new s0(2, arrayList));
    }
}
