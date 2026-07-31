package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes3.dex */
public abstract class Bd implements InterfaceC0185fo, InterfaceC0266j2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f776a;
    public final int b;
    public final to c;
    public final K2 d;
    public PublicLogger e = PublicLogger.getAnonymousInstance();

    public Bd(int i, String str, to toVar, K2 k2) {
        this.b = i;
        this.f776a = str;
        this.c = toVar;
        this.d = k2;
    }

    public final C0211go a() {
        C0211go c0211go = new C0211go();
        c0211go.b = this.b;
        c0211go.f1279a = this.f776a.getBytes();
        c0211go.d = new C0262io();
        c0211go.c = new C0237ho();
        return c0211go;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0185fo
    public abstract /* synthetic */ void a(C0159eo c0159eo);

    public final K2 b() {
        return this.d;
    }

    public final String c() {
        return this.f776a;
    }

    public final to d() {
        return this.c;
    }

    public final int e() {
        return this.b;
    }

    public final boolean f() {
        ro a2 = this.c.a(this.f776a);
        if (a2.f1473a) {
            return true;
        }
        this.e.warning("Attribute " + this.f776a + " of type " + ((String) Pn.f1008a.get(this.b)) + " is skipped because " + a2.b, new Object[0]);
        return false;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0185fo
    public final void a(PublicLogger publicLogger) {
        this.e = publicLogger;
    }
}
