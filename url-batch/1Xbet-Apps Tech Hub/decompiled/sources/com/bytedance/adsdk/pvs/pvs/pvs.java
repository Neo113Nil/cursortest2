package com.bytedance.adsdk.pvs.pvs;

/* compiled from: IllegalFormatException.java */
/* loaded from: classes.dex */
public class pvs extends RuntimeException {
    public pvs(String str, String str2) {
        super(str + ",problem area:" + str2);
    }
}
