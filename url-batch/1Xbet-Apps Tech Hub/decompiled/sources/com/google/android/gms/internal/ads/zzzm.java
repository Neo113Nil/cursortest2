package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzzm implements zzaaz {
    private final Context zza;
    private final zzcs zzb;
    private final zzaaw zzc;
    private zzzl zzd;
    private List zze;
    private zzaaa zzf;
    private boolean zzg;

    zzzm(Context context, zzcs zzcsVar, zzaaw zzaawVar) {
        this.zza = context;
        this.zzb = zzcsVar;
        this.zzc = zzaawVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaaz
    public final zzaay zza() {
        zzzl zzzlVar = this.zzd;
        zzef.zzb(zzzlVar);
        return zzzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaaz
    public final void zzb() {
        zzzl zzzlVar = this.zzd;
        zzef.zzb(zzzlVar);
        zzzlVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzaaz
    public final void zzc(zzam zzamVar) throws zzaax {
        boolean z = false;
        if (!this.zzg && this.zzd == null) {
            z = true;
        }
        zzef.zzf(z);
        zzef.zzb(this.zze);
        try {
            zzzl zzzlVar = new zzzl(this.zza, this.zzb, this.zzc, zzamVar);
            this.zzd = zzzlVar;
            zzaaa zzaaaVar = this.zzf;
            if (zzaaaVar != null) {
                zzzlVar.zzo(zzaaaVar);
            }
            zzzl zzzlVar2 = this.zzd;
            List list = this.zze;
            list.getClass();
            zzzlVar2.zzn(list);
        } catch (zzdo e) {
            throw new zzaax(e, zzamVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaaz
    public final void zzd() {
        if (this.zzg) {
            return;
        }
        zzzl zzzlVar = this.zzd;
        if (zzzlVar != null) {
            zzzlVar.zzh();
            this.zzd = null;
        }
        this.zzg = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaaz
    public final void zze(Surface surface, zzfk zzfkVar) {
        zzzl zzzlVar = this.zzd;
        zzef.zzb(zzzlVar);
        zzzlVar.zzk(surface, zzfkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaaz
    public final void zzf(long j) {
        zzzl zzzlVar = this.zzd;
        zzef.zzb(zzzlVar);
        zzzlVar.zzm(j);
    }

    @Override // com.google.android.gms.internal.ads.zzaaz
    public final void zzg(List list) {
        this.zze = list;
        if (zzi()) {
            zzzl zzzlVar = this.zzd;
            zzef.zzb(zzzlVar);
            zzzlVar.zzn(list);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaaz
    public final void zzh(zzaaa zzaaaVar) {
        this.zzf = zzaaaVar;
        if (zzi()) {
            zzzl zzzlVar = this.zzd;
            zzef.zzb(zzzlVar);
            zzzlVar.zzo(zzaaaVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaaz
    public final boolean zzi() {
        return this.zzd != null;
    }
}
