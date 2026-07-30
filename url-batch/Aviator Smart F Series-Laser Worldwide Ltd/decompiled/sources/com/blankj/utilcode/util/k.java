package com.blankj.utilcode.util;

import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* loaded from: classes2.dex */
public final class k {
    private k() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static byte[] decrypt3DES(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return symmetricTemplate(bArr, bArr2, "DESede", str, bArr3, false);
    }

    public static byte[] decryptAES(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return symmetricTemplate(bArr, bArr2, "AES", str, bArr3, false);
    }

    public static byte[] decryptBase64AES(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return decryptAES(c1.base64Decode(bArr), bArr2, str, bArr3);
    }

    public static byte[] decryptBase64DES(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return decryptDES(c1.base64Decode(bArr), bArr2, str, bArr3);
    }

    public static byte[] decryptBase64RSA(byte[] bArr, byte[] bArr2, int i8, String str) {
        return decryptRSA(c1.base64Decode(bArr), bArr2, i8, str);
    }

    public static byte[] decryptBase64_3DES(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return decrypt3DES(c1.base64Decode(bArr), bArr2, str, bArr3);
    }

    public static byte[] decryptDES(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return symmetricTemplate(bArr, bArr2, "DES", str, bArr3, false);
    }

    public static byte[] decryptHexString3DES(String str, byte[] bArr, String str2, byte[] bArr2) {
        return decrypt3DES(c1.hexString2Bytes(str), bArr, str2, bArr2);
    }

    public static byte[] decryptHexStringAES(String str, byte[] bArr, String str2, byte[] bArr2) {
        return decryptAES(c1.hexString2Bytes(str), bArr, str2, bArr2);
    }

    public static byte[] decryptHexStringDES(String str, byte[] bArr, String str2, byte[] bArr2) {
        return decryptDES(c1.hexString2Bytes(str), bArr, str2, bArr2);
    }

    public static byte[] decryptHexStringRSA(String str, byte[] bArr, int i8, String str2) {
        return decryptRSA(c1.hexString2Bytes(str), bArr, i8, str2);
    }

    public static byte[] decryptRSA(byte[] bArr, byte[] bArr2, int i8, String str) {
        return rsaTemplate(bArr, bArr2, i8, str, false);
    }

    public static byte[] encrypt3DES(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return symmetricTemplate(bArr, bArr2, "DESede", str, bArr3, true);
    }

    public static byte[] encrypt3DES2Base64(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return c1.base64Encode(encrypt3DES(bArr, bArr2, str, bArr3));
    }

    public static String encrypt3DES2HexString(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return c1.bytes2HexString(encrypt3DES(bArr, bArr2, str, bArr3));
    }

    public static byte[] encryptAES(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return symmetricTemplate(bArr, bArr2, "AES", str, bArr3, true);
    }

    public static byte[] encryptAES2Base64(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return c1.base64Encode(encryptAES(bArr, bArr2, str, bArr3));
    }

    public static String encryptAES2HexString(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return c1.bytes2HexString(encryptAES(bArr, bArr2, str, bArr3));
    }

    public static byte[] encryptDES(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return symmetricTemplate(bArr, bArr2, "DES", str, bArr3, true);
    }

    public static byte[] encryptDES2Base64(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return c1.base64Encode(encryptDES(bArr, bArr2, str, bArr3));
    }

    public static String encryptDES2HexString(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return c1.bytes2HexString(encryptDES(bArr, bArr2, str, bArr3));
    }

    public static byte[] encryptHmacMD5(byte[] bArr, byte[] bArr2) {
        return hmacTemplate(bArr, bArr2, "HmacMD5");
    }

    public static String encryptHmacMD5ToString(String str, String str2) {
        return (str == null || str.length() == 0 || str2 == null || str2.length() == 0) ? "" : encryptHmacMD5ToString(str.getBytes(), str2.getBytes());
    }

    public static byte[] encryptHmacSHA1(byte[] bArr, byte[] bArr2) {
        return hmacTemplate(bArr, bArr2, "HmacSHA1");
    }

    public static String encryptHmacSHA1ToString(String str, String str2) {
        return (str == null || str.length() == 0 || str2 == null || str2.length() == 0) ? "" : encryptHmacSHA1ToString(str.getBytes(), str2.getBytes());
    }

    public static byte[] encryptHmacSHA224(byte[] bArr, byte[] bArr2) {
        return hmacTemplate(bArr, bArr2, "HmacSHA224");
    }

