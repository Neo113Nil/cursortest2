package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hfi implements Serializable {
    private final hel a;

    public hfi(hel helVar) {
        this.a = helVar;
    }

    Object readResolve() {
        hel helVar = this.a;
        return helVar.isEmpty() ? hfj.a : hnu.H(helVar, hel.q(hip.a)) ? hfj.b : new hfj(helVar);
    }
}
