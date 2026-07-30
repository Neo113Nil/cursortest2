package com.facebook.login;

import defpackage.up2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class NonceUtil {
    public static final NonceUtil INSTANCE = new NonceUtil();

    private NonceUtil() {
    }

    public static final boolean isValidNonce(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return !(up2.v(str, ' ', 0, 6) >= 0);
    }
}
