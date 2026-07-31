package p;

/* renamed from: p.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0784q0 implements U {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0793v0 f7755a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0787s0 f7756b;

    public C0784q0(C0793v0 c0793v0, C0787s0 c0787s0) {
        this.f7755a = c0793v0;
        this.f7756b = c0787s0;
    }

    @Override // p.U
    public final float a(float f3) {
        C0793v0 c0793v0 = this.f7755a;
        long d3 = c0793v0.d(c0793v0.g(f3));
        C0793v0 c0793v02 = this.f7756b.f7767a;
        c0793v02.f7784g = 2;
        n.l0 l0Var = c0793v02.f7779b;
        return c0793v0.c(c0793v0.f((l0Var == null || !(c0793v02.f7778a.a() || c0793v02.f7778a.c())) ? C0793v0.a(c0793v02, c0793v02.f7785h, d3, 2) : l0Var.c(d3, c0793v02.f7784g, c0793v02.f7787j)));
    }
}
