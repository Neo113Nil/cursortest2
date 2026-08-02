package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class klt extends kft {
    final /* synthetic */ jxk a;
    final /* synthetic */ hvw b;
    final /* synthetic */ kaa c;
    final /* synthetic */ kma d;
    final /* synthetic */ klp e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klt(jxk jxkVar, hvw hvwVar, kaa kaaVar, kma kmaVar, klp klpVar) {
        super(jxkVar);
        this.a = jxkVar;
        this.b = hvwVar;
        this.c = kaaVar;
        this.d = kmaVar;
        this.e = klpVar;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kbh] */
    @Override // defpackage.kft
    public final void a() {
        int i = kob.a;
        kmb kmbVar = klw.c;
        hvw hvwVar = this.b;
        if (hvwVar.isCancelled()) {
            return;
        }
        try {
            kuq kuqVar = (kuq) hnu.aR(hvwVar);
            kaa kaaVar = this.c;
            ?? r3 = kuqVar.b;
            Object obj = kuqVar.a;
            this.e.g(new klj((klk) obj, r3.a((kbg) obj, kaaVar), ((klk) obj).b));
            this.a.d(new kls(this.d), huf.a);
        } finally {
        }
    }
}
