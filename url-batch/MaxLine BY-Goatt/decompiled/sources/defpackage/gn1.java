package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gn1 extends ai1 {
    public final n0 p;
    public Object q;

    public gn1(n0 n0Var, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.p = n0Var;
        this.q = obj2;
    }

    @Override // defpackage.ai1, java.util.Map.Entry
    public final Object getValue() {
        return this.q;
    }

    @Override // defpackage.ai1, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.q;
        this.q = obj;
        y02 y02Var = (y02) this.p.n;
        u02 u02Var = y02Var.p;
        Object obj3 = this.n;
        if (!u02Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = y02Var.o;
        if (!z) {
            u02Var.put(obj3, obj);
        } else {
            if (!z) {
                b71.f();
                return null;
            }
            vz2 vz2Var = y02Var.m[y02Var.n];
            Object obj4 = vz2Var.m[vz2Var.o];
            u02Var.put(obj3, obj);
            y02Var.c(obj4 != null ? obj4.hashCode() : 0, u02Var.n, obj4, 0);
        }
        y02Var.s = u02Var.p;
        return obj2;
    }
}
