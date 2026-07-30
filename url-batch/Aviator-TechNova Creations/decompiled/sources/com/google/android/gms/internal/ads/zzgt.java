package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public abstract class zzgt implements zzhb {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    private zzhf zzd;

    protected zzgt(boolean z) {
        this.zza = z;
    }

    protected final void zzf(zzhf zzhfVar) {
        for (int i = 0; i < this.zzc; i++) {
            ((zzhz) this.zzb.get(i)).zza(this, zzhfVar, this.zza);
        }
    }

    protected final void zzg(zzhf zzhfVar) {
        this.zzd = zzhfVar;
        for (int i = 0; i < this.zzc; i++) {
            ((zzhz) this.zzb.get(i)).zzb(this, zzhfVar, this.zza);
        }
    }

    protected final void zzh(int i) {
        zzhf zzhfVar = this.zzd;
        String str = zzfj.zza;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            ((zzhz) this.zzb.get(i2)).zzc(this, zzhfVar, this.zza, i);
        }
    }

    protected final void zzi() {
        zzhf zzhfVar = this.zzd;
        String str = zzfj.zza;
        for (int i = 0; i < this.zzc; i++) {
            ((zzhz) this.zzb.get(i)).zzd(this, zzhfVar, this.zza);
        }
        this.zzd = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zze(zzhz zzhzVar) {
        zzhzVar.getClass();
        ArrayList arrayList = this.zzb;
        if (arrayList.contains(zzhzVar)) {
            return;
        }
        arrayList.add(zzhzVar);
        this.zzc++;
    }
}
