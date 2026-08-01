package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfri extends zzfsc {
    private IBinder zza;
    private String zzb;
    private int zzc;
    private float zzd;
    private int zze;
    private String zzf;
    private byte zzg;

    zzfri() {
    }

    @Override // com.google.android.gms.internal.ads.zzfsc
    public final zzfsc zza(String str) {
        this.zzf = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfsc
    public final zzfsc zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfsc
    public final zzfsc zzc(int i) {
        this.zzg = (byte) (this.zzg | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfsc
    public final zzfsc zzd(int i) {
        this.zzc = i;
        this.zzg = (byte) (this.zzg | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfsc
    public final zzfsc zze(float f) {
        this.zzd = f;
        this.zzg = (byte) (this.zzg | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfsc
    public final zzfsc zzf(boolean z) {
        this.zzg = (byte) (this.zzg | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfsc
    public final zzfsc zzg(IBinder iBinder) {
        if (iBinder == null) {
            throw new NullPointerException("Null windowToken");
        }
        this.zza = iBinder;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfsc
    public final zzfsc zzh(int i) {
        this.zze = i;
        this.zzg = (byte) (this.zzg | 16);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfsc
    public final zzfsd zzi() {
        IBinder iBinder;
        if (this.zzg == 31 && (iBinder = this.zza) != null) {
            return new zzfrk(iBinder, false, this.zzb, this.zzc, this.zzd, 0, null, this.zze, null, this.zzf, null, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" windowToken");
        }
        if ((this.zzg & 1) == 0) {
            sb.append(" stableSessionToken");
        }
        if ((this.zzg & 2) == 0) {
            sb.append(" layoutGravity");
        }
        if ((this.zzg & 4) == 0) {
            sb.append(" layoutVerticalMargin");
        }
        if ((this.zzg & 8) == 0) {
            sb.append(" displayMode");
        }
        if ((this.zzg & 16) == 0) {
            sb.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
