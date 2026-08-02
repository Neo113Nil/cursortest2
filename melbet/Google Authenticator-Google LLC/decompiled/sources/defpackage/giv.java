package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class giv implements ggs {
    public final frv a;
    public final giz b;
    public final koe c;
    public final String d;
    public final cfe e;
    private final fug f;
    private final Executor g;

    public giv(frv frvVar, fug fugVar, cfe cfeVar, giz gizVar, koe koeVar, Executor executor, Map map, String str) {
        gizVar.getClass();
        koeVar.getClass();
        executor.getClass();
        map.getClass();
        this.a = frvVar;
        this.f = fugVar;
        this.e = cfeVar;
        this.b = gizVar;
        this.c = koeVar;
        this.g = executor;
        this.d = str;
    }

    @Override // defpackage.ggs
    public final hvi a(String str, jjq jjqVar, etm etmVar) {
        return this.b.a(etmVar, jjqVar, str, this.d);
    }

    @Override // defpackage.ggs
    public final hvi b(jjq jjqVar, etm etmVar) {
        ayb aybVar = new ayb(this, jjqVar, etmVar, 5);
        giz gizVar = this.b;
        hvi a = gizVar.c.a(gvx.b(new gib((krt) aybVar, gizVar, 3)), huf.a);
        a.getClass();
        return a;
    }

    public final hvi c(jjq jjqVar, frv frvVar, frv frvVar2, etm etmVar) {
        return (frvVar == null || !ksp.b(frvVar2, frvVar)) ? hnu.aJ(null) : hoq.au(this.f.b(frvVar2), new giu(new ayb(this, etmVar, jjqVar, 4), 0), this.g);
    }
}
