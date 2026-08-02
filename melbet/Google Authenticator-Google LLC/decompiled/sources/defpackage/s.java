package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class s extends n {
    private static final long serialVersionUID = 1405488568664762222L;

    @Override // defpackage.o
    public final boolean a(p pVar) {
        return this.a.a(pVar) || this.b.a(pVar);
    }

    public final String toString() {
        o oVar = this.b;
        return this.a.toString() + " or " + oVar.toString();
    }
}
