package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class n01 {
    public final m01 a;
    public final boolean b;
    public final vb1 c;
    public final boolean d;
    public final Object e;
    public boolean f = true;

    public n01(m01 m01Var, Object obj, boolean z, vb1 vb1Var, boolean z2) {
        this.a = m01Var;
        this.b = z;
        this.c = vb1Var;
        this.d = z2;
        this.e = obj;
    }

    public final Object a() {
        if (this.b) {
            return null;
        }
        Object obj = this.e;
        if (obj != null) {
            return obj;
        }
        kl.b("Unexpected form of a provided value");
        throw new kc0();
    }
}
