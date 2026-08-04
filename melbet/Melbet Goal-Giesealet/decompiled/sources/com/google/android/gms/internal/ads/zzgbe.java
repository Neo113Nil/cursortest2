package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzgbe implements zzfqb {
    private final Context zza;
    private final zzgcx zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;

    zzgbe(Context context, zzfui zzfuiVar, zzgcx zzgcxVar) {
        this.zza = context;
        this.zzc = zzfuiVar.zzb();
        this.zzd = zzfuiVar.zzj();
        this.zze = zzfuiVar.zzk();
        this.zzb = zzgcxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zza(Map map) {
        String str;
        ListenableFuture listenableFuture;
        zzast zzastVar;
        map.put("v", this.zzc);
        map.put("t", new Throwable());
        try {
            listenableFuture = (ListenableFuture) map.get("gs");
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (listenableFuture != null && ((Build.VERSION.SDK_INT < 31 || listenableFuture.isDone()) && (zzastVar = (zzast) listenableFuture.get(this.zzd, TimeUnit.MILLISECONDS)) != null && zzastVar.zzb().length() > 1)) {
            str = zzastVar.zzb();
            if (str.equals("E")) {
                try {
                    ListenableFuture listenableFuture2 = (ListenableFuture) map.get("ai");
                    if (listenableFuture2 != null) {
                        String str2 = (String) listenableFuture2.get(this.zze, TimeUnit.MILLISECONDS);
                        if (!zzghs.zzc(str2)) {
                            str = str2;
                        }
                    }
                } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
                }
            }
            map.put("int", str);
        }
        str = "E";
        if (str.equals("E")) {
        }
        map.put("int", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfqb
    public final Map zzb() {
        Map zzb = this.zzb.zzb();
        zza(zzb);
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfqb
    public final Map zzc() {
        Map zzc = this.zzb.zzc(this.zza, null);
        zza(zzc);
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfqb
    public final Map zzd() {
        Map zzd = this.zzb.zzd();
        zza(zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfqb
    public final Map zze() {
        HashMap hashMap = new HashMap();
        hashMap.put("t", new Throwable());
        return hashMap;
    }
}
