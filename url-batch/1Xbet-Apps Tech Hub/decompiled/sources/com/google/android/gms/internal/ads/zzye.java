package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzye {
    private zzyd zza;
    private zzym zzb;

    public zzma zzc() {
        throw null;
    }

    public void zzi() {
        this.zza = null;
        this.zzb = null;
    }

    public void zzj(zzk zzkVar) {
        throw null;
    }

    public boolean zzm() {
        throw null;
    }

    public abstract zzyf zzo(zzmb[] zzmbVarArr, zzwl zzwlVar, zzuk zzukVar, zzda zzdaVar) throws zzit;

    public abstract void zzp(Object obj);

    protected final zzym zzq() {
        zzym zzymVar = this.zzb;
        zzef.zzb(zzymVar);
        return zzymVar;
    }

    public final void zzr(zzyd zzydVar, zzym zzymVar) {
        this.zza = zzydVar;
        this.zzb = zzymVar;
    }

    protected final void zzs() {
        zzyd zzydVar = this.zza;
        if (zzydVar != null) {
            zzydVar.zzi();
        }
    }
}
