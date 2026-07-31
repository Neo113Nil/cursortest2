package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class hd3 {
    public static gd3 a(String str) {
        if (ee3.j().containsKey(str)) {
            return ee3.j().get(str);
        }
        throw new GeneralSecurityException(str.length() != 0 ? "cannot find key template: ".concat(str) : new String("cannot find key template: "));
    }
}
