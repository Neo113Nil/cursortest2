package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zztl implements zzum {
    private final ArrayList zza = new ArrayList(1);
    private final HashSet zzb = new HashSet(1);
    private final zzut zzc = new zzut();
    private final zzrl zzd = new zzrl();
    private Looper zze;
    private zzda zzf;
    private zzov zzg;

    @Override // com.google.android.gms.internal.ads.zzum
    public /* synthetic */ zzda zzM() {
        return null;
    }

    protected final zzov zzb() {
        zzov zzovVar = this.zzg;
        zzef.zzb(zzovVar);
        return zzovVar;
    }

    protected final zzrl zzc(zzuk zzukVar) {
        return this.zzd.zza(0, zzukVar);
    }

    protected final zzrl zzd(int i, zzuk zzukVar) {
        return this.zzd.zza(0, zzukVar);
    }

    protected final zzut zze(zzuk zzukVar) {
        return this.zzc.zza(0, zzukVar);
    }

    protected final zzut zzf(int i, zzuk zzukVar) {
        return this.zzc.zza(0, zzukVar);
    }

    @Override // com.google.android.gms.internal.ads.zzum
    public final void zzg(Handler handler, zzrm zzrmVar) {
        this.zzd.zzb(handler, zzrmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzum
    public final void zzh(Handler handler, zzuu zzuuVar) {
        this.zzc.zzb(handler, zzuuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzum
    public final void zzi(zzul zzulVar) {
        boolean z = !this.zzb.isEmpty();
        this.zzb.remove(zzulVar);
        if (z && this.zzb.isEmpty()) {
            zzj();
        }
    }

    protected void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzum
    public final void zzk(zzul zzulVar) {
        this.zze.getClass();
        HashSet hashSet = this.zzb;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(zzulVar);
        if (isEmpty) {
            zzl();
        }
    }

    protected void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzum
    public final void zzm(zzul zzulVar, zzhs zzhsVar, zzov zzovVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z = true;
        if (looper != null && looper != myLooper) {
            z = false;
        }
        zzef.zzd(z);
        this.zzg = zzovVar;
        zzda zzdaVar = this.zzf;
        this.zza.add(zzulVar);
        if (this.zze == null) {
            this.zze = myLooper;
            this.zzb.add(zzulVar);
            zzn(zzhsVar);
        } else if (zzdaVar != null) {
            zzk(zzulVar);
            zzulVar.zza(this, zzdaVar);
        }
    }

    protected abstract void zzn(zzhs zzhsVar);

    protected final void zzo(zzda zzdaVar) {
        this.zzf = zzdaVar;
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zzul) arrayList.get(i)).zza(this, zzdaVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzum
    public final void zzp(zzul zzulVar) {
        this.zza.remove(zzulVar);
        if (!this.zza.isEmpty()) {
            zzi(zzulVar);
            return;
        }
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
        this.zzb.clear();
        zzq();
    }

    protected abstract void zzq();

    @Override // com.google.android.gms.internal.ads.zzum
    public final void zzr(zzrm zzrmVar) {
        this.zzd.zzc(zzrmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzum
    public final void zzs(zzuu zzuuVar) {
        this.zzc.zzh(zzuuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzum
    public /* synthetic */ void zzt(zzbs zzbsVar) {
        throw null;
    }

    protected final boolean zzu() {
        return !this.zzb.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zzum
    public /* synthetic */ boolean zzv() {
        return true;
    }
}
