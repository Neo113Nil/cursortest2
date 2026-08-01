package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaun extends zzaux {
    private List zzi;
    private final Context zzj;

    public zzaun(zzatj zzatjVar, String str, String str2, zzapg zzapgVar, int i, int i2, Context context) {
        super(zzatjVar, "y3yRmC/kyT5sblAh6MVmMMe529YDQrbaaQxNMdjlDdcJ+gZ0vSS7aY/hNYvCePEW", "Y0trGqGVEUAa7A3LYgSQFKe4N9h1BuTC7OKFYCHfLSg=", zzapgVar, i, 31);
        this.zzi = null;
        this.zzj = context;
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzW(-1L);
        this.zze.zzS(-1L);
        Context context = this.zzj;
        if (context == null) {
            context = this.zzb.zzb();
        }
        if (this.zzi == null) {
            this.zzi = (List) this.zzf.invoke(null, context);
        }
        List list = this.zzi;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.zze) {
            this.zze.zzW(((Long) this.zzi.get(0)).longValue());
            this.zze.zzS(((Long) this.zzi.get(1)).longValue());
        }
    }
}
