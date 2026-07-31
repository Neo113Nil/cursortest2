package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zziu;
import com.google.android.gms.internal.play_billing.zziw;
import com.google.android.gms.internal.play_billing.zziy;
import com.google.android.gms.internal.play_billing.zzja;
import com.google.android.gms.internal.play_billing.zzjb;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.internal.play_billing.zzjf;
import com.google.android.gms.internal.play_billing.zzji;
import com.google.android.gms.internal.play_billing.zzkl;
import com.google.android.gms.internal.play_billing.zzkn;
import com.google.android.gms.internal.play_billing.zzkr;
import com.google.android.gms.internal.play_billing.zzks;
import com.google.android.gms.internal.play_billing.zzku;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import ru.rustore.sdk.user.profile.UserProfileProvider;

/* loaded from: classes.dex */
final class zzbw implements ServiceConnection {
    final /* synthetic */ BillingClientImpl zza;
    private final BillingClientStateListener zzb;
    private final com.google.android.gms.internal.play_billing.zzbl zzc;
    private final com.google.android.gms.internal.play_billing.zzbl zzd;
    private final int zze;

    /* synthetic */ zzbw(BillingClientImpl billingClientImpl, BillingClientStateListener billingClientStateListener, int i4, zzch zzchVar) {
        com.google.android.gms.internal.play_billing.zzbo zzboVar;
        com.google.android.gms.internal.play_billing.zzbo zzboVar2;
        Objects.requireNonNull(billingClientImpl);
        this.zza = billingClientImpl;
        zzboVar = billingClientImpl.zzK;
        this.zzc = com.google.android.gms.internal.play_billing.zzbl.zzc(zzboVar);
        zzboVar2 = billingClientImpl.zzK;
        this.zzd = com.google.android.gms.internal.play_billing.zzbl.zzc(zzboVar2);
        this.zzb = billingClientStateListener;
        this.zze = i4;
    }

