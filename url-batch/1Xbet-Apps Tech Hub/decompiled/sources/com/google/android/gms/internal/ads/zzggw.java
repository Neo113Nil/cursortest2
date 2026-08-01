package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzggw extends zzgdu {
    private final zzghb zza;
    private final zzgul zzb;
    private final zzguk zzc;

    @Nullable
    private final Integer zzd;

    private zzggw(zzghb zzghbVar, zzgul zzgulVar, zzguk zzgukVar, @Nullable Integer num) {
        this.zza = zzghbVar;
        this.zzb = zzgulVar;
        this.zzc = zzgukVar;
        this.zzd = num;
    }

    public static zzggw zza(zzgha zzghaVar, zzgul zzgulVar, @Nullable Integer num) throws GeneralSecurityException {
        zzguk zzb;
        zzgha zzghaVar2 = zzgha.zzc;
        if (zzghaVar != zzghaVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + zzghaVar.toString() + " the value of idRequirement must be non-null");
        }
        if (zzghaVar == zzghaVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgulVar.zza() != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zzgulVar.zza());
        }
        zzghb zzc = zzghb.zzc(zzghaVar);
        if (zzc.zzb() == zzghaVar2) {
            zzb = zzguk.zzb(new byte[0]);
        } else if (zzc.zzb() == zzgha.zzb) {
            zzb = zzguk.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (zzc.zzb() != zzgha.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzc.zzb().toString()));
            }
            zzb = zzguk.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new zzggw(zzc, zzgulVar, zzb, num);
    }
}
