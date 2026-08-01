package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import androidx.privacysandbox.ads.adservices.topics.Topic;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzevn implements zzeuy {
    private final com.google.android.gms.ads.internal.util.zzg zza;
    private final Context zzb;
    private final zzgbl zzc;
    private final ScheduledExecutorService zzd;
    private final zzeft zze;
    private final zzfeq zzf;

    zzevn(com.google.android.gms.ads.internal.util.zzg zzgVar, Context context, zzgbl zzgblVar, ScheduledExecutorService scheduledExecutorService, zzeft zzeftVar, zzfeq zzfeqVar) {
        this.zza = zzgVar;
        this.zzb = context;
        this.zzc = zzgblVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzeftVar;
        this.zzf = zzfeqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 56;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r5.zzf.zzd.zzy != com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED.getValue()) goto L10;
     */
    @Override // com.google.android.gms.internal.ads.zzeuy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ListenableFuture zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjJ)).booleanValue() && this.zza.zzR()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjM)).booleanValue()) {
            }
            return zzgbb.zzf(zzgbb.zzn(zzgas.zzu(zzgbb.zzo(this.zze.zza(false), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjK)).intValue(), TimeUnit.MILLISECONDS, this.zzd)), new zzgai() { // from class: com.google.android.gms.internal.ads.zzevl
                @Override // com.google.android.gms.internal.ads.zzgai
                public final ListenableFuture zza(Object obj) {
                    zzhae zza2 = zzhaf.zza();
                    for (Topic topic : ((GetTopicsResponse) obj).getTopics()) {
                        zzhac zza3 = zzhad.zza();
                        zza3.zzc(topic.getTopicId());
                        zza3.zza(topic.getModelVersion());
                        zza3.zzb(topic.getTaxonomyVersion());
                        zza2.zza((zzhad) zza3.zzal());
                    }
                    return zzgbb.zzh(new zzevp(Base64.encodeToString(((zzhaf) zza2.zzal()).zzax(), 1), 1, null));
                }
            }, this.zzc), Throwable.class, new zzgai() { // from class: com.google.android.gms.internal.ads.zzevm
                @Override // com.google.android.gms.internal.ads.zzgai
                public final ListenableFuture zza(Object obj) {
                    return zzevn.this.zzc((Throwable) obj);
                }
            }, this.zzc);
        }
        return zzgbb.zzh(new zzevp("", -1, null));
    }

    final /* synthetic */ ListenableFuture zzc(Throwable th) throws Exception {
        zzbus.zza(this.zzb).zzf(th, "TopicsSignal.fetchTopicsSignal");
        return zzgbb.zzh(th instanceof SecurityException ? new zzevp("", 2, null) : th instanceof IllegalStateException ? new zzevp("", 3, null) : th instanceof IllegalArgumentException ? new zzevp("", 4, null) : th instanceof TimeoutException ? new zzevp("", 5, null) : new zzevp("", 0, null));
    }
}
