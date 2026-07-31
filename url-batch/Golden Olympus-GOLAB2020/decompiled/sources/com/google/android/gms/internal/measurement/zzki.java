package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class zzki {
    public static final /* synthetic */ int zzc = 0;
    private static final Object zzd = new Object();
    private static volatile zzkg zze = null;
    private static volatile boolean zzf = false;
    private static final AtomicInteger zzg;
    final zzkf zza;
    final String zzb;
    private Object zzh;
    private volatile int zzi = -1;
    private volatile Object zzj;
    private volatile boolean zzk;

    static {
        new AtomicReference();
        Preconditions.checkNotNull(new Object() { // from class: com.google.android.gms.internal.measurement.zzka
        }, "BuildInfo must be non-null");
        zzg = new AtomicInteger();
    }

    /* synthetic */ zzki(zzkf zzkfVar, String str, Object obj, boolean z4, zzkh zzkhVar) {
        if (zzkfVar.zza == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zza = zzkfVar;
        this.zzb = str;
        this.zzh = obj;
        this.zzk = false;
    }

    public static void zzc() {
        zzg.incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004c, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void zzd(final Context context) {
        if (zze != null || context == null) {
            return;
        }
        Object obj = zzd;
        synchronized (obj) {
            try {
                if (zze == null) {
                    synchronized (obj) {
                        zzkg zzkgVar = zze;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (zzkgVar != null) {
                            if (zzkgVar.zza() != context) {
                            }
                        }
                        if (zzkgVar != null) {
                            zzjm.zze();
                            zzkk.zzd();
                            zzju.zze();
                        }
                        zze = new zzjj(context, Suppliers.memoize(new Supplier() { // from class: com.google.android.gms.internal.measurement.zzjz
                            @Override // com.google.common.base.Supplier
                            public final Object get() {
                                int i4 = zzki.zzc;
                                return zzjv.zza(context);
                            }
                        }));
                        zzg.incrementAndGet();
                    }
                }
            } finally {
            }
        }
    }

    abstract Object zza(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001e, B:13:0x0034, B:16:0x0050, B:18:0x005b, B:20:0x0065, B:22:0x008e, B:24:0x0096, B:27:0x00bd, B:30:0x00c5, B:31:0x00c8, B:32:0x00cc, B:33:0x009f, B:35:0x00a3, B:37:0x00b3, B:39:0x00b9, B:43:0x0079, B:46:0x00d0), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001e, B:13:0x0034, B:16:0x0050, B:18:0x005b, B:20:0x0065, B:22:0x008e, B:24:0x0096, B:27:0x00bd, B:30:0x00c5, B:31:0x00c8, B:32:0x00cc, B:33:0x009f, B:35:0x00a3, B:37:0x00b3, B:39:0x00b9, B:43:0x0079, B:46:0x00d0), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001e, B:13:0x0034, B:16:0x0050, B:18:0x005b, B:20:0x0065, B:22:0x008e, B:24:0x0096, B:27:0x00bd, B:30:0x00c5, B:31:0x00c8, B:32:0x00cc, B:33:0x009f, B:35:0x00a3, B:37:0x00b3, B:39:0x00b9, B:43:0x0079, B:46:0x00d0), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb() {
        String str;
        Object zza;
        String zzb;
        Object zzb2;
        int i4 = zzg.get();
        if (this.zzi < i4) {
            synchronized (this) {
                try {
                    if (this.zzi < i4) {
                        zzkg zzkgVar = zze;
                        Optional absent = Optional.absent();
                        Object obj = null;
                        if (zzkgVar != null && zzkgVar.zzb() != null) {
                            absent = (Optional) ((Supplier) Preconditions.checkNotNull(zzkgVar.zzb())).get();
                            if (absent.isPresent()) {
                                zzjo zzjoVar = (zzjo) absent.get();
                                zzkf zzkfVar = this.zza;
                                str = zzjoVar.zza(zzkfVar.zza, null, zzkfVar.zzc, this.zzb);
                                Preconditions.checkState(zzkgVar == null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                                zzkf zzkfVar2 = this.zza;
                                Uri uri = zzkfVar2.zza;
                                zzjr zza2 = uri == null ? zzjw.zza(zzkgVar.zza(), uri) ? zzjm.zza(zzkgVar.zza().getContentResolver(), uri, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzjy
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zzki.zzc();
                                    }
                                }) : null : zzkk.zza(zzkgVar.zza(), (String) Preconditions.checkNotNull(null), new Runnable() { // from class: com.google.android.gms.internal.measurement.zzjy
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zzki.zzc();
                                    }
                                });
                                zza = (zza2 != null || (zzb2 = zza2.zzb(this.zzb)) == null) ? null : zza(zzb2);
                                if (zza == null) {
                                    if (!zzkfVar2.zzd && (zzb = zzju.zza(zzkgVar.zza()).zzb(this.zzb)) != null) {
                                        obj = zza(zzb);
                                    }
                                    zza = obj == null ? this.zzh : obj;
                                }
                                if (absent.isPresent()) {
                                    zza = str == null ? this.zzh : zza(str);
                                }
                                this.zzj = zza;
                                this.zzi = i4;
                            }
                        }
                        str = null;
                        Preconditions.checkState(zzkgVar == null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                        zzkf zzkfVar22 = this.zza;
                        Uri uri2 = zzkfVar22.zza;
                        if (uri2 == null) {
                        }
                        if (zza2 != null) {
                        }
                        if (zza == null) {
                        }
                        if (absent.isPresent()) {
                        }
                        this.zzj = zza;
                        this.zzi = i4;
                    }
                } finally {
                }
            }
        }
        return this.zzj;
    }
}
