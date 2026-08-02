package c0;

import a.AbstractC0124a;
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.nio.ByteBuffer;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class M extends U.o {
    public int n;
    public boolean o;

    /* renamed from: p, reason: collision with root package name */
    public int f5526p;

    /* renamed from: q, reason: collision with root package name */
    public long f5527q;

    /* renamed from: s, reason: collision with root package name */
    public byte[] f5529s;
    public byte[] v;

    /* renamed from: r, reason: collision with root package name */
    public int f5528r = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f5530t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f5531u = 0;

    /* renamed from: l, reason: collision with root package name */
    public final long f5524l = 100000;

    /* renamed from: i, reason: collision with root package name */
    public final float f5521i = 0.2f;

    /* renamed from: m, reason: collision with root package name */
    public final long f5525m = 2000000;

    /* renamed from: k, reason: collision with root package name */
    public final int f5523k = 10;

    /* renamed from: j, reason: collision with root package name */
    public final short f5522j = 1024;

    public M() {
        byte[] bArr = W.J.f3264b;
        this.f5529s = bArr;
        this.v = bArr;
    }

    @Override // U.o, U.n
    public final boolean a() {
        return super.a() && this.o;
    }

    @Override // U.n
    public final void d(ByteBuffer byteBuffer) {
        int limit;
        int position;
        while (byteBuffer.hasRemaining() && !this.f3067g.hasRemaining()) {
            int i4 = this.f5526p;
            short s4 = this.f5522j;
            if (i4 == 0) {
                int limit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit2, byteBuffer.position() + this.f5529s.length));
                int limit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit3 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(limit3) << 8) | (byteBuffer.get(limit3 - 1) & 255)) > s4) {
                        int i5 = this.n;
                        position = ((limit3 / i5) * i5) + i5;
                        break;
                    }
                    limit3 -= 2;
                }
                if (position == byteBuffer.position()) {
                    this.f5526p = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    l(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit2);
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException();
                }
                AbstractC0124a.t(this.f5530t < this.f5529s.length);
                int limit4 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 >= byteBuffer.limit()) {
                        limit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(position2) << 8) | (byteBuffer.get(position2 - 1) & 255)) > s4) {
                        int i6 = this.n;
                        limit = (position2 / i6) * i6;
                        break;
                    }
                    position2 += 2;
                }
                int position3 = limit - byteBuffer.position();
                int i7 = this.f5530t;
                int i8 = this.f5531u;
                int i9 = i7 + i8;
                byte[] bArr = this.f5529s;
                if (i9 < bArr.length) {
                    i7 = bArr.length;
                } else {
                    i9 = i8 - (bArr.length - i7);
                }
                int i10 = i7 - i9;
                boolean z = limit < limit4;
                int min = Math.min(position3, i10);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.f5529s, i9, min);
                int i11 = this.f5531u + min;
                this.f5531u = i11;
                AbstractC0124a.t(i11 <= this.f5529s.length);
                boolean z4 = z && position3 < i10;
                n(z4);
                if (z4) {
                    this.f5526p = 0;
                    this.f5528r = 0;
                }
                byteBuffer.limit(limit4);
            }
        }
    }

    @Override // U.o
    public final U.k h(U.k kVar) {
        if (kVar.f3057c == 2) {
            return kVar.f3055a == -1 ? U.k.f3054e : kVar;
        }
        throw new U.m(kVar);
    }

    @Override // U.o
    public final void i() {
        if (a()) {
            int i4 = this.f3062b.f3056b * 2;
            this.n = i4;
            int i5 = ((((int) ((this.f5524l * r0.f3055a) / 1000000)) / 2) / i4) * i4 * 2;
            if (this.f5529s.length != i5) {
                this.f5529s = new byte[i5];
                this.v = new byte[i5];
            }
        }
        this.f5526p = 0;
        this.f5527q = 0L;
        this.f5528r = 0;
        this.f5530t = 0;
        this.f5531u = 0;
    }

    @Override // U.o
    public final void j() {
        if (this.f5531u > 0) {
            n(true);
            this.f5528r = 0;
        }
    }

    @Override // U.o
    public final void k() {
        this.o = false;
        byte[] bArr = W.J.f3264b;
        this.f5529s = bArr;
        this.v = bArr;
    }

    public final int m(int i4) {
        int length = ((((int) ((this.f5525m * this.f3062b.f3055a) / 1000000)) - this.f5528r) * this.n) - (this.f5529s.length / 2);
        AbstractC0124a.t(length >= 0);
        int min = (int) Math.min((i4 * this.f5521i) + 0.5f, length);
        int i5 = this.n;
        return (min / i5) * i5;
    }

    public final void n(boolean z) {
        int length;
        int m4;
        int i4 = this.f5531u;
        byte[] bArr = this.f5529s;
        if (i4 == bArr.length || z) {
            if (this.f5528r == 0) {
                if (z) {
                    o(i4, 3);
                    length = i4;
                } else {
                    AbstractC0124a.t(i4 >= bArr.length / 2);
                    length = this.f5529s.length / 2;
                    o(length, 0);
                }
                m4 = length;
            } else if (z) {
                int length2 = i4 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int m5 = m(length2) + (this.f5529s.length / 2);
                o(m5, 2);
                m4 = m5;
                length = length3;
            } else {
                length = i4 - (bArr.length / 2);
                m4 = m(length);
                o(m4, 1);
            }
            if (!(length % this.n == 0)) {
                throw new IllegalStateException(AbstractC0347t0.n("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(length)));
            }
            AbstractC0124a.t(i4 >= m4);
            this.f5531u -= length;
            int i5 = this.f5530t + length;
            this.f5530t = i5;
            this.f5530t = i5 % this.f5529s.length;
            this.f5528r = (m4 / this.n) + this.f5528r;
            this.f5527q += (length - m4) / r2;
        }
    }

    public final void o(int i4, int i5) {
        if (i4 == 0) {
            return;
        }
        AbstractC0124a.h(this.f5531u >= i4);
        if (i5 == 2) {
            int i6 = this.f5530t;
            int i7 = this.f5531u;
            int i8 = i6 + i7;
            byte[] bArr = this.f5529s;
            if (i8 <= bArr.length) {
                System.arraycopy(bArr, i8 - i4, this.v, 0, i4);
            } else {
                int length = i7 - (bArr.length - i6);
                if (length >= i4) {
                    System.arraycopy(bArr, length - i4, this.v, 0, i4);
                } else {
                    int i9 = i4 - length;
                    System.arraycopy(bArr, bArr.length - i9, this.v, 0, i9);
                    System.arraycopy(this.f5529s, 0, this.v, i9, length);
                }
            }
        } else {
            int i10 = this.f5530t;
            int i11 = i10 + i4;
            byte[] bArr2 = this.f5529s;
            if (i11 <= bArr2.length) {
                System.arraycopy(bArr2, i10, this.v, 0, i4);
            } else {
                int length2 = bArr2.length - i10;
                System.arraycopy(bArr2, i10, this.v, 0, length2);
                System.arraycopy(this.f5529s, 0, this.v, length2, i4 - length2);
            }
        }
        AbstractC0124a.f(i4, "sizeToOutput is not aligned to frame size: %s", i4 % this.n == 0);
        AbstractC0124a.t(this.f5530t < this.f5529s.length);
        byte[] bArr3 = this.v;
        AbstractC0124a.f(i4, "byteOutput size is not aligned to frame size %s", i4 % this.n == 0);
        if (i5 != 3) {
            for (int i12 = 0; i12 < i4; i12 += 2) {
                int i13 = i12 + 1;
                int i14 = (bArr3[i13] << 8) | (bArr3[i12] & 255);
                int i15 = this.f5523k;
                if (i5 == 0) {
                    i15 = ((((i12 * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT) / (i4 - 1)) * (i15 - 100)) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT) + 100;
                } else if (i5 == 2) {
                    i15 += (((i12 * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT) * (100 - i15)) / (i4 - 1)) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
                }
                int i16 = (i14 * i15) / 100;
                if (i16 >= 32767) {
                    bArr3[i12] = -1;
                    bArr3[i13] = Byte.MAX_VALUE;
                } else if (i16 <= -32768) {
                    bArr3[i12] = 0;
                    bArr3[i13] = Byte.MIN_VALUE;
                } else {
                    bArr3[i12] = (byte) (i16 & KotlinVersion.MAX_COMPONENT_VALUE);
                    bArr3[i13] = (byte) (i16 >> 8);
                }
            }
        }
        l(i4).put(bArr3, 0, i4).flip();
    }
}
