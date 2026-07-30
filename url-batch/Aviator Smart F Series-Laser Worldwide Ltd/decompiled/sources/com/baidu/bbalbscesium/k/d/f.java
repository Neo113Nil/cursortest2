package com.baidu.bbalbscesium.k.d;

import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.MGF1ParameterSpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: h, reason: collision with root package name */
    public static final int f4149h = 1;

    /* renamed from: i, reason: collision with root package name */
    public static final int f4150i = 2;

    /* renamed from: j, reason: collision with root package name */
    public static final int f4151j = 3;

    /* renamed from: k, reason: collision with root package name */
    public static final int f4152k = 4;

    /* renamed from: l, reason: collision with root package name */
    private static final Map<String, byte[]> f4153l = Collections.synchronizedMap(new HashMap());

    /* renamed from: a, reason: collision with root package name */
    private final int f4154a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4155b;

    /* renamed from: c, reason: collision with root package name */
    private SecureRandom f4156c;

    /* renamed from: d, reason: collision with root package name */
    private final int f4157d;

    /* renamed from: e, reason: collision with root package name */
    private MessageDigest f4158e;

    /* renamed from: f, reason: collision with root package name */
    private MessageDigest f4159f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f4160g;

    private f(int i8, int i9, SecureRandom secureRandom, OAEPParameterSpec oAEPParameterSpec) {
        String str;
        byte[] bArr;
        this.f4154a = i8;
        this.f4155b = i9;
        this.f4156c = secureRandom;
        if (i9 < 64) {
            throw new InvalidKeyException("Padded size must be at least 64");
        }
        if (i8 == 1 || i8 == 2) {
            i9 -= 11;
        } else if (i8 != 3) {
            if (i8 != 4) {
                throw new InvalidKeyException("Invalid padding: " + i8);
            }
            String str2 = "SHA-1";
            if (oAEPParameterSpec != null) {
                try {
                    String digestAlgorithm = oAEPParameterSpec.getDigestAlgorithm();
                    String mGFAlgorithm = oAEPParameterSpec.getMGFAlgorithm();
                    if (!mGFAlgorithm.equalsIgnoreCase("MGF1")) {
                        throw new InvalidAlgorithmParameterException("Unsupported MGF algo: " + mGFAlgorithm);
                    }
                    String digestAlgorithm2 = ((MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters()).getDigestAlgorithm();
                    PSource pSource = oAEPParameterSpec.getPSource();
                    String algorithm = pSource.getAlgorithm();
                    if (!algorithm.equalsIgnoreCase("PSpecified")) {
                        throw new InvalidAlgorithmParameterException("Unsupported pSource algo: " + algorithm);
                    }
                    byte[] value = ((PSource.PSpecified) pSource).getValue();
                    str = digestAlgorithm;
                    str2 = digestAlgorithm2;
                    bArr = value;
                } catch (NoSuchAlgorithmException e8) {
                    e = e8;
                    throw new InvalidKeyException("Digest " + str2 + " not available", e);
                }
            } else {
                bArr = null;
                str = "SHA-1";
            }
            try {
                this.f4158e = MessageDigest.getInstance(str);
                this.f4159f = MessageDigest.getInstance(str2);
                byte[] a8 = a(this.f4158e, bArr);
                this.f4160g = a8;
                int length = (i9 - 2) - (a8.length * 2);
                this.f4157d = length;
                if (length > 0) {
                    return;
                }
                throw new InvalidKeyException("Key is too short for encryption using OAEPPadding with " + str + " and MGF1" + str2);
            } catch (NoSuchAlgorithmException e9) {
                e = e9;
                str2 = str;
                throw new InvalidKeyException("Digest " + str2 + " not available", e);
            }
        }
        this.f4157d = i9;
    }

    private byte[] b(byte[] bArr) {
        if (this.f4156c == null) {
            this.f4156c = b.f4129a;
        }
        int length = this.f4160g.length;
        byte[] bArr2 = new byte[length];
        this.f4156c.nextBytes(bArr2);
        int i8 = this.f4155b;
        byte[] bArr3 = new byte[i8];
        System.arraycopy(bArr2, 0, bArr3, 1, length);
        int i9 = length + 1;
        int i10 = i8 - i9;
        int length2 = this.f4155b - bArr.length;
        System.arraycopy(this.f4160g, 0, bArr3, i9, length);
        bArr3[length2 - 1] = 1;
        System.arraycopy(bArr, 0, bArr3, length2, bArr.length);
        a(bArr3, 1, length, bArr3, i9, i10);
        a(bArr3, i9, i10, bArr3, 1, length);
        return bArr3;
    }

    private byte[] c(byte[] bArr) {
        int i8;
        int i9;
        int i10 = this.f4155b;
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, i10 - bArr.length, bArr.length);
        int length = (this.f4155b - 3) - bArr.length;
        bArr2[0] = 0;
        int i11 = this.f4154a;
        bArr2[1] = (byte) i11;
        int i12 = -1;
        int i13 = 2;
        if (i11 != 1) {
            if (this.f4156c == null) {
                this.f4156c = b.f4129a;
            }
            byte[] bArr3 = new byte[64];
            while (true) {
                int i14 = length - 1;
                if (length <= 0) {
                    break;
                }
                while (true) {
                    if (i12 < 0) {
                        this.f4156c.nextBytes(bArr3);
                        i12 = 63;
                    }
                    i8 = i12 - 1;
                    i9 = bArr3[i12] & 255;
                    if (i9 != 0) {
                        break;
                    }
                    i12 = i8;
                }
                bArr2[i13] = (byte) i9;
                i12 = i8;
                length = i14;
                i13++;
            }
        } else {
            while (true) {
                int i15 = length - 1;
                if (length <= 0) {
                    break;
                }
                bArr2[i13] = -1;
                i13++;
                length = i15;
            }
        }
        return bArr2;
    }

    private byte[] e(byte[] bArr) {
        int length = this.f4160g.length;
        if (bArr[0] != 0) {
            throw new BadPaddingException("Data must start with zero");
        }
        int i8 = length + 1;
        int length2 = bArr.length - i8;
        a(bArr, i8, length2, bArr, 1, length);
        a(bArr, 1, length, bArr, i8, length2);
        for (int i9 = 0; i9 < length; i9++) {
            if (this.f4160g[i9] != bArr[i8 + i9]) {
                throw new BadPaddingException("lHash mismatch");
            }
        }
        int i10 = i8 + length;
        do {
            byte b8 = bArr[i10];
            if (b8 != 0) {
                int i11 = i10 + 1;
                if (b8 != 1) {
                    throw new BadPaddingException("Padding string not terminated by 0x01 byte");
                }
                int length3 = bArr.length - i11;
                byte[] bArr2 = new byte[length3];
                System.arraycopy(bArr, i11, bArr2, 0, length3);
                return bArr2;
            }
            i10++;
        } while (i10 < bArr.length);
        throw new BadPaddingException("Padding string not terminated");
    }

    private byte[] f(byte[] bArr) {
        if (bArr[0] != 0) {
            throw new BadPaddingException("Data must start with zero");
        }
        if (bArr[1] != this.f4154a) {
            throw new BadPaddingException("Blocktype mismatch: " + ((int) bArr[1]));
        }
        int i8 = 2;
        while (true) {
            int i9 = i8 + 1;
            int i10 = bArr[i8] & 255;
            if (i10 == 0) {
                int length = bArr.length - i9;
                if (length > this.f4157d) {
                    throw new BadPaddingException("Padding string too short");
                }
                byte[] bArr2 = new byte[length];
                System.arraycopy(bArr, bArr.length - length, bArr2, 0, length);
                return bArr2;
            }
            if (i9 == bArr.length) {
                throw new BadPaddingException("Padding string not terminated");
            }
            if (this.f4154a == 1 && i10 != 255) {
                throw new BadPaddingException("Padding byte not 0xff: " + i10);
            }
            i8 = i9;
        }
    }

    public int a() {
        return this.f4157d;
    }

    public byte[] d(byte[] bArr) {
        if (bArr.length != this.f4155b) {
            throw new BadPaddingException("Padded length must be " + this.f4155b);
        }
        int i8 = this.f4154a;
        if (i8 == 1 || i8 == 2) {
            return f(bArr);
        }
        if (i8 == 3) {
            return bArr;
        }
        if (i8 == 4) {
            return e(bArr);
        }
        throw new AssertionError();
    }

    public static f a(int i8, int i9) {
        return new f(i8, i9, null, null);
    }

    public byte[] b(byte[] bArr, int i8, int i9) {
        return d(b.a(bArr, i8, i9));
    }

    public static f a(int i8, int i9, SecureRandom secureRandom) {
        return new f(i8, i9, secureRandom, null);
    }

    public static f a(int i8, int i9, SecureRandom secureRandom, OAEPParameterSpec oAEPParameterSpec) {
        return new f(i8, i9, secureRandom, oAEPParameterSpec);
    }

    private void a(byte[] bArr, int i8, int i9, byte[] bArr2, int i10, int i11) {
        int i12;
        byte[] bArr3 = new byte[4];
        byte[] bArr4 = new byte[20];
        while (i11 > 0) {
            this.f4159f.update(bArr, i8, i9);
            this.f4159f.update(bArr3);
            try {
                this.f4159f.digest(bArr4, 0, 20);
                for (int i13 = 0; i13 < 20 && i11 > 0; i13++) {
                    bArr2[i10] = (byte) (bArr4[i13] ^ bArr2[i10]);
                    i11--;
                    i10++;
                }
                if (i11 > 0) {
                    while (true) {
                        byte b8 = (byte) (bArr3[i12] + 1);
                        bArr3[i12] = b8;
                        i12 = (b8 == 0 && i12 > 0) ? i12 - 1 : 3;
                    }
                }
            } catch (DigestException e8) {
                throw new BadPaddingException(e8.toString());
            }
        }
    }

    private static byte[] a(MessageDigest messageDigest, byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            return messageDigest.digest(bArr);
        }
        String algorithm = messageDigest.getAlgorithm();
        Map<String, byte[]> map = f4153l;
        byte[] bArr2 = map.get(algorithm);
        if (bArr2 != null) {
            return bArr2;
        }
        byte[] digest = messageDigest.digest();
        map.put(algorithm, digest);
        return digest;
    }

    public byte[] a(byte[] bArr) {
        if (bArr.length > this.f4157d) {
            throw new BadPaddingException("Data must be shorter than " + (this.f4157d + 1) + " bytes");
        }
        int i8 = this.f4154a;
        if (i8 == 1 || i8 == 2) {
            return c(bArr);
        }
        if (i8 == 3) {
            return bArr;
        }
        if (i8 == 4) {
            return b(bArr);
        }
        throw new AssertionError();
    }

    public byte[] a(byte[] bArr, int i8, int i9) {
        return a(b.a(bArr, i8, i9));
    }
}
