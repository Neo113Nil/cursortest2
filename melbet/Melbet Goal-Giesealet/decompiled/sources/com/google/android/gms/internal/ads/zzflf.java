package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzflf extends zzflb {
    public zzflf(ClientApi clientApi, Context context, int i, zzfdy zzfdyVar, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfkf zzfkfVar, Clock clock) {
        super(clientApi, context, i, zzfdyVar, zzftVar, zzceVar, scheduledExecutorService, zzfkfVar, clock);
    }

    @Override // com.google.android.gms.internal.ads.zzflb
    protected final ListenableFuture zza(Context context) {
        zzbox zzd = this.zzd.zzd();
        if (zzd == null) {
            return zzgot.zzc(new zzfjx(1, "Failed to create a rewarded ad."));
        }
        zzbwa zzl = this.zza.zzl(ObjectWrapper.wrap(context), this.zze.zza, zzd, this.zzc);
        if (zzl == null) {
            return zzgot.zzc(new zzfjx(1, "Failed to create a rewarded ad."));
        }
        zzgpm zze = zzgpm.zze();
        try {
            zzs(this.zze.zzc);
            zzl.zzc(this.zze.zzc, new zzfle(this, zze, zzl));
            return zze;
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to load rewarded ad.");
            return zzgot.zzc(new zzfjx(1, "remote exception"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzflb
    protected final /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzea zzb(Object obj) {
        try {
            return ((zzbwa) obj).zzm();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get response info for the rewarded ad.", e);
            return null;
        }
    }

    public zzflf(String str, ClientApi clientApi, Context context, int i, zzfdy zzfdyVar, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzch zzchVar, ScheduledExecutorService scheduledExecutorService, zzfkf zzfkfVar, Clock clock) {
        super(str, clientApi, context, i, zzfdyVar, zzftVar, zzchVar, scheduledExecutorService, zzfkfVar, clock);
    }
}
