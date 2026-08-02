package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class q {

    @Deprecated
    public final p a;

    @Deprecated
    public final p b;

    @Deprecated
    public q(p pVar, p pVar2) {
        if (pVar.b == pVar2.b) {
            this.a = pVar;
            this.b = pVar2;
            return;
        }
        throw new IllegalArgumentException("Ranges must have the same number of visible decimals: " + pVar.toString() + "~" + pVar2.toString());
    }

    @Deprecated
    public final String toString() {
        p pVar = this.b;
        p pVar2 = this.a;
        return pVar2.toString().concat(pVar == pVar2 ? "" : "~".concat(pVar.toString()));
    }
}
