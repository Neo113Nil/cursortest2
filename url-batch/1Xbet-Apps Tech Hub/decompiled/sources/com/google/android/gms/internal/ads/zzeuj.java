package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeuj implements zzeuy {
    private final zzbzs zza;
    private final zzgbl zzb;
    private final Context zzc;

    public zzeuj(zzbzs zzbzsVar, zzgbl zzgblVar, Context context) {
        this.zza = zzbzsVar;
        this.zzb = zzgblVar;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 34;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeui
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeuj.this.zzc();
            }
        });
    }

    final /* synthetic */ zzeuk zzc() throws Exception {
        if (!this.zza.zzu(this.zzc)) {
            return new zzeuk(null, null, null, null, null);
        }
        String zze = this.zza.zze(this.zzc);
        String str = zze == null ? "" : zze;
        String zzc = this.zza.zzc(this.zzc);
        String str2 = zzc == null ? "" : zzc;
        String zza = this.zza.zza(this.zzc);
        String str3 = zza == null ? "" : zza;
        String zzb = this.zza.zzb(this.zzc);
        return new zzeuk(str, str2, str3, zzb == null ? "" : zzb, "TIME_OUT".equals(str2) ? (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzaf) : null);
    }
}
