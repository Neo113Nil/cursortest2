package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aex extends aey implements aep {
    final aer a;
    final /* synthetic */ aez b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aex(aez aezVar, aer aerVar, afd afdVar) {
        super(aezVar, afdVar);
        this.b = aezVar;
        this.a = aerVar;
    }

    @Override // defpackage.aep
    public final void a(aer aerVar, aej aejVar) {
        aer aerVar2 = this.a;
        aek aekVar = aerVar2.L().c;
        if (aekVar == aek.a) {
            this.b.h(this.c);
            return;
        }
        aek aekVar2 = null;
        while (aekVar2 != aekVar) {
            d(bj());
            aekVar2 = aekVar;
            aekVar = aerVar2.L().c;
        }
    }

    @Override // defpackage.aey
    public final void b() {
        this.a.L().c(this);
    }

    @Override // defpackage.aey
    public final boolean bj() {
        return this.a.L().c.a(aek.d);
    }

    @Override // defpackage.aey
    public final boolean c(aer aerVar) {
        return this.a == aerVar;
    }
}
