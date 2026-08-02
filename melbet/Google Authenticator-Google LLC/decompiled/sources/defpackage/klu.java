package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class klu extends kft {
    final /* synthetic */ jxk a;
    final /* synthetic */ String b;
    final /* synthetic */ kma c;
    final /* synthetic */ klp d;
    final /* synthetic */ hvw e;
    final /* synthetic */ kmm f;
    final /* synthetic */ kaa g;
    final /* synthetic */ klv h;
    final /* synthetic */ kuq i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klu(klv klvVar, jxk jxkVar, kuq kuqVar, String str, kma kmaVar, klp klpVar, hvw hvwVar, kmm kmmVar, kaa kaaVar) {
        super(jxkVar);
        this.a = jxkVar;
        this.i = kuqVar;
        this.b = str;
        this.c = kmaVar;
        this.d = klpVar;
        this.e = hvwVar;
        this.f = kmmVar;
        this.g = kaaVar;
        this.h = klvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kft
    public final void a() {
        int i = kob.a;
        try {
            kuq kuqVar = this.i;
            kuq kuqVar2 = kuqVar;
            if (kuqVar == null) {
                jyf jyfVar = this.h.b.g;
                String str = this.b;
                this.c.m();
                kuqVar2 = jyfVar.a(str);
            }
            if (kuqVar2 == null) {
                kbq e = kbq.j.e("Method not found: " + this.b);
                this.d.g(klw.c);
                this.c.d(e, new kaa());
                this.a.j(null);
                this.e.cancel(false);
                return;
            }
            klv klvVar = this.h;
            kma kmaVar = this.c;
            kmm kmmVar = this.f;
            kmaVar.m();
            ixj[] ixjVarArr = kmmVar.b;
            if (ixjVarArr.length > 0) {
                ixj ixjVar = ixjVarArr[0];
                throw null;
            }
            Object obj = kuqVar2.a;
            klw klwVar = klvVar.b;
            kbi[] kbiVarArr = klwVar.i;
            int length = kbiVarArr.length;
            int i2 = 0;
            kbj kbjVar = obj;
            while (i2 < length) {
                kbj kbjVar2 = new kbj(kbiVarArr[i2], kbjVar);
                i2++;
                kbjVar = kbjVar2;
            }
            kuq h = kuqVar2.h(kbjVar);
            this.e.o(new kuq(new klk(kmaVar, (kae) h.b, this.g, this.a, klwVar.t, klwVar.v), h.a));
        } catch (Throwable th) {
            this.d.g(klw.c);
            this.c.d(kbq.c(th), new kaa());
            this.a.j(null);
            this.e.cancel(false);
            throw th;
        }
    }
}
