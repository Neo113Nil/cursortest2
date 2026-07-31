package A;

import C0.K;
import a.AbstractC0235a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static b f2h;

    /* renamed from: a, reason: collision with root package name */
    public final O0.k f3a;

    /* renamed from: b, reason: collision with root package name */
    public final K f4b;

    /* renamed from: c, reason: collision with root package name */
    public final O0.c f5c;

    /* renamed from: d, reason: collision with root package name */
    public final H0.d f6d;

    /* renamed from: e, reason: collision with root package name */
    public final K f7e;

    /* renamed from: f, reason: collision with root package name */
    public float f8f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    public float f9g = Float.NaN;

    public b(O0.k kVar, K k3, O0.c cVar, H0.d dVar) {
        this.f3a = kVar;
        this.f4b = k3;
        this.f5c = cVar;
        this.f6d = dVar;
        this.f7e = AbstractC0235a.G(k3, kVar);
    }

    public final long a(long j3, int i3) {
        int i4;
        float f3 = this.f9g;
        float f4 = this.f8f;
        if (Float.isNaN(f3) || Float.isNaN(f4)) {
            String str = c.f10a;
            long b3 = O2.d.b(0, 0, 15);
            O0.c cVar = this.f5c;
            float b4 = O2.d.e(str, this.f7e, b3, cVar, this.f6d, null, 1, 96).b();
            f4 = O2.d.e(c.f11b, this.f7e, O2.d.b(0, 0, 15), cVar, this.f6d, null, 2, 96).b() - b4;
            this.f9g = b4;
            this.f8f = f4;
            f3 = b4;
        }
        if (i3 != 1) {
            int round = Math.round((f4 * (i3 - 1)) + f3);
            i4 = round >= 0 ? round : 0;
            int g3 = O0.a.g(j3);
            if (i4 > g3) {
                i4 = g3;
            }
        } else {
            i4 = O0.a.i(j3);
        }
        return O2.d.a(O0.a.j(j3), O0.a.h(j3), i4, O0.a.g(j3));
    }
}
