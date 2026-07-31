package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.InterfaceC1976hh;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.yandex.mobile.ads.impl.qj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2189qj implements InterfaceC1976hh {

    /* renamed from: b, reason: collision with root package name */
    protected InterfaceC1976hh.a f30796b;

    /* renamed from: c, reason: collision with root package name */
    protected InterfaceC1976hh.a f30797c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC1976hh.a f30798d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC1976hh.a f30799e;

    /* renamed from: f, reason: collision with root package name */
    private ByteBuffer f30800f;

    /* renamed from: g, reason: collision with root package name */
    private ByteBuffer f30801g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f30802h;

    public AbstractC2189qj() {
        ByteBuffer byteBuffer = InterfaceC1976hh.f26738a;
        this.f30800f = byteBuffer;
        this.f30801g = byteBuffer;
        InterfaceC1976hh.a aVar = InterfaceC1976hh.a.f26739e;
        this.f30798d = aVar;
        this.f30799e = aVar;
        this.f30796b = aVar;
        this.f30797c = aVar;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1976hh
    public final InterfaceC1976hh.a a(InterfaceC1976hh.a aVar) {
        this.f30798d = aVar;
        this.f30799e = b(aVar);
        return isActive() ? this.f30799e : InterfaceC1976hh.a.f26739e;
    }

    protected abstract InterfaceC1976hh.a b(InterfaceC1976hh.a aVar);

    @Override // com.yandex.mobile.ads.impl.InterfaceC1976hh
    public final void b() {
        flush();
        this.f30800f = InterfaceC1976hh.f26738a;
        InterfaceC1976hh.a aVar = InterfaceC1976hh.a.f26739e;
        this.f30798d = aVar;
        this.f30799e = aVar;
        this.f30796b = aVar;
        this.f30797c = aVar;
        h();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1976hh
    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.f30801g;
        this.f30801g = InterfaceC1976hh.f26738a;
        return byteBuffer;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1976hh
    public final void d() {
        this.f30802h = true;
        g();
    }

    protected final boolean e() {
        return this.f30801g.hasRemaining();
    }

    protected void f() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1976hh
    public final void flush() {
        this.f30801g = InterfaceC1976hh.f26738a;
        this.f30802h = false;
        this.f30796b = this.f30798d;
        this.f30797c = this.f30799e;
        f();
    }

    protected void g() {
    }

    protected void h() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1976hh
    public boolean isActive() {
        return this.f30799e != InterfaceC1976hh.a.f26739e;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1976hh
    public boolean a() {
        return this.f30802h && this.f30801g == InterfaceC1976hh.f26738a;
    }

    protected final ByteBuffer a(int i4) {
        if (this.f30800f.capacity() < i4) {
            this.f30800f = ByteBuffer.allocateDirect(i4).order(ByteOrder.nativeOrder());
        } else {
            this.f30800f.clear();
        }
        ByteBuffer byteBuffer = this.f30800f;
        this.f30801g = byteBuffer;
        return byteBuffer;
    }
}
