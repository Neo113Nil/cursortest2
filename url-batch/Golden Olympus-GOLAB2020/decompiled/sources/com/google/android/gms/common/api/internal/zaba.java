package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
final class zaba extends com.google.android.gms.internal.base.zaq {
    final /* synthetic */ zabc zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zaba(zabc zabcVar, Looper looper) {
        super(looper);
        this.zaa = zabcVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i4 = message.what;
        if (i4 == 1) {
            zabc.zaj(this.zaa);
            return;
        }
        if (i4 == 2) {
            zabc.zai(this.zaa);
            return;
        }
        Log.w("GoogleApiClientImpl", "Unknown message id: " + i4);
    }
}
