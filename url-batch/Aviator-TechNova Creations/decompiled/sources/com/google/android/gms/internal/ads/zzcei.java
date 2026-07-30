package com.google.android.gms.internal.ads;

import androidx.webkit.Profile;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzcei {
    public static final zzgzy zza;
    public static final zzgzy zzb;
    public static final zzgzy zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzgzz zze;
    public static final zzgzy zzf;
    public static final zzgzy zzg;

    static {
        ExecutorService threadPoolExecutor;
        ExecutorService executorService;
        ExecutorService executorService2;
        if (ClientLibraryUtils.isPackageSide()) {
            zzfym.zza();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzcef(Profile.DEFAULT_PROFILE_NAME)));
        } else {
            if (com.google.android.gms.ads.internal.client.zzbd.zzc().zze(zzbhe.zzmK) != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zze(zzbhe.zzmK)).booleanValue()) {
                    if (com.google.android.gms.ads.internal.client.zzbd.zzc().zze(zzbhe.zzmL) != null) {
                        if (com.google.android.gms.ads.internal.client.zzbd.zzc().zze(zzbhe.zzmM) != null) {
                            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zze(zzbhe.zzmL)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zze(zzbhe.zzmL)).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcef(Profile.DEFAULT_PROFILE_NAME));
                            threadPoolExecutor2.allowCoreThreadTimeOut(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zze(zzbhe.zzmM)).booleanValue());
                            threadPoolExecutor = threadPoolExecutor2;
                        }
                    }
                }
            }
            threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzcef(Profile.DEFAULT_PROFILE_NAME));
        }
        zza = new zzceh(threadPoolExecutor, null);
        if (ClientLibraryUtils.isPackageSide()) {
            executorService = zzfym.zza().zza(5, new zzcef("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcef("Loader"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executorService = threadPoolExecutor3;
        }
        zzb = new zzceh(executorService, null);
        if (ClientLibraryUtils.isPackageSide()) {
            executorService2 = zzfym.zza().zzc(new zzcef("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcef("Activeview"));
            threadPoolExecutor4.allowCoreThreadTimeOut(true);
            executorService2 = threadPoolExecutor4;
        }
        zzc = new zzceh(executorService2, null);
        zzcee zzceeVar = new zzcee(3, new zzcef(AppEventsConstants.EVENT_NAME_SCHEDULE));
        zzd = zzceeVar;
        zze = zzhaf.zzc(zzceeVar);
        zzf = new zzceh(new zzceg(), null);
        zzg = new zzceh(zzhaf.zza(), null);
    }
}
