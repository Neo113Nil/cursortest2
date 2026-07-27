package com.onesignal.session.internal.session.impl;

import com.onesignal.session.internal.session.ISessionLifecycleHandler;
import f4.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class SessionService$handleOnFocus$1 extends j implements InterfaceC1441l {
    public static final SessionService$handleOnFocus$1 INSTANCE = new SessionService$handleOnFocus$1();

    public SessionService$handleOnFocus$1() {
        super(1);
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ISessionLifecycleHandler) obj);
        return v.f5689a;
    }

    public final void invoke(ISessionLifecycleHandler it) {
        i.e(it, "it");
        it.onSessionStarted();
    }
}
