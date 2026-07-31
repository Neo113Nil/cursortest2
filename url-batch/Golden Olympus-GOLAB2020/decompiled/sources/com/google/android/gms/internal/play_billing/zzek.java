package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
final class zzek {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    static int zza(byte[] bArr, int i4, zzej zzejVar) {
        int zzi = zzi(bArr, i4, zzejVar);
        int i5 = zzejVar.zza;
        if (i5 < 0) {
            throw new zzgc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i5 > bArr.length - zzi) {
            throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i5 == 0) {
            zzejVar.zzc = zzev.zza;
            return zzi;
        }
        zzejVar.zzc = zzev.zzk(bArr, zzi, i5);
        return zzi + i5;
    }

    static int zzb(byte[] bArr, int i4) {
        int i5 = bArr[i4] & 255;
        int i6 = bArr[i4 + 1] & 255;
        int i7 = bArr[i4 + 2] & 255;
        return ((bArr[i4 + 3] & 255) << 24) | (i6 << 8) | i5 | (i7 << 16);
    }

    static int zzc(zzhl zzhlVar, byte[] bArr, int i4, int i5, int i6, zzej zzejVar) {
        Object zze = zzhlVar.zze();
        int zzm = zzm(zze, zzhlVar, bArr, i4, i5, i6, zzejVar);
        zzhlVar.zzf(zze);
        zzejVar.zzc = zze;
        return zzm;
    }

    static int zzd(zzhl zzhlVar, byte[] bArr, int i4, int i5, zzej zzejVar) {
        Object zze = zzhlVar.zze();
        int zzn = zzn(zze, zzhlVar, bArr, i4, i5, zzejVar);
        zzhlVar.zzf(zze);
        zzejVar.zzc = zze;
        return zzn;
    }

    static int zze(zzhl zzhlVar, int i4, byte[] bArr, int i5, int i6, zzfz zzfzVar, zzej zzejVar) {
        int zzd = zzd(zzhlVar, bArr, i5, i6, zzejVar);
        zzfzVar.add(zzejVar.zzc);
        while (zzd < i6) {
            int zzi = zzi(bArr, zzd, zzejVar);
            if (i4 != zzejVar.zza) {
                break;
            }
            zzd = zzd(zzhlVar, bArr, zzi, i6, zzejVar);
            zzfzVar.add(zzejVar.zzc);
        }
        return zzd;
    }

