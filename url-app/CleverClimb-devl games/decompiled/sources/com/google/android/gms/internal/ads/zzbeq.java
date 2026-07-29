package com.google.android.gms.internal.ads;

import com.cmplay.policy.gdpr.DimenUtils;

/* loaded from: classes2.dex */
final class zzbeq extends zzben {
    zzbeq() {
    }

    private static int zza(byte[] bArr, int i, long j, int i2) {
        int zzda;
        int zzz;
        int zzf;
        switch (i2) {
            case 0:
                zzda = zzbem.zzda(i);
                return zzda;
            case 1:
                zzz = zzbem.zzz(i, zzbek.zza(bArr, j));
                return zzz;
            case 2:
                zzf = zzbem.zzf(i, zzbek.zza(bArr, j), zzbek.zza(bArr, j + 1));
                return zzf;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bb, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0065, code lost:
    
        return -1;
     */
    @Override // com.google.android.gms.internal.ads.zzben
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzb(int i, byte[] bArr, int i2, int i3) {
        int i4;
        if ((i2 | i3 | (bArr.length - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        long j = i2;
        int i5 = (int) (i3 - j);
        if (i5 >= 16) {
            long j2 = j;
            i4 = 0;
            while (true) {
                if (i4 >= i5) {
                    i4 = i5;
                    break;
                }
                long j3 = j2 + 1;
                if (zzbek.zza(bArr, j2) < 0) {
                    break;
                }
                i4++;
                j2 = j3;
            }
        } else {
            i4 = 0;
        }
        int i6 = i5 - i4;
        long j4 = j + i4;
        while (true) {
            byte b2 = 0;
            while (true) {
                if (i6 <= 0) {
                    break;
                }
                long j5 = j4 + 1;
                byte zza = zzbek.zza(bArr, j4);
                if (zza < 0) {
                    b2 = zza;
                    j4 = j5;
                    break;
                }
                i6--;
                b2 = zza;
                j4 = j5;
            }
            if (i6 != 0) {
                int i7 = i6 - 1;
                if (b2 >= -32) {
                    if (b2 >= -16) {
                        if (i7 >= 3) {
                            i6 = i7 - 3;
                            long j6 = j4 + 1;
                            byte zza2 = zzbek.zza(bArr, j4);
                            if (zza2 > -65 || (((b2 << 28) + (zza2 + 112)) >> 30) != 0) {
                                break;
                            }
                            long j7 = j6 + 1;
                            if (zzbek.zza(bArr, j6) > -65) {
                                break;
                            }
                            j4 = j7 + 1;
                            if (zzbek.zza(bArr, j7) > -65) {
                                break;
                            }
                        } else {
                            return zza(bArr, b2, j4, i7);
                        }
                    } else if (i7 >= 2) {
                        i6 = i7 - 2;
                        long j8 = j4 + 1;
                        byte zza3 = zzbek.zza(bArr, j4);
                        if (zza3 > -65 || ((b2 == -32 && zza3 < -96) || (b2 == -19 && zza3 >= -96))) {
                            break;
                        }
                        j4 = j8 + 1;
                        if (zzbek.zza(bArr, j8) > -65) {
                            break;
                        }
                    } else {
                        return zza(bArr, b2, j4, i7);
                    }
                } else if (i7 != 0) {
                    i6 = i7 - 1;
                    if (b2 < -62) {
                        break;
                    }
                    long j9 = j4 + 1;
                    if (zzbek.zza(bArr, j4) > -65) {
                        break;
                    }
                    j4 = j9;
                } else {
                    return b2;
                }
            } else {
                return 0;
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    @Override // com.google.android.gms.internal.ads.zzben
    final int zzb(CharSequence charSequence, byte[] bArr, int i, int i2) {
        long j;
        int i3;
        char c2;
        char charAt;
        long j2 = i;
        long j3 = i2 + j2;
        int length = charSequence.length();
        if (length > i2 || bArr.length - i2 < i) {
            char charAt2 = charSequence.charAt(length - 1);
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(charAt2);
            sb.append(" at index ");
            sb.append(i + i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i4 = 0;
        while (i4 < length && (charAt = charSequence.charAt(i4)) < 128) {
            zzbek.zza(bArr, j2, (byte) charAt);
            i4++;
            j2 = 1 + j2;
        }
        if (i4 == length) {
            return (int) j2;
        }
        while (i4 < length) {
            char charAt3 = charSequence.charAt(i4);
            if (charAt3 >= 128 || j2 >= j3) {
                if (charAt3 < 2048 && j2 <= j3 - 2) {
                    long j4 = j2 + 1;
                    zzbek.zza(bArr, j2, (byte) ((charAt3 >>> 6) | 960));
                    j2 = j4 + 1;
                    zzbek.zza(bArr, j4, (byte) ((charAt3 & '?') | 128));
                } else {
                    if ((charAt3 >= 55296 && 57343 >= charAt3) || j2 > j3 - 3) {
                        if (j2 > j3 - 4) {
                            if (55296 <= charAt3 && charAt3 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt3, charSequence.charAt(i3)))) {
                                throw new zzbep(i4, length);
                            }
                            StringBuilder sb2 = new StringBuilder(46);
                            sb2.append("Failed writing ");
                            sb2.append(charAt3);
                            sb2.append(" at index ");
                            sb2.append(j2);
                            throw new ArrayIndexOutOfBoundsException(sb2.toString());
                        }
                        int i5 = i4 + 1;
                        if (i5 != length) {
                            char charAt4 = charSequence.charAt(i5);
                            if (Character.isSurrogatePair(charAt3, charAt4)) {
                                int codePoint = Character.toCodePoint(charAt3, charAt4);
                                long j5 = j2 + 1;
                                zzbek.zza(bArr, j2, (byte) ((codePoint >>> 18) | DimenUtils.DENSITY_HIGH));
                                long j6 = j5 + 1;
                                zzbek.zza(bArr, j5, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j7 = j6 + 1;
                                zzbek.zza(bArr, j6, (byte) (((codePoint >>> 6) & 63) | 128));
                                j2 = j7 + 1;
                                zzbek.zza(bArr, j7, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                            }
                        } else {
                            i5 = i4;
                        }
                        throw new zzbep(i5 - 1, length);
                    }
                    long j8 = j2 + 1;
                    zzbek.zza(bArr, j2, (byte) ((charAt3 >>> '\f') | 480));
                    j2 = j8 + 1;
                    zzbek.zza(bArr, j8, (byte) (((charAt3 >>> 6) & 63) | 128));
                    j = j2 + 1;
                    c2 = (charAt3 & '?') | 128;
                }
                i4++;
            } else {
                j = j2 + 1;
                c2 = charAt3;
            }
            zzbek.zza(bArr, j2, (byte) c2);
            j2 = j;
            i4++;
        }
        return (int) j2;
    }
}
