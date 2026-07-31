package x;

import m0.h1;
import q3.l1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f8190a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8191b;

    /* renamed from: c, reason: collision with root package name */
    public final h1 f8192c = m0.b.q(i3.c.f3420e);

    /* renamed from: d, reason: collision with root package name */
    public final h1 f8193d = m0.b.q(Boolean.TRUE);

    public a(String str, int i) {
        this.f8190a = i;
        this.f8191b = str;
    }

    @Override // x.r0
    public final int a(r2.c cVar) {
        return e().f3424d;
    }

    @Override // x.r0
    public final int b(r2.c cVar, r2.l lVar) {
        return e().f3421a;
    }

    @Override // x.r0
    public final int c(r2.c cVar, r2.l lVar) {
        return e().f3423c;
    }

    @Override // x.r0
    public final int d(r2.c cVar) {
        return e().f3422b;
    }

    public final i3.c e() {
        return (i3.c) this.f8192c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f8190a == ((a) obj).f8190a;
        }
        return false;
    }

    public final void f(l1 l1Var, int i) {
        int i8 = this.f8190a;
        if (i == 0 || (i & i8) != 0) {
            this.f8192c.setValue(l1Var.f6127a.f(i8));
            this.f8193d.setValue(Boolean.valueOf(l1Var.f6127a.p(i8)));
        }
    }

    public final int hashCode() {
        return this.f8190a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8191b);
        sb.append('(');
        sb.append(e().f3421a);
        sb.append(", ");
        sb.append(e().f3422b);
        sb.append(", ");
        sb.append(e().f3423c);
        sb.append(", ");
        return a0.q.k(sb, e().f3424d, ')');
    }
}
