package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzaxa extends zzaxl {
    public zzaxa(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i, int i2) {
        super(zzavxVar, "ExKA4wjDRRYdztAsabUEoV5NOADo4vSkAwQNa4IGw0yLC0NQlDOhDdBTfDT5YHOb", "1Gz3ZRhjJNvXJ0g284S9b/dpVAajMMfg8CE3pBcFNFA=", zzarwVar, i, 73);
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        try {
            boolean booleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
            zzarw zzarwVar = this.zzd;
            int i = 1;
            if (true == booleanValue) {
                i = 2;
            }
            zzarwVar.zzah(i);
        } catch (InvocationTargetException unused) {
            this.zzd.zzah(3);
        }
    }
}
