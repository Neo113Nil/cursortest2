package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.bh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0392bh extends Wg {

    /* renamed from: b, reason: collision with root package name */
    public final zo f7091b;

    public C0392bh(C0457e5 c0457e5) {
        this(c0457e5, c0457e5.u());
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        C0457e5 c0457e5 = this.f6835a;
        if (this.f7091b.c()) {
            return false;
        }
        if (!this.f7091b.d()) {
            C0797r9 c0797r9 = c0457e5.f7237n;
            c0797r9.f8216c.b(W5.a(w5, EnumC0567ib.EVENT_TYPE_FIRST_ACTIVATION));
        }
        zo zoVar = this.f7091b;
        synchronized (zoVar) {
            Ao ao = zoVar.f8716a;
            ao.a(ao.a().put("first_event_done", true));
        }
        return false;
    }

    public C0392bh(C0457e5 c0457e5, zo zoVar) {
        super(c0457e5);
        this.f7091b = zoVar;
    }
}
