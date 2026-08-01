package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class ck extends mj {
    public int m;

    public ck(vn0 vn0Var) {
        super(vn0Var);
        if (vn0Var instanceof jt) {
            this.e = lj.HORIZONTAL_DIMENSION;
        } else {
            this.e = lj.VERTICAL_DIMENSION;
        }
    }

    @Override // defpackage.mj
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            jj jjVar = (jj) obj;
            jjVar.a(jjVar);
        }
    }
}
