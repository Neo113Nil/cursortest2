package w0;

import l1.InterfaceFutureC0490a;

/* loaded from: classes.dex */
public final class j extends h {
    public final boolean i(Object obj) {
        if (obj == null) {
            obj = h.f6172l;
        }
        if (!h.f6171k.e(this, null, obj)) {
            return false;
        }
        h.c(this);
        return true;
    }

    public final boolean j(Throwable th) {
        if (!h.f6171k.e(this, null, new C0710b(th))) {
            return false;
        }
        h.c(this);
        return true;
    }

    public final boolean k(InterfaceFutureC0490a interfaceFutureC0490a) {
        C0710b c0710b;
        interfaceFutureC0490a.getClass();
        Object obj = this.f6173f;
        if (obj == null) {
            if (interfaceFutureC0490a.isDone()) {
                if (h.f6171k.e(this, null, h.f(interfaceFutureC0490a))) {
                    h.c(this);
                    return true;
                }
                return false;
            }
            e eVar = new e(this, interfaceFutureC0490a);
            if (h.f6171k.e(this, null, eVar)) {
                try {
                    interfaceFutureC0490a.a(eVar, i.f6176f);
                    return true;
                } catch (Throwable th) {
                    try {
                        c0710b = new C0710b(th);
                    } catch (Throwable unused) {
                        c0710b = C0710b.f6153b;
                    }
                    h.f6171k.e(this, eVar, c0710b);
                    return true;
                }
            }
            obj = this.f6173f;
        }
        if (obj instanceof C0709a) {
            interfaceFutureC0490a.cancel(((C0709a) obj).f6151a);
        }
        return false;
    }
}
