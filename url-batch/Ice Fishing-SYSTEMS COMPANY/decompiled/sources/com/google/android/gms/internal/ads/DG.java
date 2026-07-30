package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* loaded from: classes2.dex */
public abstract class DG {

    /* renamed from: a, reason: collision with root package name */
    public static final H7.b f24411a = new H7.b(5);

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) f24411a.get()).nextBytes(bArr);
        return bArr;
    }
}
