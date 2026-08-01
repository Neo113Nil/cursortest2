package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbma;
import com.google.android.gms.internal.ads.zzbmi;
import com.google.android.gms.internal.ads.zzbmj;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbpo;
import com.google.android.gms.internal.ads.zzcbc;
import com.google.android.gms.internal.ads.zzcbn;
import com.google.android.gms.internal.ads.zzfun;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzej {
    private static zzej zza;
    private zzco zzg;
    private final Object zzb = new Object();
    private boolean zzd = false;
    private boolean zze = false;
    private final Object zzf = new Object();

    @Nullable
    private OnAdInspectorClosedListener zzh = null;
    private RequestConfiguration zzi = new RequestConfiguration.Builder().build();
    private final ArrayList zzc = new ArrayList();

    private zzej() {
    }

    private final void zzA(Context context) {
        if (this.zzg == null) {
            this.zzg = (zzco) new zzaq(zzay.zza(), context).zzd(context, false);
        }
    }

    private final void zzB(RequestConfiguration requestConfiguration) {
        try {
            this.zzg.zzu(new zzff(requestConfiguration));
        } catch (RemoteException e) {
            zzcbn.zzh("Unable to set request configuration parcel.", e);
        }
    }

    public static zzej zzf() {
        zzej zzejVar;
        synchronized (zzej.class) {
            if (zza == null) {
                zza = new zzej();
            }
            zzejVar = zza;
        }
        return zzejVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InitializationStatus zzy(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbma zzbmaVar = (zzbma) it.next();
            hashMap.put(zzbmaVar.zza, new zzbmi(zzbmaVar.zzb ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, zzbmaVar.zzd, zzbmaVar.zzc));
        }
        return new zzbmj(hashMap);
    }

    private final void zzz(Context context, @Nullable String str) {
        try {
            zzbpk.zza().zzb(context, null);
            this.zzg.zzk();
            this.zzg.zzl(null, ObjectWrapper.wrap(null));
        } catch (RemoteException e) {
            zzcbn.zzk("MobileAdsSettingManager initialization failed", e);
        }
    }

    public final RequestConfiguration zzc() {
        return this.zzi;
    }

    public final InitializationStatus zze() {
        InitializationStatus zzy;
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                zzy = zzy(this.zzg.zzg());
            } catch (RemoteException unused) {
                zzcbn.zzg("Unable to get Initialization status.");
                return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzeb
                    @Override // com.google.android.gms.ads.initialization.InitializationStatus
                    public final Map getAdapterStatusMap() {
                        HashMap hashMap = new HashMap();
                        hashMap.put("com.google.android.gms.ads.MobileAds", new zzee(zzej.this));
                        return hashMap;
                    }
                };
            }
        }
        return zzy;
    }

    public final String zzh() {
        String zzc;
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                zzc = zzfun.zzc(this.zzg.zzf());
            } catch (RemoteException e) {
                zzcbn.zzh("Unable to get internal version.", e);
                return "";
            }
        }
        return zzc;
    }

    public final void zzl(Context context) {
        synchronized (this.zzf) {
            zzA(context);
            try {
                this.zzg.zzi();
            } catch (RemoteException unused) {
                zzcbn.zzg("Unable to disable mediation adapter initialization.");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzm(final Context context, @Nullable String str, @Nullable OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.zzb) {
            if (this.zzd) {
                if (onInitializationCompleteListener != null) {
                    this.zzc.add(onInitializationCompleteListener);
                }
                return;
            }
            if (this.zze) {
                if (onInitializationCompleteListener != null) {
                    onInitializationCompleteListener.onInitializationComplete(zze());
                }
                return;
            }
            this.zzd = true;
            if (onInitializationCompleteListener != null) {
                this.zzc.add(onInitializationCompleteListener);
            }
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null.");
            }
            synchronized (this.zzf) {
                zzeh zzehVar = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                try {
                    zzA(context);
                    this.zzg.zzs(new zzei(this, zzehVar));
                    this.zzg.zzo(new zzbpo());
                    if (this.zzi.getTagForChildDirectedTreatment() != -1 || this.zzi.getTagForUnderAgeOfConsent() != -1) {
                        zzB(this.zzi);
                    }
                } catch (RemoteException e) {
                    zzcbn.zzk("MobileAdsSettingManager initialization failed", e);
                }
                zzbdc.zza(context);
                if (((Boolean) zzbet.zza.zze()).booleanValue()) {
                    if (((Boolean) zzba.zzc().zza(zzbdc.zzks)).booleanValue()) {
                        zzcbn.zze("Initializing on bg thread");
                        ThreadPoolExecutor threadPoolExecutor = zzcbc.zza;
                        final Object[] objArr3 = objArr2 == true ? 1 : 0;
                        threadPoolExecutor.execute(new Runnable(context, objArr3) { // from class: com.google.android.gms.ads.internal.client.zzec
                            public final /* synthetic */ Context zzb;

                            @Override // java.lang.Runnable
                            public final void run() {
                                zzej.this.zzn(this.zzb, null);
                            }
                        });
                    }
                }
                if (((Boolean) zzbet.zzb.zze()).booleanValue()) {
                    if (((Boolean) zzba.zzc().zza(zzbdc.zzks)).booleanValue()) {
                        ExecutorService executorService = zzcbc.zzb;
                        final Object[] objArr4 = objArr == true ? 1 : 0;
                        executorService.execute(new Runnable(context, objArr4) { // from class: com.google.android.gms.ads.internal.client.zzed
                            public final /* synthetic */ Context zzb;

                            @Override // java.lang.Runnable
                            public final void run() {
                                zzej.this.zzo(this.zzb, null);
                            }
                        });
                    }
                }
                zzcbn.zze("Initializing on calling thread");
                zzz(context, null);
            }
        }
    }

    final /* synthetic */ void zzn(Context context, String str) {
        synchronized (this.zzf) {
            zzz(context, null);
        }
    }

    final /* synthetic */ void zzo(Context context, String str) {
        synchronized (this.zzf) {
            zzz(context, null);
        }
    }

    public final void zzp(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.zzf) {
            zzA(context);
            this.zzh = onAdInspectorClosedListener;
            try {
                this.zzg.zzm(new zzeg(null));
            } catch (RemoteException unused) {
                zzcbn.zzg("Unable to open the ad inspector.");
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                }
            }
        }
    }

    public final void zzq(Context context, String str) {
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.zzg.zzn(ObjectWrapper.wrap(context), str);
            } catch (RemoteException e) {
                zzcbn.zzh("Unable to open debug menu.", e);
            }
        }
    }

    public final void zzr(boolean z) {
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to enable/disable the publisher first-party ID.");
            try {
                this.zzg.zzj(z);
            } catch (RemoteException e) {
                zzcbn.zzh("Unable to " + (z ? "enable" : "disable") + " the publisher first-party ID.", e);
                if (e.getMessage() != null && e.getMessage().toLowerCase(Locale.ROOT).contains("paid")) {
                    throw new IllegalStateException(e);
                }
            }
        }
    }

    public final void zzs(Class cls) {
        synchronized (this.zzf) {
            try {
                this.zzg.zzh(cls.getCanonicalName());
            } catch (RemoteException e) {
                zzcbn.zzh("Unable to register RtbAdapter", e);
            }
        }
    }

    public final void zzt(boolean z) {
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.zzg.zzp(z);
            } catch (RemoteException e) {
                zzcbn.zzh("Unable to set app mute state.", e);
            }
        }
    }

    public final void zzu(float f) {
        boolean z = true;
        Preconditions.checkArgument(f >= 0.0f && f <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.zzf) {
            if (this.zzg == null) {
                z = false;
            }
            Preconditions.checkState(z, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.zzg.zzq(f);
            } catch (RemoteException e) {
                zzcbn.zzh("Unable to set app volume.", e);
            }
        }
    }

    public final void zzv(String str) {
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.zzg.zzt(str);
            } catch (RemoteException e) {
                zzcbn.zzh("Unable to set plugin.", e);
            }
        }
    }

    public final void zzw(RequestConfiguration requestConfiguration) {
        Preconditions.checkArgument(requestConfiguration != null, "Null passed to setRequestConfiguration.");
        synchronized (this.zzf) {
            RequestConfiguration requestConfiguration2 = this.zzi;
            this.zzi = requestConfiguration;
            if (this.zzg == null) {
                return;
            }
            if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                zzB(requestConfiguration);
            }
        }
    }

    public final float zza() {
        synchronized (this.zzf) {
            zzco zzcoVar = this.zzg;
            float f = 1.0f;
            if (zzcoVar == null) {
                return 1.0f;
            }
            try {
                f = zzcoVar.zze();
            } catch (RemoteException e) {
                zzcbn.zzh("Unable to get app volume.", e);
            }
            return f;
        }
    }

    public final boolean zzx() {
        synchronized (this.zzf) {
            zzco zzcoVar = this.zzg;
            boolean z = false;
            if (zzcoVar == null) {
                return false;
            }
            try {
                z = zzcoVar.zzv();
            } catch (RemoteException e) {
                zzcbn.zzh("Unable to get app mute state.", e);
            }
            return z;
        }
    }
}
