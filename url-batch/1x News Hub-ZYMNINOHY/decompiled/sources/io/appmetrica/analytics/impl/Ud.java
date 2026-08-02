package io.appmetrica.analytics.impl;

import b2.C0195i;

/* loaded from: classes.dex */
public final /* synthetic */ class Ud extends kotlin.jvm.internal.i implements l2.l {
    public Ud(Object obj) {
        super(1, obj, Vd.class, "markCrashCompletedAndDeleteCompletedCrashes", "markCrashCompletedAndDeleteCompletedCrashes(Ljava/lang/String;)V", 0);
    }

    @Override // l2.l
    public final Object invoke(Object obj) {
        Vd vd = (Vd) this.receiver;
        vd.f6793a.markCrashCompleted((String) obj);
        vd.f6793a.deleteCompletedCrashes();
        return C0195i.f2555a;
    }
}
