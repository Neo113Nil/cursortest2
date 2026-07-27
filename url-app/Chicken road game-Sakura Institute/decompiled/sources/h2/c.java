package h2;

import g2.C0639b;
import j2.C0715e;
import o2.C0924c;
import o2.s;

/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: d, reason: collision with root package name */
    public final C0639b f6872d;

    public c(e eVar, g2.e eVar2, C0639b c0639b) {
        super(2, eVar, eVar2);
        this.f6872d = c0639b;
    }

    @Override // h2.d
    public final d a(C0924c c0924c) {
        g2.e eVar = (g2.e) this.f6875c;
        boolean isEmpty = eVar.isEmpty();
        C0639b c0639b = this.f6872d;
        e eVar2 = (e) this.f6874b;
        if (!isEmpty) {
            if (eVar.C().equals(c0924c)) {
                return new c(eVar2, eVar.F(), c0639b);
            }
            return null;
        }
        C0639b w4 = c0639b.w(new g2.e(c0924c));
        C0715e c0715e = w4.f6678d;
        if (c0715e.isEmpty()) {
            return null;
        }
        Object obj = c0715e.f7159d;
        return ((s) obj) != null ? new f(eVar2, g2.e.f6694j, (s) obj) : new c(eVar2, g2.e.f6694j, w4);
    }

    public final String toString() {
        return "Merge { path=" + ((g2.e) this.f6875c) + ", source=" + ((e) this.f6874b) + ", children=" + this.f6872d + " }";
    }
}
