package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import kotlin.io.path.DefaultCopyActionContext$$ExternalSyntheticApiModelOutline0;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzqc {
    public final zzaf zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final zzcq zzi;
    public final boolean zzj = false;
    public final boolean zzk = false;
    public final boolean zzl = false;

    public zzqc(zzaf zzafVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, zzcq zzcqVar, boolean z, boolean z2, boolean z3) {
        this.zza = zzafVar;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = i5;
        this.zzg = i6;
        this.zzh = i7;
        this.zzi = zzcqVar;
    }

    public final AudioTrack zza(zzh zzhVar, int i) throws zzph {
        AudioTrack audioTrack;
        AudioTrack.Builder audioAttributes;
        AudioTrack.Builder audioFormat;
        AudioTrack.Builder transferMode;
        AudioTrack.Builder bufferSizeInBytes;
        AudioTrack.Builder sessionId;
        AudioTrack.Builder offloadedPlayback;
        try {
            if (zzet.zza >= 29) {
                AudioFormat zzw = zzet.zzw(this.zze, this.zzf, this.zzg);
                AudioAttributes audioAttributes2 = zzhVar.zza().zza;
                DefaultCopyActionContext$$ExternalSyntheticApiModelOutline0.m1596m();
                audioAttributes = DefaultCopyActionContext$$ExternalSyntheticApiModelOutline0.m().setAudioAttributes(audioAttributes2);
                audioFormat = audioAttributes.setAudioFormat(zzw);
                transferMode = audioFormat.setTransferMode(1);
                bufferSizeInBytes = transferMode.setBufferSizeInBytes(this.zzh);
                sessionId = bufferSizeInBytes.setSessionId(i);
                offloadedPlayback = sessionId.setOffloadedPlayback(this.zzc == 1);
                audioTrack = offloadedPlayback.build();
            } else {
                audioTrack = new AudioTrack(zzhVar.zza().zza, zzet.zzw(this.zze, this.zzf, this.zzg), this.zzh, 1, i);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new zzph(state, this.zze, this.zzf, this.zzh, this.zza, zzc(), null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new zzph(0, this.zze, this.zzf, this.zzh, this.zza, zzc(), e);
        }
    }

    public final zzpf zzb() {
        boolean z = this.zzc == 1;
        return new zzpf(this.zzg, this.zze, this.zzf, false, z, this.zzh);
    }

    public final boolean zzc() {
        return this.zzc == 1;
    }
}
