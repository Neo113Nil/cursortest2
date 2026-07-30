package com.google.android.gms.fitness;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.request.zzab;
import com.google.android.gms.internal.fitness.zzbx;
import com.google.android.gms.internal.fitness.zzcp;
import com.google.android.gms.internal.fitness.zzes;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* loaded from: classes3.dex */
final class zzc implements RemoteCall {
    final /* synthetic */ ListenerHolder zza;
    final /* synthetic */ List zzb;
    final /* synthetic */ int zzc;

    zzc(BleClient bleClient, ListenerHolder listenerHolder, List list, int i8) {
        this.zza = listenerHolder;
        this.zzb = list;
        this.zzc = i8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final /* bridge */ /* synthetic */ void accept(Object obj, Object obj2) {
        ((zzbx) ((com.google.android.gms.internal.fitness.zzm) obj).getService()).zzf(new StartBleScanRequest(this.zzb, (zzab) com.google.android.gms.fitness.request.zzc.zza().zzb(this.zza), this.zzc, (zzcp) zzes.zzc((TaskCompletionSource) obj2)));
    }
}
