package com.onesignal.common.threading;

import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class d {
    public static final d INSTANCE = new d();
    private static volatile boolean useBackgroundThreading;

    private d() {
    }

    public final boolean getUseBackgroundThreading() {
        return useBackgroundThreading;
    }

    public final void setUseBackgroundThreading(boolean z8) {
        useBackgroundThreading = z8;
    }

    public final void updateUseBackgroundThreading(boolean z8, String source) {
        h.e(source, "source");
        boolean z9 = useBackgroundThreading;
        useBackgroundThreading = z8;
        if (z9 != z8) {
            com.onesignal.debug.internal.logging.b.info$default("OneSignal: ThreadingMode changed to useBackgroundThreading=" + z8 + " (source=" + source + ')', null, 2, null);
            return;
        }
        com.onesignal.debug.internal.logging.b.debug$default("OneSignal: ThreadingMode unchanged (useBackgroundThreading=" + z8 + ", source=" + source + ')', null, 2, null);
    }
}
