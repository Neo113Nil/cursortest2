package com.bytedance.sdk.component.utils;

import java.io.Closeable;

/* loaded from: classes4.dex */
public class iv {
    public static void zmn(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}
