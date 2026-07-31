package j0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final x.g0 f3805a;

    /* renamed from: b, reason: collision with root package name */
    public static final x.g0 f3806b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f3807c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f3808d;

    static {
        float f6 = l0.a.f4460a;
        float f8 = l0.a.f4461b;
        float f9 = 16;
        float f10 = l0.b.f4462a;
        float f11 = 8;
        f3805a = new x.g0(f6, f11, f8, f11);
        androidx.compose.foundation.layout.a.a(f9, f11, f8, f11);
        float f12 = 12;
        f3806b = new x.g0(f12, f11, f12, f11);
        androidx.compose.foundation.layout.a.a(f12, f11, f9, f11);
        f3807c = 58;
        f3808d = l0.b.f4462a;
    }

    public static n a(long j7, m0.s sVar) {
        long j8 = f1.s.f2704h;
        n b8 = b((b0) sVar.j(c0.f3599a));
        if (j7 == 16) {
            j7 = b8.f3794a;
        }
        long j9 = j7;
        long j10 = j8 != 16 ? j8 : b8.f3795b;
        long j11 = j8 != 16 ? j8 : b8.f3796c;
        if (j8 == 16) {
            j8 = b8.f3797d;
        }
        return new n(j9, j10, j11, j8);
    }

    public static n b(b0 b0Var) {
        n nVar = b0Var.W;
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(c0.c(b0Var, l0.h.f4538a), c0.c(b0Var, l0.h.f4546j), f1.s.b(c0.c(b0Var, l0.h.f4540c), l0.h.f4542e), f1.s.b(c0.c(b0Var, l0.h.f4543f), l0.h.f4544g));
        b0Var.W = nVar2;
        return nVar2;
    }
}
