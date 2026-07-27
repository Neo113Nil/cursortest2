package io.appmetrica.analytics.impl;

import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final /* synthetic */ class Ud extends kotlin.jvm.internal.h implements InterfaceC1441l {
    public Ud(Object obj) {
        super(1, obj, Vd.class, "markCrashCompletedAndDeleteCompletedCrashes", "markCrashCompletedAndDeleteCompletedCrashes(Ljava/lang/String;)V", 0);
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(Object obj) {
        Vd vd = (Vd) this.receiver;
        vd.f7626a.markCrashCompleted((String) obj);
        vd.f7626a.deleteCompletedCrashes();
        return f4.v.f5689a;
    }
}
