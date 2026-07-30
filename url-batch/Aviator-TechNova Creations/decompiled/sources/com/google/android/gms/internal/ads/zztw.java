package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zztw extends Handler {
    final /* synthetic */ zzty zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zztw(zzty zztyVar, Looper looper) {
        super(looper);
        Objects.requireNonNull(zztyVar);
        this.zza = zztyVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.zza.zzh(message);
    }
}
