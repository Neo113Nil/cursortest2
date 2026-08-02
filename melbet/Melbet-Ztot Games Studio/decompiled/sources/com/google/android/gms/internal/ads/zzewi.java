package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import androidx.privacysandbox.ads.adservices.topics.Topic;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzewi implements zzevo {
    private final com.google.android.gms.ads.internal.util.zzg zza;
    private final Context zzb;
    private final zzgcu zzc;
    private final ScheduledExecutorService zzd;
    private final zzeer zze;
    private final zzffg zzf;
    private final VersionInfoParcel zzg;

    zzewi(com.google.android.gms.ads.internal.util.zzg zzgVar, Context context, zzgcu zzgcuVar, ScheduledExecutorService scheduledExecutorService, zzeer zzeerVar, zzffg zzffgVar, VersionInfoParcel versionInfoParcel) {
        this.zza = zzgVar;
        this.zzb = context;
        this.zzc = zzgcuVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzeerVar;
        this.zzf = zzffgVar;
        this.zzg = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 56;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009e, code lost:
    
        if (java.util.Arrays.asList(r0.split(",")).contains(r5.zzb.getPackageName()) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r5.zzf.zzd.zzy != com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED.getValue()) goto L10;
     */
    @Override // com.google.android.gms.internal.ads.zzevo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ListenableFuture zzb() {
        ListenableFuture zzg;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjz)).booleanValue() && this.zza.zzT()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjD)).booleanValue()) {
            }
            if (this.zzg.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjx)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjy)).intValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjv)).booleanValue()) {
                        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjw);
                        if (!TextUtils.isEmpty(str)) {
                        }
                    }
                    try {
                        zzg = zzgcj.zzo(this.zze.zza(false), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjB)).intValue(), TimeUnit.MILLISECONDS, this.zzd);
                    } catch (Exception e) {
                        zzg = zzgcj.zzg(e);
                    }
                    return zzgcj.zzo(zzgcj.zzf(zzgcj.zzn(zzgca.zzu(zzg), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzewg
                        @Override // com.google.android.gms.internal.ads.zzgbq
                        public final ListenableFuture zza(Object obj) {
                            GetTopicsResponse getTopicsResponse = (GetTopicsResponse) obj;
                            if (getTopicsResponse == null) {
                                return zzgcj.zzh(new zzewk("", 1, null));
                            }
                            zzhbn zzc = zzhbo.zzc();
                            for (Topic topic : getTopicsResponse.getTopics()) {
                                zzhbl zzc2 = zzhbm.zzc();
                                zzc2.zzc(topic.getTopicId());
                                zzc2.zza(topic.getModelVersion());
                                zzc2.zzb(topic.getTaxonomyVersion());
                                zzc.zza((zzhbm) zzc2.zzbr());
                            }
                            return zzgcj.zzh(new zzewk(Base64.encodeToString(((zzhbo) zzc.zzbr()).zzaV(), 1), 1, null));
                        }
                    }, this.zzc), Throwable.class, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzewh
                        @Override // com.google.android.gms.internal.ads.zzgbq
                        public final ListenableFuture zza(Object obj) {
                            return zzewi.this.zzc((Throwable) obj);
                        }
                    }, this.zzc), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjB)).intValue(), TimeUnit.MILLISECONDS, this.zzd);
                }
            }
        }
        return zzgcj.zzh(new zzewk("", -1, null));
    }

    final /* synthetic */ ListenableFuture zzc(final Throwable th) throws Exception {
        this.zzc.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzewf
            @Override // java.lang.Runnable
            public final void run() {
                boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjA)).booleanValue();
                Throwable th2 = th;
                if (booleanValue) {
                    com.google.android.gms.ads.internal.zzu.zzo().zzx(th2, "TopicsSignalUnsampled.fetchTopicsSignal");
                } else {
                    com.google.android.gms.ads.internal.zzu.zzo().zzv(th2, "TopicsSignal.fetchTopicsSignal");
                }
            }
        });
        return zzgcj.zzh(th instanceof SecurityException ? new zzewk("", 2, null) : th instanceof IllegalStateException ? new zzewk("", 3, null) : th instanceof IllegalArgumentException ? new zzewk("", 4, null) : th instanceof TimeoutException ? new zzewk("", 5, null) : new zzewk("", 0, null));
    }
}
