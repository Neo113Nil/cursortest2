package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.InterfaceC1976hh;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes3.dex */
public final class c12 implements InterfaceC1976hh {

    /* renamed from: b, reason: collision with root package name */
    private int f24015b;

    /* renamed from: c, reason: collision with root package name */
    private float f24016c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f24017d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC1976hh.a f24018e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC1976hh.a f24019f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC1976hh.a f24020g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC1976hh.a f24021h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f24022i;

    /* renamed from: j, reason: collision with root package name */
    private b12 f24023j;

    /* renamed from: k, reason: collision with root package name */
    private ByteBuffer f24024k;

    /* renamed from: l, reason: collision with root package name */
    private ShortBuffer f24025l;

    /* renamed from: m, reason: collision with root package name */
    private ByteBuffer f24026m;

    /* renamed from: n, reason: collision with root package name */
    private long f24027n;

    /* renamed from: o, reason: collision with root package name */
    private long f24028o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f24029p;

    public c12() {
        InterfaceC1976hh.a aVar = InterfaceC1976hh.a.f26739e;
        this.f24018e = aVar;
        this.f24019f = aVar;
        this.f24020g = aVar;
        this.f24021h = aVar;
        ByteBuffer byteBuffer = InterfaceC1976hh.f26738a;
        this.f24024k = byteBuffer;
        this.f24025l = byteBuffer.asShortBuffer();
        this.f24026m = byteBuffer;
        this.f24015b = -1;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1976hh
    public final InterfaceC1976hh.a a(InterfaceC1976hh.a aVar) {
        if (aVar.f26742c != 2) {
            throw new InterfaceC1976hh.b(aVar);
        }
        int i4 = this.f24015b;
        if (i4 == -1) {
            i4 = aVar.f26740a;
        }
        this.f24018e = aVar;
        InterfaceC1976hh.a aVar2 = new InterfaceC1976hh.a(i4, aVar.f26741b, 2);
        this.f24019f = aVar2;
        this.f24022i = true;
        return aVar2;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1976hh
    public final void b() {
        this.f24016c = 1.0f;
        this.f24017d = 1.0f;
        InterfaceC1976hh.a aVar = InterfaceC1976hh.a.f26739e;
        this.f24018e = aVar;
        this.f24019f = aVar;
        this.f24020g = aVar;
        this.f24021h = aVar;
        ByteBuffer byteBuffer = InterfaceC1976hh.f26738a;
        this.f24024k = byteBuffer;
        this.f24025l = byteBuffer.asShortBuffer();
        this.f24026m = byteBuffer;
        this.f24015b = -1;
        this.f24022i = false;
        this.f24023j = null;
        this.f24027n = 0L;
        this.f24028o = 0L;
        this.f24029p = false;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1976hh
    public final ByteBuffer c() {
        int b4;
        b12 b12Var = this.f24023j;
        if (b12Var != null && (b4 = b12Var.b()) > 0) {
            if (this.f24024k.capacity() < b4) {
                ByteBuffer order = ByteBuffer.allocateDirect(b4).order(ByteOrder.nativeOrder());
                this.f24024k = order;
                this.f24025l = order.asShortBuffer();
            } else {
                this.f24024k.clear();
                this.f24025l.clear();
            }
            b12Var.a(this.f24025l);
            this.f24028o += b4;
            this.f24024k.limit(b4);
            this.f24026m = this.f24024k;
        }
        ByteBuffer byteBuffer = this.f24026m;
        this.f24026m = InterfaceC1976hh.f26738a;
        return byteBuffer;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1976hh
    public final void d() {
        b12 b12Var = this.f24023j;
        if (b12Var != null) {
            b12Var.e();
        }
        this.f24029p = true;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1976hh
    public final void flush() {
        if (isActive()) {
            InterfaceC1976hh.a aVar = this.f24018e;
            this.f24020g = aVar;
            InterfaceC1976hh.a aVar2 = this.f24019f;
            this.f24021h = aVar2;
            if (this.f24022i) {
                this.f24023j = new b12(aVar.f26740a, aVar.f26741b, this.f24016c, this.f24017d, aVar2.f26740a);
            } else {
                b12 b12Var = this.f24023j;
                if (b12Var != null) {
                    b12Var.a();
                }
            }
        }
        this.f24026m = InterfaceC1976hh.f26738a;
        this.f24027n = 0L;
        this.f24028o = 0L;
        this.f24029p = false;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1976hh
    public final boolean isActive() {
        if (this.f24019f.f26740a != -1) {
            return Math.abs(this.f24016c - 1.0f) >= 1.0E-4f || Math.abs(this.f24017d - 1.0f) >= 1.0E-4f || this.f24019f.f26740a != this.f24018e.f26740a;
        }
        return false;
    }

    public final long a(long j4) {
        if (this.f24028o >= 1024) {
            long j5 = this.f24027n;
            this.f24023j.getClass();
            long c4 = j5 - r2.c();
            int i4 = this.f24021h.f26740a;
            int i5 = this.f24020g.f26740a;
            if (i4 == i5) {
                return u82.a(j4, c4, this.f24028o);
            }
            return u82.a(j4, c4 * i4, this.f24028o * i5);
        }
        return (long) (this.f24016c * j4);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1976hh
    public final boolean a() {
        if (!this.f24029p) {
            return false;
        }
        b12 b12Var = this.f24023j;
        return b12Var == null || b12Var.b() == 0;
    }

    public final void b(float f4) {
        if (this.f24016c != f4) {
            this.f24016c = f4;
            this.f24022i = true;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1976hh
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            b12 b12Var = this.f24023j;
            b12Var.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f24027n += remaining;
            b12Var.b(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    public final void a(float f4) {
        if (this.f24017d != f4) {
            this.f24017d = f4;
            this.f24022i = true;
        }
    }
}
