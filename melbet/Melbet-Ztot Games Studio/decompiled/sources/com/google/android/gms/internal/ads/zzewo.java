package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzewo implements zzevo {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzbyv zzg;

    zzewo(zzbyv zzbyvVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z, boolean z2) {
        this.zzg = zzbyvVar;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i;
        this.zze = z;
        this.zzf = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 40;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final ListenableFuture zzb() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzaL)).booleanValue()) {
            return zzgcj.zzg(new Exception("Did not ad Ad ID into query param."));
        }
        return zzgcj.zze((zzgca) zzgcj.zzo(zzgcj.zzm(zzgca.zzu(this.zzg.zza(this.zza, this.zzd)), new zzful() { // from class: com.google.android.gms.internal.ads.zzewm
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                return zzewo.this.zzc((AdvertisingIdClient.Info) obj);
            }
        }, this.zzc), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzaM)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzful() { // from class: com.google.android.gms.internal.ads.zzewn
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                return zzewo.this.zzd((Throwable) obj);
            }
        }, this.zzc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0067, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        com.google.android.gms.ads.internal.zzu.zzo().zzw(r0, "AdIdInfoSignalSource.getPaidV1");
        r0 = new com.google.android.gms.internal.ads.zzfry();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbbw.zzcM)).booleanValue() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbbw.zzcL)).booleanValue() == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:
    
        r0 = com.google.android.gms.internal.ads.zzfsb.zzj(r7.zza).zzi((java.lang.String) java.util.Objects.requireNonNull(((com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) java.util.Objects.requireNonNull(r8)).getId()), r7.zza.getPackageName(), ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbbw.zzcR)).longValue(), r7.zzf);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ zzewp zzc(AdvertisingIdClient.Info info) {
        zzfry zzfryVar = new zzfry();
        if (!this.zze) {
        }
        if (this.zze) {
        }
        return new zzewp(info, null, zzfryVar);
    }

    final /* synthetic */ zzewp zzd(Throwable th) {
        com.google.android.gms.ads.internal.client.zzay.zzb();
        ContentResolver contentResolver = this.zza.getContentResolver();
        return new zzewp(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new zzfry());
    }
}
