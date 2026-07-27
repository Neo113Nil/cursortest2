package o;

/* renamed from: o.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0899m0 implements S {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0908r0 f8830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0903o0 f8831b;

    public C0899m0(C0908r0 c0908r0, C0903o0 c0903o0) {
        this.f8830a = c0908r0;
        this.f8831b = c0903o0;
    }

    @Override // o.S
    public final float a(float f4) {
        C0908r0 c0908r0 = this.f8830a;
        long d4 = c0908r0.d(c0908r0.g(f4));
        C0908r0 c0908r02 = this.f8831b.f8848a;
        c0908r02.f8871g = 2;
        m.i0 i0Var = c0908r02.f8866b;
        return c0908r0.c(c0908r0.f((i0Var == null || !(c0908r02.f8865a.a() || c0908r02.f8865a.c())) ? C0908r0.a(c0908r02, c0908r02.f8872h, d4, 2) : i0Var.f(d4, c0908r02.f8871g, c0908r02.f8874j)));
    }
}
