package com.aiming.mdt.a;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;

/* renamed from: com.aiming.mdt.a.ʽʾˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0158 {

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private final String f532;

    public C0158(Certificate certificate) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.reset();
            this.f532 = Base64.encodeToString(messageDigest.digest(certificate.getPublicKey().getEncoded()), 0).trim();
        } catch (NoSuchAlgorithmException unused) {
            throw new IllegalStateException("Should never happen");
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0158) && obj.toString().equals(toString());
    }

    public final int hashCode() {
        return this.f532.hashCode();
    }

    public final String toString() {
        return this.f532;
    }
}
