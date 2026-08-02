package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Jj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Yj f6215a;

    public Jj(Yj yj) {
        this.f6215a = yj;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        Xj a3 = ((C0646ld) this.f6215a).a();
        if (a3 != null) {
            ya.reportEvent(a3.f6870a, a3.f6871b);
        }
    }
}
