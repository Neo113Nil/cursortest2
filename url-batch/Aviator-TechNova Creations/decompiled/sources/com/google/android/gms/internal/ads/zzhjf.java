package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public abstract class zzhjf {
    private final zzhye zza;
    private final Class zzb;

    /* synthetic */ zzhjf(zzhye zzhyeVar, Class cls, byte[] bArr) {
        this.zza = zzhyeVar;
        this.zzb = cls;
    }

    public static zzhjf zzd(zzhje zzhjeVar, zzhye zzhyeVar, Class cls) {
        return new zzhjd(zzhyeVar, cls, zzhjeVar);
    }

    public abstract zzhaz zza(zzhlg zzhlgVar, @Nullable zzhbt zzhbtVar) throws GeneralSecurityException;

    public final zzhye zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
