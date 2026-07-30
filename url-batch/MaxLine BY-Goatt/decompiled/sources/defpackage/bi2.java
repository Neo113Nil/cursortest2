package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bi2 {
    public final sh2 a;
    public final an1 b;

    public bi2(ai2 ai2Var, q31 q31Var) {
        this.a = ai2Var.d;
        this.b = new an1(ai2.j(4, ai2Var).size());
        List j = ai2.j(4, ai2Var);
        int size = j.size();
        for (int i = 0; i < size; i++) {
            ai2 ai2Var2 = (ai2) j.get(i);
            if (q31Var.a(ai2Var2.g)) {
                this.b.a(ai2Var2.g);
            }
        }
    }
}
