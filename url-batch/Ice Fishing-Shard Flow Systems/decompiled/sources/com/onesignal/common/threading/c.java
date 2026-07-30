package com.onesignal.common.threading;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c {
    public static final c INSTANCE = new c();
    private static volatile boolean useBackgroundThreading;

    private c() {
    }

    public final boolean getUseBackgroundThreading() {
        return useBackgroundThreading;
    }

    public final void setUseBackgroundThreading(boolean z7) {
        useBackgroundThreading = z7;
    }

    public final void updateUseBackgroundThreading(boolean z7, String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        boolean z8 = useBackgroundThreading;
        useBackgroundThreading = z7;
        if (z8 != z7) {
            com.onesignal.debug.internal.logging.b.info$default("OneSignal: ThreadingMode changed to useBackgroundThreading=" + z7 + " (source=" + source + ')', null, 2, null);
            return;
        }
        com.onesignal.debug.internal.logging.b.debug$default("OneSignal: ThreadingMode unchanged (useBackgroundThreading=" + z7 + ", source=" + source + ')', null, 2, null);
    }
}
