package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzglj extends zzgdy {
    private final zzgnl zza;

    public zzglj(zzgnl zzgnlVar, @Nullable zzger zzgerVar) throws GeneralSecurityException {
        zzc(zzgnlVar, zzgerVar);
        this.zza = zzgnlVar;
    }

    private static void zzc(zzgnl zzgnlVar, @Nullable zzger zzgerVar) throws GeneralSecurityException {
        int i = zzgli.zzb[zzgnlVar.zzb().ordinal()];
    }

    public final zzgnl zza(@Nullable zzger zzgerVar) throws GeneralSecurityException {
        zzc(this.zza, zzgerVar);
        return this.zza;
    }

    @Nullable
    public final Integer zzb() {
        return this.zza.zzf();
    }
}
