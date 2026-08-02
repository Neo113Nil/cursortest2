package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gml implements agh {
    final /* synthetic */ frv a;
    final /* synthetic */ cka b;

    public gml(cka ckaVar, frv frvVar) {
        this.a = frvVar;
        this.b = ckaVar;
    }

    @Override // defpackage.agh
    public final /* synthetic */ agd a(Class cls) {
        return yk.d();
    }

    @Override // defpackage.agh
    public final agd b(Class cls, ago agoVar) {
        bnc b;
        jqw jqwVar = new jqw(agoVar);
        jrn jrnVar = (jrn) agoVar.a(glv.b);
        if (jrnVar == null) {
            jrnVar = jrn.a;
        }
        boolean u = gta.u();
        cka ckaVar = this.b;
        if (u) {
            gty aA = hoq.aA(199, ckaVar.a.getClass(), "FragAccRet#Comp");
            try {
                cmq b2 = ((gmm) imq.a(ckaVar.p(this.a), gmm.class)).b();
                b2.b = jqwVar;
                b2.a = jrnVar;
                b = b2.b();
                aA.close();
            } catch (Throwable th) {
                try {
                    aA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            cmq b3 = ((gmm) imq.a(ckaVar.p(this.a), gmm.class)).b();
            b3.b = jqwVar;
            b3.a = jrnVar;
            b = b3.b();
        }
        return new gmn(b, jqwVar);
    }

    @Override // defpackage.agh
    public final /* synthetic */ agd c(ktj ktjVar, ago agoVar) {
        return yk.c(this, ktjVar, agoVar);
    }
}
