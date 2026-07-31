package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dw0;

/* loaded from: classes3.dex */
public abstract class u52 {

    /* renamed from: a, reason: collision with root package name */
    private a f32843a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC1881di f32844b;

    public interface a {
        void a();
    }

    public abstract v52 a(to1[] to1VarArr, o52 o52Var, dw0.b bVar, x42 x42Var);

    public void a(C1856ch c1856ch) {
    }

    public abstract void a(Object obj);

    protected final void b() {
        a aVar = this.f32843a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public boolean c() {
        return this instanceof h00;
    }

    public void d() {
        this.f32843a = null;
        this.f32844b = null;
    }

    protected final InterfaceC1881di a() {
        InterfaceC1881di interfaceC1881di = this.f32844b;
        if (interfaceC1881di != null) {
            return interfaceC1881di;
        }
        throw new IllegalStateException();
    }

    public final void a(a aVar, InterfaceC1881di interfaceC1881di) {
        this.f32843a = aVar;
        this.f32844b = interfaceC1881di;
    }
}
