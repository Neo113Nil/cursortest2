package m0;

import E.AbstractC0005f;
import q0.a0;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final p f14428a;

    /* renamed from: b, reason: collision with root package name */
    public final u0.n f14429b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f14430c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14431d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14432e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f14433f;

    public q(r rVar, v vVar, int i4, InterfaceC1290c interfaceC1290c) {
        this.f14433f = rVar;
        this.f14429b = new u0.n(AbstractC0005f.j(i4, "ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper "));
        a0 a0Var = new a0(rVar.f14434a, null, null);
        this.f14430c = a0Var;
        this.f14428a = new p(rVar, vVar, i4, a0Var, interfaceC1290c);
        a0Var.f14964f = rVar.f14436c;
    }

    public final void a() {
        if (this.f14431d) {
            return;
        }
        this.f14428a.f14425b.f14360j = true;
        this.f14431d = true;
        r.a(this.f14433f);
    }
}
