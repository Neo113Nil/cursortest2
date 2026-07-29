package com.mopub.common;

import com.umeng.commonsdk.proguard.d;

/* loaded from: classes2.dex */
public enum CreativeOrientation {
    PORTRAIT,
    LANDSCAPE,
    UNDEFINED;

    public static CreativeOrientation fromHeader(String str) {
        if ("l".equalsIgnoreCase(str)) {
            return LANDSCAPE;
        }
        if (d.ao.equalsIgnoreCase(str)) {
            return PORTRAIT;
        }
        return UNDEFINED;
    }
}
