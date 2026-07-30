package q2;

import com.google.android.gms.internal.ads.C2549Fc;

/* loaded from: classes.dex */
public final class c1 extends AbstractBinderC4926z {

    /* renamed from: n, reason: collision with root package name */
    public final k2.x f40004n;

    /* renamed from: u, reason: collision with root package name */
    public final C2549Fc f40005u;

    public c1(k2.x xVar, C2549Fc c2549Fc) {
        this.f40004n = xVar;
        this.f40005u = c2549Fc;
    }

    @Override // q2.InterfaceC4873A
    public final void U(C4927z0 c4927z0) {
        k2.x xVar = this.f40004n;
        if (xVar != null) {
            xVar.onAdFailedToLoad(c4927z0.b());
        }
    }

    @Override // q2.InterfaceC4873A
    public final void z() {
        C2549Fc c2549Fc;
        k2.x xVar = this.f40004n;
        if (xVar == null || (c2549Fc = this.f40005u) == null) {
            return;
        }
        xVar.onAdLoaded(c2549Fc);
    }
}
