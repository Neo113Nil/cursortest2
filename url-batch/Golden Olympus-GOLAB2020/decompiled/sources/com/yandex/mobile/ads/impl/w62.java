package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.InterfaceC1976hh;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class w62 extends AbstractC2189qj {

    /* renamed from: i, reason: collision with root package name */
    private int f33942i;

    /* renamed from: j, reason: collision with root package name */
    private int f33943j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f33944k;

    /* renamed from: l, reason: collision with root package name */
    private int f33945l;

    /* renamed from: m, reason: collision with root package name */
    private byte[] f33946m = u82.f32878f;

    /* renamed from: n, reason: collision with root package name */
    private int f33947n;

    /* renamed from: o, reason: collision with root package name */
    private long f33948o;

    @Override // com.yandex.mobile.ads.impl.AbstractC2189qj, com.yandex.mobile.ads.impl.InterfaceC1976hh
    public final boolean a() {
        return super.a() && this.f33947n == 0;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2189qj
    public final InterfaceC1976hh.a b(InterfaceC1976hh.a aVar) {
        if (aVar.f26742c != 2) {
            throw new InterfaceC1976hh.b(aVar);
        }
        this.f33944k = true;
        return (this.f33942i == 0 && this.f33943j == 0) ? InterfaceC1976hh.a.f26739e : aVar;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2189qj, com.yandex.mobile.ads.impl.InterfaceC1976hh
    public final ByteBuffer c() {
        int i4;
        if (super.a() && (i4 = this.f33947n) > 0) {
            a(i4).put(this.f33946m, 0, this.f33947n).flip();
            this.f33947n = 0;
        }
        return super.c();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2189qj
    protected final void f() {
        if (this.f33944k) {
            this.f33944k = false;
            int i4 = this.f33943j;
            int i5 = this.f30796b.f26743d;
            this.f33946m = new byte[i4 * i5];
            this.f33945l = this.f33942i * i5;
        }
        this.f33947n = 0;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2189qj
    protected final void g() {
        if (this.f33944k) {
            if (this.f33947n > 0) {
                this.f33948o += r0 / this.f30796b.f26743d;
            }
            this.f33947n = 0;
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2189qj
    protected final void h() {
        this.f33946m = u82.f32878f;
    }

    public final long i() {
        return this.f33948o;
    }

    public final void j() {
        this.f33948o = 0L;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1976hh
    public final void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i4 = limit - position;
        if (i4 == 0) {
            return;
        }
        int min = Math.min(i4, this.f33945l);
        this.f33948o += min / this.f30796b.f26743d;
        this.f33945l -= min;
        byteBuffer.position(position + min);
        if (this.f33945l > 0) {
            return;
        }
        int i5 = i4 - min;
        int length = (this.f33947n + i5) - this.f33946m.length;
        ByteBuffer a4 = a(length);
        int i6 = this.f33947n;
        int i7 = u82.f32873a;
        int max = Math.max(0, Math.min(length, i6));
        a4.put(this.f33946m, 0, max);
        int max2 = Math.max(0, Math.min(length - max, i5));
        byteBuffer.limit(byteBuffer.position() + max2);
        a4.put(byteBuffer);
        byteBuffer.limit(limit);
        int i8 = i5 - max2;
        int i9 = this.f33947n - max;
        this.f33947n = i9;
        byte[] bArr = this.f33946m;
        System.arraycopy(bArr, max, bArr, 0, i9);
        byteBuffer.get(this.f33946m, this.f33947n, i8);
        this.f33947n += i8;
        a4.flip();
    }

    public final void a(int i4, int i5) {
        this.f33942i = i4;
        this.f33943j = i5;
    }
}
