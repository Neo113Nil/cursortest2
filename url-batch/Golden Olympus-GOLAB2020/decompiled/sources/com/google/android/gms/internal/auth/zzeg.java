package com.google.android.gms.internal.auth;

/* loaded from: classes.dex */
final class zzeg extends zzei {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze;

    /* synthetic */ zzeg(byte[] bArr, int i4, int i5, boolean z4, zzef zzefVar) {
        super(null);
        this.zze = Integer.MAX_VALUE;
        this.zzb = bArr;
        this.zzc = 0;
    }

    public final int zza(int i4) {
        int i5 = this.zze;
        this.zze = 0;
        int i6 = this.zzc + this.zzd;
        this.zzc = i6;
        if (i6 <= 0) {
            this.zzd = 0;
            return i5;
        }
        this.zzd = i6;
        this.zzc = 0;
        return i5;
    }
}
