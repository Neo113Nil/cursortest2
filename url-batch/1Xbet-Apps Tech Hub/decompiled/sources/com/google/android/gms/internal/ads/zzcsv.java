package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzcsv implements Runnable {
    public final /* synthetic */ AtomicReference zza;

    public /* synthetic */ zzcsv(AtomicReference atomicReference) {
        this.zza = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcsx.zzi(this.zza);
    }
}
