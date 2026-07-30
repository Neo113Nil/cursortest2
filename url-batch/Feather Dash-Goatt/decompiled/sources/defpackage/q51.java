package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class q51 implements os {
    public final /* synthetic */ r51 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ w51 c;

    public q51(r51 r51Var, Object obj, w51 w51Var) {
        this.a = r51Var;
        this.b = obj;
        this.c = w51Var;
    }

    @Override // defpackage.os
    public final void a() {
        r51 r51Var = this.a;
        vn0 vn0Var = r51Var.e;
        Object obj = this.b;
        Object k = vn0Var.k(obj);
        w51 w51Var = this.c;
        if (k == w51Var) {
            Map map = r51Var.d;
            Map c = w51Var.c();
            if (c.isEmpty()) {
                map.remove(obj);
            } else {
                map.put(obj, c);
            }
        }
    }
}
