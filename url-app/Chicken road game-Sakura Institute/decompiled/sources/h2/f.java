package h2;

import o2.C0924c;
import o2.s;

/* loaded from: classes.dex */
public final class f extends d {

    /* renamed from: d, reason: collision with root package name */
    public final s f6881d;

    public f(e eVar, g2.e eVar2, s sVar) {
        super(1, eVar, eVar2);
        this.f6881d = sVar;
    }

    @Override // h2.d
    public final d a(C0924c c0924c) {
        g2.e eVar = (g2.e) this.f6875c;
        boolean isEmpty = eVar.isEmpty();
        s sVar = this.f6881d;
        e eVar2 = (e) this.f6874b;
        return isEmpty ? new f(eVar2, g2.e.f6694j, sVar.b(c0924c)) : new f(eVar2, eVar.F(), sVar);
    }

    public final String toString() {
        return String.format("Overwrite { path=%s, source=%s, snapshot=%s }", (g2.e) this.f6875c, (e) this.f6874b, this.f6881d);
    }
}
