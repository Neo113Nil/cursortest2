package com.bytedance.sdk.component.sUS.pvs;

/* compiled from: AssertUtils.java */
/* loaded from: classes.dex */
public class vG {
    public static void pvs(Object obj, String str) {
        if (obj == null) {
            pvs(str);
        }
    }

    public static void pvs(String str) {
        throw new IllegalArgumentException(str);
    }
}
