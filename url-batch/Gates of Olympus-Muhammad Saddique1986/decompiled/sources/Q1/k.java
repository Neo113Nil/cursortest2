package Q1;

import I.C0174t;
import androidx.lifecycle.V;
import androidx.lifecycle.X;

/* loaded from: classes.dex */
public final class k implements X {

    /* renamed from: a, reason: collision with root package name */
    public final C0174t f3993a;

    public k(C0174t c0174t) {
        f2.j.f(c0174t, "container");
        this.f3993a = c0174t;
    }

    @Override // androidx.lifecycle.X
    public final V a(Class cls) {
        boolean isAssignableFrom = cls.isAssignableFrom(f.class);
        C0174t c0174t = this.f3993a;
        if (isAssignableFrom) {
            return new f(c0174t);
        }
        if (cls.isAssignableFrom(c.class)) {
            return new c(c0174t);
        }
        if (cls.isAssignableFrom(j.class)) {
            return new j(c0174t);
        }
        if (cls.isAssignableFrom(g.class)) {
            return new g(c0174t);
        }
        throw new IllegalArgumentException("Unknown ViewModel: ".concat(cls.getName()));
    }
}
