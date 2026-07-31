package b0;

import a0.C0239d;
import a0.C0240e;

/* loaded from: classes.dex */
public final class J extends K {

    /* renamed from: a, reason: collision with root package name */
    public final C0240e f5353a;

    /* renamed from: b, reason: collision with root package name */
    public final C0341j f5354b;

    public J(C0240e c0240e) {
        C0341j c0341j;
        this.f5353a = c0240e;
        if (O2.l.j0(c0240e)) {
            c0341j = null;
        } else {
            c0341j = M.h();
            L.a(c0341j, c0240e);
        }
        this.f5354b = c0341j;
    }

    @Override // b0.K
    public final C0239d a() {
        C0240e c0240e = this.f5353a;
        return new C0239d(c0240e.f4728a, c0240e.f4729b, c0240e.f4730c, c0240e.f4731d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof J) {
            return f2.j.a(this.f5353a, ((J) obj).f5353a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5353a.hashCode();
    }
}
