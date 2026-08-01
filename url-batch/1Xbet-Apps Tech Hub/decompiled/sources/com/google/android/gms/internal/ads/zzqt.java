package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzqt extends AudioTrack.StreamEventCallback {
    final /* synthetic */ zzqw zza;
    final /* synthetic */ zzqu zzb;

    zzqt(zzqu zzquVar, zzqw zzqwVar) {
        this.zzb = zzquVar;
        this.zza = zzqwVar;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        AudioTrack audioTrack2;
        zzps zzpsVar;
        boolean z;
        zzps zzpsVar2;
        audioTrack2 = this.zzb.zza.zzt;
        if (audioTrack.equals(audioTrack2)) {
            zzqw zzqwVar = this.zzb.zza;
            zzpsVar = zzqwVar.zzp;
            if (zzpsVar != null) {
                z = zzqwVar.zzQ;
                if (z) {
                    zzpsVar2 = zzqwVar.zzp;
                    zzpsVar2.zzb();
                }
            }
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        AudioTrack audioTrack2;
        zzps zzpsVar;
        boolean z;
        zzps zzpsVar2;
        audioTrack2 = this.zzb.zza.zzt;
        if (audioTrack.equals(audioTrack2)) {
            zzqw zzqwVar = this.zzb.zza;
            zzpsVar = zzqwVar.zzp;
            if (zzpsVar != null) {
                z = zzqwVar.zzQ;
                if (z) {
                    zzpsVar2 = zzqwVar.zzp;
                    zzpsVar2.zzb();
                }
            }
        }
    }
}
