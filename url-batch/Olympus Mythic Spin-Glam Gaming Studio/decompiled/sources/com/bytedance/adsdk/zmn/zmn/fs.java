package com.bytedance.adsdk.zmn.zmn;

/* loaded from: classes5.dex */
public class fs extends RuntimeException {
    public fs(String str, Throwable th) {
        super("Unable to parse expression:".concat(String.valueOf(str)), th);
    }
}
