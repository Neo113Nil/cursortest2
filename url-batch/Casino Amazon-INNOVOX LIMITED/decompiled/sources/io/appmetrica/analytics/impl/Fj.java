package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Fj implements Ra {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Uj f847a;

    public Fj(Uj uj) {
        this.f847a = uj;
    }

    @Override // io.appmetrica.analytics.impl.Ra
    public final void a(Sa sa) {
        Tj a2 = ((C0174fd) this.f847a).a();
        if (a2 != null) {
            sa.reportEvent(a2.f1062a, a2.b);
        }
    }
}
