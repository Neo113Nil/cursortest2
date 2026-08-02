package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public abstract class N9 {
    public static final H9 a(int i3, String str) {
        byte[] bArr;
        H9 h9 = new H9();
        h9.f6072a = i3;
        if (str == null || (bArr = str.getBytes(s2.a.f10316a)) == null) {
            bArr = h9.f6073b;
        }
        h9.f6073b = bArr;
        return h9;
    }
}
