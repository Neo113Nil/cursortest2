package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aln extends kra implements krx {
    final /* synthetic */ Object a;
    private /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aln(kqj kqjVar, krt krtVar, int i) {
        super(2, kqjVar);
        this.c = i;
        this.a = krtVar;
    }

    @Override // defpackage.krx
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.c;
        if (i == 0) {
            return ((aln) c((aky) obj, (kqj) obj2)).b(kow.a);
        }
        if (i != 1) {
            return ((aln) c((aky) obj, (kqj) obj2)).b(kow.a);
        }
        return ((aln) c((kvm) obj, (kqj) obj2)).b(kow.a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, krx] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, krt] */
    @Override // defpackage.kqu
    public final Object b(Object obj) {
        int i = this.c;
        if (i == 0) {
            ixc.Y(obj);
            aky akyVar = (aky) this.b;
            akyVar.getClass();
            return this.a.a(akyVar.b());
        }
        if (i != 1) {
            ixc.Y(obj);
            aky akyVar2 = (aky) this.b;
            akyVar2.getClass();
            return this.a.a(akyVar2.b());
        }
        ixc.Y(obj);
        kql kqlVar = ((kvm) this.b).bV().get(kqk.b);
        kqlVar.getClass();
        kqk kqkVar = (kqk) kqlVar;
        kvc kvcVar = new kvc();
        ixg.h(kwo.a, kqkVar, 4, new laq(kvcVar, (krx) this.a, (kqj) null, 1));
        while (!kvcVar.N()) {
            try {
                return ixg.e(kqkVar, new aki(kvcVar, (kqj) null, 2));
            } catch (InterruptedException unused) {
            }
        }
        return kvcVar.cc();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, krx] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, krt] */
    @Override // defpackage.kqu
    public final kqj c(Object obj, kqj kqjVar) {
        int i = this.c;
        if (i == 0) {
            aln alnVar = new aln(kqjVar, (krt) this.a, 0);
            alnVar.b = obj;
            return alnVar;
        }
        if (i != 1) {
            aln alnVar2 = new aln(kqjVar, this.a, 2, null);
            alnVar2.b = obj;
            return alnVar2;
        }
        aln alnVar3 = new aln((krx) this.a, kqjVar, 1);
        alnVar3.b = obj;
        return alnVar3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aln(kqj kqjVar, krt krtVar, int i, byte[] bArr) {
        super(2, kqjVar);
        this.c = i;
        this.a = krtVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aln(krx krxVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.c = i;
        this.a = krxVar;
    }
}
