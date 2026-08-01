package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzevj implements zzeuy {
    private final zzgbl zza;
    private final Context zzb;

    public zzevj(zzgbl zzgblVar, Context context) {
        this.zza = zzgblVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 39;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzevi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzevj.this.zzc();
            }
        });
    }

    final /* synthetic */ zzevh zzc() throws Exception {
        boolean z;
        int i;
        TelephonyManager telephonyManager = (TelephonyManager) this.zzb.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        com.google.android.gms.ads.internal.zzt.zzp();
        int i2 = -1;
        if (com.google.android.gms.ads.internal.util.zzt.zzz(this.zzb, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.zzb.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i = type;
                i2 = ordinal;
            } else {
                i = -1;
            }
            z = connectivityManager.isActiveNetworkMetered();
        } else {
            z = false;
            i = -2;
        }
        return new zzevh(networkOperator, i, com.google.android.gms.ads.internal.zzt.zzq().zzn(this.zzb), phoneType, z, i2);
    }
}
