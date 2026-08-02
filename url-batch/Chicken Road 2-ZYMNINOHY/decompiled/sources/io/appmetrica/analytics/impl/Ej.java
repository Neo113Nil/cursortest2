package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ej implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Tj f10259a;

    public Ej(Tj tj) {
        this.f10259a = tj;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra) {
        Sj a3 = ((C0587ed) this.f10259a).a();
        if (a3 != null) {
            ra.reportEvent(a3.f10951a, a3.f10952b);
        }
    }
}
