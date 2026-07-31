package io.appmetrica.analytics.impl;

import kotlin.text.Charsets;

/* renamed from: io.appmetrica.analytics.impl.ba, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2514ba {
    public static final V9 a(int i4, String str) {
        byte[] bArr;
        V9 v9 = new V9();
        v9.f38414a = i4;
        if (str == null || (bArr = str.getBytes(Charsets.UTF_8)) == null) {
            bArr = v9.f38415b;
        }
        v9.f38415b = bArr;
        return v9;
    }
}
