package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
final class zzx extends zzac {
    private final /* synthetic */ zzf zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzx(zzy zzyVar, zzv zzvVar, CharSequence charSequence, zzf zzfVar) {
        super(zzvVar, charSequence);
        this.zzb = zzfVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzac
    final int zza(int i4) {
        return i4 + 1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzac
    final int zzb(int i4) {
        return this.zzb.zza(((zzac) this).zza, i4);
    }
}
