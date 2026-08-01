package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbli {
    private final Context zza;
    private final OnH5AdsEventListener zzb;
    private zzble zzc;

    public zzbli(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        Preconditions.checkState(true, "Android version must be Lollipop or higher");
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(onH5AdsEventListener);
        this.zza = context;
        this.zzb = onH5AdsEventListener;
        zzbdc.zza(context);
    }

    public static final boolean zzc(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjv)).booleanValue()) {
            return false;
        }
        Preconditions.checkNotNull(str);
        if (str.length() > ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjx)).intValue()) {
            zzcbn.zze("H5 GMSG exceeds max length");
            return false;
        }
        Uri parse = Uri.parse(str);
        return "gmsg".equals(parse.getScheme()) && "mobileads.google.com".equals(parse.getHost()) && "/h5ads".equals(parse.getPath());
    }

    private final void zzd() {
        if (this.zzc != null) {
            return;
        }
        this.zzc = com.google.android.gms.ads.internal.client.zzay.zza().zzl(this.zza, new zzbpo(), this.zzb);
    }

    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjv)).booleanValue()) {
            zzd();
            zzble zzbleVar = this.zzc;
            if (zzbleVar != null) {
                try {
                    zzbleVar.zze();
                } catch (RemoteException e) {
                    zzcbn.zzl("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final boolean zzb(String str) {
        if (!zzc(str)) {
            return false;
        }
        zzd();
        zzble zzbleVar = this.zzc;
        if (zzbleVar == null) {
            return false;
        }
        try {
            zzbleVar.zzf(str);
            return true;
        } catch (RemoteException e) {
            zzcbn.zzl("#007 Could not call remote method.", e);
            return true;
        }
    }
}
