package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes3.dex */
public final class zzfa implements zzau {
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (r8 != 78) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r6.length != 8) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        r8 = 78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        com.google.android.gms.internal.ads.zzdd.zzd(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        r8 = 78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        if (r5.equals("auxiliary.tracks.length") != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r5.equals("auxiliary.tracks.offset") != false) goto L16;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzfa(String str, byte[] bArr, int i, int i2) {
        byte b;
        switch (str.hashCode()) {
            case -1949883051:
                if (str.equals("com.android.capture.fps")) {
                    if (i2 == 23) {
                        if (bArr.length == 4) {
                            i2 = 23;
                            zzdd.zzd(r1);
                            break;
                        } else {
                            i2 = 23;
                        }
                    }
                    r1 = false;
                    zzdd.zzd(r1);
                }
                break;
            case -269399509:
                if (str.equals("auxiliary.tracks.interleaved")) {
                    if (i2 == 75) {
                        if (bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                            i2 = 75;
                            zzdd.zzd(r1);
                            break;
                        } else {
                            i2 = 75;
                        }
                    }
                    r1 = false;
                    zzdd.zzd(r1);
                }
                break;
            case 1011693540:
                break;
            case 1098277265:
                break;
            case 2002123038:
                if (str.equals("auxiliary.tracks.map")) {
                    zzdd.zzd(i2 == 0);
                    break;
                }
                break;
        }
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzfa zzfaVar = (zzfa) obj;
            if (this.zza.equals(zzfaVar.zza) && Arrays.equals(this.zzb, zzfaVar.zzb) && this.zzc == zzfaVar.zzc && this.zzd == zzfaVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.zza.hashCode() + 527) * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final /* synthetic */ void zza(zzar zzarVar) {
    }

    public final List zzb() {
        zzdd.zzg(this.zza.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte[] bArr = this.zzb;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2]));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008a A[LOOP:0: B:18:0x0087->B:20:0x008a, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String sb;
        byte[] bArr;
        int i = this.zzd;
        if (i == 0) {
            if (this.zza.equals("auxiliary.tracks.map")) {
                List zzb = zzb();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("track types = ");
                zzfvh.zzb(sb2, zzb, ",");
                sb = sb2.toString();
            }
            bArr = this.zzb;
            String str = zzex.zza;
            int length = bArr.length;
            StringBuilder sb3 = new StringBuilder(length + length);
            while (r1 < bArr.length) {
            }
            sb = sb3.toString();
        } else if (i == 1) {
            sb = zzex.zzB(this.zzb);
        } else if (i == 23) {
            sb = String.valueOf(Float.intBitsToFloat(zzgbt.zzd(this.zzb)));
        } else if (i == 67) {
            sb = String.valueOf(zzgbt.zzd(this.zzb));
        } else if (i != 75) {
            if (i == 78) {
                sb = String.valueOf(new zzen(this.zzb).zzw());
            }
            bArr = this.zzb;
            String str2 = zzex.zza;
            int length2 = bArr.length;
            StringBuilder sb32 = new StringBuilder(length2 + length2);
            for (int i2 = 0; i2 < bArr.length; i2++) {
                sb32.append(Character.forDigit((bArr[i2] >> 4) & 15, 16));
                sb32.append(Character.forDigit(bArr[i2] & Ascii.SI, 16));
            }
            sb = sb32.toString();
        } else {
            sb = String.valueOf(this.zzb[0] & 255);
        }
        return "mdta: key=" + this.zza + ", value=" + sb;
    }
}
