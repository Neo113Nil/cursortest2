package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzauh extends zzaux {
    private final zzatb zzi;

    public zzauh(zzatj zzatjVar, String str, String str2, zzapg zzapgVar, int i, int i2, zzatb zzatbVar) {
        super(zzatjVar, "tfuuP59pzWN+H8zv1geT3jADiBKBGMQRjmCPoIvL5f45Lvl5qgJ0PgBqZF4WPnQj", "MIrDuKB7N0O22daoYjLtFOJg5TtVRHK1+0ktwmGNtdU=", zzapgVar, i, 94);
        this.zzi = zzatbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        int intValue = ((Integer) this.zzf.invoke(null, this.zzi.zza())).intValue();
        synchronized (this.zze) {
            this.zze.zzae(zzapu.zza(intValue));
        }
    }
}
