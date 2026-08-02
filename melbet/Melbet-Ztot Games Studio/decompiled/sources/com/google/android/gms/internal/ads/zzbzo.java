package com.google.android.gms.internal.ads;

import androidx.webkit.Profile;
import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzbzo {
    public static final zzgcu zza;
    public static final zzgcu zzb;
    public static final zzgcu zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzgcu zze;
    public static final zzgcu zzf;

    static {
        Executor executor;
        Executor executor2;
        Executor executor3;
        if (ClientLibraryUtils.isPackageSide()) {
            zzfrt.zza();
            executor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzbzk(Profile.DEFAULT_PROFILE_NAME)));
        } else {
            if (com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbw.zzkr) != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbw.zzkr)).booleanValue()) {
                    if (com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbw.zzks) != null) {
                        if (com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbw.zzkt) != null) {
                            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbw.zzks)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbw.zzks)).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzbzk(Profile.DEFAULT_PROFILE_NAME));
                            threadPoolExecutor.allowCoreThreadTimeOut(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbw.zzkt)).booleanValue());
                            executor = threadPoolExecutor;
                        }
                    }
                }
            }
            executor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzbzk(Profile.DEFAULT_PROFILE_NAME));
        }
        zzbzm zzbzmVar = null;
        zza = new zzbzn(executor, zzbzmVar);
        if (ClientLibraryUtils.isPackageSide()) {
            executor2 = zzfrt.zza().zzc(5, new zzbzk("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzbzk("Loader"));
            threadPoolExecutor2.allowCoreThreadTimeOut(true);
            executor2 = threadPoolExecutor2;
        }
        zzb = new zzbzn(executor2, zzbzmVar);
        if (ClientLibraryUtils.isPackageSide()) {
            executor3 = zzfrt.zza().zzb(new zzbzk("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzbzk("Activeview"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executor3 = threadPoolExecutor3;
        }
        zzc = new zzbzn(executor3, zzbzmVar);
        zzd = new zzbzj(3, new zzbzk("Schedule"));
        zze = new zzbzn(new zzbzl(), zzbzmVar);
        zzf = new zzbzn(zzgda.zzb(), zzbzmVar);
    }
}
