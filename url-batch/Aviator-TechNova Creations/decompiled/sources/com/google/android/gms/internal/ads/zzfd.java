package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzfd implements zzdw {
    private Message zza;

    private zzfd() {
        throw null;
    }

    /* synthetic */ zzfd(byte[] bArr) {
    }

    public final zzfd zzb(Message message, zzfe zzfeVar) {
        this.zza = message;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdw
    public final void zza() {
        Message message = this.zza;
        message.getClass();
        message.sendToTarget();
        this.zza = null;
        zzfe.zzp(this);
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        message.getClass();
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        this.zza = null;
        zzfe.zzp(this);
        return sendMessageAtFrontOfQueue;
    }
}
