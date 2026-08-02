package io.appmetrica.analytics.impl;

import c3.C0297i;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public final /* synthetic */ class Nd extends kotlin.jvm.internal.h implements InterfaceC1339l {
    public Nd(Object obj) {
        super(1, obj, Od.class, "markCrashCompletedAndDeleteCompletedCrashes", "markCrashCompletedAndDeleteCompletedCrashes(Ljava/lang/String;)V", 0);
    }

    @Override // o3.InterfaceC1339l
    public final Object invoke(Object obj) {
        Od od = (Od) this.receiver;
        od.f10750a.markCrashCompleted((String) obj);
        od.f10750a.deleteCompletedCrashes();
        return C0297i.f5732a;
    }
}
