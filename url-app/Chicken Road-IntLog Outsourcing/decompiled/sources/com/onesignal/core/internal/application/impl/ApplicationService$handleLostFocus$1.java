package com.onesignal.core.internal.application.impl;

import com.onesignal.core.internal.application.IApplicationLifecycleHandler;
import f4.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class ApplicationService$handleLostFocus$1 extends j implements InterfaceC1441l {
    public static final ApplicationService$handleLostFocus$1 INSTANCE = new ApplicationService$handleLostFocus$1();

    public ApplicationService$handleLostFocus$1() {
        super(1);
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IApplicationLifecycleHandler) obj);
        return v.f5689a;
    }

    public final void invoke(IApplicationLifecycleHandler it) {
        i.e(it, "it");
        it.onUnfocused();
    }
}
