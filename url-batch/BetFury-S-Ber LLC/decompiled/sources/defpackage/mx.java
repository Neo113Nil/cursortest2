package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class mx {
    public gx a;
    public jx b;

    public final void a(lx lxVar, fx fxVar) {
        gx targetState = fxVar.getTargetState();
        gx gxVar = this.a;
        gxVar.getClass();
        if (targetState != null && targetState.compareTo(gxVar) < 0) {
            gxVar = targetState;
        }
        this.a = gxVar;
        this.b.i(lxVar, fxVar);
        this.a = targetState;
    }
}
