package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzop implements zzot {
    public static final zzfuo zza = new zzfuo() { // from class: com.google.android.gms.internal.ads.zzon
        @Override // com.google.android.gms.internal.ads.zzfuo
        public final Object zza() {
            String zzn;
            zzn = zzop.zzn();
            return zzn;
        }
    };
    private static final Random zzb = new Random();
    private final zzcz zzc;
    private final zzcx zzd;
    private final HashMap zze;
    private final zzfuo zzf;
    private zzos zzg;
    private zzda zzh;
    private String zzi;
    private long zzj;

    public zzop() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzl() {
        zzoo zzooVar = (zzoo) this.zze.get(this.zzi);
        return (zzooVar == null || zzooVar.zzd == -1) ? this.zzj + 1 : zzooVar.zzd;
    }

    private final zzoo zzm(int i, zzuk zzukVar) {
        long j = Long.MAX_VALUE;
        zzoo zzooVar = null;
        for (zzoo zzooVar2 : this.zze.values()) {
            zzooVar2.zzg(i, zzukVar);
            if (zzooVar2.zzj(i, zzukVar)) {
                long j2 = zzooVar2.zzd;
                if (j2 == -1 || j2 < j) {
                    zzooVar = zzooVar2;
                    j = j2;
                } else if (j2 == j) {
                    int i2 = zzfs.zza;
                    if (zzooVar.zze != null && zzooVar2.zze != null) {
                        zzooVar = zzooVar2;
                    }
                }
            }
        }
        if (zzooVar != null) {
            return zzooVar;
        }
        String zzn = zzn();
        zzoo zzooVar3 = new zzoo(this, zzn, i, zzukVar);
        this.zze.put(zzn, zzooVar3);
        return zzooVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzn() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final void zzo(zzoo zzooVar) {
        if (zzooVar.zzd != -1) {
            this.zzj = zzooVar.zzd;
        }
        this.zzi = null;
    }

    @RequiresNonNull({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    private final void zzp(zzmk zzmkVar) {
        if (zzmkVar.zzb.zzo()) {
            String str = this.zzi;
            if (str != null) {
                zzoo zzooVar = (zzoo) this.zze.get(str);
                zzooVar.getClass();
                zzo(zzooVar);
                return;
            }
            return;
        }
        zzoo zzooVar2 = (zzoo) this.zze.get(this.zzi);
        zzoo zzm = zzm(zzmkVar.zzc, zzmkVar.zzd);
        this.zzi = zzm.zzb;
        zzi(zzmkVar);
        zzuk zzukVar = zzmkVar.zzd;
        if (zzukVar == null || !zzukVar.zzb()) {
            return;
        }
        if (zzooVar2 != null) {
            if (zzooVar2.zzd == zzukVar.zzd && zzooVar2.zze != null && zzooVar2.zze.zzb == zzmkVar.zzd.zzb && zzooVar2.zze.zzc == zzmkVar.zzd.zzc) {
                return;
            }
        }
        zzuk zzukVar2 = zzmkVar.zzd;
        String unused = zzm(zzmkVar.zzc, new zzuk(zzukVar2.zza, zzukVar2.zzd)).zzb;
        String unused2 = zzm.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final synchronized String zze() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final synchronized String zzf(zzda zzdaVar, zzuk zzukVar) {
        return zzm(zzdaVar.zzn(zzukVar.zza, this.zzd).zzd, zzukVar).zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final synchronized void zzg(zzmk zzmkVar) {
        zzos zzosVar;
        String str = this.zzi;
        if (str != null) {
            zzoo zzooVar = (zzoo) this.zze.get(str);
            zzooVar.getClass();
            zzo(zzooVar);
        }
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzoo zzooVar2 = (zzoo) it.next();
            it.remove();
            if (zzooVar2.zzf && (zzosVar = this.zzg) != null) {
                zzosVar.zzd(zzmkVar, zzooVar2.zzb, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final void zzh(zzos zzosVar) {
        this.zzg = zzosVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (r0.zzc == r10.zzc) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.zzot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzi(zzmk zzmkVar) {
        this.zzg.getClass();
        if (!zzmkVar.zzb.zzo()) {
            zzuk zzukVar = zzmkVar.zzd;
            if (zzukVar != null) {
                if (zzukVar.zzd >= zzl()) {
                    zzoo zzooVar = (zzoo) this.zze.get(this.zzi);
                    if (zzooVar != null) {
                        if (zzooVar.zzd == -1) {
                        }
                    }
                }
            }
            zzoo zzm = zzm(zzmkVar.zzc, zzmkVar.zzd);
            if (this.zzi == null) {
                this.zzi = zzm.zzb;
            }
            zzuk zzukVar2 = zzmkVar.zzd;
            if (zzukVar2 != null && zzukVar2.zzb()) {
                zzoo zzm2 = zzm(zzmkVar.zzc, new zzuk(zzukVar2.zza, zzukVar2.zzd, zzukVar2.zzb));
                if (!zzm2.zzf) {
                    zzm2.zzf = true;
                    zzda zzdaVar = zzmkVar.zzb;
                    zzuk zzukVar3 = zzmkVar.zzd;
                    zzdaVar.zzn(zzukVar3.zza, this.zzd);
                    this.zzd.zzi(zzmkVar.zzd.zzb);
                    Math.max(0L, zzfs.zzt(0L) + zzfs.zzt(0L));
                    String unused = zzm2.zzb;
                }
            }
            if (!zzm.zzf) {
                zzm.zzf = true;
                String unused2 = zzm.zzb;
            }
            if (zzm.zzb.equals(this.zzi) && !zzm.zzg) {
                zzm.zzg = true;
                this.zzg.zzc(zzmkVar, zzm.zzb);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final synchronized void zzj(zzmk zzmkVar, int i) {
        this.zzg.getClass();
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzoo zzooVar = (zzoo) it.next();
            if (zzooVar.zzk(zzmkVar)) {
                it.remove();
                if (zzooVar.zzf) {
                    boolean equals = zzooVar.zzb.equals(this.zzi);
                    boolean z = false;
                    if (i == 0 && equals && zzooVar.zzg) {
                        z = true;
                    }
                    if (equals) {
                        zzo(zzooVar);
                    }
                    this.zzg.zzd(zzmkVar, zzooVar.zzb, z);
                }
            }
        }
        zzp(zzmkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzot
    public final synchronized void zzk(zzmk zzmkVar) {
        this.zzg.getClass();
        zzda zzdaVar = this.zzh;
        this.zzh = zzmkVar.zzb;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzoo zzooVar = (zzoo) it.next();
            if (!zzooVar.zzl(zzdaVar, this.zzh) || zzooVar.zzk(zzmkVar)) {
                it.remove();
                if (zzooVar.zzf) {
                    if (zzooVar.zzb.equals(this.zzi)) {
                        zzo(zzooVar);
                    }
                    this.zzg.zzd(zzmkVar, zzooVar.zzb, false);
                }
            }
        }
        zzp(zzmkVar);
    }

    public zzop(zzfuo zzfuoVar) {
        this.zzf = zzfuoVar;
        this.zzc = new zzcz();
        this.zzd = new zzcx();
        this.zze = new HashMap();
        this.zzh = zzda.zza;
        this.zzj = -1L;
    }
}
