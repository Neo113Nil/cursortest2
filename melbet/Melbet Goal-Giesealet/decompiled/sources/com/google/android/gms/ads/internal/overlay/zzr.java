package com.google.android.gms.ads.internal.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzr extends AnimatorListenerAdapter {
    final /* synthetic */ zzt zza;

    zzr(zzt zztVar) {
        Objects.requireNonNull(zztVar);
        this.zza = zztVar;
    }

    private final void zza(boolean z) {
        zzt zztVar = this.zza;
        zztVar.setEnabled(z);
        zztVar.zzb().setEnabled(z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        zza(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        zza(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        zza(false);
    }
}
