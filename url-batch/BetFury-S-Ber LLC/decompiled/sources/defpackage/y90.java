package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class y90 extends f8 {
    public y90(dg dgVar) {
        super(dgVar);
        if (dgVar == null || dgVar.d() == um.f) {
            return;
        }
        s9.k("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // defpackage.dg
    public final qg d() {
        return um.f;
    }
}
