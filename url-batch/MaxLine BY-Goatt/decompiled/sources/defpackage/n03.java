package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class n03 implements m03 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Class n;
    public final /* synthetic */ l03 o;

    public /* synthetic */ n03(Class cls, l03 l03Var, int i) {
        this.m = i;
        this.n = cls;
        this.o = l03Var;
    }

    @Override // defpackage.m03
    public final l03 a(uw0 uw0Var, v03 v03Var) {
        int i = this.m;
        Class cls = this.n;
        switch (i) {
            case 0:
                if (v03Var.a == cls) {
                    return this.o;
                }
                return null;
            default:
                Class<?> cls2 = v03Var.a;
                if (cls.isAssignableFrom(cls2)) {
                    return new ki(this, cls2);
                }
                return null;
        }
    }

    public final String toString() {
        int i = this.m;
        l03 l03Var = this.o;
        Class cls = this.n;
        switch (i) {
            case 0:
                return "Factory[type=" + cls.getName() + ",adapter=" + l03Var + "]";
            default:
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + l03Var + "]";
        }
    }
}
