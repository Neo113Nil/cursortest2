package io.appmetrica.analytics.impl;

import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.security.MessageDigest;

/* renamed from: io.appmetrica.analytics.impl.hj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0232hj {
    public static byte[] a(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.reset();
        messageDigest.update(str.getBytes(CharEncoding.UTF_8));
        return messageDigest.digest();
    }
}
