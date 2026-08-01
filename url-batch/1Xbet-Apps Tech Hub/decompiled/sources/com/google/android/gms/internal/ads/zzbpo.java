package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbpo extends zzbpq {
    private static final zzbrt zza = new zzbrt();

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final zzbpu zzb(String str) throws RemoteException {
        zzbqs zzbqsVar;
        try {
            try {
                Class<?> cls = Class.forName(str, false, zzbpo.class.getClassLoader());
                if (MediationAdapter.class.isAssignableFrom(cls)) {
                    return new zzbqs((MediationAdapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                if (Adapter.class.isAssignableFrom(cls)) {
                    return new zzbqs((Adapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                zzcbn.zzj("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            } catch (Throwable th) {
                zzcbn.zzk("Could not instantiate mediation adapter: " + str + ". ", th);
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            zzcbn.zze("Reflection failed, retrying using direct instantiation");
            if (!"com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    zzbqsVar = new zzbqs(new CustomEventAdapter());
                }
                throw new RemoteException();
            }
            zzbqsVar = new zzbqs(new AdMobAdapter());
            return zzbqsVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final zzbrp zzc(String str) throws RemoteException {
        return new zzbsb((RtbAdapter) Class.forName(str, false, zzbrt.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final boolean zzd(String str) throws RemoteException {
        try {
            return Adapter.class.isAssignableFrom(Class.forName(str, false, zzbpo.class.getClassLoader()));
        } catch (Throwable unused) {
            zzcbn.zzj("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final boolean zze(String str) throws RemoteException {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, zzbpo.class.getClassLoader()));
        } catch (Throwable unused) {
            zzcbn.zzj("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }
}
