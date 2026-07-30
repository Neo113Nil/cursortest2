package com.google.android.gms.internal.ads;

import com.google.firebase.FirebaseError;
import java.io.IOException;
import java.util.ArrayDeque;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzaja {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzajj zzc = new zzajj();
    private zzajb zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzaev zzaevVar, int i) throws IOException {
        zzaevVar.zzc(this.zza, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (r0[i2] & 255);
        }
        return j;
    }

    public final void zza(zzajb zzajbVar) {
        this.zzd = zzajbVar;
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
    public final boolean zzc(zzaev zzaevVar) throws IOException {
        String str;
        int zzd;
        int zze;
        this.zzd.getClass();
        while (true) {
            ArrayDeque arrayDeque = this.zzb;
            zzaiz zzaizVar = (zzaiz) arrayDeque.peek();
            if (zzaizVar != null && zzaevVar.zzn() >= zzaizVar.zzb()) {
                ((zzajc) this.zzd).zza.zzi(((zzaiz) arrayDeque.pop()).zza());
                return true;
            }
            int i = this.zze;
            if (i == 0) {
                long zzb = this.zzc.zzb(zzaevVar, true, false, 4);
                if (zzb == -2) {
                    zzaevVar.zzl();
                    while (true) {
                        byte[] bArr = this.zza;
                        zzaevVar.zzi(bArr, 0, 4);
                        zzd = zzajj.zzd(bArr[0]);
                        if (zzd != -1 && zzd <= 4) {
                            zze = (int) zzajj.zze(bArr, zzd, false);
                            zzajh zzajhVar = ((zzajc) this.zzd).zza;
                            if (zze != 357149030 && zze != 524531317 && zze != 475249515) {
                                if (zze == 374648427) {
                                    zze = 374648427;
                                }
                            }
                        }
                        zzaevVar.zzf(1);
                    }
                    zzaevVar.zzf(zzd);
                    zzb = zze;
                }
                if (zzb == -1) {
                    return false;
                }
                this.zzf = (int) zzb;
                this.zze = 1;
            }
            this.zzg = this.zzc.zzb(zzaevVar, false, true, 8);
            this.zze = 2;
            zzajb zzajbVar = this.zzd;
            int i2 = this.zzf;
            zzajh zzajhVar2 = ((zzajc) zzajbVar).zza;
            switch (i2) {
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
                case 240:
                case 241:
                case 247:
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
                        zzajhVar2.zzj(i2, zzd(zzaevVar, (int) j));
                        this.zze = 0;
                        return true;
                    }
                    StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 22);
                    sb.append("Invalid integer size: ");
                    sb.append(j);
                    throw zzat.zzb(sb.toString(), null);
                case Opcodes.I2F /* 134 */:
                case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
                case 21358:
                case 2274716:
                    long j2 = this.zzg;
                    if (j2 > 2147483647L) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(j2).length() + 21);
                        sb2.append("String element size: ");
                        sb2.append(j2);
                        throw zzat.zzb(sb2.toString(), null);
                    }
                    int i3 = (int) j2;
                    if (i3 == 0) {
                        str = "";
                    } else {
                        byte[] bArr2 = new byte[i3];
                        zzaevVar.zzc(bArr2, 0, i3);
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
                    zzajhVar2.zzl(i2, str);
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
                    long zzn = zzaevVar.zzn();
                    arrayDeque.push(new zzaiz(i2, this.zzg + zzn, null));
                    ((zzajc) this.zzd).zza.zzh(this.zzf, zzn, this.zzg);
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
                    zzajhVar2.zzm(i2, (int) this.zzg, zzaevVar);
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
                    long j3 = this.zzg;
                    if (j3 != 4 && j3 != 8) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(j3).length() + 20);
                        sb3.append("Invalid float size: ");
                        sb3.append(j3);
                        throw zzat.zzb(sb3.toString(), null);
                    }
                    int i5 = (int) j3;
                    zzajhVar2.zzk(i2, i5 == 4 ? Float.intBitsToFloat((int) r6) : Double.longBitsToDouble(zzd(zzaevVar, i5)));
                    this.zze = 0;
                    return true;
                default:
                    zzaevVar.zzf((int) this.zzg);
                    this.zze = 0;
            }
        }
    }
}
