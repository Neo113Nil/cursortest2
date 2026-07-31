package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
public final class zzzo {
    private final zzzn zza;

    private zzzo(zzzn zzznVar) {
        this.zza = zzznVar;
    }

    public final int zza() {
        return this.zza.zza();
    }

    public static zzzo zza(byte[] bArr, zzcm zzcmVar) {
        if (zzcmVar != null) {
            return new zzzo(zzzn.zza(bArr));
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public static zzzo zza(int i4) {
        return new zzzo(zzzn.zza(zzpp.zza(i4)));
    }

    public final byte[] zza(zzcm zzcmVar) {
        if (zzcmVar != null) {
            return this.zza.zzb();
        }
        throw new NullPointerException("SecretKeyAccess required");
    }
}
