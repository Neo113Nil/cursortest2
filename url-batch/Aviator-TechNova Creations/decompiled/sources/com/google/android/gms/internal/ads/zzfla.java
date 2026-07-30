package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbgj;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzfla implements zzfkz {
    private final ConcurrentHashMap zza;
    private final zzflg zzb;
    private final zzflc zzc = new zzflc();

    public zzfla(zzflg zzflgVar) {
        this.zza = new ConcurrentHashMap(zzflgVar.zzd);
        this.zzb = zzflgVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzflg> creator = zzflg.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhl)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            zzflg zzflgVar = this.zzb;
            sb.append(zzflgVar.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzg());
            int i = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzflj) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((zzfky) entry.getValue()).zzc(); i2++) {
                    sb.append("[O]");
                }
                for (int zzc = ((zzfky) entry.getValue()).zzc(); zzc < zzflgVar.zzd; zzc++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zzfky) entry.getValue()).zzg());
                sb.append("\n");
            }
            while (i < zzflgVar.zzc) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            String sb2 = sb.toString();
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfkz
    public final synchronized zzfli zza(zzflj zzfljVar) {
        zzfli zzfliVar;
        zzfky zzfkyVar = (zzfky) this.zza.get(zzfljVar);
        if (zzfkyVar != null) {
            zzfliVar = zzfkyVar.zzb();
            if (zzfliVar == null) {
                this.zzc.zzb();
            }
            zzflw zzh = zzfkyVar.zzh();
            if (zzfliVar != null) {
                zzbgj.zzb.zzc zzs = zzbgj.zzb.zzs();
                zzbgj.zzb.zza.C0014zza zzs2 = zzbgj.zzb.zza.zzs();
                zzs2.zzc(zzbgj.zzb.zzd.IN_MEMORY);
                zzbgj.zzb.zze.zza zzq = zzbgj.zzb.zze.zzq();
                zzq.zzc(zzh.zza);
                zzq.zzg(zzh.zzb);
                zzs2.zzh(zzq);
                zzs.zzh(zzs2);
                zzfliVar.zza.zza().zzd().zzj(zzs.zzbu());
            }
            zzf();
        } else {
            this.zzc.zza();
            zzf();
            zzfliVar = null;
        }
        return zzfliVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfkz
    public final synchronized boolean zzb(zzflj zzfljVar, zzfli zzfliVar) {
        boolean zza;
        ConcurrentHashMap concurrentHashMap = this.zza;
        zzfky zzfkyVar = (zzfky) concurrentHashMap.get(zzfljVar);
        zzfliVar.zzd = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        if (zzfkyVar == null) {
            zzflg zzflgVar = this.zzb;
            zzfky zzfkyVar2 = new zzfky(zzflgVar.zzd, zzflgVar.zze * 1000);
            if (concurrentHashMap.size() == zzflgVar.zzc) {
                int i = zzflgVar.zzg;
                int i2 = i - 1;
                zzflj zzfljVar2 = null;
                if (i == 0) {
                    throw null;
                }
                long j = Long.MAX_VALUE;
                if (i2 == 0) {
                    for (Map.Entry entry : concurrentHashMap.entrySet()) {
                        if (((zzfky) entry.getValue()).zzd() < j) {
                            j = ((zzfky) entry.getValue()).zzd();
                            zzfljVar2 = (zzflj) entry.getKey();
                        }
                    }
                    if (zzfljVar2 != null) {
                        concurrentHashMap.remove(zzfljVar2);
                    }
                } else if (i2 == 1) {
                    for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                        if (((zzfky) entry2.getValue()).zze() < j) {
                            j = ((zzfky) entry2.getValue()).zze();
                            zzfljVar2 = (zzflj) entry2.getKey();
                        }
                    }
                    if (zzfljVar2 != null) {
                        concurrentHashMap.remove(zzfljVar2);
                    }
                } else if (i2 == 2) {
                    int i3 = Integer.MAX_VALUE;
                    for (Map.Entry entry3 : concurrentHashMap.entrySet()) {
                        if (((zzfky) entry3.getValue()).zzf() < i3) {
                            i3 = ((zzfky) entry3.getValue()).zzf();
                            zzfljVar2 = (zzflj) entry3.getKey();
                        }
                    }
                    if (zzfljVar2 != null) {
                        concurrentHashMap.remove(zzfljVar2);
                    }
                }
                this.zzc.zzd();
            }
            concurrentHashMap.put(zzfljVar, zzfkyVar2);
            this.zzc.zzc();
            zzfkyVar = zzfkyVar2;
        }
        zza = zzfkyVar.zza(zzfliVar);
        zzflc zzflcVar = this.zzc;
        zzflcVar.zze();
        zzflb zzf = zzflcVar.zzf();
        zzflw zzh = zzfkyVar.zzh();
        if (zzfliVar != null) {
            zzbgj.zzb.zzc zzs = zzbgj.zzb.zzs();
            zzbgj.zzb.zza.C0014zza zzs2 = zzbgj.zzb.zza.zzs();
            zzs2.zzc(zzbgj.zzb.zzd.IN_MEMORY);
            zzbgj.zzb.zzg.zza zzs3 = zzbgj.zzb.zzg.zzs();
            zzs3.zzc(zzf.zza);
            zzs3.zzg(zzf.zzb);
            zzs3.zzk(zzh.zzb);
            zzs2.zzn(zzs3);
            zzs.zzh(zzs2);
            zzfliVar.zza.zza().zzd().zzk(zzs.zzbu());
        }
        zzf();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfkz
    public final synchronized boolean zzc(zzflj zzfljVar) {
        zzfky zzfkyVar = (zzfky) this.zza.get(zzfljVar);
        if (zzfkyVar == null) {
            return true;
        }
        return zzfkyVar.zzc() < this.zzb.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfkz
    @Deprecated
    public final zzflj zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, com.google.android.gms.ads.internal.client.zzx zzxVar) {
        zzflg zzflgVar = this.zzb;
        return new zzflk(zzmVar, str, new zzbzx(zzflgVar.zza).zza().zzj, zzflgVar.zzf, zzxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfkz
    public final zzflg zze() {
        return this.zzb;
    }
}
