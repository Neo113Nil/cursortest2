package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgzv {
    private static final zzgzs zza;

    static {
        if (zzgzq.zzA() && zzgzq.zzB()) {
            int i = zzgup.zza;
        }
        zza = new zzgzt();
    }

    static /* bridge */ /* synthetic */ int zzc(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        byte b = bArr[i - 1];
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            return zzk(b, bArr[i]);
        }
        if (i3 == 2) {
            return zzl(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00fe, code lost:
    
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static int zzd(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        char charAt;
        int length = charSequence.length();
        int i6 = 0;
        while (true) {
            i3 = i + i2;
            if (i6 >= length || (i5 = i6 + i) >= i3 || (charAt = charSequence.charAt(i6)) >= 128) {
                break;
            }
            bArr[i5] = (byte) charAt;
            i6++;
        }
        int i7 = i + i6;
        while (i6 < length) {
            char charAt2 = charSequence.charAt(i6);
            if (charAt2 < 128 && i7 < i3) {
                bArr[i7] = (byte) charAt2;
                i7++;
            } else if (charAt2 < 2048 && i7 <= i3 - 2) {
                int i8 = i7 + 1;
                bArr[i7] = (byte) ((charAt2 >>> 6) | 960);
                bArr[i8] = (byte) ((charAt2 & '?') | 128);
                i7 = i8 + 1;
            } else {
                if ((charAt2 >= 55296 && charAt2 <= 57343) || i7 > i3 - 3) {
                    if (i7 > i3 - 4) {
                        if (charAt2 >= 55296 && charAt2 <= 57343 && ((i4 = i6 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i4)))) {
                            throw new zzgzu(i6, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i7);
                    }
                    int i9 = i6 + 1;
                    if (i9 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i9);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int i10 = i7 + 1;
                            int i11 = i10 + 1;
                            int i12 = i11 + 1;
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i10] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i11] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i7 = i12 + 1;
                            bArr[i12] = (byte) ((codePoint & 63) | 128);
                            i6 = i9;
                        } else {
                            i6 = i9;
                        }
                    }
                    throw new zzgzu(i6 - 1, length);
                }
                int i13 = i7 + 1;
                int i14 = i13 + 1;
                bArr[i7] = (byte) ((charAt2 >>> '\f') | 480);
                bArr[i13] = (byte) (((charAt2 >>> 6) & 63) | 128);
                bArr[i14] = (byte) ((charAt2 & '?') | 128);
                i7 = i14 + 1;
            }
            i6++;
        }
        return i7;
    }

    static int zze(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                throw new zzgzu(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
    }

    static int zzf(int i, byte[] bArr, int i2, int i3) {
        return zza.zza(i, bArr, i2, i3);
    }

    static String zzg(ByteBuffer byteBuffer, int i, int i2) throws zzgwy {
        zzgzs zzgzsVar = zza;
        if (byteBuffer.hasArray()) {
            return zzgzsVar.zzb(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
        }
        return byteBuffer.isDirect() ? zzgzt.zzd(byteBuffer, i, i2) : zzgzs.zzd(byteBuffer, i, i2);
    }

    static String zzh(byte[] bArr, int i, int i2) throws zzgwy {
        return zza.zzb(bArr, i, i2);
    }

    static boolean zzi(byte[] bArr) {
        return zza.zzc(bArr, 0, bArr.length);
    }

    static boolean zzj(byte[] bArr, int i, int i2) {
        return zza.zzc(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzk(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzl(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }
}
