package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzfkg {
    private static zzfkg zza;
    private final Context zzb;
    private final com.google.android.gms.ads.internal.client.zzcy zzc;
    private final AtomicReference zzd = new AtomicReference();

    zzfkg(Context context, com.google.android.gms.ads.internal.client.zzcy zzcyVar) {
        this.zzb = context;
        this.zzc = zzcyVar;
    }

    public static zzfkg zza(Context context) {
        synchronized (zzfkg.class) {
            zzfkg zzfkgVar = zza;
            if (zzfkgVar != null) {
                return zzfkgVar;
            }
            Context applicationContext = context.getApplicationContext();
            long longValue = ((Long) zzbjf.zzb.zze()).longValue();
            com.google.android.gms.ads.internal.client.zzcy zzcyVar = null;
            if (longValue > 0 && longValue <= 254715000) {
                zzcyVar = zzf(applicationContext);
            }
            zzfkg zzfkgVar2 = new zzfkg(applicationContext, zzcyVar);
            zza = zzfkgVar2;
            return zzfkgVar2;
        }
    }

    static com.google.android.gms.ads.internal.client.zzcy zzf(Context context) {
        try {
            return com.google.android.gms.ads.internal.client.zzcx.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to retrieve lite SDK info.", e);
            return null;
        }
    }

    private final com.google.android.gms.ads.internal.client.zzfc zzg() {
        com.google.android.gms.ads.internal.client.zzcy zzcyVar = this.zzc;
        if (zzcyVar != null) {
            try {
                return zzcyVar.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final VersionInfoParcel zzb(int i, boolean z, int i2) {
        com.google.android.gms.ads.internal.client.zzfc zzg;
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zzJ = com.google.android.gms.ads.internal.util.zzs.zzJ(this.zzb);
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(ModuleDescriptor.MODULE_VERSION, i2, true, zzJ);
        return (((Boolean) zzbjf.zzc.zze()).booleanValue() && (zzg = zzg()) != null) ? new VersionInfoParcel(ModuleDescriptor.MODULE_VERSION, zzg.zza(), true, zzJ) : versionInfoParcel;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc(zzbtt zzbttVar) {
        zzbtt adapterCreator;
        if (!((Boolean) zzbjf.zza.zze()).booleanValue()) {
            LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(this.zzd, null, zzbttVar);
            return;
        }
        com.google.android.gms.ads.internal.client.zzcy zzcyVar = this.zzc;
        if (zzcyVar != null) {
            try {
                adapterCreator = zzcyVar.getAdapterCreator();
            } catch (RemoteException unused) {
            }
            AtomicReference atomicReference = this.zzd;
            if (adapterCreator != null) {
                zzbttVar = adapterCreator;
            }
            LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, null, zzbttVar);
        }
        adapterCreator = null;
        AtomicReference atomicReference2 = this.zzd;
        if (adapterCreator != null) {
        }
        LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(atomicReference2, null, zzbttVar);
    }

    public final zzbtt zzd() {
        return (zzbtt) this.zzd.get();
    }

    public final String zze() {
        com.google.android.gms.ads.internal.client.zzfc zzg = zzg();
        if (zzg != null) {
            return zzg.zzb();
        }
        return null;
    }
}
