package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbyh;
import com.google.android.gms.internal.ads.zzgzl;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzaf implements zzgzl {
    final /* synthetic */ zzbyh zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzau zzc;

    zzaf(zzau zzauVar, zzbyh zzbyhVar, boolean z) {
        this.zza = zzbyhVar;
        this.zzb = z;
        Objects.requireNonNull(zzauVar);
        this.zzc = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        try {
            zzbyh zzbyhVar = this.zza;
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
            sb.append("Internal error: ");
            sb.append(message);
            zzbyhVar.zzf(sb.toString());
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(@Nonnull Object obj) {
        Uri zzZ;
        List<Uri> list = (List) obj;
        try {
            zzau zzauVar = this.zzc;
            zzauVar.zzw(list);
            this.zza.zze(list);
            if (zzauVar.zzD() || this.zzb) {
                for (Uri uri : list) {
                    if (zzauVar.zzd(uri)) {
                        zzZ = zzau.zzZ(uri, zzauVar.zzM(), AppEventsConstants.EVENT_PARAM_VALUE_YES);
                        zzauVar.zzB().zzb(zzZ.toString(), null, null, null);
                    } else {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziu)).booleanValue()) {
                            zzauVar.zzB().zzb(uri.toString(), null, null, null);
                        }
                    }
                }
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }
}