    public static /* synthetic */ Object zza(zzbw zzbwVar) {
        Object obj;
        int i4;
        int i5;
        Bundle bundle;
        Object obj2;
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        Context context;
        int i6;
        int i7;
        zzcz zzczVar;
        int i8;
        String str;
        String str2;
        Long l4;
        BillingClientImpl billingClientImpl = zzbwVar.zza;
        obj = billingClientImpl.zza;
        synchronized (obj) {
            try {
                i4 = billingClientImpl.zzb;
                if (i4 != 3) {
                    i5 = billingClientImpl.zzb;
                    boolean z4 = true;
                    if (i5 != 1) {
                        z4 = false;
                    }
                    if (TextUtils.isEmpty(null)) {
                        bundle = null;
                    } else {
                        bundle = new Bundle();
                        bundle.putString("accountName", null);
                        str = billingClientImpl.zzc;
                        str2 = billingClientImpl.zzd;
                        l4 = billingClientImpl.zzJ;
                        com.google.android.gms.internal.play_billing.zzc.zzc(bundle, str, str2, l4.longValue());
                    }
                    zzjd zzjdVar = zzjd.REASON_UNSPECIFIED;
                    obj2 = billingClientImpl.zza;
                    synchronized (obj2) {
                        zzapVar = billingClientImpl.zzi;
                    }
                    if (zzapVar == null) {
                        BillingClientImpl billingClientImpl2 = zzbwVar.zza;
                        billingClientImpl2.zzbg(0);
                        int i9 = zzbwVar.zze;
                        zzjd zzjdVar2 = zzjd.SERVICE_RESET_TO_NULL;
                        BillingResult billingResult = zzdc.zzj;
                        billingClientImpl2.zzbf(zzjdVar2, billingResult, i9);
                        zzbwVar.zzg(billingResult);
                    } else {
                        BillingClientImpl billingClientImpl3 = zzbwVar.zza;
                        context = billingClientImpl3.zzg;
                        String packageName = context.getPackageName();
                        int i10 = 27;
                        int i11 = 3;
                        int i12 = 27;
                        while (true) {
                            if (i12 < 3) {
                                i12 = 0;
                                break;
                            }
                            try {
                                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "trying subs apiVersion: " + i12);
                                i11 = bundle == null ? zzapVar.zzb(i12, packageName, "subs") : zzapVar.zzc(i12, packageName, "subs", bundle);
                                if (i11 == 0) {
                                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "highestLevelSupportedForSubs: " + i12);
                                    break;
                                }
                                i12--;
                            } catch (Exception e4) {
                                com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Exception while checking if billing is supported; try to reconnect", e4);
                                zzjd zzjdVar3 = e4 instanceof DeadObjectException ? zzjd.IS_BILLING_SUPPORTED_DEAD_OBJECT_EXCEPTION : e4 instanceof RemoteException ? zzjd.IS_BILLING_SUPPORTED_REMOTE_EXCEPTION : e4 instanceof SecurityException ? zzjd.IS_BILLING_SUPPORTED_SECURITY_EXCEPTION : zzjd.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION;
                                String zza = zzjdVar3.equals(zzjd.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION) ? zzcy.zza(e4) : null;
                                zzbwVar.zza.zzbg(0);
                                zzbwVar.zzf(BillingClientImpl.zzm(e4), zzjdVar3, zza, z4, 0);
                                zzbwVar.zzg(BillingClientImpl.zzm(e4));
                            }
                        }
                        billingClientImpl3.zzl = i12 >= 5;
                        billingClientImpl3.zzk = i12 >= 3;
                        if (i12 < 3) {
                            zzjdVar = zzjd.SUBSCRIPTIONS_NOT_SUPPORTED;
                            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "In-app billing API does not support subscription on this device.");
                        }
                        while (true) {
                            if (i10 < 3) {
                                break;
                            }
                            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "trying inapp apiVersion: " + i10);
                            i11 = bundle == null ? zzapVar.zzb(i10, packageName, "inapp") : zzapVar.zzc(i10, packageName, "inapp", bundle);
                            if (i11 == 0) {
                                billingClientImpl3.zzm = i10;
                                i8 = billingClientImpl3.zzm;
                                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "mHighestLevelSupportedForInApp: " + i8);
                                break;
                            }
                            i10--;
                        }
                        i6 = billingClientImpl3.zzm;
                        BillingClientImpl.zzak(billingClientImpl3, i6);
                        i7 = billingClientImpl3.zzm;
                        if (i7 < 3) {
                            zzjdVar = zzjd.ONE_TIME_PRODUCT_NOT_SUPPORTED;
                            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "In-app billing API version 3 is not supported on this device.");
                        }
                        zzjd zzjdVar4 = zzjdVar;
                        BillingClientImpl.zzam(billingClientImpl3, i11);
                        if (i11 != 0) {
                            BillingResult billingResult2 = zzdc.zzb;
                            zzbwVar.zzf(billingResult2, zzjdVar4, null, z4, 0);
                            zzbwVar.zzg(billingResult2);
                        } else {
                            try {
                                Long zze = zzbwVar.zze(z4);
                                if (z4) {
                                    zziy zza2 = zzja.zza();
                                    zza2.zze(6);
                                    zzks zza3 = zzku.zza();
                                    int i13 = zzbwVar.zze;
                                    zza3.zza(i13 > 0);
                                    zza3.zzb(i13);
                                    zza3.zzd(0);
                                    if (zze != null) {
                                        zza3.zzc(zze.longValue());
                                    }
                                    BillingClientImpl billingClientImpl4 = zzbwVar.zza;
                                    zza2.zzd(zza3);
                                    billingClientImpl4.zzbe((zzja) zza2.zzi());
                                } else {
                                    zzkl zza4 = zzkn.zza();
                                    zzjb zza5 = zzjf.zza();
                                    zza5.zzp(0);
                                    zza5.zzc(0);
                                    zza4.zza(zza5);
                                    if (zze != null) {
                                        zza4.zzb(zze.longValue());
                                    }
                                    zzczVar = zzbwVar.zza.zzh;
                                    zzczVar.zzj((zzkn) zza4.zzi());
                                }
                            } catch (Throwable th) {
                                com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
                            }
                            zzbwVar.zzg(zzdc.zzi);
                        }
                    }
                }
            } finally {
            }
        }
        return null;
    }

    public static /* synthetic */ void zzb(zzbw zzbwVar) {
        BillingClientImpl billingClientImpl = zzbwVar.zza;
        billingClientImpl.zzbg(0);
        zzjd zzjdVar = zzjd.EXECUTE_ASYNC_TIMEOUT;
        BillingResult billingResult = zzdc.zzk;
        billingClientImpl.zzbf(zzjdVar, billingResult, zzbwVar.zze);
        zzbwVar.zzg(billingResult);
    }

    private final Long zze(boolean z4) {
        Object obj;
        Object obj2;
        try {
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Exception getting connection establishment duration.", th);
        }
        if (z4) {
            obj2 = this.zza.zza;
            synchronized (obj2) {
                try {
                    com.google.android.gms.internal.play_billing.zzbl zzblVar = this.zzc;
                    if (!zzblVar.zzg()) {
                        return null;
                    }
                    zzblVar.zzf();
                    return Long.valueOf(zzblVar.zza(TimeUnit.MILLISECONDS));
                } finally {
                }
            }
        }
        obj = this.zza.zza;
        synchronized (obj) {
            try {
                com.google.android.gms.internal.play_billing.zzbl zzblVar2 = this.zzd;
                if (!zzblVar2.zzg()) {
                    return null;
                }
                zzblVar2.zzf();
                return Long.valueOf(zzblVar2.zza(TimeUnit.MILLISECONDS));
            } finally {
            }
        }
        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Exception getting connection establishment duration.", th);
        return null;
    }

    private final void zzf(BillingResult billingResult, zzjd zzjdVar, String str, boolean z4, int i4) {
        zzcz zzczVar;
        try {
            zzjb zza = zzjf.zza();
            zza.zzp(billingResult.getResponseCode());
            zza.zzb(billingResult.getDebugMessage());
            zza.zze(zzjdVar);
            zza.zzc(0);
            if (str != null) {
                zza.zza(str);
            }
            Long zze = zze(z4);
            if (!z4) {
                zzkl zza2 = zzkn.zza();
                zza2.zza(zza);
                if (zze != null) {
                    zza2.zzb(zze.longValue());
                }
                zzczVar = this.zza.zzh;
                zzczVar.zzj((zzkn) zza2.zzi());
                return;
            }
            zzks zza3 = zzku.zza();
            int i5 = this.zze;
            zza3.zza(i5 > 0);
            zza3.zzb(i5);
            zza3.zzd(0);
            if (zze != null) {
                zza3.zzc(zze.longValue());
            }
            BillingClientImpl billingClientImpl = this.zza;
            zziu zza4 = zziw.zza();
            zza4.zzb(zza);
            zza4.zzp(6);
            zza4.zze(zza3);
            billingClientImpl.zzbc((zziw) zza4.zzi());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
        }
    }

    private final void zzg(BillingResult billingResult) {
        Object obj;
        int i4;
        BillingClientImpl billingClientImpl = this.zza;
        obj = billingClientImpl.zza;
        synchronized (obj) {
            try {
                i4 = billingClientImpl.zzb;
                if (i4 == 3) {
                    return;
                }
                try {
                    this.zzb.onBillingSetupFinished(billingResult);
                } catch (Throwable th) {
                    com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Exception while calling onBillingSetupFinished.", th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        Object obj;
        int i4;
        int i5;
        zzcz zzczVar;
        zzcz zzczVar2;
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Billing service died.");
        try {
            BillingClientImpl billingClientImpl = this.zza;
            if (BillingClientImpl.zzaq(billingClientImpl)) {
                zzczVar2 = billingClientImpl.zzh;
                zziu zza = zziw.zza();
                zza.zzp(6);
                zzjb zza2 = zzjf.zza();
                zza2.zze(zzjd.BINDING_DIED);
                zza.zzb(zza2);
                zzks zza3 = zzku.zza();
                int i6 = this.zze;
                zza3.zza(i6 > 0);
                zza3.zzb(i6);
                zza.zze(zza3);
                zzczVar2.zza((zziw) zza.zzi());
            } else {
                zzczVar = billingClientImpl.zzh;
                zzczVar.zzi(zzji.zzb());
            }
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
        }
        BillingClientImpl billingClientImpl2 = this.zza;
        obj = billingClientImpl2.zza;
        synchronized (obj) {
            i4 = billingClientImpl2.zzb;
            if (i4 != 3) {
                i5 = billingClientImpl2.zzb;
                if (i5 != 0) {
                    billingClientImpl2.zzbg(0);
                    billingClientImpl2.zzbj();
                    try {
                        this.zzb.onBillingServiceDisconnected();
                    } catch (Throwable th2) {
                        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                    }
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        int i4;
        Handler zzav;
        BillingResult zzay;
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Billing service connected.");
        BillingClientImpl billingClientImpl = this.zza;
        obj = billingClientImpl.zza;
        synchronized (obj) {
            try {
                i4 = billingClientImpl.zzb;
                if (i4 == 3) {
                    return;
                }
                billingClientImpl.zzi = com.google.android.gms.internal.play_billing.zzao.zzt(iBinder);
                Callable callable = new Callable() { // from class: com.android.billingclient.api.zzbu
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        zzbw.zza(zzbw.this);
                        return null;
                    }
                };
                Runnable runnable = new Runnable() { // from class: com.android.billingclient.api.zzbv
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbw.zzb(zzbw.this);
                    }
                };
                zzav = billingClientImpl.zzav();
                if (BillingClientImpl.zzK(callable, UserProfileProvider.SERVICE_CONNECTION_TIMEOUT_MS, runnable, zzav, billingClientImpl.zzJ()) == null) {
                    int i5 = this.zze;
                    zzay = billingClientImpl.zzay();
                    billingClientImpl.zzbf(zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, zzay, i5);
                    zzg(zzay);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        int i4;
        zzcz zzczVar;
        zzcz zzczVar2;
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Billing service disconnected.");
        try {
            BillingClientImpl billingClientImpl = this.zza;
            if (BillingClientImpl.zzaq(billingClientImpl)) {
                zzczVar2 = billingClientImpl.zzh;
                zziu zza = zziw.zza();
                zza.zzp(6);
                zzjb zza2 = zzjf.zza();
                zza2.zze(zzjd.SERVICE_DISCONNECTED);
                zza.zzb(zza2);
                zzks zza3 = zzku.zza();
                int i5 = this.zze;
                zza3.zza(i5 > 0);
                zza3.zzb(i5);
                zza.zze(zza3);
                zzczVar2.zza((zziw) zza.zzi());
            } else {
                zzczVar = billingClientImpl.zzh;
                zzczVar.zzk(zzkr.zzb());
            }
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th);
        }
        BillingClientImpl billingClientImpl2 = this.zza;
        obj = billingClientImpl2.zza;
        synchronized (obj) {
            try {
                com.google.android.gms.internal.play_billing.zzbl zzblVar = this.zzd;
                zzblVar.zzd();
                zzblVar.zze();
                i4 = billingClientImpl2.zzb;
                if (i4 == 3) {
                    return;
                }
                billingClientImpl2.zzbg(0);
                try {
                    this.zzb.onBillingServiceDisconnected();
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            } finally {
            }
        }
    }

    public final void zzc() {
        Object obj;
        obj = this.zza.zza;
        synchronized (obj) {
            com.google.android.gms.internal.play_billing.zzbl zzblVar = this.zzc;
            zzblVar.zzd();
            zzblVar.zze();
        }
    }

    final boolean zzd() {
        return this.zze > 0;
    }
}
