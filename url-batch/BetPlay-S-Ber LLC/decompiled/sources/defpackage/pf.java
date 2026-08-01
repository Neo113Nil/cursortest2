package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class pf extends gf {
    public int m;

    public pf(ra0 ra0Var) {
        super(ra0Var);
        if (ra0Var instanceof tn) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }

    @Override // defpackage.gf
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
            ef efVar = (ef) obj;
            efVar.a(efVar);
        }
    }
}
