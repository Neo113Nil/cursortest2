package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzghx {

    @Nullable
    private String zza;

    @Nullable
    private zzghy zzb;

    @Nullable
    private zzgdv zzc;

    private zzghx() {
    }

    /* synthetic */ zzghx(zzghw zzghwVar) {
    }

    public final zzghx zza(zzgdv zzgdvVar) {
        this.zzc = zzgdvVar;
        return this;
    }

    public final zzghx zzb(zzghy zzghyVar) {
        this.zzb = zzghyVar;
        return this;
    }

    public final zzghx zzc(String str) {
        this.zza = str;
        return this;
    }

    public final zzgia zzd() throws GeneralSecurityException {
        if (this.zza == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        zzghy zzghyVar = this.zzb;
        if (zzghyVar == null) {
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        zzgdv zzgdvVar = this.zzc;
        if (zzgdvVar == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (zzgdvVar.zza()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must note have ID Requirements");
        }
        if ((zzghyVar.equals(zzghy.zza) && (zzgdvVar instanceof zzgfy)) || ((zzghyVar.equals(zzghy.zzc) && (zzgdvVar instanceof zzghb)) || ((zzghyVar.equals(zzghy.zzb) && (zzgdvVar instanceof zzgit)) || ((zzghyVar.equals(zzghy.zzd) && (zzgdvVar instanceof zzgem)) || ((zzghyVar.equals(zzghy.zze) && (zzgdvVar instanceof zzgfg)) || (zzghyVar.equals(zzghy.zzf) && (zzgdvVar instanceof zzggq))))))) {
            return new zzgia(this.zza, this.zzb, this.zzc, null);
        }
        throw new GeneralSecurityException("Cannot use parsing strategy " + this.zzb.toString() + " when new keys are picked according to " + String.valueOf(this.zzc) + ".");
    }
}
