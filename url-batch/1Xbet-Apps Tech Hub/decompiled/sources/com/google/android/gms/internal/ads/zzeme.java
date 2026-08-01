package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeme {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzdrk zzb;

    public zzeme(zzdrk zzdrkVar) {
        this.zzb = zzdrkVar;
    }

    @CheckForNull
    public final zzbrp zza(String str) {
        if (this.zza.containsKey(str)) {
            return (zzbrp) this.zza.get(str);
        }
        return null;
    }

    public final void zzb(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException e) {
            zzcbn.zzh("Couldn't create RTB adapter : ", e);
        }
    }
}
