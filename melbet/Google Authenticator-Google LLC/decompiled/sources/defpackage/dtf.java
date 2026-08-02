package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dtf extends kra implements krx {
    final /* synthetic */ Object a;
    private /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtf(aem aemVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.c = i;
        this.a = aemVar;
    }

    @Override // defpackage.krx
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.c;
        if (i == 0) {
            return ((dtf) c((kvm) obj, (kqj) obj2)).b(kow.a);
        }
        if (i != 1) {
            return ((dtf) c((kvm) obj, (kqj) obj2)).b(kow.a);
        }
        return ((dtf) c((kvm) obj, (kqj) obj2)).b(kow.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [aeq, java.lang.Object] */
    @Override // defpackage.kqu
    public final Object b(Object obj) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                ixc.Y(obj);
                ixg.i((kvm) this.b, null, 0, new aki((dtw) this.a, (kqj) null, 15), 3);
                return kow.a;
            }
            ixc.Y(obj);
            kvm kvmVar = (kvm) this.b;
            ?? r11 = this.a;
            ael aelVar = ((aem) r11).a;
            if (aelVar.c.compareTo(aek.b) >= 0) {
                aelVar.a(r11);
            } else {
                ixi.h(kvmVar.bV(), null);
            }
            return kow.a;
        }
        ixc.Y(obj);
        kvm kvmVar2 = (kvm) this.b;
        dtj dtjVar = (dtj) this.a;
        lao laoVar = dtjVar.h;
        laoVar.d(jhu.a((jhu) laoVar.b(), false, null, false, null, 14));
        ixg.i(kvmVar2, null, 0, new akn(dtjVar, (kqj) null, 3), 3);
        ixg.i(kvmVar2, null, 0, new aki(dtjVar, (kqj) null, 11, (byte[]) null), 3);
        ixg.i(kvmVar2, null, 0, new aki(dtjVar, (kqj) null, 12, (char[]) null), 3);
        ixg.i(kvmVar2, null, 0, new aki(dtjVar, (kqj) null, 13, (short[]) null), 3);
        if (jtp.c(dtjVar.a.d.a)) {
            ixg.i(kvmVar2, null, 0, new aki(dtjVar, (kqj) null, 14, (int[]) null), 3);
        }
        return kow.a;
    }

    @Override // defpackage.kqu
    public final kqj c(Object obj, kqj kqjVar) {
        int i = this.c;
        if (i == 0) {
            dtf dtfVar = new dtf((dtj) this.a, kqjVar, 0);
            dtfVar.b = obj;
            return dtfVar;
        }
        Object obj2 = this.a;
        if (i != 1) {
            dtf dtfVar2 = new dtf((dtw) obj2, kqjVar, 2);
            dtfVar2.b = obj;
            return dtfVar2;
        }
        dtf dtfVar3 = new dtf((aem) obj2, kqjVar, 1);
        dtfVar3.b = obj;
        return dtfVar3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtf(dtj dtjVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.c = i;
        this.a = dtjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtf(dtw dtwVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.c = i;
        this.a = dtwVar;
    }
}
