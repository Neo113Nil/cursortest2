package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbfp {
    private final Context zza;

    public zzbfp(Context context) {
        this.zza = context;
    }

    public final void zza(zzbuz zzbuzVar) {
        try {
            ((zzbfq) zzcbr.zzb(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new zzcbp() { // from class: com.google.android.gms.internal.ads.zzbfo
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcbp
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                    return queryLocalInterface instanceof zzbfq ? (zzbfq) queryLocalInterface : new zzbfq(obj);
                }
            })).zze(zzbuzVar);
        } catch (RemoteException e) {
            zzcbn.zzj("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e.getMessage())));
        } catch (zzcbq e2) {
            zzcbn.zzj("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e2.getMessage())));
        }
    }
}
