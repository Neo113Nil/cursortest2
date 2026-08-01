package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdjs implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;
    private final zzhec zzc;
    private final zzhec zzd;

    public zzdjs(zzhec zzhecVar, zzhec zzhecVar2, zzhec zzhecVar3, zzhec zzhecVar4) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
        this.zzc = zzhecVar3;
        this.zzd = zzhecVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzavm zzavmVar = (zzavm) this.zza.zzb();
        Executor executor = (Executor) this.zzb.zzb();
        Context context = (Context) this.zzc.zzb();
        return new zzcqv(executor, new zzcqh(context, zzavmVar), (Clock) this.zzd.zzb());
    }
}
