package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzbbv extends zzbby {
    private final View zzh;

    public zzbbv(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i, int i2, View view) {
        super(zzbakVar, "FW20C8Ai9koIlsaxQSE6ztByFAH2b9HaWXnzViOGstPwi5iqItbLmay/ubT2VSsg", "WvzwBqCGqiupQVgrtkQ81CPfk2zDbRT3OzniCOJeuxU=", zzawgVar, i, 57);
        this.zzh = view;
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        View view = this.zzh;
        if (view != null) {
            Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzel);
            Boolean bool2 = (Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmu);
            zzbao zzbaoVar = new zzbao((String) this.zze.invoke(null, view, this.zza.zzb().getResources().getDisplayMetrics(), bool, bool2));
            zzaxe zza = zzaxf.zza();
            zza.zzb(zzbaoVar.zza.longValue());
            zza.zzc(zzbaoVar.zzb.longValue());
            zza.zzd(zzbaoVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zza.zza(zzbaoVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zza.zze(zzbaoVar.zzd.longValue());
            }
            this.zzd.zzM((zzaxf) zza.zzbu());
        }
    }
}
