package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class oe0 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ qe0 g;
    public final /* synthetic */ zi h;

    public /* synthetic */ oe0(zi ziVar, qe0 qe0Var, int i) {
        this.f = i;
        this.h = ziVar;
        this.g = qe0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        qe0 qe0Var = this.g;
        zi ziVar = this.h;
        switch (i) {
            case 0:
                if (ziVar.b.contains(qe0Var)) {
                    qe0Var.a.applyState(qe0Var.c.J);
                    break;
                }
                break;
            default:
                ziVar.b.remove(qe0Var);
                ziVar.c.remove(qe0Var);
                break;
        }
    }
}
