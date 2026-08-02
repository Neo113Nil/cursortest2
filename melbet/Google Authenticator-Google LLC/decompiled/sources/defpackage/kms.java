package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kms {
    public static final Logger a = Logger.getLogger(kms.class.getName());
    public static final byte[] b = "-bin".getBytes(StandardCharsets.US_ASCII);

    private kms() {
    }

    public static boolean a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i = length; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i - length]) {
                return false;
            }
        }
        return true;
    }
}
