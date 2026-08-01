package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzevt implements zzeuy {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzcan zzg;

    zzevt(zzcan zzcanVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z, boolean z2) {
        this.zzg = zzcanVar;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i;
        this.zze = z;
        this.zzf = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 40;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzaT)).booleanValue()) {
            return zzgbb.zzg(new Exception("Did not ad Ad ID into query param."));
        }
        return zzgbb.zze((zzgas) zzgbb.zzo(zzgbb.zzm(zzgas.zzu(this.zzg.zza(this.zza, this.zzd)), new zzftn() { // from class: com.google.android.gms.internal.ads.zzevr
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object apply(Object obj) {
                return zzevt.this.zzc((AdvertisingIdClient.Info) obj);
            }
        }, this.zzc), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzaU)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzftn() { // from class: com.google.android.gms.internal.ads.zzevs
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object apply(Object obj) {
                return zzevt.this.zzd((Throwable) obj);
            }
        }, this.zzc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzo().zzw(r0, "AdIdInfoSignalSource.getPaidV1");
        r0 = new com.google.android.gms.internal.ads.zzfqw();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbdc.zzcQ)).booleanValue() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbdc.zzcP)).booleanValue() == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:
    
        r1 = com.google.android.gms.internal.ads.zzfqz.zzj(r7.zza);
        r8.getClass();
        r2 = r8.getId();
        r2.getClass();
        r0 = r1.zzi(r2, r7.zza.getPackageName(), ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbdc.zzcW)).longValue(), r7.zzf);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ zzevu zzc(AdvertisingIdClient.Info info) {
        zzfqw zzfqwVar = new zzfqw();
        if (!this.zze) {
        }
        if (this.zze) {
        }
        return new zzevu(info, null, zzfqwVar);
    }

    final /* synthetic */ zzevu zzd(Throwable th) {
        com.google.android.gms.ads.internal.client.zzay.zzb();
        ContentResolver contentResolver = this.zza.getContentResolver();
        return new zzevu(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new zzfqw());
    }
}
