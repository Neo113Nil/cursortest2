package l;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h1 extends r6.l implements q6.c {
    public static final h1 A;
    public static final h1 B;

    /* renamed from: h, reason: collision with root package name */
    public static final h1 f5504h;

    /* renamed from: i, reason: collision with root package name */
    public static final h1 f5505i;

    /* renamed from: j, reason: collision with root package name */
    public static final h1 f5506j;

    /* renamed from: k, reason: collision with root package name */
    public static final h1 f5507k;

    /* renamed from: l, reason: collision with root package name */
    public static final h1 f5508l;

    /* renamed from: m, reason: collision with root package name */
    public static final h1 f5509m;

    /* renamed from: n, reason: collision with root package name */
    public static final h1 f5510n;

    /* renamed from: o, reason: collision with root package name */
    public static final h1 f5511o;

    /* renamed from: p, reason: collision with root package name */
    public static final h1 f5512p;

    /* renamed from: q, reason: collision with root package name */
    public static final h1 f5513q;

    /* renamed from: r, reason: collision with root package name */
    public static final h1 f5514r;

    /* renamed from: s, reason: collision with root package name */
    public static final h1 f5515s;

    /* renamed from: t, reason: collision with root package name */
    public static final h1 f5516t;

    /* renamed from: u, reason: collision with root package name */
    public static final h1 f5517u;

    /* renamed from: v, reason: collision with root package name */
    public static final h1 f5518v;

    /* renamed from: w, reason: collision with root package name */
    public static final h1 f5519w;

    /* renamed from: x, reason: collision with root package name */
    public static final h1 f5520x;

    /* renamed from: y, reason: collision with root package name */
    public static final h1 f5521y;

    /* renamed from: z, reason: collision with root package name */
    public static final h1 f5522z;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5523g;

    static {
        int i7 = 1;
        f5504h = new h1(i7, 0);
        f5505i = new h1(i7, 1);
        f5506j = new h1(i7, 2);
        f5507k = new h1(i7, 3);
        f5508l = new h1(i7, 4);
        f5509m = new h1(i7, 5);
        f5510n = new h1(i7, 6);
        f5511o = new h1(i7, 7);
        f5512p = new h1(i7, 8);
        f5513q = new h1(i7, 9);
        f5514r = new h1(i7, 10);
        f5515s = new h1(i7, 11);
        f5516t = new h1(i7, 12);
        f5517u = new h1(i7, 13);
        f5518v = new h1(i7, 14);
        f5519w = new h1(i7, 15);
        f5520x = new h1(i7, 16);
        f5521y = new h1(i7, 17);
        f5522z = new h1(i7, 18);
        A = new h1(i7, 19);
        B = new h1(i7, 20);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(int i7, int i8) {
        super(i7);
        this.f5523g = i8;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [d6.g, java.lang.Object] */
    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f5523g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return d6.z.f2639a;
            case 1:
                ((q6.a) obj).a();
                return d6.z.f2639a;
            case 2:
                x0 x0Var = (x0) obj;
                long j8 = x0Var.f5710f;
                ((q0.t) t1.f5666a.getValue()).c(x0Var, f5506j, x0Var.f5711g);
                long j9 = x0Var.f5710f;
                if (j8 != j9) {
                    p0 p0Var = x0Var.f5718n;
                    if (p0Var != null) {
                        p0Var.f5608g = j9;
                        if (p0Var.f5603b == null) {
                            p0Var.f5609h = t6.a.P((1.0d - p0Var.f5606e.a(0)) * x0Var.f5710f);
                        }
                    } else if (j9 != 0) {
                        x0Var.n();
                    }
                }
                return d6.z.f2639a;
            case 3:
                long j10 = ((m2.f) obj).f6313a;
                return new n(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
            case 4:
                n nVar = (n) obj;
                return new m2.f((Float.floatToRawIntBits(nVar.f5574a) << 32) | (Float.floatToRawIntBits(nVar.f5575b) & 4294967295L));
            case 5:
                return new m(((m2.e) obj).f6312f);
            case 6:
                return new m2.e(((m) obj).f5569a);
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return new m(((Number) obj).floatValue());
            case 8:
                return Float.valueOf(((m) obj).f5569a);
            case q.c.f7259c /* 9 */:
                long j11 = ((m2.h) obj).f6315a;
                return new n((int) (j11 >> 32), (int) (j11 & 4294967295L));
            case q.c.f7261e /* 10 */:
                n nVar2 = (n) obj;
                return new m2.h(a8.m.c(Math.round(nVar2.f5574a), Math.round(nVar2.f5575b)));
            case 11:
                long j12 = ((m2.j) obj).f6321a;
                return new n((int) (j12 >> 32), (int) (j12 & 4294967295L));
            case 12:
                n nVar3 = (n) obj;
                int round = Math.round(nVar3.f5574a);
                if (round < 0) {
                    round = 0;
                }
                int round2 = Math.round(nVar3.f5575b);
                return new m2.j(j1.c.G(round, round2 >= 0 ? round2 : 0));
            case 13:
                return new m(((Number) obj).intValue());
            case 14:
                return Integer.valueOf((int) ((m) obj).f5569a);
            case q.c.f7263g /* 15 */:
                long j13 = ((y0.c) obj).f9778a;
                return new n(y0.c.d(j13), y0.c.e(j13));
            case 16:
                n nVar4 = (n) obj;
                return new y0.c(u3.r.a(nVar4.f5574a, nVar4.f5575b));
            case 17:
                y0.d dVar = (y0.d) obj;
                return new p(dVar.f9780a, dVar.f9781b, dVar.f9782c, dVar.f9783d);
            case 18:
                p pVar = (p) obj;
                return new y0.d(pVar.f5598a, pVar.f5599b, pVar.f5600c, pVar.f5601d);
            case 19:
                long j14 = ((y0.f) obj).f9792a;
                return new n(y0.f.d(j14), y0.f.b(j14));
            default:
                n nVar5 = (n) obj;
                return new y0.f(v0.d.a(nVar5.f5574a, nVar5.f5575b));
        }
    }
}
