package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
final class zzf extends Handler {
    private final /* synthetic */ GoogleCloudMessaging zzai;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzf(GoogleCloudMessaging googleCloudMessaging, Looper looper) {
        super(looper);
        this.zzai = googleCloudMessaging;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        boolean zzd;
        Context context;
        Context context2;
        BlockingQueue blockingQueue;
        if (message == null || !(message.obj instanceof Intent)) {
            Log.w("GCM", "Dropping invalid message");
        }
        Intent intent = (Intent) message.obj;
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(intent.getAction())) {
            blockingQueue = this.zzai.zzag;
            blockingQueue.add(intent);
            return;
        }
        zzd = this.zzai.zzd(intent);
        if (zzd) {
            return;
        }
        context = this.zzai.zzk;
        intent.setPackage(context.getPackageName());
        context2 = this.zzai.zzk;
        context2.sendBroadcast(intent);
    }
}
