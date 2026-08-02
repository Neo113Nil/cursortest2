package g0;

import i2.AbstractC0457a;
import java.util.Arrays;
import r0.AbstractC1395f;

/* loaded from: classes.dex */
public final class e extends AbstractC1395f {

    /* renamed from: j, reason: collision with root package name */
    public byte[] f8832j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f8833k;

    /* renamed from: l, reason: collision with root package name */
    public byte[] f8834l;

    @Override // u0.k
    public final void c() {
        try {
            this.f15146i.b(this.f15139b);
            int i4 = 0;
            int i5 = 0;
            while (i4 != -1 && !this.f8833k) {
                byte[] bArr = this.f8832j;
                if (bArr.length < i5 + 16384) {
                    this.f8832j = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i4 = this.f15146i.read(this.f8832j, i5, 16384);
                if (i4 != -1) {
                    i5 += i4;
                }
            }
            if (!this.f8833k) {
                this.f8834l = Arrays.copyOf(this.f8832j, i5);
            }
            AbstractC0457a.f(this.f15146i);
        } catch (Throwable th) {
            AbstractC0457a.f(this.f15146i);
            throw th;
        }
    }

    @Override // u0.k
    public final void d() {
        this.f8833k = true;
    }
}
