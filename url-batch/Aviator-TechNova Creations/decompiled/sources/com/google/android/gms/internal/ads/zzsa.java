package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzsa extends AudioTrack.StreamEventCallback {
    final /* synthetic */ zzsc zza;

    zzsa(zzsc zzscVar) {
        Objects.requireNonNull(zzscVar);
        this.zza = zzscVar;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        zzed zzs = this.zza.zza.zzs();
        zzs.zzd(-1, zzrz.zza);
        zzs.zze();
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onPresentationEnded(AudioTrack audioTrack) {
        zzed zzs = this.zza.zza.zzs();
        zzs.zzd(-1, zzrx.zza);
        zzs.zze();
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        zzed zzs = this.zza.zza.zzs();
        zzs.zzd(-1, zzry.zza);
        zzs.zze();
    }
}
