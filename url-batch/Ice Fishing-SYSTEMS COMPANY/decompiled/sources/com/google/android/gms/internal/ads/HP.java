package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class HP extends AbstractC3698oi {
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f25364j;

    /* renamed from: k, reason: collision with root package name */
    public int f25365k;

    /* renamed from: l, reason: collision with root package name */
    public long f25366l;

    /* renamed from: m, reason: collision with root package name */
    public int f25367m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f25368n;

    /* renamed from: o, reason: collision with root package name */
    public int f25369o;

    /* renamed from: p, reason: collision with root package name */
    public int f25370p;

    /* renamed from: q, reason: collision with root package name */
    public byte[] f25371q;

    @Override // com.google.android.gms.internal.ads.InterfaceC3050ci
    public final void a(ByteBuffer byteBuffer) {
        int limit;
        int i;
        int position;
        while (byteBuffer.hasRemaining() && !this.f33183g.hasRemaining()) {
            if (this.f25365k != 0) {
                PA.T(this.f25369o < this.f25368n.length);
                int limit2 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 >= byteBuffer.limit()) {
                        limit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(position2) << 8) | (byteBuffer.get(position2 - 1) & 255)) > 1024) {
                        int i4 = this.i;
                        limit = (position2 / i4) * i4;
                        break;
                    }
                    position2 += 2;
                }
                int position3 = limit - byteBuffer.position();
                int i9 = this.f25369o;
                int i10 = this.f25370p;
                int i11 = i9 + i10;
                int length = this.f25368n.length;
                if (i11 < length) {
                    i = length - i11;
                } else {
                    i11 = i10 - (length - i9);
                    i = i9 - i11;
                }
                int min = Math.min(position3, i);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.f25368n, i11, min);
                int i12 = this.f25370p + min;
                this.f25370p = i12;
                PA.T(i12 <= this.f25368n.length);
                boolean z8 = limit < limit2 && position3 < i;
                o(z8);
                if (z8) {
                    this.f25365k = 0;
                    this.f25367m = 0;
                }
                byteBuffer.limit(limit2);
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.f25368n.length));
                int limit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit4 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(limit4) << 8) | (byteBuffer.get(limit4 - 1) & 255)) > 1024) {
                        int i13 = this.i;
                        position = ((limit4 / i13) * i13) + i13;
                        break;
                    }
                    limit4 -= 2;
                }
                if (position == byteBuffer.position()) {
                    this.f25365k = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    j(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3698oi, com.google.android.gms.internal.ads.InterfaceC3050ci
    public final boolean i() {
        return super.i() && this.f25364j;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3698oi
    public final C3751ph k(C3751ph c3751ph) {
        if (c3751ph.f33433c == 2) {
            return c3751ph.f33431a == -1 ? C3751ph.f33430e : c3751ph;
        }
        throw new C2894Zh("Unhandled input format:", c3751ph);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3698oi
    public final void l() {
        if (this.f25370p > 0) {
            o(true);
            this.f25367m = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3698oi
    public final void m() {
        if (i()) {
            int i = this.f33178b.f33432b;
            int i4 = i + i;
            this.i = i4;
            int i9 = ((((int) ((100000 * r0.f33431a) / 1000000)) / 2) / i4) * i4;
            int i10 = i9 + i9;
            if (this.f25368n.length != i10) {
                this.f25368n = new byte[i10];
                this.f25371q = new byte[i10];
            }
        }
        this.f25365k = 0;
        this.f25366l = 0L;
        this.f25367m = 0;
        this.f25369o = 0;
        this.f25370p = 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3698oi
    public final void n() {
        this.f25364j = false;
        byte[] bArr = AbstractC3548lu.f32614b;
        this.f25368n = bArr;
        this.f25371q = bArr;
    }

    public final void o(boolean z8) {
        int i;
        int i4;
        int i9 = this.f25370p;
        int length = this.f25368n.length;
        if (i9 != length) {
            if (!z8) {
                return;
            } else {
                z8 = true;
            }
        }
        if (this.f25367m == 0) {
            if (z8) {
                q(i9, 3);
                i4 = i9;
            } else {
                PA.T(i9 >= (length >> 1));
                i4 = this.f25368n.length >> 1;
                q(i4, 0);
            }
            i = i4;
        } else {
            int i10 = length >> 1;
            int i11 = i9 - i10;
            if (z8) {
                int p6 = p(i11) + (this.f25368n.length >> 1);
                q(p6, 2);
                int i12 = i10 + i11;
                i = p6;
                i4 = i12;
            } else {
                int p9 = p(i11);
                q(p9, 1);
                i = p9;
                i4 = i11;
            }
        }
        if (i4 % this.i != 0) {
            throw new IllegalStateException(AbstractC3194fG.u("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(i4)));
        }
        PA.T(i9 >= i);
        this.f25370p -= i4;
        int i13 = this.f25369o + i4;
        this.f25369o = i13;
        this.f25369o = i13 % this.f25368n.length;
        this.f25367m = (i / this.i) + this.f25367m;
        this.f25366l += (i4 - i) / r2;
    }

    public final int p(int i) {
        int length = ((((int) ((2000000 * this.f33178b.f33431a) / 1000000)) - this.f25367m) * this.i) - (this.f25368n.length >> 1);
        PA.T(length >= 0);
        int min = (int) Math.min((i * 0.2f) + 0.5f, length);
        int i4 = this.i;
        return (min / i4) * i4;
    }

    public final void q(int i, int i4) {
        int i9;
        if (i == 0) {
            return;
        }
        PA.n(this.f25370p >= i);
        if (i4 == 2) {
            int i10 = this.f25369o;
            int i11 = this.f25370p;
            int i12 = i10 + i11;
            byte[] bArr = this.f25368n;
            int length = bArr.length;
            if (i12 <= length) {
                System.arraycopy(bArr, i12 - i, this.f25371q, 0, i);
            } else {
                int i13 = i11 - (length - i10);
                if (i13 >= i) {
                    System.arraycopy(bArr, i13 - i, this.f25371q, 0, i);
                } else {
                    int i14 = i - i13;
                    System.arraycopy(bArr, length - i14, this.f25371q, 0, i14);
                    System.arraycopy(this.f25368n, 0, this.f25371q, i14, i13);
                }
            }
        } else {
            int i15 = this.f25369o;
            int i16 = i15 + i;
            byte[] bArr2 = this.f25368n;
            int length2 = bArr2.length;
            if (i16 <= length2) {
                System.arraycopy(bArr2, i15, this.f25371q, 0, i);
            } else {
                int i17 = length2 - i15;
                System.arraycopy(bArr2, i15, this.f25371q, 0, i17);
                System.arraycopy(this.f25368n, 0, this.f25371q, i17, i - i17);
            }
        }
        PA.E(i, "sizeToOutput is not aligned to frame size: %s", i % this.i == 0);
        PA.T(this.f25369o < this.f25368n.length);
        byte[] bArr3 = this.f25371q;
        PA.E(i, "byteOutput size is not aligned to frame size %s", i % this.i == 0);
        if (i4 != 3) {
            for (int i18 = 0; i18 < i; i18 += 2) {
                int i19 = i18 + 1;
                int i20 = (bArr3[i19] << 8) | (bArr3[i18] & 255);
                if (i4 == 0) {
                    i9 = ((((i18 * 1000) / (i - 1)) * (-90)) / 1000) + 100;
                } else {
                    i9 = 10;
                    if (i4 == 2) {
                        i9 = 10 + (((com.anythink.expressad.foundation.g.a.bQ * i18) / (i - 1)) / 1000);
                    }
                }
                int i21 = (i20 * i9) / 100;
                if (i21 >= 32767) {
                    bArr3[i18] = -1;
                    bArr3[i19] = Byte.MAX_VALUE;
                } else if (i21 <= -32768) {
                    bArr3[i18] = 0;
                    bArr3[i19] = com.anythink.core.common.s.a.c.f16474a;
                } else {
                    bArr3[i18] = (byte) (i21 & com.anythink.basead.exoplayer.k.p.f8630b);
                    bArr3[i19] = (byte) (i21 >> 8);
                }
            }
        }
        j(i).put(bArr3, 0, i).flip();
    }
}
