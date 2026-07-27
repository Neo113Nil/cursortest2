package q;

import A.AbstractC0017m;
import G.C0192d;
import G.C0205j0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f9280a;

    /* renamed from: b, reason: collision with root package name */
    public final C0205j0 f9281b;

    public l0(C1015T c1015t, String str) {
        this.f9280a = str;
        this.f9281b = C0192d.K(c1015t, G.W.f2779l);
    }

    @Override // q.m0
    public final int a(M0.b bVar) {
        return e().f9214b;
    }

    @Override // q.m0
    public final int b(M0.b bVar, M0.k kVar) {
        return e().f9215c;
    }

    @Override // q.m0
    public final int c(M0.b bVar) {
        return e().f9216d;
    }

    @Override // q.m0
    public final int d(M0.b bVar, M0.k kVar) {
        return e().f9213a;
    }

    public final C1015T e() {
        return (C1015T) this.f9281b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l0) {
            return Intrinsics.a(e(), ((l0) obj).e());
        }
        return false;
    }

    public final void f(C1015T c1015t) {
        this.f9281b.setValue(c1015t);
    }

    public final int hashCode() {
        return this.f9280a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9280a);
        sb.append("(left=");
        sb.append(e().f9213a);
        sb.append(", top=");
        sb.append(e().f9214b);
        sb.append(", right=");
        sb.append(e().f9215c);
        sb.append(", bottom=");
        return AbstractC0017m.l(sb, e().f9216d, ')');
    }
}
