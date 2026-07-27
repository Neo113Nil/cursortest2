package com.onesignal.common;

import B4.a;
import B4.j;
import g4.AbstractC0464i;
import java.security.MessageDigest;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class PIIHasher {
    private static final int SHA256_HEX_LENGTH = 64;
    public static final PIIHasher INSTANCE = new PIIHasher();
    private static final j SHA256_HEX_REGEX = new j("^[a-f0-9]{64}$");

    private PIIHasher() {
    }

    public final String hash(String value) {
        i.e(value, "value");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = value.getBytes(a.f287a);
        i.d(bytes, "getBytes(...)");
        byte[] digest = messageDigest.digest(bytes);
        i.b(digest);
        return AbstractC0464i.W(digest, "", null, null, PIIHasher$hash$1.INSTANCE, 30);
    }

    public final boolean isHashed(String value) {
        i.e(value, "value");
        j jVar = SHA256_HEX_REGEX;
        jVar.getClass();
        return jVar.f314a.matcher(value).matches();
    }
}
