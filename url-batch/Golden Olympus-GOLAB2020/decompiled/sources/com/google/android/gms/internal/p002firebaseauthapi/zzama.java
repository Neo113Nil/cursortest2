package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
final class zzama implements zzall {
    private final zzaln zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    zzama(zzaln zzalnVar, String str, Object[] objArr) {
        this.zza = zzalnVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i4 = charAt & 8191;
        int i5 = 13;
        int i6 = 1;
        while (true) {
            int i7 = i6 + 1;
            char charAt2 = str.charAt(i6);
            if (charAt2 < 55296) {
                this.zzd = i4 | (charAt2 << i5);
                return;
            } else {
                i4 |= (charAt2 & 8191) << i5;
                i5 += 13;
                i6 = i7;
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzall
    public final zzaln zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzall
    public final zzalz zzb() {
        int i4 = this.zzd;
        return (i4 & 1) != 0 ? zzalz.PROTO2 : (i4 & 4) == 4 ? zzalz.EDITIONS : zzalz.PROTO3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzall
    public final boolean zzc() {
        return (this.zzd & 2) == 2;
    }

    final String zzd() {
        return this.zzb;
    }

    final Object[] zze() {
        return this.zzc;
    }
}
