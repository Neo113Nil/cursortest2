package com.google.android.gms.common.api.internal;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
final class zabg implements Runnable {
    final /* synthetic */ zabk zaa;

    zabg(zabk zabkVar) {
        Objects.requireNonNull(zabkVar);
        this.zaa = zabkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zaa.zat();
    }
}
