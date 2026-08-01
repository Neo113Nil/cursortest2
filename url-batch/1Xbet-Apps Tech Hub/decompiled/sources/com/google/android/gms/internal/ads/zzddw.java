package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzddw {
    private final Set zza = new HashSet();
    private final Set zzb = new HashSet();
    private final Set zzc = new HashSet();
    private final Set zzd = new HashSet();
    private final Set zze = new HashSet();
    private final Set zzf = new HashSet();
    private final Set zzg = new HashSet();
    private final Set zzh = new HashSet();
    private final Set zzi = new HashSet();
    private final Set zzj = new HashSet();
    private final Set zzk = new HashSet();
    private final Set zzl = new HashSet();
    private final Set zzm = new HashSet();
    private final Set zzn = new HashSet();
    private zzfbi zzo;

    public final zzddw zza(com.google.android.gms.ads.internal.client.zza zzaVar, Executor executor) {
        this.zzc.add(new zzdfw(zzaVar, executor));
        return this;
    }

    public final zzddw zzb(zzcyk zzcykVar, Executor executor) {
        this.zzi.add(new zzdfw(zzcykVar, executor));
        return this;
    }

    public final zzddw zzc(zzcyx zzcyxVar, Executor executor) {
        this.zzl.add(new zzdfw(zzcyxVar, executor));
        return this;
    }

    public final zzddw zzd(zzczb zzczbVar, Executor executor) {
        this.zzf.add(new zzdfw(zzczbVar, executor));
        return this;
    }

    public final zzddw zze(zzcyh zzcyhVar, Executor executor) {
        this.zze.add(new zzdfw(zzcyhVar, executor));
        return this;
    }

    public final zzddw zzf(zzczv zzczvVar, Executor executor) {
        this.zzh.add(new zzdfw(zzczvVar, executor));
        return this;
    }

    public final zzddw zzg(zzdag zzdagVar, Executor executor) {
        this.zzg.add(new zzdfw(zzdagVar, executor));
        return this;
    }

    public final zzddw zzh(com.google.android.gms.ads.internal.overlay.zzo zzoVar, Executor executor) {
        this.zzn.add(new zzdfw(zzoVar, executor));
        return this;
    }

    public final zzddw zzi(zzdas zzdasVar, Executor executor) {
        this.zzm.add(new zzdfw(zzdasVar, executor));
        return this;
    }

    public final zzddw zzj(zzdbc zzdbcVar, Executor executor) {
        this.zzb.add(new zzdfw(zzdbcVar, executor));
        return this;
    }

    public final zzddw zzk(AppEventListener appEventListener, Executor executor) {
        this.zzk.add(new zzdfw(appEventListener, executor));
        return this;
    }

    public final zzddw zzl(zzdge zzdgeVar, Executor executor) {
        this.zzd.add(new zzdfw(zzdgeVar, executor));
        return this;
    }

    public final zzddw zzm(zzfbi zzfbiVar) {
        this.zzo = zzfbiVar;
        return this;
    }

    public final zzddy zzn() {
        return new zzddy(this, null);
    }
}
