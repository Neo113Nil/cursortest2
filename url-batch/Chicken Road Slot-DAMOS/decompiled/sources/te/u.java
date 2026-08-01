package te;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class u implements pe.a {

    /* renamed from: a, reason: collision with root package name */
    public static final u f9443a = new u();

    /* renamed from: b, reason: collision with root package name */
    public static final h1 f9444b = new h1("kotlin.time.Duration", re.d.f8245o);

    @Override // pe.a
    public final void a(e3.o oVar, Object obj) {
        long j = ((ee.b) obj).f3960d;
        ee.a aVar = ee.b.f3956e;
        StringBuilder sb2 = new StringBuilder();
        if (j < 0) {
            sb2.append('-');
        }
        sb2.append("PT");
        long h10 = j < 0 ? ee.b.h(j) : j;
        long f3 = ee.b.f(h10, ee.d.HOURS);
        boolean z10 = false;
        int f10 = ee.b.d(h10) ? 0 : (int) (ee.b.f(h10, ee.d.MINUTES) % 60);
        int f11 = ee.b.d(h10) ? 0 : (int) (ee.b.f(h10, ee.d.SECONDS) % 60);
        int c10 = ee.b.c(h10);
        if (ee.b.d(j)) {
            f3 = 9999999999999L;
        }
        boolean z11 = f3 != 0;
        boolean z12 = (f11 == 0 && c10 == 0) ? false : true;
        if (f10 != 0 || (z12 && z11)) {
            z10 = true;
        }
        if (z11) {
            sb2.append(f3);
            sb2.append('H');
        }
        if (z10) {
            sb2.append(f10);
            sb2.append('M');
        }
        if (z12 || (!z11 && !z10)) {
            ee.b.b(sb2, f11, c10, 9, "S", true);
        }
        oVar.n(sb2.toString());
    }

    @Override // pe.a
    public final Object b(y6.l lVar) {
        ee.a aVar = ee.b.f3956e;
        String str = (String) lVar.e();
        aVar.getClass();
        try {
            long e2 = ee.i.e(str);
            if (e2 == ee.b.f3959s) {
                throw new IllegalStateException("invariant failed");
            }
            return new ee.b(e2);
        } catch (IllegalArgumentException e9) {
            throw new IllegalArgumentException(n0.l.g("Invalid ISO duration string format: '", str, "'."), e9);
        }
    }

    @Override // pe.a
    public final re.e d() {
        return f9444b;
    }
}
