package t2;

import h1.C0499q;
import s2.EnumC0967a;
import u2.AbstractC1155g;
import u2.C1154f;

/* renamed from: t2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1050c extends AbstractC1155g {

    /* renamed from: g, reason: collision with root package name */
    public final C0499q f9014g;

    public C1050c(C0499q c0499q, V1.i iVar, int i3, EnumC0967a enumC0967a) {
        super(iVar, i3, enumC0967a);
        this.f9014g = c0499q;
    }

    @Override // u2.AbstractC1155g
    public final Object f(s2.t tVar, C1154f c1154f) {
        Object h3 = this.f9014g.h(tVar, c1154f);
        return h3 == W1.a.f4608d ? h3 : R1.y.f4171a;
    }

    @Override // u2.AbstractC1155g
    public final AbstractC1155g g(V1.i iVar, int i3, EnumC0967a enumC0967a) {
        return new C1050c(this.f9014g, iVar, i3, enumC0967a);
    }

    @Override // u2.AbstractC1155g
    public final String toString() {
        return "block[" + this.f9014g + "] -> " + super.toString();
    }
}
