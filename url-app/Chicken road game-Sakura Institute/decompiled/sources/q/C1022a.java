package q;

import A.AbstractC0017m;
import G.C0192d;
import G.C0205j0;
import a1.C0383T;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1022a implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f9230a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9231b;

    /* renamed from: c, reason: collision with root package name */
    public final C0205j0 f9232c;

    /* renamed from: d, reason: collision with root package name */
    public final C0205j0 f9233d;

    public C1022a(int i2, String str) {
        this.f9230a = i2;
        this.f9231b = str;
        V0.c cVar = V0.c.f4142e;
        G.W w4 = G.W.f2779l;
        this.f9232c = C0192d.K(cVar, w4);
        this.f9233d = C0192d.K(Boolean.TRUE, w4);
    }

    @Override // q.m0
    public final int a(M0.b bVar) {
        return e().f4144b;
    }

    @Override // q.m0
    public final int b(M0.b bVar, M0.k kVar) {
        return e().f4145c;
    }

    @Override // q.m0
    public final int c(M0.b bVar) {
        return e().f4146d;
    }

    @Override // q.m0
    public final int d(M0.b bVar, M0.k kVar) {
        return e().f4143a;
    }

    public final V0.c e() {
        return (V0.c) this.f9232c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1022a) {
            return this.f9230a == ((C1022a) obj).f9230a;
        }
        return false;
    }

    public final void f(C0383T c0383t, int i2) {
        int i4 = this.f9230a;
        if (i2 == 0 || (i2 & i4) != 0) {
            this.f9232c.setValue(c0383t.f4871a.f(i4));
            this.f9233d.setValue(Boolean.valueOf(c0383t.f4871a.o(i4)));
        }
    }

    public final int hashCode() {
        return this.f9230a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9231b);
        sb.append('(');
        sb.append(e().f4143a);
        sb.append(", ");
        sb.append(e().f4144b);
        sb.append(", ");
        sb.append(e().f4145c);
        sb.append(", ");
        return AbstractC0017m.l(sb, e().f4146d, ')');
    }
}
