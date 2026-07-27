package com.onesignal.core.internal.application.impl;

import f4.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class ApplicationService$onGlobalLayout$1 extends j implements InterfaceC1441l {
    public static final ApplicationService$onGlobalLayout$1 INSTANCE = new ApplicationService$onGlobalLayout$1();

    public ApplicationService$onGlobalLayout$1() {
        super(1);
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ISystemConditionHandler) obj);
        return v.f5689a;
    }

    public final void invoke(ISystemConditionHandler it) {
        i.e(it, "it");
        it.systemConditionChanged();
    }
}
