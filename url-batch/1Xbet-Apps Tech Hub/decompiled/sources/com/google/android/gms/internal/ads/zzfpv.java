package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfpv {
    final zzfpy zza;
    final boolean zzb;

    private zzfpv(zzfpy zzfpyVar) {
        this.zza = zzfpyVar;
        this.zzb = zzfpyVar != null;
    }

    public static zzfpv zzb(Context context, String str, String str2) {
        zzfpy zzfpwVar;
        try {
            try {
                try {
                    IBinder instantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (instantiate == null) {
                        zzfpwVar = null;
                    } else {
                        IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzfpwVar = queryLocalInterface instanceof zzfpy ? (zzfpy) queryLocalInterface : new zzfpw(instantiate);
                    }
                    zzfpwVar.zze(ObjectWrapper.wrap(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzfpv(zzfpwVar);
                } catch (Exception e) {
                    throw new zzfox(e);
                }
            } catch (Exception e2) {
                throw new zzfox(e2);
            }
        } catch (RemoteException | zzfox | NullPointerException | SecurityException unused) {
            Log.d("GASS", "Cannot dynamite load clearcut");
            return new zzfpv(new zzfpz());
        }
    }

    public static zzfpv zzc() {
        zzfpz zzfpzVar = new zzfpz();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfpv(zzfpzVar);
    }

    public final zzfpu zza(byte[] bArr) {
        return new zzfpu(this, bArr, null);
    }
}
