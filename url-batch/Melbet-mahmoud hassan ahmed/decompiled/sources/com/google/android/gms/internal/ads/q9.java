package com.google.android.gms.internal.ads;

import android.util.Base64;

/* loaded from: classes.dex */
public final class q9 {
    public static String a(byte[] bArr, boolean z6) {
        return Base64.encodeToString(bArr, true != z6 ? 2 : 11);
    }

    public static byte[] b(String str, boolean z6) {
        byte[] decode = Base64.decode(str, true != z6 ? 2 : 11);
        if (decode.length != 0 || str.length() <= 0) {
            return decode;
        }
        throw new IllegalArgumentException(str.length() != 0 ? "Unable to decode ".concat(str) : new String("Unable to decode "));
    }
}
