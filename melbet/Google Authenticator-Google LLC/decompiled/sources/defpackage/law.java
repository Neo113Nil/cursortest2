package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class law extends kra implements krx {
    int a;
    final /* synthetic */ int b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public law(kzq kzqVar, dsq dsqVar, iyi iyiVar, int i, kqj kqjVar, int i2) {
        super(2, kqjVar);
        this.f = i2;
        this.c = kzqVar;
        this.d = dsqVar;
        this.e = iyiVar;
        this.b = i;
    }

    @Override // defpackage.krx
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.f != 0) {
            return ((law) c((kvm) obj, (kqj) obj2)).b(kow.a);
        }
        return ((law) c((kvm) obj, (kqj) obj2)).b(kow.a);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kys] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kzg] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kzg] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, kzq] */
    @Override // defpackage.kqu
    public final Object b(Object obj) {
        AtomicInteger atomicInteger;
        if (this.f != 0) {
            kqp kqpVar = kqp.a;
            int i = this.a;
            ixc.Y(obj);
            if (i == 0) {
                ?? r7 = this.c;
                dsp dspVar = new dsp(this.d, this.e, 0);
                this.a = 1;
                if (r7.a(dspVar, this) == kqpVar) {
                    return kqpVar;
                }
            }
            return kow.a;
        }
        kqp kqpVar2 = kqp.a;
        try {
            if (this.a != 0) {
                ixc.Y(obj);
            } else {
                ixc.Y(obj);
                Object obj2 = this.c;
                int i2 = this.b;
                kzq kzqVar = ((kzq[]) obj2)[i2];
                lav lavVar = new lav(this.e, i2);
                this.a = 1;
                if (kzqVar.a(lavVar, this) == kqpVar2) {
                    return kqpVar2;
                }
            }
            if (atomicInteger.decrementAndGet() == 0) {
                this.e.u(null);
            }
            return kow.a;
        } finally {
            if (((AtomicInteger) this.d).decrementAndGet() == 0) {
                this.e.u(null);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kzq] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kys] */
    @Override // defpackage.kqu
    public final kqj c(Object obj, kqj kqjVar) {
        if (this.f != 0) {
            ?? r1 = this.c;
            Object obj2 = this.d;
            return new law((kzq) r1, (dsq) obj2, (iyi) this.e, this.b, kqjVar, 1);
        }
        Object obj3 = this.c;
        return new law((kzq[]) obj3, this.b, (AtomicInteger) this.d, (kys) this.e, kqjVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public law(kzq[] kzqVarArr, int i, AtomicInteger atomicInteger, kys kysVar, kqj kqjVar, int i2) {
        super(2, kqjVar);
        this.f = i2;
        this.c = kzqVarArr;
        this.b = i;
        this.d = atomicInteger;
        this.e = kysVar;
    }
}
