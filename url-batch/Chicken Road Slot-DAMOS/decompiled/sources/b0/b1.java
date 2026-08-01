package b0;

import kotlin.jvm.internal.Intrinsics;
import n0.j1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b1 implements c1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f808a;

    /* renamed from: b, reason: collision with root package name */
    public final j1 f809b;

    public b1(h0 h0Var, String str) {
        this.f808a = str;
        this.f809b = n0.h.r(h0Var);
    }

    @Override // b0.c1
    public final int a(c2.o0 o0Var) {
        return e().f853d;
    }

    @Override // b0.c1
    public final int b(c2.o0 o0Var, x2.l lVar) {
        return e().f850a;
    }

    @Override // b0.c1
    public final int c(c2.o0 o0Var) {
        return e().f851b;
    }

    @Override // b0.c1
    public final int d(c2.o0 o0Var, x2.l lVar) {
        return e().f852c;
    }

    public final h0 e() {
        return (h0) this.f809b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            return Intrinsics.a(e(), ((b1) obj).e());
        }
        return false;
    }

    public final void f(h0 h0Var) {
        this.f809b.setValue(h0Var);
    }

    public final int hashCode() {
        return this.f808a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f808a);
        sb2.append("(left=");
        sb2.append(e().f850a);
        sb2.append(", top=");
        sb2.append(e().f851b);
        sb2.append(", right=");
        sb2.append(e().f852c);
        sb2.append(", bottom=");
        return v4.a.m(sb2, e().f853d, ')');
    }
}
