package T5;

import a.AbstractC0219a;

/* renamed from: T5.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0201q implements Q5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0201q f2453a = new C0201q();

    /* renamed from: b, reason: collision with root package name */
    public static final O f2454b = new O("kotlin.time.Duration", R5.c.f2156j);

    @Override // Q5.a
    public final void a(V5.s sVar, Object obj) {
        long j4;
        long j7;
        int f7;
        long j8 = ((G5.a) obj).f865f;
        int i7 = G5.a.f864i;
        StringBuilder sb = new StringBuilder();
        if (j8 < 0) {
            sb.append('-');
        }
        sb.append("PT");
        boolean z5 = true;
        if (j8 < 0) {
            j4 = ((-(j8 >> 1)) << 1) + (((int) j8) & 1);
            int i8 = G5.b.f866a;
        } else {
            j4 = j8;
        }
        long f8 = G5.a.f(j4, G5.c.f871k);
        if (G5.a.d(j4)) {
            j7 = 0;
            f7 = 0;
        } else {
            j7 = 0;
            f7 = (int) (G5.a.f(j4, G5.c.f870j) % 60);
        }
        int f9 = G5.a.d(j4) ? 0 : (int) (G5.a.f(j4, G5.c.f869i) % 60);
        int c7 = G5.a.c(j4);
        if (G5.a.d(j8)) {
            f8 = 9999999999999L;
        }
        boolean z6 = f8 != j7;
        boolean z7 = (f9 == 0 && c7 == 0) ? false : true;
        if (f7 == 0 && (!z7 || !z6)) {
            z5 = false;
        }
        if (z6) {
            sb.append(f8);
            sb.append('H');
        }
        if (z5) {
            sb.append(f7);
            sb.append('M');
        }
        if (z7 || (!z6 && !z5)) {
            G5.a.b(sb, f9, c7, 9, "S", true);
        }
        sVar.o(sb.toString());
    }

    @Override // Q5.a
    public final Object b(S5.b bVar) {
        int i7 = G5.a.f864i;
        String value = bVar.u();
        kotlin.jvm.internal.i.e(value, "value");
        try {
            return new G5.a(AbstractC0219a.a(value));
        } catch (IllegalArgumentException e4) {
            throw new IllegalArgumentException(W4.o.e("Invalid ISO duration string format: '", value, "'."), e4);
        }
    }

    @Override // Q5.a
    public final R5.e c() {
        return f2454b;
    }
}
