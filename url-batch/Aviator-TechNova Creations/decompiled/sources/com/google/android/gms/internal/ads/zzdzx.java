package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzdzx implements zzdzi {
    private final long zza;
    private final zzdzm zzb;
    private final zzfii zzc;

    zzdzx(long j, Context context, zzdzm zzdzmVar, zzcma zzcmaVar, String str) {
        this.zza = j;
        this.zzb = zzdzmVar;
        zzfik zzq = zzcmaVar.zzq();
        zzq.zzc(context);
        zzq.zzb(str);
        this.zzc = zzq.zza().zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdzi
    public final void zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        try {
            this.zzc.zzc(zzmVar, new zzdzv(this));
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdzi
    public final void zzb() {
        try {
            zzfii zzfiiVar = this.zzc;
            zzfiiVar.zze(new zzdzw(this));
            zzfiiVar.zzb(ObjectWrapper.wrap(null));
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdzi
    public final void zzc() {
    }

    final /* synthetic */ long zzd() {
        return this.zza;
    }

    final /* synthetic */ zzdzm zze() {
        return this.zzb;
    }
}
