package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bj0 extends l03 {
    public l03 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ uw0 c;
    public final /* synthetic */ v03 d;
    public final /* synthetic */ cj0 e;

    public bj0(cj0 cj0Var, boolean z, boolean z2, uw0 uw0Var, v03 v03Var) {
        this.e = cj0Var;
        this.b = z;
        this.c = uw0Var;
        this.d = v03Var;
    }

    @Override // defpackage.l03
    public final Object a(z61 z61Var) {
        if (this.b) {
            z61Var.W();
            return null;
        }
        l03 l03Var = this.a;
        if (l03Var == null) {
            uw0 uw0Var = this.c;
            List list = uw0Var.e;
            m03 m03Var = this.e;
            if (!list.contains(m03Var)) {
                m03Var = uw0Var.d;
            }
            Iterator it = list.iterator();
            boolean z = false;
            while (true) {
                boolean hasNext = it.hasNext();
                v03 v03Var = this.d;
                if (!hasNext) {
                    b71.j(v03Var, "GSON cannot serialize ");
                    return null;
                }
                m03 m03Var2 = (m03) it.next();
                if (z) {
                    l03 a = m03Var2.a(uw0Var, v03Var);
                    if (a != null) {
                        this.a = a;
                        l03Var = a;
                        break;
                    }
                } else if (m03Var2 == m03Var) {
                    z = true;
                }
            }
        }
        return l03Var.a(z61Var);
    }
}
