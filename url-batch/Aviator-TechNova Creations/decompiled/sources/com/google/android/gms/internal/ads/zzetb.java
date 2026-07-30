package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final /* synthetic */ class zzetb implements zzgyw {
    static final /* synthetic */ zzetb zza = new zzetb();

    private /* synthetic */ zzetb() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        return ((Throwable) obj) instanceof TimeoutException ? zzgzo.zza(new zzete(Integer.toString(17))) : zzgzo.zza(new zzete(null));
    }
}
