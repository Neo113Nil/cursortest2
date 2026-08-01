package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbue;
import com.google.android.gms.internal.ads.zzcbn;
import com.google.android.gms.internal.ads.zzfla;
import com.google.android.gms.internal.ads.zzgax;
import java.util.List;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzy implements zzgax {
    final /* synthetic */ zzbue zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzaa zzc;

    zzy(zzaa zzaaVar, zzbue zzbueVar, boolean z) {
        this.zzc = zzaaVar;
        this.zza = zzbueVar;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zza(Throwable th) {
        try {
            this.zza.zze("Internal error: " + th.getMessage());
        } catch (RemoteException e) {
            zzcbn.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final /* bridge */ /* synthetic */ void zzb(@Nonnull Object obj) {
        boolean z;
        String str;
        Uri zzab;
        zzfla zzflaVar;
        zzfla zzflaVar2;
        List<Uri> list = (List) obj;
        try {
            zzaa.zzH(this.zzc, list);
            this.zza.zzf(list);
            z = this.zzc.zzu;
            if (z || this.zzb) {
                for (Uri uri : list) {
                    if (this.zzc.zzQ(uri)) {
                        str = this.zzc.zzC;
                        zzab = zzaa.zzab(uri, str, "1");
                        zzflaVar = this.zzc.zzs;
                        zzflaVar.zzc(zzab.toString(), null);
                    } else {
                        if (((Boolean) zzba.zzc().zza(zzbdc.zzhx)).booleanValue()) {
                            zzflaVar2 = this.zzc.zzs;
                            zzflaVar2.zzc(uri.toString(), null);
                        }
                    }
                }
            }
        } catch (RemoteException e) {
            zzcbn.zzh("", e);
        }
    }
}
