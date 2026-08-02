package com.startapp.sdk.internal;

import android.util.Base64;
import w3.AbstractC1504a;

/* loaded from: classes.dex */
public abstract class z1 {
    public static final String a(String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        try {
            byte[] decode = Base64.decode(str, 0);
            kotlin.jvm.internal.i.d(decode, "decode(...)");
            return new String(decode, AbstractC1504a.f15936a);
        } catch (Exception unused) {
            return str;
        }
    }
}
