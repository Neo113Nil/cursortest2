package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzetc implements zzeuy {
    private final zzgbl zza;
    private final Context zzb;
    private final Set zzc;

    public zzetc(zzgbl zzgblVar, Context context, Set set) {
        this.zza = zzgblVar;
        this.zzb = context;
        this.zzc = set;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 27;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzetc.this.zzc();
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r0.contains("banner") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ zzetd zzc() throws Exception {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzeT)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfb)).booleanValue()) {
                Set set = this.zzc;
                if (!set.contains("rewarded")) {
                    if (!set.contains("interstitial")) {
                        if (!set.contains("native")) {
                        }
                    }
                }
            }
            return new zzetd(com.google.android.gms.ads.internal.zzt.zzA().zze(this.zzb));
        }
        return new zzetd(null);
    }
}
