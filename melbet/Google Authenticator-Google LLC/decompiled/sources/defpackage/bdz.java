package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bdz implements bbt {
    final /* synthetic */ bea a;
    final /* synthetic */ bvw b;

    public bdz(bea beaVar, bvw bvwVar) {
        this.b = bvwVar;
        this.a = beaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [bbh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [bbu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [bbu, java.lang.Object] */
    @Override // defpackage.bbt
    public final void b(Object obj) {
        bea beaVar = this.a;
        bvw bvwVar = this.b;
        if (beaVar.e(bvwVar)) {
            bdg bdgVar = beaVar.a.o;
            if (obj != null && bdgVar.c(bvwVar.b.g())) {
                beaVar.c = obj;
                ((bcz) beaVar.b).f(2);
            } else {
                bcv bcvVar = beaVar.b;
                ?? r1 = bvwVar.c;
                ?? r3 = bvwVar.b;
                bcvVar.d(r1, obj, r3, r3.g(), beaVar.d);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [bbu, java.lang.Object] */
    @Override // defpackage.bbt
    public final void e(Exception exc) {
        bea beaVar = this.a;
        bvw bvwVar = this.b;
        if (beaVar.e(bvwVar)) {
            bcu bcuVar = beaVar.d;
            ?? r3 = bvwVar.b;
            beaVar.b.b(bcuVar, exc, r3, r3.g());
        }
    }
}
