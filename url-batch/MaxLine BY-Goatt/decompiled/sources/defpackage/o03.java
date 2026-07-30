package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class o03 implements m03 {
    public final /* synthetic */ Class m;
    public final /* synthetic */ Class n;
    public final /* synthetic */ l03 o;

    public o03(Class cls, Class cls2, l03 l03Var) {
        this.m = cls;
        this.n = cls2;
        this.o = l03Var;
    }

    @Override // defpackage.m03
    public final l03 a(uw0 uw0Var, v03 v03Var) {
        Class cls = v03Var.a;
        if (cls == this.m || cls == this.n) {
            return this.o;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.n.getName() + "+" + this.m.getName() + ",adapter=" + this.o + "]";
    }
}
