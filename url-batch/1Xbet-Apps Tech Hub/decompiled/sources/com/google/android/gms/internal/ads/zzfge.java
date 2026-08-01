package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfge implements zzfgd {
    private final ConcurrentHashMap zza;
    private final zzfgk zzb;
    private final zzfgg zzc = new zzfgg();

    public zzfge(zzfgk zzfgkVar) {
        this.zza = new ConcurrentHashMap(zzfgkVar.zzd);
        this.zzb = zzfgkVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzfgk> creator = zzfgk.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgr)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.zzb.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzb());
            int i = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzfgn) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((zzfgc) entry.getValue()).zzb(); i2++) {
                    sb.append("[O]");
                }
                for (int zzb = ((zzfgc) entry.getValue()).zzb(); zzb < this.zzb.zzd; zzb++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zzfgc) entry.getValue()).zzg());
                sb.append("\n");
            }
            while (i < this.zzb.zzc) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            zzcbn.zze(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgd
    public final zzfgk zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfgd
    public final synchronized zzfgm zzb(zzfgn zzfgnVar) {
        zzfgm zzfgmVar;
        zzfgc zzfgcVar = (zzfgc) this.zza.get(zzfgnVar);
        if (zzfgcVar != null) {
            zzfgmVar = zzfgcVar.zze();
            if (zzfgmVar == null) {
                this.zzc.zze();
            }
            zzfha zzf = zzfgcVar.zzf();
            if (zzfgmVar != null) {
                zzaze zza = zzazk.zza();
                zzazc zza2 = zzazd.zza();
                zza2.zzd(2);
                zzazg zza3 = zzazh.zza();
                zza3.zza(zzf.zza);
                zza3.zzb(zzf.zzb);
                zza2.zza(zza3);
                zza.zza(zza2);
                zzfgmVar.zza.zzb().zzc().zzi((zzazk) zza.zzal());
            }
            zzf();
        } else {
            this.zzc.zzf();
            zzf();
            zzfgmVar = null;
        }
        return zzfgmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgd
    @Deprecated
    public final zzfgn zzc(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, com.google.android.gms.ads.internal.client.zzw zzwVar) {
        return new zzfgo(zzlVar, str, new zzbwe(this.zzb.zza).zza().zzk, this.zzb.zzf, zzwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfgd
    public final synchronized boolean zzd(zzfgn zzfgnVar, zzfgm zzfgmVar) {
        boolean zzh;
        zzfgc zzfgcVar = (zzfgc) this.zza.get(zzfgnVar);
        zzfgmVar.zzd = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        if (zzfgcVar == null) {
            zzfgk zzfgkVar = this.zzb;
            zzfgc zzfgcVar2 = new zzfgc(zzfgkVar.zzd, zzfgkVar.zze * 1000);
            if (this.zza.size() == this.zzb.zzc) {
                int i = this.zzb.zzg;
                int i2 = i - 1;
                zzfgn zzfgnVar2 = null;
                if (i == 0) {
                    throw null;
                }
                long j = Long.MAX_VALUE;
                if (i2 == 0) {
                    for (Map.Entry entry : this.zza.entrySet()) {
                        if (((zzfgc) entry.getValue()).zzc() < j) {
                            j = ((zzfgc) entry.getValue()).zzc();
                            zzfgnVar2 = (zzfgn) entry.getKey();
                        }
                    }
                    if (zzfgnVar2 != null) {
                        this.zza.remove(zzfgnVar2);
                    }
                } else if (i2 == 1) {
                    for (Map.Entry entry2 : this.zza.entrySet()) {
                        if (((zzfgc) entry2.getValue()).zzd() < j) {
                            j = ((zzfgc) entry2.getValue()).zzd();
                            zzfgnVar2 = (zzfgn) entry2.getKey();
                        }
                    }
                    if (zzfgnVar2 != null) {
                        this.zza.remove(zzfgnVar2);
                    }
                } else if (i2 == 2) {
                    int i3 = Integer.MAX_VALUE;
                    for (Map.Entry entry3 : this.zza.entrySet()) {
                        if (((zzfgc) entry3.getValue()).zza() < i3) {
                            i3 = ((zzfgc) entry3.getValue()).zza();
                            zzfgnVar2 = (zzfgn) entry3.getKey();
                        }
                    }
                    if (zzfgnVar2 != null) {
                        this.zza.remove(zzfgnVar2);
                    }
                }
                this.zzc.zzg();
            }
            this.zza.put(zzfgnVar, zzfgcVar2);
            this.zzc.zzd();
            zzfgcVar = zzfgcVar2;
        }
        zzh = zzfgcVar.zzh(zzfgmVar);
        this.zzc.zzc();
        zzfgf zza = this.zzc.zza();
        zzfha zzf = zzfgcVar.zzf();
        if (zzfgmVar != null) {
            zzaze zza2 = zzazk.zza();
            zzazc zza3 = zzazd.zza();
            zza3.zzd(2);
            zzazi zza4 = zzazj.zza();
            zza4.zza(zza.zza);
            zza4.zzb(zza.zzb);
            zza4.zzc(zzf.zzb);
            zza3.zzc(zza4);
            zza2.zza(zza3);
            zzfgmVar.zza.zzb().zzc().zzj((zzazk) zza2.zzal());
        }
        zzf();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfgd
    public final synchronized boolean zze(zzfgn zzfgnVar) {
        zzfgc zzfgcVar = (zzfgc) this.zza.get(zzfgnVar);
        if (zzfgcVar == null) {
            return true;
        }
        return zzfgcVar.zzb() < this.zzb.zzd;
    }
}
