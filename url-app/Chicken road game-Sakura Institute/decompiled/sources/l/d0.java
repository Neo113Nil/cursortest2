package l;

import a.AbstractC0345a;
import com.appsflyer.attribution.RequestError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import q.AbstractC1024c;

/* loaded from: classes.dex */
public final class d0 extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7728d;

    /* renamed from: e, reason: collision with root package name */
    public static final d0 f7709e = new d0(1, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final d0 f7710i = new d0(1, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final d0 f7711j = new d0(1, 2);

    /* renamed from: k, reason: collision with root package name */
    public static final d0 f7712k = new d0(1, 3);

    /* renamed from: l, reason: collision with root package name */
    public static final d0 f7713l = new d0(1, 4);

    /* renamed from: m, reason: collision with root package name */
    public static final d0 f7714m = new d0(1, 5);

    /* renamed from: n, reason: collision with root package name */
    public static final d0 f7715n = new d0(1, 6);

    /* renamed from: o, reason: collision with root package name */
    public static final d0 f7716o = new d0(1, 7);

    /* renamed from: p, reason: collision with root package name */
    public static final d0 f7717p = new d0(1, 8);

    /* renamed from: q, reason: collision with root package name */
    public static final d0 f7718q = new d0(1, 9);

    /* renamed from: r, reason: collision with root package name */
    public static final d0 f7719r = new d0(1, 10);

    /* renamed from: s, reason: collision with root package name */
    public static final d0 f7720s = new d0(1, 11);

    /* renamed from: t, reason: collision with root package name */
    public static final d0 f7721t = new d0(1, 12);

    /* renamed from: u, reason: collision with root package name */
    public static final d0 f7722u = new d0(1, 13);

    /* renamed from: v, reason: collision with root package name */
    public static final d0 f7723v = new d0(1, 14);

    /* renamed from: w, reason: collision with root package name */
    public static final d0 f7724w = new d0(1, 15);

    /* renamed from: x, reason: collision with root package name */
    public static final d0 f7725x = new d0(1, 16);

    /* renamed from: y, reason: collision with root package name */
    public static final d0 f7726y = new d0(1, 17);

    /* renamed from: z, reason: collision with root package name */
    public static final d0 f7727z = new d0(1, 18);

    /* renamed from: A, reason: collision with root package name */
    public static final d0 f7708A = new d0(1, 19);
    public static final d0 B = new d0(1, 20);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(int i2, int i4) {
        super(i2);
        this.f7728d = i4;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, y2.j] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7728d) {
            case 0:
                return Unit.f7487a;
            case 1:
                ((Function0) obj).invoke();
                return Unit.f7487a;
            case 2:
                U u4 = (U) obj;
                long j4 = u4.f7638f;
                ((Q.A) s0.f7840a.getValue()).c(u4, f7711j, u4.f7639g);
                long j5 = u4.f7638f;
                if (j4 != j5) {
                    C0765J c0765j = u4.f7646n;
                    if (c0765j != null) {
                        c0765j.f7588g = j5;
                        if (c0765j.f7583b == null) {
                            c0765j.f7589h = O2.c.b((1.0d - c0765j.f7586e.a(0)) * u4.f7638f);
                        }
                    } else if (j5 != 0) {
                        u4.y();
                    }
                }
                return Unit.f7487a;
            case 3:
                long j6 = ((M0.f) obj).f3546a;
                return new C0790p(Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (j6 & 4294967295L)));
            case 4:
                C0790p c0790p = (C0790p) obj;
                return new M0.f((Float.floatToRawIntBits(c0790p.f7823a) << 32) | (Float.floatToRawIntBits(c0790p.f7824b) & 4294967295L));
            case 5:
                return new C0789o(((M0.e) obj).f3545d);
            case 6:
                return new M0.e(((C0789o) obj).f7819a);
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C0789o(((Number) obj).floatValue());
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                return Float.valueOf(((C0789o) obj).f7819a);
            case AbstractC1024c.f9242c /* 9 */:
                long j7 = ((M0.h) obj).f3548a;
                return new C0790p((int) (j7 >> 32), (int) (j7 & 4294967295L));
            case 10:
                C0790p c0790p2 = (C0790p) obj;
                return new M0.h(j0.c.g(Math.round(c0790p2.f7823a), Math.round(c0790p2.f7824b)));
            case RequestError.STOP_TRACKING /* 11 */:
                long j8 = ((M0.j) obj).f3554a;
                return new C0790p((int) (j8 >> 32), (int) (j8 & 4294967295L));
            case 12:
                C0790p c0790p3 = (C0790p) obj;
                int round = Math.round(c0790p3.f7823a);
                if (round < 0) {
                    round = 0;
                }
                int round2 = Math.round(c0790p3.f7824b);
                return new M0.j(u3.d.c(round, round2 >= 0 ? round2 : 0));
            case 13:
                return new C0789o(((Number) obj).intValue());
            case 14:
                return Integer.valueOf((int) ((C0789o) obj).f7819a);
            case AbstractC1024c.f9246g /* 15 */:
                long j9 = ((Y.c) obj).f4372a;
                return new C0790p(Y.c.d(j9), Y.c.e(j9));
            case 16:
                C0790p c0790p4 = (C0790p) obj;
                return new Y.c(AbstractC0345a.c(c0790p4.f7823a, c0790p4.f7824b));
            case 17:
                Y.d dVar = (Y.d) obj;
                return new r(dVar.f4374a, dVar.f4375b, dVar.f4376c, dVar.f4377d);
            case 18:
                r rVar = (r) obj;
                return new Y.d(rVar.f7834a, rVar.f7835b, rVar.f7836c, rVar.f7837d);
            case 19:
                long j10 = ((Y.f) obj).f4386a;
                return new C0790p(Y.f.d(j10), Y.f.b(j10));
            default:
                C0790p c0790p5 = (C0790p) obj;
                return new Y.f(u3.l.N(c0790p5.f7823a, c0790p5.f7824b));
        }
    }
}
