package r;

import I.C0143d;
import I.C0156j0;

/* renamed from: r.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0854a implements X {

    /* renamed from: a, reason: collision with root package name */
    public final int f8024a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8025b;

    /* renamed from: c, reason: collision with root package name */
    public final C0156j0 f8026c;

    /* renamed from: d, reason: collision with root package name */
    public final C0156j0 f8027d;

    public C0854a(String str, int i3) {
        this.f8024a = i3;
        this.f8025b = str;
        X0.c cVar = X0.c.f4622e;
        I.W w2 = I.W.f2783i;
        this.f8026c = C0143d.K(cVar, w2);
        this.f8027d = C0143d.K(Boolean.TRUE, w2);
    }

    @Override // r.X
    public final int a(O0.b bVar, O0.k kVar) {
        return e().f4623a;
    }

    @Override // r.X
    public final int b(O0.b bVar) {
        return e().f4624b;
    }

    @Override // r.X
    public final int c(O0.b bVar, O0.k kVar) {
        return e().f4625c;
    }

    @Override // r.X
    public final int d(O0.b bVar) {
        return e().f4626d;
    }

    public final X0.c e() {
        return (X0.c) this.f8026c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0854a) {
            return this.f8024a == ((C0854a) obj).f8024a;
        }
        return false;
    }

    public final void f(c1.U u3, int i3) {
        int i4 = this.f8024a;
        if (i3 == 0 || (i3 & i4) != 0) {
            this.f8026c.setValue(u3.f5589a.f(i4));
            this.f8027d.setValue(Boolean.valueOf(u3.f5589a.o(i4)));
        }
    }

    public final int hashCode() {
        return this.f8024a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8025b);
        sb.append('(');
        sb.append(e().f4623a);
        sb.append(", ");
        sb.append(e().f4624b);
        sb.append(", ");
        sb.append(e().f4625c);
        sb.append(", ");
        return A.k.j(sb, e().f4626d, ')');
    }
}
