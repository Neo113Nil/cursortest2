package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public abstract class bp {

    /* renamed from: b, reason: collision with root package name */
    private static MessageDigest f3483b;

    /* renamed from: a, reason: collision with root package name */
    protected final Object f3484a = new Object();

    protected final MessageDigest a() {
        synchronized (this.f3484a) {
            MessageDigest messageDigest = f3483b;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i7 = 0; i7 < 2; i7++) {
                try {
                    f3483b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f3483b;
        }
    }

    abstract byte[] b(String str);
}
