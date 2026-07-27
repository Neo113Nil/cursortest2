package z;

import A0.L;
import a.AbstractC0345a;
import u3.l;

/* renamed from: z.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1347b {

    /* renamed from: h, reason: collision with root package name */
    public static C1347b f11696h;

    /* renamed from: a, reason: collision with root package name */
    public final M0.k f11697a;

    /* renamed from: b, reason: collision with root package name */
    public final L f11698b;

    /* renamed from: c, reason: collision with root package name */
    public final M0.b f11699c;

    /* renamed from: d, reason: collision with root package name */
    public final F0.d f11700d;

    /* renamed from: e, reason: collision with root package name */
    public final L f11701e;

    /* renamed from: f, reason: collision with root package name */
    public float f11702f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    public float f11703g = Float.NaN;

    public C1347b(M0.k kVar, L l4, M0.b bVar, F0.d dVar) {
        this.f11697a = kVar;
        this.f11698b = l4;
        this.f11699c = bVar;
        this.f11700d = dVar;
        this.f11701e = AbstractC0345a.E(l4, kVar);
    }

    public final long a(long j4, int i2) {
        int j5;
        float f4 = this.f11703g;
        float f5 = this.f11702f;
        if (Float.isNaN(f4) || Float.isNaN(f5)) {
            float b4 = l.K(AbstractC1348c.f11704a, this.f11701e, u3.d.b(0, 0, 15), this.f11699c, this.f11700d, null, 1, 96).b();
            float b5 = l.K(AbstractC1348c.f11705b, this.f11701e, u3.d.b(0, 0, 15), this.f11699c, this.f11700d, null, 2, 96).b() - b4;
            this.f11703g = b4;
            this.f11702f = b5;
            f5 = b5;
            f4 = b4;
        }
        if (i2 != 1) {
            int round = Math.round((f5 * (i2 - 1)) + f4);
            j5 = round >= 0 ? round : 0;
            int h4 = M0.a.h(j4);
            if (j5 > h4) {
                j5 = h4;
            }
        } else {
            j5 = M0.a.j(j4);
        }
        return u3.d.a(M0.a.k(j4), M0.a.i(j4), j5, M0.a.h(j4));
    }
}
