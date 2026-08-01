package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcca {
    public static final zzgbl zza;
    public static final zzgbl zzb;
    public static final zzgbl zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzgbl zze;
    public static final zzgbl zzf;

    static {
        Executor threadPoolExecutor;
        Executor executor;
        Executor executor2;
        if (ClientLibraryUtils.isPackageSide()) {
            zzfqu.zza();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzcbw("Default")));
        } else {
            threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzcbw("Default"));
        }
        zzcby zzcbyVar = null;
        zza = new zzcbz(threadPoolExecutor, zzcbyVar);
        if (ClientLibraryUtils.isPackageSide()) {
            executor = zzfqu.zza().zzc(5, new zzcbw("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcbw("Loader"));
            threadPoolExecutor2.allowCoreThreadTimeOut(true);
            executor = threadPoolExecutor2;
        }
        zzb = new zzcbz(executor, zzcbyVar);
        if (ClientLibraryUtils.isPackageSide()) {
            executor2 = zzfqu.zza().zzb(new zzcbw("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcbw("Activeview"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executor2 = threadPoolExecutor3;
        }
        zzc = new zzcbz(executor2, zzcbyVar);
        zzd = new zzcbv(3, new zzcbw("Schedule"));
        zze = new zzcbz(new zzcbx(), zzcbyVar);
        zzf = new zzcbz(zzgbr.zzb(), zzcbyVar);
    }
}
