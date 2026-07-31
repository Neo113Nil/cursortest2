package r;

import I.C0143d;
import I.C0156j0;

/* loaded from: classes.dex */
public final class W implements X {

    /* renamed from: a, reason: collision with root package name */
    public final String f8000a;

    /* renamed from: b, reason: collision with root package name */
    public final C0156j0 f8001b;

    public W(C0844F c0844f, String str) {
        this.f8000a = str;
        this.f8001b = C0143d.K(c0844f, I.W.f2783i);
    }

    @Override // r.X
    public final int a(O0.b bVar, O0.k kVar) {
        return e().f7964a;
    }

    @Override // r.X
    public final int b(O0.b bVar) {
        return e().f7965b;
    }

    @Override // r.X
    public final int c(O0.b bVar, O0.k kVar) {
        return e().f7966c;
    }

    @Override // r.X
    public final int d(O0.b bVar) {
        return e().f7967d;
    }

    public final C0844F e() {
        return (C0844F) this.f8001b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof W) {
            return f2.j.a(e(), ((W) obj).e());
        }
        return false;
    }

    public final void f(C0844F c0844f) {
        this.f8001b.setValue(c0844f);
    }

    public final int hashCode() {
        return this.f8000a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8000a);
        sb.append("(left=");
        sb.append(e().f7964a);
        sb.append(", top=");
        sb.append(e().f7965b);
        sb.append(", right=");
        sb.append(e().f7966c);
        sb.append(", bottom=");
        return A.k.j(sb, e().f7967d, ')');
    }
}
