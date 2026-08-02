package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public abstract class zzfl implements zzfs {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    private zzfy zzd;

    protected zzfl(boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    protected final void zzg(int i) {
        zzfy zzfyVar = this.zzd;
        int i2 = zzet.zza;
        for (int i3 = 0; i3 < this.zzc; i3++) {
            ((zzgu) this.zzb.get(i3)).zza(this, zzfyVar, this.zza, i);
        }
    }

    protected final void zzh() {
        zzfy zzfyVar = this.zzd;
        int i = zzet.zza;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            ((zzgu) this.zzb.get(i2)).zzb(this, zzfyVar, this.zza);
        }
        this.zzd = null;
    }

    protected final void zzi(zzfy zzfyVar) {
        for (int i = 0; i < this.zzc; i++) {
            ((zzgu) this.zzb.get(i)).zzc(this, zzfyVar, this.zza);
        }
    }

    protected final void zzj(zzfy zzfyVar) {
        this.zzd = zzfyVar;
        for (int i = 0; i < this.zzc; i++) {
            ((zzgu) this.zzb.get(i)).zzd(this, zzfyVar, this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfs
    public final void zzf(zzgu zzguVar) {
        zzguVar.getClass();
        if (this.zzb.contains(zzguVar)) {
            return;
        }
        this.zzb.add(zzguVar);
        this.zzc++;
    }
}
