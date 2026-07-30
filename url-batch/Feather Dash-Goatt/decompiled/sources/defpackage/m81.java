package defpackage;

import java.util.List;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class m81 {
    public final h81 a;
    public final fn0 b;

    public m81(l81 l81Var, q90 q90Var) {
        this.a = l81Var.d;
        this.b = new fn0(l81.j(4, l81Var).size());
        List j = l81.j(4, l81Var);
        int size = j.size();
        for (int i = 0; i < size; i++) {
            l81 l81Var2 = (l81) j.get(i);
            if (q90Var.a(l81Var2.g)) {
                this.b.a(l81Var2.g);
            }
        }
    }
}
