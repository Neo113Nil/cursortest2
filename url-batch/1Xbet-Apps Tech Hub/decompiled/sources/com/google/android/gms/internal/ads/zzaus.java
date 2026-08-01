package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaus extends zzaux {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzaus(zzatj zzatjVar, String str, String str2, zzapg zzapgVar, int i, int i2) {
        super(zzatjVar, "pfTqFlR1an7kDUBzP8CmJZynZFAzKap0OWhefexY5E+9LoDEPq/g9ouqCw4/+GOX", "y+BEEb1lYOUGwTehZ9VIg/2gibmtEOjDZzKXHhs5BV0=", zzapgVar, i, 33);
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzi == null) {
            synchronized (zzj) {
                if (zzi == null) {
                    zzi = (Long) this.zzf.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzV(zzi.longValue());
        }
    }
}
