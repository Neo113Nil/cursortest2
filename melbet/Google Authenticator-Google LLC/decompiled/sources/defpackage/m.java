package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class m extends n {
    private static final long serialVersionUID = 7766999779862263523L;

    @Override // defpackage.o
    public final boolean a(p pVar) {
        return this.a.a(pVar) && this.b.a(pVar);
    }

    public final String toString() {
        o oVar = this.b;
        return this.a.toString() + " and " + oVar.toString();
    }
}
