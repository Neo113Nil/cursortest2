package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgin extends zzgdu {
    private final zzgit zza;
    private final zzgul zzb;
    private final zzguk zzc;

    @Nullable
    private final Integer zzd;

    private zzgin(zzgit zzgitVar, zzgul zzgulVar, zzguk zzgukVar, @Nullable Integer num) {
        this.zza = zzgitVar;
        this.zzb = zzgulVar;
        this.zzc = zzgukVar;
        this.zzd = num;
    }

    public static zzgin zza(zzgis zzgisVar, zzgul zzgulVar, @Nullable Integer num) throws GeneralSecurityException {
        zzguk zzb;
        zzgis zzgisVar2 = zzgis.zzc;
        if (zzgisVar != zzgisVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + zzgisVar.toString() + " the value of idRequirement must be non-null");
        }
        if (zzgisVar == zzgisVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgulVar.zza() != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zzgulVar.zza());
        }
        zzgit zzc = zzgit.zzc(zzgisVar);
        if (zzc.zzb() == zzgisVar2) {
            zzb = zzguk.zzb(new byte[0]);
        } else if (zzc.zzb() == zzgis.zzb) {
            zzb = zzguk.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (zzc.zzb() != zzgis.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzc.zzb().toString()));
            }
            zzb = zzguk.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new zzgin(zzc, zzgulVar, zzb, num);
    }
}
