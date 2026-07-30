package com.onesignal.inAppMessages.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class e implements N2.i, N2.h, N2.f, N2.e {
    private final N2.a message;

    public e(N2.a message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
    }

    @Override // N2.i, N2.h, N2.f, N2.e
    public N2.a getMessage() {
        return this.message;
    }
}
