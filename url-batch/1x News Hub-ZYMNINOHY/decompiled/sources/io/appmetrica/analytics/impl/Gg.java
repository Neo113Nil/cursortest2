package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes.dex */
public final class Gg implements Ul, Na {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6046a;

    /* renamed from: b, reason: collision with root package name */
    public final X4 f6047b;

    /* renamed from: c, reason: collision with root package name */
    public final Y4 f6048c;

    /* renamed from: d, reason: collision with root package name */
    public final Em f6049d;

    /* renamed from: e, reason: collision with root package name */
    public final Wa f6050e;

    public Gg(Context context, X4 x4, C0922w4 c0922w4, InterfaceC0483f5 interfaceC0483f5, Y4 y4, Ll ll) {
        this.f6046a = context;
        this.f6047b = x4;
        this.f6048c = y4;
        Em a3 = ll.a(context, x4, c0922w4.f8543a);
        this.f6049d = a3;
        this.f6050e = interfaceC0483f5.a(context, x4, c0922w4.f8544b, a3);
        ll.a(x4, this);
    }

    public final X4 a() {
        return this.f6047b;
    }

    public final Context b() {
        return this.f6046a;
    }

    public final void a(InterfaceC0663m4 interfaceC0663m4) {
        this.f6048c.f6886a.add(interfaceC0663m4);
    }

    public final void b(InterfaceC0663m4 interfaceC0663m4) {
        this.f6048c.f6886a.remove(interfaceC0663m4);
    }

    @Override // io.appmetrica.analytics.impl.Ul
    public final void a(C0603jm c0603jm) {
        ((C0457e5) this.f6050e).a(c0603jm);
    }

    @Override // io.appmetrica.analytics.impl.Ul
    public final void a(Nl nl, C0603jm c0603jm) {
        ((C0457e5) this.f6050e).getClass();
    }

    @Override // io.appmetrica.analytics.impl.Na
    public final void a(C0922w4 c0922w4) {
        this.f6049d.a(c0922w4.f8543a);
        this.f6050e.a(c0922w4.f8544b);
    }

    public Gg(Context context, X4 x4, C0922w4 c0922w4, InterfaceC0483f5 interfaceC0483f5) {
        this(context, x4, c0922w4, interfaceC0483f5, new Y4(), Ll.a());
    }

    public final void a(W5 w5, C0922w4 c0922w4) {
        if (!D9.f5888c.contains(EnumC0567ib.a(w5.f6818d))) {
            this.f6050e.a(c0922w4.f8544b);
        }
        ((C0457e5) this.f6050e).a(w5);
    }
}
