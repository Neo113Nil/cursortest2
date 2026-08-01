package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaum extends zzaux {
    public zzaum(zzatj zzatjVar, String str, String str2, zzapg zzapgVar, int i, int i2) {
        super(zzatjVar, "gcg2RhRsG0R6zuf6iT0eSF6U6iabmBM/me4U4ELIi5QicHmCf/u4OJEW9LFUXGGL", "I5l5b06e/m6OPcJVryww5aceHDWuWNMRDm4mYVrBvJQ=", zzapgVar, i, 73);
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        try {
            int i = 1;
            boolean booleanValue = ((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue();
            zzapg zzapgVar = this.zze;
            if (true == booleanValue) {
                i = 2;
            }
            zzapgVar.zzaf(i);
        } catch (InvocationTargetException unused) {
            this.zze.zzaf(3);
        }
    }
}
