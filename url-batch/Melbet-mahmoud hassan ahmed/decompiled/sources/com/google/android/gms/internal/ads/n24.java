package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class n24 extends u14 {

    /* renamed from: i, reason: collision with root package name */
    private int f8894i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f8895j;

    /* renamed from: k, reason: collision with root package name */
    private byte[] f8896k;

    /* renamed from: l, reason: collision with root package name */
    private byte[] f8897l;

    /* renamed from: m, reason: collision with root package name */
    private int f8898m;

    /* renamed from: n, reason: collision with root package name */
    private int f8899n;

    /* renamed from: o, reason: collision with root package name */
    private int f8900o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f8901p;

    /* renamed from: q, reason: collision with root package name */
    private long f8902q;

    public n24() {
        byte[] bArr = n13.f8870f;
        this.f8896k = bArr;
        this.f8897l = bArr;
    }

    private final int q(long j7) {
        return (int) ((j7 * this.f12567b.f12546a) / 1000000);
    }

    private final int r(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > 1024) {
                int i7 = this.f8894i;
                return i7 * (position / i7);
            }
        }
        return byteBuffer.limit();
    }

    private final void s(byte[] bArr, int i7) {
        j(i7).put(bArr, 0, i7).flip();
        if (i7 > 0) {
            this.f8901p = true;
        }
    }

    private final void t(ByteBuffer byteBuffer, byte[] bArr, int i7) {
        int min = Math.min(byteBuffer.remaining(), this.f8900o);
        int i8 = this.f8900o - min;
        System.arraycopy(bArr, i7 - i8, this.f8897l, 0, i8);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f8897l, i8, min);
    }

    @Override // com.google.android.gms.internal.ads.u14, com.google.android.gms.internal.ads.w04
    public final boolean e() {
        return this.f8895j;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final void h(ByteBuffer byteBuffer) {
        int limit;
        int position;
        while (byteBuffer.hasRemaining() && !n()) {
            int i7 = this.f8898m;
            int i8 = 1;
            if (i7 == 0) {
                limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f8896k.length));
                int limit2 = byteBuffer.limit();
                while (true) {
                    limit2 -= 2;
                    if (limit2 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    } else if (Math.abs((int) byteBuffer.getShort(limit2)) > 1024) {
                        int i9 = this.f8894i;
                        position = ((limit2 / i9) * i9) + i9;
                        break;
                    }
                }
                if (position != byteBuffer.position()) {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    j(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f8901p = true;
                    }
                    byteBuffer.limit(limit);
                }
                this.f8898m = i8;
                byteBuffer.limit(limit);
            } else if (i7 != 1) {
                limit = byteBuffer.limit();
                int r7 = r(byteBuffer);
                byteBuffer.limit(r7);
                this.f8902q += byteBuffer.remaining() / this.f8894i;
                t(byteBuffer, this.f8897l, this.f8900o);
                if (r7 < limit) {
                    s(this.f8897l, this.f8900o);
                    this.f8898m = 0;
                    byteBuffer.limit(limit);
                }
            } else {
                limit = byteBuffer.limit();
                int r8 = r(byteBuffer);
                int position2 = r8 - byteBuffer.position();
                byte[] bArr = this.f8896k;
                int length = bArr.length;
                int i10 = this.f8899n;
                int i11 = length - i10;
                if (r8 >= limit || position2 >= i11) {
                    int min = Math.min(position2, i11);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.f8896k, this.f8899n, min);
                    int i12 = this.f8899n + min;
                    this.f8899n = i12;
                    byte[] bArr2 = this.f8896k;
                    if (i12 == bArr2.length) {
                        if (this.f8901p) {
                            s(bArr2, this.f8900o);
                            long j7 = this.f8902q;
                            int i13 = this.f8899n;
                            int i14 = this.f8900o;
                            this.f8902q = j7 + ((i13 - (i14 + i14)) / this.f8894i);
                            i12 = i13;
                        } else {
                            this.f8902q += (i12 - this.f8900o) / this.f8894i;
                        }
                        t(byteBuffer, this.f8896k, i12);
                        this.f8899n = 0;
                        i8 = 2;
                        this.f8898m = i8;
                    }
                    byteBuffer.limit(limit);
                } else {
                    s(bArr, i10);
                    this.f8899n = 0;
                    this.f8898m = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.u14
    public final u04 i(u04 u04Var) {
        if (u04Var.f12548c == 2) {
            return this.f8895j ? u04Var : u04.f12545e;
        }
        throw new v04(u04Var);
    }

    @Override // com.google.android.gms.internal.ads.u14
    protected final void k() {
        if (this.f8895j) {
            this.f8894i = this.f12567b.f12549d;
            int q7 = q(150000L) * this.f8894i;
            if (this.f8896k.length != q7) {
                this.f8896k = new byte[q7];
            }
            int q8 = q(20000L) * this.f8894i;
            this.f8900o = q8;
            if (this.f8897l.length != q8) {
                this.f8897l = new byte[q8];
            }
        }
        this.f8898m = 0;
        this.f8902q = 0L;
        this.f8899n = 0;
        this.f8901p = false;
    }

    @Override // com.google.android.gms.internal.ads.u14
    protected final void l() {
        int i7 = this.f8899n;
        if (i7 > 0) {
            s(this.f8896k, i7);
        }
        if (this.f8901p) {
            return;
        }
        this.f8902q += this.f8900o / this.f8894i;
    }

    @Override // com.google.android.gms.internal.ads.u14
    protected final void m() {
        this.f8895j = false;
        this.f8900o = 0;
        byte[] bArr = n13.f8870f;
        this.f8896k = bArr;
        this.f8897l = bArr;
    }

    public final long o() {
        return this.f8902q;
    }

    public final void p(boolean z6) {
        this.f8895j = z6;
    }
}
