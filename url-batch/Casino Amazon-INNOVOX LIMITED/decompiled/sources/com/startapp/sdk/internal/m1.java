package com.startapp.sdk.internal;

import android.os.Build;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class m1 {
    public static String a(String str) {
        boolean z;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '-' || charAt == '_') {
                z = true;
                break;
            }
            if (charAt == '+' || charAt == '/') {
                break;
            }
        }
        z = false;
        return new String(Build.VERSION.SDK_INT >= 26 ? z ? Base64.getUrlDecoder().decode(str) : Base64.getDecoder().decode(str) : z ? android.util.Base64.decode(str, 8) : android.util.Base64.decode(str, 0), StandardCharsets.UTF_8);
    }
}
