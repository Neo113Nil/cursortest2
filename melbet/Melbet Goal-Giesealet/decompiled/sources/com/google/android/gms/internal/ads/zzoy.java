package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzoy {
    public static final zzoy zza;
    public final int zzb;
    public final int zzc;
    private final zzgke zzd;

    static {
        zzoy zzoyVar;
        if (Build.VERSION.SDK_INT >= 33) {
            zzgkd zzgkdVar = new zzgkd();
            for (int i = 1; i <= 10; i++) {
                zzgkdVar.zzf(Integer.valueOf(zzeo.zzB(i)));
            }
            zzoyVar = new zzoy(2, zzgkdVar.zzi());
        } else {
            zzoyVar = new zzoy(2, 10);
        }
        zza = zzoyVar;
    }

    public zzoy(int i, int i2) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = null;
    }

    public zzoy(int i, Set set) {
        this.zzb = i;
        zzgke zzo = zzgke.zzo(set);
        this.zzd = zzo;
        zzgmd it = zzo.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 = Math.max(i2, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.zzc = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzoy)) {
            return false;
        }
        zzoy zzoyVar = (zzoy) obj;
        return this.zzb == zzoyVar.zzb && this.zzc == zzoyVar.zzc && Objects.equals(this.zzd, zzoyVar.zzd);
    }

    public final int hashCode() {
        zzgke zzgkeVar = this.zzd;
        return (((this.zzb * 31) + this.zzc) * 31) + (zzgkeVar == null ? 0 : zzgkeVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        int i = this.zzb;
        int length = String.valueOf(i).length();
        int i2 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 38 + String.valueOf(i2).length() + 15 + String.valueOf(valueOf).length() + 1);
        sb.append("AudioProfile[format=");
        sb.append(i);
        sb.append(", maxChannelCount=");
        sb.append(i2);
        sb.append(", channelMasks=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final boolean zza(int i) {
        zzgke zzgkeVar = this.zzd;
        if (zzgkeVar == null) {
            return i <= this.zzc;
        }
        int zzB = zzeo.zzB(i);
        if (zzB == 0) {
            return false;
        }
        return zzgkeVar.contains(Integer.valueOf(zzB));
    }

    public final int zzb(int i, zzc zzcVar) {
        if (this.zzd != null) {
            return this.zzc;
        }
        if (Build.VERSION.SDK_INT < 29) {
            Integer num = (Integer) zzoz.zzb.getOrDefault(Integer.valueOf(this.zzb), 0);
            num.getClass();
            return num.intValue();
        }
        int i2 = this.zzb;
        for (int i3 = 10; i3 > 0; i3--) {
            int zzB = zzeo.zzB(i3);
            if (zzB != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i2).setSampleRate(i).setChannelMask(zzB).build(), zzcVar.zza())) {
                return i3;
            }
        }
        return 0;
    }
}
