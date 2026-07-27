package k;

import Z.C0323u;
import Z.U;
import a0.C0349d;
import kotlin.jvm.functions.Function1;
import l.AbstractC0779e;
import l.C0790p;

/* loaded from: classes.dex */
public final class u extends M2.p implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public static final u f7326e = new u(1, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final u f7327i = new u(1, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final u f7328j = new u(1, 2);

    /* renamed from: k, reason: collision with root package name */
    public static final u f7329k = new u(1, 3);

    /* renamed from: l, reason: collision with root package name */
    public static final u f7330l = new u(1, 4);

    /* renamed from: m, reason: collision with root package name */
    public static final u f7331m = new u(1, 5);

    /* renamed from: n, reason: collision with root package name */
    public static final u f7332n = new u(1, 6);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7333d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i2, int i4) {
        super(i2);
        this.f7333d = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7333d) {
            case 0:
                long a4 = C0323u.a(((C0323u) obj).f4549a, C0349d.f4780t);
                return new l.r(C0323u.d(a4), C0323u.h(a4), C0323u.g(a4), C0323u.e(a4));
            case 1:
                long j4 = ((U) obj).f4512a;
                return new C0790p(U.b(j4), U.c(j4));
            case 2:
                C0790p c0790p = (C0790p) obj;
                float f4 = c0790p.f7823a;
                float f5 = c0790p.f7824b;
                return new U((Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L));
            case 3:
                return AbstractC0779e.i(0.0f, null, 7);
            case 4:
                ((Number) obj).intValue();
                return 0;
            case 5:
                ((Number) obj).intValue();
                return 0;
            default:
                return AbstractC0725A.f7231c;
        }
    }
}
