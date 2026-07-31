package S0;

import android.os.Build;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.prng.SP800SecureRandomBuilder;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f9234a = true;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f9235b = true;

    /* JADX WARN: Removed duplicated region for block: B:19:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static SecureRandom a() {
        SecureRandom secureRandom;
        c.b("EncryptUtil", "generateSecureRandomNew ");
        try {
        } catch (NoSuchAlgorithmException unused) {
            c.c("EncryptUtil", "getSecureRandomBytes: NoSuchAlgorithmException");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            secureRandom = SecureRandom.getInstanceStrong();
            if (secureRandom == null) {
                try {
                    secureRandom = SecureRandom.getInstance("SHA1PRNG");
                } catch (NoSuchAlgorithmException unused2) {
                    c.c("EncryptUtil", "NoSuchAlgorithmException");
                    return secureRandom;
                } catch (Throwable th) {
                    if (f9235b) {
                        c.c("EncryptUtil", "exception : " + th.getMessage() + " , you should implementation bcprov-jdk15on library");
                        f9235b = false;
                    }
                    return secureRandom;
                }
            }
            AESEngine aESEngine = new AESEngine();
            byte[] bArr = new byte[32];
            secureRandom.nextBytes(bArr);
            return new SP800SecureRandomBuilder(secureRandom, true).setEntropyBitsRequired(384).buildCTR(aESEngine, UserVerificationMethods.USER_VERIFY_HANDPRINT, bArr, false);
        }
        secureRandom = null;
        if (secureRandom == null) {
        }
        AESEngine aESEngine2 = new AESEngine();
        byte[] bArr2 = new byte[32];
        secureRandom.nextBytes(bArr2);
        return new SP800SecureRandomBuilder(secureRandom, true).setEntropyBitsRequired(384).buildCTR(aESEngine2, UserVerificationMethods.USER_VERIFY_HANDPRINT, bArr2, false);
    }

    private static byte[] b(int i4) {
        SecureRandom a4 = a();
        if (a4 == null) {
            return new byte[0];
        }
        try {
            byte[] bArr = new byte[i4];
            a4.nextBytes(bArr);
            return bArr;
        } catch (NullPointerException e4) {
            c.c("EncryptUtil", "secureRandom nextBytes error is : " + e4.getMessage());
            return new byte[0];
        }
    }

    public static SecureRandom c() {
        SecureRandom instanceStrong;
        if (f9234a) {
            return a();
        }
        try {
            if (Build.VERSION.SDK_INT < 26) {
                return SecureRandom.getInstance("SHA1PRNG");
            }
            instanceStrong = SecureRandom.getInstanceStrong();
            return instanceStrong;
        } catch (NoSuchAlgorithmException unused) {
            c.c("EncryptUtil", "genSecureRandom: NoSuchAlgorithmException");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] d(int i4) {
        SecureRandom secureRandom;
        if (f9234a) {
            return b(i4);
        }
        byte[] bArr = new byte[i4];
        try {
        } catch (NoSuchAlgorithmException unused) {
            c.c("EncryptUtil", "getSecureRandomBytes: NoSuchAlgorithmException");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            secureRandom = SecureRandom.getInstanceStrong();
            if (secureRandom == null) {
                try {
                    secureRandom = SecureRandom.getInstance("SHA1PRNG");
                } catch (NoSuchAlgorithmException unused2) {
                    c.c("EncryptUtil", "getSecureRandomBytes getInstance: NoSuchAlgorithmException");
                    return new byte[0];
                } catch (Exception e4) {
                    c.c("EncryptUtil", "getSecureRandomBytes getInstance: exception : " + e4.getMessage());
                    return new byte[0];
                }
            }
            secureRandom.nextBytes(bArr);
            return bArr;
        }
        secureRandom = null;
        if (secureRandom == null) {
        }
        secureRandom.nextBytes(bArr);
        return bArr;
    }

    public static String e(int i4) {
        return b.a(d(i4));
    }

    public static void f(boolean z4) {
        c.d("EncryptUtil", "setBouncycastleFlag: " + z4);
        f9234a = z4;
    }
}
