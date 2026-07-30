package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public class zzgzg extends zzgzp {
    zzgzg() {
    }

    public static zzgzg zzw(ListenableFuture listenableFuture) {
        return listenableFuture instanceof zzgzg ? (zzgzg) listenableFuture : new zzgzh(listenableFuture);
    }
}
