package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzgk implements zzgq {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    private zzgv zzd;

    protected zzgk(boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    protected final void zzg(int i) {
        zzgv zzgvVar = this.zzd;
        int i2 = zzfs.zza;
        for (int i3 = 0; i3 < this.zzc; i3++) {
            ((zzhs) this.zzb.get(i3)).zza(this, zzgvVar, this.zza, i);
        }
    }

    protected final void zzh() {
        zzgv zzgvVar = this.zzd;
        int i = zzfs.zza;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            ((zzhs) this.zzb.get(i2)).zzb(this, zzgvVar, this.zza);
        }
        this.zzd = null;
    }

    protected final void zzi(zzgv zzgvVar) {
        for (int i = 0; i < this.zzc; i++) {
            ((zzhs) this.zzb.get(i)).zzc(this, zzgvVar, this.zza);
        }
    }

    protected final void zzj(zzgv zzgvVar) {
        this.zzd = zzgvVar;
        for (int i = 0; i < this.zzc; i++) {
            ((zzhs) this.zzb.get(i)).zzd(this, zzgvVar, this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgq
    public final void zzf(zzhs zzhsVar) {
        zzhsVar.getClass();
        if (this.zzb.contains(zzhsVar)) {
            return;
        }
        this.zzb.add(zzhsVar);
        this.zzc++;
    }
}
