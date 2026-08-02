package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gkv implements agh {
    final /* synthetic */ gkw a;
    private final frv b;

    public gkv(gkw gkwVar, frv frvVar) {
        this.a = gkwVar;
        this.b = frvVar;
    }

    @Override // defpackage.agh
    public final /* synthetic */ agd a(Class cls) {
        return yk.d();
    }

    @Override // defpackage.agh
    public final agd b(Class cls, ago agoVar) {
        hoq.H(cls.equals(gku.class));
        afr a = afx.a(agoVar);
        jrn jrnVar = (jrn) agoVar.a(glv.a);
        if (jrnVar == null) {
            jrnVar = jrn.a;
        }
        jrn jrnVar2 = jrnVar;
        gkw gkwVar = this.a;
        frv frvVar = this.b;
        glu gluVar = gkwVar.a;
        if (gluVar instanceof jrr) {
            return new gku(a, gkwVar.b, frvVar, ((jqi) gluVar.b()).b(), jrnVar2);
        }
        throw new IllegalStateException("Host is not a Hilt activity or FragmentHost: ".concat(String.valueOf(String.valueOf(gluVar))));
    }

    @Override // defpackage.agh
    public final /* synthetic */ agd c(ktj ktjVar, ago agoVar) {
        return yk.c(this, ktjVar, agoVar);
    }
}
