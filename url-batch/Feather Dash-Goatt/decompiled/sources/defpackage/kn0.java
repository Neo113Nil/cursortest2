package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class kn0 extends ak0 {
    public final z h;
    public Object i;

    public kn0(z zVar, Object obj, Object obj2) {
        super(obj, 0, obj2);
        this.h = zVar;
        this.i = obj2;
    }

    @Override // defpackage.ak0, java.util.Map.Entry
    public final Object getValue() {
        return this.i;
    }

    @Override // defpackage.ak0, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.i;
        this.i = obj;
        nw0 nw0Var = (nw0) this.h.e;
        jw0 jw0Var = nw0Var.h;
        Object obj3 = this.e;
        if (!jw0Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = nw0Var.g;
        if (!z) {
            jw0Var.put(obj3, obj);
        } else {
            if (!z) {
                dd0.c();
                return null;
            }
            pj1 pj1Var = nw0Var.d[nw0Var.e];
            Object obj4 = pj1Var.d[pj1Var.g];
            jw0Var.put(obj3, obj);
            nw0Var.c(obj4 != null ? obj4.hashCode() : 0, jw0Var.e, obj4, 0);
        }
        nw0Var.k = jw0Var.h;
        return obj2;
    }
}
