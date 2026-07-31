package n2;

import e1.C0368q;
import m2.EnumC0626a;
import o2.AbstractC0758g;
import o2.C0757f;

/* renamed from: n2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0697c extends AbstractC0758g {

    /* renamed from: g, reason: collision with root package name */
    public final C0368q f6331g;

    public C0697c(C0368q c0368q, P1.i iVar, int i3, EnumC0626a enumC0626a) {
        super(iVar, i3, enumC0626a);
        this.f6331g = c0368q;
    }

    @Override // o2.AbstractC0758g
    public final Object e(m2.r rVar, C0757f c0757f) {
        Object g3 = this.f6331g.g(rVar, c0757f);
        return g3 == Q1.a.f3113d ? g3 : L1.z.f2729a;
    }

    @Override // o2.AbstractC0758g
    public final AbstractC0758g f(P1.i iVar, int i3, EnumC0626a enumC0626a) {
        return new C0697c(this.f6331g, iVar, i3, enumC0626a);
    }

    @Override // o2.AbstractC0758g
    public final String toString() {
        return "block[" + this.f6331g + "] -> " + super.toString();
    }
}
