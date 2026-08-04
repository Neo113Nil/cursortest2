package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbgr {
    private final zzbgq zza;

    public zzbgr(zzbgq zzbgqVar) {
        Context context;
        this.zza = zzbgqVar;
        try {
            context = (Context) ObjectWrapper.unwrap(zzbgqVar.zzm());
        } catch (RemoteException | NullPointerException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            context = null;
        }
        if (context != null) {
            try {
                this.zza.zzn(ObjectWrapper.wrap(new MediaView(context)));
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
            }
        }
    }

    public final zzbgq zza() {
        return this.zza;
    }

    public final String zzb() {
        try {
            return this.zza.zzh();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            return null;
        }
    }
}
