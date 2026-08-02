package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gkg implements jrq {
    public final gko a;
    private final Object b = new Object();
    private final gld c;
    private final gla d;
    private volatile bnf e;

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, jsb] */
    public gkg(frv frvVar, gld gldVar, Object obj) {
        gla glaVar;
        this.c = gldVar;
        iwq j = ((gke) imq.a(obj, gke.class)).j();
        synchronized (j.d) {
            if (!j.a.containsKey(frvVar)) {
                ?? r2 = j.a;
                hoq.K(iwe.a(((glu) j.c).a.getApplicationContext()) instanceof jrq, "Sting Activity must be attached to an @Sting Application. Found: %s", ((glu) j.c).a.getApplicationContext());
                Object obj2 = ((cka) j.b).a;
                r2.put(frvVar, new gla(frvVar, ((jri) ((iyi) obj2).a).a(), (glu) ((iyi) obj2).b.b(), ((gkx) ((iyi) obj2).c).b()));
            }
            glaVar = (gla) j.a.get(frvVar);
        }
        this.d = glaVar;
        gko gkoVar = new gko(frvVar, gldVar, obj);
        this.a = gkoVar;
        ago P = gldVar.P();
        jxh jxhVar = gkoVar.a().f;
        fao.c();
        int i = jxhVar.a;
        if (i != 3) {
            if (i == 2) {
                ((jqw) jxhVar.b).b(P);
            }
            jxhVar.a = 3;
        }
        gldVar.L().a(new gkd(jxhVar, 0));
    }

    @Override // defpackage.jrq
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bnf C() {
        if (this.e == null) {
            synchronized (this.b) {
                if (this.e == null) {
                    bmx C = this.d.C();
                    glt C2 = this.a.C();
                    bnw b = ((gkf) imq.a(C, gkf.class)).b();
                    C2.getClass();
                    b.a = C2;
                    b.b = this.c;
                    iwm.a(b.a, glt.class);
                    iwm.a(b.b, gld.class);
                    this.e = new bnf(b.c, b.d, b.e, b.f, b.b);
                }
            }
        }
        return this.e;
    }
}
