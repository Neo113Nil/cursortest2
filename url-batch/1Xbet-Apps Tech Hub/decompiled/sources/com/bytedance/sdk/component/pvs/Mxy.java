package com.bytedance.sdk.component.pvs;

/* compiled from: DebugUtil.java */
/* loaded from: classes.dex */
class Mxy {
    private static boolean pvs;

    static void pvs(RuntimeException runtimeException) {
        if (pvs) {
            throw runtimeException;
        }
    }
}
