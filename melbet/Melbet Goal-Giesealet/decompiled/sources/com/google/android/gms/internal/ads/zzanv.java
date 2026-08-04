package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzanv {
    private final List zza;
    private final String zzb = "video/mp2t";
    private final zzaeb[] zzc;
    private final zzfp zzd;

    public zzanv(List list, String str) {
        this.zza = list;
        this.zzc = new zzaeb[list.size()];
        zzfp zzfpVar = new zzfp(new zzfo() { // from class: com.google.android.gms.internal.ads.zzanu
            @Override // com.google.android.gms.internal.ads.zzfo
            public final /* synthetic */ void zza(long j, zzef zzefVar) {
                zzanv.this.zzc(j, zzefVar);
            }
        });
        this.zzd = zzfpVar;
        zzfpVar.zza(3);
    }

    public final void zza(zzacx zzacxVar, zzanr zzanrVar) {
        int i = 0;
        while (true) {
            zzaeb[] zzaebVarArr = this.zzc;
            if (i >= zzaebVarArr.length) {
                return;
            }
            zzanrVar.zza();
            zzaeb zzu = zzacxVar.zzu(zzanrVar.zzb(), 3);
            zzu zzuVar = (zzu) this.zza.get(i);
            String str = zzuVar.zzo;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            zzghc.zzf(z, "Invalid closed caption MIME type provided: %s", str);
            zzs zzsVar = new zzs();
            zzsVar.zza(zzanrVar.zzc());
            zzsVar.zzl(this.zzb);
            zzsVar.zzm(str);
            zzsVar.zzf(zzuVar.zze);
            zzsVar.zze(zzuVar.zzd);
            zzsVar.zzJ(zzuVar.zzL);
            zzsVar.zzp(zzuVar.zzr);
            zzu.zzu(zzsVar.zzM());
            zzaebVarArr[i] = zzu;
            i++;
        }
    }

    public final void zzb(long j, zzef zzefVar) {
        if (zzefVar.zzd() < 9) {
            return;
        }
        int zzB = zzefVar.zzB();
        int zzB2 = zzefVar.zzB();
        int zzs = zzefVar.zzs();
        if (zzB == 434 && zzB2 == 1195456820 && zzs == 3) {
            this.zzd.zzc(j, zzefVar);
        }
    }

    final /* synthetic */ void zzc(long j, zzef zzefVar) {
        zzach.zzb(j, zzefVar, this.zzc);
    }
}
