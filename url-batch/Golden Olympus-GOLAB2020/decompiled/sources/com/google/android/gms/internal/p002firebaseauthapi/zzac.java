package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
abstract class zzac extends zzd<String> {
    final CharSequence zza;
    private final zzf zzb;
    private final boolean zzc;
    private int zzd = 0;
    private int zze;

    protected zzac(zzv zzvVar, CharSequence charSequence) {
        zzf zzfVar;
        int i4;
        zzfVar = zzvVar.zza;
        this.zzb = zzfVar;
        this.zzc = false;
        i4 = zzvVar.zzc;
        this.zze = i4;
        this.zza = charSequence;
    }

    abstract int zza(int i4);

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzd
    protected final /* synthetic */ String zza() {
        int i4 = this.zzd;
        while (true) {
            int i5 = this.zzd;
            if (i5 == -1) {
                zzb();
                return null;
            }
            int zzb = zzb(i5);
            if (zzb == -1) {
                zzb = this.zza.length();
                this.zzd = -1;
            } else {
                this.zzd = zza(zzb);
            }
            int i6 = this.zzd;
            if (i6 != i4) {
                while (i4 < zzb && this.zzb.zza(this.zza.charAt(i4))) {
                    i4++;
                }
                while (zzb > i4 && this.zzb.zza(this.zza.charAt(zzb - 1))) {
                    zzb--;
                }
                int i7 = this.zze;
                if (i7 == 1) {
                    zzb = this.zza.length();
                    this.zzd = -1;
                    while (zzb > i4 && this.zzb.zza(this.zza.charAt(zzb - 1))) {
                        zzb--;
                    }
                } else {
                    this.zze = i7 - 1;
                }
                return this.zza.subSequence(i4, zzb).toString();
            }
            int i8 = i6 + 1;
            this.zzd = i8;
            if (i8 > this.zza.length()) {
                this.zzd = -1;
            }
        }
    }

    abstract int zzb(int i4);
}
