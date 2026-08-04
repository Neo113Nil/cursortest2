package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbed;
import com.google.android.gms.internal.ads.zzber;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
abstract class zzba {
    private static final zzcr zza;

    static {
        zzcr zzcrVar = null;
        try {
            Object newInstance = zzaz.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (newInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    zzcrVar = queryLocalInterface instanceof zzcr ? (zzcr) queryLocalInterface : new zzcp(iBinder);
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to instantiate ClientApi class.");
        }
        zza = zzcrVar;
    }

    zzba() {
    }

    private final Object zze() {
        zzcr zzcrVar = zza;
        if (zzcrVar == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return zzc(zzcrVar);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }

    private final Object zzf() {
        try {
            return zzb();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke remote loader.", e);
            return null;
        }
    }

    protected abstract Object zza();

    protected abstract Object zzb() throws RemoteException;

    protected abstract Object zzc(zzcr zzcrVar) throws RemoteException;

    public final Object zzd(Context context, boolean z) {
        boolean z2;
        Object zze;
        if (!z) {
            zzbb.zza();
            if (!com.google.android.gms.ads.internal.util.client.zzf.zzx(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Google Play Services is not available.");
                z = true;
            }
        }
        boolean z3 = false;
        boolean z4 = !(DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID));
        zzbci.zza(context);
        if (((Boolean) zzbed.zza.zze()).booleanValue()) {
            z2 = false;
        } else if (((Boolean) zzbed.zzb.zze()).booleanValue()) {
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
                if (zzbb.zze().nextInt(((Long) zzber.zza.zze()).intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    zzbb.zza().zzh(context, zzbb.zzd().afmaVersion, "gmob-apps", bundle, true);
                }
            }
            zze = zzf == null ? zze() : zzf;
        }
        return zze == null ? zza() : zze;
    }
}
