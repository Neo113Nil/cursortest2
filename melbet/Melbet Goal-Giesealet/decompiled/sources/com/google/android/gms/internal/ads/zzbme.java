package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public abstract class zzbme extends zzaya implements zzbmf {
    public static zzbmf zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
        return queryLocalInterface instanceof zzbmf ? (zzbmf) queryLocalInterface : new zzbmd(iBinder);
    }
}
