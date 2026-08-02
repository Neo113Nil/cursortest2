package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes3.dex */
final class zzhbc extends zzhbb {
    zzhbc() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0080, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    @Override // com.google.android.gms.internal.ads.zzhbb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zza(int i, byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        int zzk;
        int zzj;
        int zzj2;
        if (i != 0) {
            if (i2 >= i3) {
                return i;
            }
            byte b = (byte) i;
            if (b < -32) {
                if (b >= -62) {
                    i5 = i2 + 1;
                }
                return -1;
            }
            int i6 = ~(i >> 8);
            if (b < -16) {
                byte b2 = (byte) i6;
                if (b2 == 0) {
                    int i7 = i2 + 1;
                    byte b3 = bArr[i2];
                    if (i7 >= i3) {
                        zzj2 = zzhbe.zzj(b, b3);
                        return zzj2;
                    }
                    i2 = i7;
                    b2 = b3;
                }
                if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                    i5 = i2 + 1;
                }
                return -1;
            }
            byte b4 = (byte) i6;
            if (b4 == 0) {
                int i8 = i2 + 1;
                b4 = bArr[i2];
                if (i8 >= i3) {
                    zzj = zzhbe.zzj(b, b4);
                    return zzj;
                }
                i2 = i8;
                i4 = 0;
            } else {
                i4 = i >> 16;
            }
            if (i4 == 0) {
                int i9 = i2 + 1;
                byte b5 = bArr[i2];
                if (i9 >= i3) {
                    zzk = zzhbe.zzk(b, b4, b5);
                    return zzk;
                }
                i2 = i9;
                i4 = b5;
            }
            if (b4 <= -65 && (((b << Ascii.FS) + (b4 + 112)) >> 30) == 0 && i4 <= -65) {
                i5 = i2 + 1;
            }
            return -1;
            i2 = i5;
        }
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return 0;
        }
        while (i2 < i3) {
            int i10 = i2 + 1;
            byte b6 = bArr[i2];
            if (b6 < 0) {
                if (b6 < -32) {
                    if (i10 >= i3) {
                        return b6;
                    }
                    if (b6 >= -62) {
                        i2 += 2;
                        if (bArr[i10] > -65) {
                        }
                    }
                    return -1;
                }
                if (b6 >= -16) {
                    if (i10 >= i3 - 2) {
                        return zzhbe.zzc(bArr, i10, i3);
                    }
                    int i11 = i2 + 2;
                    byte b7 = bArr[i10];
                    if (b7 <= -65 && (((b6 << Ascii.FS) + (b7 + 112)) >> 30) == 0) {
                        int i12 = i2 + 3;
                        if (bArr[i11] <= -65) {
                            i2 += 4;
                            if (bArr[i12] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i10 >= i3 - 1) {
                    return zzhbe.zzc(bArr, i10, i3);
                }
                int i13 = i2 + 2;
                byte b8 = bArr[i10];
                if (b8 <= -65 && ((b6 != -32 || b8 >= -96) && (b6 != -19 || b8 < -96))) {
                    i2 += 3;
                    if (bArr[i13] > -65) {
                    }
                }
                return -1;
            }
            i2 = i10;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhbb
    final String zzb(byte[] bArr, int i, int i2) throws zzgyn {
        int i3;
        int length = bArr.length;
        if ((((length - i) - i2) | i | i2) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i4 = i + i2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (i < i4) {
            byte b = bArr[i];
            if (!zzhba.zzd(b)) {
                break;
            }
            i++;
            cArr[i5] = (char) b;
            i5++;
        }
        while (i < i4) {
            int i6 = i + 1;
            byte b2 = bArr[i];
            if (zzhba.zzd(b2)) {
                cArr[i5] = (char) b2;
                i5++;
                i = i6;
                while (i < i4) {
                    byte b3 = bArr[i];
                    if (zzhba.zzd(b3)) {
                        i++;
                        cArr[i5] = (char) b3;
                        i5++;
                    }
                }
            } else {
                if (zzhba.zzf(b2)) {
                    if (i6 >= i4) {
                        throw zzgyn.zzd();
                    }
                    i3 = i5 + 1;
                    i += 2;
                    zzhba.zzc(b2, bArr[i6], cArr, i5);
                } else if (zzhba.zze(b2)) {
                    if (i6 >= i4 - 1) {
                        throw zzgyn.zzd();
                    }
                    i3 = i5 + 1;
                    int i7 = i + 2;
                    i += 3;
                    zzhba.zzb(b2, bArr[i6], bArr[i7], cArr, i5);
                } else {
                    if (i6 >= i4 - 2) {
                        throw zzgyn.zzd();
                    }
                    byte b4 = bArr[i6];
                    int i8 = i + 3;
                    byte b5 = bArr[i + 2];
                    i += 4;
                    zzhba.zza(b2, b4, b5, bArr[i8], cArr, i5);
                    i5 += 2;
                }
                i5 = i3;
            }
        }
        return new String(cArr, 0, i5);
    }
}
