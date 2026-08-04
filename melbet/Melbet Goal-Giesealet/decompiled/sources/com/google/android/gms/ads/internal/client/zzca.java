package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.zzaya;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public abstract class zzca extends zzaya implements zzcb {
    public static zzcb zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return queryLocalInterface instanceof zzcb ? (zzcb) queryLocalInterface : new zzbz(iBinder);
    }
}
