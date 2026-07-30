package com.onesignal.debug.internal.logging.otel.android;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements E3.c {
    @Override // E3.c
    public void debug(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        com.onesignal.debug.internal.logging.b.debug$default(message, null, 2, null);
    }

    @Override // E3.c
    public void error(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        com.onesignal.debug.internal.logging.b.error$default(message, null, 2, null);
    }

    @Override // E3.c
    public void info(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        com.onesignal.debug.internal.logging.b.info$default(message, null, 2, null);
    }

    @Override // E3.c
    public void warn(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        com.onesignal.debug.internal.logging.b.warn$default(message, null, 2, null);
    }
}
