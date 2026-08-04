package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzang {
    private final List zza;
    private final zzaeb[] zzc;
    private final String zzb = "video/mp2t";
    private final zzfp zzd = new zzfp(new zzfo() { // from class: com.google.android.gms.internal.ads.zzanf
        @Override // com.google.android.gms.internal.ads.zzfo
        public final /* synthetic */ void zza(long j, zzef zzefVar) {
            zzang.this.zzf(j, zzefVar);
        }
    });

    public zzang(List list, String str) {
        this.zza = list;
        this.zzc = new zzaeb[list.size()];
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
            String str2 = zzuVar.zza;
            if (str2 == null) {
                str2 = zzanrVar.zzc();
            }
            zzs zzsVar = new zzs();
            zzsVar.zza(str2);
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

    public final void zzb(int i) {
        this.zzd.zza(i);
    }

    public final void zzc(long j, zzef zzefVar) {
        this.zzd.zzc(j, zzefVar);
    }

    public final void zzd() {
        this.zzd.zze();
    }

    public final void zze() {
        this.zzd.zze();
    }

    final /* synthetic */ void zzf(long j, zzef zzefVar) {
        zzach.zza(j, zzefVar, this.zzc);
    }
}
