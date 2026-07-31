package E1;

import G1.r;
import H1.y;
import androidx.lifecycle.V;
import androidx.lifecycle.X;

/* loaded from: classes.dex */
public final class n implements X {

    /* renamed from: a, reason: collision with root package name */
    public final com.gates.olympus.miruv.data.e f772a;

    public n(com.gates.olympus.miruv.data.e eVar) {
        Z1.i.f(eVar, "repository");
        this.f772a = eVar;
    }

    @Override // androidx.lifecycle.X
    public final V a(Class cls) {
        boolean isAssignableFrom = cls.isAssignableFrom(y.class);
        com.gates.olympus.miruv.data.e eVar = this.f772a;
        if (isAssignableFrom) {
            return new y(eVar);
        }
        if (cls.isAssignableFrom(r.class)) {
            return new r(eVar);
        }
        if (cls.isAssignableFrom(I1.m.class)) {
            return new I1.m(eVar);
        }
        if (cls.isAssignableFrom(J1.k.class)) {
            return new J1.k(eVar);
        }
        throw new IllegalArgumentException("Unknown ViewModel: ".concat(cls.getName()));
    }
}