    public static String encryptHmacSHA224ToString(String str, String str2) {
        return (str == null || str.length() == 0 || str2 == null || str2.length() == 0) ? "" : encryptHmacSHA224ToString(str.getBytes(), str2.getBytes());
    }

    public static byte[] encryptHmacSHA256(byte[] bArr, byte[] bArr2) {
        return hmacTemplate(bArr, bArr2, "HmacSHA256");
    }

    public static String encryptHmacSHA256ToString(String str, String str2) {
        return (str == null || str.length() == 0 || str2 == null || str2.length() == 0) ? "" : encryptHmacSHA256ToString(str.getBytes(), str2.getBytes());
    }

    public static byte[] encryptHmacSHA384(byte[] bArr, byte[] bArr2) {
        return hmacTemplate(bArr, bArr2, "HmacSHA384");
    }

    public static String encryptHmacSHA384ToString(String str, String str2) {
        return (str == null || str.length() == 0 || str2 == null || str2.length() == 0) ? "" : encryptHmacSHA384ToString(str.getBytes(), str2.getBytes());
    }

    public static byte[] encryptHmacSHA512(byte[] bArr, byte[] bArr2) {
        return hmacTemplate(bArr, bArr2, "HmacSHA512");
    }

    public static String encryptHmacSHA512ToString(String str, String str2) {
        return (str == null || str.length() == 0 || str2 == null || str2.length() == 0) ? "" : encryptHmacSHA512ToString(str.getBytes(), str2.getBytes());
    }

    public static byte[] encryptMD2(byte[] bArr) {
        return hashTemplate(bArr, "MD2");
    }

    public static String encryptMD2ToString(String str) {
        return (str == null || str.length() == 0) ? "" : encryptMD2ToString(str.getBytes());
    }

    public static byte[] encryptMD5(byte[] bArr) {
        return hashTemplate(bArr, "MD5");
    }

    public static byte[] encryptMD5File(String str) {
        return encryptMD5File(c1.isSpace(str) ? null : new File(str));
    }

    public static String encryptMD5File2String(String str) {
        return encryptMD5File2String(c1.isSpace(str) ? null : new File(str));
    }

    public static String encryptMD5ToString(String str) {
        return (str == null || str.length() == 0) ? "" : encryptMD5ToString(str.getBytes());
    }

    public static byte[] encryptRSA(byte[] bArr, byte[] bArr2, int i8, String str) {
        return rsaTemplate(bArr, bArr2, i8, str, true);
    }

    public static byte[] encryptRSA2Base64(byte[] bArr, byte[] bArr2, int i8, String str) {
        return c1.base64Encode(encryptRSA(bArr, bArr2, i8, str));
    }

    public static String encryptRSA2HexString(byte[] bArr, byte[] bArr2, int i8, String str) {
        return c1.bytes2HexString(encryptRSA(bArr, bArr2, i8, str));
    }

    public static byte[] encryptSHA1(byte[] bArr) {
        return hashTemplate(bArr, "SHA-1");
    }

    public static String encryptSHA1ToString(String str) {
        return (str == null || str.length() == 0) ? "" : encryptSHA1ToString(str.getBytes());
    }

    public static byte[] encryptSHA224(byte[] bArr) {
        return hashTemplate(bArr, "SHA224");
    }

    public static String encryptSHA224ToString(String str) {
        return (str == null || str.length() == 0) ? "" : encryptSHA224ToString(str.getBytes());
    }

    public static byte[] encryptSHA256(byte[] bArr) {
        return hashTemplate(bArr, org.bouncycastle.pqc.crypto.xmss.o.SHA_256);
    }

    public static String encryptSHA256ToString(String str) {
        return (str == null || str.length() == 0) ? "" : encryptSHA256ToString(str.getBytes());
    }

    public static byte[] encryptSHA384(byte[] bArr) {
        return hashTemplate(bArr, "SHA-384");
    }

    public static String encryptSHA384ToString(String str) {
        return (str == null || str.length() == 0) ? "" : encryptSHA384ToString(str.getBytes());
    }

    public static byte[] encryptSHA512(byte[] bArr) {
        return hashTemplate(bArr, org.bouncycastle.pqc.crypto.xmss.o.SHA_512);
    }

    public static String encryptSHA512ToString(String str) {
        return (str == null || str.length() == 0) ? "" : encryptSHA512ToString(str.getBytes());
    }

