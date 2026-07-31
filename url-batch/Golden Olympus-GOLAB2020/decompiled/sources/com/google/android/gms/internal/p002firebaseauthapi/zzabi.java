package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzao;

/* loaded from: classes.dex */
final class zzabi implements zzaew<zzahq> {
    private final /* synthetic */ zzadp zza;
    private final /* synthetic */ zzzv zzb;

    zzabi(zzzv zzzvVar, zzadp zzadpVar) {
        this.zza = zzadpVar;
        this.zzb = zzzvVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zza.zza(zzao.zza(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaew
    public final /* synthetic */ void zza(zzahq zzahqVar) {
        zzahq zzahqVar2 = zzahqVar;
        this.zzb.zza(new zzagw(zzahqVar2.zzc(), zzahqVar2.zzb(), Long.valueOf(zzahqVar2.zza()), "Bearer"), null, null, Boolean.TRUE, null, this.zza, this);
    }
}
