package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aem implements kvm, aep {
    public final ael a;
    private final kqn b;

    public aem(ael aelVar, kqn kqnVar) {
        kqnVar.getClass();
        this.a = aelVar;
        this.b = kqnVar;
        if (aelVar.c == aek.a) {
            ixi.h(kqnVar, null);
        }
    }

    @Override // defpackage.aep
    public final void a(aer aerVar, aej aejVar) {
        ael aelVar = this.a;
        if (aelVar.c.compareTo(aek.a) <= 0) {
            aelVar.c(this);
            ixi.h(this.b, null);
        }
    }

    @Override // defpackage.kvm
    public final kqn bV() {
        return this.b;
    }

    public aem() {
        throw null;
    }
}
