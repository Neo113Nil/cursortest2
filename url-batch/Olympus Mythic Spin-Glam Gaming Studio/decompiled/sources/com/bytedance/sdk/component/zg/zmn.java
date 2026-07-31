package com.bytedance.sdk.component.zg;

/* loaded from: classes15.dex */
public class zmn {
    private static com.bytedance.sdk.component.zmn zmn;

    public static void zmn(com.bytedance.sdk.component.zmn zmnVar) {
        zmn = zmnVar;
    }

    public static void zmn(Runnable runnable) {
        com.bytedance.sdk.component.zmn zmnVar = zmn;
        if (zmnVar == null) {
            return;
        }
        zmnVar.zmn(runnable);
    }
}
