package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
final /* synthetic */ class zzcx implements RemoteCall {
    static final /* synthetic */ zzcx zza = new zzcx();

    private /* synthetic */ zzcx() {
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final /* synthetic */ void accept(Object obj, Object obj2) {
        ((zzv) ((zzdu) obj).getService()).zzE(new zzdh((TaskCompletionSource) obj2));
    }
}
