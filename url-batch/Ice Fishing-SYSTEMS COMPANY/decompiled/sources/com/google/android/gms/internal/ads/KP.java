package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class KP extends AbstractC3698oi {
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f25968j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f25969k;

    /* renamed from: l, reason: collision with root package name */
    public int f25970l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f25971m;

    /* renamed from: n, reason: collision with root package name */
    public int f25972n;

    /* renamed from: o, reason: collision with root package name */
    public long f25973o;

    @Override // com.google.android.gms.internal.ads.InterfaceC3050ci
    public final void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.f25970l);
        this.f25973o += min / this.f33178b.f33434d;
        this.f25970l -= min;
        byteBuffer.position(position + min);
        if (this.f25970l <= 0) {
            int i4 = i - min;
            int length = (this.f25972n + i4) - this.f25971m.length;
            ByteBuffer j9 = j(length);
            int i9 = this.f25972n;
            String str = AbstractC3548lu.f32613a;
            int max = Math.max(0, Math.min(length, i9));
            j9.put(this.f25971m, 0, max);
            int max2 = Math.max(0, Math.min(length - max, i4));
            byteBuffer.limit(byteBuffer.position() + max2);
            j9.put(byteBuffer);
            byteBuffer.limit(limit);
            int i10 = i4 - max2;
            int i11 = this.f25972n - max;
            this.f25972n = i11;
            byte[] bArr = this.f25971m;
            System.arraycopy(bArr, max, bArr, 0, i11);
            byteBuffer.get(this.f25971m, this.f25972n, i10);
            this.f25972n += i10;
            j9.flip();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3050ci
    public final long d(long j9) {
        return Math.max(0L, j9 - AbstractC3548lu.v(this.f33178b.f33431a, this.f25968j + this.i));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3698oi, com.google.android.gms.internal.ads.InterfaceC3050ci
    public final boolean e() {
        return super.e() && this.f25972n == 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3698oi, com.google.android.gms.internal.ads.InterfaceC3050ci
    public final ByteBuffer f() {
        int i;
        if (super.e() && (i = this.f25972n) > 0) {
            j(i).put(this.f25971m, 0, this.f25972n).flip();
            this.f25972n = 0;
        }
        return super.f();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3698oi
    public final C3751ph k(C3751ph c3751ph) {
        if (!AbstractC3548lu.d(c3751ph.f33433c)) {
            throw new C2894Zh("Unhandled input format:", c3751ph);
        }
        this.f25969k = true;
        return (this.i == 0 && this.f25968j == 0) ? C3751ph.f33430e : c3751ph;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3698oi
    public final void l() {
        if (this.f25969k) {
            if (this.f25972n > 0) {
                this.f25973o += r0 / this.f33178b.f33434d;
            }
            this.f25972n = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3698oi
    public final void m() {
        if (this.f25969k) {
            this.f25969k = false;
            int i = this.f25968j;
            int i4 = this.f33178b.f33434d;
            this.f25971m = new byte[i * i4];
            this.f25970l = this.i * i4;
        }
        this.f25972n = 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3698oi
    public final void n() {
        this.f25971m = AbstractC3548lu.f32614b;
    }
}
