package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* loaded from: classes.dex */
public final class un3 {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<SecureRandom> f12880a = new tn3();

    public static byte[] a(int i7) {
        byte[] bArr = new byte[i7];
        f12880a.get().nextBytes(bArr);
        return bArr;
    }
}
