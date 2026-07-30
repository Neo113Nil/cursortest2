package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzckj implements Runnable {
    final /* synthetic */ zzcko zza;

    zzckj(zzcko zzckoVar) {
        Objects.requireNonNull(zzckoVar);
        this.zza = zzckoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*android.webkit.WebView*/.destroy();
    }
}
