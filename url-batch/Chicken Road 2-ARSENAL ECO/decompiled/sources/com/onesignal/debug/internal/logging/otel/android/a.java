package com.onesignal.debug.internal.logging.otel.android;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class a implements c3.c {
    @Override // c3.c
    public void debug(String message) {
        i.e(message, "message");
        com.onesignal.debug.internal.logging.b.debug$default(message, null, 2, null);
    }

    @Override // c3.c
    public void error(String message) {
        i.e(message, "message");
        com.onesignal.debug.internal.logging.b.error$default(message, null, 2, null);
    }

    @Override // c3.c
    public void info(String message) {
        i.e(message, "message");
        com.onesignal.debug.internal.logging.b.info$default(message, null, 2, null);
    }

    @Override // c3.c
    public void warn(String message) {
        i.e(message, "message");
        com.onesignal.debug.internal.logging.b.warn$default(message, null, 2, null);
    }
}
