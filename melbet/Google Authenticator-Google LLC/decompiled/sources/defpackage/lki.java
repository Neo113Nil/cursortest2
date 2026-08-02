package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lki {
    private static final String b = "lkg";
    public static final MessageDigest a = a();

    private static MessageDigest a() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            String str = b;
            if (!jav.f(str, 3)) {
                return null;
            }
            jav.b(str, "Error while instantiating messageDigest", e);
            return null;
        }
    }
}
