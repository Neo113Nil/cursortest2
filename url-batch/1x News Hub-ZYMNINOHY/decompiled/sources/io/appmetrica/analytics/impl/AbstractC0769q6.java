package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ICrashTransformer;

/* renamed from: io.appmetrica.analytics.impl.q6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0769q6 implements Ma {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0743p6 f8126a;

    /* renamed from: b, reason: collision with root package name */
    public final ICrashTransformer f8127b;

    /* renamed from: c, reason: collision with root package name */
    public final T9 f8128c;

    public AbstractC0769q6(InterfaceC0743p6 interfaceC0743p6, ICrashTransformer iCrashTransformer, T9 t9) {
        this.f8126a = interfaceC0743p6;
        this.f8127b = iCrashTransformer;
        this.f8128c = t9;
    }

    @Override // io.appmetrica.analytics.impl.Ma
    public final void a(Throwable th, V v) {
        if (this.f8126a.a(th)) {
            ICrashTransformer iCrashTransformer = this.f8127b;
            if (iCrashTransformer == null || th == null || (th = iCrashTransformer.process(th)) != null) {
                Sn a3 = Vn.a(th, v, null, (String) this.f8128c.f6696b.a(), (Boolean) this.f8128c.f6697c.a());
                C0671mc c0671mc = (C0671mc) ((Gh) this).f6051d;
                c0671mc.f6919a.a().a(c0671mc.f7874b).a(a3);
            }
        }
    }

    public final InterfaceC0743p6 b() {
        return this.f8126a;
    }

    public final ICrashTransformer a() {
        return this.f8127b;
    }
}
