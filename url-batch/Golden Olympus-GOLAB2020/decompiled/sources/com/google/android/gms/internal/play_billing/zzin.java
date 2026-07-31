package com.google.android.gms.internal.play_billing;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* loaded from: classes.dex */
final class zzin {
    public static final /* synthetic */ int zza = 0;

    static {
        try {
            if (System.getenv("PROTOBUF_DISABLE_UNSAFE_UTF8_PROCESSOR_FOR_TESTING") != null) {
                return;
            }
        } catch (SecurityException unused) {
        }
        if (zzii.zzx() && zzii.zzy()) {
            int i4 = zzei.zza;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        return r12 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static int zza(String str, byte[] bArr, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        char charAt;
        int length = str.length();
        int i9 = 0;
        while (true) {
            i6 = i4 + i5;
            if (i9 >= length || (i8 = i9 + i4) >= i6 || (charAt = str.charAt(i9)) >= 128) {
                break;
            }
            bArr[i8] = (byte) charAt;
            i9++;
        }
        int i10 = i4 + i9;
        while (i9 < length) {
            char charAt2 = str.charAt(i9);
            if (charAt2 < 128 && i10 < i6) {
                bArr[i10] = (byte) charAt2;
                i10++;
            } else if (charAt2 < 2048 && i10 <= i6 - 2) {
                bArr[i10] = (byte) ((charAt2 >>> 6) | 960);
                bArr[i10 + 1] = (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
                i10 += 2;
            } else {
                if ((charAt2 >= 55296 && charAt2 <= 57343) || i10 > i6 - 3) {
                    if (i10 > i6 - 4) {
                        if (charAt2 < 55296 || charAt2 > 57343 || ((i7 = i9 + 1) != str.length() && Character.isSurrogatePair(charAt2, str.charAt(i7)))) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        return zzik.zza(str, bArr, i4, i5);
                    }
                    i9++;
                    if (i9 != str.length()) {
                        char charAt3 = str.charAt(i9);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int i11 = i10 + 3;
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i10] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i10 + 1] = (byte) (((codePoint >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                            bArr[i10 + 2] = (byte) (((codePoint >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                            i10 += 4;
                            bArr[i11] = (byte) ((codePoint & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                        }
                    }
                    return zzik.zza(str, bArr, i4, i5);
                }
                bArr[i10] = (byte) ((charAt2 >>> '\f') | 480);
                bArr[i10 + 1] = (byte) (((charAt2 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                bArr[i10 + 2] = (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
                i10 += 3;
            }
            i9++;
        }
        return i10;
    }

    static int zzb(String str) {
        int length = str.length();
        int i4 = 0;
        int i5 = 0;
        while (i5 < length && str.charAt(i5) < 128) {
            i5++;
        }
        int i6 = length;
        while (true) {
            if (i5 >= length) {
                break;
            }
            char charAt = str.charAt(i5);
            if (charAt < 2048) {
                i6 += (127 - charAt) >>> 31;
                i5++;
            } else {
                try {
                    int length2 = str.length();
                    while (i5 < length2) {
                        char charAt2 = str.charAt(i5);
                        if (charAt2 < 2048) {
                            i4 += (127 - charAt2) >>> 31;
                        } else {
                            i4 += 2;
                            if (charAt2 >= 55296 && charAt2 <= 57343) {
                                if (Character.codePointAt(str, i5) < 65536) {
                                    throw new zzim(i5, length2);
                                }
                                i5++;
                            }
                        }
                        i5++;
                    }
                    i6 += i4;
                } catch (zzim unused) {
                    return str.getBytes(zzga.zza).length;
                }
            }
        }
        if (i6 >= length) {
            return i6;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i6 + 4294967296L));
    }

    static boolean zzc(byte[] bArr, int i4, int i5) {
        while (i4 < i5 && bArr[i4] >= 0) {
            i4++;
        }
        if (i4 >= i5) {
            return true;
        }
        while (i4 < i5) {
            int i6 = i4 + 1;
            byte b4 = bArr[i4];
            if (b4 >= 0) {
                i4 = i6;
            } else {
                if (b4 < -32) {
                    if (i6 < i5 && b4 >= -62) {
                        i4 += 2;
                        if (bArr[i6] > -65) {
                        }
                    }
                    return false;
                }
                if (b4 >= -16) {
                    if (i6 >= i5 - 2) {
                        return false;
                    }
                    int i7 = i4 + 2;
                    byte b5 = bArr[i6];
                    if (b5 <= -65 && (((b4 << 28) + (b5 + 112)) >> 30) == 0) {
                        int i8 = i4 + 3;
                        if (bArr[i7] <= -65) {
                            i4 += 4;
                            if (bArr[i8] > -65) {
                            }
                        }
                    }
                    return false;
                }
                if (i6 >= i5 - 1) {
                    return false;
                }
                int i9 = i4 + 2;
                byte b6 = bArr[i6];
                if (b6 > -65 || (b4 == -32 && b6 < -96)) {
                    return false;
                }
                if (b4 == -19 && b6 >= -96) {
                    return false;
                }
                i4 += 3;
                if (bArr[i9] > -65) {
                    return false;
                }
            }
        }
        return true;
    }
}
