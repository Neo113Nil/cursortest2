package defpackage;

import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cks extends cjg {
    private final hel b;

    public cks(List list) {
        this.b = hel.o(list);
    }

    @Override // defpackage.cjg
    public final hvi a(cjw cjwVar) {
        hel helVar = this.b;
        heg d = hel.d(helVar.size());
        int size = helVar.size();
        for (int i = 0; i < size; i++) {
            d.h(((cjg) helVar.get(i)).a(cjwVar));
        }
        return hti.f(hnu.aG(d.g()), new bwv(20), huf.a);
    }

    @Override // defpackage.cjg
    public final jok b() {
        Stream flatMap = Collection.EL.stream(this.b).flatMap(new ejs(1));
        int i = hel.d;
        hel helVar = (hel) flatMap.collect(hby.a);
        if (helVar.isEmpty()) {
            return null;
        }
        jkj k = jok.a.k();
        int size = helVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            k.w((jok) helVar.get(i2));
        }
        return (jok) k.q();
    }
}
