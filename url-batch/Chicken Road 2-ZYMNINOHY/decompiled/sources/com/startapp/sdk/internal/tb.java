package com.startapp.sdk.internal;

import android.content.BroadcastReceiver;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
public final class tb extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wb f7617a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb(wb wbVar, Looper looper) {
        super(looper);
        this.f7617a = wbVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        ub[] ubVarArr;
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        wb wbVar = this.f7617a;
        while (true) {
            synchronized (wbVar.f7838b) {
                try {
                    size = wbVar.f7840d.size();
                    if (size <= 0) {
                        return;
                    }
                    ubVarArr = new ub[size];
                    wbVar.f7840d.toArray(ubVarArr);
                    wbVar.f7840d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i4 = 0; i4 < size; i4++) {
                ub ubVar = ubVarArr[i4];
                for (int i5 = 0; i5 < ubVar.f7696b.size(); i5++) {
                    BroadcastReceiver broadcastReceiver = ((vb) ubVar.f7696b.get(i5)).f7751b;
                    if (broadcastReceiver != null) {
                        broadcastReceiver.onReceive(wbVar.f7837a, ubVar.f7695a);
                    }
                }
            }
        }
    }
}
