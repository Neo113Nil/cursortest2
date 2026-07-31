package com.bytedance.sdk.openadsdk.cyb.fs;

/* loaded from: classes4.dex */
class btk implements zn {
    private static volatile btk zmn;

    @Override // com.bytedance.sdk.openadsdk.cyb.fs.zn
    public void zmn(com.bytedance.sdk.openadsdk.cyb.fs fsVar) {
    }

    @Override // com.bytedance.sdk.openadsdk.cyb.fs.zn
    public void zmn(com.bytedance.sdk.openadsdk.cyb.fs fsVar, boolean z) {
    }

    public static btk zmn() {
        if (zmn == null) {
            synchronized (btk.class) {
                try {
                    if (zmn == null) {
                        zmn = new btk();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zmn;
    }

    private btk() {
    }
}
