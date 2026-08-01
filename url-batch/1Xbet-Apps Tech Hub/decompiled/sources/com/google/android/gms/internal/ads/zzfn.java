package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfn implements zzep {
    private Message zza;
    private zzfo zzb;

    private zzfn() {
    }

    /* synthetic */ zzfn(zzfm zzfmVar) {
    }

    private final void zzd() {
        this.zza = null;
        this.zzb = null;
        zzfo.zzl(this);
    }

    public final zzfn zzb(Message message, zzfo zzfoVar) {
        this.zza = message;
        this.zzb = zzfoVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzep
    public final void zza() {
        Message message = this.zza;
        message.getClass();
        message.sendToTarget();
        zzd();
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        message.getClass();
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        zzd();
        return sendMessageAtFrontOfQueue;
    }
}
