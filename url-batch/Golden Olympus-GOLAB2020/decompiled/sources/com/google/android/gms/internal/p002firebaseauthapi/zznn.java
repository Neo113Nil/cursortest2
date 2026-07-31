package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
public final class zznn extends zzbo {
    private final zzpn zza;

    public zznn(zzpn zzpnVar, zzcm zzcmVar) {
        zza(zzpnVar, zzcmVar);
        this.zza = zzpnVar;
    }

    public final zzpn zza(zzcm zzcmVar) {
        zza(this.zza, zzcmVar);
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbo
    public final Integer zza() {
        return this.zza.zze();
    }

    private static void zza(zzpn zzpnVar, zzcm zzcmVar) {
        int i4 = zznm.zza[zzpnVar.zza().ordinal()];
        if (i4 == 1 || i4 == 2) {
            zzcm.zza(zzcmVar);
        }
    }
}
