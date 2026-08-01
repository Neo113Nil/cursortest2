package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public class zzfqv extends Handler {
    private final Looper zza;

    public zzfqv() {
        this.zza = Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        zza(message);
    }

    protected void zza(Message message) {
        super.dispatchMessage(message);
    }

    public zzfqv(Looper looper) {
        super(looper);
        this.zza = Looper.getMainLooper();
    }
}
