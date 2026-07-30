package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.gms.internal.ads.oi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3698oi implements InterfaceC3050ci {

    /* renamed from: b, reason: collision with root package name */
    public C3751ph f33178b;

    /* renamed from: c, reason: collision with root package name */
    public C3751ph f33179c;

    /* renamed from: d, reason: collision with root package name */
    public C3751ph f33180d;

    /* renamed from: e, reason: collision with root package name */
    public C3751ph f33181e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f33182f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f33183g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f33184h;

    public AbstractC3698oi() {
        ByteBuffer byteBuffer = InterfaceC3050ci.f29732a;
        this.f33182f = byteBuffer;
        this.f33183g = byteBuffer;
        C3751ph c3751ph = C3751ph.f33430e;
        this.f33180d = c3751ph;
        this.f33181e = c3751ph;
        this.f33178b = c3751ph;
        this.f33179c = c3751ph;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3050ci
    public final C3751ph b(C3751ph c3751ph) {
        this.f33180d = c3751ph;
        this.f33181e = k(c3751ph);
        return i() ? this.f33181e : C3751ph.f33430e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3050ci
    public final void c() {
        this.f33184h = true;
        l();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3050ci
    public boolean e() {
        return this.f33184h && this.f33183g == InterfaceC3050ci.f29732a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3050ci
    public ByteBuffer f() {
        ByteBuffer byteBuffer = this.f33183g;
        this.f33183g = InterfaceC3050ci.f29732a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3050ci
    public final void g(C2673Mh c2673Mh) {
        this.f33183g = InterfaceC3050ci.f29732a;
        this.f33184h = false;
        this.f33178b = this.f33180d;
        this.f33179c = this.f33181e;
        m();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3050ci
    public final void h() {
        ByteBuffer byteBuffer = InterfaceC3050ci.f29732a;
        this.f33183g = byteBuffer;
        this.f33184h = false;
        this.f33182f = byteBuffer;
        C3751ph c3751ph = C3751ph.f33430e;
        this.f33180d = c3751ph;
        this.f33181e = c3751ph;
        this.f33178b = c3751ph;
        this.f33179c = c3751ph;
        n();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3050ci
    public boolean i() {
        return this.f33181e != C3751ph.f33430e;
    }

    public final ByteBuffer j(int i) {
        if (this.f33182f.capacity() < i) {
            this.f33182f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f33182f.clear();
        }
        ByteBuffer byteBuffer = this.f33182f;
        this.f33183g = byteBuffer;
        return byteBuffer;
    }

    public abstract C3751ph k(C3751ph c3751ph);

    public void l() {
    }

    public void n() {
    }

    public void m() {
    }
}
