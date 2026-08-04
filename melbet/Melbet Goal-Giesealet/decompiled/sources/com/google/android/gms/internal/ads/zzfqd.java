package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzfqd {
    final zzfqg zza;
    final boolean zzb;

    private zzfqd(zzfqg zzfqgVar) {
        this.zza = zzfqgVar;
        this.zzb = zzfqgVar != null;
    }

    public static zzfqd zzb(Context context, String str, String str2) {
        zzfqg zzfqeVar;
        try {
            try {
                try {
                    IBinder instantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    IBinder iBinder = instantiate;
                    if (instantiate == null) {
                        zzfqeVar = null;
                    } else {
                        IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzfqeVar = queryLocalInterface instanceof zzfqg ? (zzfqg) queryLocalInterface : new zzfqe(instantiate);
                    }
                    zzfqg zzfqgVar = zzfqeVar;
                    zzfqeVar.zzj(ObjectWrapper.wrap(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzfqd(zzfqeVar);
                } catch (Exception e) {
                    throw new zzfpg(e);
                }
            } catch (RemoteException | zzfpg | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new zzfqd(new zzfqh());
            }
        } catch (Exception e2) {
            throw new zzfpg(e2);
        }
    }

    public static zzfqd zzc() {
        zzfqh zzfqhVar = new zzfqh();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfqd(zzfqhVar);
    }

    public final zzfqc zza(byte[] bArr) {
        return new zzfqc(this, bArr, null);
    }
}
