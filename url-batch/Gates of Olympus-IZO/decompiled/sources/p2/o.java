package p2;

import k2.AbstractC0528A;
import k2.AbstractC0546s;
import k2.B;
import k2.C0536h;
import k2.G;
import k2.r0;

/* loaded from: classes.dex */
public final class o extends AbstractC0546s implements B {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ B f6800f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0546s f6801g;

    /* renamed from: h, reason: collision with root package name */
    public final String f6802h;

    /* JADX WARN: Multi-variable type inference failed */
    public o(AbstractC0546s abstractC0546s, String str) {
        B b2 = abstractC0546s instanceof B ? (B) abstractC0546s : null;
        this.f6800f = b2 == null ? AbstractC0528A.f5309a : b2;
        this.f6801g = abstractC0546s;
        this.f6802h = str;
    }

    @Override // k2.AbstractC0546s
    public final void P(P1.i iVar, Runnable runnable) {
        this.f6801g.P(iVar, runnable);
    }

    @Override // k2.AbstractC0546s
    public final boolean Q(P1.i iVar) {
        return this.f6801g.Q(iVar);
    }

    @Override // k2.B
    public final G i(long j3, r0 r0Var, P1.i iVar) {
        return this.f6800f.i(j3, r0Var, iVar);
    }

    @Override // k2.AbstractC0546s
    public final String toString() {
        return this.f6802h;
    }

    @Override // k2.B
    public final void u(long j3, C0536h c0536h) {
        this.f6800f.u(j3, c0536h);
    }
}
