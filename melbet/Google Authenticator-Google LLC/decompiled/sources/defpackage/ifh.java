package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ifh implements jwz {
    private final koe a;
    private final Class b;
    private final Class c;

    public ifh(koe koeVar, Class cls, Class cls2) {
        this.a = koeVar;
        this.b = cls;
        this.c = cls2;
    }

    @Override // defpackage.jwz
    public final iws a(kae kaeVar, jww jwwVar, jwx jwxVar) {
        try {
            Object b = this.a.b();
            ikg.s(kaeVar, this.b, true);
            ikg.s(kaeVar, this.c, false);
            return new ifr(new ifm(jwxVar, kaeVar, jwwVar, (hel) b));
        } catch (kbr e) {
            return new igi(kbq.c(e));
        }
    }
}
