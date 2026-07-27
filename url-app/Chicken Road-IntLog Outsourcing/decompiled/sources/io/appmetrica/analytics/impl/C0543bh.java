package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.bh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0543bh extends Wg {

    /* renamed from: b, reason: collision with root package name */
    public final zo f7944b;

    public C0543bh(C0608e5 c0608e5) {
        this(c0608e5, c0608e5.u());
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        C0608e5 c0608e5 = this.f7670a;
        if (this.f7944b.c()) {
            return false;
        }
        if (!this.f7944b.d()) {
            C0948r9 c0948r9 = c0608e5.f8098n;
            c0948r9.f9150c.b(W5.a(w5, EnumC0718ib.EVENT_TYPE_FIRST_ACTIVATION));
        }
        zo zoVar = this.f7944b;
        synchronized (zoVar) {
            Ao ao = zoVar.f9678a;
            ao.a(ao.a().put("first_event_done", true));
        }
        return false;
    }

    public C0543bh(C0608e5 c0608e5, zo zoVar) {
        super(c0608e5);
        this.f7944b = zoVar;
    }
}
