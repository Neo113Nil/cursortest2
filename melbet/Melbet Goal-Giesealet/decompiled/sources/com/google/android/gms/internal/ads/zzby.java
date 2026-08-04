package com.google.android.gms.internal.ads;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzby {
    private final AudioManager.OnAudioFocusChangeListener zzb;
    private final Handler zzc;
    private final zzc zzd;
    private final Object zzf;
    private final int zza = 1;
    private final boolean zze = false;

    zzby(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, zzc zzcVar, boolean z) {
        this.zzc = handler;
        this.zzd = zzcVar;
        if (Build.VERSION.SDK_INT < 26) {
            this.zzb = new zzbx(onAudioFocusChangeListener, handler);
        } else {
            this.zzb = onAudioFocusChangeListener;
        }
        this.zzf = Build.VERSION.SDK_INT >= 26 ? new AudioFocusRequest.Builder(1).setAudioAttributes(zzcVar.zza()).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build() : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzby)) {
            return false;
        }
        zzby zzbyVar = (zzby) obj;
        int i = zzbyVar.zza;
        boolean z = zzbyVar.zze;
        return Objects.equals(this.zzb, zzbyVar.zzb) && Objects.equals(this.zzc, zzbyVar.zzc) && Objects.equals(this.zzd, zzbyVar.zzd);
    }

    public final int hashCode() {
        return Objects.hash(1, this.zzb, this.zzc, this.zzd, false);
    }

    public final zzc zza() {
        return this.zzd;
    }

    public final AudioManager.OnAudioFocusChangeListener zzb() {
        return this.zzb;
    }

    final AudioFocusRequest zzc() {
        Object obj = this.zzf;
        obj.getClass();
        return (AudioFocusRequest) obj;
    }
}
