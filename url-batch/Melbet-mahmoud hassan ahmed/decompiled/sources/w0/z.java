package w0;

import o2.m0;
import w0.b0;

/* loaded from: classes.dex */
public final class z implements b0 {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f22985a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f22986b;

    /* renamed from: c, reason: collision with root package name */
    private final long f22987c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f22988d;

    public z(long[] jArr, long[] jArr2, long j7) {
        o2.a.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z6 = length > 0;
        this.f22988d = z6;
        if (!z6 || jArr2[0] <= 0) {
            this.f22985a = jArr;
            this.f22986b = jArr2;
        } else {
            int i7 = length + 1;
            long[] jArr3 = new long[i7];
            this.f22985a = jArr3;
            long[] jArr4 = new long[i7];
            this.f22986b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f22987c = j7;
    }

    @Override // w0.b0
    public boolean g() {
        return this.f22988d;
    }

    @Override // w0.b0
    public b0.a i(long j7) {
        if (!this.f22988d) {
            return new b0.a(c0.f22878c);
        }
        int i7 = m0.i(this.f22986b, j7, true, true);
        c0 c0Var = new c0(this.f22986b[i7], this.f22985a[i7]);
        if (c0Var.f22879a == j7 || i7 == this.f22986b.length - 1) {
            return new b0.a(c0Var);
        }
        int i8 = i7 + 1;
        return new b0.a(c0Var, new c0(this.f22986b[i8], this.f22985a[i8]));
    }

    @Override // w0.b0
    public long j() {
        return this.f22987c;
    }
}
