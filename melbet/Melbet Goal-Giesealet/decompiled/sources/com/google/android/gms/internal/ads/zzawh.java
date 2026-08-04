package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzawh extends zzaxl {
    private final Activity zzh;
    private final View zzi;

    public zzawh(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i, int i2, View view, Activity activity) {
        super(zzavxVar, "YJMz4lZ/SFOXN6kW19UKnvAqcLtndNv4f6er9d24/5MuXcrsMTIC+9Jfbhpe2HMW", "6iuDHA2XEqaGCIdpenyLvoYWzHjKpoW5EjYN40bz5Cs=", zzarwVar, i, 62);
        this.zzi = view;
        this.zzh = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        View view = this.zzi;
        if (view == null) {
            return;
        }
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcU)).booleanValue();
        Object[] objArr = (Object[]) this.zze.invoke(null, view, this.zzh, Boolean.valueOf(booleanValue));
        zzarw zzarwVar = this.zzd;
        synchronized (zzarwVar) {
            zzarwVar.zzS(((Long) objArr[0]).longValue());
            zzarwVar.zzT(((Long) objArr[1]).longValue());
            if (booleanValue) {
                zzarwVar.zzU((String) objArr[2]);
            }
        }
    }
}
