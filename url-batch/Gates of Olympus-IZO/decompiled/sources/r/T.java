package r;

import H2.AbstractC0080b;
import I.C0089d;
import I.C0102j0;

/* loaded from: classes.dex */
public final class T implements U {

    /* renamed from: a, reason: collision with root package name */
    public final String f7026a;

    /* renamed from: b, reason: collision with root package name */
    public final C0102j0 f7027b;

    public T(C0792D c0792d, String str) {
        this.f7026a = str;
        this.f7027b = C0089d.J(c0792d, I.X.f2228i);
    }

    @Override // r.U
    public final int a(M0.b bVar) {
        return e().f6994b;
    }

    @Override // r.U
    public final int b(M0.b bVar, M0.j jVar) {
        return e().f6995c;
    }

    @Override // r.U
    public final int c(M0.b bVar) {
        return e().f6996d;
    }

    @Override // r.U
    public final int d(M0.b bVar, M0.j jVar) {
        return e().f6993a;
    }

    public final C0792D e() {
        return (C0792D) this.f7027b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof T) {
            return Z1.i.a(e(), ((T) obj).e());
        }
        return false;
    }

    public final void f(C0792D c0792d) {
        this.f7027b.setValue(c0792d);
    }

    public final int hashCode() {
        return this.f7026a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7026a);
        sb.append("(left=");
        sb.append(e().f6993a);
        sb.append(", top=");
        sb.append(e().f6994b);
        sb.append(", right=");
        sb.append(e().f6995c);
        sb.append(", bottom=");
        return AbstractC0080b.k(sb, e().f6996d, ')');
    }
}
