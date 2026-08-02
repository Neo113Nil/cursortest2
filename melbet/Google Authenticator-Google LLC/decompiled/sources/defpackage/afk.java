package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afk implements aep {
    final /* synthetic */ aej a;
    final /* synthetic */ ksw b;
    final /* synthetic */ kvm c;
    final /* synthetic */ aej d;
    final /* synthetic */ kuv e;
    final /* synthetic */ krx f;
    final /* synthetic */ ldx g;

    public afk(aej aejVar, ksw kswVar, kvm kvmVar, aej aejVar2, kuv kuvVar, ldx ldxVar, krx krxVar) {
        this.a = aejVar;
        this.b = kswVar;
        this.c = kvmVar;
        this.d = aejVar2;
        this.e = kuvVar;
        this.g = ldxVar;
        this.f = krxVar;
    }

    @Override // defpackage.aep
    public final void a(aer aerVar, aej aejVar) {
        if (aejVar == this.a) {
            this.b.a = ixg.i(this.c, null, 0, new afj(this.g, this.f, null), 3);
            return;
        }
        if (aejVar == this.d) {
            ksw kswVar = this.b;
            kwu kwuVar = (kwu) kswVar.a;
            if (kwuVar != null) {
                kwuVar.s(null);
            }
            kswVar.a = null;
        }
        if (aejVar == aej.ON_DESTROY) {
            this.e.ca(kow.a);
        }
    }
}
