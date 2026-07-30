package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class sj0 implements gl0 {
    public gl0[] a;

    @Override // defpackage.gl0
    public final c11 a(Class cls) {
        for (gl0 gl0Var : this.a) {
            if (gl0Var.b(cls)) {
                return gl0Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // defpackage.gl0
    public final boolean b(Class cls) {
        for (gl0 gl0Var : this.a) {
            if (gl0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
