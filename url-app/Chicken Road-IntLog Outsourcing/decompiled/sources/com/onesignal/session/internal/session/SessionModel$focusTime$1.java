package com.onesignal.session.internal.session;

import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class SessionModel$focusTime$1 extends j implements InterfaceC1430a {
    public static final SessionModel$focusTime$1 INSTANCE = new SessionModel$focusTime$1();

    public SessionModel$focusTime$1() {
        super(0);
    }

    @Override // t4.InterfaceC1430a
    public final Long invoke() {
        return Long.valueOf(System.currentTimeMillis());
    }
}
