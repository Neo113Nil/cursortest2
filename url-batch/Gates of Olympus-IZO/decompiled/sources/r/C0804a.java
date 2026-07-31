package r;

import H2.AbstractC0080b;
import I.C0089d;
import I.C0102j0;

/* renamed from: r.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0804a implements U {

    /* renamed from: a, reason: collision with root package name */
    public final int f7050a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7051b;

    /* renamed from: c, reason: collision with root package name */
    public final C0102j0 f7052c;

    /* renamed from: d, reason: collision with root package name */
    public final C0102j0 f7053d;

    public C0804a(String str, int i3) {
        this.f7050a = i3;
        this.f7051b = str;
        V0.c cVar = V0.c.f3348e;
        I.X x3 = I.X.f2228i;
        this.f7052c = C0089d.J(cVar, x3);
        this.f7053d = C0089d.J(Boolean.TRUE, x3);
    }

    @Override // r.U
    public final int a(M0.b bVar) {
        return e().f3350b;
    }

    @Override // r.U
    public final int b(M0.b bVar, M0.j jVar) {
        return e().f3351c;
    }

    @Override // r.U
    public final int c(M0.b bVar) {
        return e().f3352d;
    }

    @Override // r.U
    public final int d(M0.b bVar, M0.j jVar) {
        return e().f3349a;
    }

    public final V0.c e() {
        return (V0.c) this.f7052c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0804a) {
            return this.f7050a == ((C0804a) obj).f7050a;
        }
        return false;
    }

    public final void f(a1.Q q2, int i3) {
        int i4 = this.f7050a;
        if (i3 == 0 || (i3 & i4) != 0) {
            this.f7052c.setValue(q2.f3542a.f(i4));
            this.f7053d.setValue(Boolean.valueOf(q2.f3542a.o(i4)));
        }
    }

    public final int hashCode() {
        return this.f7050a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7051b);
        sb.append('(');
        sb.append(e().f3349a);
        sb.append(", ");
        sb.append(e().f3350b);
        sb.append(", ");
        sb.append(e().f3351c);
        sb.append(", ");
        return AbstractC0080b.k(sb, e().f3352d, ')');
    }
}
