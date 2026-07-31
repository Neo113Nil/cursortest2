package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
final class zzhk implements zzgy {
    private final zzhb zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    zzhk(zzhb zzhbVar, String str, Object[] objArr) {
        this.zza = zzhbVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i4 = charAt & 8191;
        int i5 = 1;
        int i6 = 13;
        while (true) {
            int i7 = i5 + 1;
            char charAt2 = str.charAt(i5);
            if (charAt2 < 55296) {
                this.zzd = i4 | (charAt2 << i6);
                return;
            } else {
                i4 |= (charAt2 & 8191) << i6;
                i6 += 13;
                i5 = i7;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgy
    public final zzhb zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgy
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgy
    public final int zzc() {
        int i4 = this.zzd;
        if ((i4 & 1) != 0) {
            return 1;
        }
        return (i4 & 4) == 4 ? 3 : 2;
    }

    final String zzd() {
        return this.zzb;
    }

    final Object[] zze() {
        return this.zzc;
    }
}
