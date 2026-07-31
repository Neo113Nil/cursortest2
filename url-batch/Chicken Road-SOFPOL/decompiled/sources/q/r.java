package q;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class r implements u1.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final y f5896a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5897b;

    public r(y yVar) {
        this.f5896a = yVar;
    }

    @Override // u1.e0
    public final u1.f0 e(w1.n0 n0Var, List list, long j7) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            u1.l0 e8 = ((u1.d0) list.get(i9)).e(j7);
            i = Math.max(i, e8.f7230d);
            i8 = Math.max(i8, e8.f7231e);
            arrayList.add(e8);
        }
        boolean p7 = n0Var.p();
        y yVar = this.f5896a;
        if (p7) {
            this.f5897b = true;
            yVar.f5929a.setValue(new r2.k((4294967295L & i8) | (i << 32)));
        } else if (!this.f5897b) {
            yVar.f5929a.setValue(new r2.k((4294967295L & i8) | (i << 32)));
        }
        return n0Var.e0(i, i8, d6.v.f2327d, new q(0, arrayList));
    }
}
