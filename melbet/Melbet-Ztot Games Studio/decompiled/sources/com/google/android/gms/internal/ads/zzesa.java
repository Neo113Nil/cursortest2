package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzesa implements zzevo {
    private final zzgcu zza;

    public zzesa(Context context, zzgcu zzgcuVar) {
        this.zza = zzgcuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 19;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzerz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String zzj;
                String zzk;
                String str;
                com.google.android.gms.ads.internal.zzu.zzp();
                zzayv zzg = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzg();
                Bundle bundle = null;
                if (zzg != null && (!com.google.android.gms.ads.internal.zzu.zzo().zzi().zzP() || !com.google.android.gms.ads.internal.zzu.zzo().zzi().zzQ())) {
                    if (zzg.zzh()) {
                        zzg.zzg();
                    }
                    zzayl zza = zzg.zza();
                    if (zza != null) {
                        zzj = zza.zzd();
                        str = zza.zze();
                        zzk = zza.zzf();
                        if (zzj != null) {
                            com.google.android.gms.ads.internal.zzu.zzo().zzi().zzx(zzj);
                        }
                        if (zzk != null) {
                            com.google.android.gms.ads.internal.zzu.zzo().zzi().zzz(zzk);
                        }
                    } else {
                        zzj = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzj();
                        zzk = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzk();
                        str = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (!com.google.android.gms.ads.internal.zzu.zzo().zzi().zzQ()) {
                        if (zzk == null || TextUtils.isEmpty(zzk)) {
                            bundle2.putString("v_fp_vertical", "no_hash");
                        } else {
                            bundle2.putString("v_fp_vertical", zzk);
                        }
                    }
                    if (zzj != null && !com.google.android.gms.ads.internal.zzu.zzo().zzi().zzP()) {
                        bundle2.putString("fingerprint", zzj);
                        if (!zzj.equals(str)) {
                            bundle2.putString("v_fp", str);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new zzesb(bundle);
            }
        });
    }
}
