package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Jj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Yj f7018a;

    public Jj(Yj yj) {
        this.f7018a = yj;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        Xj a6 = ((C0797ld) this.f7018a).a();
        if (a6 != null) {
            ya.reportEvent(a6.f7707a, a6.f7708b);
        }
    }
}
