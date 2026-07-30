package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzfbw implements zzfax {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzcdm zzg;

    zzfbw(zzcdm zzcdmVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z, boolean z2) {
        this.zzg = zzcdmVar;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i;
        this.zze = z;
        this.zzf = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        zzgzg zzw = zzgzg.zzw(this.zzg.zza(this.zza, this.zzd));
        zzgqt zzgqtVar = new zzgqt() { // from class: com.google.android.gms.internal.ads.zzfbv
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return zzfbw.this.zzc((AdvertisingIdClient.Info) obj);
            }
        };
        Executor executor = this.zzc;
        return (zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzi((zzgzg) zzgzo.zzk(zzw, zzgqtVar, executor), ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbC)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzfbu
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return zzfbw.this.zzd((Throwable) obj);
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 40;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbhe.zzdX)).booleanValue() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbhe.zzdW)).booleanValue() == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ zzfbx zzc(AdvertisingIdClient.Info info) {
        zzgah zzgahVar = new zzgah();
        if (this.zze) {
        }
        try {
            Context context = this.zza;
            zzgahVar = zzgal.zzh(context).zzj((String) Objects.requireNonNull(((AdvertisingIdClient.Info) Objects.requireNonNull(info)).getId()), context.getPackageName(), ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzec)).longValue(), this.zzf);
        } catch (IOException | IllegalArgumentException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdIdInfoSignalSource.getPaidV1");
            zzgahVar = new zzgah();
        }
        return new zzfbx(info, null, zzgahVar);
    }

    final /* synthetic */ zzfbx zzd(Throwable th) {
        com.google.android.gms.ads.internal.client.zzbb.zza();
        ContentResolver contentResolver = this.zza.getContentResolver();
        return new zzfbx(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new zzgah());
    }
}