    static byte[] hashTemplate(byte[] bArr, String str) {
        if (bArr != null && bArr.length > 0) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str);
                messageDigest.update(bArr);
                return messageDigest.digest();
            } catch (NoSuchAlgorithmException e8) {
                e8.printStackTrace();
            }
        }
        return null;
    }

    private static byte[] hmacTemplate(byte[] bArr, byte[] bArr2, String str) {
        if (bArr != null && bArr.length != 0 && bArr2 != null && bArr2.length != 0) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, str);
                Mac mac = Mac.getInstance(str);
                mac.init(secretKeySpec);
                return mac.doFinal(bArr);
            } catch (InvalidKeyException | NoSuchAlgorithmException e8) {
                e8.printStackTrace();
            }
        }
        return null;
    }

    private static byte[] joins(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static byte[] rc4(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length == 0 || bArr2 == null) {
            return null;
        }
        if (bArr2.length < 1 || bArr2.length > 256) {
            throw new IllegalArgumentException("key must be between 1 and 256 bytes");
        }
        byte[] bArr3 = new byte[256];
        byte[] bArr4 = new byte[256];
        int length = bArr2.length;
        for (int i8 = 0; i8 < 256; i8++) {
            bArr3[i8] = (byte) i8;
            bArr4[i8] = bArr2[i8 % length];
        }
        int i9 = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            byte b8 = bArr3[i10];
            i9 = (i9 + b8 + bArr4[i10]) & 255;
            byte b9 = bArr3[i9];
            bArr3[i9] = b8;
            bArr3[i10] = b9;
        }
        byte[] bArr5 = new byte[bArr.length];
        int i11 = 0;
        for (int i12 = 0; i12 < bArr.length; i12++) {
            i11 = (i11 + 1) & 255;
            byte b10 = bArr3[i11];
            i9 = (i9 + b10) & 255;
            byte b11 = bArr3[i9];
            bArr3[i9] = b10;
            bArr3[i11] = b11;
            bArr5[i12] = (byte) (bArr3[(b11 + bArr3[i9]) & 255] ^ bArr[i12]);
        }
        return bArr5;
    }

    private static byte[] rsaTemplate(byte[] bArr, byte[] bArr2, int i8, String str, boolean z7) {
        if (bArr != null && bArr.length != 0 && bArr2 != null && bArr2.length != 0) {
            try {
                KeyFactory keyFactory = Build.VERSION.SDK_INT < 28 ? KeyFactory.getInstance("RSA", BouncyCastleProvider.PROVIDER_NAME) : KeyFactory.getInstance("RSA");
                Key generatePublic = z7 ? keyFactory.generatePublic(new X509EncodedKeySpec(bArr2)) : keyFactory.generatePrivate(new PKCS8EncodedKeySpec(bArr2));
                if (generatePublic == null) {
                    return null;
                }
                Cipher cipher = Cipher.getInstance(str);
                cipher.init(z7 ? 1 : 2, generatePublic);
                int length = bArr.length;
                int i9 = i8 / 8;
                if (z7 && str.toLowerCase().endsWith("pkcs1padding")) {
                    i9 -= 11;
                }
                int i10 = length / i9;
                if (i10 <= 0) {
                    return cipher.doFinal(bArr);
                }
                byte[] bArr3 = new byte[0];
                byte[] bArr4 = new byte[i9];
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    System.arraycopy(bArr, i11, bArr4, 0, i9);
                    bArr3 = joins(bArr3, cipher.doFinal(bArr4));
                    i11 += i9;
                }
                if (i11 == length) {
                    return bArr3;
                }
                int i13 = length - i11;
                byte[] bArr5 = new byte[i13];
                System.arraycopy(bArr, i11, bArr5, 0, i13);
                return joins(bArr3, cipher.doFinal(bArr5));
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        r6 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] symmetricTemplate(byte[] bArr, byte[] bArr2, String str, String str2, byte[] bArr3, boolean z7) {
        if (bArr != null && bArr.length != 0 && bArr2 != null && bArr2.length != 0) {
            try {
                SecretKey generateSecret = "DES".equals(str) ? SecretKeyFactory.getInstance(str).generateSecret(new DESKeySpec(bArr2)) : new SecretKeySpec(bArr2, str);
                Cipher cipher = Cipher.getInstance(str2);
                if (bArr3 != null && bArr3.length != 0) {
                    cipher.init(z7 ? 1 : 2, generateSecret, new IvParameterSpec(bArr3));
                    return cipher.doFinal(bArr);
                }
                cipher.init(r6, generateSecret);
                return cipher.doFinal(bArr);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return null;
    }

    public static String encryptHmacMD5ToString(byte[] bArr, byte[] bArr2) {
        return c1.bytes2HexString(encryptHmacMD5(bArr, bArr2));
    }

    public static String encryptHmacSHA1ToString(byte[] bArr, byte[] bArr2) {
        return c1.bytes2HexString(encryptHmacSHA1(bArr, bArr2));
    }

    public static String encryptHmacSHA224ToString(byte[] bArr, byte[] bArr2) {
        return c1.bytes2HexString(encryptHmacSHA224(bArr, bArr2));
    }

    public static String encryptHmacSHA256ToString(byte[] bArr, byte[] bArr2) {
        return c1.bytes2HexString(encryptHmacSHA256(bArr, bArr2));
    }

    public static String encryptHmacSHA384ToString(byte[] bArr, byte[] bArr2) {
        return c1.bytes2HexString(encryptHmacSHA384(bArr, bArr2));
    }

    public static String encryptHmacSHA512ToString(byte[] bArr, byte[] bArr2) {
        return c1.bytes2HexString(encryptHmacSHA512(bArr, bArr2));
    }

    public static String encryptMD2ToString(byte[] bArr) {
        return c1.bytes2HexString(encryptMD2(bArr));
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0030: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:45:0x0030 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] encryptMD5File(File file) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream3 = null;
        try {
            if (file == null) {
                return null;
            }
            try {
                fileInputStream2 = new FileInputStream(file);
                try {
                    DigestInputStream digestInputStream = new DigestInputStream(fileInputStream2, MessageDigest.getInstance("MD5"));
                    while (digestInputStream.read(new byte[262144]) > 0) {
                    }
                    byte[] digest = digestInputStream.getMessageDigest().digest();
                    try {
                        fileInputStream2.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                    return digest;
                } catch (IOException e9) {
                    e = e9;
                    e.printStackTrace();
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                    }
                    return null;
                } catch (NoSuchAlgorithmException e11) {
                    e = e11;
                    e.printStackTrace();
                    if (fileInputStream2 != null) {
                    }
                    return null;
                }
            } catch (IOException e12) {
                e = e12;
                fileInputStream2 = null;
                e.printStackTrace();
                if (fileInputStream2 != null) {
                }
                return null;
            } catch (NoSuchAlgorithmException e13) {
                e = e13;
                fileInputStream2 = null;
                e.printStackTrace();
                if (fileInputStream2 != null) {
                }
                return null;
            } catch (Throwable th) {
                th = th;
                if (fileInputStream3 != null) {
                    try {
                        fileInputStream3.close();
                    } catch (IOException e14) {
                        e14.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream3 = fileInputStream;
        }
    }

    public static String encryptMD5File2String(File file) {
        return c1.bytes2HexString(encryptMD5File(file));
    }

    public static String encryptMD5ToString(String str, String str2) {
        if (str == null && str2 == null) {
            return "";
        }
        if (str2 == null) {
            return c1.bytes2HexString(encryptMD5(str.getBytes()));
        }
        if (str == null) {
            return c1.bytes2HexString(encryptMD5(str2.getBytes()));
        }
        return c1.bytes2HexString(encryptMD5((str + str2).getBytes()));
    }

    public static String encryptSHA1ToString(byte[] bArr) {
        return c1.bytes2HexString(encryptSHA1(bArr));
    }

    public static String encryptSHA224ToString(byte[] bArr) {
        return c1.bytes2HexString(encryptSHA224(bArr));
    }

    public static String encryptSHA256ToString(byte[] bArr) {
        return c1.bytes2HexString(encryptSHA256(bArr));
    }

    public static String encryptSHA384ToString(byte[] bArr) {
        return c1.bytes2HexString(encryptSHA384(bArr));
    }

    public static String encryptSHA512ToString(byte[] bArr) {
        return c1.bytes2HexString(encryptSHA512(bArr));
    }

    public static String encryptMD5ToString(byte[] bArr) {
        return c1.bytes2HexString(encryptMD5(bArr));
    }

    public static String encryptMD5ToString(byte[] bArr, byte[] bArr2) {
        if (bArr == null && bArr2 == null) {
            return "";
        }
        if (bArr2 == null) {
            return c1.bytes2HexString(encryptMD5(bArr));
        }
        if (bArr == null) {
            return c1.bytes2HexString(encryptMD5(bArr2));
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return c1.bytes2HexString(encryptMD5(bArr3));
    }
}
