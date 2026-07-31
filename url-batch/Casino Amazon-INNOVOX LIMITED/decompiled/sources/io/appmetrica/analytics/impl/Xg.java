package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Xg extends Sg {
    public final yo b;

    public Xg(Y4 y4) {
        this(y4, y4.u());
    }

    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(Q5 q5) {
        Y4 y4 = this.f1045a;
        if (this.b.c()) {
            return false;
        }
        if (!this.b.d()) {
            C0325l9 c0325l9 = y4.n;
            c0325l9.c.b(Q5.a(q5, EnumC0095cb.EVENT_TYPE_FIRST_ACTIVATION));
        }
        yo yoVar = this.b;
        synchronized (yoVar) {
            zo zoVar = yoVar.f1591a;
            zoVar.a(zoVar.a().put("first_event_done", true));
        }
        return false;
    }

    public Xg(Y4 y4, yo yoVar) {
        super(y4);
        this.b = yoVar;
    }
}
