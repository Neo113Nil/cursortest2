package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class kw0 extends lw0 implements wl {
    public static final kw0 k = new kw0(oj1.e, 0);

    @Override // defpackage.lw0, defpackage.b0, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof m01) {
            return super.containsKey((m01) obj);
        }
        return false;
    }

    @Override // defpackage.b0, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof gm1) {
            return super.containsValue((gm1) obj);
        }
        return false;
    }

    public final kw0 g(m01 m01Var, gm1 gm1Var) {
        jj u = this.h.u(m01Var.hashCode(), 0, m01Var, gm1Var);
        return u == null ? this : new kw0((oj1) u.e, this.i + u.d);
    }

    @Override // defpackage.lw0, defpackage.b0, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof m01) {
            return (gm1) super.get((m01) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof m01) ? obj2 : (gm1) super.getOrDefault((m01) obj, (gm1) obj2);
    }
}
