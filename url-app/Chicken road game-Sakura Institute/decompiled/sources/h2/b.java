package h2;

import j2.AbstractC0720j;
import o2.C0924c;

/* loaded from: classes.dex */
public final class b extends d {
    public b(e eVar, g2.e eVar2) {
        super(4, eVar, eVar2);
        AbstractC0720j.b("Can't have a listen complete from a user source", !(eVar.f6878a == 1));
    }

    @Override // h2.d
    public final d a(C0924c c0924c) {
        g2.e eVar = (g2.e) this.f6875c;
        boolean isEmpty = eVar.isEmpty();
        e eVar2 = (e) this.f6874b;
        return isEmpty ? new b(eVar2, g2.e.f6694j) : new b(eVar2, eVar.F());
    }

    public final String toString() {
        return "ListenComplete { path=" + ((g2.e) this.f6875c) + ", source=" + ((e) this.f6874b) + " }";
    }
}
