package z;

import B0.C;
import I2.l;
import M1.B;

/* renamed from: z.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1066b {

    /* renamed from: h, reason: collision with root package name */
    public static C1066b f8867h;

    /* renamed from: a, reason: collision with root package name */
    public final M0.j f8868a;

    /* renamed from: b, reason: collision with root package name */
    public final C f8869b;

    /* renamed from: c, reason: collision with root package name */
    public final M0.c f8870c;

    /* renamed from: d, reason: collision with root package name */
    public final F0.e f8871d;

    /* renamed from: e, reason: collision with root package name */
    public final C f8872e;

    /* renamed from: f, reason: collision with root package name */
    public float f8873f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    public float f8874g = Float.NaN;

    public C1066b(M0.j jVar, C c3, M0.c cVar, F0.e eVar) {
        this.f8868a = jVar;
        this.f8869b = c3;
        this.f8870c = cVar;
        this.f8871d = eVar;
        this.f8872e = l.O(c3, jVar);
    }

    public final long a(long j3, int i3) {
        int i4;
        float f3 = this.f8874g;
        float f4 = this.f8873f;
        if (Float.isNaN(f3) || Float.isNaN(f4)) {
            String str = AbstractC1067c.f8875a;
            long b2 = l.b(0, 0, 15);
            M0.c cVar = this.f8870c;
            float b3 = B.e(str, this.f8872e, b2, cVar, this.f8871d, 1).b();
            float b4 = B.e(AbstractC1067c.f8876b, this.f8872e, l.b(0, 0, 15), cVar, this.f8871d, 2).b() - b3;
            this.f8874g = b3;
            this.f8873f = b4;
            f4 = b4;
            f3 = b3;
        }
        if (i3 != 1) {
            int round = Math.round((f4 * (i3 - 1)) + f3);
            i4 = round >= 0 ? round : 0;
            int g3 = M0.a.g(j3);
            if (i4 > g3) {
                i4 = g3;
            }
        } else {
            i4 = M0.a.i(j3);
        }
        return l.a(M0.a.j(j3), M0.a.h(j3), i4, M0.a.g(j3));
    }
}
