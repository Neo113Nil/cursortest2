package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzatw extends zzaux {
    private static final zzauy zzi = new zzauy();
    private final Context zzj;

    public zzatw(zzatj zzatjVar, String str, String str2, zzapg zzapgVar, int i, int i2, Context context) {
        super(zzatjVar, "gL88T2vBvJS+jBemUvhPpVS5IeaU7cU4wFVgyT6PJl7pFldWXOd3mZxVZlQUSll5", "bObXLZFRWAdU6+me08AeNX2ciqxi45ddv3QSqAplzos=", zzapgVar, i, 29);
        this.zzj = context;
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzn(ExifInterface.LONGITUDE_EAST);
        AtomicReference zza = zzi.zza(this.zzj.getPackageName());
        if (zza.get() == null) {
            synchronized (zza) {
                if (zza.get() == null) {
                    zza.set((String) this.zzf.invoke(null, this.zzj));
                }
            }
        }
        String str = (String) zza.get();
        synchronized (this.zze) {
            this.zze.zzn(zzaqt.zza(str.getBytes(), true));
        }
    }
}
