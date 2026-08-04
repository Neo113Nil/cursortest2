package com.google.android.gms.internal.ads;

import androidx.collection.SieveCacheKt;
import com.facebook.imageutils.JfifUtil;
import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzagu {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzahb zzc = new zzahb();
    private zzagv zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzacv zzacvVar, int i) throws IOException {
        zzacvVar.zzc(this.zza, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (r0[i2] & 255);
        }
        return j;
    }

    public final void zza(zzagv zzagvVar) {
        this.zzd = zzagvVar;
    }

    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zza();
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x008c, code lost:
    
        if (r1 == 1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzc(zzacv zzacvVar) throws IOException {
        String str;
        int zzd;
        int zze;
        this.zzd.getClass();
        while (true) {
            ArrayDeque arrayDeque = this.zzb;
            zzagt zzagtVar = (zzagt) arrayDeque.peek();
            if (zzagtVar != null && zzacvVar.zzn() >= zzagtVar.zzb()) {
                ((zzagw) this.zzd).zza.zzb(((zzagt) arrayDeque.pop()).zza());
                return true;
            }
            int i = this.zze;
            if (i == 0) {
                long zzb = this.zzc.zzb(zzacvVar, true, false, 4);
                if (zzb == -2) {
                    zzacvVar.zzl();
                    while (true) {
                        byte[] bArr = this.zza;
                        zzacvVar.zzi(bArr, 0, 4);
                        zzd = zzahb.zzd(bArr[0]);
                        if (zzd != -1 && zzd <= 4) {
                            zze = (int) zzahb.zze(bArr, zzd, false);
                            zzagz zzagzVar = ((zzagw) this.zzd).zza;
                            if (zze != 357149030 && zze != 524531317 && zze != 475249515) {
                                if (zze == 374648427) {
                                    zze = 374648427;
                                }
                            }
                        }
                        zzacvVar.zzf(1);
                    }
                    zzacvVar.zzf(zzd);
                    zzb = zze;
                }
                if (zzb == -1) {
                    return false;
                }
                this.zzf = (int) zzb;
                this.zze = 1;
            }
            this.zzg = this.zzc.zzb(zzacvVar, false, true, 8);
            this.zze = 2;
            zzagv zzagvVar = this.zzd;
            int i2 = this.zzf;
            zzagz zzagzVar2 = ((zzagw) zzagvVar).zza;
            switch (i2) {
                case 131:
                case 136:
                case 155:
                case 159:
                case 176:
                case 179:
                case 186:
                case JfifUtil.MARKER_RST7 /* 215 */:
                case 231:
                case 238:
                case 241:
                case 251:
                case 16871:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21938:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 21998:
                case 22186:
                case 22203:
                case 25188:
                case 30114:
                case 30321:
                case 2352003:
                case 2807729:
                    long j = this.zzg;
                    if (j <= 8) {
                        zzagzVar2.zzc(i2, zzd(zzacvVar, (int) j));
                        this.zze = 0;
                        return true;
                    }
                    StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 22);
                    sb.append("Invalid integer size: ");
                    sb.append(j);
                    throw zzas.zzb(sb.toString(), null);
                case 134:
                case 17026:
                case 21358:
                case 2274716:
                    long j2 = this.zzg;
                    if (j2 > SieveCacheKt.NodeLinkMask) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(j2).length() + 21);
                        sb2.append("String element size: ");
                        sb2.append(j2);
                        throw zzas.zzb(sb2.toString(), null);
                    }
                    int i3 = (int) j2;
                    if (i3 == 0) {
                        str = "";
                    } else {
                        byte[] bArr2 = new byte[i3];
                        zzacvVar.zzc(bArr2, 0, i3);
                        while (i3 > 0) {
                            int i4 = i3 - 1;
                            if (bArr2[i4] == 0) {
                                i3 = i4;
                            } else {
                                str = new String(bArr2, 0, i3);
                            }
                        }
                        str = new String(bArr2, 0, i3);
                    }
                    zzagzVar2.zzk(i2, str);
                    this.zze = 0;
                    return true;
                case 160:
                case 166:
                case 174:
                case 183:
                case 187:
                case 224:
                case JfifUtil.MARKER_APP1 /* 225 */:
                case 16868:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30113:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    long zzn = zzacvVar.zzn();
                    arrayDeque.push(new zzagt(i2, this.zzg + zzn, null));
                    ((zzagw) this.zzd).zza.zza(this.zzf, zzn, this.zzg);
                    this.zze = 0;
                    return true;
                case 161:
                case 163:
                case 165:
                case 16877:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    zzagzVar2.zzl(i2, (int) this.zzg, zzacvVar);
                    this.zze = 0;
                    return true;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                case 30323:
                case 30324:
                case 30325:
                    long j3 = this.zzg;
                    if (j3 != 4 && j3 != 8) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(j3).length() + 20);
                        sb3.append("Invalid float size: ");
                        sb3.append(j3);
                        throw zzas.zzb(sb3.toString(), null);
                    }
                    int i5 = (int) j3;
                    zzagzVar2.zzj(i2, i5 == 4 ? Float.intBitsToFloat((int) r6) : Double.longBitsToDouble(zzd(zzacvVar, i5)));
                    this.zze = 0;
                    return true;
                default:
                    zzacvVar.zzf((int) this.zzg);
                    this.zze = 0;
            }
        }
    }
}
