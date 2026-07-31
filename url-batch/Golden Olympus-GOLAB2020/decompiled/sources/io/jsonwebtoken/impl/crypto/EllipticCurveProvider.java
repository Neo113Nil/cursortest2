package io.jsonwebtoken.impl.crypto;

import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.lang.Assert;
import io.jsonwebtoken.lang.Strings;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.ECGenParameterSpec;
import java.util.HashMap;
import java.util.Map;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public abstract class EllipticCurveProvider extends SignatureProvider {
    private static final Map<SignatureAlgorithm, String> EC_CURVE_NAMES = createEcCurveNames();

    /* renamed from: io.jsonwebtoken.impl.crypto.EllipticCurveProvider$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$jsonwebtoken$SignatureAlgorithm;

        static {
            int[] iArr = new int[SignatureAlgorithm.values().length];
            $SwitchMap$io$jsonwebtoken$SignatureAlgorithm = iArr;
            try {
                iArr[SignatureAlgorithm.ES256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$jsonwebtoken$SignatureAlgorithm[SignatureAlgorithm.ES384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$jsonwebtoken$SignatureAlgorithm[SignatureAlgorithm.ES512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    protected EllipticCurveProvider(SignatureAlgorithm signatureAlgorithm, Key key) {
        super(signatureAlgorithm, key);
        Assert.isTrue(signatureAlgorithm.isEllipticCurve(), "SignatureAlgorithm must be an Elliptic Curve algorithm.");
    }

    private static Map<SignatureAlgorithm, String> createEcCurveNames() {
        HashMap hashMap = new HashMap();
        hashMap.put(SignatureAlgorithm.ES256, "secp256r1");
        hashMap.put(SignatureAlgorithm.ES384, "secp384r1");
        hashMap.put(SignatureAlgorithm.ES512, "secp521r1");
        return hashMap;
    }

    public static KeyPair generateKeyPair() {
        return generateKeyPair(SignatureAlgorithm.ES512);
    }

    public static int getSignatureByteArrayLength(SignatureAlgorithm signatureAlgorithm) {
        int i4 = AnonymousClass1.$SwitchMap$io$jsonwebtoken$SignatureAlgorithm[signatureAlgorithm.ordinal()];
        if (i4 == 1) {
            return 64;
        }
        if (i4 == 2) {
            return 96;
        }
        if (i4 == 3) {
            return 132;
        }
        throw new JwtException("Unsupported Algorithm: " + signatureAlgorithm.name());
    }

    public static byte[] transcodeSignatureToConcat(byte[] bArr, int i4) {
        int i5;
        if (bArr.length < 8 || bArr[0] != 48) {
            throw new JwtException("Invalid ECDSA signature format");
        }
        byte b4 = bArr[1];
        if (b4 > 0) {
            i5 = 2;
        } else {
            if (b4 != -127) {
                throw new JwtException("Invalid ECDSA signature format");
            }
            i5 = 3;
        }
        int i6 = bArr[i5 + 1];
        int i7 = i6;
        while (i7 > 0 && bArr[((i5 + 2) + i6) - i7] == 0) {
            i7--;
        }
        int i8 = i5 + 2 + i6;
        int i9 = bArr[i8 + 1];
        int i10 = i9;
        while (i10 > 0 && bArr[((i8 + 2) + i9) - i10] == 0) {
            i10--;
        }
        int max = Math.max(Math.max(i7, i10), i4 / 2);
        int i11 = bArr[i5 - 1];
        if ((i11 & KotlinVersion.MAX_COMPONENT_VALUE) != bArr.length - i5 || (i11 & KotlinVersion.MAX_COMPONENT_VALUE) != i6 + 4 + i9 || bArr[i5] != 2 || bArr[i8] != 2) {
            throw new JwtException("Invalid ECDSA signature format");
        }
        int i12 = max * 2;
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i8 - i7, bArr2, max - i7, i7);
        System.arraycopy(bArr, ((i8 + 2) + i9) - i10, bArr2, i12 - i10, i10);
        return bArr2;
    }

    public static byte[] transcodeSignatureToDER(byte[] bArr) {
        byte[] bArr2;
        int length = bArr.length / 2;
        int i4 = length;
        while (i4 > 0 && bArr[length - i4] == 0) {
            i4--;
        }
        int i5 = length - i4;
        int i6 = bArr[i5] < 0 ? i4 + 1 : i4;
        int i7 = length;
        while (i7 > 0 && bArr[(length * 2) - i7] == 0) {
            i7--;
        }
        int i8 = (length * 2) - i7;
        int i9 = bArr[i8] < 0 ? i7 + 1 : i7;
        int i10 = i6 + 4 + i9;
        if (i10 > 255) {
            throw new JwtException("Invalid ECDSA signature format");
        }
        int i11 = 1;
        if (i10 < 128) {
            bArr2 = new byte[i6 + 6 + i9];
        } else {
            bArr2 = new byte[i6 + 7 + i9];
            bArr2[1] = -127;
            i11 = 2;
        }
        bArr2[0] = 48;
        bArr2[i11] = (byte) i10;
        bArr2[i11 + 1] = 2;
        bArr2[i11 + 2] = (byte) i6;
        int i12 = i11 + 3 + i6;
        System.arraycopy(bArr, i5, bArr2, i12 - i4, i4);
        bArr2[i12] = 2;
        bArr2[i12 + 1] = (byte) i9;
        System.arraycopy(bArr, i8, bArr2, ((i12 + 2) + i9) - i7, i7);
        return bArr2;
    }

    public static KeyPair generateKeyPair(SignatureAlgorithm signatureAlgorithm) {
        return generateKeyPair(signatureAlgorithm, SignatureProvider.DEFAULT_SECURE_RANDOM);
    }

    public static KeyPair generateKeyPair(SignatureAlgorithm signatureAlgorithm, SecureRandom secureRandom) {
        return generateKeyPair("EC", null, signatureAlgorithm, secureRandom);
    }

    public static KeyPair generateKeyPair(String str, String str2, SignatureAlgorithm signatureAlgorithm, SecureRandom secureRandom) {
        KeyPairGenerator keyPairGenerator;
        Assert.notNull(signatureAlgorithm, "SignatureAlgorithm argument cannot be null.");
        Assert.isTrue(signatureAlgorithm.isEllipticCurve(), "SignatureAlgorithm argument must represent an Elliptic Curve algorithm.");
        try {
            if (Strings.hasText(str2)) {
                keyPairGenerator = KeyPairGenerator.getInstance(str, str2);
            } else {
                keyPairGenerator = KeyPairGenerator.getInstance(str);
            }
            keyPairGenerator.initialize(new ECGenParameterSpec(EC_CURVE_NAMES.get(signatureAlgorithm)), secureRandom);
            return keyPairGenerator.generateKeyPair();
        } catch (Exception e4) {
            throw new IllegalStateException("Unable to generate Elliptic Curve KeyPair: " + e4.getMessage(), e4);
        }
    }
}
