package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
final class cq {
    static int a(int i4, String str) {
        if (i4 >= 0) {
            return i4;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i4);
    }
}
