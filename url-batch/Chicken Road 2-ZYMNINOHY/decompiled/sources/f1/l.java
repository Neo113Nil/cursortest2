package f1;

import a.AbstractC0124a;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final y0.F f8630a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8631b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8632c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8633d;

    /* renamed from: e, reason: collision with root package name */
    public int f8634e;

    /* renamed from: f, reason: collision with root package name */
    public int f8635f;

    /* renamed from: g, reason: collision with root package name */
    public long f8636g;

    /* renamed from: h, reason: collision with root package name */
    public long f8637h;

    public l(y0.F f4) {
        this.f8630a = f4;
    }

    public final void a(byte[] bArr, int i4, int i5) {
        if (this.f8632c) {
            int i6 = this.f8635f;
            int i7 = (i4 + 1) - i6;
            if (i7 >= i5) {
                this.f8635f = (i5 - i4) + i6;
            } else {
                this.f8633d = ((bArr[i7] & 192) >> 6) == 0;
                this.f8632c = false;
            }
        }
    }

    public final void b(int i4, long j4, boolean z) {
        AbstractC0124a.t(this.f8637h != -9223372036854775807L);
        if (this.f8634e == 182 && z && this.f8631b) {
            this.f8630a.e(this.f8637h, this.f8633d ? 1 : 0, (int) (j4 - this.f8636g), i4, null);
        }
        if (this.f8634e != 179) {
            this.f8636g = j4;
        }
    }
}
