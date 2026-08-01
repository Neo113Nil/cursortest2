package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzatt extends zzaux {
    private final Activity zzi;
    private final View zzj;

    public zzatt(zzatj zzatjVar, String str, String str2, zzapg zzapgVar, int i, int i2, View view, Activity activity) {
        super(zzatjVar, "XCj6cS5OVeEeObzd394PGDbjTuQh+vSye2UT6221ugsKtO2/oznWOSes2cnebrVR", "/UZ99NhZDGBVc8wZVXmC2wC/MG54XdFcRWhDAwHbwWE=", zzapgVar, i, 62);
        this.zzj = view;
        this.zzi = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzj == null) {
            return;
        }
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzcs)).booleanValue();
        Object[] objArr = (Object[]) this.zzf.invoke(null, this.zzj, this.zzi, Boolean.valueOf(booleanValue));
        synchronized (this.zze) {
            this.zze.zzc(((Long) objArr[0]).longValue());
            this.zze.zze(((Long) objArr[1]).longValue());
            if (booleanValue) {
                this.zze.zzd((String) objArr[2]);
            }
        }
    }
}
