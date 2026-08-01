package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbeq;
import com.google.android.gms.internal.ads.zzbfe;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzcbn;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
abstract class zzax {
    private static final zzce zza;

    static {
        zzce zzceVar = null;
        try {
            Object newInstance = zzaw.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (newInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    zzceVar = queryLocalInterface instanceof zzce ? (zzce) queryLocalInterface : new zzcc(iBinder);
                }
            } else {
                zzcbn.zzj("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            zzcbn.zzj("Failed to instantiate ClientApi class.");
        }
        zza = zzceVar;
    }

    zzax() {
    }

    private final Object zze() {
        zzce zzceVar = zza;
        if (zzceVar == null) {
            zzcbn.zzj("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return zzb(zzceVar);
        } catch (RemoteException e) {
            zzcbn.zzk("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }

    private final Object zzf() {
        try {
            return zzc();
        } catch (RemoteException e) {
            zzcbn.zzk("Cannot invoke remote loader.", e);
            return null;
        }
    }

    protected abstract Object zza();

    protected abstract Object zzb(zzce zzceVar) throws RemoteException;

    protected abstract Object zzc() throws RemoteException;

    public final Object zzd(Context context, boolean z) {
        boolean z2;
        Object zze;
        if (!z) {
            zzay.zzb();
            if (!zzcbg.zzs(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                zzcbn.zze("Google Play Services is not available.");
                z = true;
            }
        }
        boolean z3 = false;
        boolean z4 = !(DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID));
        zzbdc.zza(context);
        if (((Boolean) zzbeq.zza.zze()).booleanValue()) {
            z2 = false;
        } else if (((Boolean) zzbeq.zzb.zze()).booleanValue()) {
            z2 = true;
            z3 = true;
        } else {
            z3 = z | z4;
            z2 = false;
        }
        if (z3) {
            zze = zze();
            if (zze == null && !z2) {
                zze = zzf();
            }
        } else {
            Object zzf = zzf();
            if (zzf == null) {
                if (zzay.zze().nextInt(((Long) zzbfe.zza.zze()).intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    zzay.zzb().zzn(context, zzay.zzc().zza, "gmob-apps", bundle, true);
                }
            }
            zze = zzf == null ? zze() : zzf;
        }
        return zze == null ? zza() : zze;
    }
}
