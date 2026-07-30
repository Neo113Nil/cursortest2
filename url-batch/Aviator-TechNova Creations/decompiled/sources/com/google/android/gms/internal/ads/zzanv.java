package com.google.android.gms.internal.ads;

import android.text.Layout;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzanv {
    public CharSequence zzc;
    public long zza = 0;
    public long zzb = 0;
    public int zzd = 2;
    public float zze = -3.4028235E38f;
    public int zzf = 1;
    public int zzg = 0;
    public float zzh = -3.4028235E38f;
    public int zzi = Integer.MIN_VALUE;
    public float zzj = 1.0f;
    public int zzk = Integer.MIN_VALUE;

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0088, code lost:
    
        if (r6 == 0) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzcw zza() {
        Layout.Alignment alignment;
        float f;
        CharSequence charSequence;
        float f2 = this.zzh;
        float f3 = -3.4028235E38f;
        if (f2 == -3.4028235E38f) {
            int i = this.zzd;
            f2 = i != 4 ? i != 5 ? 0.5f : 1.0f : 0.0f;
        }
        int i2 = this.zzi;
        if (i2 == Integer.MIN_VALUE) {
            int i3 = this.zzd;
            if (i3 != 1) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            i2 = 1;
                        }
                    }
                }
                i2 = 2;
            }
            i2 = 0;
        }
        zzcw zzcwVar = new zzcw();
        int i4 = this.zzd;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        if (i4 != 5) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 23);
                            sb.append("Unknown textAlignment: ");
                            sb.append(i4);
                            zzee.zzc("WebvttCueParser", sb.toString());
                            alignment = null;
                        }
                    }
                }
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            zzcwVar.zzd(alignment);
            f = this.zze;
            int i5 = this.zzf;
            if (f != -3.4028235E38f || i5 != 0 || (f >= 0.0f && f <= 1.0f)) {
                if (f == -3.4028235E38f) {
                    f3 = f;
                }
                zzcwVar.zzf(f3, i5);
                zzcwVar.zzg(this.zzg);
                zzcwVar.zzi(f2);
                zzcwVar.zzj(i2);
                float f4 = this.zzj;
                if (i2 == 0) {
                    f2 = 1.0f - f2;
                } else if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException(String.valueOf(i2));
                    }
                } else if (f2 <= 0.5f) {
                    f2 += f2;
                } else {
                    float f5 = 1.0f - f2;
                    f2 = f5 + f5;
                }
                zzcwVar.zzm(Math.min(f4, f2));
                zzcwVar.zzo(this.zzk);
                charSequence = this.zzc;
                if (charSequence != null) {
                    zzcwVar.zza(charSequence);
                }
                return zzcwVar;
            }
            f3 = 1.0f;
            zzcwVar.zzf(f3, i5);
            zzcwVar.zzg(this.zzg);
            zzcwVar.zzi(f2);
            zzcwVar.zzj(i2);
            float f42 = this.zzj;
            if (i2 == 0) {
            }
            zzcwVar.zzm(Math.min(f42, f2));
            zzcwVar.zzo(this.zzk);
            charSequence = this.zzc;
            if (charSequence != null) {
            }
            return zzcwVar;
        }
        alignment = Layout.Alignment.ALIGN_NORMAL;
        zzcwVar.zzd(alignment);
        f = this.zze;
        int i52 = this.zzf;
        if (f != -3.4028235E38f) {
        }
        if (f == -3.4028235E38f) {
        }
        zzcwVar.zzf(f3, i52);
        zzcwVar.zzg(this.zzg);
        zzcwVar.zzi(f2);
        zzcwVar.zzj(i2);
        float f422 = this.zzj;
        if (i2 == 0) {
        }
        zzcwVar.zzm(Math.min(f422, f2));
        zzcwVar.zzo(this.zzk);
        charSequence = this.zzc;
        if (charSequence != null) {
        }
        return zzcwVar;
    }
}
