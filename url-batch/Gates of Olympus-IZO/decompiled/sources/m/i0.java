package m;

import f.AbstractC0382a;
import h1.C0438i;

/* loaded from: classes.dex */
public final class i0 extends Z1.j implements Y1.c {

    /* renamed from: f, reason: collision with root package name */
    public static final i0 f5755f = new i0(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final i0 f5756g = new i0(1, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final i0 f5757h = new i0(1, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final i0 f5758i = new i0(1, 3);

    /* renamed from: j, reason: collision with root package name */
    public static final i0 f5759j = new i0(1, 4);

    /* renamed from: k, reason: collision with root package name */
    public static final i0 f5760k = new i0(1, 5);

    /* renamed from: l, reason: collision with root package name */
    public static final i0 f5761l = new i0(1, 6);

    /* renamed from: m, reason: collision with root package name */
    public static final i0 f5762m = new i0(1, 7);

    /* renamed from: n, reason: collision with root package name */
    public static final i0 f5763n = new i0(1, 8);

    /* renamed from: o, reason: collision with root package name */
    public static final i0 f5764o = new i0(1, 9);
    public static final i0 p = new i0(1, 10);

    /* renamed from: q, reason: collision with root package name */
    public static final i0 f5765q = new i0(1, 11);

    /* renamed from: r, reason: collision with root package name */
    public static final i0 f5766r = new i0(1, 12);

    /* renamed from: s, reason: collision with root package name */
    public static final i0 f5767s = new i0(1, 13);

    /* renamed from: t, reason: collision with root package name */
    public static final i0 f5768t = new i0(1, 14);

    /* renamed from: u, reason: collision with root package name */
    public static final i0 f5769u = new i0(1, 15);

    /* renamed from: v, reason: collision with root package name */
    public static final i0 f5770v = new i0(1, 16);

    /* renamed from: w, reason: collision with root package name */
    public static final i0 f5771w = new i0(1, 17);

    /* renamed from: x, reason: collision with root package name */
    public static final i0 f5772x = new i0(1, 18);

    /* renamed from: y, reason: collision with root package name */
    public static final i0 f5773y = new i0(1, 19);

    /* renamed from: z, reason: collision with root package name */
    public static final i0 f5774z = new i0(1, 20);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5775e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(int i3, int i4) {
        super(i3);
        this.f5775e = i4;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [L1.g, java.lang.Object] */
    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f5775e) {
            case 0:
                return L1.z.f2729a;
            case 1:
                ((Y1.a) obj).b();
                return L1.z.f2729a;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                Z z3 = (Z) obj;
                long j3 = z3.f5664f;
                ((S.w) v0.f5874a.getValue()).b(z3, f5757h, z3.f5665g);
                long j4 = z3.f5664f;
                if (j3 != j4) {
                    N n3 = z3.f5672n;
                    if (n3 != null) {
                        n3.f5609g = j4;
                        if (n3.f5604b == null) {
                            n3.f5610h = M1.B.N((1.0d - n3.f5607e.a(0)) * z3.f5664f);
                        }
                    } else if (j4 != 0) {
                        z3.n();
                    }
                }
                return L1.z.f2729a;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                long j5 = ((M0.f) obj).f2767a;
                return new C0605o(Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L)));
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                C0605o c0605o = (C0605o) obj;
                return new M0.f((Float.floatToRawIntBits(c0605o.f5811a) << 32) | (Float.floatToRawIntBits(c0605o.f5812b) & 4294967295L));
            case 5:
                return new C0604n(((M0.e) obj).f2766d);
            case 6:
                return new M0.e(((C0604n) obj).f5808a);
            case C0438i.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C0604n(((Number) obj).floatValue());
            case 8:
                return Float.valueOf(((C0604n) obj).f5808a);
            case AbstractC0382a.f4777a /* 9 */:
                long j6 = ((M0.g) obj).f2768a;
                return new C0605o((int) (j6 >> 32), (int) (j6 & 4294967295L));
            case AbstractC0382a.f4779c /* 10 */:
                C0605o c0605o2 = (C0605o) obj;
                return new M0.g(I2.d.c(Math.round(c0605o2.f5811a), Math.round(c0605o2.f5812b)));
            case 11:
                long j7 = ((M0.i) obj).f2774a;
                return new C0605o((int) (j7 >> 32), (int) (j7 & 4294967295L));
            case 12:
                C0605o c0605o3 = (C0605o) obj;
                int round = Math.round(c0605o3.f5811a);
                if (round < 0) {
                    round = 0;
                }
                int round2 = Math.round(c0605o3.f5812b);
                return new M0.i(I2.l.e(round, round2 >= 0 ? round2 : 0));
            case 13:
                return new C0604n(((Number) obj).intValue());
            case 14:
                return Integer.valueOf((int) ((C0604n) obj).f5808a);
            case AbstractC0382a.f4781e /* 15 */:
                long j8 = ((a0.c) obj).f3489a;
                return new C0605o(a0.c.d(j8), a0.c.e(j8));
            case 16:
                C0605o c0605o4 = (C0605o) obj;
                return new a0.c(I2.l.f(c0605o4.f5811a, c0605o4.f5812b));
            case 17:
                a0.d dVar = (a0.d) obj;
                return new C0607q(dVar.f3491a, dVar.f3492b, dVar.f3493c, dVar.f3494d);
            case 18:
                C0607q c0607q = (C0607q) obj;
                return new a0.d(c0607q.f5832a, c0607q.f5833b, c0607q.f5834c, c0607q.f5835d);
            case 19:
                long j9 = ((a0.f) obj).f3503a;
                return new C0605o(a0.f.d(j9), a0.f.b(j9));
            default:
                C0605o c0605o5 = (C0605o) obj;
                return new a0.f(I2.d.h(c0605o5.f5811a, c0605o5.f5812b));
        }
    }
}
