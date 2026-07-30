package w;

import g0.c1;
import g0.g1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: f, reason: collision with root package name */
    public static final androidx.room.c f9454f;

    /* renamed from: a, reason: collision with root package name */
    public final c1 f9455a;

    /* renamed from: b, reason: collision with root package name */
    public final c1 f9456b = g0.d.H(0.0f);

    /* renamed from: c, reason: collision with root package name */
    public y0.d f9457c = y0.d.f9779e;

    /* renamed from: d, reason: collision with root package name */
    public long f9458d = a2.j0.f406b;

    /* renamed from: e, reason: collision with root package name */
    public final g1 f9459e;

    static {
        e eVar = e.f9219r;
        a2.a aVar = new a2.a(w0.f9452g);
        r6.y.d(1, eVar);
        androidx.room.c cVar = p0.m.f7013a;
        f9454f = new androidx.room.c(aVar, 28, eVar);
    }

    public x0(o.j0 j0Var, float f9) {
        this.f9455a = g0.d.H(f9);
        this.f9459e = g0.d.J(j0Var, g0.t0.f3903k);
    }

    public final void a(o.j0 j0Var, y0.d dVar, int i7, int i8) {
        float f9 = i8 - i7;
        this.f9456b.f(f9);
        float f10 = dVar.f9780a;
        float f11 = dVar.f9781b;
        y0.d dVar2 = this.f9457c;
        float f12 = dVar2.f9780a;
        c1 c1Var = this.f9455a;
        if (f10 != f12 || f11 != dVar2.f9781b) {
            boolean z8 = j0Var == o.j0.f6657f;
            if (z8) {
                f10 = f11;
            }
            float f13 = z8 ? dVar.f9783d : dVar.f9782c;
            float e9 = c1Var.e();
            float f14 = i7;
            float f15 = e9 + f14;
            c1Var.f(c1Var.e() + ((f13 <= f15 && (f10 >= e9 || f13 - f10 <= f14)) ? (f10 >= e9 || f13 - f10 > f14) ? 0.0f : f10 - e9 : f13 - f15));
            this.f9457c = dVar;
        }
        c1Var.f(v1.g.d(c1Var.e(), 0.0f, f9));
    }
}
