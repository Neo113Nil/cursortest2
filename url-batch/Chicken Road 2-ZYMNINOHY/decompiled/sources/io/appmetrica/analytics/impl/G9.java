package io.appmetrica.analytics.impl;

import w3.AbstractC1504a;

/* loaded from: classes.dex */
public abstract class G9 {
    public static final A9 a(int i4, String str) {
        byte[] bArr;
        A9 a9 = new A9();
        a9.f10032a = i4;
        if (str == null || (bArr = str.getBytes(AbstractC1504a.f15936a)) == null) {
            bArr = a9.f10033b;
        }
        a9.f10033b = bArr;
        return a9;
    }
}
