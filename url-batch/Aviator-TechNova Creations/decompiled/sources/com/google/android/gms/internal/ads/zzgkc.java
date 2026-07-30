package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzgkc implements zzgjf {
    private final zzgmu zza;
    private final zzgmg zzb;
    private final ExecutorService zzc;
    private final zzgmz zzd;
    private final zzgoe zze;
    private final Object zzf = new Object();
    private final String zzg;
    private final long zzh;
    private final long zzi;
    private zzgkb zzj;

    zzgkc(zzikv zzikvVar, zzgmu zzgmuVar, zzgmg zzgmgVar, zzgmz zzgmzVar, zzgoe zzgoeVar, zzgbf zzgbfVar, ExecutorService executorService) {
        this.zza = zzgmuVar;
        this.zzb = zzgmgVar;
        this.zzc = executorService;
        this.zzd = zzgmzVar;
        this.zze = zzgoeVar;
        this.zzg = zzgbfVar.zzb();
        this.zzh = zzgbfVar.zzk();
        this.zzi = zzgbfVar.zzj();
    }

    private final String zzq(Map map) throws zzatt, zzatp {
        String zzb;
        zzgoe zzgoeVar = this.zze;
        try {
            zzgoeVar.zza(20110).zza();
            synchronized (this.zzf) {
                zzgkb zzgkbVar = this.zzj;
                if (zzgkbVar == null) {
                    zzgoeVar.zzb(20109);
                    zzb = "";
                } else {
                    zzb = zzgkbVar.zzb(map);
                }
            }
            return zzb;
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final String zza() {
        synchronized (this.zzf) {
            zzgkb zzgkbVar = this.zzj;
            if (zzgkbVar == null) {
                return "3.825731049.-1";
            }
            return zzgkbVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final ListenableFuture zzb() {
        zzgzg zzw = zzgzg.zzw(this.zzb.zzb());
        zzgka zzgkaVar = zzgka.zza;
        ExecutorService executorService = this.zzc;
        return (zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzg(zzw, Throwable.class, zzgkaVar, executorService), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgjs
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgkc.this.zzi((zzgdu) obj);
            }
        }, executorService);
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final ListenableFuture zzc(final Context context) {
        return zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgjt
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzgkc.this.zzj(context);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final ListenableFuture zzd(final Context context, String str, final View view, final Activity activity) {
        final String str2 = null;
        return zzgzo.zzd(new Callable(context, str2, view, activity) { // from class: com.google.android.gms.internal.ads.zzgju
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ View zzc;
            private final /* synthetic */ Activity zzd;

            {
                this.zzc = view;
                this.zzd = activity;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzgkc.this.zzk(this.zzb, null, this.zzc, this.zzd);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final ListenableFuture zze(final Context context, final String str, final View view, Activity activity) {
        final Activity activity2 = null;
        return zzgzo.zzd(new Callable(context, str, view, activity2) { // from class: com.google.android.gms.internal.ads.zzgjv
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ String zzc;
            private final /* synthetic */ View zzd;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzgkc.this.zzl(this.zzb, this.zzc, this.zzd, null);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final void zzf(InputEvent inputEvent) {
        try {
            synchronized (this.zzf) {
                zzgkb zzgkbVar = this.zzj;
                if (zzgkbVar != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("evt", inputEvent);
                    zzgkbVar.zzc(hashMap);
                } else {
                    this.zze.zzb(20105);
                }
            }
        } catch (zzatp | zzatt e) {
            this.zze.zzd(20104, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final int zzg() {
        return 4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzh(Map map) {
        String str;
        zzgoc zza;
        String str2;
        map.put("v", this.zzg);
        ListenableFuture listenableFuture = (ListenableFuture) map.get("gs");
        ListenableFuture listenableFuture2 = (ListenableFuture) map.get("ai");
        byte[] bArr = null;
        long j = -1;
        if (listenableFuture != null) {
            zza = this.zze.zza(20107);
            try {
                try {
                    zza.zza();
                    zzaxg zzaxgVar = (zzaxg) listenableFuture.get(this.zzi, TimeUnit.MILLISECONDS);
                    if (zzaxgVar != null) {
                        bArr = zzaxgVar.zzh().zzaN();
                        str = zzaxgVar.zzb().length() > 1 ? zzaxgVar.zzb() : ExifInterface.LONGITUDE_EAST;
                        try {
                            if (zzaxgVar.zzc()) {
                                j = zzaxgVar.zzd();
                            }
                        } catch (ClassCastException e) {
                            e = e;
                            zza.zzb(e);
                            zza.zzc();
                            if (str.equals(ExifInterface.LONGITUDE_EAST)) {
                            }
                            map.put("int", str);
                            if (bArr != null) {
                            }
                            map.put("gv", Long.valueOf(j));
                        } catch (InterruptedException e2) {
                            e = e2;
                            zza.zzb(e);
                            zza.zzc();
                            if (str.equals(ExifInterface.LONGITUDE_EAST)) {
                            }
                            map.put("int", str);
                            if (bArr != null) {
                            }
                            map.put("gv", Long.valueOf(j));
                        } catch (ExecutionException e3) {
                            e = e3;
                            Throwable cause = e.getCause();
                            if (cause != null) {
                                e = cause;
                            }
                            zza.zzb(e);
                            zza.zzc();
                            if (str.equals(ExifInterface.LONGITUDE_EAST)) {
                            }
                            map.put("int", str);
                            if (bArr != null) {
                            }
                            map.put("gv", Long.valueOf(j));
                        } catch (TimeoutException e4) {
                            e = e4;
                            zza.zzb(e);
                            zza.zzc();
                            if (str.equals(ExifInterface.LONGITUDE_EAST)) {
                            }
                            map.put("int", str);
                            if (bArr != null) {
                            }
                            map.put("gv", Long.valueOf(j));
                        }
                    } else {
                        str = ExifInterface.LONGITUDE_EAST;
                    }
                } finally {
                }
            } catch (ClassCastException e5) {
                e = e5;
                str = ExifInterface.LONGITUDE_EAST;
                zza.zzb(e);
                zza.zzc();
                if (str.equals(ExifInterface.LONGITUDE_EAST)) {
                    zza = this.zze.zza(20108);
                    try {
                        try {
                            zza.zza();
                            str2 = (String) listenableFuture2.get(this.zzh, TimeUnit.MILLISECONDS);
                            if (true != zzgrt.zzc(str2)) {
                            }
                        } catch (ClassCastException e6) {
                            e = e6;
                            zza.zzb(e);
                        } catch (InterruptedException e7) {
                            e = e7;
                            zza.zzb(e);
                        } catch (ExecutionException e8) {
                            e = e8;
                            Throwable cause2 = e.getCause();
                            if (cause2 != null) {
                                e = cause2;
                            }
                            zza.zzb(e);
                        } catch (TimeoutException e9) {
                            e = e9;
                            zza.zzb(e);
                        }
                    } finally {
                    }
                }
                map.put("int", str);
                if (bArr != null) {
                }
                map.put("gv", Long.valueOf(j));
            } catch (InterruptedException e10) {
                e = e10;
                str = ExifInterface.LONGITUDE_EAST;
                zza.zzb(e);
                zza.zzc();
                if (str.equals(ExifInterface.LONGITUDE_EAST)) {
                }
                map.put("int", str);
                if (bArr != null) {
                }
                map.put("gv", Long.valueOf(j));
            } catch (ExecutionException e11) {
                e = e11;
                str = ExifInterface.LONGITUDE_EAST;
            } catch (TimeoutException e12) {
                e = e12;
                str = ExifInterface.LONGITUDE_EAST;
                zza.zzb(e);
                zza.zzc();
                if (str.equals(ExifInterface.LONGITUDE_EAST)) {
                }
                map.put("int", str);
                if (bArr != null) {
                }
                map.put("gv", Long.valueOf(j));
            }
            zza.zzc();
        } else {
            str = ExifInterface.LONGITUDE_EAST;
        }
        if (str.equals(ExifInterface.LONGITUDE_EAST) && listenableFuture2 != null) {
            zza = this.zze.zza(20108);
            zza.zza();
            str2 = (String) listenableFuture2.get(this.zzh, TimeUnit.MILLISECONDS);
            if (true != zzgrt.zzc(str2)) {
                str = str2;
            }
        }
        map.put("int", str);
        if (bArr != null) {
            map.put("att", bArr);
        }
        map.put("gv", Long.valueOf(j));
    }

    final /* synthetic */ ListenableFuture zzi(zzgdu zzgduVar) {
        if (this.zza.zzb(zzgduVar)) {
            return zzgzo.zzk(this.zzb.zze(), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgjw
                @Override // com.google.android.gms.internal.ads.zzgqt
                public final /* synthetic */ Object apply(Object obj) {
                    zzgkc.this.zzm((byte[]) obj);
                    return null;
                }
            }, zzhaf.zza());
        }
        this.zze.zzb(20103);
        throw new zzgjg(1);
    }

    final /* synthetic */ String zzj(final Context context) {
        final HashMap hashMap = new HashMap();
        this.zze.zzf(20106, new Runnable() { // from class: com.google.android.gms.internal.ads.zzgjx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgkc.this.zzn(hashMap, context);
            }
        });
        String zzq = zzq(hashMap);
        hashMap.clear();
        return zzq;
    }

    final /* synthetic */ String zzk(final Context context, String str, final View view, final Activity activity) {
        final HashMap hashMap = new HashMap();
        final String str2 = null;
        this.zze.zzf(20106, new Runnable(hashMap, context, view, activity, str2) { // from class: com.google.android.gms.internal.ads.zzgjy
            private final /* synthetic */ Map zzb;
            private final /* synthetic */ Context zzc;
            private final /* synthetic */ View zzd;
            private final /* synthetic */ Activity zze;

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgkc.this.zzo(this.zzb, this.zzc, this.zzd, this.zze, null);
            }
        });
        String zzq = zzq(hashMap);
        hashMap.clear();
        return zzq;
    }

    final /* synthetic */ String zzl(final Context context, final String str, final View view, Activity activity) {
        final HashMap hashMap = new HashMap();
        final Activity activity2 = null;
        this.zze.zzf(20106, new Runnable(hashMap, context, view, activity2, str) { // from class: com.google.android.gms.internal.ads.zzgjz
            private final /* synthetic */ Map zzb;
            private final /* synthetic */ Context zzc;
            private final /* synthetic */ View zzd;
            private final /* synthetic */ String zze;

            {
                this.zze = str;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgkc.this.zzp(this.zzb, this.zzc, this.zzd, null, this.zze);
            }
        });
        String zzq = zzq(hashMap);
        hashMap.clear();
        return zzq;
    }

    final /* synthetic */ Void zzm(byte[] bArr) {
        zzatr zzc = zzgkf.zzc();
        zzgoc zza = this.zze.zza(20102);
        try {
            try {
                zza.zza();
                synchronized (this.zzf) {
                    this.zzj = zzgkb.zza(zzc, bArr);
                }
                zza.zzc();
                return null;
            } catch (zzatp e) {
                e = e;
                zza.zzb(e);
                throw new zzgjg(2, e);
            } catch (zzatt e2) {
                e = e2;
                zza.zzb(e);
                throw new zzgjg(2, e);
            } catch (Throwable th) {
                zza.zzb(th);
                throw th;
            }
        } catch (Throwable th2) {
            zza.zzc();
            throw th2;
        }
    }

    final /* synthetic */ void zzn(Map map, Context context) {
        map.putAll(this.zzd.zzb());
        zzh(map);
        map.put("f", "q");
        map.put("ctx", context);
    }

    final /* synthetic */ void zzo(Map map, Context context, View view, Activity activity, String str) {
        map.putAll(this.zzd.zzc(context, view));
        zzh(map);
        map.put("f", "v");
        map.put("ctx", context);
        map.put(ViewHierarchyConstants.VIEW_KEY, view);
        map.put("act", activity);
        map.put("bds", null);
    }

    final /* synthetic */ void zzp(Map map, Context context, View view, Activity activity, String str) {
        map.putAll(this.zzd.zzd());
        zzh(map);
        map.put("f", "c");
        map.put("ctx", context);
        map.put(ViewHierarchyConstants.VIEW_KEY, view);
        map.put("act", null);
        map.put("bds", str);
    }
}
