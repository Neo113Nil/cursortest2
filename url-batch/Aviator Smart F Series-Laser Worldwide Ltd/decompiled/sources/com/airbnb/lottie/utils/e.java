package com.airbnb.lottie.utils;

import android.util.Log;
import com.airbnb.lottie.l0;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class e implements l0 {
    private static final Set<String> loggedMessages = new HashSet();

    @Override // com.airbnb.lottie.l0
    public void debug(String str) {
        debug(str, null);
    }

    @Override // com.airbnb.lottie.l0
    public void error(String str, Throwable th) {
        if (com.airbnb.lottie.c.DBG) {
            Log.d(com.airbnb.lottie.c.TAG, str, th);
        }
    }

    @Override // com.airbnb.lottie.l0
    public void warning(String str) {
        warning(str, null);
    }

    @Override // com.airbnb.lottie.l0
    public void debug(String str, Throwable th) {
        if (com.airbnb.lottie.c.DBG) {
            Log.d(com.airbnb.lottie.c.TAG, str, th);
        }
    }

    @Override // com.airbnb.lottie.l0
    public void warning(String str, Throwable th) {
        Set<String> set = loggedMessages;
        if (set.contains(str)) {
            return;
        }
        Log.w(com.airbnb.lottie.c.TAG, str, th);
        set.add(str);
    }
}
