package com.bytedance.sdk.openadsdk.core;

/* loaded from: classes6.dex */
public class zn {
    private static volatile zn zmn;

    private zn() {
    }

    public static zn zmn() {
        if (zmn == null) {
            synchronized (zn.class) {
                try {
                    if (zmn == null) {
                        zmn = new zn();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zmn;
    }

    public void zmn(String str, String str2) {
        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("ttopenadsdk", str, str2);
    }

    public String fs(String str, String str2) {
        return com.bytedance.sdk.openadsdk.kw.fb.zmn.fs("ttopenadsdk", str, str2);
    }

    public void zmn(String str, int i) {
        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("ttopenadsdk", str, Integer.valueOf(i));
    }

    public int fs(String str, int i) {
        return com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("ttopenadsdk", str, i);
    }

    public void zmn(String str, long j) {
        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("ttopenadsdk", str, Long.valueOf(j));
    }

    public Long fs(String str, long j) {
        return Long.valueOf(com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("ttopenadsdk", str, j));
    }

    public void zmn(String str) {
        com.bytedance.sdk.openadsdk.kw.fb.zmn.zmn("ttopenadsdk", str);
    }
}
