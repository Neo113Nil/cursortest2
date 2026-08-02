package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iew implements jwz {
    private final Map a = new HashMap();
    private final hac b;

    public iew(hac hacVar) {
        this.b = hacVar;
    }

    @Override // defpackage.jwz
    public final iws a(kae kaeVar, jww jwwVar, jwx jwxVar) {
        gzp gzpVar;
        icn icnVar = (icn) jwwVar.e(ico.a);
        icx icxVar = icnVar.h;
        jwv jwvVar = icy.a;
        icy icyVar = (icy) jwwVar.e(jwvVar);
        if (icyVar.d() == 2) {
            String str = (String) jwwVar.e(ida.a);
            if (str == null) {
                str = ((icy) jwwVar.e(jwvVar)).b().a().a;
            }
            iev ievVar = new iev(str, (idf) jwwVar.e(idf.a), kaeVar.b);
            Map map = this.a;
            synchronized (map) {
                gzpVar = (gzp) map.get(ievVar);
                if (gzpVar == null) {
                    gzpVar = gzp.g(icxVar.a());
                    map.put(ievVar, gzpVar);
                }
            }
            if (gzpVar.f()) {
                hln hlnVar = idt.a;
                ids idsVar = new ids();
                idsVar.a = icyVar;
                idsVar.b = (idu) gzpVar.b();
                idsVar.c = icnVar.d;
                idsVar.d = this.b;
                idsVar.a.getClass();
                idsVar.b.getClass();
                idsVar.c.getClass();
                idsVar.d.getClass();
                return ikg.r(new eqn(new idt(idsVar), 17)).a(kaeVar, jwwVar, jwxVar);
            }
        }
        return jwxVar.b(kaeVar, jwwVar);
    }
}
