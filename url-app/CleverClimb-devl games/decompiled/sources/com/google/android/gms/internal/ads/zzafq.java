package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* loaded from: classes2.dex */
final class zzafq implements Runnable {
    private final /* synthetic */ Future zzchn;

    zzafq(zzafn zzafnVar, Future future) {
        this.zzchn = future;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzchn.isDone()) {
            return;
        }
        this.zzchn.cancel(true);
    }
}
