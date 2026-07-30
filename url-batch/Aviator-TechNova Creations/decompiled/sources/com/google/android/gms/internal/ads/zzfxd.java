package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzfxd {
    final zzfxg zza;
    final boolean zzb;

    private zzfxd(zzfxg zzfxgVar) {
        this.zza = zzfxgVar;
        this.zzb = zzfxgVar != null;
    }

    public static zzfxd zzb(Context context, String str, String str2) {
        zzfxg zzfxeVar;
        try {
            try {
                try {
                    IBinder instantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    IBinder iBinder = instantiate;
                    if (instantiate == null) {
                        zzfxeVar = null;
                    } else {
                        IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzfxeVar = queryLocalInterface instanceof zzfxg ? (zzfxg) queryLocalInterface : new zzfxe(instantiate);
                    }
                    zzfxg zzfxgVar = zzfxeVar;
                    zzfxeVar.zzj(ObjectWrapper.wrap(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzfxd(zzfxeVar);
                } catch (Exception e) {
                    throw new zzfwg(e);
                }
            } catch (RemoteException | zzfwg | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new zzfxd(new zzfxh());
            }
        } catch (Exception e2) {
            throw new zzfwg(e2);
        }
    }

    public static zzfxd zzc() {
        zzfxh zzfxhVar = new zzfxh();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfxd(zzfxhVar);
    }

    public final zzfxc zza(byte[] bArr) {
        return new zzfxc(this, bArr, null);
    }
}
