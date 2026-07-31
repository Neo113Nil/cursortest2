package y0;

import o2.a0;
import o2.m0;
import o2.r;

/* loaded from: classes.dex */
final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public final int f23220a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23221b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23222c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23223d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23224e;

    /* renamed from: f, reason: collision with root package name */
    public final int f23225f;

    private d(int i7, int i8, int i9, int i10, int i11, int i12) {
        this.f23220a = i7;
        this.f23221b = i8;
        this.f23222c = i9;
        this.f23223d = i10;
        this.f23224e = i11;
        this.f23225f = i12;
    }

    public static d c(a0 a0Var) {
        int p7 = a0Var.p();
        a0Var.P(12);
        int p8 = a0Var.p();
        int p9 = a0Var.p();
        int p10 = a0Var.p();
        a0Var.P(4);
        int p11 = a0Var.p();
        int p12 = a0Var.p();
        a0Var.P(8);
        return new d(p7, p8, p9, p10, p11, p12);
    }

    public long a() {
        return m0.N0(this.f23224e, this.f23222c * 1000000, this.f23223d);
    }

    public int b() {
        int i7 = this.f23220a;
        if (i7 == 1935960438) {
            return 2;
        }
        if (i7 == 1935963489) {
            return 1;
        }
        if (i7 == 1937012852) {
            return 3;
        }
        r.i("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f23220a));
        return -1;
    }

    @Override // y0.a
    public int getType() {
        return 1752331379;
    }
}
