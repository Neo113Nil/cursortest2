package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzsb extends Handler {
    final /* synthetic */ zzsd zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzsb(zzsd zzsdVar, Looper looper) {
        super(looper);
        this.zza = zzsdVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        zzsd.zza(this.zza, message);
    }
}
