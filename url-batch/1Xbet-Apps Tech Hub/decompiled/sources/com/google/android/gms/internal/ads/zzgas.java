package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public class zzgas extends zzgbc {
    zzgas() {
    }

    public static zzgas zzu(ListenableFuture listenableFuture) {
        return listenableFuture instanceof zzgas ? (zzgas) listenableFuture : new zzgat(listenableFuture);
    }
}
