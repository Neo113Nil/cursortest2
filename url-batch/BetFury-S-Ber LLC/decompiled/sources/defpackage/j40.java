package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class j40 {
    public final ef0 a;

    public j40(int i) {
        this.a = new ef0(new int[i]);
    }

    public void a(Set set) {
        ef0 ef0Var;
        Object h0;
        int[] iArr;
        set.getClass();
        if (set.isEmpty()) {
            return;
        }
        do {
            ef0Var = this.a;
            h0 = ef0Var.h0();
            int[] iArr2 = (int[]) h0;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i = 0; i < length; i++) {
                iArr[i] = set.contains(Integer.valueOf(i)) ? iArr2[i] + 1 : iArr2[i];
            }
            lm lmVar = n9.n;
            if (h0 == null) {
                h0 = lmVar;
            }
        } while (!ef0Var.i0(h0, iArr));
    }

    public j40(ef0 ef0Var) {
        this.a = ef0Var;
    }
}
