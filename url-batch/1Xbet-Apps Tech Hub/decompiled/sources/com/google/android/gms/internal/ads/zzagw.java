package com.google.android.gms.internal.ads;

import com.google.firebase.FirebaseError;
import java.io.IOException;
import java.util.ArrayDeque;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzagw implements zzagy {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzahf zzc = new zzahf();
    private zzagx zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzacf zzacfVar, int i) throws IOException {
        ((zzabu) zzacfVar).zzn(this.zza, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.zza[i2] & 255);
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzagy
    public final void zza(zzagx zzagxVar) {
        this.zzd = zzagxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagy
    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zze();
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0095, code lost:
    
        if (r0 == 1) goto L34;
     */
    @Override // com.google.android.gms.internal.ads.zzagy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzc(zzacf zzacfVar) throws IOException {
        String str;
        zzabu zzabuVar;
        int zzb;
        int zzc;
        long j;
        int i;
        zzef.zzb(this.zzd);
        while (true) {
            zzagv zzagvVar = (zzagv) this.zzb.peek();
            if (zzagvVar != null) {
                long zzf = zzacfVar.zzf();
                j = zzagvVar.zzb;
                if (zzf >= j) {
                    zzagx zzagxVar = this.zzd;
                    i = ((zzagv) this.zzb.pop()).zza;
                    ((zzahb) zzagxVar).zza.zzh(i);
                    return true;
                }
            }
            int i2 = this.zze;
            if (i2 == 0) {
                long zzd = this.zzc.zzd(zzacfVar, true, false, 4);
                if (zzd == -2) {
                    zzacfVar.zzj();
                    while (true) {
                        zzabuVar = (zzabu) zzacfVar;
                        zzabuVar.zzm(this.zza, 0, 4, false);
                        zzb = zzahf.zzb(this.zza[0]);
                        if (zzb != -1 && zzb <= 4) {
                            zzc = (int) zzahf.zzc(this.zza, zzb, false);
                            zzahd zzahdVar = ((zzahb) this.zzd).zza;
                            if (zzc != 357149030 && zzc != 524531317 && zzc != 475249515) {
                                if (zzc == 374648427) {
                                    zzc = 374648427;
                                }
                            }
                        }
                        zzabuVar.zzo(1, false);
                    }
                    zzabuVar.zzo(zzb, false);
                    zzd = zzc;
                }
                if (zzd == -1) {
                    return false;
                }
                this.zzf = (int) zzd;
                this.zze = 1;
            }
            this.zzg = this.zzc.zzd(zzacfVar, false, true, 8);
            this.zze = 2;
            zzagx zzagxVar2 = this.zzd;
            int i3 = this.zzf;
            zzahb zzahbVar = (zzahb) zzagxVar2;
            zzahd zzahdVar2 = zzahbVar.zza;
            switch (i3) {
                case Opcodes.LXOR /* 131 */:
                case Opcodes.L2I /* 136 */:
                case 155:
                case Opcodes.IF_ICMPEQ /* 159 */:
                case Opcodes.ARETURN /* 176 */:
                case Opcodes.PUTSTATIC /* 179 */:
                case Opcodes.INVOKEDYNAMIC /* 186 */:
                case 215:
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
                    long j2 = this.zzg;
                    if (j2 <= 8) {
                        zzahbVar.zza.zzj(i3, zzd(zzacfVar, (int) j2));
                        this.zze = 0;
                        return true;
                    }
                    throw zzcf.zza("Invalid integer size: " + j2, null);
                case Opcodes.I2F /* 134 */:
                case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
                case 21358:
                case 2274716:
                    long j3 = this.zzg;
                    if (j3 > 2147483647L) {
                        throw zzcf.zza("String element size: " + j3, null);
                    }
                    int i4 = (int) j3;
                    if (i4 == 0) {
                        str = "";
                    } else {
                        byte[] bArr = new byte[i4];
                        ((zzabu) zzacfVar).zzn(bArr, 0, i4, false);
                        while (i4 > 0) {
                            int i5 = i4 - 1;
                            if (bArr[i5] == 0) {
                                i4 = i5;
                            } else {
                                str = new String(bArr, 0, i4);
                            }
                        }
                        str = new String(bArr, 0, i4);
                    }
                    zzahbVar.zza.zzl(i3, str);
                    this.zze = 0;
                    return true;
                case Opcodes.IF_ICMPNE /* 160 */:
                case Opcodes.IF_ACMPNE /* 166 */:
                case Opcodes.FRETURN /* 174 */:
                case Opcodes.INVOKESPECIAL /* 183 */:
                case Opcodes.NEW /* 187 */:
                case 224:
                case 225:
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
                    long zzf2 = zzacfVar.zzf();
                    this.zzb.push(new zzagv(i3, this.zzg + zzf2, null));
                    ((zzahb) this.zzd).zza.zzk(this.zzf, zzf2, this.zzg);
                    this.zze = 0;
                    return true;
                case Opcodes.IF_ICMPLT /* 161 */:
                case Opcodes.IF_ICMPGT /* 163 */:
                case Opcodes.IF_ACMPEQ /* 165 */:
                case 16877:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    zzahdVar2.zzg(i3, (int) this.zzg, zzacfVar);
                    this.zze = 0;
                    return true;
                case Opcodes.PUTFIELD /* 181 */:
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
                    long j4 = this.zzg;
                    if (j4 != 4 && j4 != 8) {
                        throw zzcf.zza("Invalid float size: " + j4, null);
                    }
                    int i6 = (int) j4;
                    zzahbVar.zza.zzi(i3, i6 == 4 ? Float.intBitsToFloat((int) r6) : Double.longBitsToDouble(zzd(zzacfVar, i6)));
                    this.zze = 0;
                    return true;
                default:
                    ((zzabu) zzacfVar).zzo((int) this.zzg, false);
                    this.zze = 0;
            }
        }
    }
}
