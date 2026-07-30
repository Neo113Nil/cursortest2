package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pb2 extends f91 {
    public static final pb2 c = new pb2("Undefined intrinsics block and it is required", 0);
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pb2(String str, int i) {
        super(str);
        this.b = i;
    }

    @Override // defpackage.oj1
    public final pj1 f(qj1 qj1Var, List list, long j) {
        pj1 G;
        pj1 G2;
        pj1 G3;
        switch (this.b) {
            case 0:
                int size = list.size();
                if (size == 0) {
                    G = qj1Var.G(u10.j(j), u10.i(j), mi1.c(), gs1.A);
                    return G;
                }
                if (size == 1) {
                    n12 c2 = ((jj1) list.get(0)).c(j);
                    G2 = qj1Var.G(v10.g(j, c2.m), v10.f(j, c2.n), mi1.c(), new bb(c2, 7));
                    return G2;
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < size2; i3++) {
                    n12 c3 = ((jj1) list.get(i3)).c(j);
                    i = Math.max(c3.m, i);
                    i2 = Math.max(c3.n, i2);
                    arrayList.add(c3);
                }
                G3 = qj1Var.G(v10.g(j, i), v10.f(j, i2), mi1.c(), new j9(3, arrayList));
                return G3;
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
