package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zznt implements zznx {
    public static final zzfvk zza = new zzfvk() { // from class: com.google.android.gms.internal.ads.zznr
        @Override // com.google.android.gms.internal.ads.zzfvk
        public final Object zza() {
            String zzn;
            zzn = zznt.zzn();
            return zzn;
        }
    };
    private static final Random zzb = new Random();
    private final zzcb zzc;
    private final zzca zzd;
    private final HashMap zze;
    private zznw zzf;
    private zzcc zzg;
    private String zzh;
    private long zzi;

    public zznt() {
        throw null;
    }

    public zznt(zzfvk zzfvkVar) {
        this.zzc = new zzcb();
        this.zzd = new zzca();
        this.zze = new HashMap();
        this.zzg = zzcc.zza;
        this.zzi = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzl() {
        zzns zznsVar = (zzns) this.zze.get(this.zzh);
        return (zznsVar == null || zznsVar.zzd == -1) ? this.zzi + 1 : zznsVar.zzd;
    }

    private final zzns zzm(int i, zzui zzuiVar) {
        long j = Long.MAX_VALUE;
        zzns zznsVar = null;
        for (zzns zznsVar2 : this.zze.values()) {
            zznsVar2.zzg(i, zzuiVar);
            if (zznsVar2.zzj(i, zzuiVar)) {
                long j2 = zznsVar2.zzd;
                if (j2 == -1 || j2 < j) {
                    zznsVar = zznsVar2;
                    j = j2;
                } else if (j2 == j) {
                    int i2 = zzet.zza;
                    if (zznsVar.zze != null && zznsVar2.zze != null) {
                        zznsVar = zznsVar2;
                    }
                }
            }
        }
        if (zznsVar != null) {
            return zznsVar;
        }
        String zzn = zzn();
        zzns zznsVar3 = new zzns(this, zzn, i, zzuiVar);
        this.zze.put(zzn, zznsVar3);
        return zznsVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzn() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final void zzo(zzns zznsVar) {
        if (zznsVar.zzd != -1) {
            this.zzi = zznsVar.zzd;
        }
        this.zzh = null;
    }

    @RequiresNonNull({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    private final void zzp(zzlo zzloVar) {
        if (zzloVar.zzb.zzo()) {
            String str = this.zzh;
            if (str != null) {
                zzns zznsVar = (zzns) this.zze.get(str);
                zznsVar.getClass();
                zzo(zznsVar);
                return;
            }
            return;
        }
        zzns zznsVar2 = (zzns) this.zze.get(this.zzh);
        zzns zzm = zzm(zzloVar.zzc, zzloVar.zzd);
        this.zzh = zzm.zzb;
        zzi(zzloVar);
        zzui zzuiVar = zzloVar.zzd;
        if (zzuiVar == null || !zzuiVar.zzb()) {
            return;
        }
        if (zznsVar2 != null) {
            if (zznsVar2.zzd == zzuiVar.zzd && zznsVar2.zze != null && zznsVar2.zze.zzb == zzloVar.zzd.zzb && zznsVar2.zze.zzc == zzloVar.zzd.zzc) {
                return;
            }
        }
        zzui zzuiVar2 = zzloVar.zzd;
        String unused = zzm(zzloVar.zzc, new zzui(zzuiVar2.zza, zzuiVar2.zzd)).zzb;
        String unused2 = zzm.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zznx
    public final synchronized String zze() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zznx
    public final synchronized String zzf(zzcc zzccVar, zzui zzuiVar) {
        return zzm(zzccVar.zzn(zzuiVar.zza, this.zzd).zzc, zzuiVar).zzb;
    }

    @Override // com.google.android.gms.internal.ads.zznx
    public final synchronized void zzg(zzlo zzloVar) {
        zznw zznwVar;
        String str = this.zzh;
        if (str != null) {
            zzns zznsVar = (zzns) this.zze.get(str);
            if (zznsVar == null) {
                throw null;
            }
            zzo(zznsVar);
        }
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzns zznsVar2 = (zzns) it.next();
            it.remove();
            if (zznsVar2.zzf && (zznwVar = this.zzf) != null) {
                zznwVar.zzd(zzloVar, zznsVar2.zzb, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zznx
    public final void zzh(zznw zznwVar) {
        this.zzf = zznwVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r0.zzc == r10.zzc) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.zznx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzi(zzlo zzloVar) {
        if (this.zzf == null) {
            throw null;
        }
        if (!zzloVar.zzb.zzo()) {
            zzui zzuiVar = zzloVar.zzd;
            if (zzuiVar != null) {
                if (zzuiVar.zzd >= zzl()) {
                    zzns zznsVar = (zzns) this.zze.get(this.zzh);
                    if (zznsVar != null) {
                        if (zznsVar.zzd == -1) {
                        }
                    }
                }
            }
            zzns zzm = zzm(zzloVar.zzc, zzloVar.zzd);
            if (this.zzh == null) {
                this.zzh = zzm.zzb;
            }
            zzui zzuiVar2 = zzloVar.zzd;
            if (zzuiVar2 != null && zzuiVar2.zzb()) {
                zzns zzm2 = zzm(zzloVar.zzc, new zzui(zzuiVar2.zza, zzuiVar2.zzd, zzuiVar2.zzb));
                if (!zzm2.zzf) {
                    zzm2.zzf = true;
                    zzcc zzccVar = zzloVar.zzb;
                    zzui zzuiVar3 = zzloVar.zzd;
                    zzccVar.zzn(zzuiVar3.zza, this.zzd);
                    this.zzd.zzi(zzloVar.zzd.zzb);
                    Math.max(0L, zzet.zzu(0L) + zzet.zzu(0L));
                    String unused = zzm2.zzb;
                }
            }
            if (!zzm.zzf) {
                zzm.zzf = true;
                String unused2 = zzm.zzb;
            }
            if (zzm.zzb.equals(this.zzh) && !zzm.zzg) {
                zzm.zzg = true;
                this.zzf.zzc(zzloVar, zzm.zzb);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zznx
    public final synchronized void zzj(zzlo zzloVar, int i) {
        if (this.zzf == null) {
            throw null;
        }
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzns zznsVar = (zzns) it.next();
            if (zznsVar.zzk(zzloVar)) {
                it.remove();
                if (zznsVar.zzf) {
                    boolean equals = zznsVar.zzb.equals(this.zzh);
                    boolean z = false;
                    if (i == 0 && equals && zznsVar.zzg) {
                        z = true;
                    }
                    if (equals) {
                        zzo(zznsVar);
                    }
                    this.zzf.zzd(zzloVar, zznsVar.zzb, z);
                }
            }
        }
        zzp(zzloVar);
    }

    @Override // com.google.android.gms.internal.ads.zznx
    public final synchronized void zzk(zzlo zzloVar) {
        if (this.zzf == null) {
            throw null;
        }
        zzcc zzccVar = this.zzg;
        this.zzg = zzloVar.zzb;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzns zznsVar = (zzns) it.next();
            if (!zznsVar.zzl(zzccVar, this.zzg) || zznsVar.zzk(zzloVar)) {
                it.remove();
                if (zznsVar.zzf) {
                    if (zznsVar.zzb.equals(this.zzh)) {
                        zzo(zznsVar);
                    }
                    this.zzf.zzd(zzloVar, zznsVar.zzb, false);
                }
            }
        }
        zzp(zzloVar);
    }
}
