package v2;

import q2.AbstractC0813A;
import q2.AbstractC0831s;
import q2.B;
import q2.C0821h;
import q2.G;
import q2.r0;

/* loaded from: classes.dex */
public final class n extends AbstractC0831s implements B {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ B f9820f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0831s f9821g;

    /* renamed from: h, reason: collision with root package name */
    public final String f9822h;

    /* JADX WARN: Multi-variable type inference failed */
    public n(AbstractC0831s abstractC0831s, String str) {
        B b3 = abstractC0831s instanceof B ? (B) abstractC0831s : null;
        this.f9820f = b3 == null ? AbstractC0813A.f7848a : b3;
        this.f9821g = abstractC0831s;
        this.f9822h = str;
    }

    @Override // q2.AbstractC0831s
    public final void D(V1.i iVar, Runnable runnable) {
        this.f9821g.D(iVar, runnable);
    }

    @Override // q2.AbstractC0831s
    public final void E(V1.i iVar, Runnable runnable) {
        this.f9821g.E(iVar, runnable);
    }

    @Override // q2.AbstractC0831s
    public final boolean F(V1.i iVar) {
        return this.f9821g.F(iVar);
    }

    @Override // q2.B
    public final void q(long j3, C0821h c0821h) {
        this.f9820f.q(j3, c0821h);
    }

    @Override // q2.AbstractC0831s
    public final String toString() {
        return this.f9822h;
    }

    @Override // q2.B
    public final G u(long j3, r0 r0Var, V1.i iVar) {
        return this.f9820f.u(j3, r0Var, iVar);
    }
}
