package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzbax extends zzbby {
    private static final zzbbz zzh = new zzbbz();
    private final Context zzi;

    public zzbax(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i, int i2, Context context) {
        super(zzbakVar, "BJ0iIx7YCr6PyW+pyNNozQaB62BBi5nixFl6WJUaFdU4X2GlfptGfOLgFJ7ri6Ag", "ovMA5nrmsfMPPc1p4911nPRjAFxE4I+3QWZwZMrn+uQ=", zzawgVar, i, 29);
        this.zzi = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzp(ExifInterface.LONGITUDE_EAST);
        Context context = this.zzi;
        AtomicReference zza = zzh.zza(context.getPackageName());
        if (zza.get() == null) {
            synchronized (zza) {
                if (zza.get() == null) {
                    zza.set((String) this.zze.invoke(null, context));
                }
            }
        }
        String str = (String) zza.get();
        zzawg zzawgVar = this.zzd;
        synchronized (zzawgVar) {
            zzawgVar.zzp(zzaya.zza(str.getBytes(), true));
        }
    }
}
