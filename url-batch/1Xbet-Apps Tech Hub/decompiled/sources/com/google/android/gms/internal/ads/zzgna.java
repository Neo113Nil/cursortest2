package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgna implements zzgdl {
    private static final zzgna zza = new zzgna();

    private zzgna() {
    }

    static void zzd() throws GeneralSecurityException {
        zzgdo.zzf(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgdl
    public final Class zza() {
        return zzgmx.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgdl
    public final Class zzb() {
        return zzgmx.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgdl
    public final /* bridge */ /* synthetic */ Object zzc(zzgdk zzgdkVar) throws GeneralSecurityException {
        if (zzgdkVar.zza() == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator it = zzgdkVar.zzd().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new zzgmz(zzgdkVar, null);
    }
}
