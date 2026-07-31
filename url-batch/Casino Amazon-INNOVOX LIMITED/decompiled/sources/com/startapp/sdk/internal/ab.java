package com.startapp.sdk.internal;

import android.content.BroadcastReceiver;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class ab extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ db f169a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(db dbVar, Looper looper) {
        super(looper);
        this.f169a = dbVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        bb[] bbVarArr;
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        db dbVar = this.f169a;
        while (true) {
            synchronized (dbVar.b) {
                size = dbVar.d.size();
                if (size <= 0) {
                    return;
                }
                bbVarArr = new bb[size];
                dbVar.d.toArray(bbVarArr);
                dbVar.d.clear();
            }
            for (int i = 0; i < size; i++) {
                bb bbVar = bbVarArr[i];
                for (int i2 = 0; i2 < bbVar.b.size(); i2++) {
                    BroadcastReceiver broadcastReceiver = ((cb) bbVar.b.get(i2)).b;
                    if (broadcastReceiver != null) {
                        broadcastReceiver.onReceive(dbVar.f214a, bbVar.f183a);
                    }
                }
            }
        }
    }
}
