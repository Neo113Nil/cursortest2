package io.appmetrica.analytics.impl;

import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.security.MessageDigest;

/* renamed from: io.appmetrica.analytics.impl.lj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0652lj {
    public static byte[] a(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.reset();
        messageDigest.update(str.getBytes(CharEncoding.UTF_8));
        return messageDigest.digest();
    }
}
