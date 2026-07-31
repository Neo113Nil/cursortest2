package com.google.android.gms.internal.fido;

/* loaded from: classes.dex */
public final class zzdt {
    private final byte zza;
    private final byte zzb;

    zzdt(int i4) {
        this.zza = (byte) (i4 & 224);
        this.zzb = (byte) (i4 & 31);
    }

    public final byte zza() {
        return this.zzb;
    }

    public final byte zzb() {
        return this.zza;
    }

    public final int zzc() {
        return (this.zza >> 5) & 7;
    }
}
