package com.stripe.android.core;

import android.util.Log;

/* loaded from: classes8.dex */
public final class Logger$Companion$NOOP_LOGGER$1 {
    public final /* synthetic */ int $r8$classId;

    private final void debug$com$stripe$android$core$Logger$Companion$NOOP_LOGGER$1(String str) {
    }

    private final void error$com$stripe$android$core$Logger$Companion$NOOP_LOGGER$1(String str, Throwable th) {
    }

    private final void info$com$stripe$android$core$Logger$Companion$NOOP_LOGGER$1(String str) {
    }

    public final void debug(String str) {
        switch (this.$r8$classId) {
            case 0:
                break;
            default:
                Log.d("StripeSdk", str);
                break;
        }
    }

    public final void error(String str, Throwable th) {
        switch (this.$r8$classId) {
            case 0:
                break;
            default:
                Log.e("StripeSdk", str, th);
                break;
        }
    }

    public final void info(String str) {
        switch (this.$r8$classId) {
            case 0:
                break;
            default:
                Log.i("StripeSdk", str);
                break;
        }
    }
}
