package y0;

import a.AbstractC0124a;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f16088a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    public boolean f16089b;

    /* renamed from: c, reason: collision with root package name */
    public int f16090c;

    /* renamed from: d, reason: collision with root package name */
    public long f16091d;

    /* renamed from: e, reason: collision with root package name */
    public int f16092e;

    /* renamed from: f, reason: collision with root package name */
    public int f16093f;

    /* renamed from: g, reason: collision with root package name */
    public int f16094g;

    public final void a(F f4, E e4) {
        if (this.f16090c > 0) {
            f4.e(this.f16091d, this.f16092e, this.f16093f, this.f16094g, e4);
            this.f16090c = 0;
        }
    }

    public final void b(F f4, long j4, int i4, int i5, int i6, E e4) {
        AbstractC0124a.s("TrueHD chunk samples must be contiguous in the sample queue.", this.f16094g <= i5 + i6);
        if (this.f16089b) {
            int i7 = this.f16090c;
            int i8 = i7 + 1;
            this.f16090c = i8;
            if (i7 == 0) {
                this.f16091d = j4;
                this.f16092e = i4;
                this.f16093f = 0;
            }
            this.f16093f += i5;
            this.f16094g = i6;
            if (i8 >= 16) {
                a(f4, e4);
            }
        }
    }

    public final void c(o oVar) {
        if (this.f16089b) {
            return;
        }
        byte[] bArr = this.f16088a;
        oVar.E(bArr, 0, 10);
        oVar.u();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b4 = bArr[7];
            if ((b4 & 254) == 186) {
                r2 = 40 << ((bArr[((b4 & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (r2 == 0) {
            return;
        }
        this.f16089b = true;
    }
}
