package z6;

import kotlin.jvm.internal.Intrinsics;
import m6.C0693a;
import m6.C0694b;
import z1.AbstractC1053a;

/* renamed from: z6.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1077q implements w6.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1077q f8805a = new C1077q();

    /* renamed from: b, reason: collision with root package name */
    public static final O f8806b = new O("kotlin.time.Duration", x6.c.j);

    @Override // w6.a
    public final Object a(y6.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        C0693a c0693a = C0694b.f6584e;
        String value = decoder.v();
        c0693a.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            long B7 = AbstractC1053a.B(value);
            if (B7 == C0694b.f6587m) {
                throw new IllegalStateException("invariant failed");
            }
            return new C0694b(B7);
        } catch (IllegalArgumentException e7) {
            throw new IllegalArgumentException(r4.f.d("Invalid ISO duration string format: '", value, "'."), e7);
        }
    }

    @Override // w6.a
    public final void b(B6.t encoder, Object obj) {
        long j;
        long j7;
        int f7;
        long j8 = ((C0694b) obj).f6588d;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        C0693a c0693a = C0694b.f6584e;
        StringBuilder sb = new StringBuilder();
        if (j8 < 0) {
            sb.append('-');
        }
        sb.append("PT");
        boolean z7 = true;
        if (j8 < 0) {
            j = ((-(j8 >> 1)) << 1) + (((int) j8) & 1);
            C0694b.f6584e.getClass();
            int i2 = m6.c.f6589a;
        } else {
            j = j8;
        }
        long f8 = C0694b.f(j, m6.d.f6594n);
        if (C0694b.d(j)) {
            j7 = 0;
            f7 = 0;
        } else {
            j7 = 0;
            f7 = (int) (C0694b.f(j, m6.d.f6593m) % 60);
        }
        int f9 = C0694b.d(j) ? 0 : (int) (C0694b.f(j, m6.d.f6592l) % 60);
        int c7 = C0694b.c(j);
        if (C0694b.d(j8)) {
            f8 = 9999999999999L;
        }
        boolean z8 = f8 != j7;
        boolean z9 = (f9 == 0 && c7 == 0) ? false : true;
        if (f7 == 0 && (!z9 || !z8)) {
            z7 = false;
        }
        if (z8) {
            sb.append(f8);
            sb.append('H');
        }
        if (z7) {
            sb.append(f7);
            sb.append('M');
        }
        if (z9 || (!z8 && !z7)) {
            C0694b.b(sb, f9, c7, 9, "S", true);
        }
        encoder.o(sb.toString());
    }

    @Override // w6.a
    public final x6.e c() {
        return f8806b;
    }
}
