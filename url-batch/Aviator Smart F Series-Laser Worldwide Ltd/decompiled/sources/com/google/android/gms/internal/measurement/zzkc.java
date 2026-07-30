package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class zzkc extends zzke {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze;

    /* synthetic */ zzkc(byte[] bArr, int i8, int i9, boolean z7, zzkb zzkbVar) {
        super(null);
        this.zze = Integer.MAX_VALUE;
        this.zzb = bArr;
        this.zzc = 0;
    }

    public final int zza(int i8) {
        int i9 = this.zze;
        this.zze = 0;
        int i10 = this.zzc + this.zzd;
        this.zzc = i10;
        if (i10 > 0) {
            this.zzd = i10;
            this.zzc = i10 - i10;
        } else {
            this.zzd = 0;
        }
        return i9;
    }
}
