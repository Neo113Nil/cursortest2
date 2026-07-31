package x;

import m0.h1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class q0 implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f8268a;

    /* renamed from: b, reason: collision with root package name */
    public final h1 f8269b;

    public q0(b0 b0Var, String str) {
        this.f8268a = str;
        this.f8269b = m0.b.q(b0Var);
    }

    @Override // x.r0
    public final int a(r2.c cVar) {
        return e().f8202d;
    }

    @Override // x.r0
    public final int b(r2.c cVar, r2.l lVar) {
        return e().f8199a;
    }

    @Override // x.r0
    public final int c(r2.c cVar, r2.l lVar) {
        return e().f8201c;
    }

    @Override // x.r0
    public final int d(r2.c cVar) {
        return e().f8200b;
    }

    public final b0 e() {
        return (b0) this.f8269b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q0) {
            return q6.i.a(e(), ((q0) obj).e());
        }
        return false;
    }

    public final void f(b0 b0Var) {
        this.f8269b.setValue(b0Var);
    }

    public final int hashCode() {
        return this.f8268a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8268a);
        sb.append("(left=");
        sb.append(e().f8199a);
        sb.append(", top=");
        sb.append(e().f8200b);
        sb.append(", right=");
        sb.append(e().f8201c);
        sb.append(", bottom=");
        return a0.q.k(sb, e().f8202d, ')');
    }
}
