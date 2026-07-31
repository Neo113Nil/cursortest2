package com.onesignal.inAppMessages.internal;

import l2.InterfaceC0491a;

/* loaded from: classes.dex */
public class e implements l2.i, l2.h, l2.f, l2.e {
    private final InterfaceC0491a message;

    public e(InterfaceC0491a message) {
        kotlin.jvm.internal.i.e(message, "message");
        this.message = message;
    }

    @Override // l2.i, l2.h, l2.f, l2.e
    public InterfaceC0491a getMessage() {
        return this.message;
    }
}
