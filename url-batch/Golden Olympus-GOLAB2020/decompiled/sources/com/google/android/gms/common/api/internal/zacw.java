package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
final class zacw extends com.google.android.gms.internal.base.zaq {
    final /* synthetic */ zacx zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zacw(zacx zacxVar, Looper looper) {
        super(looper);
        this.zaa = zacxVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        zacx zacxVar;
        int i4 = message.what;
        if (i4 != 0) {
            if (i4 == 1) {
                RuntimeException runtimeException = (RuntimeException) message.obj;
                Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage())));
                throw runtimeException;
            }
            Log.e("TransformedResultImpl", "TransformationResultHandler received unknown message type: " + i4);
            return;
        }
        PendingResult pendingResult = (PendingResult) message.obj;
        obj = this.zaa.zae;
        synchronized (obj) {
            try {
                zacxVar = this.zaa.zab;
                zacx zacxVar2 = (zacx) Preconditions.checkNotNull(zacxVar);
                if (pendingResult == null) {
                    zacxVar2.zaj(new Status(13, "Transform returned null"));
                } else if (pendingResult instanceof zacm) {
                    zacxVar2.zaj(((zacm) pendingResult).zaa());
                } else {
                    zacxVar2.zai(pendingResult);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
