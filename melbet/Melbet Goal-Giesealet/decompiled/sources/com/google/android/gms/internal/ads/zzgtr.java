package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzgtr {

    @Nullable
    private zzgtt zza;

    @Nullable
    private String zzb;

    @Nullable
    private zzgts zzc;

    @Nullable
    private zzgrg zzd;

    private zzgtr() {
        throw null;
    }

    /* synthetic */ zzgtr(byte[] bArr) {
    }

    public final zzgtr zza(zzgtt zzgttVar) {
        this.zza = zzgttVar;
        return this;
    }

    public final zzgtr zzb(String str) {
        this.zzb = str;
        return this;
    }

    public final zzgtr zzc(zzgts zzgtsVar) {
        this.zzc = zzgtsVar;
        return this;
    }

    public final zzgtr zzd(zzgrg zzgrgVar) {
        this.zzd = zzgrgVar;
        return this;
    }

    public final zzgtu zze() throws GeneralSecurityException {
        if (this.zza == null) {
            this.zza = zzgtt.zzb;
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        zzgts zzgtsVar = this.zzc;
        if (zzgtsVar == null) {
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        zzgrg zzgrgVar = this.zzd;
        if (zzgrgVar == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (zzgrgVar.zza()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((zzgtsVar.equals(zzgts.zza) && (zzgrgVar instanceof zzgsl)) || ((zzgtsVar.equals(zzgts.zzc) && (zzgrgVar instanceof zzgta)) || ((zzgtsVar.equals(zzgts.zzb) && (zzgrgVar instanceof zzguw)) || ((zzgtsVar.equals(zzgts.zzd) && (zzgrgVar instanceof zzgru)) || ((zzgtsVar.equals(zzgts.zze) && (zzgrgVar instanceof zzgsc)) || (zzgtsVar.equals(zzgts.zzf) && (zzgrgVar instanceof zzgsu))))))) {
            return new zzgtu(this.zza, this.zzb, this.zzc, this.zzd, null);
        }
        String zzgtsVar2 = this.zzc.toString();
        String valueOf = String.valueOf(this.zzd);
        StringBuilder sb = new StringBuilder(zzgtsVar2.length() + 67 + String.valueOf(valueOf).length() + 1);
        sb.append("Cannot use parsing strategy ");
        sb.append(zzgtsVar2);
        sb.append(" when new keys are picked according to ");
        sb.append(valueOf);
        sb.append(".");
        throw new GeneralSecurityException(sb.toString());
    }
}
