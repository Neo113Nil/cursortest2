package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.games.video.Videos;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzp extends zzaw {
    zzp(ListenerHolder listenerHolder) {
        super(listenerHolder);
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzcb
    public final void zzd(final int i) {
        zzw(new zzbq() { // from class: com.google.android.gms.games.internal.zzo
            @Override // com.google.android.gms.games.internal.zzbq
            public final void zza(Object obj) {
                ((Videos.CaptureOverlayStateListener) obj).onCaptureOverlayStateChanged(i);
            }
        });
    }
}
