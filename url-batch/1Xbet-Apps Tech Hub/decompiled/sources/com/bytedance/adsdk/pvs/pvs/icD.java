package com.bytedance.adsdk.pvs.pvs;

/* compiled from: UnParsedException.java */
/* loaded from: classes.dex */
public class icD extends RuntimeException {
    public icD(String str, Throwable th) {
        super("Unable to parse expression:".concat(String.valueOf(str)), th);
    }
}
