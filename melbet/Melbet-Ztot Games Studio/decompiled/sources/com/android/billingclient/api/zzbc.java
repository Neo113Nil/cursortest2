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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.work.WorkRequest;
import com.google.android.gms.internal.play_billing.zzhl;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
final class zzbc implements ServiceConnection {
    final /* synthetic */ BillingClientImpl zza;
    private final Object zzb = new Object();
    private boolean zzc = false;
    private BillingClientStateListener zzd;

    /* synthetic */ zzbc(BillingClientImpl billingClientImpl, BillingClientStateListener billingClientStateListener, zzbb zzbbVar) {
        this.zza = billingClientImpl;
        this.zzd = billingClientStateListener;
    }

    private final void zzd(BillingResult billingResult) {
        synchronized (this.zzb) {
            BillingClientStateListener billingClientStateListener = this.zzd;
            if (billingClientStateListener != null) {
                billingClientStateListener.onBillingSetupFinished(billingResult);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Handler zzaj;
        Future zzao;
        BillingResult zzal;
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Billing service connected.");
        this.zza.zzg = com.google.android.gms.internal.play_billing.zzr.zzu(iBinder);
        Callable callable = new Callable() { // from class: com.android.billingclient.api.zzaz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzbc.this.zza();
                return null;
            }
        };
        Runnable runnable = new Runnable() { // from class: com.android.billingclient.api.zzba
            @Override // java.lang.Runnable
            public final void run() {
                zzbc.this.zzb();
            }
        };
        BillingClientImpl billingClientImpl = this.zza;
        zzaj = billingClientImpl.zzaj();
        zzao = billingClientImpl.zzao(callable, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, runnable, zzaj);
        if (zzao == null) {
            BillingClientImpl billingClientImpl2 = this.zza;
            zzal = billingClientImpl2.zzal();
            billingClientImpl2.zzap(zzcb.zza(25, 6, zzal));
            zzd(zzal);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzcc zzccVar;
        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Billing service disconnected.");
        zzccVar = this.zza.zzf;
        zzccVar.zze(zzhl.zzz());
        this.zza.zzg = null;
        this.zza.zza = 0;
        synchronized (this.zzb) {
            BillingClientStateListener billingClientStateListener = this.zzd;
            if (billingClientStateListener != null) {
                billingClientStateListener.onBillingServiceDisconnected();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0262  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ Object zza() throws Exception {
        Bundle bundle;
        int i;
        String str;
        int i2;
        Context context;
        int i3;
        int i4;
        int i5;
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
        zzo zzoVar;
        zzo zzoVar2;
        boolean z;
        com.google.android.gms.internal.play_billing.zzs zzsVar;
        int i18;
        com.google.android.gms.internal.play_billing.zzs zzsVar2;
        com.google.android.gms.internal.play_billing.zzs zzsVar3;
        com.google.android.gms.internal.play_billing.zzs zzsVar4;
        synchronized (this.zzb) {
            if (!this.zzc) {
                if (TextUtils.isEmpty(null)) {
                    bundle = null;
                } else {
                    bundle = new Bundle();
                    bundle.putString("accountName", null);
                }
                int i19 = 3;
                try {
                    context = this.zza.zze;
                    String packageName = context.getPackageName();
                    int i20 = 22;
                    i2 = 3;
                    while (true) {
                        if (i20 < 3) {
                            i20 = 0;
                            break;
                        }
                        if (bundle == null) {
                            try {
                                zzsVar3 = this.zza.zzg;
                                i2 = zzsVar3.zzy(i20, packageName, "subs");
                            } catch (Exception e) {
                                e = e;
                                i19 = i2;
                                com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                i = e instanceof DeadObjectException ? TypedValues.TYPE_TARGET : e instanceof RemoteException ? 100 : e instanceof SecurityException ? 102 : 42;
                                if (i == 42) {
                                    str = e.getClass().getSimpleName() + ": " + com.google.android.gms.internal.play_billing.zzab.zzb(e.getMessage());
                                    if (str.length() > 70) {
                                        str = str.substring(0, 70);
                                    }
                                } else {
                                    str = null;
                                }
                                this.zza.zza = 0;
                                this.zza.zzg = null;
                                i2 = i19;
                                if (i2 != 0) {
                                }
                                return null;
                            }
                        } else {
                            zzsVar4 = this.zza.zzg;
                            i2 = zzsVar4.zzc(i20, packageName, "subs", bundle);
                        }
                        if (i2 == 0) {
                            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "highestLevelSupportedForSubs: " + i20);
                            break;
                        }
                        i20--;
                    }
                    boolean z2 = true;
                    this.zza.zzj = i20 >= 5;
                    this.zza.zzi = i20 >= 3;
                    if (i20 < 3) {
                        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "In-app billing API does not support subscription on this device.");
                        i = 9;
                    } else {
                        i = 1;
                    }
                    int i21 = 22;
                    while (true) {
                        if (i21 < 3) {
                            break;
                        }
                        if (bundle == null) {
                            zzsVar2 = this.zza.zzg;
                            i2 = zzsVar2.zzy(i21, packageName, "inapp");
                        } else {
                            zzsVar = this.zza.zzg;
                            i2 = zzsVar.zzc(i21, packageName, "inapp", bundle);
                        }
                        if (i2 == 0) {
                            this.zza.zzk = i21;
                            i18 = this.zza.zzk;
                            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "mHighestLevelSupportedForInApp: " + i18);
                            break;
                        }
                        i21--;
                    }
                    BillingClientImpl billingClientImpl = this.zza;
                    i3 = billingClientImpl.zzk;
                    billingClientImpl.zzy = i3 >= 22;
                    BillingClientImpl billingClientImpl2 = this.zza;
                    i4 = billingClientImpl2.zzk;
                    billingClientImpl2.zzx = i4 >= 21;
                    BillingClientImpl billingClientImpl3 = this.zza;
                    i5 = billingClientImpl3.zzk;
                    billingClientImpl3.zzw = i5 >= 20;
                    BillingClientImpl billingClientImpl4 = this.zza;
                    i6 = billingClientImpl4.zzk;
                    billingClientImpl4.zzv = i6 >= 19;
                    BillingClientImpl billingClientImpl5 = this.zza;
                    i7 = billingClientImpl5.zzk;
                    billingClientImpl5.zzu = i7 >= 18;
                    BillingClientImpl billingClientImpl6 = this.zza;
                    i8 = billingClientImpl6.zzk;
                    billingClientImpl6.zzt = i8 >= 17;
                    BillingClientImpl billingClientImpl7 = this.zza;
                    i9 = billingClientImpl7.zzk;
                    billingClientImpl7.zzs = i9 >= 16;
                    BillingClientImpl billingClientImpl8 = this.zza;
                    i10 = billingClientImpl8.zzk;
                    billingClientImpl8.zzr = i10 >= 15;
                    BillingClientImpl billingClientImpl9 = this.zza;
                    i11 = billingClientImpl9.zzk;
                    billingClientImpl9.zzq = i11 >= 14;
                    BillingClientImpl billingClientImpl10 = this.zza;
                    i12 = billingClientImpl10.zzk;
                    billingClientImpl10.zzp = i12 >= 12;
                    BillingClientImpl billingClientImpl11 = this.zza;
                    i13 = billingClientImpl11.zzk;
                    billingClientImpl11.zzo = i13 >= 10;
                    BillingClientImpl billingClientImpl12 = this.zza;
                    i14 = billingClientImpl12.zzk;
                    billingClientImpl12.zzn = i14 >= 9;
                    BillingClientImpl billingClientImpl13 = this.zza;
                    i15 = billingClientImpl13.zzk;
                    billingClientImpl13.zzm = i15 >= 8;
                    BillingClientImpl billingClientImpl14 = this.zza;
                    i16 = billingClientImpl14.zzk;
                    if (i16 < 6) {
                        z2 = false;
                    }
                    billingClientImpl14.zzl = z2;
                    i17 = this.zza.zzk;
                    if (i17 < 3) {
                        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "In-app billing API version 3 is not supported on this device.");
                        i = 36;
                    }
                    if (i2 == 0) {
                        this.zza.zza = 2;
                        zzoVar = this.zza.zzd;
                        if (zzoVar != null) {
                            zzoVar2 = this.zza.zzd;
                            z = this.zza.zzx;
                            zzoVar2.zzg(z);
                        }
                    } else {
                        this.zza.zza = 0;
                        this.zza.zzg = null;
                    }
                    str = null;
                } catch (Exception e2) {
                    e = e2;
                }
                if (i2 != 0) {
                    this.zza.zzaq(zzcb.zzc(6));
                    zzd(zzce.zzl);
                } else {
                    this.zza.zzap(zzcb.zzb(i, 6, zzce.zza, str));
                    zzd(zzce.zza);
                }
            }
        }
        return null;
    }

    final /* synthetic */ void zzb() {
        this.zza.zza = 0;
        this.zza.zzg = null;
        this.zza.zzap(zzcb.zza(24, 6, zzce.zzn));
        zzd(zzce.zzn);
    }

    final void zzc() {
        synchronized (this.zzb) {
            this.zzd = null;
            this.zzc = true;
        }
    }
}
