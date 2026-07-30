package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public abstract class zzaaj {
    private zzaai zza;
    private zzaas zzb;

    public void zzb() {
        this.zza = null;
        this.zzb = null;
    }

    public boolean zzd() {
        throw null;
    }

    public void zze(zzd zzdVar) {
        throw null;
    }

    public zzmm zzg() {
        throw null;
    }

    public abstract void zzp(Object obj);

    public abstract zzaak zzq(zzmn[] zzmnVarArr, zzyn zzynVar, zzwk zzwkVar, zzbf zzbfVar) throws zziw;

    public final void zzr(zzaai zzaaiVar, zzaas zzaasVar) {
        zzgrc.zzi(this.zza == null);
        this.zza = zzaaiVar;
        this.zzb = zzaasVar;
    }

    protected final void zzs() {
        zzaai zzaaiVar = this.zza;
        if (zzaaiVar != null) {
            zzaaiVar.zzq();
        }
    }

    protected final zzaas zzt() {
        zzaas zzaasVar = this.zzb;
        zzaasVar.getClass();
        return zzaasVar;
    }
}
