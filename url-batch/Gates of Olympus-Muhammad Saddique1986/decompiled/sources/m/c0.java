package m;

import a.AbstractC0235a;
import a0.C0238c;
import a0.C0239d;
import a0.C0241f;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import h2.AbstractC0508a;
import r.AbstractC0856c;

/* loaded from: classes.dex */
public final class c0 extends f2.k implements InterfaceC0424c {

    /* renamed from: f, reason: collision with root package name */
    public static final c0 f6735f = new c0(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final c0 f6736g = new c0(1, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final c0 f6737h = new c0(1, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final c0 f6738i = new c0(1, 3);

    /* renamed from: j, reason: collision with root package name */
    public static final c0 f6739j = new c0(1, 4);

    /* renamed from: k, reason: collision with root package name */
    public static final c0 f6740k = new c0(1, 5);

    /* renamed from: l, reason: collision with root package name */
    public static final c0 f6741l = new c0(1, 6);

    /* renamed from: m, reason: collision with root package name */
    public static final c0 f6742m = new c0(1, 7);

    /* renamed from: n, reason: collision with root package name */
    public static final c0 f6743n = new c0(1, 8);

    /* renamed from: o, reason: collision with root package name */
    public static final c0 f6744o = new c0(1, 9);

    /* renamed from: p, reason: collision with root package name */
    public static final c0 f6745p = new c0(1, 10);

    /* renamed from: q, reason: collision with root package name */
    public static final c0 f6746q = new c0(1, 11);

    /* renamed from: r, reason: collision with root package name */
    public static final c0 f6747r = new c0(1, 12);

    /* renamed from: s, reason: collision with root package name */
    public static final c0 f6748s = new c0(1, 13);

    /* renamed from: t, reason: collision with root package name */
    public static final c0 f6749t = new c0(1, 14);

    /* renamed from: u, reason: collision with root package name */
    public static final c0 f6750u = new c0(1, 15);

    /* renamed from: v, reason: collision with root package name */
    public static final c0 f6751v = new c0(1, 16);

    /* renamed from: w, reason: collision with root package name */
    public static final c0 f6752w = new c0(1, 17);

    /* renamed from: x, reason: collision with root package name */
    public static final c0 f6753x = new c0(1, 18);

    /* renamed from: y, reason: collision with root package name */
    public static final c0 f6754y = new c0(1, 19);

    /* renamed from: z, reason: collision with root package name */
    public static final c0 f6755z = new c0(1, 20);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6756e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(int i3, int i4) {
        super(i3);
        this.f6756e = i4;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [R1.f, java.lang.Object] */
    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f6756e) {
            case 0:
                return R1.y.f4171a;
            case 1:
                ((InterfaceC0422a) obj).b();
                return R1.y.f4171a;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                U u3 = (U) obj;
                long j3 = u3.f6676f;
                ((S.w) r0.f6876a.getValue()).c(u3, f6737h, u3.f6677g);
                long j4 = u3.f6676f;
                if (j3 != j4) {
                    C0614J c0614j = u3.f6684n;
                    if (c0614j != null) {
                        c0614j.f6626g = j4;
                        if (c0614j.f6621b == null) {
                            c0614j.f6627h = AbstractC0508a.R((1.0d - c0614j.f6624e.a(0)) * u3.f6676f);
                        }
                    } else if (j4 != 0) {
                        u3.n();
                    }
                }
                return R1.y.f4171a;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                long j5 = ((O0.f) obj).f3732a;
                return new C0630o(Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L)));
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                C0630o c0630o = (C0630o) obj;
                return new O0.f((Float.floatToRawIntBits(c0630o.f6859a) << 32) | (Float.floatToRawIntBits(c0630o.f6860b) & 4294967295L));
            case 5:
                return new C0629n(((O0.e) obj).f3731d);
            case 6:
                return new O0.e(((C0629n) obj).f6855a);
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C0629n(((Number) obj).floatValue());
            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                return Float.valueOf(((C0629n) obj).f6855a);
            case AbstractC0856c.f8037c /* 9 */:
                long j6 = ((O0.h) obj).f3734a;
                return new C0630o((int) (j6 >> 32), (int) (j6 & 4294967295L));
            case AbstractC0856c.f8039e /* 10 */:
                C0630o c0630o2 = (C0630o) obj;
                return new O0.h(l0.c.c(Math.round(c0630o2.f6859a), Math.round(c0630o2.f6860b)));
            case 11:
                long j7 = ((O0.j) obj).f3740a;
                return new C0630o((int) (j7 >> 32), (int) (j7 & 4294967295L));
            case 12:
                C0630o c0630o3 = (C0630o) obj;
                int round = Math.round(c0630o3.f6859a);
                if (round < 0) {
                    round = 0;
                }
                int round2 = Math.round(c0630o3.f6860b);
                return new O0.j(O2.d.d(round, round2 >= 0 ? round2 : 0));
            case 13:
                return new C0629n(((Number) obj).intValue());
            case 14:
                return Integer.valueOf((int) ((C0629n) obj).f6855a);
            case AbstractC0856c.f8041g /* 15 */:
                long j8 = ((C0238c) obj).f4722a;
                return new C0630o(C0238c.d(j8), C0238c.e(j8));
            case 16:
                C0630o c0630o4 = (C0630o) obj;
                return new C0238c(l0.c.e(c0630o4.f6859a, c0630o4.f6860b));
            case 17:
                C0239d c0239d = (C0239d) obj;
                return new C0632q(c0239d.f4724a, c0239d.f4725b, c0239d.f4726c, c0239d.f4727d);
            case 18:
                C0632q c0632q = (C0632q) obj;
                return new C0239d(c0632q.f6870a, c0632q.f6871b, c0632q.f6872c, c0632q.f6873d);
            case 19:
                long j9 = ((C0241f) obj).f4736a;
                return new C0630o(C0241f.d(j9), C0241f.b(j9));
            default:
                C0630o c0630o5 = (C0630o) obj;
                return new C0241f(AbstractC0235a.e(c0630o5.f6859a, c0630o5.f6860b));
        }
    }
}
