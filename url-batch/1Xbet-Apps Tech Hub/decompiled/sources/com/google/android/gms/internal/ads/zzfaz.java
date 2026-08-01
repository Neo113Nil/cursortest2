package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfaz {
    public static void zza(AtomicReference atomicReference, zzfay zzfayVar) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            zzfayVar.zza(obj);
        } catch (RemoteException e) {
            zzcbn.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            zzcbn.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }
}