    static int zzf(byte[] bArr, int i4, zzfz zzfzVar, zzej zzejVar) {
        zzfv zzfvVar = (zzfv) zzfzVar;
        int zzi = zzi(bArr, i4, zzejVar);
        int i5 = zzejVar.zza + zzi;
        while (zzi < i5) {
            zzi = zzi(bArr, zzi, zzejVar);
            zzfvVar.zzg(zzejVar.zza);
        }
        if (zzi == i5) {
            return zzi;
        }
        throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int zzg(byte[] bArr, int i4, zzej zzejVar) {
        int i5;
        int zzi = zzi(bArr, i4, zzejVar);
        int i6 = zzejVar.zza;
        if (i6 < 0) {
            throw new zzgc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i6 == 0) {
            zzejVar.zzc = "";
            return zzi;
        }
        int i7 = zzin.zza;
        int length = bArr.length;
        if ((((length - zzi) - i6) | zzi | i6) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(zzi), Integer.valueOf(i6)));
        }
        int i8 = zzi + i6;
        char[] cArr = new char[i6];
        int i9 = 0;
        while (zzi < i8) {
            byte b4 = bArr[zzi];
            if (!zzij.zzd(b4)) {
                break;
            }
            zzi++;
            cArr[i9] = (char) b4;
            i9++;
        }
        int i10 = i9;
        while (zzi < i8) {
            int i11 = zzi + 1;
            byte b5 = bArr[zzi];
            if (zzij.zzd(b5)) {
                cArr[i10] = (char) b5;
                i10++;
                zzi = i11;
                while (zzi < i8) {
                    byte b6 = bArr[zzi];
                    if (zzij.zzd(b6)) {
                        zzi++;
                        cArr[i10] = (char) b6;
                        i10++;
                    }
                }
            } else {
                if (b5 < -32) {
                    if (i11 >= i8) {
                        throw new zzgc("Protocol message had invalid UTF-8.");
                    }
                    i5 = i10 + 1;
                    zzi += 2;
                    zzij.zzc(b5, bArr[i11], cArr, i10);
                } else if (b5 < -16) {
                    if (i11 >= i8 - 1) {
                        throw new zzgc("Protocol message had invalid UTF-8.");
                    }
                    i5 = i10 + 1;
                    int i12 = zzi + 2;
                    zzi += 3;
                    zzij.zzb(b5, bArr[i11], bArr[i12], cArr, i10);
                } else {
                    if (i11 >= i8 - 2) {
                        throw new zzgc("Protocol message had invalid UTF-8.");
                    }
                    byte b7 = bArr[i11];
                    int i13 = zzi + 3;
                    byte b8 = bArr[zzi + 2];
                    zzi += 4;
                    zzij.zza(b5, b7, b8, bArr[i13], cArr, i10);
                    i10 += 2;
                }
                i10 = i5;
            }
        }
        zzejVar.zzc = new String(cArr, 0, i10);
        return i8;
    }

    static int zzh(int i4, byte[] bArr, int i5, int i6, zzic zzicVar, zzej zzejVar) {
        if ((i4 >>> 3) == 0) {
            throw new zzgc("Protocol message contained an invalid tag (zero).");
        }
        int i7 = i4 & 7;
        if (i7 == 0) {
            int zzl = zzl(bArr, i5, zzejVar);
            zzicVar.zzj(i4, Long.valueOf(zzejVar.zzb));
            return zzl;
        }
        if (i7 == 1) {
            zzicVar.zzj(i4, Long.valueOf(zzp(bArr, i5)));
            return i5 + 8;
        }
        if (i7 == 2) {
            int zzi = zzi(bArr, i5, zzejVar);
            int i8 = zzejVar.zza;
            if (i8 < 0) {
                throw new zzgc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i8 > bArr.length - zzi) {
                throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i8 == 0) {
                zzicVar.zzj(i4, zzev.zza);
            } else {
                zzicVar.zzj(i4, zzev.zzk(bArr, zzi, i8));
            }
            return zzi + i8;
        }
        if (i7 != 3) {
            if (i7 != 5) {
                throw new zzgc("Protocol message contained an invalid tag (zero).");
            }
            zzicVar.zzj(i4, Integer.valueOf(zzb(bArr, i5)));
            return i5 + 4;
        }
        int i9 = (i4 & (-8)) | 4;
        zzic zzf = zzic.zzf();
        int i10 = zzejVar.zze + 1;
        zzejVar.zze = i10;
        zzq(i10);
        int i11 = 0;
        while (true) {
            if (i5 >= i6) {
                break;
            }
            int zzi2 = zzi(bArr, i5, zzejVar);
            int i12 = zzejVar.zza;
            if (i12 == i9) {
                i11 = i12;
                i5 = zzi2;
                break;
            }
            i5 = zzh(i12, bArr, zzi2, i6, zzf, zzejVar);
            i11 = i12;
        }
        zzejVar.zze--;
        if (i5 > i6 || i11 != i9) {
            throw new zzgc("Failed to parse the message.");
        }
        zzicVar.zzj(i4, zzf);
        return i5;
    }

    static int zzi(byte[] bArr, int i4, zzej zzejVar) {
        int i5 = i4 + 1;
        byte b4 = bArr[i4];
        if (b4 < 0) {
            return zzj(b4, bArr, i5, zzejVar);
        }
        zzejVar.zza = b4;
        return i5;
    }

    static int zzj(int i4, byte[] bArr, int i5, zzej zzejVar) {
        byte b4 = bArr[i5];
        int i6 = i5 + 1;
        int i7 = i4 & 127;
        if (b4 >= 0) {
            zzejVar.zza = i7 | (b4 << 7);
            return i6;
        }
        int i8 = i7 | ((b4 & Byte.MAX_VALUE) << 7);
        int i9 = i5 + 2;
        byte b5 = bArr[i6];
        if (b5 >= 0) {
            zzejVar.zza = i8 | (b5 << 14);
            return i9;
        }
        int i10 = i8 | ((b5 & Byte.MAX_VALUE) << 14);
        int i11 = i5 + 3;
        byte b6 = bArr[i9];
        if (b6 >= 0) {
            zzejVar.zza = i10 | (b6 << 21);
            return i11;
        }
        int i12 = i10 | ((b6 & Byte.MAX_VALUE) << 21);
        int i13 = i5 + 4;
        byte b7 = bArr[i11];
        if (b7 >= 0) {
            zzejVar.zza = i12 | (b7 << 28);
            return i13;
        }
        int i14 = i12 | ((b7 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i15 = i13 + 1;
            if (bArr[i13] >= 0) {
                zzejVar.zza = i14;
                return i15;
            }
            i13 = i15;
        }
    }

    static int zzk(int i4, byte[] bArr, int i5, int i6, zzfz zzfzVar, zzej zzejVar) {
        zzfv zzfvVar = (zzfv) zzfzVar;
        int zzi = zzi(bArr, i5, zzejVar);
        zzfvVar.zzg(zzejVar.zza);
        while (zzi < i6) {
            int zzi2 = zzi(bArr, zzi, zzejVar);
            if (i4 != zzejVar.zza) {
                break;
            }
            zzi = zzi(bArr, zzi2, zzejVar);
            zzfvVar.zzg(zzejVar.zza);
        }
        return zzi;
    }

    static int zzl(byte[] bArr, int i4, zzej zzejVar) {
        long j4 = bArr[i4];
        int i5 = i4 + 1;
        if (j4 >= 0) {
            zzejVar.zzb = j4;
            return i5;
        }
        int i6 = i4 + 2;
        byte b4 = bArr[i5];
        long j5 = (j4 & 127) | ((b4 & Byte.MAX_VALUE) << 7);
        int i7 = 7;
        while (b4 < 0) {
            int i8 = i6 + 1;
            i7 += 7;
            j5 |= (r10 & Byte.MAX_VALUE) << i7;
            b4 = bArr[i6];
            i6 = i8;
        }
        zzejVar.zzb = j5;
        return i6;
    }

    static int zzm(Object obj, zzhl zzhlVar, byte[] bArr, int i4, int i5, int i6, zzej zzejVar) {
        int i7 = zzejVar.zze + 1;
        zzejVar.zze = i7;
        zzq(i7);
        int zzc = ((zzhe) zzhlVar).zzc(obj, bArr, i4, i5, i6, zzejVar);
        zzejVar.zze--;
        zzejVar.zzc = obj;
        return zzc;
    }

    static int zzn(Object obj, zzhl zzhlVar, byte[] bArr, int i4, int i5, zzej zzejVar) {
        int i6 = i4 + 1;
        int i7 = bArr[i4];
        if (i7 < 0) {
            i6 = zzj(i7, bArr, i6, zzejVar);
            i7 = zzejVar.zza;
        }
        int i8 = i6;
        if (i7 < 0 || i7 > i5 - i8) {
            throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i9 = zzejVar.zze + 1;
        zzejVar.zze = i9;
        zzq(i9);
        int i10 = i8 + i7;
        zzhlVar.zzh(obj, bArr, i8, i10, zzejVar);
        zzejVar.zze--;
        zzejVar.zzc = obj;
        return i10;
    }

    static int zzo(int i4, byte[] bArr, int i5, int i6, zzej zzejVar) {
        if ((i4 >>> 3) == 0) {
            throw new zzgc("Protocol message contained an invalid tag (zero).");
        }
        int i7 = i4 & 7;
        if (i7 == 0) {
            return zzl(bArr, i5, zzejVar);
        }
        if (i7 == 1) {
            return i5 + 8;
        }
        if (i7 == 2) {
            return zzi(bArr, i5, zzejVar) + zzejVar.zza;
        }
        if (i7 != 3) {
            if (i7 == 5) {
                return i5 + 4;
            }
            throw new zzgc("Protocol message contained an invalid tag (zero).");
        }
        int i8 = (i4 & (-8)) | 4;
        int i9 = 0;
        while (i5 < i6) {
            i5 = zzi(bArr, i5, zzejVar);
            i9 = zzejVar.zza;
            if (i9 == i8) {
                break;
            }
            i5 = zzo(i9, bArr, i5, i6, zzejVar);
        }
        if (i5 > i6 || i9 != i8) {
            throw new zzgc("Failed to parse the message.");
        }
        return i5;
    }

    static long zzp(byte[] bArr, int i4) {
        return (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48) | ((bArr[i4 + 7] & 255) << 56);
    }

    private static void zzq(int i4) {
        if (i4 >= zzb) {
            throw new zzgc("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
