package com.google.android.recaptcha.internal;

import kotlin.coroutines.jvm.internal.d;

/* loaded from: classes.dex */
final class zzcs extends d {
    Object zza;
    Object zzb;
    Object zzc;
    long zzd;
    /* synthetic */ Object zze;
    final /* synthetic */ zzcv zzf;
    int zzg;
    String zzh;
    zzch zzi;
    zzbi zzj;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcs(zzcv zzcvVar, kotlin.coroutines.d dVar) {
        super(dVar);
        this.zzf = zzcvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zze = obj;
        this.zzg |= Integer.MIN_VALUE;
        return this.zzf.zzg(null, 0L, null, null, null, this);
    }
}
