package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class v02 extends w02 implements n00 {
    public static final v02 s = new v02(uz2.e, 0);

    @Override // defpackage.w02, defpackage.m0, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof t52) {
            return super.containsKey((t52) obj);
        }
        return false;
    }

    @Override // defpackage.m0, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof r33) {
            return super.containsValue((r33) obj);
        }
        return false;
    }

    public final v02 g(t52 t52Var, r33 r33Var) {
        r5 u = this.p.u(t52Var.hashCode(), 0, t52Var, r33Var);
        return u == null ? this : new v02((uz2) u.b, this.q + u.a);
    }

    @Override // defpackage.w02, defpackage.m0, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof t52) {
            return (r33) super.get((t52) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof t52) ? obj2 : (r33) super.getOrDefault((t52) obj, (r33) obj2);
    }
}
