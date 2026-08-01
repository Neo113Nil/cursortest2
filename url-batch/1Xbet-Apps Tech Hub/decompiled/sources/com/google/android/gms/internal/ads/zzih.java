package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzih implements AudioManager.OnAudioFocusChangeListener {
    final /* synthetic */ zzij zza;
    private final Handler zzb;

    public zzih(zzij zzijVar, Handler handler) {
        this.zza = zzijVar;
        this.zzb = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzig
            @Override // java.lang.Runnable
            public final void run() {
                zzij.zzc(zzih.this.zza, i);
            }
        });
    }
}
