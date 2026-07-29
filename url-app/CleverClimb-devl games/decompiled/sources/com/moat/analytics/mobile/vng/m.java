package com.moat.analytics.mobile.vng;

import android.util.Log;

/* loaded from: classes2.dex */
class m extends Exception {
    m() {
    }

    static void a(Exception exc) {
        if (w.a().f7406b) {
            Log.e("MoatException", Log.getStackTraceString(exc));
        }
    }
}
