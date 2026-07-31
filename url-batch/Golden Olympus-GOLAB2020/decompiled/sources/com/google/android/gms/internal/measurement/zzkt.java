package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzkt {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    static int zza(byte[] bArr, int i4, zzks zzksVar) {
        int zzh = zzh(bArr, i4, zzksVar);
        int i5 = zzksVar.zza;
        if (i5 < 0) {
            throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i5 > bArr.length - zzh) {
            throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i5 == 0) {
            zzksVar.zzc = zzld.zzb;
            return zzh;
        }
        zzksVar.zzc = zzld.zzj(bArr, zzh, i5);
        return zzh + i5;
    }

    static int zzb(byte[] bArr, int i4) {
        int i5 = bArr[i4] & 255;
        int i6 = bArr[i4 + 1] & 255;
        int i7 = bArr[i4 + 2] & 255;
        return ((bArr[i4 + 3] & 255) << 24) | (i6 << 8) | i5 | (i7 << 16);
    }

    static int zzc(zzns zznsVar, byte[] bArr, int i4, int i5, int i6, zzks zzksVar) {
        Object zze = zznsVar.zze();
        int zzl = zzl(zze, zznsVar, bArr, i4, i5, i6, zzksVar);
        zznsVar.zzf(zze);
        zzksVar.zzc = zze;
        return zzl;
    }

    static int zzd(zzns zznsVar, byte[] bArr, int i4, int i5, zzks zzksVar) {
        Object zze = zznsVar.zze();
        int zzm = zzm(zze, zznsVar, bArr, i4, i5, zzksVar);
        zznsVar.zzf(zze);
        zzksVar.zzc = zze;
        return zzm;
    }

    static int zze(zzns zznsVar, int i4, byte[] bArr, int i5, int i6, zzmj zzmjVar, zzks zzksVar) {
        int zzd = zzd(zznsVar, bArr, i5, i6, zzksVar);
        zzmjVar.add(zzksVar.zzc);
        while (zzd < i6) {
            int zzh = zzh(bArr, zzd, zzksVar);
            if (i4 != zzksVar.zza) {
                break;
            }
            zzd = zzd(zznsVar, bArr, zzh, i6, zzksVar);
            zzmjVar.add(zzksVar.zzc);
        }
        return zzd;
    }

    static int zzf(byte[] bArr, int i4, zzmj zzmjVar, zzks zzksVar) {
        zzme zzmeVar = (zzme) zzmjVar;
        int zzh = zzh(bArr, i4, zzksVar);
        int i5 = zzksVar.zza + zzh;
        while (zzh < i5) {
            zzh = zzh(bArr, zzh, zzksVar);
            zzmeVar.zzh(zzksVar.zza);
        }
        if (zzh == i5) {
            return zzh;
        }
        throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int zzg(int i4, byte[] bArr, int i5, int i6, zzof zzofVar, zzks zzksVar) {
        if ((i4 >>> 3) == 0) {
            throw new zzmm("Protocol message contained an invalid tag (zero).");
        }
        int i7 = i4 & 7;
        if (i7 == 0) {
            int zzk = zzk(bArr, i5, zzksVar);
            zzofVar.zzj(i4, Long.valueOf(zzksVar.zzb));
            return zzk;
        }
        if (i7 == 1) {
            zzofVar.zzj(i4, Long.valueOf(zzn(bArr, i5)));
            return i5 + 8;
        }
        if (i7 == 2) {
            int zzh = zzh(bArr, i5, zzksVar);
            int i8 = zzksVar.zza;
            if (i8 < 0) {
                throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i8 > bArr.length - zzh) {
                throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i8 == 0) {
                zzofVar.zzj(i4, zzld.zzb);
            } else {
                zzofVar.zzj(i4, zzld.zzj(bArr, zzh, i8));
            }
            return zzh + i8;
        }
        if (i7 != 3) {
            if (i7 != 5) {
                throw new zzmm("Protocol message contained an invalid tag (zero).");
            }
            zzofVar.zzj(i4, Integer.valueOf(zzb(bArr, i5)));
            return i5 + 4;
        }
        int i9 = (i4 & (-8)) | 4;
        zzof zzf = zzof.zzf();
        int i10 = zzksVar.zze + 1;
        zzksVar.zze = i10;
        zzo(i10);
        int i11 = 0;
        while (true) {
            if (i5 >= i6) {
                break;
            }
            int zzh2 = zzh(bArr, i5, zzksVar);
            int i12 = zzksVar.zza;
            if (i12 == i9) {
                i11 = i12;
                i5 = zzh2;
                break;
            }
            i5 = zzg(i12, bArr, zzh2, i6, zzf, zzksVar);
            i11 = i12;
        }
        zzksVar.zze--;
        if (i5 > i6 || i11 != i9) {
            throw new zzmm("Failed to parse the message.");
        }
        zzofVar.zzj(i4, zzf);
        return i5;
    }

    static int zzh(byte[] bArr, int i4, zzks zzksVar) {
        int i5 = i4 + 1;
        byte b4 = bArr[i4];
        if (b4 < 0) {
            return zzi(b4, bArr, i5, zzksVar);
        }
        zzksVar.zza = b4;
        return i5;
    }

    static int zzi(int i4, byte[] bArr, int i5, zzks zzksVar) {
        byte b4 = bArr[i5];
        int i6 = i5 + 1;
        int i7 = i4 & 127;
        if (b4 >= 0) {
            zzksVar.zza = i7 | (b4 << 7);
            return i6;
        }
        int i8 = i7 | ((b4 & Byte.MAX_VALUE) << 7);
        int i9 = i5 + 2;
        byte b5 = bArr[i6];
        if (b5 >= 0) {
            zzksVar.zza = i8 | (b5 << 14);
            return i9;
        }
        int i10 = i8 | ((b5 & Byte.MAX_VALUE) << 14);
        int i11 = i5 + 3;
        byte b6 = bArr[i9];
        if (b6 >= 0) {
            zzksVar.zza = i10 | (b6 << 21);
            return i11;
        }
        int i12 = i10 | ((b6 & Byte.MAX_VALUE) << 21);
        int i13 = i5 + 4;
        byte b7 = bArr[i11];
        if (b7 >= 0) {
            zzksVar.zza = i12 | (b7 << 28);
            return i13;
        }
        int i14 = i12 | ((b7 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i15 = i13 + 1;
            if (bArr[i13] >= 0) {
                zzksVar.zza = i14;
                return i15;
            }
            i13 = i15;
        }
    }

    static int zzj(int i4, byte[] bArr, int i5, int i6, zzmj zzmjVar, zzks zzksVar) {
        zzme zzmeVar = (zzme) zzmjVar;
        int zzh = zzh(bArr, i5, zzksVar);
        zzmeVar.zzh(zzksVar.zza);
        while (zzh < i6) {
            int zzh2 = zzh(bArr, zzh, zzksVar);
            if (i4 != zzksVar.zza) {
                break;
            }
            zzh = zzh(bArr, zzh2, zzksVar);
            zzmeVar.zzh(zzksVar.zza);
        }
        return zzh;
    }

    static int zzk(byte[] bArr, int i4, zzks zzksVar) {
        long j4 = bArr[i4];
        int i5 = i4 + 1;
        if (j4 >= 0) {
            zzksVar.zzb = j4;
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
        zzksVar.zzb = j5;
        return i6;
    }

    static int zzl(Object obj, zzns zznsVar, byte[] bArr, int i4, int i5, int i6, zzks zzksVar) {
        int i7 = zzksVar.zze + 1;
        zzksVar.zze = i7;
        zzo(i7);
        int zzc = ((zznk) zznsVar).zzc(obj, bArr, i4, i5, i6, zzksVar);
        zzksVar.zze--;
        zzksVar.zzc = obj;
        return zzc;
    }

    static int zzm(Object obj, zzns zznsVar, byte[] bArr, int i4, int i5, zzks zzksVar) {
        int i6 = i4 + 1;
        int i7 = bArr[i4];
        if (i7 < 0) {
            i6 = zzi(i7, bArr, i6, zzksVar);
            i7 = zzksVar.zza;
        }
        int i8 = i6;
        if (i7 < 0 || i7 > i5 - i8) {
            throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i9 = zzksVar.zze + 1;
        zzksVar.zze = i9;
        zzo(i9);
        int i10 = i8 + i7;
        zznsVar.zzh(obj, bArr, i8, i10, zzksVar);
        zzksVar.zze--;
        zzksVar.zzc = obj;
        return i10;
    }

    static long zzn(byte[] bArr, int i4) {
        return (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48) | ((bArr[i4 + 7] & 255) << 56);
    }

    private static void zzo(int i4) {
        if (i4 >= zzb) {
            throw new zzmm("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
