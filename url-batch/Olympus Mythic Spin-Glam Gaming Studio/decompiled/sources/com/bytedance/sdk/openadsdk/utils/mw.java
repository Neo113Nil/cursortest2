package com.bytedance.sdk.openadsdk.utils;

import java.io.Closeable;

/* loaded from: classes6.dex */
public class mw {
    public static void zmn(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }
}
