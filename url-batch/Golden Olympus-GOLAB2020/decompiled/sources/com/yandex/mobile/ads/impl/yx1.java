package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.InterfaceC1976hh;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class yx1 extends AbstractC2189qj {

    /* renamed from: i, reason: collision with root package name */
    private final long f35353i = 150000;

    /* renamed from: j, reason: collision with root package name */
    private final long f35354j = 20000;

    /* renamed from: k, reason: collision with root package name */
    private final short f35355k = 1024;

    /* renamed from: l, reason: collision with root package name */
    private int f35356l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f35357m;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f35358n;

    /* renamed from: o, reason: collision with root package name */
    private byte[] f35359o;

    /* renamed from: p, reason: collision with root package name */
    private int f35360p;

    /* renamed from: q, reason: collision with root package name */
    private int f35361q;

    /* renamed from: r, reason: collision with root package name */
    private int f35362r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f35363s;

    /* renamed from: t, reason: collision with root package name */
    private long f35364t;

    public yx1(int i4) {
        byte[] bArr = u82.f32878f;
        this.f35358n = bArr;
        this.f35359o = bArr;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1976hh
    public final void a(ByteBuffer byteBuffer) {
        int limit;
        int limit2;
        int position;
        while (byteBuffer.hasRemaining() && !e()) {
            int i4 = this.f35360p;
            if (i4 == 0) {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.f35358n.length));
                int limit4 = byteBuffer.limit() - 2;
                while (true) {
                    if (limit4 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(limit4)) > this.f35355k) {
                            int i5 = this.f35356l;
                            position = ((limit4 / i5) * i5) + i5;
                            break;
                        }
                        limit4 -= 2;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f35360p = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    a(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f35363s = true;
                    }
                }
                byteBuffer.limit(limit3);
            } else if (i4 == 1) {
                int limit5 = byteBuffer.limit();
                int position2 = byteBuffer.position();
                while (true) {
                    if (position2 >= byteBuffer.limit()) {
                        limit2 = byteBuffer.limit();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(position2)) > this.f35355k) {
                            int i6 = this.f35356l;
                            limit2 = (position2 / i6) * i6;
                            break;
                        }
                        position2 += 2;
                    }
                }
                int position3 = limit2 - byteBuffer.position();
                byte[] bArr = this.f35358n;
                int length = bArr.length;
                int i7 = this.f35361q;
                int i8 = length - i7;
                if (limit2 >= limit5 || position3 >= i8) {
                    int min = Math.min(position3, i8);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.f35358n, this.f35361q, min);
                    int i9 = this.f35361q + min;
                    this.f35361q = i9;
                    byte[] bArr2 = this.f35358n;
                    if (i9 == bArr2.length) {
                        if (this.f35363s) {
                            int i10 = this.f35362r;
                            a(i10).put(bArr2, 0, i10).flip();
                            if (i10 > 0) {
                                this.f35363s = true;
                            }
                            this.f35364t += (this.f35361q - (this.f35362r * 2)) / this.f35356l;
                        } else {
                            this.f35364t += (i9 - this.f35362r) / this.f35356l;
                        }
                        byte[] bArr3 = this.f35358n;
                        int i11 = this.f35361q;
                        int min2 = Math.min(byteBuffer.remaining(), this.f35362r);
                        int i12 = this.f35362r - min2;
                        System.arraycopy(bArr3, i11 - i12, this.f35359o, 0, i12);
                        byteBuffer.position(byteBuffer.limit() - min2);
                        byteBuffer.get(this.f35359o, i12, min2);
                        this.f35361q = 0;
                        this.f35360p = 2;
                    }
                    byteBuffer.limit(limit5);
                } else {
                    a(i7).put(bArr, 0, i7).flip();
                    if (i7 > 0) {
                        this.f35363s = true;
                    }
                    this.f35361q = 0;
                    this.f35360p = 0;
                }
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException();
                }
                int limit6 = byteBuffer.limit();
                int position4 = byteBuffer.position();
                while (true) {
                    if (position4 >= byteBuffer.limit()) {
                        limit = byteBuffer.limit();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(position4)) > this.f35355k) {
                            int i13 = this.f35356l;
                            limit = (position4 / i13) * i13;
                            break;
                        }
                        position4 += 2;
                    }
                }
                byteBuffer.limit(limit);
                this.f35364t += byteBuffer.remaining() / this.f35356l;
                byte[] bArr4 = this.f35359o;
                int i14 = this.f35362r;
                int min3 = Math.min(byteBuffer.remaining(), this.f35362r);
                int i15 = this.f35362r - min3;
                System.arraycopy(bArr4, i14 - i15, this.f35359o, 0, i15);
                byteBuffer.position(byteBuffer.limit() - min3);
                byteBuffer.get(this.f35359o, i15, min3);
                if (limit < limit6) {
                    byte[] bArr5 = this.f35359o;
                    int i16 = this.f35362r;
                    a(i16).put(bArr5, 0, i16).flip();
                    if (i16 > 0) {
                        this.f35363s = true;
                    }
                    this.f35360p = 0;
                    byteBuffer.limit(limit6);
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2189qj
    public final InterfaceC1976hh.a b(InterfaceC1976hh.a aVar) {
        if (aVar.f26742c == 2) {
            return this.f35357m ? aVar : InterfaceC1976hh.a.f26739e;
        }
        throw new InterfaceC1976hh.b(aVar);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2189qj
    protected final void f() {
        if (this.f35357m) {
            InterfaceC1976hh.a aVar = this.f30796b;
            int i4 = aVar.f26743d;
            this.f35356l = i4;
            long j4 = this.f35353i;
            long j5 = aVar.f26740a;
            int i5 = ((int) ((j4 * j5) / 1000000)) * i4;
            if (this.f35358n.length != i5) {
                this.f35358n = new byte[i5];
            }
            int i6 = ((int) ((this.f35354j * j5) / 1000000)) * i4;
            this.f35362r = i6;
            if (this.f35359o.length != i6) {
                this.f35359o = new byte[i6];
            }
        }
        this.f35360p = 0;
        this.f35364t = 0L;
        this.f35361q = 0;
        this.f35363s = false;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2189qj
    protected final void g() {
        int i4 = this.f35361q;
        if (i4 > 0) {
            a(i4).put(this.f35358n, 0, i4).flip();
            if (i4 > 0) {
                this.f35363s = true;
            }
        }
        if (this.f35363s) {
            return;
        }
        this.f35364t += this.f35362r / this.f35356l;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2189qj
    protected final void h() {
        this.f35357m = false;
        this.f35362r = 0;
        byte[] bArr = u82.f32878f;
        this.f35358n = bArr;
        this.f35359o = bArr;
    }

    public final long i() {
        return this.f35364t;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2189qj, com.yandex.mobile.ads.impl.InterfaceC1976hh
    public final boolean isActive() {
        return this.f35357m;
    }

    public final void a(boolean z4) {
        this.f35357m = z4;
    }
}
