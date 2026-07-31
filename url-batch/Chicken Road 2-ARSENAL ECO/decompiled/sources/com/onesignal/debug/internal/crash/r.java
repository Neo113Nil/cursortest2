package com.onesignal.debug.internal.crash;

import android.os.Build;

/* loaded from: classes.dex */
public final class r {
    public static final r INSTANCE = new r();
    public static final int MIN_SDK_VERSION = 26;
    private static boolean isSupported;

    static {
        isSupported = Build.VERSION.SDK_INT >= 26;
    }

    private r() {
    }

    public final boolean isSupported() {
        return isSupported;
    }

    public final void reset() {
        isSupported = Build.VERSION.SDK_INT >= 26;
    }

    public final void setSupported$com_onesignal_core(boolean z5) {
        isSupported = z5;
    }
}
