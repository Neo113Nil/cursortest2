package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzagc {
    public static final zzaga zza = new Object() { // from class: com.google.android.gms.internal.ads.zzaga
    };

    /* JADX WARN: Removed duplicated region for block: B:6:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final zzbk zza(byte[] bArr, int i, zzaga zzagaVar, zzafe zzafeVar) {
        zzagb zzagbVar;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList = new ArrayList();
        zzek zzekVar = new zzek(bArr, i);
        boolean z2 = false;
        if (zzekVar.zzb() < 10) {
            zzea.zzf("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int zzo = zzekVar.zzo();
            if (zzo == 4801587) {
                int zzm = zzekVar.zzm();
                zzekVar.zzL(1);
                int zzm2 = zzekVar.zzm();
                int zzl = zzekVar.zzl();
                if (zzm == 2) {
                    if ((zzm2 & 64) != 0) {
                        zzea.zzf("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    zzagbVar = new zzagb(zzm, zzm >= 4 && (zzm2 & 128) != 0, zzl);
                } else {
                    if (zzm == 3) {
                        if ((zzm2 & 64) != 0) {
                            int zzg = zzekVar.zzg();
                            zzekVar.zzL(zzg);
                            zzl -= zzg + 4;
                        }
                    } else if (zzm == 4) {
                        if ((zzm2 & 64) != 0) {
                            int zzl2 = zzekVar.zzl();
                            zzekVar.zzL(zzl2 - 4);
                            zzl -= zzl2;
                        }
                        if ((zzm2 & 16) != 0) {
                            zzl -= 10;
                        }
                    } else {
                        zzea.zzf("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + zzm);
                    }
                    zzagbVar = new zzagb(zzm, zzm >= 4 && (zzm2 & 128) != 0, zzl);
                }
                if (zzagbVar != null) {
                    return null;
                }
                int zzd = zzekVar.zzd();
                i2 = zzagbVar.zza;
                int i9 = i2 == 2 ? 6 : 10;
                i3 = zzagbVar.zzc;
                z = zzagbVar.zzb;
                if (z) {
                    i8 = zzagbVar.zzc;
                    i3 = zze(zzekVar, i8);
                }
                zzekVar.zzJ(zzd + i3);
                i4 = zzagbVar.zza;
                if (!zzj(zzekVar, i4, i9, false)) {
                    i6 = zzagbVar.zza;
                    if (i6 != 4 || !zzj(zzekVar, 4, i9, true)) {
                        i7 = zzagbVar.zza;
                        zzea.zzf("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + i7);
                        return null;
                    }
                    z2 = true;
                }
                while (zzekVar.zzb() >= i9) {
                    i5 = zzagbVar.zza;
                    zzagd zzl3 = zzl(i5, zzekVar, z2, i9, zzagaVar);
                    if (zzl3 != null) {
                        arrayList.add(zzl3);
                    }
                }
                return new zzbk(arrayList);
            }
            zzea.zzf("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.valueOf(String.format("%06X", Integer.valueOf(zzo)))));
        }
        zzagbVar = null;
        if (zzagbVar != null) {
        }
    }

    private static int zzb(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static int zzc(byte[] bArr, int i, int i2) {
        int zzd = zzd(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return zzd;
        }
        while (true) {
            int length = bArr.length;
            if (zzd >= length - 1) {
                return length;
            }
            int i3 = zzd + 1;
            if ((zzd - i) % 2 == 0 && bArr[i3] == 0) {
                return zzd;
            }
            zzd = zzd(bArr, i3);
        }
    }

    private static int zzd(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    private static int zze(zzek zzekVar, int i) {
        byte[] zzM = zzekVar.zzM();
        int zzd = zzekVar.zzd();
        int i2 = zzd;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= zzd + i) {
                return i;
            }
            if ((zzM[i2] & 255) == 255 && zzM[i3] == 0) {
                System.arraycopy(zzM, i2 + 2, zzM, i3, (i - (i2 - zzd)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    private static zzfxr zzf(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return zzfxr.zzn("");
        }
        zzfxo zzfxoVar = new zzfxo();
        int zzc = zzc(bArr, i2, i);
        while (i2 < zzc) {
            zzfxoVar.zzf(new String(bArr, i2, zzc - i2, zzi(i)));
            i2 = zzb(i) + zzc;
            zzc = zzc(bArr, i2, i);
        }
        zzfxr zzi = zzfxoVar.zzi();
        return zzi.isEmpty() ? zzfxr.zzn("") : zzi;
    }

    private static String zzg(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    private static String zzh(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean zzj(zzek zzekVar, int i, int i2, boolean z) {
        boolean z2;
        int zzo;
        long zzo2;
        int i3;
        int i4;
        int zzd = zzekVar.zzd();
        while (true) {
            try {
                z2 = true;
                z2 = true;
                int i5 = 1;
                int i6 = 1;
                if (zzekVar.zzb() >= i2) {
                    if (i >= 3) {
                        zzo = zzekVar.zzg();
                        zzo2 = zzekVar.zzu();
                        i3 = zzekVar.zzq();
                    } else {
                        zzo = zzekVar.zzo();
                        zzo2 = zzekVar.zzo();
                        i3 = 0;
                    }
                    if (zzo == 0 && zzo2 == 0 && i3 == 0) {
                        break;
                    }
                    if (i == 4 && !z) {
                        if ((8421504 & zzo2) != 0) {
                            break;
                        }
                        zzo2 = ((zzo2 >> 24) << 21) | (((zzo2 >> 16) & 255) << 14) | (zzo2 & 255) | (((zzo2 >> 8) & 255) << 7);
                    }
                    if (i == 4) {
                        if ((i3 & 64) == 0) {
                            i5 = 0;
                        }
                        int i7 = i5;
                        i6 = i3 & 1;
                        i4 = i7;
                    } else {
                        if (i == 3) {
                            i4 = (i3 & 32) != 0 ? 1 : 0;
                            if ((i3 & 128) != 0) {
                            }
                        } else {
                            i4 = 0;
                        }
                        i6 = 0;
                    }
                    if (i6 != 0) {
                        i4 += 4;
                    }
                    if (zzo2 >= i4 && zzekVar.zzb() >= zzo2) {
                        zzekVar.zzL((int) zzo2);
                    }
                } else {
                    break;
                }
            } finally {
                zzekVar.zzK(zzd);
            }
        }
        return z2;
    }

    private static byte[] zzk(byte[] bArr, int i, int i2) {
        return i2 <= i ? zzet.zzf : Arrays.copyOfRange(bArr, i, i2);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private static com.google.android.gms.internal.ads.zzagd zzl(int r35, com.google.android.gms.internal.ads.zzek r36, boolean r37, int r38, com.google.android.gms.internal.ads.zzaga r39) {
        /*
            Method dump skipped, instructions count: 1523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagc.zzl(int, com.google.android.gms.internal.ads.zzek, boolean, int, com.google.android.gms.internal.ads.zzaga):com.google.android.gms.internal.ads.zzagd");
    }

    private static Charset zzi(int i) {
        return i != 1 ? i != 2 ? i != 3 ? zzfuj.zzb : zzfuj.zzc : zzfuj.zzd : zzfuj.zzf;
    }
}
