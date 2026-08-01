package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzffk {
    private static zzffk zza;
    private final Context zzb;
    private final com.google.android.gms.ads.internal.client.zzcl zzc;
    private final AtomicReference zzd = new AtomicReference();

    zzffk(Context context, com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        this.zzb = context;
        this.zzc = zzclVar;
    }

    static com.google.android.gms.ads.internal.client.zzcl zza(Context context) {
        try {
            return com.google.android.gms.ads.internal.client.zzck.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            zzcbn.zzh("Failed to retrieve lite SDK info.", e);
            return null;
        }
    }

    public static zzffk zzd(Context context) {
        synchronized (zzffk.class) {
            zzffk zzffkVar = zza;
            if (zzffkVar != null) {
                return zzffkVar;
            }
            Context applicationContext = context.getApplicationContext();
            long longValue = ((Long) zzbex.zzb.zze()).longValue();
            com.google.android.gms.ads.internal.client.zzcl zzclVar = null;
            if (longValue > 0 && longValue <= 234310600) {
                zzclVar = zza(applicationContext);
            }
            zzffk zzffkVar2 = new zzffk(applicationContext, zzclVar);
            zza = zzffkVar2;
            return zzffkVar2;
        }
    }

    private final com.google.android.gms.ads.internal.client.zzen zzg() {
        com.google.android.gms.ads.internal.client.zzcl zzclVar = this.zzc;
        if (zzclVar != null) {
            try {
                return zzclVar.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final zzbpr zzb() {
        return (zzbpr) this.zzd.get();
    }

    public final zzcbt zzc(int i, boolean z, int i2) {
        com.google.android.gms.ads.internal.client.zzen zzg;
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean zzD = com.google.android.gms.ads.internal.util.zzt.zzD(this.zzb);
        zzcbt zzcbtVar = new zzcbt(234310000, i2, true, zzD);
        return (((Boolean) zzbex.zzc.zze()).booleanValue() && (zzg = zzg()) != null) ? new zzcbt(234310000, zzg.zza(), true, zzD) : zzcbtVar;
    }

    public final String zze() {
        com.google.android.gms.ads.internal.client.zzen zzg = zzg();
        if (zzg != null) {
            return zzg.zzb();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(zzbpr zzbprVar) {
        zzbpr adapterCreator;
        if (!((Boolean) zzbex.zza.zze()).booleanValue()) {
            zzffj.zza(this.zzd, null, zzbprVar);
            return;
        }
        com.google.android.gms.ads.internal.client.zzcl zzclVar = this.zzc;
        if (zzclVar != null) {
            try {
                adapterCreator = zzclVar.getAdapterCreator();
            } catch (RemoteException unused) {
            }
            AtomicReference atomicReference = this.zzd;
            if (adapterCreator != null) {
                zzbprVar = adapterCreator;
            }
            zzffj.zza(atomicReference, null, zzbprVar);
        }
        adapterCreator = null;
        AtomicReference atomicReference2 = this.zzd;
        if (adapterCreator != null) {
        }
        zzffj.zza(atomicReference2, null, zzbprVar);
    }
}
