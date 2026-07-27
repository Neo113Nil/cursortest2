package com.onesignal.debug.internal.crash;

/* loaded from: classes.dex */
public final class AnrConstants {
    public static final long DEFAULT_ANR_THRESHOLD_MS = 5000;
    public static final long DEFAULT_CHECK_INTERVAL_MS = 2000;
    public static final AnrConstants INSTANCE = new AnrConstants();

    private AnrConstants() {
    }
}
