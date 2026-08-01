package com.bytedance.sdk.openadsdk.kj;

/* compiled from: PlayableLog.java */
/* loaded from: classes2.dex */
public class yiw {
    private static pvs pvs;

    /* compiled from: PlayableLog.java */
    public interface pvs {
        void pvs(String str, String str2, Throwable th);
    }

    public static void pvs(pvs pvsVar) {
        pvs = pvsVar;
    }

    public static boolean pvs() {
        return pvs != null;
    }

    public static void pvs(String str, String str2, Throwable th) {
        if (pvs == null) {
            return;
        }
        if (th == null) {
            th = new Throwable();
        }
        pvs.pvs(str, str2, th);
    }
}
