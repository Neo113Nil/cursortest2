package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzqz extends AudioTrack.StreamEventCallback {
    final /* synthetic */ zzrb zza;

    zzqz(zzrb zzrbVar) {
        Objects.requireNonNull(zzrbVar);
        this.zza = zzrbVar;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        zzrc zzrcVar = this.zza.zza;
        if (audioTrack.equals(zzrcVar.zzJ()) && zzrcVar.zzI() != null && zzrcVar.zzL()) {
            zzrcVar.zzI().zza();
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onPresentationEnded(AudioTrack audioTrack) {
        zzrc zzrcVar = this.zza.zza;
        if (audioTrack.equals(zzrcVar.zzJ())) {
            zzrcVar.zzK(true);
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        zzrc zzrcVar = this.zza.zza;
        if (audioTrack.equals(zzrcVar.zzJ()) && zzrcVar.zzI() != null && zzrcVar.zzL()) {
            zzrcVar.zzI().zza();
        }
    }
}
