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
import com.google.android.gms.internal.play_billing.zzjx;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzke;
import com.google.android.gms.internal.play_billing.zzki;
import com.google.android.gms.internal.play_billing.zzkl;
import com.google.android.gms.internal.play_billing.zzlo;
import com.google.android.gms.internal.play_billing.zzlq;
import com.google.android.gms.internal.play_billing.zzlu;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: classes13.dex */
final class zzba implements ServiceConnection {
    final /* synthetic */ BillingClientImpl zza;
    private final BillingClientStateListener zzb;

    /* synthetic */ zzba(BillingClientImpl billingClientImpl, BillingClientStateListener billingClientStateListener, zzbl zzblVar) {
        this.zza = billingClientImpl;
        this.zzb = billingClientStateListener;
    }

    private final void zzc(BillingResult billingResult) {
        Object obj;
        int i;
        obj = this.zza.zza;
        synchronized (obj) {
            try {
                i = this.zza.zzb;
                if (i == 3) {
                    return;
                }
                this.zzb.onBillingSetupFinished(billingResult);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        Object obj;
        int i;
        int i2;
        zzch zzchVar;
        zzch zzchVar2;
        com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Billing service died.");
        try {
            if (BillingClientImpl.zzaq(this.zza)) {
                zzchVar2 = this.zza.zzg;
                zzjx zzc = zzjz.zzc();
                zzc.zzn(6);
                zzke zzc2 = zzki.zzc();
                zzc2.zzo(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                zzc.zza(zzc2);
                zzchVar2.zza((zzjz) zzc.zzf());
            } else {
                zzchVar = this.zza.zzg;
                zzchVar.zze(zzkl.zzB());
            }
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Unable to log.", th);
        }
        obj = this.zza.zza;
        synchronized (obj) {
            i = this.zza.zzb;
            if (i != 3) {
                i2 = this.zza.zzb;
                if (i2 != 0) {
                    this.zza.zzaJ(0);
                    this.zza.zzaL();
                    this.zzb.onBillingServiceDisconnected();
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        int i;
        Handler zzax;
        Future zzE;
        BillingResult zzaA;
        com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Billing service connected.");
        obj = this.zza.zza;
        synchronized (obj) {
            try {
                i = this.zza.zzb;
                if (i == 3) {
                    return;
                }
                this.zza.zzh = com.google.android.gms.internal.play_billing.zzam.zzu(iBinder);
                BillingClientImpl billingClientImpl = this.zza;
                Callable callable = new Callable() { // from class: com.android.billingclient.api.zzay
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        zzba.this.zza();
                        return null;
                    }
                };
                Runnable runnable = new Runnable() { // from class: com.android.billingclient.api.zzaz
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzba.this.zzb();
                    }
                };
                zzax = billingClientImpl.zzax();
                zzE = BillingClientImpl.zzE(callable, 30000L, runnable, zzax, billingClientImpl.zzaD());
                if (zzE == null) {
                    BillingClientImpl billingClientImpl2 = this.zza;
                    zzaA = billingClientImpl2.zzaA();
                    billingClientImpl2.zzbe(25, 6, zzaA);
                    zzc(zzaA);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        int i;
        zzch zzchVar;
        zzch zzchVar2;
        com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Billing service disconnected.");
        try {
            if (BillingClientImpl.zzaq(this.zza)) {
                zzchVar2 = this.zza.zzg;
                zzjx zzc = zzjz.zzc();
                zzc.zzn(6);
                zzke zzc2 = zzki.zzc();
                zzc2.zzo(Sdk.SDKError.Reason.TPAT_ERROR_VALUE);
                zzc.zza(zzc2);
                zzchVar2.zza((zzjz) zzc.zzf());
            } else {
                zzchVar = this.zza.zzg;
                zzchVar.zzg(zzlu.zzB());
            }
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Unable to log.", th);
        }
        obj = this.zza.zza;
        synchronized (obj) {
            try {
                i = this.zza.zzb;
                if (i == 3) {
                    return;
                }
                this.zza.zzaJ(0);
                this.zzb.onBillingServiceDisconnected();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0278  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ Object zza() throws Exception {
        Object obj;
        int i;
        int i2;
        Bundle bundle;
        boolean z;
        int i3;
        int i4;
        String zza;
        int i5;
        zzch zzchVar;
        zzch zzchVar2;
        Object obj2;
        com.google.android.gms.internal.play_billing.zzan zzanVar;
        Context context;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Object obj3;
        int i22;
        zzn zznVar;
        boolean z2;
        int i23;
        String str;
        Long l;
        obj = this.zza.zza;
        synchronized (obj) {
            try {
                i = this.zza.zzb;
                if (i != 3) {
                    i2 = this.zza.zzb;
                    if (TextUtils.isEmpty(null)) {
                        bundle = null;
                    } else {
                        bundle = new Bundle();
                        bundle.putString("accountName", null);
                        BillingClientImpl billingClientImpl = this.zza;
                        str = billingClientImpl.zzc;
                        l = billingClientImpl.zzF;
                        com.google.android.gms.internal.play_billing.zze.zzc(bundle, str, l.longValue());
                    }
                    try {
                        obj2 = this.zza.zza;
                        synchronized (obj2) {
                            zzanVar = this.zza.zzh;
                        }
                    } catch (Exception e) {
                        z = i2 != 1;
                        com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                        if (e instanceof DeadObjectException) {
                            i4 = 101;
                        } else if (e instanceof RemoteException) {
                            i4 = 100;
                        } else if (e instanceof SecurityException) {
                            i4 = 102;
                        } else {
                            i3 = 42;
                            zza = i3 != 42 ? zzcg.zza(e) : null;
                            this.zza.zzaJ(0);
                            i5 = 6;
                        }
                        i3 = i4;
                        if (i3 != 42) {
                        }
                        this.zza.zzaJ(0);
                        i5 = 6;
                    }
                    if (zzanVar == null) {
                        this.zza.zzaJ(0);
                        BillingClientImpl billingClientImpl2 = this.zza;
                        BillingResult billingResult = zzcj.zzm;
                        billingClientImpl2.zzbe(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 6, billingResult);
                        zzc(billingResult);
                    } else {
                        context = this.zza.zzf;
                        String packageName = context.getPackageName();
                        i5 = 3;
                        int i24 = 23;
                        while (true) {
                            if (i24 < 3) {
                                i24 = 0;
                                break;
                            }
                            i5 = bundle == null ? zzanVar.zzy(i24, packageName, "subs") : zzanVar.zzc(i24, packageName, "subs", bundle);
                            if (i5 == 0) {
                                com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "highestLevelSupportedForSubs: " + i24);
                                break;
                            }
                            i24--;
                        }
                        this.zza.zzk = i24 >= 5;
                        this.zza.zzj = i24 >= 3;
                        if (i24 < 3) {
                            com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "In-app billing API does not support subscription on this device.");
                            i3 = 9;
                        } else {
                            i3 = 1;
                        }
                        int i25 = 23;
                        while (true) {
                            if (i25 < 3) {
                                break;
                            }
                            i5 = bundle == null ? zzanVar.zzy(i25, packageName, "inapp") : zzanVar.zzc(i25, packageName, "inapp", bundle);
                            if (i5 == 0) {
                                this.zza.zzl = i25;
                                i23 = this.zza.zzl;
                                com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "mHighestLevelSupportedForInApp: " + i23);
                                break;
                            }
                            i25--;
                        }
                        BillingClientImpl billingClientImpl3 = this.zza;
                        i6 = billingClientImpl3.zzl;
                        billingClientImpl3.zzA = i6 >= 23;
                        BillingClientImpl billingClientImpl4 = this.zza;
                        i7 = billingClientImpl4.zzl;
                        billingClientImpl4.zzz = i7 >= 22;
                        BillingClientImpl billingClientImpl5 = this.zza;
                        i8 = billingClientImpl5.zzl;
                        billingClientImpl5.zzy = i8 >= 21;
                        BillingClientImpl billingClientImpl6 = this.zza;
                        i9 = billingClientImpl6.zzl;
                        billingClientImpl6.zzx = i9 >= 20;
                        BillingClientImpl billingClientImpl7 = this.zza;
                        i10 = billingClientImpl7.zzl;
                        billingClientImpl7.zzw = i10 >= 19;
                        BillingClientImpl billingClientImpl8 = this.zza;
                        i11 = billingClientImpl8.zzl;
                        billingClientImpl8.zzv = i11 >= 18;
                        BillingClientImpl billingClientImpl9 = this.zza;
                        i12 = billingClientImpl9.zzl;
                        billingClientImpl9.zzu = i12 >= 17;
                        BillingClientImpl billingClientImpl10 = this.zza;
                        i13 = billingClientImpl10.zzl;
                        billingClientImpl10.zzt = i13 >= 16;
                        BillingClientImpl billingClientImpl11 = this.zza;
                        i14 = billingClientImpl11.zzl;
                        billingClientImpl11.zzs = i14 >= 15;
                        BillingClientImpl billingClientImpl12 = this.zza;
                        i15 = billingClientImpl12.zzl;
                        billingClientImpl12.zzr = i15 >= 14;
                        BillingClientImpl billingClientImpl13 = this.zza;
                        i16 = billingClientImpl13.zzl;
                        billingClientImpl13.zzq = i16 >= 12;
                        BillingClientImpl billingClientImpl14 = this.zza;
                        i17 = billingClientImpl14.zzl;
                        billingClientImpl14.zzp = i17 >= 10;
                        BillingClientImpl billingClientImpl15 = this.zza;
                        i18 = billingClientImpl15.zzl;
                        billingClientImpl15.zzo = i18 >= 9;
                        BillingClientImpl billingClientImpl16 = this.zza;
                        i19 = billingClientImpl16.zzl;
                        billingClientImpl16.zzn = i19 >= 8;
                        BillingClientImpl billingClientImpl17 = this.zza;
                        i20 = billingClientImpl17.zzl;
                        billingClientImpl17.zzm = i20 >= 6;
                        i21 = this.zza.zzl;
                        if (i21 < 3) {
                            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "In-app billing API version 3 is not supported on this device.");
                            i3 = 36;
                        }
                        if (i5 == 0) {
                            obj3 = this.zza.zza;
                            synchronized (obj3) {
                                try {
                                    i22 = this.zza.zzb;
                                    if (i22 != 3) {
                                        z = i2 != 1;
                                        this.zza.zzaJ(2);
                                        zznVar = this.zza.zze;
                                        zzn zznVar2 = zznVar != null ? this.zza.zze : null;
                                        if (zznVar2 != null) {
                                            z2 = this.zza.zzy;
                                            zznVar2.zzg(z2);
                                        }
                                    }
                                } finally {
                                }
                            }
                        } else {
                            z = i2 != 1;
                            this.zza.zzaJ(0);
                        }
                        zza = null;
                        if (i5 == 0) {
                            try {
                                if (true != z) {
                                    this.zza.zzbg(6);
                                } else {
                                    zzchVar = this.zza.zzg;
                                    zzlo zzc = zzlq.zzc();
                                    zzke zzc2 = zzki.zzc();
                                    zzc2.zzn(0);
                                    zzc.zza(zzc2);
                                    zzchVar.zzf((zzlq) zzc.zzf());
                                }
                            } catch (Throwable th) {
                                com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Unable to log.", th);
                            }
                            zzc(zzcj.zzl);
                        } else {
                            BillingResult billingResult2 = zzcj.zza;
                            try {
                                if (true != z) {
                                    this.zza.zzbf(i3, 6, billingResult2, zza);
                                } else {
                                    zzke zzc3 = zzki.zzc();
                                    zzc3.zzn(billingResult2.getResponseCode());
                                    zzc3.zzm(billingResult2.getDebugMessage());
                                    zzc3.zzo(i3);
                                    if (zza != null) {
                                        zzc3.zza(zza);
                                    }
                                    zzchVar2 = this.zza.zzg;
                                    zzlo zzc4 = zzlq.zzc();
                                    zzc4.zzm((zzki) zzc3.zzf());
                                    zzchVar2.zzf((zzlq) zzc4.zzf());
                                }
                            } catch (Throwable th2) {
                                com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Unable to log.", th2);
                            }
                            zzc(zzcj.zza);
                        }
                    }
                }
            } finally {
            }
        }
        return null;
    }

    final /* synthetic */ void zzb() {
        this.zza.zzaJ(0);
        BillingResult billingResult = zzcj.zzn;
        this.zza.zzbe(24, 6, billingResult);
        zzc(billingResult);
    }
}
