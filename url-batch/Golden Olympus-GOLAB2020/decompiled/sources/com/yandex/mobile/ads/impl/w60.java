package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class w60 extends RuntimeException {
    public w60(int i4) {
        super(a(i4));
    }

    private static String a(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
